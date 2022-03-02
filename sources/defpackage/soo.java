package defpackage;

import java.util.Map;

/* renamed from: soo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class soo implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ sor c;

    public soo(sor sor, String str, long j) {
        this.c = sor;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        sor sor = this.c;
        String str = this.a;
        long j = this.b;
        sor.i();
        sor.h();
        iva.c(str);
        if (sor.b.isEmpty()) {
            sor.c = j;
        }
        Integer num = (Integer) sor.b.get(str);
        if (num != null) {
            sor.b.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        Map map = sor.b;
        if (((ou) map).h < 100) {
            map.put(str, 1);
            sor.a.put(str, Long.valueOf(j));
            return;
        }
        sor.E().f.a("Too many ads visible");
    }
}
