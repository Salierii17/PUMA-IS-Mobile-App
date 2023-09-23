student = []
student_1=[]
score = []
copy = [] 
loop = True
yes = ["YES","yes","y","Y"]
while loop:
    Name = input("Name : ")
    Score = int(input("Score : "))
    student.append(Name)
    score.append(Score)
    copy.append(Score)
    Enter_more = input("continue or stop(yes/no): ")
    if Enter_more in yes:
        continue
    else:
        break
score.sort()
score.reverse()
sum = 0
for i in range(len(score)):
    index = score[i]
    student_1.append(student[copy.index(index)])
    sum+=score[i]
    score[i] = student[i]
print("Average Score is "+str(float(sum/len(score))))
print("Highest Score is Scored by  "+str(student_1[0]))
print("Lowest Score is Scored by "+str(student_1[len(student_1)-1]))