def main():
    size=5
    names=[]
    score=[0,0,0,0,0]
    grade=[0,0,0,0,0]
    all=[]
        
    for i in range(size):
        name=input("Enter your name : ")
        names.append(name)
        score[i]=eval(input("Enter your score : "))
        if score[i]>= 85:
                grade[i]="A"
        else:
            if score[i]>=70:
                grade[i]="B"
            else:
                if score[i]>=60:
                    grade[i]="C"
                else:
                    if score[i]>=55:
                        grade[i]="D"
                    else:
                         grade[i]="E"
    print()
    print(names)
    print()
    print(score)
    print()
    print(grade)
    print()
    print('{0:12}'.format("names"),'{0:10}'.format("score"),'{0:8}'.format("grade"))             
    
    for i in range(size):
        print('{0:4}'.format(names),'{0:10}'.format(score[i]),'{0:8}'.format(grade[i]))           
    
main()