 # make a program that will 
# determine your age and birth date acccording
# to date today

import datetime as dt
print("Please enter date, month, \nand year of your birthdate")

date=int(input("Enter the date \t\t: "))
month=int(input("Enter the month \t: "))
year=int(input("Enter the year \t\t: "))

birthdate=dt.date(year, month, date)
print(f"Your Birthdate is {birthdate} and the day is {birthdate:%A}")

today=dt.date.today()
print(f"\nToday date is {today} and the day is {today:%A}") 
day_age= today - birthdate
year_age= day_age.days // 365
print(f"your day age is {day_age}")
print(f"your age is {year_age}" + " years old and" f"\nyour date age is {day_age}")
