package defpackage;

/* renamed from: alqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqs extends Exception {
    public final int a;
    public final String b;
    private final Throwable c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public alqs(java.io.IOException r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0022
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 23
            r2.<init>(r1)
            java.lang.String r1 = "HTTP connection error: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0035
        L_0x0022:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 62
            r0.<init>(r1)
            java.lang.String r1 = "HTTP connection error: server returned HTTP error: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x0035:
            r3.<init>(r0, r4)
            r3.c = r4
            r3.a = r5
            r3.b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqs.<init>(java.io.IOException, int, java.lang.String):void");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int i = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("HttpChannelException [cause=");
        sb.append(valueOf);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
