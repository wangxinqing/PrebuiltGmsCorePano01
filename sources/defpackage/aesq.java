package defpackage;

/* renamed from: aesq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aesq extends aesy {
    private final boolean a;
    private final Long b;

    public aesq(boolean z, Long l) {
        this.a = z;
        this.b = l;
    }

    public final boolean a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x002a
            boolean r1 = r5 instanceof defpackage.aesy
            r2 = 0
            if (r1 == 0) goto L_0x0029
            aesy r5 = (defpackage.aesy) r5
            boolean r1 = r4.a
            boolean r3 = r5.a()
            if (r1 != r3) goto L_0x0029
            java.lang.Long r1 = r4.b
            if (r1 == 0) goto L_0x0021
            java.lang.Long r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0021:
            java.lang.Long r5 = r5.b()
            if (r5 == 0) goto L_0x0028
        L_0x0027:
            goto L_0x0029
        L_0x0028:
            return r0
        L_0x0029:
            return r2
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        Long l = this.b;
        return i ^ (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77);
        sb.append("CoreFootprintsPendingChangeResponse{accepted=");
        sb.append(z);
        sb.append(", serverAssignedTimestamp=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
