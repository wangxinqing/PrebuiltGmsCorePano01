package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kep {
    final /* synthetic */ String a;
    final /* synthetic */ keq b;

    public kep(keq keq, String str) {
        this.b = keq;
        this.a = str;
    }

    public final void a(lds lds) {
        List<ket> list;
        List list2 = lds.b;
        kes kes = this.b.c;
        String str = this.a;
        List arrayList = lds.a ? new ArrayList(list2) : amzy.h();
        synchronized (kes) {
            iva.a(kes.b.containsKey(str));
            if (!arrayList.isEmpty()) {
                kes.a.put(str, new ker(arrayList, SystemClock.elapsedRealtime()));
            }
            list = (List) kes.b.get(str);
            kes.b.remove(str);
        }
        for (ket a2 : list) {
            a2.a(arrayList, true);
        }
        this.b.d.a.l.a(this.a, list2.isEmpty());
    }
}
