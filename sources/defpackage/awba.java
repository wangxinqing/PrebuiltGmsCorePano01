package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: awba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awba extends awab implements awal {
    final awam b;
    final /* synthetic */ awbb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awba(awbb awbb, awam awam) {
        super("OkHttp %s", awbb.e);
        this.c = awbb;
        this.b = awam;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        awak awak = awak.INTERNAL_ERROR;
        awak awak2 = awak.INTERNAL_ERROR;
        try {
            if (!this.c.c) {
                this.b.a();
            }
            do {
            } while (this.b.a(this));
            awak = awak.NO_ERROR;
            try {
                try {
                    this.c.a(awak, awak.CANCEL);
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                try {
                    awak = awak.PROTOCOL_ERROR;
                    try {
                        this.c.a(awak, awak.PROTOCOL_ERROR);
                    } catch (IOException e3) {
                    }
                    awaj.a((Closeable) this.b);
                } catch (Throwable th) {
                    th = th;
                    try {
                        this.c.a(awak, awak2);
                    } catch (IOException e4) {
                    }
                    awaj.a((Closeable) this.b);
                    throw th;
                }
            }
        } catch (IOException e5) {
            awak = awak.PROTOCOL_ERROR;
            this.c.a(awak, awak.PROTOCOL_ERROR);
            awaj.a((Closeable) this.b);
        } catch (Throwable th2) {
            th = th2;
            this.c.a(awak, awak2);
            awaj.a((Closeable) this.b);
            throw th;
        }
        awaj.a((Closeable) this.b);
    }

    public final void a(int i, long j) {
        if (i != 0) {
            awbf a = this.c.a(i);
            if (a != null) {
                synchronized (a) {
                    a.a(j);
                }
                return;
            }
            return;
        }
        synchronized (this.c) {
            awbb awbb = this.c;
            awbb.k += j;
            awbb.notifyAll();
        }
    }

    public final void a(int i, awak awak) {
        if (!this.c.c(i)) {
            awbf b2 = this.c.b(i);
            if (b2 != null) {
                b2.c(awak);
                return;
            }
            return;
        }
        awbb awbb = this.c;
        awbb.i.execute(new awau(awbb, "OkHttp %s Push Reset[%s]", new Object[]{awbb.e, Integer.valueOf(i)}, i));
    }

    public final void a(int i, batg batg) {
        awbf[] awbfArr;
        batg.e();
        synchronized (this.c) {
            awbfArr = (awbf[]) this.c.d.values().toArray(new awbf[this.c.d.size()]);
            this.c.h = true;
        }
        for (awbf awbf : awbfArr) {
            if (awbf.c > i && awbf.b()) {
                awbf.c(awak.REFUSED_STREAM);
                this.c.b(awbf.c);
            }
        }
    }

    public final void a(boolean z, int i, int i2) {
        if (!z) {
            awbb awbb = this.c;
            awbb.a.execute(new awaq(awbb, "OkHttp %s ping %08x%08x", new Object[]{awbb.e, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r11 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        r0.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r11, int r12, defpackage.batf r13, int r14) {
        /*
            r10 = this;
            awbb r0 = r10.c
            boolean r0 = r0.c(r12)
            if (r0 != 0) goto L_0x007d
            awbb r0 = r10.c
            awbf r0 = r0.a((int) r12)
            if (r0 == 0) goto L_0x0071
            awbd r12 = r0.f
            long r1 = (long) r14
        L_0x0013:
            r3 = 0
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 <= 0) goto L_0x006b
            awbf r14 = r12.f
            monitor-enter(r14)
            boolean r5 = r12.e     // Catch:{ all -> 0x0068 }
            batd r6 = r12.b     // Catch:{ all -> 0x0068 }
            long r6 = r6.b     // Catch:{ all -> 0x0068 }
            long r6 = r6 + r1
            long r8 = r12.c     // Catch:{ all -> 0x0068 }
            monitor-exit(r14)     // Catch:{ all -> 0x0068 }
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x0035
            r13.h(r1)
            awbf r12 = r12.f
            awak r13 = defpackage.awak.FLOW_CONTROL_ERROR
            r12.b(r13)
            goto L_0x006b
        L_0x0035:
            if (r5 != 0) goto L_0x0064
            batd r14 = r12.a
            long r5 = r13.c(r14, r1)
            r7 = -1
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x005e
            long r1 = r1 - r5
            awbf r14 = r12.f
            monitor-enter(r14)
            batd r5 = r12.b     // Catch:{ all -> 0x005b }
            long r6 = r5.b     // Catch:{ all -> 0x005b }
            batd r8 = r12.a     // Catch:{ all -> 0x005b }
            r5.a((defpackage.baua) r8)     // Catch:{ all -> 0x005b }
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0059
            awbf r3 = r12.f     // Catch:{ all -> 0x005b }
            r3.notifyAll()     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r14)     // Catch:{ all -> 0x005b }
            goto L_0x0013
        L_0x005b:
            r11 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x005b }
            throw r11
        L_0x005e:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L_0x0064:
            r13.h(r1)
            goto L_0x006b
        L_0x0068:
            r11 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0068 }
            throw r11
        L_0x006b:
            if (r11 == 0) goto L_0x0070
            r0.e()
        L_0x0070:
            return
        L_0x0071:
            awbb r11 = r10.c
            awak r0 = defpackage.awak.INVALID_STREAM
            r11.a((int) r12, (defpackage.awak) r0)
            long r11 = (long) r14
            r13.h(r11)
            return
        L_0x007d:
            awbb r1 = r10.c
            batd r5 = new batd
            r5.<init>()
            long r2 = (long) r14
            r13.a((long) r2)
            r13.c(r5, r2)
            long r6 = r5.b
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x00b0
            java.util.concurrent.ExecutorService r11 = r1.i
            awat r13 = new awat
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            java.lang.String r2 = r1.e
            r3[r0] = r2
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r3[r0] = r2
            java.lang.String r2 = "OkHttp %s Push Data[%s]"
            r0 = r13
            r4 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.execute(r13)
            return
        L_0x00b0:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 35
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = " != "
            r12.append(r13)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            goto L_0x00cd
        L_0x00cc:
            throw r11
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awba.a(boolean, int, batf, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r10, defpackage.awbw r11) {
        /*
            r9 = this;
            awbb r0 = r9.c
            monitor-enter(r0)
            awbb r1 = r9.c     // Catch:{ all -> 0x00d4 }
            awbw r1 = r1.m     // Catch:{ all -> 0x00d4 }
            int r1 = r1.c()     // Catch:{ all -> 0x00d4 }
            r2 = 0
            if (r10 == 0) goto L_0x001d
            awbb r10 = r9.c     // Catch:{ all -> 0x00d4 }
            awbw r10 = r10.m     // Catch:{ all -> 0x00d4 }
            r10.c = r2     // Catch:{ all -> 0x00d4 }
            r10.b = r2     // Catch:{ all -> 0x00d4 }
            r10.a = r2     // Catch:{ all -> 0x00d4 }
            int[] r10 = r10.d     // Catch:{ all -> 0x00d4 }
            java.util.Arrays.fill(r10, r2)     // Catch:{ all -> 0x00d4 }
        L_0x001d:
            awbb r10 = r9.c     // Catch:{ all -> 0x00d4 }
            awbw r10 = r10.m     // Catch:{ all -> 0x00d4 }
            r3 = 0
        L_0x0022:
            r4 = 10
            if (r3 < r4) goto L_0x00bf
            awbb r10 = r9.c     // Catch:{ all -> 0x00d4 }
            avzh r10 = r10.b     // Catch:{ all -> 0x00d4 }
            avzh r3 = defpackage.avzh.HTTP_2     // Catch:{ all -> 0x00d4 }
            r4 = 1
            if (r10 != r3) goto L_0x0043
            java.util.concurrent.ExecutorService r10 = defpackage.awbb.a     // Catch:{ all -> 0x00d4 }
            awaz r3 = new awaz     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d4 }
            awbb r6 = r9.c     // Catch:{ all -> 0x00d4 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x00d4 }
            r5[r2] = r6     // Catch:{ all -> 0x00d4 }
            java.lang.String r6 = "OkHttp %s ACK Settings"
            r3.<init>(r9, r6, r5, r11)     // Catch:{ all -> 0x00d4 }
            r10.execute(r3)     // Catch:{ all -> 0x00d4 }
        L_0x0043:
            awbb r10 = r9.c     // Catch:{ all -> 0x00d4 }
            awbw r10 = r10.m     // Catch:{ all -> 0x00d4 }
            int r10 = r10.c()     // Catch:{ all -> 0x00d4 }
            r11 = -1
            r3 = 0
            r5 = 0
            if (r10 != r11) goto L_0x0053
            r10 = r5
            goto L_0x0093
        L_0x0053:
            if (r10 == r1) goto L_0x0092
            int r10 = r10 - r1
            long r10 = (long) r10     // Catch:{ all -> 0x00d4 }
            awbb r1 = r9.c     // Catch:{ all -> 0x00d4 }
            boolean r7 = r1.n     // Catch:{ all -> 0x00d4 }
            if (r7 != 0) goto L_0x006e
            long r7 = r1.k     // Catch:{ all -> 0x00d4 }
            long r7 = r7 + r10
            r1.k = r7     // Catch:{ all -> 0x00d4 }
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r1.notifyAll()     // Catch:{ all -> 0x00d4 }
        L_0x006a:
            awbb r1 = r9.c     // Catch:{ all -> 0x00d4 }
            r1.n = r4     // Catch:{ all -> 0x00d4 }
        L_0x006e:
            awbb r1 = r9.c     // Catch:{ all -> 0x00d4 }
            java.util.Map r1 = r1.d     // Catch:{ all -> 0x00d4 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00d4 }
            if (r1 != 0) goto L_0x0091
            awbb r1 = r9.c     // Catch:{ all -> 0x00d4 }
            java.util.Map r1 = r1.d     // Catch:{ all -> 0x00d4 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00d4 }
            awbb r3 = r9.c     // Catch:{ all -> 0x00d4 }
            java.util.Map r3 = r3.d     // Catch:{ all -> 0x00d4 }
            int r3 = r3.size()     // Catch:{ all -> 0x00d4 }
            awbf[] r3 = new defpackage.awbf[r3]     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ all -> 0x00d4 }
            r3 = r1
            awbf[] r3 = (defpackage.awbf[]) r3     // Catch:{ all -> 0x00d4 }
        L_0x0091:
            goto L_0x0093
        L_0x0092:
            r10 = r5
        L_0x0093:
            java.util.concurrent.ExecutorService r1 = defpackage.awbb.a     // Catch:{ all -> 0x00d4 }
            away r7 = new away     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d4 }
            awbb r8 = r9.c     // Catch:{ all -> 0x00d4 }
            java.lang.String r8 = r8.e     // Catch:{ all -> 0x00d4 }
            r4[r2] = r8     // Catch:{ all -> 0x00d4 }
            java.lang.String r8 = "OkHttp %s settings"
            r7.<init>(r8, r4)     // Catch:{ all -> 0x00d4 }
            r1.execute(r7)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            if (r3 == 0) goto L_0x00be
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00be
            int r0 = r3.length
        L_0x00af:
            if (r2 >= r0) goto L_0x00be
            r1 = r3[r2]
            monitor-enter(r1)
            r1.a((long) r10)     // Catch:{ all -> 0x00bb }
            monitor-exit(r1)     // Catch:{ all -> 0x00bb }
            int r2 = r2 + 1
            goto L_0x00af
        L_0x00bb:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bb }
            throw r10
        L_0x00be:
            return
        L_0x00bf:
            boolean r4 = r11.a(r3)     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00d0
            int r4 = r11.c(r3)     // Catch:{ all -> 0x00d4 }
            int r5 = r11.b(r3)     // Catch:{ all -> 0x00d4 }
            r10.a(r3, r4, r5)     // Catch:{ all -> 0x00d4 }
        L_0x00d0:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x00d4:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d7:
            throw r10
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awba.a(boolean, awbw):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r11 == 1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r4.e != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r11 == 3) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r4.e = r10;
        r3 = r4.a();
        r4.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r9 = defpackage.awak.PROTOCOL_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r11 == 2) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r7 = new java.util.ArrayList();
        r7.addAll(r4.e);
        r7.addAll(r10);
        r4.e = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r9 = defpackage.awak.STREAM_IN_USE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r9 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r4.b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r3 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r4.d.b(r4.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r4.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r4.b(defpackage.awak.PROTOCOL_ERROR);
        r6.c.b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8, int r9, java.util.List r10, int r11) {
        /*
            r6 = this;
            awbb r0 = r6.c
            boolean r0 = r0.c(r9)
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0026
            awbb r7 = r6.c
            java.util.concurrent.ExecutorService r8 = r7.i
            awas r10 = new awas
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r0 = r7.e
            r11[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r11[r3] = r0
            java.lang.String r0 = "OkHttp %s Push Headers[%s]"
            r10.<init>(r7, r0, r11, r9)
            r8.execute(r10)
            return
        L_0x0026:
            awbb r0 = r6.c
            monitor-enter(r0)
            awbb r4 = r6.c     // Catch:{ all -> 0x00d1 }
            boolean r5 = r4.h     // Catch:{ all -> 0x00d1 }
            if (r5 != 0) goto L_0x00cf
            awbf r4 = r4.a((int) r9)     // Catch:{ all -> 0x00d1 }
            r5 = 3
            if (r4 == 0) goto L_0x0086
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            if (r11 == r3) goto L_0x007b
            monitor-enter(r4)
            java.util.List r7 = r4.e     // Catch:{ all -> 0x0078 }
            r9 = 0
            if (r7 != 0) goto L_0x004e
            if (r11 == r5) goto L_0x004b
            r4.e = r10     // Catch:{ all -> 0x0078 }
            boolean r3 = r4.a()     // Catch:{ all -> 0x0078 }
            r4.notifyAll()     // Catch:{ all -> 0x0078 }
            goto L_0x0062
        L_0x004b:
            awak r9 = defpackage.awak.PROTOCOL_ERROR     // Catch:{ all -> 0x0078 }
            goto L_0x0062
        L_0x004e:
            if (r11 == r2) goto L_0x0060
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r7.<init>()     // Catch:{ all -> 0x0078 }
            java.util.List r11 = r4.e     // Catch:{ all -> 0x0078 }
            r7.addAll(r11)     // Catch:{ all -> 0x0078 }
            r7.addAll(r10)     // Catch:{ all -> 0x0078 }
            r4.e = r7     // Catch:{ all -> 0x0078 }
            goto L_0x0062
        L_0x0060:
            awak r9 = defpackage.awak.STREAM_IN_USE     // Catch:{ all -> 0x0078 }
        L_0x0062:
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0069
            r4.b(r9)
            goto L_0x0072
        L_0x0069:
            if (r3 != 0) goto L_0x0072
            awbb r7 = r4.d
            int r9 = r4.c
            r7.b(r9)
        L_0x0072:
            if (r8 == 0) goto L_0x0077
            r4.e()
        L_0x0077:
            return
        L_0x0078:
            r7 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            throw r7
        L_0x007b:
            awak r7 = defpackage.awak.PROTOCOL_ERROR
            r4.b(r7)
            awbb r7 = r6.c
            r7.b(r9)
            return
        L_0x0086:
            if (r11 != r2) goto L_0x0089
            goto L_0x00c6
        L_0x0089:
            if (r11 == r5) goto L_0x00c6
            awbb r10 = r6.c     // Catch:{ all -> 0x00d1 }
            int r11 = r10.f     // Catch:{ all -> 0x00d1 }
            if (r9 <= r11) goto L_0x00c4
            r11 = r9 & 1
            int r4 = r10.g     // Catch:{ all -> 0x00d1 }
            int r4 = r4 % r2
            if (r11 == r4) goto L_0x00c2
            awbf r11 = new awbf     // Catch:{ all -> 0x00d1 }
            r11.<init>(r9, r10, r7, r8)     // Catch:{ all -> 0x00d1 }
            awbb r7 = r6.c     // Catch:{ all -> 0x00d1 }
            r7.f = r9     // Catch:{ all -> 0x00d1 }
            java.util.Map r7 = r7.d     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00d1 }
            r7.put(r8, r11)     // Catch:{ all -> 0x00d1 }
            java.util.concurrent.ExecutorService r7 = defpackage.awbb.a     // Catch:{ all -> 0x00d1 }
            awax r9 = new awax     // Catch:{ all -> 0x00d1 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d1 }
            awbb r2 = r6.c     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x00d1 }
            r10[r1] = r2     // Catch:{ all -> 0x00d1 }
            r10[r3] = r8     // Catch:{ all -> 0x00d1 }
            java.lang.String r8 = "OkHttp %s stream %d"
            r9.<init>(r6, r8, r10, r11)     // Catch:{ all -> 0x00d1 }
            r7.execute(r9)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00c2:
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00c4:
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00c6:
            awbb r7 = r6.c     // Catch:{ all -> 0x00d1 }
            awak r8 = defpackage.awak.INVALID_STREAM     // Catch:{ all -> 0x00d1 }
            r7.a((int) r9, (defpackage.awak) r8)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00cf:
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            return
        L_0x00d1:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awba.a(boolean, boolean, int, java.util.List, int):void");
    }
}
