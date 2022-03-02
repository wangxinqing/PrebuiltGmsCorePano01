package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: bamq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamq implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ bamb b;
    final /* synthetic */ baon c;
    final /* synthetic */ bamt d;

    public bamq(bamt bamt, CountDownLatch countDownLatch, bamb bamb, baon baon) {
        this.d = bamt;
        this.a = countDownLatch;
        this.b = bamb;
        this.c = baon;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:99:0x02c0=Splitter:B:99:0x02c0, B:105:0x02d6=Splitter:B:105:0x02d6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.util.concurrent.CountDownLatch r0 = r14.a     // Catch:{ InterruptedException -> 0x0006 }
            r0.await()     // Catch:{ InterruptedException -> 0x0006 }
            goto L_0x000e
        L_0x0006:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000e:
            bamp r0 = new bamp
            r0.<init>()
            batf r0 = defpackage.batq.a((defpackage.baua) r0)
            r1 = 0
            bamt r2 = r14.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            azyp r3 = r2.E     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            r4 = 1
            if (r3 == 0) goto L_0x01dc
            java.net.SocketAddress r5 = r3.a     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            boolean r6 = r5 instanceof java.net.InetSocketAddress     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            if (r6 == 0) goto L_0x01a8
            java.net.InetSocketAddress r6 = r3.b     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r7 = r3.c     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r3 = r3.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            r8 = r5
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8     // Catch:{ IOException -> 0x0196 }
            java.net.InetAddress r8 = r8.getAddress()     // Catch:{ IOException -> 0x0196 }
            if (r8 != 0) goto L_0x0048
            javax.net.SocketFactory r8 = r2.s     // Catch:{ IOException -> 0x0196 }
            r9 = r5
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9     // Catch:{ IOException -> 0x0196 }
            java.lang.String r9 = r9.getHostName()     // Catch:{ IOException -> 0x0196 }
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5     // Catch:{ IOException -> 0x0196 }
            int r5 = r5.getPort()     // Catch:{ IOException -> 0x0196 }
            java.net.Socket r5 = r8.createSocket(r9, r5)     // Catch:{ IOException -> 0x0196 }
            goto L_0x005b
        L_0x0048:
            javax.net.SocketFactory r8 = r2.s     // Catch:{ IOException -> 0x0196 }
            r9 = r5
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9     // Catch:{ IOException -> 0x0196 }
            java.net.InetAddress r9 = r9.getAddress()     // Catch:{ IOException -> 0x0196 }
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5     // Catch:{ IOException -> 0x0196 }
            int r5 = r5.getPort()     // Catch:{ IOException -> 0x0196 }
            java.net.Socket r5 = r8.createSocket(r9, r5)     // Catch:{ IOException -> 0x0196 }
        L_0x005b:
            r5.setTcpNoDelay(r4)     // Catch:{ IOException -> 0x0196 }
            baua r8 = defpackage.batq.b((java.net.Socket) r5)     // Catch:{ IOException -> 0x0196 }
            batz r9 = defpackage.batq.a((java.net.Socket) r5)     // Catch:{ IOException -> 0x0196 }
            bate r9 = defpackage.batq.a((defpackage.batz) r9)     // Catch:{ IOException -> 0x0196 }
            avzc r10 = new avzc     // Catch:{ IOException -> 0x0196 }
            r10.<init>()     // Catch:{ IOException -> 0x0196 }
            java.lang.String r11 = "https"
            r10.c(r11)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r11 = r6.getHostName()     // Catch:{ IOException -> 0x0196 }
            r10.b(r11)     // Catch:{ IOException -> 0x0196 }
            int r6 = r6.getPort()     // Catch:{ IOException -> 0x0196 }
            r10.a((int) r6)     // Catch:{ IOException -> 0x0196 }
            avzd r6 = r10.b()     // Catch:{ IOException -> 0x0196 }
            avzi r10 = new avzi     // Catch:{ IOException -> 0x0196 }
            r10.<init>()     // Catch:{ IOException -> 0x0196 }
            r10.a((defpackage.avzd) r6)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r11 = r6.b     // Catch:{ IOException -> 0x0196 }
            int r6 = r6.c     // Catch:{ IOException -> 0x0196 }
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x0196 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0196 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0196 }
            int r12 = r12 + 12
            r13.<init>(r12)     // Catch:{ IOException -> 0x0196 }
            r13.append(r11)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r11 = ":"
            r13.append(r11)     // Catch:{ IOException -> 0x0196 }
            r13.append(r6)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r6 = "Host"
            java.lang.String r11 = r13.toString()     // Catch:{ IOException -> 0x0196 }
            r10.b(r6, r11)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r6 = "User-Agent"
            java.lang.String r2 = r2.d     // Catch:{ IOException -> 0x0196 }
            r10.b(r6, r2)     // Catch:{ IOException -> 0x0196 }
            if (r7 != 0) goto L_0x00c0
            goto L_0x00cb
        L_0x00c0:
            if (r3 == 0) goto L_0x00cb
            java.lang.String r2 = "Proxy-Authorization"
            java.lang.String r3 = defpackage.avyv.a(r7, r3)     // Catch:{ IOException -> 0x0196 }
            r10.b(r2, r3)     // Catch:{ IOException -> 0x0196 }
        L_0x00cb:
            avzj r2 = r10.a()     // Catch:{ IOException -> 0x0196 }
            avzd r3 = r2.a     // Catch:{ IOException -> 0x0196 }
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0196 }
            java.lang.String r10 = r3.b     // Catch:{ IOException -> 0x0196 }
            r7[r1] = r10     // Catch:{ IOException -> 0x0196 }
            int r3 = r3.c     // Catch:{ IOException -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0196 }
            r7[r4] = r3     // Catch:{ IOException -> 0x0196 }
            java.lang.String r3 = "CONNECT %s:%d HTTP/1.1"
            java.lang.String r3 = java.lang.String.format(r3, r7)     // Catch:{ IOException -> 0x0196 }
            r9.b(r3)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r3 = "\r\n"
            r9.b(r3)     // Catch:{ IOException -> 0x0196 }
            avzb r3 = r2.c     // Catch:{ IOException -> 0x0196 }
            int r3 = r3.a()     // Catch:{ IOException -> 0x0196 }
            r7 = 0
        L_0x00f5:
            if (r7 < r3) goto L_0x0176
            java.lang.String r2 = "\r\n"
            r9.b(r2)     // Catch:{ IOException -> 0x0196 }
            r9.flush()     // Catch:{ IOException -> 0x0196 }
            java.lang.String r2 = defpackage.bamt.a((defpackage.baua) r8)     // Catch:{ IOException -> 0x0196 }
            awdd r2 = defpackage.awdd.a((java.lang.String) r2)     // Catch:{ IOException -> 0x0196 }
        L_0x0107:
            java.lang.String r3 = defpackage.bamt.a((defpackage.baua) r8)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r7 = ""
            boolean r3 = r3.equals(r7)     // Catch:{ IOException -> 0x0196 }
            if (r3 == 0) goto L_0x0107
            int r3 = r2.b     // Catch:{ IOException -> 0x0196 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 < r7) goto L_0x011f
            r7 = 300(0x12c, float:4.2E-43)
            if (r3 >= r7) goto L_0x011f
            goto L_0x01f0
        L_0x011f:
            batd r3 = new batd     // Catch:{ IOException -> 0x0196 }
            r3.<init>()     // Catch:{ IOException -> 0x0196 }
            r5.shutdownOutput()     // Catch:{ IOException -> 0x012d }
            r9 = 1024(0x400, double:5.06E-321)
            r8.c(r3, r9)     // Catch:{ IOException -> 0x012d }
            goto L_0x014b
        L_0x012d:
            r7 = move-exception
            java.lang.String r8 = "Unable to read body: "
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0196 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0196 }
            int r9 = r7.length()     // Catch:{ IOException -> 0x0196 }
            if (r9 != 0) goto L_0x0144
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0196 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0196 }
            goto L_0x0148
        L_0x0144:
            java.lang.String r7 = r8.concat(r7)     // Catch:{ IOException -> 0x0196 }
        L_0x0148:
            r3.b((java.lang.String) r7)     // Catch:{ IOException -> 0x0196 }
        L_0x014b:
            r5.close()     // Catch:{ IOException -> 0x014f }
            goto L_0x0150
        L_0x014f:
            r5 = move-exception
        L_0x0150:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0196 }
            int r7 = r2.b     // Catch:{ IOException -> 0x0196 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0196 }
            r5[r1] = r7     // Catch:{ IOException -> 0x0196 }
            java.lang.String r2 = r2.c     // Catch:{ IOException -> 0x0196 }
            r5[r4] = r2     // Catch:{ IOException -> 0x0196 }
            java.lang.String r2 = r3.k()     // Catch:{ IOException -> 0x0196 }
            r5[r6] = r2     // Catch:{ IOException -> 0x0196 }
            java.lang.String r2 = "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"
            java.lang.String r2 = java.lang.String.format(r2, r5)     // Catch:{ IOException -> 0x0196 }
            babj r3 = defpackage.babj.o     // Catch:{ IOException -> 0x0196 }
            babj r2 = r3.a((java.lang.String) r2)     // Catch:{ IOException -> 0x0196 }
            babk r2 = r2.c()     // Catch:{ IOException -> 0x0196 }
            throw r2     // Catch:{ IOException -> 0x0196 }
        L_0x0176:
            avzb r10 = r2.c     // Catch:{ IOException -> 0x0196 }
            java.lang.String r10 = r10.a((int) r7)     // Catch:{ IOException -> 0x0196 }
            r9.b(r10)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r10 = ": "
            r9.b(r10)     // Catch:{ IOException -> 0x0196 }
            avzb r10 = r2.c     // Catch:{ IOException -> 0x0196 }
            java.lang.String r10 = r10.b(r7)     // Catch:{ IOException -> 0x0196 }
            r9.b(r10)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r10 = "\r\n"
            r9.b(r10)     // Catch:{ IOException -> 0x0196 }
            int r7 = r7 + 1
            goto L_0x00f5
        L_0x0196:
            r2 = move-exception
            babj r3 = defpackage.babj.o     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r4 = "Failed trying to connect with proxy"
            babj r3 = r3.a((java.lang.String) r4)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            babj r2 = r3.b((java.lang.Throwable) r2)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            babk r2 = r2.c()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            throw r2     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
        L_0x01a8:
            babj r2 = defpackage.babj.n     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            bamt r3 = r14.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            azyp r3 = r3.E     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.SocketAddress r3 = r3.a     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.Class r3 = r3.getClass()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            int r4 = r4.length()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            int r4 = r4 + 41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            r5.<init>(r4)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r4 = "Unsupported SocketAddress implementation "
            r5.append(r4)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            r5.append(r3)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r3 = r5.toString()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            babj r2 = r2.a((java.lang.String) r3)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            babk r2 = r2.c()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            throw r2     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
        L_0x01dc:
            javax.net.SocketFactory r3 = r2.s     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.InetSocketAddress r2 = r2.b     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.InetAddress r2 = r2.getAddress()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            bamt r5 = r14.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.InetSocketAddress r5 = r5.b     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            int r5 = r5.getPort()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.Socket r5 = r3.createSocket(r2, r5)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
        L_0x01f0:
            bamt r2 = r14.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            javax.net.ssl.SSLSocketFactory r3 = r2.t     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            if (r3 == 0) goto L_0x0230
            java.lang.String r6 = r2.c     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.URI r6 = defpackage.bagt.b(r6)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r7 = r6.getHost()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            if (r7 == 0) goto L_0x0207
            java.lang.String r2 = r6.getHost()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            goto L_0x0209
        L_0x0207:
            java.lang.String r2 = r2.c     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
        L_0x0209:
            bamt r6 = r14.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.lang.String r7 = r6.c     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            java.net.URI r7 = defpackage.bagt.b(r7)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            int r8 = r7.getPort()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            r9 = -1
            if (r8 != r9) goto L_0x021f
            java.net.InetSocketAddress r6 = r6.b     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            int r6 = r6.getPort()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            goto L_0x0223
        L_0x021f:
            int r6 = r7.getPort()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
        L_0x0223:
            bamt r7 = r14.d     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            banj r7 = r7.w     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            javax.net.ssl.SSLSocket r5 = defpackage.bana.a(r3, r5, r2, r6, r7)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            javax.net.ssl.SSLSession r2 = r5.getSession()     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            goto L_0x0231
        L_0x0230:
            r2 = 0
        L_0x0231:
            r5.setTcpNoDelay(r4)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            baua r3 = defpackage.batq.b((java.net.Socket) r5)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            batf r0 = defpackage.batq.a((defpackage.baua) r3)     // Catch:{ babk -> 0x02d5, Exception -> 0x02bf, all -> 0x02bd }
            bamb r3 = r14.b     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            batz r6 = defpackage.batq.a((java.net.Socket) r5)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            batz r7 = r3.f     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            if (r7 != 0) goto L_0x0248
            goto L_0x0249
        L_0x0248:
            r4 = 0
        L_0x0249:
            java.lang.String r7 = "AsyncSink's becomeConnected should only be called once."
            defpackage.amrl.b((boolean) r4, (java.lang.Object) r7)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            java.lang.String r4 = "sink"
            defpackage.amrl.a((java.lang.Object) r6, (java.lang.Object) r4)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            r3.f = r6     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            java.lang.String r4 = "socket"
            defpackage.amrl.a((java.lang.Object) r5, (java.lang.Object) r4)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            r3.g = r5     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            bamt r3 = r14.d     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azxa r4 = r3.o     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azwy r4 = r4.b()     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azwz r6 = defpackage.azyn.a     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            java.net.SocketAddress r7 = r5.getRemoteSocketAddress()     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            r4.a(r6, r7)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azwz r6 = defpackage.azyn.b     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            java.net.SocketAddress r7 = r5.getLocalSocketAddress()     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            r4.a(r6, r7)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azwz r6 = defpackage.azyn.c     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            r4.a(r6, r2)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azwz r6 = defpackage.bagm.a     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            if (r2 == 0) goto L_0x0282
            babc r7 = defpackage.babc.PRIVACY_AND_INTEGRITY     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            goto L_0x0284
        L_0x0282:
            babc r7 = defpackage.babc.NONE     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
        L_0x0284:
            r4.a(r6, r7)     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            azxa r4 = r4.a()     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            r3.o = r4     // Catch:{ babk -> 0x02bb, Exception -> 0x02b9, all -> 0x02b7 }
            bamt r1 = r14.d
            bams r3 = new bams
            baon r4 = r14.c
            banz r0 = r4.b(r0)
            r3.<init>(r1, r0)
            r1.n = r3
            bamt r0 = r14.d
            java.lang.Object r1 = r0.j
            monitor-enter(r1)
            java.lang.String r0 = "socket"
            defpackage.amrl.a((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ all -> 0x02b4 }
            if (r2 == 0) goto L_0x02b2
            azyt r0 = new azyt     // Catch:{ all -> 0x02b4 }
            azyu r3 = new azyu     // Catch:{ all -> 0x02b4 }
            r3.<init>(r2)     // Catch:{ all -> 0x02b4 }
            r0.<init>(r3)     // Catch:{ all -> 0x02b4 }
        L_0x02b2:
            monitor-exit(r1)     // Catch:{ all -> 0x02b4 }
            return
        L_0x02b4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02b4 }
            throw r0
        L_0x02b7:
            r1 = move-exception
            goto L_0x02ee
        L_0x02b9:
            r1 = move-exception
            goto L_0x02c0
        L_0x02bb:
            r2 = move-exception
            goto L_0x02d6
        L_0x02bd:
            r1 = move-exception
            goto L_0x02ee
        L_0x02bf:
            r1 = move-exception
        L_0x02c0:
            bamt r2 = r14.d     // Catch:{ all -> 0x02ed }
            r2.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x02ed }
            bamt r1 = r14.d
            bams r2 = new bams
            baon r3 = r14.c
            banz r0 = r3.b(r0)
            r2.<init>(r1, r0)
        L_0x02d2:
            r1.n = r2
            return
        L_0x02d5:
            r2 = move-exception
        L_0x02d6:
            bamt r3 = r14.d     // Catch:{ all -> 0x02ed }
            bany r4 = defpackage.bany.INTERNAL_ERROR     // Catch:{ all -> 0x02ed }
            babj r2 = r2.a     // Catch:{ all -> 0x02ed }
            r3.a((int) r1, (defpackage.bany) r4, (defpackage.babj) r2)     // Catch:{ all -> 0x02ed }
            bamt r1 = r14.d
            bams r2 = new bams
            baon r3 = r14.c
            banz r0 = r3.b(r0)
            r2.<init>(r1, r0)
            goto L_0x02d2
        L_0x02ed:
            r1 = move-exception
        L_0x02ee:
            bamt r2 = r14.d
            bams r3 = new bams
            baon r4 = r14.c
            banz r0 = r4.b(r0)
            r3.<init>(r2, r0)
            r2.n = r3
            goto L_0x02ff
        L_0x02fe:
            throw r1
        L_0x02ff:
            goto L_0x02fe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamq.run():void");
    }
}
