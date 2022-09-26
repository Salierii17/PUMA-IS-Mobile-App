N_1= eval(input("Enter the First Number:  "))
max = N_1
min = N_1
c   = N_1

for x in range (1):
    N_2 = eval(input("Enter the Second Number:  "))
    if (N_2 > max ):
         max = N_2
    elif (N_2 < min ):
         min = N_2
    else:
        c = N_2 
    N_3 = eval(input("Enter the Third Number :  "))
    if (N_3 > max ):
         max = N_3
    elif ( N_3 < min):
         min = N_3
    else: 
        c = N_3

print (min, " ", c, " ", max)