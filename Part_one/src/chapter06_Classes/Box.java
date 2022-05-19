package chapter06_Classes;

class Box {
    double width = 1.0;
    double height = 2.0;
    double depth = 3.0;

    Box() {};
    Box(double width, double height, double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume()
    {
        double vol = (width * height * depth);
        return vol;
    }

}
