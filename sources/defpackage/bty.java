package defpackage;

/* renamed from: bty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bty {
    public final cas a;
    public boolean b = true;
    public final aucd c = atoj.e.o();
    public final aucd d;

    public bty(cas cas, long j) {
        iva.a((Object) cas);
        if (!cas.b.a().isEmpty()) {
            aucd aucd = this.c;
            String a2 = cas.b.a();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            atoj atoj = (atoj) aucd.b;
            a2.getClass();
            atoj.a |= 1;
            atoj.b = a2;
        }
        if (!cas.b.b().isEmpty()) {
            aucd aucd2 = this.c;
            String b2 = cas.b.b();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            atoj atoj2 = (atoj) aucd2.b;
            b2.getClass();
            atoj2.a |= 2;
            atoj2.c = b2;
        }
        aucd o = atos.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atos atos = (atos) o.b;
        int i = 1 | atos.a;
        atos.a = i;
        atos.b = j;
        atos.a = i | 2;
        atos.c = Long.MAX_VALUE;
        this.d = o;
        this.a = cas;
    }

    public final boolean a(long j) {
        if (!this.b) {
            ((anih) ((anih) bxk.a.b()).a("bty", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AppIntervalImpl] closeInterval: ongoing");
            return false;
        }
        aucd aucd = this.d;
        if (j > ((atos) aucd.b).b) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            atos atos = (atos) aucd.b;
            atos atos2 = atos.d;
            atos.a |= 2;
            atos.c = j;
            this.b = false;
            return true;
        }
        ((anih) ((anih) bxk.a.b()).a("bty", "a", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AppIntervalImpl] closeInterval: stopTimeMillis invalid, stop=%s, start=%s", j, ((atos) this.d.b).b);
        return false;
    }
}
