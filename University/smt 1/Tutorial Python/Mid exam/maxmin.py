print("This program will calculate max, min, and average score")

rpt=int(input("How much score?"))

all= []
for n in range(rpt):
    score=int(input("Enter  score : "))
    
    while score>100 or score<0:
        print("score must be below 100 and not negative")
        score=int(input("Enter score : "))
   
    all.append(score)
    all.sort()
print(all)

print("\nMaximum score is", max(all))
print("Minimum score is", min(all))
print("Average score is", (sum(all)//rpt))