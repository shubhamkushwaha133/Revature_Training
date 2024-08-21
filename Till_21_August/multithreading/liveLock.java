package com.revature;

public class liveLock {
	
	 static final Police police = new Police();
	  static final Criminal criminal = new Criminal();

	  private static Thread t1;
	  private static Thread t2;

	  // Notice that this code will never stop...
	  public static void main(String[] args) throws Exception {
	    t1 = new Thread(() -> {
	      t1.setName("Thread 1");
	      police.giveRansom(criminal);
	    });
	    t1.start();

	    t2 = new Thread(() -> {
	      t2.setName("Thread 2");
	      criminal.releaseHostage(police);
	    });
	    t2.start();

	    // debugging: print state and name of threads over time
	    for (int i = 0; i <= 10; i++) {
	      System.out.print("-----------------\n" +
	          "Name: " + t1.getName() + "\n" +
	          "State: " + t1.getState() + "\n" +
	          "-----------------\n");

	      System.out.print("-----------------\n" +
	          "Name: " + t2.getName() + "\n" +
	          "State: " + t2.getState() + "\n" +
	          "-----------------\n");
	      Thread.sleep(1000);
	    }
	  }	
}



class Criminal {
	  private boolean hostageReleased = false;

	  public synchronized void releaseHostage(Police police) {
	    while (!police.isRandomSent()) {
	      System.out.println("Criminal: waiting for police to give ransom.");

	      try {
	        Thread.sleep(1000);
	      } catch (InterruptedException ex) {
	        ex.printStackTrace();
	      }
	    }

	    System.out.println("Criminal: Releasing Hostage");
	    this.hostageReleased = true;
	  }

	  public boolean isHostageReleased() {
	    return this.hostageReleased;
	  }
}



class Police {
	  private boolean ransomSent = false;

	  public synchronized void giveRansom(Criminal criminal) {
	    while (!criminal.isHostageReleased()) {
	      System.out.println("Police: waiting for criminal to release hostage.");

	      try {
	        Thread.sleep(1000);
	      } catch (InterruptedException ex) {
	        ex.printStackTrace();
	      }
	    }

	    System.out.println("Police: sent ransom");
	    this.ransomSent = true;
	  }

	  public boolean isRandomSent() {
	    return this.ransomSent;
	  }
}

