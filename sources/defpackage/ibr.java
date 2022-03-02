package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ibr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ibr extends Exception {
    @Deprecated
    public final Status a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ibr(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r0 = r5.i
            java.lang.String r1 = r5.j
            if (r1 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            java.lang.String r1 = ""
        L_0x0009:
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibr.<init>(com.google.android.gms.common.api.Status):void");
    }

    public final int a() {
        return this.a.i;
    }

    @Deprecated
    public final String b() {
        return this.a.j;
    }
}
