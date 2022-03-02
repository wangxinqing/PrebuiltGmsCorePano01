package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdk implements avyq {
    public final avzo a;
    public Socket b;
    public Socket c;
    public avyz d;
    public avzh e;
    public volatile awbb f;
    public int g;
    public batf h;
    public bate i;
    public final List j = new ArrayList();
    public boolean k;
    public long l = Long.MAX_VALUE;

    public awdk(avzo avzo) {
        this.a = avzo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03ff A[Catch:{ all -> 0x0406 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0405 A[Catch:{ all -> 0x0406 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0409  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r12, int r13, defpackage.avzq r14) {
        /*
            r11 = this;
            java.lang.String r0 = "TLS_FALLBACK_SCSV"
            avzo r1 = r11.a
            avyj r2 = r1.a
            javax.net.ssl.SSLSocketFactory r2 = r2.h
            java.lang.String r3 = ":"
            r4 = 0
            if (r2 != 0) goto L_0x000f
            goto L_0x011d
        L_0x000f:
            java.net.Proxy r1 = r1.b
            java.net.Proxy$Type r1 = r1.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP
            if (r1 != r2) goto L_0x011d
            avzi r1 = new avzi
            r1.<init>()
            avzo r2 = r11.a
            avyj r2 = r2.a
            avzd r2 = r2.a
            r1.a((defpackage.avzd) r2)
            avzo r2 = r11.a
            avyj r2 = r2.a
            avzd r2 = r2.a
            java.lang.String r2 = defpackage.awaj.a((defpackage.avzd) r2)
            java.lang.String r5 = "Host"
            r1.b(r5, r2)
            java.lang.String r2 = "Proxy-Connection"
            java.lang.String r5 = "Keep-Alive"
            r1.b(r2, r5)
            java.lang.String r2 = "User-Agent"
            java.lang.String r5 = "okhttp/2.7.2"
            r1.b(r2, r5)
            avzj r1 = r1.a()
            avzd r2 = r1.a
            java.lang.String r5 = r2.b
            int r2 = r2.c
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 29
            r7.<init>(r6)
            java.lang.String r6 = "CONNECT "
            r7.append(r6)
            r7.append(r5)
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = " HTTP/1.1"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        L_0x0074:
            awcm r5 = new awcm
            batf r6 = r11.h
            bate r7 = r11.i
            r5.<init>(r4, r6, r7)
            batf r6 = r11.h
            bauc r6 = r6.bu()
            long r7 = (long) r12
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.a(r7, r9)
            bate r6 = r11.i
            bauc r6 = r6.bu()
            long r7 = (long) r13
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.a(r7, r9)
            avzb r6 = r1.c
            r5.a((defpackage.avzb) r6, (java.lang.String) r2)
            r5.c()
            avzl r6 = r5.d()
            r6.a = r1
            avzm r1 = r6.a()
            long r6 = defpackage.awcw.a((defpackage.avzm) r1)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00b4
            r6 = 0
            goto L_0x00b5
        L_0x00b4:
        L_0x00b5:
            baua r5 = r5.a((long) r6)
            r6 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            defpackage.awaj.a((defpackage.baua) r5, (int) r6, (java.util.concurrent.TimeUnit) r7)
            r5.close()
            int r5 = r1.c
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x00fc
            r6 = 407(0x197, float:5.7E-43)
            if (r5 != r6) goto L_0x00e3
            avzo r5 = r11.a
            avyj r6 = r5.a
            java.net.Proxy r5 = r5.b
            avzj r1 = defpackage.awcw.a((defpackage.avzm) r1, (java.net.Proxy) r5)
            if (r1 == 0) goto L_0x00db
            goto L_0x0074
        L_0x00db:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Failed to authenticate with proxy"
            r12.<init>(r13)
            throw r12
        L_0x00e3:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 49
            r13.<init>(r14)
            java.lang.String r14 = "Unexpected response code for CONNECT: "
            r13.append(r14)
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00fc:
            batf r12 = r11.h
            batv r12 = (defpackage.batv) r12
            batd r12 = r12.a
            boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0115
            bate r12 = r11.i
            batt r12 = (defpackage.batt) r12
            batd r12 = r12.a
            boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0115
            goto L_0x011d
        L_0x0115:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TLS tunnel buffered too many bytes!"
            r12.<init>(r13)
            throw r12
        L_0x011d:
            avzo r12 = r11.a
            avyj r12 = r12.a
            javax.net.ssl.SSLSocketFactory r13 = r12.h
            java.net.Socket r1 = r11.b     // Catch:{ AssertionError -> 0x03f8, all -> 0x03f6 }
            java.lang.String r2 = r12.a()     // Catch:{ AssertionError -> 0x03f8, all -> 0x03f6 }
            int r5 = r12.b()     // Catch:{ AssertionError -> 0x03f8, all -> 0x03f6 }
            r6 = 1
            java.net.Socket r13 = r13.createSocket(r1, r2, r5, r6)     // Catch:{ AssertionError -> 0x03f8, all -> 0x03f6 }
            javax.net.ssl.SSLSocket r13 = (javax.net.ssl.SSLSocket) r13     // Catch:{ AssertionError -> 0x03f8, all -> 0x03f6 }
            int r1 = r14.b     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.List r2 = r14.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r2 = r2.size()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x013c:
            if (r1 >= r2) goto L_0x0153
            java.util.List r5 = r14.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            avyu r5 = (defpackage.avyu) r5     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r7 = r5.a(r13)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r7 != 0) goto L_0x014f
            int r1 = r1 + 1
            goto L_0x013c
        L_0x014f:
            int r1 = r1 + r6
            r14.b = r1     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x0154
        L_0x0153:
            r5 = r4
        L_0x0154:
            if (r5 == 0) goto L_0x03a6
            int r1 = r14.b     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x0158:
            java.util.List r2 = r14.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r2 = r2.size()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r7 = 0
            if (r1 >= r2) goto L_0x0174
            java.util.List r2 = r14.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            avyu r2 = (defpackage.avyu) r2     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r2 = r2.a(r13)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r2 != 0) goto L_0x0172
            int r1 = r1 + 1
            goto L_0x0158
        L_0x0172:
            r1 = 1
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            r14.c = r1     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.logging.Logger r1 = defpackage.awaa.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r14 = r14.d     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String[] r1 = r5.f     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r1 == 0) goto L_0x018c
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String[] r8 = r13.getEnabledCipherSuites()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.Object[] r1 = defpackage.awaj.a((java.lang.Class) r2, (java.lang.Object[]) r1, (java.lang.Object[]) r8)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x0190
        L_0x018c:
            java.lang.String[] r1 = r13.getEnabledCipherSuites()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x0190:
            java.lang.String[] r2 = r5.g     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r2 == 0) goto L_0x01a1
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String[] r9 = r13.getEnabledProtocols()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.Object[] r2 = defpackage.awaj.a((java.lang.Class) r8, (java.lang.Object[]) r2, (java.lang.Object[]) r9)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x01a5
        L_0x01a1:
            java.lang.String[] r2 = r13.getEnabledProtocols()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x01a5:
            if (r14 != 0) goto L_0x01a8
            goto L_0x01b6
        L_0x01a8:
            java.lang.String[] r14 = r13.getSupportedCipherSuites()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r14 = defpackage.awaj.a((java.lang.String[]) r14, (java.lang.String) r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r14 == 0) goto L_0x01b6
            java.lang.String[] r1 = defpackage.awaj.b(r1, r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x01b6:
            avyt r14 = new avyt     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.<init>((defpackage.avyu) r5)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.a((java.lang.String[]) r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.b(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            avyu r14 = r14.a()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String[] r0 = r14.g     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r0 != 0) goto L_0x01ca
            goto L_0x01cd
        L_0x01ca:
            r13.setEnabledProtocols(r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x01cd:
            java.lang.String[] r14 = r14.f     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r14 != 0) goto L_0x01d2
            goto L_0x01d5
        L_0x01d2:
            r13.setEnabledCipherSuites(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x01d5:
            boolean r14 = r5.e     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r14 != 0) goto L_0x01da
            goto L_0x01e5
        L_0x01da:
            awag r14 = defpackage.awag.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r0 = r12.a()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.List r1 = r12.d     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.a((javax.net.ssl.SSLSocket) r13, (java.lang.String) r0, (java.util.List) r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x01e5:
            r13.startHandshake()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            javax.net.ssl.SSLSession r14 = r13.getSession()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            avyz r14 = defpackage.avyz.a(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            javax.net.ssl.HostnameVerifier r0 = r12.i     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r1 = r12.a()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            javax.net.ssl.SSLSession r2 = r13.getSession()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r0 = r0.verify(r1, r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r0 == 0) goto L_0x0318
            avyn r0 = r12.j     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r12 = r12.a()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.List r1 = r14.b     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r2 = "Certificate pinning failure!\n  Peer certificate chain:"
            java.util.Map r8 = r0.b     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r9 = 46
            int r10 = r12.indexOf(r9)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r9 = r12.lastIndexOf(r9)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r10 == r9) goto L_0x0242
            java.util.Map r0 = r0.b     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r9 = "*."
            int r10 = r10 + r6
            java.lang.String r6 = r12.substring(r10)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r10 = r6.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r10 != 0) goto L_0x0237
            java.lang.String r6 = new java.lang.String     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r6.<init>(r9)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x023b
        L_0x0237:
            java.lang.String r6 = r9.concat(r6)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x023b:
            java.lang.Object r0 = r0.get(r6)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x0243
        L_0x0242:
            r0 = r4
        L_0x0243:
            if (r8 != 0) goto L_0x0249
            if (r0 != 0) goto L_0x0249
            r8 = r4
            goto L_0x025e
        L_0x0249:
            if (r8 == 0) goto L_0x025a
            if (r0 == 0) goto L_0x025a
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r6.<init>()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r6.addAll(r8)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r6.addAll(r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r8 = r6
            goto L_0x025e
        L_0x025a:
            if (r8 == 0) goto L_0x025d
            goto L_0x025e
        L_0x025d:
            r8 = r0
        L_0x025e:
            if (r8 == 0) goto L_0x02df
            int r0 = r1.size()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r6 = 0
        L_0x0265:
            if (r6 < r0) goto L_0x02cc
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.<init>()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.append(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r0 = r1.size()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x0273:
            if (r7 < r0) goto L_0x02a7
            java.lang.String r0 = "\n  Pinned certificates for "
            r14.append(r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.append(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.append(r3)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x0284:
            boolean r0 = r12.hasNext()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r0 == 0) goto L_0x029d
            java.lang.Object r0 = r12.next()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            batg r0 = (defpackage.batg) r0     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r1 = "\n    sha1/"
            r14.append(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r0 = r0.b()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.append(r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x0284
        L_0x029d:
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r14 = r14.toString()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r12.<init>(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            throw r12     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x02a7:
            java.lang.Object r2 = r1.get(r7)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r4 = "\n    "
            r14.append(r4)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r4 = defpackage.avyn.a((java.security.cert.Certificate) r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.append(r4)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r4 = ": "
            r14.append(r4)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.security.Principal r2 = r2.getSubjectDN()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r2 = r2.getName()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r14.append(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r7 = r7 + 1
            goto L_0x0273
        L_0x02cc:
            java.lang.Object r9 = r1.get(r6)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            batg r9 = defpackage.avyn.a((java.security.cert.X509Certificate) r9)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r9 = r8.contains(r9)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r9 != 0) goto L_0x02df
            int r6 = r6 + 1
            goto L_0x0265
        L_0x02df:
            boolean r12 = r5.e     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r12 == 0) goto L_0x02ea
            awag r12 = defpackage.awag.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r4 = r12.a((javax.net.ssl.SSLSocket) r13)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x02eb
        L_0x02ea:
        L_0x02eb:
            r11.c = r13     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            baua r12 = defpackage.batq.b((java.net.Socket) r13)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            batf r12 = defpackage.batq.a((defpackage.baua) r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r11.h = r12     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.net.Socket r12 = r11.c     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            batz r12 = defpackage.batq.a((java.net.Socket) r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            bate r12 = defpackage.batq.a((defpackage.batz) r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r11.i = r12     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r11.d = r14     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r4 != 0) goto L_0x030a
            avzh r12 = defpackage.avzh.HTTP_1_1     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            goto L_0x030e
        L_0x030a:
            avzh r12 = defpackage.avzh.a(r4)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x030e:
            r11.e = r12     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            if (r13 == 0) goto L_0x0317
            awag r12 = defpackage.awag.a
            r12.b(r13)
        L_0x0317:
            return
        L_0x0318:
            java.util.List r14 = r14.b     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.Object r14 = r14.get(r7)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.security.cert.X509Certificate r14 = (java.security.cert.X509Certificate) r14     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r12 = r12.a()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r1 = defpackage.avyn.a((java.security.cert.Certificate) r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.security.Principal r2 = r14.getSubjectDN()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r2 = r2.getName()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r3 = 7
            java.util.List r3 = defpackage.awdm.a((java.security.cert.X509Certificate) r14, (int) r3)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4 = 2
            java.util.List r14 = defpackage.awdm.a((java.security.cert.X509Certificate) r14, (int) r4)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r5 = r3.size()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r6 = r14.size()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r5 = r5 + r6
            r4.<init>(r5)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.addAll(r3)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.addAll(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r14 = java.lang.String.valueOf(r4)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r3 = r3.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r3 = r3 + 72
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r4 = r4.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r4 = r4.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r4 = r4.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.<init>(r3)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r3 = "Hostname "
            r4.append(r3)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r12 = " not verified:\n    certificate: "
            r4.append(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r12 = "\n    DN: "
            r4.append(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r12 = "\n    subjectAltNames: "
            r4.append(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r12 = r4.toString()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r0.<init>(r12)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            throw r0     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x03a6:
            java.net.UnknownServiceException r12 = new java.net.UnknownServiceException     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            boolean r0 = r14.d     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.util.List r14 = r14.a     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String[] r1 = r13.getEnabledProtocols()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r2 = r2.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r3 = r3.length()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            int r2 = r2 + 83
            int r2 = r2 + r3
            r4.<init>(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r4.append(r2)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r0 = ", modes="
            r4.append(r0)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r14 = ", supported protocols="
            r4.append(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r4.append(r1)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            java.lang.String r14 = r4.toString()     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            r12.<init>(r14)     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
            throw r12     // Catch:{ AssertionError -> 0x03f3, all -> 0x03f0 }
        L_0x03f0:
            r12 = move-exception
            r4 = r13
            goto L_0x0407
        L_0x03f3:
            r12 = move-exception
            r4 = r13
            goto L_0x03f9
        L_0x03f6:
            r12 = move-exception
            goto L_0x0407
        L_0x03f8:
            r12 = move-exception
        L_0x03f9:
            boolean r13 = defpackage.awaj.a((java.lang.AssertionError) r12)     // Catch:{ all -> 0x0406 }
            if (r13 == 0) goto L_0x0405
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0406 }
            r13.<init>(r12)     // Catch:{ all -> 0x0406 }
            throw r13     // Catch:{ all -> 0x0406 }
        L_0x0405:
            throw r12     // Catch:{ all -> 0x0406 }
        L_0x0406:
            r12 = move-exception
        L_0x0407:
            if (r4 == 0) goto L_0x040e
            awag r13 = defpackage.awag.a
            r13.b(r4)
        L_0x040e:
            defpackage.awaj.a((java.net.Socket) r4)
            goto L_0x0413
        L_0x0412:
            throw r12
        L_0x0413:
            goto L_0x0412
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdk.a(int, int, avzq):void");
    }

    public final String toString() {
        String str;
        avzo avzo = this.a;
        avzd avzd = avzo.a.a;
        String str2 = avzd.b;
        int i2 = avzd.c;
        String valueOf = String.valueOf(avzo.b);
        String valueOf2 = String.valueOf(this.a.c);
        avyz avyz = this.d;
        if (avyz != null) {
            str = avyz.a;
        } else {
            str = "none";
        }
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + str.length() + String.valueOf(valueOf3).length());
        sb.append("Connection{");
        sb.append(str2);
        sb.append(":");
        sb.append(i2);
        sb.append(", proxy=");
        sb.append(valueOf);
        sb.append(" hostAddress=");
        sb.append(valueOf2);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }

    public final void a() {
        awaj.a(this.b);
    }

    public final void a(int i2, int i3, int i4, avzq avzq) {
        this.b.setSoTimeout(i3);
        try {
            awag.a.a(this.b, this.a.c, i2);
            this.h = batq.a(batq.b(this.b));
            this.i = batq.a(batq.a(this.b));
            if (this.a.a.h != null) {
                a(i3, i4, avzq);
            } else {
                this.e = avzh.HTTP_1_1;
                this.c = this.b;
            }
            if (this.e == avzh.SPDY_3 || this.e == avzh.HTTP_2) {
                this.c.setSoTimeout(0);
                awav awav = new awav();
                Socket socket = this.c;
                String str = this.a.a.a.b;
                batf batf = this.h;
                bate bate = this.i;
                awav.a = socket;
                awav.b = str;
                awav.c = batf;
                awav.d = bate;
                awav.f = this.e;
                awbb awbb = new awbb(awav);
                awbb.q.a();
                awbb.q.b(awbb.l);
                int c2 = awbb.l.c();
                if (c2 != 65536) {
                    awbb.q.a(0, (long) (c2 - 65536));
                }
                this.f = awbb;
            }
        } catch (ConnectException e2) {
            String valueOf = String.valueOf(this.a.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to connect to ");
            sb.append(valueOf);
            throw new ConnectException(sb.toString());
        }
    }

    public final boolean a(boolean z) {
        int soTimeout;
        if (this.c.isClosed() || this.c.isInputShutdown() || this.c.isOutputShutdown()) {
            return false;
        }
        if (this.f == null && z) {
            try {
                soTimeout = this.c.getSoTimeout();
                this.c.setSoTimeout(1);
                if (!this.h.b()) {
                    this.c.setSoTimeout(soTimeout);
                    return true;
                }
                this.c.setSoTimeout(soTimeout);
                return false;
            } catch (SocketTimeoutException e2) {
            } catch (IOException e3) {
                return false;
            } catch (Throwable th) {
                this.c.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }
}
