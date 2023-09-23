# Python 3 Implementation for
# Fibonacci triangle


# function to fill Fibonacci
# Numbers in f[]
def fib(f, N):

	# 1st and 2nd number of
	# the series are 1 and 1
	f[1] = 1
	f[2] = 1

	for i in range(3, N + 1):

		# Add the previous 2 numbers
		# in the series and store it
		f[i] = f[i - 1] + f[i - 2]


def fiboTriangle(n):

	# Fill Fibonacci numbers in
	# f[] using fib(). We need
	# N = n*(n + 1)/2 Fibonacci
	# numbers to make a triangle
	# of height n
	N = n * (n + 1) // 2
	f = [0] * (N + 1)
	fib(f, N)

	# To store next Fibonacci
	# Number to print
	fiboNum = 1

	# for loop to keep track of
	# number of lines
	for i in range(1, n + 1):

		# For loop to keep track of
		# numbers in each line
		for j in range(1, i + 1):

			print(f[fiboNum], " ", end="")
			fiboNum = fiboNum + 1

		print()


# Driver code
n = 5
fiboTriangle(n)

# This code is contributed by Nikita Tiwari.
