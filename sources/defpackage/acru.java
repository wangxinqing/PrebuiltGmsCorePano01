package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: acru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acru implements Runnable {
    final /* synthetic */ WeakReference a;

    public acru(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final void run() {
        acry acry = (acry) this.a.get();
        if (acry != null) {
            acrz acrz = acry.c;
            acrx acrx = acrz.n;
            synchronized (acrz.a) {
                if (acry.a) {
                    acrz acrz2 = acry.c;
                    if (!acrz2.d || acrz2.b == 1) {
                        acrz2.g = true;
                    }
                }
                acry.a();
            }
        }
    }
}
