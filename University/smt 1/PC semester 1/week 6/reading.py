def main ():
    fname = input("Enter filename: ")
    infile = open(fname, 'r')
    for i  in range(0,5,1):
        data = infile.readline()
        print(data)
    infile.close()
main()