from graphics import *
def main():
    # Create a window 400x400 pixels
    win = GraphWin("shapes",400,400)

    # make the window scaled
    win.setCoords(0.0,0.0,10.0,10.0)

    center = Point(5,5)
    circ = Circle(center, 8)
    circ.setFill('yellow')
    circ.draw(win)

    

    
# Draw left eye

    eye1 = Circle(Point (3,6), 1)   
    eye1.setFill("green")
    eye1.draw(win)

# Draw right eye

    eye2 = Circle(Point (7,6), 1)
    eye2.setFill("green")
    eye2.draw(win)
#draw Nose
    pol1 = Polygon(Point (4,7), Point (5,5))
    pol1.setFill("Red");
    pol1.draw(win)
    
    pol2 = Polygon(Point (6,7), Point (5,5))
    pol2.setFill("Red");
    pol2.draw(win)
    
    pol3 = Polygon(Point (5,7), Point (5,5))
    pol3.setFill("Red");
    pol3.draw(win)

# Draw mouth

    rect = Rectangle (Point (4, 2), Point (6, 3))
    rect.setFill("blue");
    rect.draw(win)

   

    line = Line(Point(1,8), Point(9,8))
    line.draw(win)

    message = Text(Point(5, 0.5),"Click anywhere to quit")
    message.setFill("purple")
    message.draw(win)

    win.getMouse()

    win.close()

main()

