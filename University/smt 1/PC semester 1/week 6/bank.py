def main ():
    print ("Change counter\n")

    print ("Please enter the count of each coin type.")
    onehundred = eval(input("one hundred Thousand kartal: "))
    fifty = eval(input("Fifty Thousands kartal: "))
    twenty = eval(input("Twenty Thousands kartal: "))
    five = eval(input("Five Thousands kartal: "))
    two = eval(input("Two thousands kartal: "))
    one = eval(input("One thousands kartal: "))
    total = onehundred * 100 + fifty * 50 + twenty * 20 + five * 5 + two * 2 + one * 1                

    print ("The total value of your change is ${0}.{1:0>2} millions"
             .format(total//1000, total%1000))  
main()                      