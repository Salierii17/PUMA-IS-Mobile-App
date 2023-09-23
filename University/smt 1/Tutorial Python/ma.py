def read_test_scores():
    print("Enter number of students: ")
    num = int(input())

    scores = []
    print("Enter the score: ")
    for score in range(num):

        score = int(input())
        while score < 0 or score > 100:
            print('Score should be between 0 and 100, try again:')
            score = int(input())
        
        scores.append(score)

    sum_scores = sum(scores)
    tavge = sum_scores / num
    return tavge, scores

def get_letter_score(n):
    if 90 <= n <= 100:
        grade = 'A'
    elif 80 <= n <= 89:
        grade = 'B'
    elif 70 <= n <= 79:
        grade = 'C'
    elif 60 <= n <= 69:
        grade = 'D'
    elif n<60:
        grade = 'F'
    return n

def print_comment(grades): 

    a=0
    b=0
    c=0
    d=0
    f=0   
    
    for grade in grades:
        if grade == 'A':
            a += 1
        elif grade == 'B':
            b += 1
        elif grade == 'C':
            c += 1
        elif grade == 'D':
            d +=1
        elif grade == 'F':
            f +=1
    print ('A: ' +str(a))
    print ('B: ' +str(b))
    print ('C: ' +str(c))
    print ('D: ' +str(d))
    print ('F: ' +str(f)) 

tavge, scores = read_test_scores()

grades = []
for score in scores:
    grades.append(get_letter_grade(score))

print ('Grade Distribution')
print_comment(grades)


print ("Test Average is:    " + str(tavge))