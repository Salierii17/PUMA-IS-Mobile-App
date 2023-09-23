# a = 10, a adalah variabel dengan angka satuan

# tipe data = angka satuan  (integer) 
data_integer = 7
print("data : ", data_integer)
print("- bertipe : ", type(data_integer))

# tipe data = angka dengan koma (float)
data_float = 7.7
print("data : ", data_float)
print("- bertipe : ", type(data_float))

# tipe data = kumpulan karakter (string)
data_string = "Sulthan"
print("data : ", data_string)
print("- bertipe : ", type(data_string))

# tipe data = biner True/False (bolean)
data_bool = False
print("data : ", data_bool)
print("- bertipe : ", type(data_bool))

## tipe data khusus

# tipe data kompleks
data_complex = complex(7,14)
print("data : ", data_complex)
print("- bertipe : ", type(data_complex))

# tipe data dari bahasa c

from ctypes import c_double
data_c_double = c_double(5.7)
print("data : ", data_c_double)
print("- bertipe : ", type(data_c_double))

