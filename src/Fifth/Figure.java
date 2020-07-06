package Fifth;

//5) Create an abstract class Figure. Add fields width and height to it. Add an abstract method "calculateArea"
//        which should be overriden by the concrete figures to calculate its area.

abstract class Figure {
    int width;
    int height;

    abstract int calculateArea();
}
