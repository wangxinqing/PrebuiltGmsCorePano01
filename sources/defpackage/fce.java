package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fce {
    public final Runnable a;
    public final of b;
    public Object c;
    private final Object d;
    private final anaf e;
    private final hol f;
    private final String g;
    private final jhz h;
    private final Executor i = new jls((Handler) new qvr(Looper.getMainLooper()));
    private boolean j;
    private long k;
    private aosh l;

    public fce(Object obj, Map map, Runnable runnable, of ofVar, hol hol, String str, jhz jhz) {
        amrl.a(obj);
        this.d = obj;
        amrl.a((Object) map);
        this.e = anaf.a(map);
        amrl.a((Object) runnable);
        this.a = runnable;
        amrl.a((Object) ofVar);
        this.b = ofVar;
        amrl.a((Object) hol);
        this.f = hol;
        amrl.a((Object) str);
        this.g = str;
        amrl.a((Object) jhz);
        this.h = jhz;
    }

    public static fcd a() {
        return new fcd();
    }

    public static final aorr b(Object obj) {
        return aorl.a((Object) amri.b(obj));
    }

    public final void c() {
        boolean z;
        if (this.l != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "There flow has been resumed, or the current step cannot be resumed since it's not a step that waits for other events to happen (see #createWaitingNextStep() for details).");
        this.l.b((Object) null);
        this.l = null;
    }

    public final void d() {
        boolean z;
        if (this.l != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "The flow has been aborted, or the current step cannot be aborted since it's not a step that waits for other events to happen (see #createWaitingNextStep() for details).");
        a(this.c, false);
        this.l = null;
    }

    public final void e() {
        if (this.e.containsKey(this.c)) {
            this.k = System.currentTimeMillis();
            aorl.a((aorr) ((ow) this.e.get(this.c)).a(), new fcc(this), this.i);
            return;
        }
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unrecognized step: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final void b() {
        if (!this.j) {
            this.j = true;
            this.c = this.d;
            e();
        }
    }

    public final aorr a(Object obj) {
        aosh f2 = aosh.f();
        this.l = f2;
        return qay.a((aorr) f2, (Object) amri.b(obj));
    }

    public final void a(Object obj, boolean z) {
        aucd o = antk.i.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antk antk = (antk) o.b;
        antk.a |= 128;
        antk.h = z;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        if (o.c) {
            o.c();
            o.c = false;
        }
        antk antk2 = (antk) o.b;
        antk2.a |= 64;
        antk2.g = elapsedRealtime;
        this.h.a(o, obj);
        aucd o2 = anty.n.o();
        String str = this.g;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anty anty = (anty) o2.b;
        str.getClass();
        int i2 = anty.a | 2;
        anty.a = i2;
        anty.c = str;
        anty.b = 5;
        anty.a = i2 | 1;
        antk antk3 = (antk) o.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anty anty2 = (anty) o2.b;
        antk3.getClass();
        anty2.g = antk3;
        anty2.a |= 32;
        this.f.a((audx) (anty) o2.i()).b();
    }
}
