package defpackage;

import android.os.Looper;

/* renamed from: gun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gun {
    public static volatile gun a;
    private final ou b = new ou();

    public final synchronized int a() {
        return this.b.h;
    }

    public final synchronized guo a(int i) {
        return (guo) this.b.d(i);
    }

    public final synchronized guo a(ige ige, gth gth) {
        guo guo;
        guo = (guo) this.b.get(gth);
        if (guo == null) {
            guo = new guo(ige);
            this.b.put(gth, guo);
        }
        return guo;
    }

    public final synchronized ige a(gth gth, String str) {
        guo guo;
        guo = (guo) this.b.get(gth);
        return guo == null ? igf.a(gth, Looper.getMainLooper(), str) : guo.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ige a(icc icc, gth gth) {
        guo guo = (guo) this.b.get(gth);
        if (guo != null) {
            return guo.a;
        }
        return icc.a((Object) gth);
    }

    public final synchronized void a(gth gth) {
        guo guo = (guo) this.b.remove(gth);
        if (guo != null) {
            guo.a.a();
        }
    }
}
