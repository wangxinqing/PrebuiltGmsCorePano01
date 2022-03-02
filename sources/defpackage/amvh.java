package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: amvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvh extends amus {
    final int b;

    public amvh(ReferenceQueue referenceQueue, Object obj, amvp amvp, int i) {
        super(referenceQueue, obj, amvp);
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final amva a(ReferenceQueue referenceQueue, Object obj, amvp amvp) {
        return new amvh(referenceQueue, obj, amvp, this.b);
    }
}
