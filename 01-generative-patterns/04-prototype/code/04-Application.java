/**
 * Где-то в клиентском коде.
 */
public class Application {

    private List<Shapes> shapes;

    public Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        // anotherCircle будет содержать точную копию circle.
        Circle anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public void businessLogic() {
        // Плюс Прототипа в том, что вы можете клонировать набор объектов, не зная их конкретные классы.
        List<Shapes> shapesCopy = new ArrayList<>():
         /*
             Например, мы не знаем, какие конкретно объекты находятся внутри массива shapes, так как он объявлен
             с типом Shape. Но благодаря полиморфизму, мы можем клонировать все объекты «вслепую». Будет выполнен метод clone
             того класса, которым является этот объект.
         */

        for (Shape s : shapes) {
            // Переменная shapesCopy будет содержать точные копии элементов массива shapes.
             shapesCopy.add(s.clone())
        }
    }
}