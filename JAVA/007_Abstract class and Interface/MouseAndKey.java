interface EventListener{
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    default void keyReleased(){
        System.out.println("Release Key of Mouse.");
    }

}
class EventDemo implements MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("Mouse is Performed.");
    }
    public void mouseClicked(){
        System.out.println("Click on Mouse.");
    }
    public void mousePressed(){
        System.out.println("Press on Mouse.");
    }
    public void mouseReleased(){
        System.out.println("Release to Mouse.");
    }
    public void mouseMoved(){
        System.out.println("Mouse is Moved.");
    }
    public void mouseDragged(){
        System.out.println("Mouse is Dragged");
    }
    public void keyPressed(){
        System.out.println("Key Pressed of Mouse.");
    }
    // public void keyReleased(){
    //     System.out.println("Key Released of Mouse");
    // }
}
public class MouseAndKey{
    public static void main(String[] args){
        EventDemo ed = new EventDemo();
        ed.mousePressed();
        ed.mouseMoved();
        ed.keyPressed();
        ed.keyReleased();
    }
}
