Shell scripting programs
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat first.sh
#!/bin/bash

echo "Welcome to Linux shell scripting!"
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s1.sh
#!/bin/bash

date
pwd
echo "Hello, I am learning shell scripting!!"
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s2.sh
#!/bin/bash

MY_NAME="Kiran Waghmare"
echo "Hello, I am $MY_NAME"

echo "Hello. I am ${MY_NAME}"
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s3.sh
#!/bin/bash

CONTENT=$(ls)
echo "The content of this direcory re:"
echo "$CONTENT"
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s4.sh
#!/bin/bash

echo "Welcome to shell programming:"
echo "Please enter your name?"
read NAME
echo "Hello, $NAME !!!"
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s5.sh
#!/bin/bash

echo "File name: $0"
echo "Parameter1: $1"
echo "parameter2: $2"
echo "Value1 : $@"
echo "Value2 : $*"
echo "Value3 : $#"
echo "Value4 : $$"

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s6.sh
#!/bin/bash

echo "Enter yopur name"
read name

echo "Hello ${name-sir/Madam} Geeting from cdac Mumbai!:wq"

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s7.sh
#!/bin/bash

val=`expr 2+2`
echo "Total = $val"
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s8.sh
#!/bin/bash

echo "Read 3 values"

#REading values
read var1
read var2
read var3

#Printing values
echo $var1
echo $var2
echo $var3

#Addition
(( sum = $var1 + $var2 +  $var3 ))

(( sum1 = $var1+ $var2 ))
#Print Sum

echo $sum
echo $sum1

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s9.sh

#!/bin/bash

String1="Ubuntu"
String2="REd Hat"
#concatenation

String=$String1$String2
echo "$String is a distribution of Linux OS."

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s10.sh
#!/bin/bash

echo "Enter fruit"
read f1

if [ $f1 -lt 10 ]
then
        echo "Mango is selected."
else
        echo "Apple is selected."
fi

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s11.sh
#!/bin/bash

echo "Enter number"
read num

if [[ ( $num -lt 10 ) &&  ( $num%2 -eq 0 ) ]]
then
        echo "Even"
else
        echo "Odd"
fi

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s12.sh
#!/bin/bash

shellname="ksh"

if [ "$shellname" = "bash" ]
then
        echo "Using bash shell."
elif [ "$shellname" = "csh" ]
then
        echo "Using C Shell."
else
        echo " Not using any other shell."
fi
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s13.sh
#!/bin/bash

echo "Enter a input"
read num

case $num in
        hello)
                echo "Hundred !!!";;
        buy)
                echo "Double Hundred !!!";;
        *)
                echo "Not a hundred !!!";;
esac

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s14.sh
#!/bin/bash

for i in 1 2 3 4 5
do
        echo "Executing for loop... $i"
done

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s15.sh
#!/bin/bash

for i in hello 1 * 2 goodbye
do
        echo "Executing for loop... $i"
done

---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s16.sh
#!/bin/bash

for var1 in 1 2 3
do
        for var2 in 0 5
        do
                if [ $var1 -eq 2 ]
                then
                        echo "$var2"
                else
                        echo "$var1"
                fi

        done

done
---------------------------------------------------------

kiran@DESKTOP-OTNV7G1:~/scripts$ cat s17.sh
#!/bin/bash

a=0

while [ $a -lt 10 ]
do
        echo "Value= $a"
        if [ $a -eq 5 ]
        then
                break
        fi
        a=`expr $a + 1`
done
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s18.sh
#!/bin/bash

Hello () {
        echo "Hello world !!!"
}

Hello
---------------------------------------------------------
kiran@DESKTOP-OTNV7G1:~/scripts$ cat s19.sh
#!/bin/bash

Hello () {
        echo "Hello $1 !!!"
        echo "Greeting !!! $2"
}

Hello Good Morning
---------------------------------------------------------
