total=0
A_count=0
B_count=0
C_count=0
D_count=0
E_count=0
list=[]
GPS_list=[]

for counter in range(10):
    score= int(input("Enter the score: "))
    while score < 0 or score > 100:
        print('Score should be between 0 and 100, try again:')
        score= int(input("Enter the score: "))
    
    list.append(score)
   
    if score>=85:
        total+= 4
        A_count+=1
    if 85>score>=70:
        total+= 3
        B_count+=1
    if 70>score>=60:
        total+= 2
        C_count+=1
    if 60>score>=55:
        total+= 1
        D_count+=1
    if score<55:
        total+= 0
        E_count+=1 
    
    if (counter+1) % 5 == 0:
        GPS = total/5
        print("\nGPS for semester",(counter+1)//5,"is",GPS)
        total = 0 
        GPS_list.append(GPS)

print()
print(5*"="+"List of score"+"="*5)
print(list)
print("\nMaximum score is", max(list))
print("Minimum score is", min(list))

print()
print(5*"="+"Number of grade"+"="*5)
print("\nA :",A_count)
print("B :",B_count)
print("C :",C_count)
print("D :",D_count)
print("E :",E_count)

print()
print(5*"="+"List of GPS"+"="*5)
print(GPS_list)
GPA=sum(GPS_list)/10
print("\nYour GPA is",GPA)
