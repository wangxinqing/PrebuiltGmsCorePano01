package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: adoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adoc {
    private static final iwd d = adnt.g("FileDownloader");
    private static final long e = TimeUnit.SECONDS.toMillis(1);
    public final adny a;
    public final Object b;
    public adnz c;
    private final Context f;
    private final WifiManager g;
    private final opl h;
    private final String i;
    private final long j;
    private final amzy k;
    private final ExecutorService l;
    private final int m;
    private final adob n;
    private final adod o;
    private long p;
    private long q;
    private long r;
    private long s = 0;
    private boolean t = false;

    public adoc(Context context, String str, adny adny, long j2, long j3, long j4, amzy amzy, int i2, adob adob, adod adod) {
        long j5 = j2;
        opl opl = new opl(context, ((Boolean) iks.y.c()).booleanValue());
        this.f = context;
        this.g = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.h = opl;
        iva.c(str);
        this.i = str;
        iva.a((Object) adny);
        this.a = adny;
        this.p = j5;
        this.q = j5;
        this.j = j3;
        this.r = j4;
        this.k = amzy;
        this.m = i2;
        this.n = adob;
        this.o = adod;
        this.b = new Object();
        this.l = new jfz(1, 9);
    }

    public static adnu a(Context context) {
        return new adnu(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0269, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c6, code lost:
        if (r15 >= r11) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        d.b("Delay caused by aggressive file sync: %d ms.", java.lang.Long.valueOf(r13));
        r7.flush();
        r21.getFD().sync();
        a(c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0217, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0218, code lost:
        d.d("Unable to close the file.", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:91:0x01f1=Splitter:B:91:0x01f1, B:119:0x0273=Splitter:B:119:0x0273} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r22 = this;
            r1 = r22
            adob r0 = r1.n
            if (r0 != 0) goto L_0x0007
            goto L_0x000a
        L_0x0007:
            r0.b()
        L_0x000a:
            r0 = 1033(0x409, float:1.448E-42)
            r2 = 1061(0x425, float:1.487E-42)
            defpackage.izj.a(r0, r2)
            adod r0 = r1.o     // Catch:{ IOException -> 0x02ed }
            if (r0 == 0) goto L_0x003a
            opl r2 = r1.h     // Catch:{ IOException -> 0x02ed }
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x02ed }
            java.lang.String r4 = r1.i     // Catch:{ IOException -> 0x02ed }
            r3.<init>(r4)     // Catch:{ IOException -> 0x02ed }
            amri r4 = r0.a     // Catch:{ IOException -> 0x02ed }
            boolean r4 = r4.a()     // Catch:{ IOException -> 0x02ed }
            if (r4 == 0) goto L_0x0034
            amri r0 = r0.a     // Catch:{ IOException -> 0x02ed }
            java.lang.Object r0 = r0.b()     // Catch:{ IOException -> 0x02ed }
            android.net.Network r0 = (android.net.Network) r0     // Catch:{ IOException -> 0x02ed }
            java.net.HttpURLConnection r0 = r2.a(r3, r0)     // Catch:{ IOException -> 0x02ed }
            r2 = r0
            goto L_0x0048
        L_0x0034:
            java.net.HttpURLConnection r0 = r2.a(r3)     // Catch:{ IOException -> 0x02ed }
            r2 = r0
            goto L_0x0048
        L_0x003a:
            opl r0 = r1.h     // Catch:{ IOException -> 0x02ed }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x02ed }
            java.lang.String r3 = r1.i     // Catch:{ IOException -> 0x02ed }
            r2.<init>(r3)     // Catch:{ IOException -> 0x02ed }
            java.net.HttpURLConnection r0 = r0.a(r2)     // Catch:{ IOException -> 0x02ed }
            r2 = r0
        L_0x0048:
            long r3 = defpackage.ayou.b()
            int r0 = (int) r3
            r2.setConnectTimeout(r0)
            ayou r0 = defpackage.ayou.a
            ayov r0 = r0.a()
            long r3 = r0.p()
            int r0 = (int) r3
            r2.setReadTimeout(r0)
            r3 = 1
            r2.setInstanceFollowRedirects(r3)
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r2.setRequestProperty(r0, r4)
            long r4 = r22.d()
            long r6 = r1.j
            long r4 = r4 + r6
            r6 = -1
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ca
            long r4 = r22.d()
            long r10 = r1.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r12 = 27
            r0.<init>(r12)
            java.lang.String r12 = "bytes="
            r0.append(r12)
            long r4 = r4 + r10
            r0.append(r4)
            java.lang.String r4 = "-"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            long r4 = r22.b()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x00c4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            long r4 = r1.j
            long r10 = r22.b()
            java.lang.String r12 = java.lang.String.valueOf(r0)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 20
            r13.<init>(r12)
            r13.append(r0)
            long r4 = r4 + r10
            long r4 = r4 + r6
            r13.append(r4)
            java.lang.String r0 = r13.toString()
        L_0x00c4:
            java.lang.String r4 = "Range"
            r2.setRequestProperty(r4, r0)
        L_0x00ca:
            amzy r0 = r1.k
            anhk r0 = r0.listIterator()
        L_0x00d0:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00e8
            java.lang.Object r4 = r0.next()
            oq r4 = (defpackage.oq) r4
            java.lang.Object r5 = r4.a
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.b
            java.lang.String r4 = (java.lang.String) r4
            r2.setRequestProperty(r5, r4)
            goto L_0x00d0
        L_0x00e8:
            adoa r0 = new adoa
            long r4 = r22.d()
            long r10 = r1.j
            long r4 = r4 + r10
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f8
            r4 = 206(0xce, float:2.89E-43)
            goto L_0x00fa
        L_0x00f8:
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00fa:
            r0.<init>(r2, r4)
            java.util.concurrent.ExecutorService r4 = r1.l     // Catch:{ ExecutionException -> 0x02d2, InterruptedException -> 0x02c6, TimeoutException -> 0x02c4 }
            jfz r4 = (defpackage.jfz) r4     // Catch:{ ExecutionException -> 0x02d2, InterruptedException -> 0x02c6, TimeoutException -> 0x02c4 }
            aorr r0 = r4.submit((java.lang.Runnable) r0)     // Catch:{ ExecutionException -> 0x02d2, InterruptedException -> 0x02c6, TimeoutException -> 0x02c4 }
            long r4 = defpackage.ayou.b()     // Catch:{ ExecutionException -> 0x02d2, InterruptedException -> 0x02c6, TimeoutException -> 0x02c4 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x02d2, InterruptedException -> 0x02c6, TimeoutException -> 0x02c4 }
            r0.get(r4, r10)     // Catch:{ ExecutionException -> 0x02d2, InterruptedException -> 0x02c6, TimeoutException -> 0x02c4 }
            long r4 = r22.b()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0138
            long r4 = r22.d()
            boolean r0 = defpackage.jkr.c()
            if (r0 == 0) goto L_0x0125
            long r6 = r2.getContentLengthLong()
            goto L_0x012a
        L_0x0125:
            int r0 = r2.getContentLength()
            long r6 = (long) r0
        L_0x012a:
            long r4 = r4 + r6
            java.lang.Object r6 = r1.b
            monitor-enter(r6)
            r1.r = r4     // Catch:{ all -> 0x0135 }
            monitor-exit(r6)     // Catch:{ all -> 0x0135 }
            r22.g()
            goto L_0x0138
        L_0x0135:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0135 }
            throw r0
        L_0x0138:
            adny r0 = r1.a
            long r4 = r22.b()
            java.io.RandomAccessFile r4 = r0.a(r4)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0299 }
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ IOException -> 0x0299 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0299 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0299 }
            r0 = 16384(0x4000, float:2.2959E-41)
            r7.<init>(r6, r0)     // Catch:{ IOException -> 0x0299 }
            long r10 = r22.d()     // Catch:{ all -> 0x0270 }
            r4.seek(r10)     // Catch:{ all -> 0x0270 }
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0270 }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x0270 }
            r10.<init>(r2, r0)     // Catch:{ all -> 0x0270 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0270 }
            ayoo r2 = defpackage.ayoo.a     // Catch:{ all -> 0x0270 }
            ayop r2 = r2.a()     // Catch:{ all -> 0x0270 }
            long r11 = r2.a()     // Catch:{ all -> 0x0270 }
            float r2 = (float) r11     // Catch:{ all -> 0x0270 }
            int r11 = r1.m     // Catch:{ all -> 0x0270 }
            int r11 = -r11
            float r2 = java.lang.Math.scalb(r2, r11)     // Catch:{ all -> 0x0270 }
            long r11 = (long) r2
            r13 = r8
            r15 = r13
        L_0x0179:
            java.lang.Object r2 = r1.b     // Catch:{ all -> 0x026b }
            monitor-enter(r2)     // Catch:{ all -> 0x026b }
            boolean r3 = r1.t     // Catch:{ all -> 0x0264 }
            monitor-exit(r2)     // Catch:{ all -> 0x0264 }
            if (r3 != 0) goto L_0x025a
            r2 = 16384(0x4000, double:8.0948E-320)
            long r17 = r22.b()     // Catch:{ all -> 0x026b }
            long r19 = r22.c()     // Catch:{ all -> 0x026b }
            r21 = r6
            long r5 = r17 - r19
            long r2 = java.lang.Math.min(r2, r5)     // Catch:{ all -> 0x0262 }
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0198
            goto L_0x01f1
        L_0x0198:
            int r3 = (int) r2     // Catch:{ all -> 0x0262 }
            r2 = 0
            int r3 = r10.read(r0, r2, r3)     // Catch:{ all -> 0x0262 }
            if (r3 < 0) goto L_0x01f1
            r7.write(r0, r2, r3)     // Catch:{ all -> 0x0262 }
            long r2 = (long) r3     // Catch:{ all -> 0x0262 }
            long r15 = r15 + r2
            long r5 = r22.c()     // Catch:{ all -> 0x0262 }
            long r5 = r5 + r2
            ayou r2 = defpackage.ayou.a     // Catch:{ all -> 0x0262 }
            ayov r2 = r2.a()     // Catch:{ all -> 0x0262 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x0262 }
            if (r2 == 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            ayoo r2 = defpackage.ayoo.a     // Catch:{ all -> 0x0262 }
            ayop r2 = r2.a()     // Catch:{ all -> 0x0262 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0262 }
            if (r2 != 0) goto L_0x01c4
            goto L_0x01e1
        L_0x01c4:
            int r2 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x01e1
        L_0x01c8:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0262 }
            r7.flush()     // Catch:{ all -> 0x0262 }
            java.io.FileDescriptor r15 = r21.getFD()     // Catch:{ all -> 0x0262 }
            r15.sync()     // Catch:{ all -> 0x0262 }
            r1.a((long) r5)     // Catch:{ all -> 0x0262 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0262 }
            long r5 = r5 - r2
            long r13 = r13 + r5
            r15 = r8
            goto L_0x01ea
        L_0x01e1:
            java.lang.Object r2 = r1.b     // Catch:{ all -> 0x0262 }
            monitor-enter(r2)     // Catch:{ all -> 0x0262 }
            r1.p = r5     // Catch:{ all -> 0x01ee }
            monitor-exit(r2)     // Catch:{ all -> 0x01ee }
            r22.g()     // Catch:{ all -> 0x0262 }
        L_0x01ea:
            r6 = r21
            r3 = 1
            goto L_0x0179
        L_0x01ee:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x01f1:
            iwd r0 = d     // Catch:{ IOException -> 0x0299 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0299 }
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ IOException -> 0x0299 }
            r5 = 0
            r3[r5] = r2     // Catch:{ IOException -> 0x0299 }
            java.lang.String r2 = "Delay caused by aggressive file sync: %d ms."
            r0.b(r2, r3)     // Catch:{ IOException -> 0x0299 }
            r7.flush()     // Catch:{ IOException -> 0x0299 }
            java.io.FileDescriptor r0 = r21.getFD()     // Catch:{ IOException -> 0x0299 }
            r0.sync()     // Catch:{ IOException -> 0x0299 }
            long r2 = r22.c()     // Catch:{ IOException -> 0x0299 }
            r1.a((long) r2)     // Catch:{ IOException -> 0x0299 }
            r4.close()     // Catch:{ IOException -> 0x0217 }
            goto L_0x0223
        L_0x0217:
            r0 = move-exception
            r2 = r0
            iwd r0 = d
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = "Unable to close the file."
            r0.d(r3, r2, r4)
        L_0x0223:
            defpackage.izj.a()
            long r2 = r22.c()
            long r4 = r22.b()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0233
            return
        L_0x0233:
            adnw r0 = new adnw
            java.util.Locale r2 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r4 = r22.c()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            long r4 = r22.b()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = "Downloaded file is smaller than expected (%d < %d)."
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r0.<init>(r2)
            throw r0
        L_0x025a:
            r21 = r6
            adnv r0 = new adnv     // Catch:{ all -> 0x0262 }
            r0.<init>()     // Catch:{ all -> 0x0262 }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x0262:
            r0 = move-exception
            goto L_0x026e
        L_0x0264:
            r0 = move-exception
            r21 = r6
        L_0x0267:
            monitor-exit(r2)     // Catch:{ all -> 0x0269 }
            throw r0     // Catch:{ all -> 0x0262 }
        L_0x0269:
            r0 = move-exception
            goto L_0x0267
        L_0x026b:
            r0 = move-exception
            r21 = r6
        L_0x026e:
            r8 = r13
            goto L_0x0273
        L_0x0270:
            r0 = move-exception
            r21 = r6
        L_0x0273:
            iwd r2 = d     // Catch:{ IOException -> 0x0299 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0299 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0299 }
            r6 = 0
            r3[r6] = r5     // Catch:{ IOException -> 0x0299 }
            java.lang.String r5 = "Delay caused by aggressive file sync: %d ms."
            r2.b(r5, r3)     // Catch:{ IOException -> 0x0299 }
            r7.flush()     // Catch:{ IOException -> 0x0299 }
            java.io.FileDescriptor r2 = r21.getFD()     // Catch:{ IOException -> 0x0299 }
            r2.sync()     // Catch:{ IOException -> 0x0299 }
            long r2 = r22.c()     // Catch:{ IOException -> 0x0299 }
            r1.a((long) r2)     // Catch:{ IOException -> 0x0299 }
            throw r0     // Catch:{ IOException -> 0x0299 }
        L_0x0296:
            r0 = move-exception
            r2 = r0
            goto L_0x02b0
        L_0x0299:
            r0 = move-exception
            boolean r2 = r0 instanceof defpackage.adnw     // Catch:{ all -> 0x0296 }
            if (r2 != 0) goto L_0x02ad
            boolean r2 = r0 instanceof defpackage.adnv     // Catch:{ all -> 0x0296 }
            if (r2 != 0) goto L_0x02aa
            adnw r2 = new adnw     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "Error when downloading file content."
            r2.<init>((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0296 }
            throw r2     // Catch:{ all -> 0x0296 }
        L_0x02aa:
            adnv r0 = (defpackage.adnv) r0     // Catch:{ all -> 0x0296 }
            throw r0     // Catch:{ all -> 0x0296 }
        L_0x02ad:
            adnw r0 = (defpackage.adnw) r0     // Catch:{ all -> 0x0296 }
            throw r0     // Catch:{ all -> 0x0296 }
        L_0x02b0:
            r4.close()     // Catch:{ IOException -> 0x02b4 }
            goto L_0x02c0
        L_0x02b4:
            r0 = move-exception
            r3 = r0
            iwd r0 = d
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "Unable to close the file."
            r0.d(r5, r3, r4)
        L_0x02c0:
            defpackage.izj.a()
            throw r2
        L_0x02c4:
            r0 = move-exception
            goto L_0x02c7
        L_0x02c6:
            r0 = move-exception
        L_0x02c7:
            r2.disconnect()
            adnw r2 = new adnw
            java.lang.String r3 = "Unable to get response code."
            r2.<init>((java.lang.String) r3, (java.lang.Throwable) r0)
            throw r2
        L_0x02d2:
            r0 = move-exception
            r2.disconnect()
            java.lang.Throwable r2 = defpackage.amtb.b(r0)
            boolean r2 = r2 instanceof defpackage.adnw
            if (r2 == 0) goto L_0x02e5
            java.lang.Throwable r0 = defpackage.amtb.b(r0)
            adnw r0 = (defpackage.adnw) r0
            throw r0
        L_0x02e5:
            adnw r2 = new adnw
            java.lang.String r3 = "Unknown download exception."
            r2.<init>((java.lang.String) r3, (java.lang.Throwable) r0)
            throw r2
        L_0x02ed:
            r0 = move-exception
            adnw r2 = new adnw
            java.lang.String r3 = "Unable to open the network connection."
            r2.<init>((java.lang.String) r3, (java.lang.Throwable) r0)
            goto L_0x02f7
        L_0x02f6:
            throw r2
        L_0x02f7:
            goto L_0x02f6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adoc.f():void");
    }

    private final void g() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        amri amri = ampu.a;
        synchronized (this.b) {
            if (elapsedRealtime - this.s > e) {
                this.s = elapsedRealtime;
                adnz adnz = this.c;
                if (adnz != null) {
                    amri = amri.b(adnz);
                }
            }
        }
        if (amri.a()) {
            long b2 = b();
            long c2 = c();
            d();
            ((adnz) amri.b()).a(b2, c2);
        }
    }

    public final long b() {
        long j2;
        synchronized (this.b) {
            j2 = this.r;
        }
        return j2;
    }

    public final long c() {
        long j2;
        synchronized (this.b) {
            j2 = this.p;
        }
        return j2;
    }

    public final long d() {
        long j2;
        if (!ayoo.a.a().c()) {
            return c();
        }
        synchronized (this.b) {
            j2 = this.q;
        }
        return j2;
    }

    public final void e() {
        synchronized (this.b) {
            adob adob = this.n;
            if (adob != null) {
                adob.c();
            }
            this.t = true;
        }
    }

    private final void a(long j2) {
        synchronized (this.b) {
            this.p = j2;
            this.q = j2;
        }
        g();
    }

    public final void a() {
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo;
        adod adod = this.o;
        WifiManager.WifiLock wifiLock = null;
        if (adod != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f.getSystemService("connectivity");
            if (adod.a.a() ? !((networkCapabilities = connectivityManager.getNetworkCapabilities((Network) adod.a.b())) == null || !networkCapabilities.hasTransport(1)) : !((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1)) {
                wifiLock = this.g.createWifiLock(1, "Download system update");
                wifiLock.acquire();
            }
        }
        try {
            f();
            if (wifiLock != null) {
                wifiLock.release();
            }
        } catch (Throwable th) {
            if (wifiLock != null) {
                wifiLock.release();
            }
            throw th;
        }
    }
}
