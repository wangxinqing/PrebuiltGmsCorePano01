package defpackage;

/* renamed from: avzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avzp {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String e;

    private avzp(String str) {
        this.e = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.avzp a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -503070503: goto L_0x0029;
                case -503070502: goto L_0x001f;
                case 79201641: goto L_0x0015;
                case 79923350: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0061
            if (r0 == r3) goto L_0x005e
            if (r0 == r2) goto L_0x005b
            if (r0 == r1) goto L_0x0058
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Unexpected TLS version: "
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0050
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            goto L_0x0054
        L_0x0050:
            java.lang.String r4 = r1.concat(r4)
        L_0x0054:
            r0.<init>(r4)
            throw r0
        L_0x0058:
            avzp r4 = SSL_3_0
            return r4
        L_0x005b:
            avzp r4 = TLS_1_0
            return r4
        L_0x005e:
            avzp r4 = TLS_1_1
            return r4
        L_0x0061:
            avzp r4 = TLS_1_2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzp.a(java.lang.String):avzp");
    }
}
