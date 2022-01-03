package ambient;

import states.Atmosphere;

public class Tub extends Location {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Tub() {
        this.name = "Лоханка";
    }

    @Override
    public String getConditionDescriptions() {
        String result = "";
        for (Atmosphere x : this.currentStates)
            result += x.toString() + " ";
        return result;
    }
}
