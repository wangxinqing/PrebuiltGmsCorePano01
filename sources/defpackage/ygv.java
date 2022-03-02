package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ygv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ygv {
    public static void a(Map map, Object obj, Object obj2) {
        List list = (List) map.get(obj);
        if (list == null) {
            list = new ArrayList();
            map.put(obj, list);
        }
        list.add(obj2);
    }
}
