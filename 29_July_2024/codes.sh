#code 1
#!/bin/bash
name=Jasdhir
echo Hello, $name




#code 2
#!/bin/bash
echo "Enter your name"
read name
echo "your name is $name"




#code 3
echo "enter your number1"
read number1
echo "enter your number2"
read number2
sum=$((number1 + number2))
echo "$sum"




#code 4
echo "enter your number1"
read number1
echo "enter your number2"
read number2
if [ "$number1" -gt "$number2" ]; then
  echo "The largest number: $number1"
elif [ "$number1" -lt "$number2" ]; then
  echo "The largest number: $number2"
else
  echo "Both numbers are equal."
fi




#code 5
echo "enter your number1"
read number1
echo "enter your number2"
read number2
echo "enter your number3"
read number3
if [ "$number1" -ge "$number2" ] && [ "$number1" -ge "$number3" ]; then
  echo "The largest number: $number1"
elif [ "$number2" -ge "$number1" ] && [ "$number2" -ge "$number3" ]; then
  echo "The largest number: $number2"
else
  echo "The largest number: $number3"
fi





#code 6
echo "enter your number1"
read number1
case "$number1" in
   "1") echo "Today is monday"
   ;;
   "2") echo "Today is tuesday"
   ;;
   "3") echo "Today is wednesday"
   ;;
   "4") echo "Today is thrusday"
   ;;
   "5") echo "Today is friday"
   ;;
   "6") echo "Today is saturday"
   ;;
   "7") echo "Today is sunday"
   ;;
esac
  




#code 7
for num in 1 2 3 4 5 6 7 8 9 10
do
   echo $num
done




#code 8
a=1
while [ "$a" -le 10 ]
do
   echo $a
   ((a++))
done




