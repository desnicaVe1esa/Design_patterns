/**
 * Общий интерфейс компонентов. Классы компонентов общаются с посредниками через их общий интерфейс. Благодаря этому
 * одни и те же компоненты можно использовать в разных посредниках.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}