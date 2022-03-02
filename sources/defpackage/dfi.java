package defpackage;

/* renamed from: dfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dfi extends dhp {
    private final String a;
    private final aqrk b;
    private final aqsr c;

    public dfi(String str, aqrk aqrk, aqsr aqsr) {
        if (str != null) {
            this.a = str;
            this.b = aqrk;
            if (aqsr != null) {
                this.c = aqsr;
                return;
            }
            throw new NullPointerException("Null resourceKey");
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final aqrk b() {
        return this.b;
    }

    public final aqsr c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x003a
            boolean r1 = r5 instanceof defpackage.dhp
            r2 = 0
            if (r1 == 0) goto L_0x0039
            dhp r5 = (defpackage.dhp) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
            aqrk r1 = r4.b
            if (r1 == 0) goto L_0x0025
            aqrk r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            aqrk r1 = r5.b()
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x0039
        L_0x002c:
            aqsr r1 = r4.c
            aqsr r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0039
            return r0
        L_0x0039:
            return r2
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aqrk aqrk = this.b;
        if (aqrk != null) {
            i = aqrk.hashCode();
        } else {
            i = 0;
        }
        int i2 = (hashCode ^ i) * 1000003;
        aqsr aqsr = this.c;
        int i3 = aqsr.S;
        if (i3 == 0) {
            i3 = aueh.a.a((Object) aqsr).a(aqsr);
            aqsr.S = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("PageItem{title=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", resourceKey=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
