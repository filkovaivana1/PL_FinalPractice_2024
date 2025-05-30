public class Door {
    private boolean opened;

    public Door() {
        this.opened = false;
    }

    public void openDoor(){
        if(this.opened){
            System.out.println("The door is already opened.");
        }
        else{
            this.opened = true;
            System.out.println("Doors opened");
        }
    }

    public void closeDoor(){
        if(this.opened){
            this.opened = false;
            System.out.println("Doors closed");
        }
        else{
            System.out.println("The door is already closed.");
        }
    }
}
