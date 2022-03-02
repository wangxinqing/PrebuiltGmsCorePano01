package defpackage;

import java.util.Map;

/* renamed from: akku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akku implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aklb c;

    public akku(aklb aklb, Map map, boolean z) {
        this.c = aklb;
        this.a = map;
        this.b = z;
    }

    public final void run() {
        aklb aklb = this.c;
        Map map = this.a;
        boolean z = this.b;
        if (aklb.a != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l1data points");
            sb.toString();
            int a2 = aklb.a.a(map, z);
            aklz.a();
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("L1 disk size: ");
            sb2.append(a2);
            sb2.append(" entries");
            sb2.toString();
            if (a2 > ((int) azcf.a.a().o())) {
                aklz.a();
                aklb.a(2);
            }
        }
    }
}
