print("This program to find average of scores and min & max scores\n")

students = {}

polling_active = True
sum=0
n=0
max=0
min=1000

while polling_active:
    name = input("Enter the name of student: ")
    score = int(input("Enter the score of student: "))
    sum=score+sum
    n=n+1
    students[name] = score
    
    if(score>max):
        max=score
        maxname=name
    if(score<min):
        min=score
        minname=name
    
    print(" ")
    repeat = input("would you like to add another student?" " " "(yes/no)" " ")
    print(" ")
    
    if repeat == 'no':
        polling_active = False
        
        print ("{0:>30}".format("-------RESULT-------"))
        print(" ")
        for name, score in students.items():
            print("Score of", name, "is: ", score )
        print(" ")
        print("average = " + str(sum/n))
        print(" ")
        print("{0:>28}".format("name")+ "{0:>16}".format("score"))
        print("max score is " + "{0:>15}" .format ("maxname") + "{0:>15}".format (str(max)))
        print("min score is " + "{0:>15}" .format ("minname") + "{0:>15}".format (str(min)))
        print(" ")
        mm=max+min
        print("average = " + str(mm/2))