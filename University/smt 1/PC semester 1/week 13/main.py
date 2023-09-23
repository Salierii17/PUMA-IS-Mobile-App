#Decision Structure

#if condition and  

def main():
    far=eval(input("Enter temperature in fahranheit : "))
    cel=(far - 32)* 5/9
    print("temperature in celsius is",cel,"celsius")
    if cel>= 34:
        print("Today is a hot day")
    if cel<= 34:
        print("Today is a cold day")
main()

