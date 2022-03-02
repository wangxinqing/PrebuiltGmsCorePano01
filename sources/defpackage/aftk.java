package defpackage;

/* renamed from: aftk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aftk extends aftj {
    public final String a;
    public final String b;
    public final String c;

    public aftk(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r1 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0045
            boolean r1 = r5 instanceof defpackage.aftj
            r2 = 0
            if (r1 == 0) goto L_0x0044
            aftj r5 = (defpackage.aftj) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = r4.b
            if (r1 == 0) goto L_0x0025
            java.lang.String r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0043
        L_0x0024:
            goto L_0x002c
        L_0x0025:
            java.lang.String r1 = r5.b()
            if (r1 != 0) goto L_0x0043
            goto L_0x0024
        L_0x002c:
            java.lang.String r1 = r4.c
            if (r1 == 0) goto L_0x003b
            java.lang.String r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0041
            goto L_0x0042
        L_0x003b:
            java.lang.String r5 = r5.c()
            if (r5 == 0) goto L_0x0042
        L_0x0041:
            goto L_0x0043
        L_0x0042:
            return r0
        L_0x0043:
            return r2
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aftk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=");
        sb.append(str2);
        sb.append(", instanceId=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
