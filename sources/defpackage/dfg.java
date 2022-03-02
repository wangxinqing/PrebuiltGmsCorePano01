package defpackage;

/* renamed from: dfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dfg extends dga {
    public final aqsr a;
    public final aqsr b;
    public final aqsr c;
    public final aqro d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public dfg(int i, aqsr aqsr, aqsr aqsr2, aqsr aqsr3, aqro aqro, boolean z, boolean z2) {
        if (i != 0) {
            this.g = i;
            this.a = aqsr;
            this.b = aqsr2;
            this.c = aqsr3;
            this.d = aqro;
            this.e = z;
            this.f = z2;
            return;
        }
        throw new NullPointerException("Null getHeaderType");
    }

    public final aqsr a() {
        return this.a;
    }

    public final aqsr b() {
        return this.b;
    }

    public final aqsr c() {
        return this.c;
    }

    public final aqro d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r1 = r4.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r1 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x007d
            boolean r1 = r5 instanceof defpackage.dga
            r2 = 0
            if (r1 == 0) goto L_0x007c
            dga r5 = (defpackage.dga) r5
            int r1 = r4.g
            int r3 = r5.g()
            if (r1 != r3) goto L_0x007b
            aqsr r1 = r4.a
            if (r1 == 0) goto L_0x0021
            aqsr r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
        L_0x0020:
            goto L_0x0028
        L_0x0021:
            aqsr r1 = r5.a()
            if (r1 != 0) goto L_0x007b
            goto L_0x0020
        L_0x0028:
            aqsr r1 = r4.b
            if (r1 == 0) goto L_0x0037
            aqsr r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
        L_0x0036:
            goto L_0x003e
        L_0x0037:
            aqsr r1 = r5.b()
            if (r1 != 0) goto L_0x007b
            goto L_0x0036
        L_0x003e:
            aqsr r1 = r4.c
            if (r1 == 0) goto L_0x004d
            aqsr r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007b
        L_0x004c:
            goto L_0x0054
        L_0x004d:
            aqsr r1 = r5.c()
            if (r1 != 0) goto L_0x007b
            goto L_0x004c
        L_0x0054:
            aqro r1 = r4.d
            if (r1 == 0) goto L_0x0063
            aqro r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0063:
            aqro r1 = r5.d()
            if (r1 == 0) goto L_0x006a
        L_0x0069:
            goto L_0x007b
        L_0x006a:
            boolean r1 = r4.e
            boolean r3 = r5.e()
            if (r1 != r3) goto L_0x007b
            boolean r1 = r4.f
            boolean r5 = r5.f()
            if (r1 != r5) goto L_0x007b
            return r0
        L_0x007b:
            return r2
        L_0x007c:
            return r2
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfg.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (this.g ^ 1000003) * 1000003;
        aqsr aqsr = this.a;
        int i5 = 0;
        if (aqsr != null) {
            i = aqsr.S;
            if (i == 0) {
                i = aueh.a.a((Object) aqsr).a(aqsr);
                aqsr.S = i;
            }
        } else {
            i = 0;
        }
        int i6 = (i4 ^ i) * 1000003;
        aqsr aqsr2 = this.b;
        if (aqsr2 != null) {
            i2 = aqsr2.S;
            if (i2 == 0) {
                i2 = aueh.a.a((Object) aqsr2).a(aqsr2);
                aqsr2.S = i2;
            }
        } else {
            i2 = 0;
        }
        int i7 = (i6 ^ i2) * 1000003;
        aqsr aqsr3 = this.c;
        if (aqsr3 != null) {
            i3 = aqsr3.S;
            if (i3 == 0) {
                i3 = aueh.a.a((Object) aqsr3).a(aqsr3);
                aqsr3.S = i3;
            }
        } else {
            i3 = 0;
        }
        int i8 = (i7 ^ i3) * 1000003;
        aqro aqro = this.d;
        if (aqro != null && (i5 = aqro.S) == 0) {
            i5 = aueh.a.a((Object) aqro).a(aqro);
            aqro.S = i5;
        }
        int i9 = (i8 ^ i5) * 1000003;
        int i10 = 1237;
        int i11 = (i9 ^ (!this.e ? 1237 : 1231)) * 1000003;
        if (this.f) {
            i10 = 1231;
        }
        return i11 ^ i10;
    }

    public final String toString() {
        int i = this.g;
        String str = i != 1 ? i != 2 ? "PLACEHOLDER" : "SIMPLE" : "WELCOME";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 160 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("HeaderFrameBlueprint{getHeaderType=");
        sb.append(str);
        sb.append(", getWelcomeHeaderKey=");
        sb.append(valueOf);
        sb.append(", getOverflowMenuKey=");
        sb.append(valueOf2);
        sb.append(", getHelpItemTarget=");
        sb.append(valueOf3);
        sb.append(", getLeafScreenHeader=");
        sb.append(valueOf4);
        sb.append(", hasCloseButton=");
        sb.append(z);
        sb.append(", hasTopNav=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
