print("This program will show fibonacci number")
n1,n2=0,1
counter= 0
fib_num=int(input("how much term?"))

if fib_num <= 0:
        print("no negative number please")
elif fib_num == 1:
    print(n1)
else:
    print("Fibonacci numbers : ")
    while counter<fib_num:
        print(n1)
        
        n3= n1 +n2
        n1= n2
        n2= n3
        counter+=1
