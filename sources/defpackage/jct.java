package defpackage;

import android.content.Context;

/* renamed from: jct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class jct implements Runnable {
    private final Context a;
    private final long b;
    private final String c;
    private final int d;
    private final float e;
    private final int f;
    private final int g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    public jct(Context context, long j2, String str, int i2, float f2, int i3, int i4, long j3, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = j2;
        this.c = str;
        this.d = i2;
        this.e = f2;
        this.f = i3;
        this.g = i4;
        this.h = j3;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0249, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x024a, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0262, code lost:
        android.util.Log.e(r3, "unable to delete state file");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0267, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r12 <= r3) goto L_0x00bf;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022d A[SYNTHETIC, Splitter:B:103:0x022d] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0249 A[ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:3:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0226 A[SYNTHETIC, Splitter:B:98:0x0226] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "SampledWakeLockSampler"
            android.content.Context r0 = r1.a
            long r3 = r1.b
            java.lang.String r5 = r1.c
            int r6 = r1.d
            float r7 = r1.e
            int r8 = r1.f
            int r9 = r1.g
            long r10 = r1.h
            boolean r12 = r1.i
            boolean r13 = r1.j
            boolean r14 = r1.k
            axdm r15 = defpackage.axdm.a
            axdn r15 = r15.a()
            long r15 = r15.f()
            r17 = r2
            r1 = 0
            int r18 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r18 <= 0) goto L_0x0268
            android.content.Context r0 = defpackage.aekv.d(r0)
            java.lang.String r1 = "stats"
            r2 = 0
            java.io.File r0 = r0.getDir(r1, r2)
            r0.mkdirs()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "SampledWakeLockSampler.state"
            r1.<init>(r0, r2)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0252, SecurityException -> 0x0249 }
            java.lang.String r0 = "rw"
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0252, SecurityException -> 0x0249 }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ all -> 0x0235 }
            java.nio.channels.FileLock r20 = r0.lock()     // Catch:{ all -> 0x0235 }
            long r21 = r2.length()     // Catch:{ IOException -> 0x0216, all -> 0x0210 }
            r23 = 16
            int r25 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r25 >= 0) goto L_0x006a
            jcr r0 = new jcr     // Catch:{ IOException -> 0x0216, all -> 0x0210 }
            r22 = r1
            r23 = r14
            r1 = 0
            r14 = 1
            r0.<init>(r14, r1, r3)     // Catch:{ IOException -> 0x020e }
            r25 = r12
            r24 = r13
            goto L_0x00bf
        L_0x006a:
            r22 = r1
            r23 = r14
            int r0 = r2.readInt()     // Catch:{ IOException -> 0x020e }
            r1 = 1
            if (r0 != r1) goto L_0x008a
            int r0 = r2.readInt()     // Catch:{ IOException -> 0x020e }
            r1 = r13
            long r13 = r2.readLong()     // Catch:{ IOException -> 0x020e }
            r24 = r1
            jcr r1 = new jcr     // Catch:{ IOException -> 0x020e }
            r25 = r12
            r12 = 1
            r1.<init>(r12, r0, r13)     // Catch:{ IOException -> 0x020e }
            r0 = r1
            goto L_0x0097
        L_0x008a:
            r25 = r12
            r24 = r13
            jcr r1 = new jcr     // Catch:{ IOException -> 0x020e }
            r12 = 0
            r14 = 0
            r1.<init>(r0, r14, r12)     // Catch:{ IOException -> 0x020e }
            r0 = r1
        L_0x0097:
            int r1 = r0.a     // Catch:{ IOException -> 0x020e }
            r12 = 1
            if (r1 <= r12) goto L_0x00ac
            r20.release()     // Catch:{ all -> 0x00a6 }
            r2.close()     // Catch:{ IOException -> 0x00a3, SecurityException -> 0x0249 }
            return
        L_0x00a3:
            r0 = move-exception
            goto L_0x0255
        L_0x00a6:
            r0 = move-exception
            r1 = r0
            r3 = r17
            goto L_0x023b
        L_0x00ac:
            r12 = 1
            if (r1 != r12) goto L_0x0204
            int r1 = r0.b     // Catch:{ IOException -> 0x020e }
            if (r1 < 0) goto L_0x0204
            long r12 = r0.c     // Catch:{ IOException -> 0x020e }
            r18 = 0
            int r1 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x0204
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0204
        L_0x00bf:
            long r12 = r0.c     // Catch:{ IOException -> 0x020e }
            long r12 = r3 - r12
            long r26 = defpackage.jcs.a     // Catch:{ IOException -> 0x020e }
            int r1 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r1 < 0) goto L_0x00d7
            long r14 = defpackage.jcs.a     // Catch:{ IOException -> 0x020e }
            long r12 = r12 / r14
            long r14 = defpackage.jcs.a     // Catch:{ IOException -> 0x020e }
            long r12 = r12 * r14
            long r14 = r0.c     // Catch:{ IOException -> 0x020e }
            long r14 = r14 + r12
            r0.c = r14     // Catch:{ IOException -> 0x020e }
            r1 = 0
            goto L_0x00e5
        L_0x00d7:
            int r1 = r0.b     // Catch:{ IOException -> 0x020e }
            long r12 = (long) r1
            int r14 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x00e5
            r20.release()     // Catch:{ all -> 0x00a6 }
            r2.close()     // Catch:{ IOException -> 0x00a3, SecurityException -> 0x0249 }
            return
        L_0x00e5:
            r12 = 1
            int r1 = r1 + r12
            r0.b = r1     // Catch:{ IOException -> 0x020e }
            r13 = 0
            r2.seek(r13)     // Catch:{ IOException -> 0x020e }
            int r1 = r0.a     // Catch:{ IOException -> 0x020e }
            if (r1 != r12) goto L_0x01eb
            r2.writeInt(r12)     // Catch:{ IOException -> 0x020e }
            int r1 = r0.b     // Catch:{ IOException -> 0x020e }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x020e }
            long r0 = r0.c     // Catch:{ IOException -> 0x020e }
            r2.writeLong(r0)     // Catch:{ IOException -> 0x020e }
            r20.release()     // Catch:{ all -> 0x00a6 }
            r2.close()     // Catch:{ IOException -> 0x00a3, SecurityException -> 0x0249 }
            r0 = 4
            r1 = 2
            r2 = 1
            if (r6 == r2) goto L_0x0111
            if (r6 == r1) goto L_0x010f
            r2 = 4
            goto L_0x0112
        L_0x010f:
            r2 = 3
            goto L_0x0112
        L_0x0111:
            r2 = 2
        L_0x0112:
            ihs r6 = defpackage.ihs.b()
            r12 = 1
            iwu r6 = defpackage.iwv.a((android.content.Context) r6, (boolean) r12)
            boolean r12 = r6.b()
            if (r12 == 0) goto L_0x0268
            aohs r12 = defpackage.aohs.l
            aucd r12 = r12.o()
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x012c
            goto L_0x0132
        L_0x012c:
            r12.c()
            r13 = 0
            r12.c = r13
        L_0x0132:
            aucj r13 = r12.b
            aohs r13 = (defpackage.aohs) r13
            int r14 = r13.a
            r15 = 1
            r14 = r14 | r15
            r13.a = r14
            r13.b = r3
            r5.getClass()
            r1 = r1 | r14
            r13.a = r1
            r13.c = r5
            int r2 = r2 + -1
            r13.d = r2
            r0 = r0 | r1
            r13.a = r0
            r0 = r0 | 8
            r13.a = r0
            r13.e = r7
            r0 = r0 | 16
            r13.a = r0
            r13.f = r8
            r0 = r0 | 32
            r13.a = r0
            r13.g = r9
            r0 = r0 | 64
            r13.a = r0
            r13.h = r10
            r0 = r0 | 128(0x80, float:1.794E-43)
            r13.a = r0
            r1 = r25
            r13.i = r1
            r0 = r0 | 256(0x100, float:3.59E-43)
            r13.a = r0
            r1 = r24
            r13.j = r1
            r0 = r0 | 512(0x200, float:7.175E-43)
            r13.a = r0
            r0 = r23
            r13.k = r0
            aucj r0 = r12.i()
            aohs r0 = (defpackage.aohs) r0
            aohl r1 = defpackage.aohl.u
            aucd r1 = r1.o()
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x018e
            goto L_0x0194
        L_0x018e:
            r1.c()
            r2 = 0
            r1.c = r2
        L_0x0194:
            aucj r2 = r1.b
            aohl r2 = (defpackage.aohl) r2
            r0.getClass()
            aucx r3 = r2.r
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x01ab
            aucx r3 = r2.r
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)
            r2.r = r3
        L_0x01ab:
            aucx r2 = r2.r
            r2.add(r0)
            aucj r0 = r1.i()
            aohl r0 = (defpackage.aohl) r0
            axdm r1 = defpackage.axdm.a
            axdn r1 = r1.a()
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x01c5
            avsd r1 = defpackage.avsd.UNMETERED_OR_DAILY
            goto L_0x01c7
        L_0x01c5:
            avsd r1 = defpackage.avsd.UNMETERED_ONLY
        L_0x01c7:
            ihs r2 = defpackage.ihs.b()
            java.util.List r2 = r6.a(r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0268
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            hol r2 = (defpackage.hol) r2
            hoi r0 = r2.a((defpackage.audx) r0)
            r2 = 21
            r0.b((int) r2)
            r0.f = r1
            r0.b()
            return
        L_0x01eb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x020e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x020e }
            r4 = 31
            r3.<init>(r4)     // Catch:{ IOException -> 0x020e }
            java.lang.String r4 = "unexpected version: "
            r3.append(r4)     // Catch:{ IOException -> 0x020e }
            r3.append(r1)     // Catch:{ IOException -> 0x020e }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x020e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x020e }
            throw r0     // Catch:{ IOException -> 0x020e }
        L_0x0204:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x020e }
            java.lang.String r1 = "state is invalid"
            r0.<init>(r1)     // Catch:{ IOException -> 0x020e }
            throw r0     // Catch:{ IOException -> 0x020e }
        L_0x020c:
            r0 = move-exception
            goto L_0x0213
        L_0x020e:
            r0 = move-exception
            goto L_0x0219
        L_0x0210:
            r0 = move-exception
            r22 = r1
        L_0x0213:
            r3 = r17
            goto L_0x022f
        L_0x0216:
            r0 = move-exception
            r22 = r1
        L_0x0219:
            java.lang.String r1 = "unable update sample counter"
            r3 = r17
            android.util.Log.e(r3, r1, r0)     // Catch:{ all -> 0x022e }
            boolean r1 = r22.delete()     // Catch:{ all -> 0x022e }
            if (r1 == 0) goto L_0x022d
            r20.release()     // Catch:{ all -> 0x0233 }
            r2.close()     // Catch:{ IOException -> 0x0247, SecurityException -> 0x0245 }
            return
        L_0x022d:
            throw r0     // Catch:{ all -> 0x022e }
        L_0x022e:
            r0 = move-exception
        L_0x022f:
            r20.release()     // Catch:{ all -> 0x0233 }
            throw r0     // Catch:{ all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            goto L_0x023a
        L_0x0235:
            r0 = move-exception
            r22 = r1
            r3 = r17
        L_0x023a:
            r1 = r0
        L_0x023b:
            r2.close()     // Catch:{ all -> 0x023f }
            goto L_0x0244
        L_0x023f:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ IOException -> 0x0247, SecurityException -> 0x0245 }
        L_0x0244:
            throw r1     // Catch:{ IOException -> 0x0247, SecurityException -> 0x0245 }
        L_0x0245:
            r0 = move-exception
            goto L_0x024c
        L_0x0247:
            r0 = move-exception
            goto L_0x0257
        L_0x0249:
            r0 = move-exception
            r3 = r17
        L_0x024c:
            java.lang.String r1 = "unable to access state file"
            android.util.Log.e(r3, r1, r0)
            return
        L_0x0252:
            r0 = move-exception
            r22 = r1
        L_0x0255:
            r3 = r17
        L_0x0257:
            java.lang.String r1 = "unable check sample counter"
            android.util.Log.e(r3, r1, r0)
            boolean r0 = r22.delete()
            if (r0 != 0) goto L_0x0268
            java.lang.String r0 = "unable to delete state file"
            android.util.Log.e(r3, r0)
            return
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jct.run():void");
    }
}
