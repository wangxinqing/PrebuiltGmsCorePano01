package defpackage;

/* renamed from: anfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfd {
    public final Object a;
    int b;
    final /* synthetic */ anfj c;

    anfd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (defpackage.amqx.a(r4.a, r2.a[r0]) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 != r1) goto L_0x0006
            goto L_0x0018
        L_0x0006:
            anfj r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L_0x0018
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.amqx.a(r3, r0)
            if (r0 != 0) goto L_0x0022
        L_0x0018:
            anfj r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.a((java.lang.Object) r2)
            r4.b = r0
        L_0x0022:
            int r0 = r4.b
            if (r0 == r1) goto L_0x002d
            anfj r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        L_0x002d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anfd.a():int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anfd) {
            anfd anfd = (anfd) obj;
            return a() == anfd.a() && amqx.a(this.a, anfd.a);
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj != null ? obj.hashCode() : 0) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a2 = a();
        if (a2 == 1) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(" x ");
        sb.append(a2);
        return sb.toString();
    }

    public anfd(anfj anfj, int i) {
        this.c = anfj;
        this.a = anfj.a[i];
        this.b = i;
    }
}
