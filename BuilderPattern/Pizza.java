package BuilderPattern;

public class Pizza {
     String size;
     String crust;
     boolean cheese;
     boolean pepporini;
     boolean bacon;
     boolean onions;
     String sauceType;
     boolean mushrooms;

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauceType() {
        return sauceType;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isPepporini() {
        return pepporini;
    }

    public boolean isOnion() {
        return onions;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepporini +
                ", mushrooms=" + mushrooms +
                ", onions=" + onions +
                ", bacon=" + bacon +
                ", sauceType='" + sauceType + '\'' +
                '}';
    }
    
}
