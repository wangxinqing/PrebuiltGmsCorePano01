package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: aqag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqag extends azxl {
    public final Queue a = new ArrayDeque();
    public azxl b = null;
    public azxk c;
    public boolean d = false;
    private final aorr e;
    private final Executor f = aosd.a((Executor) aoqm.a);

    public aqag(aorr aorr) {
        this.e = aorr;
    }

    private final void a(Runnable runnable) {
        this.f.execute(new aqae(this, runnable));
    }

    public final void b() {
        a((Runnable) new aqac(this));
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void a(int i) {
        a((Runnable) new aqaa(this, i));
    }

    public final void a(azxk azxk, baaf baaf) {
        this.c = azxk;
        aorl.a(this.e, new aqaf(this, azxk), this.f);
        a((Runnable) new apzz(this, azxk, baaf));
    }

    public final void a(Object obj) {
        a((Runnable) new aqad(this, obj));
    }

    public final void a(String str, Throwable th) {
        a((Runnable) new aqab(this, str, th));
    }
}
