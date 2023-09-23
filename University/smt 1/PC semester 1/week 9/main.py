total_nasgorbistik= 0
total_miebakso = 0
total_spagettituna = 0

for counter in range(10):
        foods=input("Enter food type sold = ")
        
        if foods.lower()== "nasgorbistik":
            total_nasgorbistik+= 1
        if foods.lower()== "miebakso":
            total_miebakso+= 1
        if foods.lower()== "spagettituna":
            total_spagettituna+= 1
        
        repeat=input("\ndo you want to stop counting?")
        print(" ")   
        if repeat == 'no':
            polling_active = False
        print("Total foods type nasgorbistik is",total_nasgorbistik,"sold")
        print("Total foods type miebakso is",total_miebakso,"sold")
        print("Total foods type spagettituna is",total_spagettituna,"sold")

print("Total profit today is",((total_nasgorbistik*25000) + (total_miebakso*18000) + (total_spagettituna*15000)))
    


