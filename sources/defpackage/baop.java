package defpackage;

import java.io.InputStream;

/* renamed from: baop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baop implements baah {
    private static final ThreadLocal a = new ThreadLocal();
    private final auef b;
    private final audx c;

    public baop(audx audx) {
        this.c = audx;
        this.b = audx.n();
    }

    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new baoo((audx) obj, this.b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051 A[Catch:{ IOException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[Catch:{ IOException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063 A[Catch:{ IOException -> 0x00bd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.io.InputStream r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.baoo
            if (r0 == 0) goto L_0x001c
            r0 = r6
            baoo r0 = (defpackage.baoo) r0
            auef r1 = r0.b
            auef r2 = r5.b
            if (r1 != r2) goto L_0x001c
            audx r0 = r0.a     // Catch:{ IllegalStateException -> 0x001b }
            if (r0 == 0) goto L_0x0013
            goto L_0x00a8
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x001b }
            java.lang.String r1 = "message not available"
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x001b }
            throw r0     // Catch:{ IllegalStateException -> 0x001b }
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            boolean r0 = r6 instanceof defpackage.azzc     // Catch:{ IOException -> 0x00bd }
            r1 = 0
            if (r0 == 0) goto L_0x008b
            int r0 = r6.available()     // Catch:{ IOException -> 0x00bd }
            if (r0 <= 0) goto L_0x0086
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r0 > r2) goto L_0x0086
            java.lang.ThreadLocal r1 = a     // Catch:{ IOException -> 0x00bd }
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x00bd }
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1     // Catch:{ IOException -> 0x00bd }
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            goto L_0x0042
        L_0x0036:
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x00bd }
            byte[] r1 = (byte[]) r1     // Catch:{ IOException -> 0x00bd }
            if (r1 == 0) goto L_0x0035
            int r2 = r1.length     // Catch:{ IOException -> 0x00bd }
            if (r2 >= r0) goto L_0x004e
            goto L_0x0035
        L_0x0042:
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x00bd }
            java.lang.ThreadLocal r2 = a     // Catch:{ IOException -> 0x00bd }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ IOException -> 0x00bd }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00bd }
            r2.set(r3)     // Catch:{ IOException -> 0x00bd }
        L_0x004e:
            r2 = r0
        L_0x004f:
            if (r2 <= 0) goto L_0x005c
            int r3 = r0 - r2
            int r3 = r6.read(r1, r3, r2)     // Catch:{ IOException -> 0x00bd }
            r4 = -1
            if (r3 == r4) goto L_0x005c
            int r2 = r2 - r3
            goto L_0x004f
        L_0x005c:
            if (r2 != 0) goto L_0x0063
            aubc r1 = defpackage.aubc.a((byte[]) r1, (int) r0)     // Catch:{ IOException -> 0x00bd }
            goto L_0x008c
        L_0x0063:
            int r6 = r0 - r2
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00bd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bd }
            r3 = 43
            r2.<init>(r3)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r3 = "size inaccurate: "
            r2.append(r3)     // Catch:{ IOException -> 0x00bd }
            r2.append(r0)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r0 = " != "
            r2.append(r0)     // Catch:{ IOException -> 0x00bd }
            r2.append(r6)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r6 = r2.toString()     // Catch:{ IOException -> 0x00bd }
            r1.<init>(r6)     // Catch:{ IOException -> 0x00bd }
            throw r1     // Catch:{ IOException -> 0x00bd }
        L_0x0086:
            if (r0 != 0) goto L_0x008b
            audx r0 = r5.c     // Catch:{ IOException -> 0x00bd }
            goto L_0x00a8
        L_0x008b:
        L_0x008c:
            if (r1 != 0) goto L_0x0093
            aubc r1 = defpackage.aubc.a((java.io.InputStream) r6)
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            r6 = 2147483647(0x7fffffff, float:NaN)
            r1.c = r6
            auef r6 = r5.b     // Catch:{ auda -> 0x00ab }
            aubs r0 = defpackage.baoq.a     // Catch:{ auda -> 0x00ab }
            java.lang.Object r6 = r6.a(r1, r0)     // Catch:{ auda -> 0x00ab }
            r0 = r6
            audx r0 = (defpackage.audx) r0     // Catch:{ auda -> 0x00ab }
            r6 = 0
            r1.a((int) r6)     // Catch:{ auda -> 0x00a9 }
        L_0x00a8:
            return r0
        L_0x00a9:
            r6 = move-exception
            throw r6     // Catch:{ auda -> 0x00ab }
        L_0x00ab:
            r6 = move-exception
            babj r0 = defpackage.babj.n
            java.lang.String r1 = "Invalid protobuf byte sequence"
            babj r0 = r0.a((java.lang.String) r1)
            babj r6 = r0.b((java.lang.Throwable) r6)
            babl r6 = r6.b()
            throw r6
        L_0x00bd:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            goto L_0x00c5
        L_0x00c4:
            throw r0
        L_0x00c5:
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baop.a(java.io.InputStream):java.lang.Object");
    }
}
