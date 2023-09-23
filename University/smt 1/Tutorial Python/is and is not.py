x= 7
y= 7

print(5*"="+"object identity(==)")

print("x value is = ",x,"id = ",hex(id(x)))
print("y value is = ",y,"id = ",hex(id(y)))

total = x is y
print("x is y =", total)

print("====== object identity(!=)")

print("x value is = ",x,"id = ",hex(id(x)))
print("y value is = ",y,"id = ",hex(id(y)))

total = x is not y
print("x is y =", total)





