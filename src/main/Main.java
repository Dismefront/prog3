package main;

import abstractions.Created;
import abstractions.MessageProcesser;
import ambient.DevilWheel;
import ambient.EventManager;
import ambient.Location;
import ambient.Tub;
import characters.GroupOfTwisters;
import characters.Ponchik;
import states.Atmosphere;
import states.Health;

public class Main {

    public static void main(String ... args) {

        // lab-3
        Location tub = new Tub();
        tub.applyConditions(Atmosphere.DARK, Atmosphere.MUGGY,
                Atmosphere.RAW, Atmosphere.TIGHT);
        MessageProcesser.begin().notifyOnLocationCreation(tub, true);
        GroupOfTwisters got = new GroupOfTwisters();
        got.applyConditions(Health.SWEATY);
        MessageProcesser.begin().notifyOnCharacterCreation(got, true);
        got.undress();
        EventManager.createFlood(tub);
        EventManager.fightEventWithCharacter(got);
        got.applyConditions(Health.COUGH, Health.SNEEZE, Health.RHEUMATOID,
                Health.CATHAR, Health.FLU, Health.PNEUMONIA);
        MessageProcesser.begin().notifyCharacterConditions(got);
        Ponchik ponchik = new Ponchik();
        ponchik.applyConditions(Health.TIREDNESS);
        MessageProcesser.begin().notifyOnCharacterCreation(ponchik, true);
        ponchik.lay();
        ponchik.eat();
        EventManager.createPleasuringEvent(ponchik, (x) -> x.chill(new DevilWheel()));
        //end of lab-3

    }

}
