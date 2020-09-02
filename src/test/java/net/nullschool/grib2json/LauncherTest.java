package net.nullschool.grib2json;

import net.nullschool.grib2json.Launcher;
import org.junit.Test;

/**
 * 2013-10-24<p/>
 *
 * @author Cameron Beccario
 */
public class LauncherTest {

    @Test
    public void test_1() {
//        Launcher.main(new String[] {"C:/Users/86434/Downloads/wind.grib2", "out.txt", "true"});
//        Launcher.main(new String[] {"c:/users/cambecc/desktop/gfs/gfs.t18z.pgrbf00.2p5deg.grib2", "out.txt", "false"});
//        String args = "--fc 2 --fs 103 --fv 80 --names C:/Users/86434/Downloads/wind.grib2";

//        String args = "--names --data C:/Users/86434/Downloads/wind.grib2";
//        Launcher.main(args.split(" "));

        Launcher.main(new String[] {"--names","--compact","--data","D:/gis/wind/windata/20200810/2020081009.grb2"});
        //C:/Users/86434/Downloads/rh.grib2
    }
}
