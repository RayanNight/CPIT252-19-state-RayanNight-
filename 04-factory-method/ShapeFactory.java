public class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null || type == "") {
            return null;
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        System.err.println("Unknown shape type");
        return null;
    }
}
