def main():
        Filename=input("Enter your input file name  : ")
        Filename1=input("Enter your output file name : ")
        infile=open(Filename,'r')
        infile1=open(Filename1,'r')
        print(infile.read())
        print(infile1.read())
main ()