package defpackage;

import java.util.Date;

/* renamed from: lek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lek extends lec {
    private final koa a;
    private final lfa b;
    private String c;

    public lek(koa koa, lfa lfa) {
        super(lfa);
        iva.a((Object) koa);
        this.a = koa;
        iva.a((Object) lfa);
        this.b = lfa;
    }

    public final void a(krk krk) {
        Long l;
        iva.a(krk.b());
        Date a2 = this.b.a();
        koa koa = this.a;
        String str = this.c;
        if (str != null) {
            l = Long.valueOf(a2.getTime());
        } else {
            l = null;
        }
        koa.a(str, l);
        krk.a.a((kqi) this.a);
        super.a(krk);
    }

    public final void a(krk krk, lno lno) {
        super.a(krk, lno);
        this.c = lno.b;
    }
}
