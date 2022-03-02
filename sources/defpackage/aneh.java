package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: aneh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aneh extends WeakReference implements aneg {
    final andk a;

    public aneh(ReferenceQueue referenceQueue, Object obj, andk andk) {
        super(obj, referenceQueue);
        this.a = andk;
    }

    public final andk a() {
        return this.a;
    }

    public final aneg a(ReferenceQueue referenceQueue, andk andk) {
        return new aneh(referenceQueue, get(), andk);
    }
}
