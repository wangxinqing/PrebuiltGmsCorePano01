package defpackage;

import java.util.Map;

/* renamed from: akqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqv implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ akra b;

    public akqv(akra akra, Map map) {
        this.b = akra;
        this.a = map;
    }

    public final void run() {
        akra akra = this.b;
        Map map = this.a;
        if (akra.h != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l2data points");
            sb.toString();
            int a2 = akra.h.a(map, false, false);
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("L2 disk size: ");
            sb2.append(a2);
            sb2.append(" entries");
            sb2.toString();
            if (((long) a2) > azbk.a.a().f()) {
                akra.a(3);
            }
        }
    }
}
