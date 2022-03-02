package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: andf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class andf extends WeakReference implements andk {
    final int a;
    final andk b;

    public andf(ReferenceQueue referenceQueue, Object obj, int i, andk andk) {
        super(obj, referenceQueue);
        this.a = i;
        this.b = andk;
    }

    public final Object a() {
        return get();
    }

    public final int b() {
        return this.a;
    }

    public final andk c() {
        return this.b;
    }
}
