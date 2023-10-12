import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Monster extends Element {

    private Position position;

    public Monster(int x, int y) {
        super(x,y);
        this.position = new Position(x,y);
    }

    @Override
    void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#ff0000"));
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "M");
    }

    void move() {
        int randomX = ThreadLocalRandom.current().nextInt(-1, 2);
        int randomY = ThreadLocalRandom.current().nextInt(-1, 2);

        this.position = new Position(this.position.getX() + randomX, this.position.getY() + randomY);
    }




    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
