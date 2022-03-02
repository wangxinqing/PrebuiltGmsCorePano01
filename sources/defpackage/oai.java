package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: oai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oai extends LinkedHashMap {
    public final void a(Object obj, Object obj2) {
        List list = (List) get(obj);
        if (list == null) {
            list = new ArrayList();
            put(obj, list);
        }
        list.add(obj2);
    }
}
