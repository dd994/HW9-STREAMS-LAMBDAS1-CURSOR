package main.java.thingsbox;

public class Protected  extends Thing{
    private Thing thing;

    public Protected(String name) {
        super(name);
    }



    public Thing getThing() {
        return thing;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    boolean weak() {
        return true;
    }

    @Override
    public String toString() {
        return "Protected{" +
                "thing=" + getName() +
                '}';
    }


}
