package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: bajw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bajw implements bagl {
    public int a = -1;
    public final balw b;
    private final bajv c;
    private balv d;
    private azxx e = azxv.a;
    private final boolean f = true;
    private final baju g = new baju(this);
    private final byte[] h = new byte[5];
    private final balm i;
    private boolean j;
    private int k;
    private int l = -1;
    private long m;

    public bajw(bajv bajv, balw balw, balm balm) {
        amrl.a((Object) bajv, (Object) "sink");
        this.c = bajv;
        amrl.a((Object) balw, (Object) "bufferAllocator");
        this.b = balw;
        amrl.a((Object) balm, (Object) "statsTraceCtx");
        this.i = balm;
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        boolean z = false;
        if (inputStream instanceof baoo) {
            baoo baoo = (baoo) inputStream;
            audx audx = baoo.a;
            if (audx == null) {
                ByteArrayInputStream byteArrayInputStream = baoo.c;
                if (byteArrayInputStream == null) {
                    return 0;
                }
                long a2 = baoq.a(byteArrayInputStream, outputStream);
                baoo.c = null;
                return (int) a2;
            }
            int p = audx.p();
            baoo.a.a(outputStream);
            baoo.a = null;
            return p;
        }
        long a3 = anmr.a(inputStream, outputStream);
        if (a3 <= 2147483647L) {
            z = true;
        }
        amrl.a(z, "Message size overflow: %s", a3);
        return (int) a3;
    }

    public final boolean b() {
        return this.j;
    }

    public final void c() {
        if (!this.j) {
            this.j = true;
            balv balv = this.d;
            if (!(balv == null || balv.b() != 0 || this.d == null)) {
                this.d = null;
            }
            a(true, true);
        }
    }

    private final void a(bajt bajt, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.h);
        wrap.put(z ? (byte) 1 : 0);
        List list = bajt.a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((balv) list.get(i3)).b();
        }
        wrap.putInt(i2);
        balv a2 = this.b.a(5);
        a2.a(this.h, 0, wrap.position());
        if (i2 != 0) {
            this.c.a(a2, false, false, this.k - 1);
            this.k = 1;
            List list2 = bajt.a;
            for (int i4 = 0; i4 < list2.size() - 1; i4++) {
                this.c.a((balv) list2.get(i4), false, false, 0);
            }
            this.d = (balv) list2.get(list2.size() - 1);
            this.m = (long) i2;
            return;
        }
        this.d = a2;
    }

    private final void a(boolean z, boolean z2) {
        balv balv = this.d;
        this.d = null;
        this.c.a(balv, z, z2, this.k);
        this.k = 0;
    }

    public final void a() {
        balv balv = this.d;
        if (balv != null && balv.b() > 0) {
            a(false, true);
        }
    }

    public final /* bridge */ /* synthetic */ void a(azxx azxx) {
        amrl.a((Object) azxx, (Object) "Can't pass an empty compressor");
        this.e = azxx;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c A[Catch:{ all -> 0x0085, IOException -> 0x0176, RuntimeException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0 A[Catch:{ all -> 0x0085, IOException -> 0x0176, RuntimeException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115 A[LOOP:3: B:61:0x0113->B:62:0x0115, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011b A[LOOP:2: B:59:0x010c->B:64:0x011b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123 A[LOOP:1: B:57:0x0102->B:65:0x0123, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.InputStream r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Failed to frame message"
            boolean r1 = r10.j
            if (r1 != 0) goto L_0x0186
            int r1 = r10.k
            r2 = 1
            int r1 = r1 + r2
            r10.k = r1
            int r1 = r10.l
            int r1 = r1 + r2
            r10.l = r1
            r3 = 0
            r10.m = r3
            balm r1 = r10.i
            babm[] r1 = r1.b
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L_0x001c:
            if (r5 >= r3) goto L_0x0023
            r6 = r1[r5]
            int r5 = r5 + 1
            goto L_0x001c
        L_0x0023:
            boolean r1 = r10.f
            if (r1 == 0) goto L_0x002f
            azxx r1 = r10.e
            azxw r3 = defpackage.azxv.a
            if (r1 == r3) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            boolean r3 = r11 instanceof defpackage.azzc     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r5 = -1
            if (r3 != 0) goto L_0x003c
            boolean r3 = r11 instanceof java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            if (r3 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r3 = -1
            goto L_0x0040
        L_0x003c:
            int r3 = r11.available()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x0040:
            java.lang.String r6 = "message too large %d > %d"
            r7 = 2
            if (r3 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x008a
            bajt r1 = new bajt     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r1.<init>(r10)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            azxx r8 = r10.e     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.io.OutputStream r8 = r8.a(r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r11 = a((java.io.InputStream) r11, (java.io.OutputStream) r8)     // Catch:{ all -> 0x0085 }
            r8.close()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r8 = r10.a     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            if (r8 >= 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            if (r11 > r8) goto L_0x0066
        L_0x0060:
            r10.a((defpackage.bajt) r1, (boolean) r2)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            goto L_0x00f7
        L_0x0066:
            babj r1 = defpackage.babj.k     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r3[r4] = r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r11 = r10.a     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r3[r2] = r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.String r11 = java.lang.String.format(r6, r3)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            babj r11 = r1.a((java.lang.String) r11)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            babl r11 = r11.b()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            throw r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x0085:
            r11 = move-exception
            r8.close()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            throw r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x008a:
            if (r3 != r5) goto L_0x00c0
            bajt r1 = new bajt     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r1.<init>(r10)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r11 = a((java.io.InputStream) r11, (java.io.OutputStream) r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r8 = r10.a     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            if (r8 >= 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            if (r11 > r8) goto L_0x00a1
        L_0x009c:
            r10.a((defpackage.bajt) r1, (boolean) r4)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            goto L_0x00f7
        L_0x00a1:
            babj r1 = defpackage.babj.k     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r3[r4] = r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r11 = r10.a     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r3[r2] = r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.String r11 = java.lang.String.format(r6, r3)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            babj r11 = r1.a((java.lang.String) r11)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            babl r11 = r11.b()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            throw r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x00c0:
            long r8 = (long) r3     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r10.m = r8     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r1 = r10.a     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            if (r1 >= 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            if (r3 > r1) goto L_0x0147
        L_0x00ca:
            byte[] r1 = r10.h     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r1.put(r4)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r1.putInt(r3)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            balv r6 = r10.d     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            if (r6 == 0) goto L_0x00db
            goto L_0x00e8
        L_0x00db:
            balw r6 = r10.b     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r8 = r1.position()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r8 = r8 + r3
            balv r6 = r6.a(r8)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r10.d = r6     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x00e8:
            byte[] r6 = r10.h     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r1 = r1.position()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r10.a(r6, r4, r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            baju r1 = r10.g     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r11 = a((java.io.InputStream) r11, (java.io.OutputStream) r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x00f7:
            if (r3 != r5) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            if (r11 != r3) goto L_0x0128
        L_0x00fc:
            balm r11 = r10.i
            babm[] r0 = r11.b
            int r1 = r0.length
            r11 = 0
        L_0x0102:
            if (r11 < r1) goto L_0x0123
            balm r11 = r10.i
            long r2 = r10.m
            babm[] r5 = r11.b
            int r6 = r5.length
            r11 = 0
        L_0x010c:
            if (r11 < r6) goto L_0x011b
            balm r11 = r10.i
            babm[] r11 = r11.b
            int r0 = r11.length
        L_0x0113:
            if (r4 >= r0) goto L_0x011a
            r1 = r11[r4]
            int r4 = r4 + 1
            goto L_0x0113
        L_0x011a:
            return
        L_0x011b:
            r0 = r5[r11]
            r0.a(r2)
            int r11 = r11 + 1
            goto L_0x010c
        L_0x0123:
            r2 = r0[r11]
            int r11 = r11 + 1
            goto L_0x0102
        L_0x0128:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r4] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r0[r2] = r11
            java.lang.String r11 = "Message length inaccurate %s != %s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            babj r0 = defpackage.babj.n
            babj r11 = r0.a((java.lang.String) r11)
            babl r11 = r11.b()
            throw r11
        L_0x0147:
            babj r11 = defpackage.babj.k     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r1[r4] = r3     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            int r3 = r10.a     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            r1[r2] = r3     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            java.lang.String r1 = java.lang.String.format(r6, r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            babj r11 = r11.a((java.lang.String) r1)     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            babl r11 = r11.b()     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
            throw r11     // Catch:{ IOException -> 0x0176, RuntimeException -> 0x0166 }
        L_0x0166:
            r11 = move-exception
            babj r1 = defpackage.babj.n
            babj r0 = r1.a((java.lang.String) r0)
            babj r11 = r0.b((java.lang.Throwable) r11)
            babl r11 = r11.b()
            throw r11
        L_0x0176:
            r11 = move-exception
            babj r1 = defpackage.babj.n
            babj r0 = r1.a((java.lang.String) r0)
            babj r11 = r0.b((java.lang.Throwable) r11)
            babl r11 = r11.b()
            throw r11
        L_0x0186:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Framer already closed"
            r11.<init>(r0)
            goto L_0x018f
        L_0x018e:
            throw r11
        L_0x018f:
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajw.a(java.io.InputStream):void");
    }

    public final void a(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            balv balv = this.d;
            if (balv != null && balv.a() == 0) {
                a(false, false);
            }
            if (this.d == null) {
                this.d = this.b.a(i3);
            }
            int min = Math.min(i3, this.d.a());
            this.d.a(bArr, i2, min);
            i2 += min;
            i3 -= min;
        }
    }
}
