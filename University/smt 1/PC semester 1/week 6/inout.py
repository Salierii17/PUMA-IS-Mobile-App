def main():
    filename= input("Enter your input filename: ")
    infile= open(filename,'')
    filename1= input("Enter your output filename: ")
    outfile=open(filename1,'w')

    data= infile.read()

    outfile.write(data)

    infile.close()
    outfile.close()
       
main()