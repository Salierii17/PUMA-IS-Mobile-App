fib_num=int(input("Enter numbers of terms:"))

n1, n2= 0, 1 
counter = 0


if fib_num <=0 :
   print("terms must be positive integer!") 

elif fib_num == 1 :
   print("Fibonacci numbers upto",fib_num,":")
   print(n1) 

else:
   print("Fibonacci numbers:")
   while counter<fib_num:
      print(n1)
      n3 = n1 + n2
      
      n1 = n2
      n2 = n3
      counter+= 1

   