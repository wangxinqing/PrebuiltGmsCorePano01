package defpackage;

import java.lang.ref.ReferenceQueue;

/* renamed from: aned  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aned extends andf implements anef {
    public volatile aneg c = anej.g;

    public aned(ReferenceQueue referenceQueue, Object obj, int i, aned aned) {
        super(referenceQueue, obj, i, aned);
    }

    public final Object d() {
        return this.c.get();
    }

    public final aneg e() {
        return this.c;
    }
}
