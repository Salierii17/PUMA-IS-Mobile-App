def score(x):
    return 0.3*x[1] + 0.3 * x[2] + 0.4 * x[3]

def scoreToGrade(y):
    if y>= 85:
        return "A"
    else:
        if y>=70:
            return "B"
        else:
            if y>=60:
                return "c"
            else:
                if y>=55:
                    return "D"
                else:
                    return "E"

def main():
    mylist = [0,0,0,0,0,0]
    mylist[0]= input("Enter your name: ")
    mylist[1]= eval(input("Enter assigment score: "))
    mylist[2]= eval(input("Enter mid score: "))
    mylist[3]= eval(input("Enter final score: "))
    mylist[4]= score(mylist)
    mylist[5]=scoreToGrade(score(mylist))
    
    print(mylist)
main()
           