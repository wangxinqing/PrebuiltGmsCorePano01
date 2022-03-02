package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: athr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athr extends athp implements Runnable, athq {
    public final atht a;
    public volatile int b = 1536;
    public volatile int c = -1;
    public long d;
    private long e = 20000;
    private String f = "GET";
    private String g;
    private final String h;
    private final ArrayList i;
    private DataInputStream j;
    private String k;
    private long l;
    private int m;
    private byte[] n;
    private aqei o;

    public athr(atht atht, String str) {
        this.a = atht;
        this.h = str;
        this.i = new ArrayList();
    }

    private final boolean p() {
        return this.n != null;
    }

    public final synchronized int a() {
        bp();
        return this.m;
    }

    public final synchronized void a(String str) {
        this.f = str;
    }

    public final synchronized void a(byte[] bArr) {
        this.n = bArr;
    }

    public final synchronized void b() {
        if (g()) {
            aqeg.a((InputStream) this.j);
            aqeg.a(this.o);
            super.b();
        }
    }

    public final synchronized void b(String str) {
        this.g = str;
    }

    public final synchronized long e() {
        bp();
        return this.l;
    }

    public final synchronized String h() {
        bp();
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final synchronized void i() {
        this.d = System.currentTimeMillis();
        super.i();
    }

    public final synchronized DataInputStream j() {
        bp();
        return this.j;
    }

    public final synchronized void k() {
        this.e = 20000;
    }

    public final synchronized long n() {
        return this.e;
    }

    public final synchronized void o() {
        if (bq() == 1) {
            a((Exception) new athv());
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r12 = this;
            atht r0 = r12.a
            aqep r0 = r0.a
            aths r1 = new aths
            r1.<init>(r0)
            r1.d = r12
            long r2 = r12.n()
            r1.a(r2)
            r1.f()
            int r0 = r12.b
            android.net.TrafficStats.setThreadStatsTag(r0)
            int r0 = r12.c
            r2 = -1
            if (r0 == r2) goto L_0x0024
            int r0 = r12.c
            android.net.TrafficStats.setThreadStatsUid(r0)
        L_0x0024:
            r0 = 1
            r2 = 0
            monitor-enter(r12)     // Catch:{ Exception -> 0x01de, all -> 0x01da }
            r12.br()     // Catch:{ all -> 0x01d7 }
            r12.i()     // Catch:{ all -> 0x01d7 }
            monitor-exit(r12)     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = r12.f     // Catch:{ Exception -> 0x01de, all -> 0x01da }
            java.lang.String r4 = "POST"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x01de, all -> 0x01da }
            java.lang.String r4 = r12.h     // Catch:{ Exception -> 0x01de, all -> 0x01da }
            aqei r5 = new aqei     // Catch:{ Exception -> 0x01de, all -> 0x01da }
            r5.<init>(r4, r3)     // Catch:{ Exception -> 0x01de, all -> 0x01da }
            monitor-enter(r12)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            boolean r3 = r12.f()     // Catch:{ all -> 0x01cc }
            if (r3 == 0) goto L_0x01bb
            r12.o = r5     // Catch:{ all -> 0x01cc }
            r12.i()     // Catch:{ all -> 0x01cc }
            monitor-exit(r12)     // Catch:{ all -> 0x01cc }
            java.lang.String r3 = r12.g     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            if (r3 != 0) goto L_0x0056
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/binary"
            r5.a(r3, r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            goto L_0x005b
        L_0x0056:
            java.lang.String r4 = "Content-Type"
            r5.a(r4, r3)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
        L_0x005b:
            java.util.ArrayList r3 = r12.i     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
        L_0x0061:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r6 = 0
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r6 = r4[r6]     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r4 = r4[r0]     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r5.a(r6, r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            goto L_0x0061
        L_0x0076:
            boolean r3 = r12.p()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = "Content-Length"
            byte[] r4 = r12.n     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            if (r4 == 0) goto L_0x0084
            int r6 = r4.length     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            goto L_0x0085
        L_0x0084:
        L_0x0085:
            java.lang.String r4 = java.lang.Integer.toString(r6)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r5.a(r3, r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            boolean r3 = r5.b     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r5.c     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            if (r3 != 0) goto L_0x00a7
            r5.c = r0     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.net.HttpURLConnection r6 = r5.a     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.io.OutputStream r6 = r6.getOutputStream()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r4.<init>(r6)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            goto L_0x0103
        L_0x00a7:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.net.HttpURLConnection r4 = r5.a     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.net.URL r4 = r4.getURL()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            int r6 = r6.length()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            int r6 = r6 + 38
            r7.<init>(r6)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r6 = "The output stream to "
            r7.append(r6)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r7.append(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r4 = " has been opened."
            r7.append(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            throw r3     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
        L_0x00d7:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.net.HttpURLConnection r4 = r5.a     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.net.URL r4 = r4.getURL()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            int r6 = r6.length()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            int r6 = r6 + 37
            r7.<init>(r6)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r6 = "Can't open output stream on a GET to "
            r7.append(r6)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r7.append(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            r3.<init>(r4)     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
            throw r3     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
        L_0x0102:
            r3 = r2
        L_0x0103:
            boolean r4 = r12.p()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            if (r4 != 0) goto L_0x010a
            goto L_0x0114
        L_0x010a:
            byte[] r4 = r12.n     // Catch:{ all -> 0x01b0 }
            if (r4 == 0) goto L_0x0111
            r3.write(r4)     // Catch:{ all -> 0x01b0 }
        L_0x0111:
            defpackage.aqeg.a((java.io.OutputStream) r3)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
        L_0x0114:
            java.net.HttpURLConnection r4 = r5.a     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            int r4 = r4.getResponseCode()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.net.HttpURLConnection r6 = r5.a     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            int r6 = r6.getContentLength()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            long r6 = (long) r6     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.net.HttpURLConnection r8 = r5.a     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.String r8 = r8.getContentType()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            if (r8 == 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            java.lang.String r8 = ""
        L_0x012c:
            boolean r9 = r5.d     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            if (r9 != 0) goto L_0x0180
            r5.d = r0     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.io.DataInputStream r9 = new java.io.DataInputStream     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.net.HttpURLConnection r11 = r5.a     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            r12.i()     // Catch:{ Exception -> 0x017d, all -> 0x0179 }
            monitor-enter(r12)     // Catch:{ Exception -> 0x017d, all -> 0x0179 }
            boolean r2 = r12.f()     // Catch:{ all -> 0x0176 }
            if (r2 == 0) goto L_0x0162
            r12.m = r4     // Catch:{ all -> 0x0176 }
            r12.l = r6     // Catch:{ all -> 0x0176 }
            r12.k = r8     // Catch:{ all -> 0x0176 }
            r12.j = r9     // Catch:{ all -> 0x0176 }
            r12.bs()     // Catch:{ all -> 0x0176 }
            monitor-exit(r12)     // Catch:{ all -> 0x0176 }
            r1.a()
            android.net.TrafficStats.clearThreadStatsTag()
            android.net.TrafficStats.clearThreadStatsUid()
            return
        L_0x0162:
            monitor-exit(r12)     // Catch:{ all -> 0x0176 }
        L_0x0163:
            r1.a()
            android.net.TrafficStats.clearThreadStatsTag()
            android.net.TrafficStats.clearThreadStatsUid()
            defpackage.aqeg.a((java.io.InputStream) r9)
            defpackage.aqeg.a((java.io.OutputStream) r3)
        L_0x0172:
            defpackage.aqeg.a((defpackage.aqei) r5)
            return
        L_0x0176:
            r2 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0176 }
            throw r2     // Catch:{ Exception -> 0x017d, all -> 0x0179 }
        L_0x0179:
            r0 = move-exception
            r2 = r9
            goto L_0x0201
        L_0x017d:
            r2 = move-exception
            goto L_0x01e3
        L_0x0180:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.net.HttpURLConnection r6 = r5.a     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.net.URL r6 = r6.getURL()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            int r7 = r7.length()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            int r7 = r7 + 37
            r8.<init>(r7)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.String r7 = "The input stream to "
            r8.append(r7)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            r8.append(r6)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.String r6 = " has been opened."
            r8.append(r6)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            throw r4     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
        L_0x01b0:
            r4 = move-exception
            defpackage.aqeg.a((java.io.OutputStream) r3)     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
            throw r4     // Catch:{ Exception -> 0x01b7, all -> 0x01b5 }
        L_0x01b5:
            r0 = move-exception
            goto L_0x0201
        L_0x01b7:
            r4 = move-exception
            r9 = r2
            r2 = r4
            goto L_0x01e3
        L_0x01bb:
            monitor-exit(r12)     // Catch:{ all -> 0x01cc }
            r1.a()
            android.net.TrafficStats.clearThreadStatsTag()
            android.net.TrafficStats.clearThreadStatsUid()
            defpackage.aqeg.a((java.io.InputStream) r2)
            defpackage.aqeg.a((java.io.OutputStream) r2)
            goto L_0x0172
        L_0x01cc:
            r3 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01cc }
            throw r3     // Catch:{ Exception -> 0x01d2, all -> 0x01cf }
        L_0x01cf:
            r0 = move-exception
            r3 = r2
            goto L_0x0201
        L_0x01d2:
            r3 = move-exception
            r9 = r2
            r2 = r3
            r3 = r9
            goto L_0x01e3
        L_0x01d7:
            r3 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01d7 }
            throw r3     // Catch:{ Exception -> 0x01de, all -> 0x01da }
        L_0x01da:
            r0 = move-exception
            r3 = r2
            r5 = r3
            goto L_0x0201
        L_0x01de:
            r3 = move-exception
            r5 = r2
            r9 = r5
            r2 = r3
            r3 = r9
        L_0x01e3:
            monitor-enter(r12)     // Catch:{ all -> 0x01ff }
            int r4 = r12.bq()     // Catch:{ all -> 0x01fc }
            if (r4 == r0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            r12.a((java.lang.Exception) r2)     // Catch:{ all -> 0x01fc }
        L_0x01ee:
            int r0 = r12.bq()     // Catch:{ all -> 0x01fc }
            r4 = 3
            if (r0 == r4) goto L_0x01f6
            goto L_0x01f9
        L_0x01f6:
            defpackage.apev.a(r2)     // Catch:{ all -> 0x01fc }
        L_0x01f9:
            monitor-exit(r12)     // Catch:{ all -> 0x01fc }
            goto L_0x0163
        L_0x01fc:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01fc }
            throw r0     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            r0 = move-exception
            r2 = r9
        L_0x0201:
            r1.a()
            android.net.TrafficStats.clearThreadStatsTag()
            android.net.TrafficStats.clearThreadStatsUid()
            defpackage.aqeg.a((java.io.InputStream) r2)
            defpackage.aqeg.a((java.io.OutputStream) r3)
            defpackage.aqeg.a((defpackage.aqei) r5)
            goto L_0x0215
        L_0x0214:
            throw r0
        L_0x0215:
            goto L_0x0214
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.athr.run():void");
    }

    public final String toString() {
        int bq = bq();
        StringBuilder sb = new StringBuilder(19);
        sb.append("[state=");
        sb.append(bq);
        sb.append("]");
        return sb.toString();
    }
}
