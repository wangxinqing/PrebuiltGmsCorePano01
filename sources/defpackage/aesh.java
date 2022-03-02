package defpackage;

/* renamed from: aesh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aesh extends aesl {
    private final int a;
    private final aeso b;
    private final aeso c;
    private final aeso d;
    private final aeso e;
    private final Integer f;
    private final boolean g;
    private final boolean h;

    public aesh(int i, aeso aeso, aeso aeso2, aeso aeso3, aeso aeso4, Integer num, boolean z, boolean z2) {
        this.a = i;
        this.b = aeso;
        this.c = aeso2;
        this.d = aeso3;
        this.e = aeso4;
        this.f = num;
        this.g = z;
        this.h = z2;
    }

    public final int a() {
        return this.a;
    }

    public final aeso b() {
        return this.b;
    }

    public final aeso c() {
        return this.c;
    }

    public final aeso d() {
        return this.d;
    }

    public final aeso e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r1 = r4.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x006a
            boolean r1 = r5 instanceof defpackage.aesl
            r2 = 0
            if (r1 == 0) goto L_0x0069
            aesl r5 = (defpackage.aesl) r5
            int r1 = r4.a
            int r3 = r5.a()
            if (r1 != r3) goto L_0x0069
            aeso r1 = r4.b
            aeso r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            aeso r1 = r4.c
            aeso r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            aeso r1 = r4.d
            aeso r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            aeso r1 = r4.e
            aeso r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            java.lang.Integer r1 = r4.f
            if (r1 == 0) goto L_0x0051
            java.lang.Integer r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0051:
            java.lang.Integer r1 = r5.f()
            if (r1 == 0) goto L_0x0058
        L_0x0057:
            goto L_0x0069
        L_0x0058:
            boolean r1 = r4.g
            boolean r3 = r5.g()
            if (r1 != r3) goto L_0x0069
            boolean r1 = r4.h
            boolean r5 = r5.h()
            if (r1 != r5) goto L_0x0069
            return r0
        L_0x0069:
            return r2
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesh.equals(java.lang.Object):boolean");
    }

    public final Integer f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        Integer num = this.f;
        int i = 1237;
        int hashCode2 = (((hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003;
        if (this.h) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        boolean z = this.g;
        boolean z2 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 188 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("CoreSyncPolicy{syncType=");
        sb.append(i);
        sb.append(", upSyncPolicy=");
        sb.append(valueOf);
        sb.append(", upSyncWithListenerPolicy=");
        sb.append(valueOf2);
        sb.append(", downSyncPolicy=");
        sb.append(valueOf3);
        sb.append(", downSyncWithListenerPolicy=");
        sb.append(valueOf4);
        sb.append(", pushPolicyId=");
        sb.append(valueOf5);
        sb.append(", requiresCharging=");
        sb.append(z);
        sb.append(", requiresUnmetered=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
