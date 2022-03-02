package defpackage;

import java.io.Closeable;

/* renamed from: bajs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bajs implements Closeable, baet {
    public final bajp a;
    public int b;
    public azyg c;
    public baeo d = new baeo();
    public long e;
    public boolean f = false;
    public volatile boolean g = false;
    private final balm h;
    private final balu i;
    private int j = 5;
    private boolean k;
    private baeo l;
    private boolean m = false;
    private int n = -1;
    private int o;
    private int p = 1;

    public bajs(bajp bajp, azyg azyg, int i2, balm balm, balu balu) {
        amrl.a((Object) bajp, (Object) "sink");
        this.a = bajp;
        amrl.a((Object) azyg, (Object) "decompressor");
        this.c = azyg;
        this.b = i2;
        amrl.a((Object) balm, (Object) "statsTraceCtx");
        this.h = balm;
        amrl.a((Object) balu, (Object) "transportTracer");
        this.i = balu;
    }

    public final boolean a() {
        return this.d == null;
    }

    public final boolean b() {
        return this.d.a == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r3 <= 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.a.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r7.p != 2) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r7.h.a((long) r3);
        r7.o += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r7.f == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (b() == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r7.m = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r3 <= 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7.a.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        if (r7.p != 2) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        r7.h.a((long) r3);
        r7.o += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        r3 = r7.p;
        r4 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r3 == 0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (r4 == 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r4 == 1) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        if (r3 == 1) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        r0 = "BODY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r0 = "HEADER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        r4 = new java.lang.StringBuilder(r0.length() + 15);
        r4.append("Invalid state: ");
        r4.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        r2 = r7.h.b;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        if (r4 < r3) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r7.o = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r7.k != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        r7.h.b();
        r2 = defpackage.bakp.a((defpackage.bakl) r7.l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        if (r7.c == defpackage.azxv.a) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
        r2 = new defpackage.bajr(r7.c.a(defpackage.bakp.a((defpackage.bakl) r7.l)), r7.b, r7.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r7.l = null;
        r7.a.a(new defpackage.bajq(r2));
        r7.p = 1;
        r7.j = 5;
        r7.e--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        throw defpackage.babj.n.a("Can't decode compressed gRPC message as compression not configured").b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        r6 = r2[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        r3 = r7.l.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        if ((r3 & 254) != 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0120, code lost:
        if ((r3 & 1) != 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0122, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0124, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        r7.k = r3;
        r3 = r7.l;
        r3.a(4);
        r3 = r3.b() | (((r3.b() << 24) | (r3.b() << 16)) | (r3.b() << 8));
        r7.j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0148, code lost:
        if (r3 < 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014c, code lost:
        if (r3 > r7.b) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
        r7.n++;
        r3 = r7.h.b;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0159, code lost:
        if (r5 < r4) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015b, code lost:
        r3 = r7.i;
        r3.h.a();
        r3.i = r3.b.a();
        r7.p = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016e, code lost:
        r6 = r3[r5];
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        throw defpackage.babj.n.a("gRPC frame header malformed: reserved bits not zero").b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ab, code lost:
        r7.a.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b2, code lost:
        if (r7.p == 2) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b4, code lost:
        r7.h.a((long) r3);
        r7.o += r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ab A[Catch:{ IOException -> 0x00fb, all -> 0x01c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            boolean r0 = r7.m
            if (r0 != 0) goto L_0x01c4
            r0 = 1
            r7.m = r0
        L_0x0007:
            r1 = 0
            long r2 = r7.e     // Catch:{ all -> 0x01c0 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
            goto L_0x0056
        L_0x0011:
            r2 = 2
            baeo r3 = r7.l     // Catch:{ all -> 0x01a7 }
            if (r3 != 0) goto L_0x001f
            baeo r3 = new baeo     // Catch:{ all -> 0x01a7 }
            r3.<init>()     // Catch:{ all -> 0x01a7 }
            r7.l = r3     // Catch:{ all -> 0x01a7 }
            r3 = 0
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            int r4 = r7.j     // Catch:{ all -> 0x01a5 }
            baeo r5 = r7.l     // Catch:{ all -> 0x01a5 }
            int r5 = r5.a     // Catch:{ all -> 0x01a5 }
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0066
            baeo r5 = r7.d     // Catch:{ all -> 0x01a5 }
            int r5 = r5.a     // Catch:{ all -> 0x01a5 }
            if (r5 == 0) goto L_0x0040
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x01a5 }
            int r3 = r3 + r4
            baeo r5 = r7.l     // Catch:{ all -> 0x01a5 }
            baeo r6 = r7.d     // Catch:{ all -> 0x01a5 }
            baeo r4 = r6.c(r4)     // Catch:{ all -> 0x01a5 }
            r5.a(r4)     // Catch:{ all -> 0x01a5 }
            goto L_0x0020
        L_0x0040:
            if (r3 <= 0) goto L_0x0056
            bajp r0 = r7.a     // Catch:{ all -> 0x01c0 }
            r0.a((int) r3)     // Catch:{ all -> 0x01c0 }
            int r0 = r7.p     // Catch:{ all -> 0x01c0 }
            if (r0 != r2) goto L_0x0056
            balm r0 = r7.h     // Catch:{ all -> 0x01c0 }
            long r4 = (long) r3     // Catch:{ all -> 0x01c0 }
            r0.a(r4)     // Catch:{ all -> 0x01c0 }
            int r0 = r7.o     // Catch:{ all -> 0x01c0 }
            int r0 = r0 + r3
            r7.o = r0     // Catch:{ all -> 0x01c0 }
        L_0x0056:
            boolean r0 = r7.f     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = r7.b()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0063
            r7.close()     // Catch:{ all -> 0x01c0 }
        L_0x0063:
            r7.m = r1
            return
        L_0x0066:
            if (r3 <= 0) goto L_0x007c
            bajp r4 = r7.a     // Catch:{ all -> 0x01c0 }
            r4.a((int) r3)     // Catch:{ all -> 0x01c0 }
            int r4 = r7.p     // Catch:{ all -> 0x01c0 }
            if (r4 != r2) goto L_0x007c
            balm r4 = r7.h     // Catch:{ all -> 0x01c0 }
            long r5 = (long) r3     // Catch:{ all -> 0x01c0 }
            r4.a(r5)     // Catch:{ all -> 0x01c0 }
            int r4 = r7.o     // Catch:{ all -> 0x01c0 }
            int r4 = r4 + r3
            r7.o = r4     // Catch:{ all -> 0x01c0 }
        L_0x007c:
            int r3 = r7.p     // Catch:{ all -> 0x01c0 }
            int r4 = r3 + -1
            r5 = 0
            if (r3 == 0) goto L_0x01a3
            if (r4 == 0) goto L_0x0114
            if (r4 == r0) goto L_0x00ab
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x01c0 }
            if (r3 == r0) goto L_0x008e
            java.lang.String r0 = "BODY"
            goto L_0x0090
        L_0x008e:
            java.lang.String r0 = "HEADER"
        L_0x0090:
            int r3 = r0.length()     // Catch:{ all -> 0x01c0 }
            int r3 = r3 + 15
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c0 }
            r4.<init>(r3)     // Catch:{ all -> 0x01c0 }
            java.lang.String r3 = "Invalid state: "
            r4.append(r3)     // Catch:{ all -> 0x01c0 }
            r4.append(r0)     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c0 }
            r2.<init>(r0)     // Catch:{ all -> 0x01c0 }
            throw r2     // Catch:{ all -> 0x01c0 }
        L_0x00ab:
            balm r2 = r7.h     // Catch:{ all -> 0x01c0 }
            babm[] r2 = r2.b     // Catch:{ all -> 0x01c0 }
            int r3 = r2.length     // Catch:{ all -> 0x01c0 }
            r4 = 0
        L_0x00b1:
            if (r4 < r3) goto L_0x010f
            r7.o = r1     // Catch:{ all -> 0x01c0 }
            boolean r2 = r7.k     // Catch:{ all -> 0x01c0 }
            if (r2 != 0) goto L_0x00c5
            balm r2 = r7.h     // Catch:{ all -> 0x01c0 }
            r2.b()     // Catch:{ all -> 0x01c0 }
            baeo r2 = r7.l     // Catch:{ all -> 0x01c0 }
            java.io.InputStream r2 = defpackage.bakp.a((defpackage.bakl) r2)     // Catch:{ all -> 0x01c0 }
            goto L_0x00e1
        L_0x00c5:
            azyg r2 = r7.c     // Catch:{ all -> 0x01c0 }
            azxw r3 = defpackage.azxv.a     // Catch:{ all -> 0x01c0 }
            if (r2 == r3) goto L_0x0102
            azyg r2 = r7.c     // Catch:{ IOException -> 0x00fb }
            baeo r3 = r7.l     // Catch:{ IOException -> 0x00fb }
            java.io.InputStream r3 = defpackage.bakp.a((defpackage.bakl) r3)     // Catch:{ IOException -> 0x00fb }
            java.io.InputStream r2 = r2.a(r3)     // Catch:{ IOException -> 0x00fb }
            bajr r3 = new bajr     // Catch:{ IOException -> 0x00fb }
            int r4 = r7.b     // Catch:{ IOException -> 0x00fb }
            balm r6 = r7.h     // Catch:{ IOException -> 0x00fb }
            r3.<init>(r2, r4, r6)     // Catch:{ IOException -> 0x00fb }
            r2 = r3
        L_0x00e1:
            r7.l = r5     // Catch:{ all -> 0x01c0 }
            bajp r3 = r7.a     // Catch:{ all -> 0x01c0 }
            bajq r4 = new bajq     // Catch:{ all -> 0x01c0 }
            r4.<init>(r2)     // Catch:{ all -> 0x01c0 }
            r3.a((defpackage.bajq) r4)     // Catch:{ all -> 0x01c0 }
            r7.p = r0     // Catch:{ all -> 0x01c0 }
            r2 = 5
            r7.j = r2     // Catch:{ all -> 0x01c0 }
            long r2 = r7.e     // Catch:{ all -> 0x01c0 }
            r4 = -1
            long r2 = r2 + r4
            r7.e = r2     // Catch:{ all -> 0x01c0 }
            goto L_0x0007
        L_0x00fb:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x01c0 }
            r2.<init>(r0)     // Catch:{ all -> 0x01c0 }
            throw r2     // Catch:{ all -> 0x01c0 }
        L_0x0102:
            babj r0 = defpackage.babj.n     // Catch:{ all -> 0x01c0 }
            java.lang.String r2 = "Can't decode compressed gRPC message as compression not configured"
            babj r0 = r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01c0 }
            babl r0 = r0.b()     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x010f:
            r6 = r2[r4]     // Catch:{ all -> 0x01c0 }
            int r4 = r4 + 1
            goto L_0x00b1
        L_0x0114:
            baeo r3 = r7.l     // Catch:{ all -> 0x01c0 }
            int r3 = r3.b()     // Catch:{ all -> 0x01c0 }
            r4 = r3 & 254(0xfe, float:3.56E-43)
            if (r4 != 0) goto L_0x0196
            r3 = r3 & 1
            if (r3 != 0) goto L_0x0124
            r3 = 0
            goto L_0x0125
        L_0x0124:
            r3 = 1
        L_0x0125:
            r7.k = r3     // Catch:{ all -> 0x01c0 }
            baeo r3 = r7.l     // Catch:{ all -> 0x01c0 }
            r4 = 4
            r3.a(r4)     // Catch:{ all -> 0x01c0 }
            int r4 = r3.b()     // Catch:{ all -> 0x01c0 }
            int r4 = r4 << 24
            int r5 = r3.b()     // Catch:{ all -> 0x01c0 }
            int r5 = r5 << 16
            r4 = r4 | r5
            int r5 = r3.b()     // Catch:{ all -> 0x01c0 }
            int r5 = r5 << 8
            r4 = r4 | r5
            int r3 = r3.b()     // Catch:{ all -> 0x01c0 }
            r3 = r3 | r4
            r7.j = r3     // Catch:{ all -> 0x01c0 }
            if (r3 < 0) goto L_0x0173
            int r4 = r7.b     // Catch:{ all -> 0x01c0 }
            if (r3 > r4) goto L_0x0173
            int r3 = r7.n     // Catch:{ all -> 0x01c0 }
            int r3 = r3 + r0
            r7.n = r3     // Catch:{ all -> 0x01c0 }
            balm r3 = r7.h     // Catch:{ all -> 0x01c0 }
            babm[] r3 = r3.b     // Catch:{ all -> 0x01c0 }
            int r4 = r3.length     // Catch:{ all -> 0x01c0 }
            r5 = 0
        L_0x0159:
            if (r5 < r4) goto L_0x016e
            balu r3 = r7.i     // Catch:{ all -> 0x01c0 }
            baie r4 = r3.h     // Catch:{ all -> 0x01c0 }
            r4.a()     // Catch:{ all -> 0x01c0 }
            balq r4 = r3.b     // Catch:{ all -> 0x01c0 }
            long r4 = r4.a()     // Catch:{ all -> 0x01c0 }
            r3.i = r4     // Catch:{ all -> 0x01c0 }
            r7.p = r2     // Catch:{ all -> 0x01c0 }
            goto L_0x0007
        L_0x016e:
            r6 = r3[r5]     // Catch:{ all -> 0x01c0 }
            int r5 = r5 + 1
            goto L_0x0159
        L_0x0173:
            babj r3 = defpackage.babj.k     // Catch:{ all -> 0x01c0 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c0 }
            int r4 = r7.b     // Catch:{ all -> 0x01c0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01c0 }
            r2[r1] = r4     // Catch:{ all -> 0x01c0 }
            int r4 = r7.j     // Catch:{ all -> 0x01c0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01c0 }
            r2[r0] = r4     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = "gRPC message exceeds maximum size %d: %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x01c0 }
            babj r0 = r3.a((java.lang.String) r0)     // Catch:{ all -> 0x01c0 }
            babl r0 = r0.b()     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x0196:
            babj r0 = defpackage.babj.n     // Catch:{ all -> 0x01c0 }
            java.lang.String r2 = "gRPC frame header malformed: reserved bits not zero"
            babj r0 = r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01c0 }
            babl r0 = r0.b()     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01a3:
            throw r5     // Catch:{ all -> 0x01c0 }
        L_0x01a5:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a7:
            r0 = move-exception
            r3 = 0
        L_0x01a9:
            if (r3 <= 0) goto L_0x01bf
            bajp r4 = r7.a     // Catch:{ all -> 0x01c0 }
            r4.a((int) r3)     // Catch:{ all -> 0x01c0 }
            int r4 = r7.p     // Catch:{ all -> 0x01c0 }
            if (r4 != r2) goto L_0x01bf
            balm r2 = r7.h     // Catch:{ all -> 0x01c0 }
            long r4 = (long) r3     // Catch:{ all -> 0x01c0 }
            r2.a(r4)     // Catch:{ all -> 0x01c0 }
            int r2 = r7.o     // Catch:{ all -> 0x01c0 }
            int r2 = r2 + r3
            r7.o = r2     // Catch:{ all -> 0x01c0 }
        L_0x01bf:
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            r7.m = r1
            throw r0
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajs.c():void");
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        if (!a()) {
            baeo baeo = this.l;
            boolean z = false;
            if (baeo != null && baeo.a > 0) {
                z = true;
            }
            try {
                baeo baeo2 = this.d;
                if (baeo2 != null) {
                    baeo2.close();
                }
                baeo baeo3 = this.l;
                if (baeo3 != null) {
                    baeo3.close();
                }
                this.d = null;
                this.l = null;
                this.a.a(z);
            } catch (Throwable th) {
                this.d = null;
                this.l = null;
                throw th;
            }
        }
    }
}
