package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: baoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baoh implements banz {
    final baoc a = new baoc(this.c);
    private final batf b;
    private final baof c = new baof(this.b);

    public baoh(batf batf) {
        this.b = batf;
    }

    private final List a(int i, short s, byte b2, int i2) {
        baof baof = this.c;
        baof.d = i;
        baof.a = i;
        baof.e = s;
        baof.b = b2;
        baof.c = i2;
        baoc baoc = this.a;
        while (!baoc.b.b()) {
            byte e = baoc.b.e() & 255;
            if (e == 128) {
                throw new IOException("index == 0");
            } else if ((e & 128) == 128) {
                int a2 = baoc.a(e, 127) - 1;
                if (baoc.c(a2)) {
                    baoc.a.add(baoe.b[a2]);
                } else {
                    int a3 = baoc.a(a2 - baoe.b.length);
                    if (a3 >= 0) {
                        baob[] baobArr = baoc.e;
                        if (a3 <= baobArr.length - 1) {
                            baoc.a.add(baobArr[a3]);
                        }
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Header index too large ");
                    sb.append(a2 + 1);
                    throw new IOException(sb.toString());
                }
            } else if (e == 64) {
                batg b3 = baoc.b();
                baoe.a(b3);
                baoc.a(new baob(b3, baoc.b()));
            } else if ((e & 64) == 64) {
                baoc.a(new baob(baoc.b(baoc.a(e, 63) - 1), baoc.b()));
            } else if ((e & 32) == 32) {
                int a4 = baoc.a(e, 31);
                baoc.d = a4;
                if (a4 < 0 || a4 > baoc.c) {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Invalid dynamic table size update ");
                    sb2.append(a4);
                    throw new IOException(sb2.toString());
                }
                baoc.a();
            } else if (e == 16 || e == 0) {
                batg b4 = baoc.b();
                baoe.a(b4);
                baoc.a.add(new baob(b4, baoc.b()));
            } else {
                baoc.a.add(new baob(baoc.b(baoc.a(e, 15) - 1), baoc.b()));
            }
        }
        baoc baoc2 = this.a;
        ArrayList arrayList = new ArrayList(baoc2.a);
        baoc2.a.clear();
        return arrayList;
    }

    public final void close() {
        this.b.close();
    }

    private final void a() {
        this.b.g();
        this.b.e();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean a(defpackage.bams r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = 0
            batf r0 = r1.b     // Catch:{ IOException -> 0x0800 }
            r4 = 9
            r0.a((long) r4)     // Catch:{ IOException -> 0x0800 }
            batf r0 = r1.b
            int r0 = defpackage.baoj.a(r0)
            r4 = 16384(0x4000, float:2.2959E-41)
            r5 = 1
            if (r0 > r4) goto L_0x07f0
            batf r6 = r1.b
            byte r6 = r6.e()
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            batf r7 = r1.b
            byte r7 = r7.e()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            batf r8 = r1.b
            int r8 = r8.g()
            r9 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r9
            java.util.logging.Logger r10 = defpackage.baoj.a
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            boolean r10 = r10.isLoggable(r11)
            if (r10 != 0) goto L_0x003e
            goto L_0x004d
        L_0x003e:
            java.util.logging.Logger r10 = defpackage.baoj.a
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            java.lang.String r12 = defpackage.baog.a(r5, r8, r0, r6, r7)
            java.lang.String r13 = "io.grpc.okhttp.internal.framed.Http2$Reader"
            java.lang.String r14 = "nextFrame"
            r10.logp(r11, r13, r14, r12)
        L_0x004d:
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r12 = 2
            r13 = 0
            r4 = 8
            r9 = 4
            r15 = 0
            switch(r6) {
                case 0: goto L_0x0720;
                case 1: goto L_0x05a4;
                case 2: goto L_0x0582;
                case 3: goto L_0x04fd;
                case 4: goto L_0x0389;
                case 5: goto L_0x02f7;
                case 6: goto L_0x0211;
                case 7: goto L_0x010e;
                case 8: goto L_0x0062;
                default: goto L_0x005a;
            }
        L_0x005a:
            batf r2 = r1.b
            long r3 = (long) r0
            r2.h(r3)
            goto L_0x07ef
        L_0x0062:
            if (r0 != r9) goto L_0x00ff
            batf r0 = r1.b
            int r0 = r0.g()
            long r6 = (long) r0
            long r6 = r6 & r10
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00f6
            bamw r0 = r2.a
            r0.a((int) r5, (int) r8, (long) r6)
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            bamt r0 = r2.d
            java.util.logging.Logger r4 = defpackage.bamt.a
            java.lang.Object r4 = r0.j
            monitor-enter(r4)
            if (r8 == 0) goto L_0x00c4
            bamt r0 = r2.d     // Catch:{ all -> 0x00cf }
            java.util.Map r0 = r0.k     // Catch:{ all -> 0x00cf }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00cf }
            baml r0 = (defpackage.baml) r0     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x009d
            bamt r0 = r2.d     // Catch:{ all -> 0x00cf }
            boolean r0 = r0.a((int) r8)     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x009c
            r3 = 1
            goto L_0x00a5
        L_0x009c:
            goto L_0x00a5
        L_0x009d:
            bamt r9 = r2.d     // Catch:{ all -> 0x00cf }
            banf r9 = r9.i     // Catch:{ all -> 0x00cf }
            int r7 = (int) r6     // Catch:{ all -> 0x00cf }
            r9.a(r0, r7)     // Catch:{ all -> 0x00cf }
        L_0x00a5:
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x07ef
            bamt r0 = r2.d
            bany r2 = defpackage.bany.PROTOCOL_ERROR
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 54
            r3.<init>(r4)
            java.lang.String r4 = "Received window_update for unknown stream: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r0.a(r2, r3)
            goto L_0x07ef
        L_0x00c4:
            bamt r0 = r2.d     // Catch:{ all -> 0x00cf }
            banf r0 = r0.i     // Catch:{ all -> 0x00cf }
            int r2 = (int) r6     // Catch:{ all -> 0x00cf }
            r0.a(r15, r2)     // Catch:{ all -> 0x00cf }
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
            goto L_0x07ef
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
            throw r0
        L_0x00d2:
            java.lang.String r0 = "Received 0 flow control window increment."
            if (r8 != 0) goto L_0x00e1
            bamt r2 = r2.d
            bany r3 = defpackage.bany.PROTOCOL_ERROR
            java.util.logging.Logger r4 = defpackage.bamt.a
            r2.a(r3, r0)
            goto L_0x07ef
        L_0x00e1:
            bamt r10 = r2.d
            babj r2 = defpackage.babj.n
            babj r12 = r2.a((java.lang.String) r0)
            baeg r13 = defpackage.baeg.PROCESSED
            r14 = 0
            bany r15 = defpackage.bany.PROTOCOL_ERROR
            r16 = 0
            r11 = r8
            r10.a(r11, r12, r13, r14, r15, r16)
            goto L_0x07ef
        L_0x00f6:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "windowSizeIncrement was 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x00ff:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x010e:
            if (r0 < r4) goto L_0x0202
            if (r8 != 0) goto L_0x01f9
            batf r4 = r1.b
            int r4 = r4.g()
            batf r6 = r1.b
            int r6 = r6.g()
            int r0 = r0 + -8
            bany r7 = defpackage.bany.a(r6)
            if (r7 == 0) goto L_0x01ea
            batg r6 = defpackage.batg.b
            if (r0 <= 0) goto L_0x0132
            batf r6 = r1.b
            long r8 = (long) r0
            batg r6 = r6.d(r8)
            goto L_0x0133
        L_0x0132:
        L_0x0133:
            bamw r0 = r2.a
            r0.a(r5, r4, r7, r6)
            bany r0 = defpackage.bany.ENHANCE_YOUR_CALM
            if (r7 != r0) goto L_0x0166
            java.lang.String r0 = r6.a()
            java.util.logging.Logger r8 = defpackage.bamt.a
            java.util.logging.Level r9 = java.util.logging.Level.WARNING
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r10[r3] = r2
            r10[r5] = r0
            java.lang.String r3 = "%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s"
            java.lang.String r3 = java.lang.String.format(r3, r10)
            java.lang.String r10 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r11 = "goAway"
            r8.logp(r9, r10, r11, r3)
            java.lang.String r3 = "too_many_pings"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0166
            bamt r0 = r2.d
            java.lang.Runnable r0 = r0.B
            r0.run()
        L_0x0166:
            int r0 = r7.s
            long r7 = (long) r0
            bagr[] r0 = defpackage.bagr.o
            int r0 = r0.length
            long r9 = (long) r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x017b
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x017b
            bagr[] r0 = defpackage.bagr.o
            int r3 = (int) r7
            r0 = r0[r3]
            goto L_0x017c
        L_0x017b:
            r0 = r15
        L_0x017c:
            if (r0 != 0) goto L_0x01c8
            bagr r0 = defpackage.bagr.INTERNAL_ERROR
            babj r0 = r0.p
            babg r0 = r0.r
            int r0 = r0.r
            java.util.List r3 = defpackage.babj.a
            int r3 = r3.size()
            if (r0 <= r3) goto L_0x01a8
            babj r3 = defpackage.babj.d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 24
            r9.<init>(r10)
            java.lang.String r10 = "Unknown code "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            babj r0 = r3.a((java.lang.String) r0)
            goto L_0x01b0
        L_0x01a8:
            java.util.List r3 = defpackage.babj.a
            java.lang.Object r0 = r3.get(r0)
            babj r0 = (defpackage.babj) r0
        L_0x01b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r9 = 52
            r3.<init>(r9)
            java.lang.String r9 = "Unrecognized HTTP/2 error code: "
            r3.append(r9)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            babj r0 = r0.a((java.lang.String) r3)
            goto L_0x01ca
        L_0x01c8:
            babj r0 = r0.p
        L_0x01ca:
            java.lang.String r3 = "Received Goaway"
            babj r0 = r0.b((java.lang.String) r3)
            int r3 = r6.e()
            if (r3 <= 0) goto L_0x01e0
            java.lang.String r3 = r6.a()
            babj r0 = r0.b((java.lang.String) r3)
            goto L_0x01e1
        L_0x01e0:
        L_0x01e1:
            bamt r2 = r2.d
            java.util.logging.Logger r3 = defpackage.bamt.a
            r2.a((int) r4, (defpackage.bany) r15, (defpackage.babj) r0)
            goto L_0x07ef
        L_0x01ea:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0[r3] = r2
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x01f9:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x0202:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x0211:
            if (r0 != r4) goto L_0x02e8
            if (r8 != 0) goto L_0x02df
            batf r0 = r1.b
            int r0 = r0.g()
            batf r4 = r1.b
            int r4 = r4.g()
            long r8 = (long) r0
            r6 = 32
            long r8 = r8 << r6
            long r10 = (long) r4
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r13
            long r8 = r8 | r10
            bamw r6 = r2.a
            r6.a((int) r5, (long) r8)
            r6 = r7 & 1
            if (r6 != 0) goto L_0x024a
            bamt r3 = r2.d
            java.util.logging.Logger r6 = defpackage.bamt.a
            java.lang.Object r6 = r3.j
            monitor-enter(r6)
            bamt r2 = r2.d     // Catch:{ all -> 0x0247 }
            bamd r2 = r2.h     // Catch:{ all -> 0x0247 }
            r2.a((boolean) r5, (int) r0, (int) r4)     // Catch:{ all -> 0x0247 }
            monitor-exit(r6)     // Catch:{ all -> 0x0247 }
            goto L_0x07ef
        L_0x0247:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0247 }
            throw r0
        L_0x024a:
            bamt r0 = r2.d
            java.util.logging.Logger r4 = defpackage.bamt.a
            java.lang.Object r4 = r0.j
            monitor-enter(r4)
            bamt r0 = r2.d     // Catch:{ all -> 0x02dc }
            bagz r6 = r0.q     // Catch:{ all -> 0x02dc }
            if (r6 == 0) goto L_0x0287
            long r10 = r6.a     // Catch:{ all -> 0x02dc }
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0284
            java.util.logging.Logger r0 = defpackage.bamt.a     // Catch:{ all -> 0x02dc }
            java.util.logging.Level r6 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x02dc }
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x02dc }
            bamt r2 = r2.d     // Catch:{ all -> 0x02dc }
            bagz r2 = r2.q     // Catch:{ all -> 0x02dc }
            long r10 = r2.a     // Catch:{ all -> 0x02dc }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02dc }
            r7[r3] = r2     // Catch:{ all -> 0x02dc }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x02dc }
            r7[r5] = r2     // Catch:{ all -> 0x02dc }
            java.lang.String r2 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r3 = "ping"
            java.lang.String r8 = "Received unexpected ping ack. Expecting %d, got %d"
            java.lang.String r7 = java.lang.String.format(r8, r7)     // Catch:{ all -> 0x02dc }
            r0.logp(r6, r2, r3, r7)     // Catch:{ all -> 0x02dc }
            r6 = r15
            goto L_0x0295
        L_0x0284:
            r0.q = r15     // Catch:{ all -> 0x02dc }
            goto L_0x0295
        L_0x0287:
            java.util.logging.Logger r0 = defpackage.bamt.a     // Catch:{ all -> 0x02dc }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x02dc }
            java.lang.String r3 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r6 = "ping"
            java.lang.String r7 = "Received unexpected ping ack. No ping outstanding"
            r0.logp(r2, r3, r6, r7)     // Catch:{ all -> 0x02dc }
            r6 = r15
        L_0x0295:
            monitor-exit(r4)     // Catch:{ all -> 0x02dc }
            if (r6 == 0) goto L_0x07ef
            monitor-enter(r6)
            boolean r0 = r6.d     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x02d6
            r6.d = r5     // Catch:{ all -> 0x02d9 }
            amsn r0 = r6.b     // Catch:{ all -> 0x02d9 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02d9 }
            long r2 = r0.a((java.util.concurrent.TimeUnit) r2)     // Catch:{ all -> 0x02d9 }
            r6.f = r2     // Catch:{ all -> 0x02d9 }
            java.util.Map r0 = r6.c     // Catch:{ all -> 0x02d9 }
            r6.c = r15     // Catch:{ all -> 0x02d9 }
            monitor-exit(r6)     // Catch:{ all -> 0x02d9 }
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02b6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x07ef
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            java.lang.Object r2 = r2.getKey()
            baia r2 = (defpackage.baia) r2
            java.lang.Runnable r2 = defpackage.bagz.a()
            defpackage.bagz.a(r3, r2)
            goto L_0x02b6
        L_0x02d6:
            monitor-exit(r6)     // Catch:{ all -> 0x02d9 }
            goto L_0x07ef
        L_0x02d9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02d9 }
            throw r0
        L_0x02dc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02dc }
            throw r0
        L_0x02df:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "TYPE_PING streamId != 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x02e8:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_PING length != 8: %s"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x02f7:
            if (r8 == 0) goto L_0x0380
            r4 = r7 & 8
            if (r4 == 0) goto L_0x0306
            batf r3 = r1.b
            byte r3 = r3.e()
            r3 = r3 & 255(0xff, float:3.57E-43)
            goto L_0x0307
        L_0x0306:
        L_0x0307:
            batf r4 = r1.b
            int r4 = r4.g()
            r6 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r6
            short r3 = (short) r3
            int r0 = r0 + -4
            int r0 = defpackage.baoj.a(r0, r7, r3)
            java.util.List r0 = r1.a(r0, r3, r7, r8)
            bamw r3 = r2.a
            boolean r6 = r3.a()
            if (r6 == 0) goto L_0x036a
            java.util.logging.Logger r6 = r3.a
            java.util.logging.Level r3 = r3.b
            java.lang.String r7 = defpackage.bamu.a(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r9 = r7.length()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r9 = r9 + 73
            int r9 = r9 + r10
            r11.<init>(r9)
            r11.append(r7)
            java.lang.String r7 = " PUSH_PROMISE: streamId="
            r11.append(r7)
            r11.append(r8)
            java.lang.String r7 = " promisedStreamId="
            r11.append(r7)
            r11.append(r4)
            java.lang.String r4 = " headers="
            r11.append(r4)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            java.lang.String r4 = "io.grpc.okhttp.OkHttpFrameLogger"
            java.lang.String r7 = "logPushPromise"
            r6.logp(r3, r4, r7, r0)
        L_0x036a:
            bamt r0 = r2.d
            java.util.logging.Logger r3 = defpackage.bamt.a
            java.lang.Object r4 = r0.j
            monitor-enter(r4)
            bamt r0 = r2.d     // Catch:{ all -> 0x037d }
            bamd r0 = r0.h     // Catch:{ all -> 0x037d }
            bany r2 = defpackage.bany.PROTOCOL_ERROR     // Catch:{ all -> 0x037d }
            r0.a((int) r8, (defpackage.bany) r2)     // Catch:{ all -> 0x037d }
            monitor-exit(r4)     // Catch:{ all -> 0x037d }
            goto L_0x07ef
        L_0x037d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x037d }
            throw r0
        L_0x0380:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x0389:
            if (r8 != 0) goto L_0x04f4
            r4 = r7 & 1
            if (r4 != 0) goto L_0x04e7
            int r4 = r0 % 6
            if (r4 != 0) goto L_0x04d8
            baom r4 = new baom
            r4.<init>()
            r6 = 0
        L_0x0399:
            r7 = 7
            if (r6 < r0) goto L_0x0481
            bamw r0 = r2.a
            r0.a((int) r5, (defpackage.baom) r4)
            bamt r0 = r2.d
            java.util.logging.Logger r6 = defpackage.bamt.a
            java.lang.Object r8 = r0.j
            monitor-enter(r8)
            boolean r0 = r4.a(r9)     // Catch:{ all -> 0x047e }
            if (r0 == 0) goto L_0x03b6
            int r0 = r4.b(r9)     // Catch:{ all -> 0x047e }
            bamt r6 = r2.d     // Catch:{ all -> 0x047e }
            r6.u = r0     // Catch:{ all -> 0x047e }
        L_0x03b6:
            boolean r0 = r4.a(r7)     // Catch:{ all -> 0x047e }
            if (r0 == 0) goto L_0x040e
            int r0 = r4.b(r7)     // Catch:{ all -> 0x047e }
            bamt r6 = r2.d     // Catch:{ all -> 0x047e }
            banf r6 = r6.i     // Catch:{ all -> 0x047e }
            if (r0 < 0) goto L_0x03f5
            int r7 = r6.c     // Catch:{ all -> 0x047e }
            int r7 = r0 - r7
            r6.c = r0     // Catch:{ all -> 0x047e }
            bamt r0 = r6.a     // Catch:{ all -> 0x047e }
            baml[] r0 = r0.d()     // Catch:{ all -> 0x047e }
            int r9 = r0.length     // Catch:{ all -> 0x047e }
            r10 = 0
        L_0x03d5:
            if (r10 >= r9) goto L_0x03ef
            r11 = r0[r10]     // Catch:{ all -> 0x047e }
            java.lang.Object r13 = r11.f     // Catch:{ all -> 0x047e }
            if (r13 != 0) goto L_0x03e7
            band r13 = new band     // Catch:{ all -> 0x047e }
            int r14 = r6.c     // Catch:{ all -> 0x047e }
            r13.<init>((defpackage.banf) r6, (defpackage.baml) r11, (int) r14)     // Catch:{ all -> 0x047e }
            r11.f = r13     // Catch:{ all -> 0x047e }
            goto L_0x03ec
        L_0x03e7:
            band r13 = (defpackage.band) r13     // Catch:{ all -> 0x047e }
            r13.a(r7)     // Catch:{ all -> 0x047e }
        L_0x03ec:
            int r10 = r10 + 1
            goto L_0x03d5
        L_0x03ef:
            if (r7 > 0) goto L_0x03f3
            r6 = 0
            goto L_0x040f
        L_0x03f3:
            r6 = 1
            goto L_0x040f
        L_0x03f5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x047e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x047e }
            r4 = 40
            r3.<init>(r4)     // Catch:{ all -> 0x047e }
            java.lang.String r4 = "Invalid initial window size: "
            r3.append(r4)     // Catch:{ all -> 0x047e }
            r3.append(r0)     // Catch:{ all -> 0x047e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x047e }
            r2.<init>(r0)     // Catch:{ all -> 0x047e }
            throw r2     // Catch:{ all -> 0x047e }
        L_0x040e:
            r6 = 0
        L_0x040f:
            boolean r0 = r2.c     // Catch:{ all -> 0x047e }
            if (r0 == 0) goto L_0x041c
            bamt r0 = r2.d     // Catch:{ all -> 0x047e }
            bajn r0 = r0.g     // Catch:{ all -> 0x047e }
            r0.a()     // Catch:{ all -> 0x047e }
            r2.c = r3     // Catch:{ all -> 0x047e }
        L_0x041c:
            bamt r0 = r2.d     // Catch:{ all -> 0x047e }
            bamd r3 = r0.h     // Catch:{ all -> 0x047e }
            bamw r0 = r3.c     // Catch:{ all -> 0x047e }
            boolean r7 = r0.a()     // Catch:{ all -> 0x047e }
            if (r7 == 0) goto L_0x044e
            java.util.logging.Logger r7 = r0.a     // Catch:{ all -> 0x047e }
            java.util.logging.Level r0 = r0.b     // Catch:{ all -> 0x047e }
            java.lang.String r9 = defpackage.bamu.a(r12)     // Catch:{ all -> 0x047e }
            int r10 = r9.length()     // Catch:{ all -> 0x047e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x047e }
            int r10 = r10 + 19
            r11.<init>(r10)     // Catch:{ all -> 0x047e }
            r11.append(r9)     // Catch:{ all -> 0x047e }
            java.lang.String r9 = " SETTINGS: ack=true"
            r11.append(r9)     // Catch:{ all -> 0x047e }
            java.lang.String r9 = "io.grpc.okhttp.OkHttpFrameLogger"
            java.lang.String r10 = "logSettingsAck"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x047e }
            r7.logp(r0, r9, r10, r11)     // Catch:{ all -> 0x047e }
        L_0x044e:
            baoa r0 = r3.b     // Catch:{ IOException -> 0x0454 }
            r0.a(r4)     // Catch:{ IOException -> 0x0454 }
            goto L_0x045a
        L_0x0454:
            r0 = move-exception
            bamc r3 = r3.a     // Catch:{ all -> 0x047e }
            r3.a(r0)     // Catch:{ all -> 0x047e }
        L_0x045a:
            if (r6 == 0) goto L_0x0463
            bamt r0 = r2.d     // Catch:{ all -> 0x047e }
            banf r0 = r0.i     // Catch:{ all -> 0x047e }
            r0.b()     // Catch:{ all -> 0x047e }
        L_0x0463:
            bamt r0 = r2.d     // Catch:{ all -> 0x047e }
            r0.c()     // Catch:{ all -> 0x047e }
            monitor-exit(r8)     // Catch:{ all -> 0x047e }
            int r0 = r4.a()
            if (r0 < 0) goto L_0x07ef
            baoc r0 = r1.a
            int r2 = r4.a()
            r0.c = r2
            r0.d = r2
            r0.a()
            goto L_0x07ef
        L_0x047e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x047e }
            throw r0
        L_0x0481:
            batf r8 = r1.b
            short r8 = r8.f()
            batf r10 = r1.b
            int r10 = r10.g()
            switch(r8) {
                case 1: goto L_0x04ce;
                case 2: goto L_0x04be;
                case 3: goto L_0x04ba;
                case 4: goto L_0x04ac;
                case 5: goto L_0x0493;
                case 6: goto L_0x04ce;
                default: goto L_0x0490;
            }
        L_0x0490:
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x04d4
        L_0x0493:
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 < r11) goto L_0x049d
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r10 > r7) goto L_0x049d
            goto L_0x04d0
        L_0x049d:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0[r3] = r2
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x04ac:
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 < 0) goto L_0x04b1
            goto L_0x04d1
        L_0x04b1:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x04ba:
            r11 = 16384(0x4000, float:2.2959E-41)
            r7 = 4
            goto L_0x04d1
        L_0x04be:
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x04d0
            if (r10 != r5) goto L_0x04c5
            goto L_0x04d0
        L_0x04c5:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x04ce:
            r11 = 16384(0x4000, float:2.2959E-41)
        L_0x04d0:
            r7 = r8
        L_0x04d1:
            r4.a(r7, r10)
        L_0x04d4:
            int r6 = r6 + 6
            goto L_0x0399
        L_0x04d8:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x04e7:
            if (r0 != 0) goto L_0x04eb
            goto L_0x07ef
        L_0x04eb:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x04f4:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x04fd:
            if (r0 != r9) goto L_0x0573
            if (r8 == 0) goto L_0x056a
            batf r0 = r1.b
            int r0 = r0.g()
            bany r4 = defpackage.bany.a(r0)
            if (r4 == 0) goto L_0x055b
            bamw r0 = r2.a
            r0.a((int) r5, (int) r8, (defpackage.bany) r4)
            babj r0 = defpackage.bamt.a((defpackage.bany) r4)
            java.lang.String r6 = "Rst Stream"
            babj r12 = r0.b((java.lang.String) r6)
            babg r0 = r12.r
            babg r6 = defpackage.babg.CANCELLED
            if (r0 == r6) goto L_0x052a
            babg r0 = r12.r
            babg r6 = defpackage.babg.DEADLINE_EXCEEDED
            if (r0 == r6) goto L_0x052a
            r14 = 0
            goto L_0x052b
        L_0x052a:
            r14 = 1
        L_0x052b:
            bamt r0 = r2.d
            java.lang.Object r6 = r0.j
            monitor-enter(r6)
            bamt r0 = r2.d     // Catch:{ all -> 0x0558 }
            java.util.Map r0 = r0.k     // Catch:{ all -> 0x0558 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0558 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0558 }
            baml r0 = (defpackage.baml) r0     // Catch:{ all -> 0x0558 }
            if (r0 == 0) goto L_0x0555
            int r0 = defpackage.bapg.a     // Catch:{ all -> 0x0558 }
            bamt r10 = r2.d     // Catch:{ all -> 0x0558 }
            bany r0 = defpackage.bany.REFUSED_STREAM     // Catch:{ all -> 0x0558 }
            if (r4 == r0) goto L_0x054b
            baeg r0 = defpackage.baeg.PROCESSED     // Catch:{ all -> 0x0558 }
            goto L_0x054d
        L_0x054b:
            baeg r0 = defpackage.baeg.REFUSED     // Catch:{ all -> 0x0558 }
        L_0x054d:
            r13 = r0
            r15 = 0
            r16 = 0
            r11 = r8
            r10.a(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0558 }
        L_0x0555:
            monitor-exit(r6)     // Catch:{ all -> 0x0558 }
            goto L_0x07ef
        L_0x0558:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0558 }
            throw r0
        L_0x055b:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x056a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x0573:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x0582:
            r2 = 5
            if (r0 != r2) goto L_0x0595
            if (r8 == 0) goto L_0x058c
            r18.a()
            goto L_0x07ef
        L_0x058c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x0595:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x05a4:
            if (r8 == 0) goto L_0x0716
            r4 = r7 & 1
            r6 = r7 & 8
            if (r6 == 0) goto L_0x05b5
            batf r6 = r1.b
            byte r6 = r6.e()
            r6 = r6 & 255(0xff, float:3.57E-43)
            goto L_0x05b6
        L_0x05b5:
            r6 = 0
        L_0x05b6:
            r9 = r7 & 32
            if (r9 == 0) goto L_0x05c0
            r18.a()
            int r0 = r0 + -5
            goto L_0x05c1
        L_0x05c0:
        L_0x05c1:
            short r6 = (short) r6
            int r0 = defpackage.baoj.a(r0, r7, r6)
            java.util.List r0 = r1.a(r0, r6, r7, r8)
            bamw r6 = r2.a
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x061e
            java.util.logging.Logger r7 = r6.a
            java.util.logging.Level r6 = r6.b
            java.lang.String r9 = defpackage.bamu.a(r5)
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r14 = r9.length()
            java.lang.String r16 = java.lang.String.valueOf(r13)
            int r16 = r16.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 55
            int r14 = r14 + r16
            r15.<init>(r14)
            r15.append(r9)
            java.lang.String r9 = " HEADERS: streamId="
            r15.append(r9)
            r15.append(r8)
            java.lang.String r9 = " headers="
            r15.append(r9)
            r15.append(r13)
            java.lang.String r9 = " endStream="
            r15.append(r9)
            if (r4 != 0) goto L_0x060f
            r9 = 0
            goto L_0x0610
        L_0x060f:
            r9 = 1
        L_0x0610:
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            java.lang.String r13 = "io.grpc.okhttp.OkHttpFrameLogger"
            java.lang.String r14 = "logHeaders"
            r7.logp(r6, r13, r14, r9)
        L_0x061e:
            bamt r6 = r2.d
            java.util.logging.Logger r7 = defpackage.bamt.a
            int r6 = r6.C
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L_0x0689
            r6 = 0
            r13 = 0
        L_0x062c:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0652
            java.lang.Object r7 = r0.get(r6)
            baob r7 = (defpackage.baob) r7
            batg r9 = r7.f
            int r9 = r9.e()
            r15 = 32
            int r9 = r9 + r15
            batg r7 = r7.g
            int r7 = r7.e()
            int r9 = r9 + r7
            r17 = r4
            long r3 = (long) r9
            long r13 = r13 + r3
            int r6 = r6 + 1
            r4 = r17
            r3 = 0
            goto L_0x062c
        L_0x0652:
            r17 = r4
            long r3 = java.lang.Math.min(r13, r10)
            int r4 = (int) r3
            bamt r3 = r2.d
            int r3 = r3.C
            if (r4 <= r3) goto L_0x068b
            babj r3 = defpackage.babj.k
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            if (r17 != 0) goto L_0x0669
            java.lang.String r7 = "header"
            goto L_0x066b
        L_0x0669:
            java.lang.String r7 = "trailer"
        L_0x066b:
            r9 = 0
            r6[r9] = r7
            bamt r7 = r2.d
            int r7 = r7.C
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r5] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r12] = r4
            java.lang.String r4 = "Response %s metadata larger than %d: %d"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            babj r15 = r3.a((java.lang.String) r4)
            goto L_0x068c
        L_0x0689:
            r17 = r4
        L_0x068b:
            r15 = 0
        L_0x068c:
            bamt r3 = r2.d
            java.lang.Object r3 = r3.j
            monitor-enter(r3)
            bamt r4 = r2.d     // Catch:{ all -> 0x0713 }
            java.util.Map r4 = r4.k     // Catch:{ all -> 0x0713 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0713 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0713 }
            baml r4 = (defpackage.baml) r4     // Catch:{ all -> 0x0713 }
            if (r4 != 0) goto L_0x06b8
            bamt r0 = r2.d     // Catch:{ all -> 0x0713 }
            boolean r0 = r0.a((int) r8)     // Catch:{ all -> 0x0713 }
            if (r0 == 0) goto L_0x06b5
            bamt r0 = r2.d     // Catch:{ all -> 0x0713 }
            bamd r0 = r0.h     // Catch:{ all -> 0x0713 }
            bany r4 = defpackage.bany.INVALID_STREAM     // Catch:{ all -> 0x0713 }
            r0.a((int) r8, (defpackage.bany) r4)     // Catch:{ all -> 0x0713 }
            r16 = 0
            goto L_0x06f4
        L_0x06b5:
            r16 = 1
            goto L_0x06f4
        L_0x06b8:
            if (r15 != 0) goto L_0x06dc
            int r6 = defpackage.bapg.a     // Catch:{ all -> 0x0713 }
            bamk r4 = r4.h     // Catch:{ all -> 0x0713 }
            if (r17 == 0) goto L_0x06ce
            byte[][] r0 = defpackage.bang.a(r0)     // Catch:{ all -> 0x0713 }
            baaf r0 = defpackage.azyz.a((byte[][]) r0)     // Catch:{ all -> 0x0713 }
            r4.b(r0)     // Catch:{ all -> 0x0713 }
            r16 = 0
            goto L_0x06f4
        L_0x06ce:
            byte[][] r0 = defpackage.bang.a(r0)     // Catch:{ all -> 0x0713 }
            baaf r0 = defpackage.azyz.a((byte[][]) r0)     // Catch:{ all -> 0x0713 }
            r4.a(r0)     // Catch:{ all -> 0x0713 }
            r16 = 0
            goto L_0x06f4
        L_0x06dc:
            if (r17 != 0) goto L_0x06e7
            bamt r0 = r2.d     // Catch:{ all -> 0x0713 }
            bamd r0 = r0.h     // Catch:{ all -> 0x0713 }
            bany r6 = defpackage.bany.CANCEL     // Catch:{ all -> 0x0713 }
            r0.a((int) r8, (defpackage.bany) r6)     // Catch:{ all -> 0x0713 }
        L_0x06e7:
            bamk r0 = r4.h     // Catch:{ all -> 0x0713 }
            baaf r4 = new baaf     // Catch:{ all -> 0x0713 }
            r4.<init>()     // Catch:{ all -> 0x0713 }
            r6 = 0
            r0.b(r15, r6, r4)     // Catch:{ all -> 0x0713 }
            r16 = 0
        L_0x06f4:
            monitor-exit(r3)     // Catch:{ all -> 0x0713 }
            if (r16 == 0) goto L_0x07ef
            bamt r0 = r2.d
            bany r2 = defpackage.bany.PROTOCOL_ERROR
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 47
            r3.<init>(r4)
            java.lang.String r4 = "Received header for unknown stream: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r0.a(r2, r3)
            goto L_0x07ef
        L_0x0713:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0713 }
            throw r0
        L_0x0716:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x0720:
            r3 = r7 & 1
            r4 = r7 & 32
            if (r4 != 0) goto L_0x07e5
            r4 = r7 & 8
            if (r4 == 0) goto L_0x0733
            batf r4 = r1.b
            byte r4 = r4.e()
            r4 = r4 & 255(0xff, float:3.57E-43)
            goto L_0x0734
        L_0x0733:
            r4 = 0
        L_0x0734:
            short r6 = (short) r4
            int r0 = defpackage.baoj.a(r0, r7, r6)
            batf r6 = r1.b
            bamw r10 = r2.a
            r7 = r6
            batv r7 = (defpackage.batv) r7
            batd r13 = r7.a
            if (r3 != 0) goto L_0x0746
            r3 = 0
            goto L_0x0747
        L_0x0746:
            r3 = 1
        L_0x0747:
            r11 = 1
            r12 = r8
            r14 = r0
            r15 = r3
            r10.a(r11, r12, r13, r14, r15)
            bamt r9 = r2.d
            baml r9 = r9.b((int) r8)
            if (r9 != 0) goto L_0x0794
            bamt r3 = r2.d
            boolean r3 = r3.a((int) r8)
            if (r3 == 0) goto L_0x0777
            bamt r3 = r2.d
            java.util.logging.Logger r7 = defpackage.bamt.a
            java.lang.Object r3 = r3.j
            monitor-enter(r3)
            bamt r7 = r2.d     // Catch:{ all -> 0x0774 }
            bamd r7 = r7.h     // Catch:{ all -> 0x0774 }
            bany r9 = defpackage.bany.INVALID_STREAM     // Catch:{ all -> 0x0774 }
            r7.a((int) r8, (defpackage.bany) r9)     // Catch:{ all -> 0x0774 }
            monitor-exit(r3)     // Catch:{ all -> 0x0774 }
            long r7 = (long) r0
            r6.h(r7)
            goto L_0x07b1
        L_0x0774:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0774 }
            throw r0
        L_0x0777:
            bamt r0 = r2.d
            bany r2 = defpackage.bany.PROTOCOL_ERROR
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r6 = 45
            r3.<init>(r6)
            java.lang.String r6 = "Received data for unknown stream: "
            r3.append(r6)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.util.logging.Logger r6 = defpackage.bamt.a
            r0.a(r2, r3)
            goto L_0x07db
        L_0x0794:
            long r10 = (long) r0
            r6.a((long) r10)
            batd r6 = new batd
            r6.<init>()
            batd r7 = r7.a
            r6.a((defpackage.batd) r7, (long) r10)
            int r7 = defpackage.bapg.a
            bamt r7 = r2.d
            java.util.logging.Logger r8 = defpackage.bamt.a
            java.lang.Object r7 = r7.j
            monitor-enter(r7)
            bamk r8 = r9.h     // Catch:{ all -> 0x07e2 }
            r8.a(r6, r3)     // Catch:{ all -> 0x07e2 }
            monitor-exit(r7)     // Catch:{ all -> 0x07e2 }
        L_0x07b1:
            bamt r3 = r2.d
            int r6 = r3.m
            int r6 = r6 + r0
            r3.m = r6
            float r0 = (float) r6
            int r6 = r3.f
            float r6 = (float) r6
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x07db
            java.lang.Object r3 = r3.j
            monitor-enter(r3)
            bamt r0 = r2.d     // Catch:{ all -> 0x07d8 }
            bamd r6 = r0.h     // Catch:{ all -> 0x07d8 }
            int r0 = r0.m     // Catch:{ all -> 0x07d8 }
            long r7 = (long) r0     // Catch:{ all -> 0x07d8 }
            r9 = 0
            r6.a((int) r9, (long) r7)     // Catch:{ all -> 0x07d8 }
            monitor-exit(r3)     // Catch:{ all -> 0x07d8 }
            bamt r0 = r2.d
            r0.m = r9
            goto L_0x07db
        L_0x07d8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x07d8 }
            throw r0
        L_0x07db:
            batf r0 = r1.b
            long r2 = (long) r4
            r0.h(r2)
            goto L_0x07ef
        L_0x07e2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x07e2 }
            throw r0
        L_0x07e5:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.io.IOException r0 = defpackage.baoj.b(r2, r0)
            throw r0
        L_0x07ef:
            return r5
        L_0x07f0:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r0 = defpackage.baoj.b(r0, r2)
            throw r0
        L_0x0800:
            r0 = move-exception
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baoh.a(bams):boolean");
    }
}
