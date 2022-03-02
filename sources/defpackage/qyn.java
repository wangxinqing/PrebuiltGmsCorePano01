package defpackage;

/* renamed from: qyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qyn extends rav {
    public final String a;
    public final String b;
    private final String c;
    private final amsv d;

    public qyn(String str, String str2, String str3, amsv amsv) {
        this.c = str;
        if (str2 != null) {
            this.a = str2;
            if (str3 != null) {
                this.b = str3;
                this.d = amsv;
                return;
            }
            throw new NullPointerException("Null oneoffTaskTag");
        }
        throw new NullPointerException("Null periodicTaskTag");
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final amsv d() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r1 = r4.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0046
            boolean r1 = r5 instanceof defpackage.rav
            r2 = 0
            if (r1 == 0) goto L_0x0045
            rav r5 = (defpackage.rav) r5
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            amsv r1 = r4.d
            if (r1 == 0) goto L_0x003d
            amsv r5 = r5.d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x003d:
            amsv r5 = r5.d()
            if (r5 == 0) goto L_0x0044
        L_0x0043:
            goto L_0x0045
        L_0x0044:
            return r0
        L_0x0045:
            return r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        amsv amsv = this.d;
        return hashCode ^ (amsv != null ? amsv.hashCode() : 0);
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String str3 = this.b;
        String valueOf = String.valueOf(this.d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 75 + length2 + str3.length() + String.valueOf(valueOf).length());
        sb.append("TaskConfig{serviceName=");
        sb.append(str);
        sb.append(", periodicTaskTag=");
        sb.append(str2);
        sb.append(", oneoffTaskTag=");
        sb.append(str3);
        sb.append(", policySupplier=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
