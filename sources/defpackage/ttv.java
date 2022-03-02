package defpackage;

/* renamed from: ttv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ttv extends ttt {
    public final Throwable a;
    private final aspb b;
    private final long c;
    private final int d;
    private final int e;

    public ttv(aspb aspb, long j, Throwable th, int i, int i2) {
        this.b = aspb;
        this.c = j;
        this.a = th;
        this.d = i;
        this.e = i2;
    }

    public final aspb a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final Throwable c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r1 = r7.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x0048
            boolean r1 = r8 instanceof defpackage.ttt
            r2 = 0
            if (r1 == 0) goto L_0x0047
            ttt r8 = (defpackage.ttt) r8
            aspb r1 = r7.b
            aspb r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0047
            long r3 = r7.c
            long r5 = r8.b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            java.lang.Throwable r1 = r7.a
            if (r1 == 0) goto L_0x002f
            java.lang.Throwable r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0035
            goto L_0x0036
        L_0x002f:
            java.lang.Throwable r1 = r8.c()
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            goto L_0x0047
        L_0x0036:
            int r1 = r7.d
            int r3 = r8.d()
            if (r1 != r3) goto L_0x0047
            int r1 = r7.e
            int r8 = r8.e()
            if (r1 != r8) goto L_0x0047
            return r0
        L_0x0047:
            return r2
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        long j = this.c;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Throwable th = this.a;
        return ((((i ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        long j = this.c;
        String valueOf2 = String.valueOf(this.a);
        int i = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 149 + String.valueOf(valueOf2).length());
        sb.append("FastPairEvent{eventCode=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", throwable=");
        sb.append(valueOf2);
        sb.append(", numberAccountKeysOnProvider=");
        sb.append(i);
        sb.append(", numberDevicesOnFootprints=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
