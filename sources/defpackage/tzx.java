package defpackage;

/* renamed from: tzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tzx extends uac {
    private final uab b;
    private final String c;
    private final String d;
    private final auay e;

    public tzx(uab uab, String str, String str2, auay auay) {
        this.b = uab;
        this.c = str;
        this.d = str2;
        this.e = auay;
    }

    public final uab a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final auay d() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r1 = r4.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = r4.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0051
            boolean r1 = r5 instanceof defpackage.uac
            r2 = 0
            if (r1 == 0) goto L_0x0050
            uac r5 = (defpackage.uac) r5
            uab r1 = r4.b
            uab r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r4.d
            if (r1 == 0) goto L_0x0031
            java.lang.String r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004f
        L_0x0030:
            goto L_0x0038
        L_0x0031:
            java.lang.String r1 = r5.c()
            if (r1 != 0) goto L_0x004f
            goto L_0x0030
        L_0x0038:
            auay r1 = r4.e
            if (r1 == 0) goto L_0x0047
            auay r5 = r5.d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x004d
            goto L_0x004e
        L_0x0047:
            auay r5 = r5.d()
            if (r5 == 0) goto L_0x004e
        L_0x004d:
            goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            return r2
        L_0x0050:
            return r2
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode ^ i) * 1000003;
        auay auay = this.e;
        if (auay != null) {
            i2 = auay.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
        sb.append("HeadsetPieceImage{type=");
        sb.append(valueOf);
        sb.append(", modelId=");
        sb.append(str);
        sb.append(", imageWebUrl=");
        sb.append(str2);
        sb.append(", imageByteString=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
