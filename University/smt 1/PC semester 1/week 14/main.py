def main():
    n=eval(input("How many numbers do you have? "))
    sum = 0.0
    for i in range(n):
        x=eval(input("Enter a numbers >>"))
        sum = sum + x
        while x>100 or x<0:
            print("score should be lower than 100 and higher than 0")
            x=eval(input("Enter a numbers >>"))
            sum = sum + x
    print("the average of the numbers is",sum/n)
main()