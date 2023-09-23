# Create the program that read your name and print the first position of the first space

def main():
    name= input("Enter your name: ")
    for i in range (0,len(name),1):
        if name[i] in (" "):
            print("Position of space is ",i)
main()



