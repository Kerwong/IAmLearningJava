package mediator.com;

/**
 * Created by Alasad on 2016/8/28.
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator  = new Mediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        colleagueA.selfMethod1();
        System.out.println("================");
        colleagueA.crossAB();
        System.out.println("================");
        colleagueA.crossAC();
        System.out.println("================");
        colleagueA.selfMethod2(1);
    }
}
