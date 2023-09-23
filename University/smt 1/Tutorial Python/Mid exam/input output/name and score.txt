print("This program calculate average,max, and min score of student")
students = {}
sum=0
n=0
max=0
min=1000

def Average(lst): 
    return sum(lst) / len(lst)  

while True:
    name = input("enter the name: ")
    score = int(input("enter the score: "))

    sum=score+sum
    n=n+1
    students[name] = score

    if(score>max):
        max=score
        maxname=name
    
    if(score<min):
        min=score
        minname=name
        
    repeat = input("do you like to add another student?" "(yes/no): ")
    
    if repeat == 'no':
        polling_active = False
      

        print ("{0:>10}".format("-------RESULT-------"))    
        print(" ")
        for name, score in students.items():
         print("Score of", name, "is: ", score )
        print(" ")
            
        print("average score is = " + str(sum/n))
        print(" ")
        print("{0:>20}".format("name")+ "{0:>15}".format("score"))
        print("max score is " + "{0:>10}" .format (maxname) + "{0:>10}".format (str(max)))
        print("min score is " + "{0:>10}" .format (minname) + "{0:>10}".format (str(min)))
        print(" ")
        mm=max+min
        print("average max and min score = " + str(mm/2))


