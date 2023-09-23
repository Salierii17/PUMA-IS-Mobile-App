print("This program will convert the temperatur from celcius\ninto reamur,fahrenheit, and kelvin") 

#celcius
celcius= float(input("Enter the temperature in celsius : "))

print("Temperatur is",celcius,"C")

#reamur
reamur= (4/5) * celcius
print("Temperatur on reamur is",reamur, "R")

#fahrenheit
fahrenheit = ((9/5) * celcius) + 32
print("Temperatur on reamur is",fahrenheit, "F")

#kelvin
kelvin = celcius + 273
print("Temperatur on reamur is",kelvin, "K")


