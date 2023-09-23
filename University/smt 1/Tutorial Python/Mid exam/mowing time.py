print("This program will calculate mowing time ")

l_block=int(input("Enter length of block (m) : "))
w_block=int(input("Enter width of block (m) : "))
l_home=int(input("Enter length of house (m) : "))
w_home=int(input("Enter width of house (m) : "))
mow_speed=int(input("Enter mowing speed (m^2/s): "))

area = (l_block*w_block) - (l_home*w_home)
mow_time= area/mow_speed
print("\nArea : ",area,"m^2")
print("mowing time : ",mow_time,"s")

