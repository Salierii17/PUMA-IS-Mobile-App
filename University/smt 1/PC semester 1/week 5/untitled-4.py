first = input("please enter your first name (all lowercase): ")
last = input("please enter your first name (all lowercase): ")
unname = first + last
for i in range(0,len(unname),1):
        unname = first[0:1] + last[0:1]
print("Your user name is ",unname)
