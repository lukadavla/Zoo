package ge.sdsu.davla;
import ge.sdsu.davla.RegularVisitor;
import ge.sdsu.davla.VIPVisitor;

import java.util.*;
public class Zoo {
    private ArrayList<Enclosure> enclosurelist;
    private static ArrayList<RegularVisitor> RegularVisitor;
    private static ArrayList<VIPVisitor> VIPVisitor;

    public Zoo(){
        enclosurelist = new ArrayList<>();
        RegularVisitor = new ArrayList<>();
        VIPVisitor = new ArrayList<>();
    }
    public void addEnclosure(Enclosure enclosure) {
        enclosurelist.add(enclosure);
    }
    public void removeEnclosure(Enclosure enclosure) {
        enclosurelist.remove(enclosure);
    }
    public static void registerRegular(ge.sdsu.davla.RegularVisitor visitor) {
        RegularVisitor.add(visitor);
    }
    public void unregisterRegular(ge.sdsu.davla.RegularVisitor visitor) {
        RegularVisitor.remove(visitor);
    }
    public static void registerVip(ge.sdsu.davla.VIPVisitor vipVisitor) {
        VIPVisitor.add(vipVisitor);
    }
    public void unregisterVip(ge.sdsu.davla.VIPVisitor vipVisitor) {
        VIPVisitor.remove(vipVisitor);
    }
}
