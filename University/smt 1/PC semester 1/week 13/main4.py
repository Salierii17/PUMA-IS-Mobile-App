def main():
   mylist=[[0,0,0],[0,0,0],[0,0,0],[0,0,0],[0,0,0]]
   size=1
        
   for i in range(size):
      mylist[i][0]=input("Enter your name : ")
      mylist[i][1]=int(input("Enter your score : "))
        
      if mylist[i][1]>= 85:
         mylist[i][2]="A"
      else:
         if mylist[i][1]>=70:
            mylist[i][2]="B"
         else:
            if mylist[i][1]>=60:
               mylist[i][2]="C"
            else:
               if mylist[i][1]>=55:
                  mylist[i][2]="D"
               else:
                  mylist[i][2]="E"
   print()
   print(mylist[1])
   print()
   print(mylist[3])
   print()
   print('{0:12}'.format("Name"),'{0:10}'.format("Score"),'{0:8}'.format("Grade"))             
   
   for i in range(size):
      print('{0:4}'.format(mylist[i][0]),'{0:>8}'.format(mylist[i][1]),'{0:>8}'.format(mylist[i][2])) 
main()