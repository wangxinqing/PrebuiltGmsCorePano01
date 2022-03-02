package defpackage;

/* renamed from: agbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbq extends agcg {
    public final agck a;
    public final Object b;

    public agbq(agck agck, Object obj) {
        this.a = agck;
        this.b = obj;
    }

    public final agck a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x002e
            boolean r1 = r5 instanceof defpackage.agcg
            r2 = 0
            if (r1 == 0) goto L_0x002d
            agcg r5 = (defpackage.agcg) r5
            agck r1 = r4.a
            agck r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r4.b
            if (r1 == 0) goto L_0x0025
            java.lang.Object r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            java.lang.Object r5 = r5.b()
            if (r5 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Object obj = this.b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("ImageModel{modelType=");
        sb.append(valueOf);
        sb.append(", data=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
