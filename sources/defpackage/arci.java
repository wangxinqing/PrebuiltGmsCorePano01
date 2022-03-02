package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;

/* renamed from: arci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arci {
    public final hol a;
    public final anzi b;
    public final Random c;
    public long d = SystemClock.elapsedRealtime();
    public final iby e;

    public arci(Context context, int i) {
        hol hol = new hol(context, "LE", (String) null);
        hol.a(avsd.UNMETERED_OR_DAILY);
        iby b2 = adrz.b(context);
        Random random = new Random();
        this.a = hol;
        this.e = b2;
        this.c = random;
        aucd o = anzi.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anzi anzi = (anzi) o.b;
        anzi.b = i - 1;
        anzi.a |= 1;
        this.b = (anzi) o.i();
    }

    public final boolean a() {
        return SystemClock.elapsedRealtime() - this.d > aycp.a.a().clearcutLogPeriodMs();
    }
}
