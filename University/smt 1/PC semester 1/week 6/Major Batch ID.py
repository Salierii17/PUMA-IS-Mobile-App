majors = ("Information System","Information Technology","Electrical Engineering")
studentId = input("Enter your Student ID : ")
maj = studentId[0:2]
batch = studentId[2:6]
seq = studentId[6:]
majnum = int(maj)
majorName = majors[majnum-1] 
#print (maj, batch, seq)
print("your major is", majorName)
print("Your batch is", batch)
print("Your seq Id is", seq)











  






























