package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: ahme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahme implements aiap {
    public static final anax a = anax.a("vehicle", "automobile", "mb bluetooth", "himbox", "abarth", "alfa romeo", "allroad", "aston martin", "bentley", "bmw", "bugatti", "cadillac", "chevrolet", "chevy", "chrysler", "citroen", "corvette", "daewoo", "daihatsu", "daimler", "datsun", "ferrari", "hummer", "hyundai", "infiniti", "innocenti", "maserati", "maybach", "mercedes", "mercury", "mitsubishi", "my rogue", "pontiac", "porsche", "prius", "santa fe", "ssangyong", "subaru", "suzuki", "volkswagen", "btc45", "atmobile", "rfbtaux", "deh-150", "bv7942", "deh-x6700", "avhx2700bs", "bv9973", "kdr540", "blue&me", "handsfreelink", "vauxhall", "automotive", "motorcycle", "toyota", "deh-x6600bt", "elantra", "altima");
    public static final anax b = anax.a("car", "ktm", "kia", "fiat", "audi", "ford", "jeep", "coupe", "lada", "opel", "himbox", "hb01", "iveco", "dodge", "josse", "motor", "motors", "lotus", "spectre", "royce", "saab", "skoda", "tesla", "honda", "rover", "lexus", "maxima", "mazda", "dacia", "buick", "jaguar", "volvo", "vw", "nissan", "uconnect", "gmc");
    private static final anax e = anax.a("chromebook", "keyboard", "headphone", "earbud", "computer", "boombox", "jambox", "bose mini soundlink", "bluebuds", "bose ae2w", "logitech adapter", "airwave", "rgb light");
    private static final anax f = anax.a("watch", "home", "desk", "iphone", "buds", "ihome", "soundbar", "ipod", "ledblue");
    private static final amzy g = amzy.a("surge", "charge hr", "zip", "flex", "up24", "one", "up2", "nexus 5", "nexus 6", "nexus 4");
    public final Object c = new Object();
    public final Map d = new HashMap();
    private final aizm h;
    private final Object i = new Object();
    private final List j = new ArrayList();
    private final aiwm k;

    public static ahmd a(aizo aizo) {
        return new ahmd(aizo, true);
    }

    static boolean b(aiaf aiaf) {
        if (aiaf != null) {
            int f2 = aiaf.f();
            int e2 = aiaf.e();
            if (!(f2 == 2304 || f2 == 768 || f2 == 2048 || f2 == 512 || e2 == 1068 || e2 == 1096 || e2 == 1060 || e2 == 1796 || e2 == 1812 || e2 == 1804 || (f2 == 256 ? e2 != 256 : e2 == 1048))) {
                for (String str : Arrays.asList(new String[]{aiaf.a(), aiaf.b()})) {
                    if (str != null && (g.contains(str.toLowerCase(Locale.ENGLISH)) || a(str, e, f))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public ahme(aizm aizm, aiwm aiwm) {
        this.h = aizm;
        this.k = aiwm;
    }

    private final void a(ahmd ahmd) {
        int i2;
        synchronized (this.i) {
            for (aiao aiao : this.j) {
                boolean z = ahmd.b;
                if (!ahmd.a()) {
                    i2 = ahmd.b() ? 2 : 3;
                } else {
                    i2 = 1;
                }
                aiao.a(z, i2, ahmd.c);
            }
        }
    }

    public static boolean a(String str, Iterable iterable, Set set) {
        if (str == null) {
            return false;
        }
        for (String lowerCase : str.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])| |_|-")) {
            if (set.contains(lowerCase.toLowerCase(Locale.ENGLISH))) {
                return true;
            }
        }
        String lowerCase2 = str.toLowerCase(Locale.ENGLISH);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (lowerCase2.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final Map a() {
        HashMap hashMap;
        synchronized (this.c) {
            hashMap = new HashMap();
            for (ahmd ahmd : this.d.values()) {
                if (ahmd.a()) {
                    hashMap.put(Long.valueOf(ahmd.c.a), ahmd);
                }
            }
        }
        return hashMap;
    }

    public final void a(aiaf aiaf) {
        aiwm aiwm = this.k;
        if (aiwm != null && aiwm.a() != null && this.k.a().size() < this.d.size()) {
            HashSet hashSet = new HashSet();
            for (aizo aizo : this.k.a()) {
                hashSet.add(Long.valueOf(aizo.a));
            }
            ArrayList arrayList = new ArrayList();
            for (Long l : this.d.keySet()) {
                if (!hashSet.contains(l) && (aiaf == null || l.longValue() != aiaf.a)) {
                    arrayList.add(l);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Long l2 = (Long) arrayList.get(i2);
                ahmd ahmd = (ahmd) this.d.get(l2);
                Locale locale = Locale.ENGLISH;
                new Object[1][0] = ahmd.c.a();
                ahmd ahmd2 = new ahmd(ahmd.c, false);
                this.d.put(l2, ahmd2);
                a(ahmd2);
            }
            this.d.keySet().removeAll(arrayList);
        }
    }

    public final void a(aiaf aiaf, int i2) {
        boolean z;
        String str;
        String str2;
        char c2 = i2 != 1 ? i2 == 4 ? 1 : (i2 == 2 || i2 == 5) ? (char) 2 : 0 : 1;
        if (c2 == 1 || c2 == 2) {
            if (c2 == 1) {
                z = true;
            } else {
                z = false;
            }
            ahmd ahmd = new ahmd(aiaf, z);
            this.d.put(Long.valueOf(aiaf.a), ahmd);
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[3];
            if (!z) {
                str = "disconnected";
            } else {
                str = "connected";
            }
            objArr[0] = str;
            objArr[1] = aiaf.a();
            objArr[2] = Integer.valueOf(ahmd.a);
            if (z && axwx.a.a().collectBluetoothInVehicleDeviceClassification()) {
                if (!ahmd.a()) {
                    str2 = "bluetooth_device_classified_not_in_vehicle";
                } else {
                    str2 = "bluetooth_device_classified_in_vehicle";
                }
                this.h.a("ar", str2, aiaf.a() + ":" + aiaf.b() + aiaf.e(), 0);
            }
            a(ahmd);
        }
    }

    public final void a(aiao aiao) {
        synchronized (this.i) {
            this.j.add(aiao);
        }
    }
}
