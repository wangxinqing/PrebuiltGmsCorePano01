package defpackage;

import java.util.List;

/* renamed from: agbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbr extends agcj {
    private final agcm a;
    private final agcm b;
    private final List c;
    private final agao d;
    private final agat e;

    public agbr(agao agao, agcm agcm, agcm agcm2, agat agat, List list) {
        this.d = agao;
        this.a = agcm;
        this.b = agcm2;
        this.e = agat;
        this.c = list;
    }

    public final agcm a() {
        return this.a;
    }

    public final agcm b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final agao d() {
        return this.d;
    }

    public final agat e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x0052
            boolean r1 = r5 instanceof defpackage.agcj
            r2 = 0
            if (r1 == 0) goto L_0x0051
            agcj r5 = (defpackage.agcj) r5
            agao r1 = r4.d
            agao r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            agcm r1 = r4.a
            agcm r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            agcm r1 = r4.b
            agcm r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            agat r1 = r4.e
            agat r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.util.List r1 = r4.c
            if (r1 == 0) goto L_0x0049
            java.util.List r5 = r5.c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x004f
            goto L_0x0050
        L_0x0049:
            java.util.List r5 = r5.c()
            if (r5 == 0) goto L_0x0050
        L_0x004f:
            goto L_0x0051
        L_0x0050:
            return r0
        L_0x0051:
            return r2
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbr.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        List list = this.c;
        return hashCode ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 115 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ImageModelLoader{keyGenerator=");
        sb.append(valueOf);
        sb.append(", imageRetriever=");
        sb.append(valueOf2);
        sb.append(", secondaryImageRetriever=");
        sb.append(valueOf3);
        sb.append(", defaultImageRetriever=");
        sb.append(valueOf4);
        sb.append(", postProcessors=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
