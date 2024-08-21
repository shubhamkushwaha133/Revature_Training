package com.revature;
import java.util.ArrayDeque;
import java.util.ArrayDeque;


public class pcProblem {
      public static ArrayDeque<Cookie> cookies = new ArrayDeque<>();
	  public static final int MAX_COOKIES = 5;

	  public static void main(String[] args) {
	    // create producer and consumer
	    Baker baker = new Baker();
	    Cashier cashier = new Cashier();

	    // creates threads that produce and consume
	    Thread thread1 = new Thread(() -> {
	      try {
	        for(int i = 0; i < 5; i++) {
	           baker.produce(new Cookie());
	        }
	        
	      } catch (InterruptedException e) {
	        System.out.println("Producer interrupted!");
	      }
	    });

	    Thread thread2 = new Thread(() -> {
	      try {
	        for(int i = 0; i < 5; i++) {
	          cashier.consume();
	        }
	        
	      } catch (InterruptedException e) {
	        System.out.println("Consumer interrupted!");
	      }
	    });

	    // start threads
	    thread1.start();
	    thread2.start();
	  }
}
	
	
 class Baker {

    ArrayDeque<Cookie> cookies = pcProblem.cookies;

    public void produce(Cookie cookie) throws InterruptedException {

        synchronized(cookies) {

            // check if baker can produce
            while (cookies.size() == pcProblem.MAX_COOKIES) {
                // if not, wait
                System.out.println("Baker waits!");
                cookies.wait();
            }


            // if there is space on shelf, produce
            cookies.add(cookie);
            System.out.println("Baker baked a cookie!\n" + 
            "Cookies currently ready for sale: " + cookies.size());
            cookies.notify();

        }
    }
}

 class Cashier {
	    ArrayDeque<Cookie> cookies = pcProblem.cookies;

	    public void consume() throws InterruptedException {

	        synchronized(cookies) {

	            // check if baker can produce
	            while (cookies.isEmpty()) {
	                // if not, wait
	                System.out.println("Cashier waits!");
	                cookies.wait();
	            }


	            // if there is space on shelf, produce
	            cookies.remove();
	            System.out.println("Cashier sold a cookie!\n" + 
	            "Cookies currently ready for sale: " + cookies.size());
	            cookies.notify();

	        }
	    }
}


  class Cookie {

 }



