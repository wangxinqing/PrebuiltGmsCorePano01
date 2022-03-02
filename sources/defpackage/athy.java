package defpackage;

import java.io.InputStream;

/* renamed from: athy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athy implements athh {
    public athg a;
    public int b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=athg, code=java.io.InputStream, for r6v0, types: [athg] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public athy(java.lang.String r4, int r5, java.io.InputStream r6) {
        /*
            r3 = this;
            r3.<init>()
            if (r5 <= 0) goto L_0x0008
            r3.b = r5
            goto L_0x000b
        L_0x0008:
            r0 = 0
            r3.b = r0
        L_0x000b:
            if (r4 == 0) goto L_0x0070
            int r0 = r4.length()
        L_0x0011:
            if (r0 <= 0) goto L_0x005a
            int r0 = r0 + -1
            r1 = 44
            int r1 = r4.lastIndexOf(r1, r0)
            int r2 = r1 + 1
            int r0 = r0 + 1
            java.lang.String r0 = r4.substring(r2, r0)
            java.lang.String r2 = "g"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0033
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            r0.<init>(r6)
            r6 = r0
            r0 = r1
            goto L_0x0011
        L_0x0033:
            java.lang.String r2 = "n"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0058
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "unrecognised encoding: "
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0050
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L_0x0054
        L_0x0050:
            java.lang.String r5 = r6.concat(r5)
        L_0x0054:
            r4.<init>(r5)
            throw r4
        L_0x0058:
            r0 = r1
            goto L_0x0011
        L_0x005a:
            if (r5 <= 0) goto L_0x0066
            athg r4 = new athg
            int r5 = r3.b
            r4.<init>(r6, r5)
            r3.a = r4
            return
        L_0x0066:
            athg r4 = new athg
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4.<init>(r6, r5)
            r3.a = r4
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.athy.<init>(java.lang.String, int, athg):void");
    }

    public final int a() {
        throw null;
    }

    public final InputStream b() {
        throw null;
    }
}
