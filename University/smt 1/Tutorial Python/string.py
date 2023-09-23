print('mr ro\'bot')

#newline
print("first line\nsecond line" )   # LR -> Line Feed -> unix, macos, linux
print("first line\rsecond line" )   # CR -> Carriage Rerturn -> commodore, acorn, lisp
print("first line\r\nsecond line" ) # CRLF -> Carriage Rerturn Line Feed -> Windows

#multiline literal string
print("""
Name    : Sulthan Zimran Alrazzaq
Class   : X - 3
""")
## String method
# Count
data =" Sulthan Zimran Alrazzaq"
amount = data.count("a")
print("amount of a in" + data + "=" + str(amount))

# isalpha() <-- untuk pengecekan semua huruf

data =" Sulthan Zimran Alrazzaq"
alpha = data.isalpha()
print("amount of a in" + data + "=" + str(alpha))
# isalnum() <-- pengecekan huruf dan angka
# isdecimal() <-- pengecekan huruf aja
# isspaci() <-- spasi,tab, newline in
#istitle() <-- semua kata dimulai dengan huruf besar


data = "hasil"
midlane = data.center(15,"=")
print (midlane)
