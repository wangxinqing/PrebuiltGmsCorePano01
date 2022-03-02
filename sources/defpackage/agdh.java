package defpackage;

/* renamed from: agdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agdh extends aghs {
    public final int a;
    private final aorv b;
    private final int c;
    private final int d;
    private final boolean e;
    private final aghp f;

    public agdh(aorv aorv, int i, int i2, int i3, aghp aghp, boolean z) {
        this.b = aorv;
        this.c = i;
        this.d = i2;
        this.a = i3;
        this.f = aghp;
        this.e = z;
    }

    public final aorv a() {
        return this.b;
    }

    public final aorv b() {
        return null;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r1 = r4.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0065
            boolean r1 = r5 instanceof defpackage.aghs
            r2 = 0
            if (r1 == 0) goto L_0x0064
            aghs r5 = (defpackage.aghs) r5
            aorv r1 = r4.b
            if (r1 == 0) goto L_0x0019
            aorv r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0063
        L_0x0018:
            goto L_0x0020
        L_0x0019:
            aorv r1 = r5.a()
            if (r1 != 0) goto L_0x0063
            goto L_0x0018
        L_0x0020:
            aorv r1 = r5.b()
            if (r1 != 0) goto L_0x0063
            int r1 = r4.c
            int r3 = r5.c()
            if (r1 != r3) goto L_0x0063
            int r1 = r4.d
            int r3 = r5.d()
            if (r1 != r3) goto L_0x0063
            int r1 = r4.a
            int r3 = r5.e()
            if (r1 != r3) goto L_0x0063
            aghp r1 = r4.f
            if (r1 == 0) goto L_0x004d
            aghp r3 = r5.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x004d:
            aghp r1 = r5.h()
            if (r1 == 0) goto L_0x0054
        L_0x0053:
            goto L_0x0063
        L_0x0054:
            aghq r1 = r5.f()
            if (r1 != 0) goto L_0x0063
            boolean r1 = r4.e
            boolean r5 = r5.g()
            if (r1 != r5) goto L_0x0063
            return r0
        L_0x0063:
            return r2
        L_0x0064:
            return r2
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdh.equals(java.lang.Object):boolean");
    }

    public final aghq f() {
        return null;
    }

    public final boolean g() {
        return this.e;
    }

    public final aghp h() {
        return this.f;
    }

    public final int hashCode() {
        int i;
        aorv aorv = this.b;
        int i2 = 0;
        if (aorv != null) {
            i = aorv.hashCode();
        } else {
            i = 0;
        }
        int i3 = (((((((i ^ 1000003) * -721379959) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.a) * 1000003;
        aghp aghp = this.f;
        if (aghp != null) {
            i2 = aghp.hashCode();
        }
        return ((i3 ^ i2) * -721379959) ^ (!this.e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf((Object) null);
        int i = this.c;
        int i2 = this.d;
        int i3 = this.a;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf((Object) null);
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 269 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PrimesThreadsConfigurations{primesExecutorService=");
        sb.append(valueOf);
        sb.append(", initExecutorService=");
        sb.append(valueOf2);
        sb.append(", primesInitializationPriority=");
        sb.append(i);
        sb.append(", primesMetricExecutorPriority=");
        sb.append(i2);
        sb.append(", primesMetricExecutorPoolSize=");
        sb.append(i3);
        sb.append(", initAfterResumed=");
        sb.append(valueOf3);
        sb.append(", activityResumedCallback=");
        sb.append(valueOf4);
        sb.append(", enableEarlyTimers=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
