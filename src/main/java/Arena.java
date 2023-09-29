import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {

    private int width;
    private int height;

    private Hero hero;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
        this.hero = new Hero(width/2, height/2);
    }

    public void processKey(KeyStroke key) throws IOException {
        System.out.println(key);

        switch(key.getKeyType()){
            case ArrowUp: moveHero(hero.moveUp()); break;
            case ArrowDown: moveHero(hero.moveDown()); break;
            case ArrowLeft: moveHero(hero.moveLeft()); break;
            case ArrowRight: moveHero(hero.moveRight()); break;
        }

    }

    private void moveHero(Position position) {
        if(canHeroMove(position)) hero.setPosition(position);
    }

    private boolean canHeroMove(Position position){
        return !(position.getX() >= width || position.getY() >= height || position.getX() < 0 || position.getY() < 0);
    }

    public void draw(Screen screen) {
        System.out.println("draw arena");
        hero.draw(screen);
    }
}
