package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ver  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ver {
    public final Map a = new nz();

    public static ver a(List list) {
        ver ver = new ver();
        for (int i = 0; i < list.size(); i++) {
            avaf avaf = (avaf) list.get(i);
            String uuid = UUID.randomUUID().toString();
            ver.a.put(uuid, avaf.b);
            aucd aucd = (aucd) avaf.c(5);
            aucd.a((aucj) avaf);
            aucf aucf = (aucf) aucd;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avaf avaf2 = (avaf) aucf.b;
            avaf avaf3 = avaf.i;
            uuid.getClass();
            avaf2.a |= 1;
            avaf2.b = uuid;
            list.set(i, (avaf) aucf.i());
        }
        return ver;
    }

    public final void b(List list) {
        if (!this.a.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                avaf avaf = (avaf) it.next();
                String str = (String) this.a.get(avaf.b);
                if (str != null) {
                    int i2 = i + 1;
                    aucd aucd = (aucd) avaf.c(5);
                    aucd.a((aucj) avaf);
                    aucf aucf = (aucf) aucd;
                    if (aucf.c) {
                        aucf.c();
                        aucf.c = false;
                    }
                    avaf avaf2 = (avaf) aucf.b;
                    avaf avaf3 = avaf.i;
                    str.getClass();
                    avaf2.a |= 1;
                    avaf2.b = str;
                    list.set(i, (avaf) aucf.i());
                    i = i2;
                }
            }
        }
    }
}
