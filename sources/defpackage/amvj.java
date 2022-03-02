package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: amvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvj extends amvf {
    final int b;

    public amvj(ReferenceQueue referenceQueue, Object obj, amvp amvp, int i) {
        super(referenceQueue, obj, amvp);
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final amva a(ReferenceQueue referenceQueue, Object obj, amvp amvp) {
        return new amvj(referenceQueue, obj, amvp, this.b);
    }
}
