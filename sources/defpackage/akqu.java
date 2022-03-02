package defpackage;

import java.util.Map;

/* renamed from: akqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqu implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ akra b;

    public akqu(akra akra, Map map) {
        this.b = akra;
        this.a = map;
    }

    public final void run() {
        akra akra = this.b;
        Map map = this.a;
        if (akra.g != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l1data points");
            sb.toString();
            int a2 = akra.g.a(map, false, false);
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("L1 disk size: ");
            sb2.append(a2);
            sb2.append(" entries");
            sb2.toString();
            if (((long) a2) > azbk.a.a().d()) {
                akra.a(2);
            }
        }
    }
}
