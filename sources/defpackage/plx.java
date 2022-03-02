package defpackage;

/* renamed from: plx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class plx extends pob {
    private final int a;
    private final String b;
    private final String c;
    private final Integer d;
    private final Integer e;
    private final long f;
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private final String k;
    private final String l;
    private final boolean m;

    public plx(int i2, String str, String str2, Integer num, Integer num2, long j2, String str3, String str4, String str5, int i3, String str6, String str7, boolean z) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = j2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i3;
        this.k = str6;
        this.l = str7;
        this.m = z;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Integer d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r1 = r7.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r1 = r7.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r1 = r7.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r1 = r7.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b6, code lost:
        r1 = r7.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x00d7
            boolean r1 = r8 instanceof defpackage.pob
            r2 = 0
            if (r1 == 0) goto L_0x00d6
            pob r8 = (defpackage.pob) r8
            int r1 = r7.a
            int r3 = r8.a()
            if (r1 != r3) goto L_0x00d5
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
            java.lang.Integer r1 = r7.d
            if (r1 == 0) goto L_0x0039
            java.lang.Integer r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
        L_0x0038:
            goto L_0x0040
        L_0x0039:
            java.lang.Integer r1 = r8.d()
            if (r1 != 0) goto L_0x00d5
            goto L_0x0038
        L_0x0040:
            java.lang.Integer r1 = r7.e
            if (r1 == 0) goto L_0x004f
            java.lang.Integer r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
        L_0x004e:
            goto L_0x0056
        L_0x004f:
            java.lang.Integer r1 = r8.e()
            if (r1 != 0) goto L_0x00d5
            goto L_0x004e
        L_0x0056:
            long r3 = r7.f
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00d5
            java.lang.String r1 = r7.g
            if (r1 == 0) goto L_0x006f
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
        L_0x006e:
            goto L_0x0076
        L_0x006f:
            java.lang.String r1 = r8.g()
            if (r1 != 0) goto L_0x00d5
            goto L_0x006e
        L_0x0076:
            java.lang.String r1 = r7.h
            if (r1 == 0) goto L_0x0085
            java.lang.String r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
        L_0x0084:
            goto L_0x008c
        L_0x0085:
            java.lang.String r1 = r8.h()
            if (r1 != 0) goto L_0x00d5
            goto L_0x0084
        L_0x008c:
            java.lang.String r1 = r7.i
            if (r1 == 0) goto L_0x009b
            java.lang.String r3 = r8.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
        L_0x009a:
            goto L_0x00a2
        L_0x009b:
            java.lang.String r1 = r8.i()
            if (r1 != 0) goto L_0x00d5
            goto L_0x009a
        L_0x00a2:
            int r1 = r7.j
            int r3 = r8.j()
            if (r1 != r3) goto L_0x00d5
            java.lang.String r1 = r7.k
            java.lang.String r3 = r8.k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = r7.l
            if (r1 == 0) goto L_0x00c5
            java.lang.String r3 = r8.l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00c5:
            java.lang.String r1 = r8.l()
            if (r1 == 0) goto L_0x00cc
        L_0x00cb:
            goto L_0x00d5
        L_0x00cc:
            boolean r1 = r7.m
            boolean r8 = r8.m()
            if (r1 != r8) goto L_0x00d5
            return r0
        L_0x00d5:
            return r2
        L_0x00d6:
            return r2
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plx.equals(java.lang.Object):boolean");
    }

    public final long f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int i7 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode ^ i2) * 1000003;
        Integer num2 = this.e;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f;
        int i9 = (((i8 ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.g;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 ^ i4) * 1000003;
        String str2 = this.h;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 ^ i5) * 1000003;
        String str3 = this.i;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode2 = (((((i11 ^ i6) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str4 = this.l;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return ((hashCode2 ^ i7) * 1000003) ^ (!this.m ? 1237 : 1231);
    }

    public final String i() {
        return this.i;
    }

    public final int j() {
        return this.j;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final String toString() {
        int i2 = this.a;
        String str = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        long j2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        String str5 = this.i;
        int i3 = this.j;
        String str6 = this.k;
        String str7 = this.l;
        boolean z = this.m;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 177 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("Message{id=");
        sb.append(i2);
        sb.append(", messageType=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", threadId=");
        sb.append(valueOf2);
        sb.append(", dateMillis=");
        sb.append(j2);
        sb.append(", address=");
        sb.append(str3);
        sb.append(", subject=");
        sb.append(str4);
        sb.append(", body=");
        sb.append(str5);
        sb.append(", score=");
        sb.append(i3);
        sb.append(", contentType=");
        sb.append(str6);
        sb.append(", mediaUri=");
        sb.append(str7);
        sb.append(", read=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
