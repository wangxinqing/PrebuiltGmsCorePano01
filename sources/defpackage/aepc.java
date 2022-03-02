package defpackage;

/* renamed from: aepc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepc extends aepj {
    public final int a;
    public final aepm b;
    public final aepm c;
    public final aepm d;
    public final aepm e;
    public final Integer f;
    public final boolean g;
    public final boolean h;

    public aepc(int i, aepm aepm, aepm aepm2, aepm aepm3, aepm aepm4, Integer num, boolean z, boolean z2) {
        this.a = i;
        if (aepm != null) {
            this.b = aepm;
            if (aepm2 != null) {
                this.c = aepm2;
                if (aepm3 != null) {
                    this.d = aepm3;
                    if (aepm4 != null) {
                        this.e = aepm4;
                        this.f = num;
                        this.g = z;
                        this.h = z2;
                        return;
                    }
                    throw new NullPointerException("Null downSyncWithListenerPolicy");
                }
                throw new NullPointerException("Null downSyncPolicy");
            }
            throw new NullPointerException("Null upSyncWithListenerPolicy");
        }
        throw new NullPointerException("Null upSyncPolicy");
    }

    public final int a() {
        return this.a;
    }

    public final aepm b() {
        return this.b;
    }

    public final aepm c() {
        return this.c;
    }

    public final aepm d() {
        return this.d;
    }

    public final aepm e() {
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
            boolean r1 = r5 instanceof defpackage.aepj
            r2 = 0
            if (r1 == 0) goto L_0x0069
            aepj r5 = (defpackage.aepj) r5
            int r1 = r4.a
            int r3 = r5.a()
            if (r1 != r3) goto L_0x0069
            aepm r1 = r4.b
            aepm r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            aepm r1 = r4.c
            aepm r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            aepm r1 = r4.d
            aepm r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            aepm r1 = r4.e
            aepm r3 = r5.e()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepc.equals(java.lang.Object):boolean");
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
        StringBuilder sb = new StringBuilder(length + 183 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("SyncPolicy{syncType=");
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
        sb.append(", requiresPlugged=");
        sb.append(z);
        sb.append(", requiresUnmetered=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
