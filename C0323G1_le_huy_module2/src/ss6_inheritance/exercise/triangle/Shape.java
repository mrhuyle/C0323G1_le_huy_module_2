package ss6_inheritance.exercise.triangle;

class Shape {
    private String color = "blue";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape has color = "
                + getColor()
                + " and "
                + (isFilled() ? "is filled" : "is not filled");
    }

}
