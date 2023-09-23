monthStr=("January", "February", "March", "April", "May","June", "July", "August", "September", "October", "November", "December")
dateStr= input("Enter the date in the form of mm/dd/yyyy : ")
monthStr, dayStr, yearStr + dataStr.split("/")
monthNumb= int(monthStr)
print(months[monthNumb-1], dayStr, "," yearStr)
newdateStr=months[monthNumb-1] + " " + dayStr + "," + yearStr
print (newdateStr.center(30))
