package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: etq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class etq implements ibj, ibl {
    private final Bundle a;

    public etq(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == r6) goto L_0x0047
            boolean r1 = r7 instanceof defpackage.etq
            r2 = 0
            if (r1 == 0) goto L_0x0046
            etq r7 = (defpackage.etq) r7
            android.os.Bundle r1 = r6.a()
            android.os.Bundle r7 = r7.a()
            int r3 = r1.size()
            int r4 = r7.size()
            if (r3 != r4) goto L_0x0046
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0024:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r7.containsKey(r4)
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r1.get(r4)
            java.lang.Object r4 = r7.get(r4)
            boolean r4 = defpackage.ius.a(r5, r4)
            if (r4 != 0) goto L_0x0024
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Bundle a2 = a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(a2.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(a2.get(str));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
