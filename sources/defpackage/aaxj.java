package defpackage;

/* renamed from: aaxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaxj extends aayn {
    private final boolean a;
    private final boolean b;
    private final long c;
    private final int d;
    private final boolean e;
    private final String f;
    private final long g;

    public aaxj(boolean z, boolean z2, long j, int i, boolean z3, String str, long j2) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = i;
        this.e = z3;
        this.f = str;
        this.g = j2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = r7.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x0056
            boolean r1 = r8 instanceof defpackage.aayn
            r2 = 0
            if (r1 == 0) goto L_0x0055
            aayn r8 = (defpackage.aayn) r8
            boolean r1 = r7.a
            boolean r3 = r8.a()
            if (r1 != r3) goto L_0x0055
            boolean r1 = r7.b
            boolean r3 = r8.b()
            if (r1 != r3) goto L_0x0055
            long r3 = r7.c
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0055
            int r1 = r7.d
            int r3 = r8.d()
            if (r1 != r3) goto L_0x0055
            boolean r1 = r7.e
            boolean r3 = r8.e()
            if (r1 != r3) goto L_0x0055
            java.lang.String r1 = r7.f
            if (r1 == 0) goto L_0x0043
            java.lang.String r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0043:
            java.lang.String r1 = r8.f()
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            goto L_0x0055
        L_0x004a:
            long r3 = r7.g
            long r5 = r8.g()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0055
            return r0
        L_0x0055:
            return r2
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxj.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        int i3 = !this.b ? 1237 : 1231;
        long j = this.c;
        int i4 = (((((i2 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d) * 1000003;
        if (this.e) {
            i = 1231;
        }
        int i5 = (i4 ^ i) * 1000003;
        String str = this.f;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.g;
        return ((i5 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        long j = this.c;
        int i = this.d;
        boolean z3 = this.e;
        String str = this.f;
        long j2 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 209);
        sb.append("SdCardAnalysisInfo{jpegMissing=");
        sb.append(z);
        sb.append(", jpegTampered=");
        sb.append(z2);
        sb.append(", jpegWrongLength=");
        sb.append(j);
        sb.append(", jpegTamperedBytes=");
        sb.append(i);
        sb.append(", jpegNewlyTampered=");
        sb.append(z3);
        sb.append(", jpegFileName=");
        sb.append(str);
        sb.append(", jpegModificationTime=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
