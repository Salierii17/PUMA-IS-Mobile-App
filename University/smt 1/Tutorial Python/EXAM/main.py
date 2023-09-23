semester =int(input("what semester?"))
sjt=int(input("How much subject? "))

all=[]
for i in range(sjt):
    score=int(input("Enter your grade : "))

    all.append(score)
print(all)

for i in all:
        if score > 85:
            a += 4
        elif score == 'B':
            b += 3
        elif score == 'C':
            c += 2
        elif score == 'D':
             d +=1
        elif score == 'F':
            f +=0
            return
    print(sum(all))
   
print("Your GPS in",semester,"is",GPS)
