package defpackage;

import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajri {
    public static adyn a(List list) {
        if (!list.isEmpty()) {
            adyn adyn = new adyn();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adyn adyn2 = new adyn();
                ajrj.a(adyn2, (Location) it.next());
                arrayList.add(adyn2);
            }
            adyn.a("LOCATION_LIST", arrayList);
            ajrj.a(adyn, (Location) list.get(list.size() - 1));
            return adyn;
        }
        throw new IllegalArgumentException();
    }
}
