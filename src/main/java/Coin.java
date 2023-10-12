import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Coin extends Element {

    private Position position;

    public Coin(int x, int y) {
        super(x,y);
        this.position = new Position(x,y);
    }

    @Override
    void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#00ffff"));
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "$");
        System.out.println("drawing coin");
        graphics.enableModifiers(SGR.BOLD);
    }




    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
