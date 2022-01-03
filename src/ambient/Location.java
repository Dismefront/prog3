package ambient;

import states.Atmosphere;

import java.util.ArrayList;

public abstract class Location implements AtmosphereAppliable {

    ArrayList<Atmosphere> currentStates;
    protected String name;

    {
        currentStates = new ArrayList<Atmosphere>();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void applyConditions(Atmosphere... args) {
        for (Atmosphere x : args)
            this.currentStates.add(x);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public abstract String getConditionDescriptions();

}
