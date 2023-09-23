semester =int(input("what semester?"))
sjt=int(input("How much subject? "))

all=[]
for i in range(sjt):
    grade=(input("Enter your grade : "))

    all.append(grade)
print(all)

a=0
b=0
c=0
d=0
f=0   
    
for i in grade:
    if grade == 'A':
        a += 4
    elif grade == 'B':
        b += 3
    elif grade == 'C':
        c += 2
    elif grade == 'D':
            d +=1
    elif grade == 'F':
        f +=0
    
print(sum(all))
   
print("Your GPS in",semester,"is",GPS)
