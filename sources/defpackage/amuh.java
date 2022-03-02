package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: amuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amuh extends amtu {
    final /* synthetic */ amvo b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amuh(amvo amvo, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.b = amvo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (java.util.Map.Entry) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            if (r0 == 0) goto L_0x0025
            amvo r2 = r3.b
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0025
            amvo r2 = r3.b
            amqw r2 = r2.g
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r2.b(r4, r0)
            if (r4 == 0) goto L_0x0025
            r4 = 1
            return r4
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amuh.contains(java.lang.Object):boolean");
    }

    public final Iterator iterator() {
        return new amug(this.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (java.util.Map.Entry) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            if (r0 == 0) goto L_0x001b
            amvo r2 = r3.b
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r2.remove(r0, r4)
            if (r4 == 0) goto L_0x001b
            r4 = 1
            return r4
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amuh.remove(java.lang.Object):boolean");
    }
}
