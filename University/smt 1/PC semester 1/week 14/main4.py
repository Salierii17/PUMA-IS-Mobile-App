def score(x):
    return 0.3*x[1] + 0.3 * x[2] + 0.4 * x[3]
def scoreToGrade(y):
        if y>= 85:
            return"A"
        else:
            if y>=70:
                return"B"
            else:
                if y>=60:
                    return"C"
                else:
                    if y>=55:
                        return"D"
                    else:
                        return"E"
def main():
    mylist=[[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],
            [0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],[0,0,0,0,0,0],
            [0,0,0,0,0,0],[0,0,0,0,0,0]]
    size=2
        
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

        mylist[i][4]= score(mylist[i])    
        print(mylist[i][0],"your score is",mylist[i][4])
        mylist[i][5]= scoreToGrade(score(mylist[i]))    

    print("\n"+mylist)
    print("\n"+'{0:>8}'.format("Name"),'{0:>14}'.format("AssgScore"),
          '{0:10}'.format("MidScore"),'{0:11}'.format("FinalScore"),
          '{0:8}'.format("Score"),'{0:4}'.format("Grade"))            
   
    for i in range(size):
      print('{0:>10}'.format(mylist[i][0]),'{0:9}'.format(mylist[i][1]),
            '{0:9}'.format(mylist[i][2]),'{0:10}'.format(mylist[i][3]),
            '{0:9}'.format(mylist[i][4]),'{0:>8}'.format(mylist[i][5])) 

main()                                                                      