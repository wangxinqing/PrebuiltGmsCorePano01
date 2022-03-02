package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahgg implements ahdg {
    private static final Random b = new Random();
    public final aorr a;
    private final hol c;
    private final Executor d;
    private final amsv e;
    private final amsv f;
    private final amsv g;

    public ahgg(ahgf ahgf) {
        this.c = ahgf.a;
        this.d = aosd.a(ahgf.b);
        this.a = ahgf.c;
        this.e = ahgf.d;
        this.f = ahgf.e;
        this.g = ahgf.f;
    }

    public static ahgf a(Context context) {
        return new ahgf(new hol(context, "ICING", (String) null));
    }

    private final void c(aorr aorr) {
        aorl.c(this.a, aorr).a((Callable) new ahge(this, aorr), this.d);
    }

    public final void b(aorr aorr) {
        c(aorr);
    }

    private static Object a(amsv amsv, Object obj) {
        Object a2 = amsv.a();
        return a2 != null ? a2 : obj;
    }

    private static boolean a(int i) {
        return i > 0 && b.nextInt(i) == 0;
    }

    public final void a(int i, long j, TimeUnit timeUnit) {
        int intValue = ((Integer) a(this.e, (Object) 0)).intValue();
        if (a(intValue)) {
            this.d.execute(new ahgb(this, i, j, timeUnit, intValue));
        }
    }

    public final void a(int i, Set set, int i2, int i3) {
        int intValue = ((Integer) a(this.g, (Object) 0)).intValue();
        if (a(intValue)) {
            this.d.execute(new ahgd(this, i, set, i2, i3, intValue));
        }
    }

    public final void a(int i, Set set, long j, TimeUnit timeUnit) {
        int intValue = ((Integer) a(this.f, (Object) 0)).intValue();
        if (a(intValue)) {
            this.d.execute(new ahgc(this, i, set, j, timeUnit, intValue));
        }
    }

    public final void a(aokx aokx, int i) {
        aucd o = aoji.R.o();
        long j = (long) i;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoji aoji = (aoji) o.b;
        aoji.a |= 524288;
        aoji.s = j;
        aokx.getClass();
        aoji.M = aokx;
        aoji.b |= 262144;
        hoi a2 = this.c.a(((aoji) o.i()).k());
        a2.b(aolk.a(17002));
        a2.b();
    }

    public final void a(aorr aorr) {
        c(aorr);
    }
}
