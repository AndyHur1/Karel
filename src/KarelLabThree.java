import becker.robots.*;
public class KarelLabThree {


    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs, 0, 0, Direction.SOUTH, 1);
        Robot carel = new Robot(ssfs, 0, 3, Direction.EAST, 0);


        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        carel.turnLeft();
        carel.turnLeft();
        carel.turnLeft();
        carel.pickThing();
        carel.move();
        carel.move();
        carel.putThing();
        carel.turnLeft();
        carel.turnLeft();
        carel.move();
        carel.move();
        carel.turnLeft();
        carel.turnLeft();
        carel.turnLeft();






    }
}
