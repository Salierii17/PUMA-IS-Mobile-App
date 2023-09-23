def main():
    mylist=[[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],
            [0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],
            [0,0,0,0,0,0],[0,0,0,0,0,0]]
    size=10
        
    for i in range(size):
        mylist[i][0]=input("Enter your name : ")
      
        mylist[i][1]=int(input("Enter your Assg Score : "))
        while mylist[i][1]<0 or mylist[i][1]>100 :
            print("Score should be between 0 and 100, try again")
            mylist[i][1]=int(input("Enter your Assg Score : "))
      
        mylist[i][2]=int(input("Enter your Mid Score : "))
        while mylist[i][2]<0 or 0<mylist[i][2]>100 :
            print("Score should be between 0 and 100, try again")
            mylist[i][2]=int(input("Enter your Mid Score : "))
      
        mylist[i][3]=int(input("Enter your Final Score : "))
        while mylist[i][3]<0 or 0<mylist[i][3]>100 :
            print("Score should be between 0 and 100, try again")
            mylist[i][3]=int(input("Enter your Final Score : "))

        mylist[i][4]=(mylist[i][1]*30//100)+(mylist[i][2]*30//100)+(mylist[i][3]*40//100)    
        print(mylist[i][0],"your score is",mylist[i][4])
      
        if mylist[i][4]>= 85:
            mylist[i][5]="A"
        else:
            if mylist[i][4]>=70:
                mylist[i][5]="B"
            else:
                if mylist[i][4]>=60:
                    mylist[i][5]="C"
                else:
                    if mylist[i][4]>=55:
                        mylist[i][5]="D"
                    else:
                        mylist[i][5]="E"
   
    print()
    print(mylist)
    print()
    print('{0:>8}'.format("Name"),'{0:>14}'.format("AssgScore"),
          '{0:10}'.format("MidScore"),'{0:11}'.format("FinalScore"),
          '{0:8}'.format("Score"),'{0:4}'.format("Grade"))            
   
    for i in range(size):
      print('{0:>10}'.format(mylist[i][0]),'{0:9}'.format(mylist[i][1]),
            '{0:9}'.format(mylist[i][2]),'{0:10}'.format(mylist[i][3]),
            '{0:9}'.format(mylist[i][4]),'{0:>8}'.format(mylist[i][5])) 

main()