package defpackage;

/* renamed from: utp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class utp extends uvv {
    private final String a;
    private final umn b;

    public utp(umn umn, String str) {
        this.b = umn;
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final umn b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x002e
            boolean r1 = r5 instanceof defpackage.uvv
            r2 = 0
            if (r1 == 0) goto L_0x002d
            uvv r5 = (defpackage.uvv) r5
            umn r1 = r4.b
            umn r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r4.a
            if (r1 == 0) goto L_0x0025
            java.lang.String r5 = r5.a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            java.lang.String r5 = r5.a()
            if (r5 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.a;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(str).length());
        sb.append("AcceptingConnectionsInfo{incomingConnectionCallback=");
        sb.append(valueOf);
        sb.append(", password=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
