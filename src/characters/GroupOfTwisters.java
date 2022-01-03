package characters;

import abstractions.MessageProcesser;

public class GroupOfTwisters extends Twister {

    public GroupOfTwisters() {
        this.name = "Крутильщики";
    }

    public void undress() {
        MessageProcesser.begin().reportCustom(this.toString() + " разделись, но " +
                "даже это не приносило им облегчения");
    }

    @Override
    public void pump() {
        MessageProcesser.begin().reportCustom(this.toString() +
                " откачивают воду");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
