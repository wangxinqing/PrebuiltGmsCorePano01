package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: azxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxa {
    public static final azxa b = new azxa(Collections.emptyMap());
    public final Map a;

    public azxa(Map map) {
        this.a = map;
    }

    public static azwy a() {
        return new azwy(b);
    }

    public final azwy b() {
        return new azwy(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 == r7) goto L_0x0059
            r1 = 0
            if (r7 == 0) goto L_0x0058
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 != r3) goto L_0x0058
            azxa r7 = (defpackage.azxa) r7
            java.util.Map r2 = r6.a
            int r2 = r2.size()
            java.util.Map r3 = r7.a
            int r3 = r3.size()
            if (r2 != r3) goto L_0x0058
            java.util.Map r2 = r6.a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map r4 = r7.a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r3.getValue()
            java.util.Map r5 = r7.a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = defpackage.amqx.a(r4, r3)
            if (r3 != 0) goto L_0x002a
        L_0x0056:
            return r1
        L_0x0057:
            return r0
        L_0x0058:
            return r1
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Object a(azwz azwz) {
        return this.a.get(azwz);
    }
}
