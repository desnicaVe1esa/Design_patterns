/**
 * Где-то в клиентском коде.
 */
public class Application {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        /*
            Плюс Прототипа в том, что вы можете клонировать набор объектов, не зная их конкретные классы.
            Например, мы не знаем, какие конкретно объекты находятся внутри массива shapes, так как он объявлен
            с типом Shape. Но благодаря полиморфизму, мы можем клонировать все объекты «вслепую». Будет выполнен метод clone
            того класса, которым является этот объект.
         */
        for (Shape shape : shapes) {
            // Переменная shapesCopy будет содержать точные копии элементов массива shapes.
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}