package comswatisingh0960.httpsgithub.restaurantmap.models;

import com.orm.SugarRecord;

/**
 * Created by Swati on 11/25/2016.
 */

public class Clock extends SugarRecord{

    long startTime;
    long endTime;

    public void reset() {
        startTime = 0;
        endTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getCurrentInterval() {
        return endTime - startTime;
    }

}
