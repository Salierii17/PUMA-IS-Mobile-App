def main():
    moderate="yes"
    sum = 0.0
    count= 0
    while moderate[0] =='y':
        x=int(input("Enter a numbers >>"))
        sum+=x
        count+=1
        moderate = input("Do you have more numbers (yes or no)?")
        
    print("\n the average of numbers is",sum/count)

main()