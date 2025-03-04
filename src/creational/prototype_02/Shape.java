package creational.prototype_02;


// Prototype
public abstract class Shape implements Cloneable {

    String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}

