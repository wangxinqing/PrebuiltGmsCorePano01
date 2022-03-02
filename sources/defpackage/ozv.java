package defpackage;

/* renamed from: ozv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozv {
    public static final ozv a = new ozv((Object) null, 0, 0);
    private Object b;
    private int c;
    private long d;

    public ozv(Object obj, int i, long j) {
        this.b = obj;
        this.c = i;
        this.d = j;
    }

    public static ozv a(int i, Object obj, long j) {
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2)) {
            z = false;
        }
        iva.b(z);
        return new ozv(obj, i, j);
    }

    public static String b(int i) {
        if (i == 0) {
            return "unset";
        }
        if (i == 1) {
            return "set from runtime API";
        }
        if (i == 2) {
            return "set from resources";
        }
        StringBuilder sb = new StringBuilder(21);
        sb.append("unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final synchronized int a() {
        return this.c;
    }

    public final synchronized void a(long j) {
        this.d = j;
    }

    public final synchronized long b() {
        return this.d;
    }

    public final synchronized Object c() {
        return this.b;
    }

    public final String d() {
        return b(a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozv) {
            ozv ozv = (ozv) obj;
            return ozv.c == this.c && ius.a(this.b, ozv.b);
        }
    }

    public final int hashCode() {
        Object obj = this.b;
        return (((obj != null ? obj.hashCode() : 0) + 851) * 37) + this.c;
    }

    public static ozv a(Object obj, long j) {
        return new ozv(obj, 1, j);
    }

    public static ozv b(Object obj, long j) {
        return new ozv(obj, 2, j);
    }

    public final ozv a(Object obj) {
        return new ozv(obj, a(), this.d);
    }

    public final synchronized void a(Object obj, int i, long j) {
        iva.a(a(i));
        this.c = i;
        this.b = obj;
        this.d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        if (r5 == 1) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch:{ all -> 0x002b }
            r1 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r1) goto L_0x0029
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L_0x0011
            monitor-exit(r4)
            if (r5 == r1) goto L_0x0010
            return r1
        L_0x0010:
            return r3
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r1 = 32
            r0.<init>(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "Invalid source value "
            r0.append(r1)     // Catch:{ all -> 0x002b }
            r0.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x002b }
            defpackage.iva.b(r3, r5)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)
            return r3
        L_0x0029:
            monitor-exit(r4)
            return r1
        L_0x002b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozv.a(int):boolean");
    }

    public final boolean a(ozv ozv) {
        return a(ozv.a());
    }
}
