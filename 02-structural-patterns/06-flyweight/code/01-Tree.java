/**
 * Классы Tree и Forest являются клиентами Легковеса. При желании их можно слить в один класс, если вам не нужно
 * расширять класс деревьев далее.
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}