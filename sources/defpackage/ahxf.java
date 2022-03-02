package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: ahxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahxf extends ahvl {
    final /* synthetic */ ahxg a;

    public ahxf(ahxg ahxg) {
        this.a = ahxg;
    }

    public final void a(aqek aqek) {
        if (this.a.a()) {
            long c = this.a.c.c() - this.a.n;
            if (1000 + c >= 10000 && aqek != null && aqek.j(4) > 0) {
                ahxi ahxi = this.a.o;
                ahxi.c.f().submit(new ahxh(ahxi, Calendar.getInstance(), aqek));
            } else {
                Locale locale = Locale.ENGLISH;
                new Object[1][0] = Long.valueOf(c);
            }
            this.a.f(true);
        }
    }

    public final void a(String str) {
        this.a.f(true);
    }
}
