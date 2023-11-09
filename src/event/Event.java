package event;

import Charactor.*;

public class Event {
    public static boolean checkHit(Superman spm, Wave wave, int spmSize, int waveHeight) {
        if (spm.x + spmSize > wave.x && spm.x < wave.x) {
            if (spm.y + spmSize >= wave.y - waveHeight) {
                return true;
            }
        }
        return false;
    }

    public static void gameStop(Wave[] wave, Environment[] env) {

    }

}
