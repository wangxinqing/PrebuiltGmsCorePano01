package defpackage;

/* renamed from: qll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qll extends qli {
    public final String a;
    public final int b;
    public final int c;
    public final qlo d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;

    public qll(String str, int i, int i2, qlo qlo, boolean z, String str2, String str3, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = qlo;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = z2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final qlo d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r1 = r4.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r1 = r4.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0071
            boolean r1 = r5 instanceof defpackage.qli
            r2 = 0
            if (r1 == 0) goto L_0x0070
            qli r5 = (defpackage.qli) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            int r1 = r4.b
            int r3 = r5.b()
            if (r1 != r3) goto L_0x006f
            int r1 = r4.c
            int r3 = r5.c()
            if (r1 != r3) goto L_0x006f
            qlo r1 = r4.d
            qlo r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            boolean r1 = r4.e
            boolean r3 = r5.e()
            if (r1 != r3) goto L_0x006f
            java.lang.String r1 = r4.f
            if (r1 == 0) goto L_0x0049
            java.lang.String r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
        L_0x0048:
            goto L_0x0050
        L_0x0049:
            java.lang.String r1 = r5.f()
            if (r1 != 0) goto L_0x006f
            goto L_0x0048
        L_0x0050:
            java.lang.String r1 = r4.g
            if (r1 == 0) goto L_0x005f
            java.lang.String r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0065
            goto L_0x0066
        L_0x005f:
            java.lang.String r1 = r5.g()
            if (r1 == 0) goto L_0x0066
        L_0x0065:
            goto L_0x006f
        L_0x0066:
            boolean r1 = r4.h
            boolean r5 = r5.h()
            if (r1 != r5) goto L_0x006f
            return r0
        L_0x006f:
            return r2
        L_0x0070:
            return r2
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qll.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i3 = 1237;
        if (!this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (hashCode ^ i) * 1000003;
        String str = this.f;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 ^ i2) * 1000003;
        String str2 = this.g;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int i7 = (i6 ^ i5) * 1000003;
        if (this.h) {
            i3 = 1231;
        }
        return i7 ^ i3;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.d);
        boolean z = this.e;
        String str2 = this.f;
        String str3 = this.g;
        boolean z2 = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 162 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("AppInfoRequest{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", derivedId=");
        sb.append(i2);
        sb.append(", eventLog=");
        sb.append(valueOf);
        sb.append(", populateRoutes=");
        sb.append(z);
        sb.append(", splitName=");
        sb.append(str2);
        sb.append(", activityName=");
        sb.append(str3);
        sb.append(", addSyntheticRoutes=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
