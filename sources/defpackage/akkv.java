package defpackage;

import java.util.Map;

/* renamed from: akkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akkv implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aklb c;

    public akkv(aklb aklb, Map map, boolean z) {
        this.c = aklb;
        this.a = map;
        this.b = z;
    }

    public final void run() {
        aklb aklb = this.c;
        Map map = this.a;
        boolean z = this.b;
        if (aklb.b != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(32);
            sb.append("adding ");
            sb.append(size);
            sb.append(" l2data points");
            sb.toString();
            aklb.b(aklb.b.a(map, z));
        }
    }
}
