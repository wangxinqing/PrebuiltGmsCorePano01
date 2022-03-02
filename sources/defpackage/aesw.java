package defpackage;

/* renamed from: aesw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aesw extends aeti {
    private final int b;
    private final Long c;
    private final Long d;

    public aesw(int i, Long l, Long l2) {
        this.b = i;
        this.c = l;
        this.d = l2;
    }

    public final int a() {
        return this.b;
    }

    public final Long b() {
        return this.c;
    }

    public final Long c() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0041
            boolean r1 = r5 instanceof defpackage.aeti
            r2 = 0
            if (r1 == 0) goto L_0x0040
            aeti r5 = (defpackage.aeti) r5
            int r1 = r4.b
            int r3 = r5.a()
            if (r1 != r3) goto L_0x003f
            java.lang.Long r1 = r4.c
            if (r1 == 0) goto L_0x0021
            java.lang.Long r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0020:
            goto L_0x0028
        L_0x0021:
            java.lang.Long r1 = r5.b()
            if (r1 != 0) goto L_0x003f
            goto L_0x0020
        L_0x0028:
            java.lang.Long r1 = r4.d
            if (r1 == 0) goto L_0x0037
            java.lang.Long r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x003e
        L_0x0037:
            java.lang.Long r5 = r5.c()
            if (r5 == 0) goto L_0x003e
        L_0x003d:
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        L_0x0040:
            return r2
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = (this.b ^ 1000003) * 1000003;
        Long l = this.c;
        int i3 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 ^ i) * 1000003;
        Long l2 = this.d;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 121 + String.valueOf(valueOf2).length());
        sb.append("CoreTimeSeriesFootprintsFilter{numFootprints=");
        sb.append(i);
        sb.append(", relativeNowMinTimestampMicros=");
        sb.append(valueOf);
        sb.append(", relativeNowMaxTimestampMicros=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
