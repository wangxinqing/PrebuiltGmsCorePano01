package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* renamed from: amus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amus extends SoftReference implements amva {
    final amvp a;

    public amus(ReferenceQueue referenceQueue, Object obj, amvp amvp) {
        super(obj, referenceQueue);
        this.a = amvp;
    }

    public int a() {
        return 1;
    }

    public final void a(Object obj) {
    }

    public final amvp b() {
        return this.a;
    }

    public final boolean c() {
        return false;
    }

    public final boolean d() {
        return true;
    }

    public final Object e() {
        return get();
    }

    public amva a(ReferenceQueue referenceQueue, Object obj, amvp amvp) {
        return new amus(referenceQueue, obj, amvp);
    }
}
