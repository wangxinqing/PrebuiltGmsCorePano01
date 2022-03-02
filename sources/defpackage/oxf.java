package defpackage;

import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: oxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxf {
    public static Map a(Thing[] thingArr, String str, oyb oyb) {
        HashMap hashMap = new HashMap();
        for (Thing thing : thingArr) {
            oxe a = a(thing, str, oyb);
            List list = (List) hashMap.get(a);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(a, list);
            }
            list.add(thing);
        }
        return hashMap;
    }

    static oxe a(Thing thing, String str, oyb oyb) {
        int i;
        long[] b = thing.c.b("scope");
        if (b != null) {
            oxz.b(thing);
            i = (int) b[0];
        } else if (!oxz.a(thing)) {
            i = 1;
        } else {
            i = 2;
        }
        return new oxe(oyb.b(thing.e), str, i);
    }
}
