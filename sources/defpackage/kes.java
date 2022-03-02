package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kes {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    private final long c = ((Long) jzq.ax.c()).longValue();

    public final synchronized List a(String str) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (SystemClock.elapsedRealtime() - ((ker) entry.getValue()).b > this.c) {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.remove((String) arrayList.get(i));
        }
        return this.a.containsKey(str) ? ((ker) this.a.get(str)).a : Collections.emptyList();
    }

    public final synchronized boolean a(String str, ket ket) {
        boolean containsKey;
        List list;
        containsKey = this.b.containsKey(str);
        if (containsKey) {
            list = (List) this.b.get(str);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            list = arrayList;
        }
        if (ket != null) {
            list.add(ket);
        }
        return containsKey;
    }
}
