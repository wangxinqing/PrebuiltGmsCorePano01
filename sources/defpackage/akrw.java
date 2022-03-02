package defpackage;

import android.util.Log;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: akrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrw {
    public static List a(UserLocationNearbyAlertFilter userLocationNearbyAlertFilter) {
        ArrayList arrayList = new ArrayList();
        String str = userLocationNearbyAlertFilter.c;
        if (str != null) {
            arrayList.add(str);
        } else if (userLocationNearbyAlertFilter.d) {
            arrayList.add("_beacon_");
        } else if (!userLocationNearbyAlertFilter.b.isEmpty()) {
            for (Integer intValue : userLocationNearbyAlertFilter.b) {
                String a = akic.a(intValue.intValue());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 7);
                sb.append("_type_");
                sb.append(a);
                sb.append("_");
                arrayList.add(sb.toString());
            }
        } else if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "The NearbyAlertFilter is invalid!");
        }
        return arrayList;
    }

    public static Map a(Map map, Map map2) {
        Set set;
        Integer num;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            akqm akqm = (akqm) entry.getKey();
            hashMap.put(akqm, new ArrayList());
            List<String> list = (List) entry.getValue();
            String str = akqm.b;
            if (!a(str)) {
                set = Collections.emptySet();
            } else {
                if (str.equals("_transit_stations_")) {
                    num = Integer.valueOf(akic.a("transit_station"));
                } else {
                    num = Integer.valueOf(akic.a(str.substring(6, str.length() - 1)));
                }
                set = Collections.singleton(num);
            }
            for (String str2 : list) {
                if (map2.containsKey(str2)) {
                    akrb akrb = (akrb) map2.get(str2);
                    ((List) hashMap.get(akqm)).add(new akri(str2, akrb.a, akrb.b, akrb.c, set));
                }
            }
        }
        return hashMap;
    }

    public static void a(List list, float f) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((akri) it.next()).d = f;
        }
    }

    public static boolean a(String str) {
        return str.equals("_transit_stations_") || str.startsWith("_type_");
    }
}
