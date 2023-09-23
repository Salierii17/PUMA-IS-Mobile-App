total=0

for counter in range(50):
    grade= input("Enter the grade: ")
    

    if grade.upper() =='A':
        total+= 4
    if grade.upper() =='B':
        total+= 3
    if grade.upper() =='C':
        total+= 2
    if grade.upper() =='D':
        total+= 1
    if grade.upper() =='E':
        total+= 0 
   
        
    if (counter+1) % 5 == 0:
        GPS = total/5
        print("GPS for semester",(counter+1)//5,"is",GPS)
        total = 0 

print("A :",totalA)
print("B :",totalB)
print("C :",totalC)
print("D :",totalD)
print("E :",totalE)

