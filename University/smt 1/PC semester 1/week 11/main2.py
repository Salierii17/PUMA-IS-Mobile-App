from graphics import *
def main():
    win = GraphWin("shapes",400,400)
    p = Point(50,50)
    p.draw(win)
    # draw the other point
    p = Point(350, 350)
    p.draw(win)

    # draw circle
    c = Circle(Point(200,200), 50)
    c.setFill("grey")