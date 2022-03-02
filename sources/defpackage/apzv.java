package defpackage;

/* renamed from: apzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apzv extends aqan {
    private final String a;
    private final apyq b;
    private final String c;

    public apzv(String str, apyq apyq, String str2) {
        if (str != null) {
            this.a = str;
            this.b = apyq;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null methodName");
        }
        throw new NullPointerException("Null endpoint");
    }

    public final String a() {
        return this.a;
    }

    public final apyq b() {
        return this.b;
    }

    public final String c() {
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
            boolean r1 = r5 instanceof defpackage.aqan
            r2 = 0
            if (r1 == 0) goto L_0x0039
            aqan r5 = (defpackage.aqan) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
            apyq r1 = r4.b
            if (r1 == 0) goto L_0x0025
            apyq r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            apyq r1 = r5.b()
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x0039
        L_0x002c:
            java.lang.String r1 = r4.c
            java.lang.String r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0039
            return r0
        L_0x0039:
            return r2
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apzv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        apyq apyq = this.b;
        if (apyq != null) {
            i = apyq.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf).length() + str2.length());
        sb.append("InterceptorId{endpoint=");
        sb.append(str);
        sb.append(", authContext=");
        sb.append(valueOf);
        sb.append(", methodName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
