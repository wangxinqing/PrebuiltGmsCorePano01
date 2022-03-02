package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.http.params.HttpParams;

/* renamed from: ngs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngs implements ngo {
    public static final String a;
    static final Status b = new Status(23509, ngf.g(23509));
    static final Status c = Status.e;
    static final Status d = new Status(13, "Wrong checksum");
    static final Status e = new Status(13, "Wrong file size");
    public static final Status f = new Status(23512, "File system unavailable");
    public final boolean g;
    private final ExecutorService h;
    private final ScheduledExecutorService i;
    private final File j;
    private final Runnable k;
    private final Object l = new Object();
    private final Map m = new HashMap();
    private final opc n;

    static {
        StringBuilder sb = new StringBuilder(17);
        sb.append("Fonts/201216073");
        a = sb.toString();
    }

    public ngs(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, Context context, Runnable runnable) {
        boolean z;
        amrl.a((Object) context, (Object) "context");
        Context applicationContext = context.getApplicationContext();
        amrl.a((Object) executorService, (Object) "executor");
        this.h = executorService;
        amrl.a((Object) scheduledExecutorService, (Object) "scheduler");
        this.i = scheduledExecutorService;
        amrl.a((Object) runnable, (Object) "resultPump");
        this.k = runnable;
        File file = new File(applicationContext.getCacheDir(), "httpclient_tmp");
        this.j = file;
        if (file.isDirectory() || this.j.mkdirs()) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        opc opc = new opc(applicationContext, a, true);
        this.n = opc;
        HttpParams httpParams = opc.b;
        httpParams.setParameter("http.connection.timeout", 30000);
        httpParams.setParameter("http.socket.timeout", 10000);
    }

    public final Status a(String str, nfw nfw) {
        Status status;
        if (!this.g) {
            return f;
        }
        ngq b2 = b(str, nfw);
        synchronized (b2.c) {
            status = b2.e;
        }
        return status;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        if (r0.exists() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        defpackage.ngz.a("FontsHttpClientDL", "Leftover temp file %s; deleting to download %s", r0, r13);
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        r13 = r12.i.schedule(new defpackage.ngr(r4), 60000, java.util.concurrent.TimeUnit.MILLISECONDS);
        r14 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r4.f != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r4.f = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r12.h.execute(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        throw new java.lang.IllegalStateException("Already have a timeoutFuture");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ngq b(java.lang.String r13, defpackage.nfw r14) {
        /*
            r12 = this;
            java.lang.String r0 = "url"
            defpackage.amrl.a((java.lang.Object) r13, (java.lang.Object) r0)
            java.lang.String r0 = "spec"
            defpackage.amrl.a((java.lang.Object) r14, (java.lang.Object) r0)
            long r0 = r14.c
            r2 = 1
            r3 = 0
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            java.lang.String r1 = "files must be < max int"
            defpackage.iva.a((boolean) r0, (java.lang.Object) r1)
            java.lang.String r0 = r14.b
            java.io.File r0 = r12.a(r0)
            java.lang.Object r1 = r12.l
            monitor-enter(r1)
            java.util.Map r4 = r12.m     // Catch:{ all -> 0x0118 }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x0118 }
            ngq r4 = (defpackage.ngq) r4     // Catch:{ all -> 0x0118 }
            if (r4 == 0) goto L_0x003e
            java.lang.String r14 = "FontsHttpClientDL"
            java.lang.String r0 = "Returning existing tracker for %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0118 }
            r2[r3] = r13     // Catch:{ all -> 0x0118 }
            defpackage.ngz.c(r14, r0, r2)     // Catch:{ all -> 0x0118 }
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            return r4
        L_0x003e:
            java.util.Map r4 = r12.m     // Catch:{ all -> 0x0118 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x0118 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0118 }
        L_0x0048:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0118 }
            if (r5 != 0) goto L_0x00b3
            java.lang.String r4 = "FontsHttpClientDL"
            java.lang.String r5 = "Starting new download of %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0118 }
            r6[r3] = r13     // Catch:{ all -> 0x0118 }
            defpackage.ngz.c(r4, r5, r6)     // Catch:{ all -> 0x0118 }
            ngq r11 = new ngq     // Catch:{ all -> 0x0118 }
            opc r5 = r12.n     // Catch:{ all -> 0x0118 }
            java.lang.Runnable r9 = r12.k     // Catch:{ all -> 0x0118 }
            ngp r10 = new ngp     // Catch:{ all -> 0x0118 }
            r10.<init>()     // Catch:{ all -> 0x0118 }
            r4 = r11
            r6 = r13
            r7 = r14
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0118 }
            java.util.Map r14 = r12.m     // Catch:{ all -> 0x0118 }
            r14.put(r13, r11)     // Catch:{ all -> 0x0118 }
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            boolean r14 = r0.exists()
            if (r14 == 0) goto L_0x0088
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r3] = r0
            r14[r2] = r13
            java.lang.String r13 = "FontsHttpClientDL"
            java.lang.String r1 = "Leftover temp file %s; deleting to download %s"
            defpackage.ngz.a(r13, r1, r14)
            r0.delete()
        L_0x0088:
            java.util.concurrent.ScheduledExecutorService r13 = r12.i
            ngr r14 = new ngr
            r14.<init>(r11)
            r0 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r13 = r13.schedule(r14, r0, r2)
            java.lang.Object r14 = r11.c
            monitor-enter(r14)
            java.util.concurrent.ScheduledFuture r0 = r11.f     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00a8
            r11.f = r13     // Catch:{ all -> 0x00b0 }
            monitor-exit(r14)     // Catch:{ all -> 0x00b0 }
            java.util.concurrent.ExecutorService r13 = r12.h
            r13.execute(r11)
            return r11
        L_0x00a8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "Already have a timeoutFuture"
            r13.<init>(r0)     // Catch:{ all -> 0x00b0 }
            throw r13     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00b0 }
            throw r13
        L_0x00b3:
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0118 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0118 }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x0118 }
            ngq r6 = (defpackage.ngq) r6     // Catch:{ all -> 0x0118 }
            nfw r6 = r6.b     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x0118 }
            java.lang.String r7 = r14.b     // Catch:{ all -> 0x0118 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0118 }
            if (r6 != 0) goto L_0x00cd
            goto L_0x0048
        L_0x00cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r5.getKey()     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0118 }
            java.lang.String r14 = r14.b     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0118 }
            int r3 = r3.length()     // Catch:{ all -> 0x0118 }
            int r3 = r3 + 61
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0118 }
            int r4 = r4.length()     // Catch:{ all -> 0x0118 }
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0118 }
            int r4 = r4.length()     // Catch:{ all -> 0x0118 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r4.<init>(r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "Requested concurrent download of two urls to one file: "
            r4.append(r3)     // Catch:{ all -> 0x0118 }
            r4.append(r13)     // Catch:{ all -> 0x0118 }
            java.lang.String r13 = ", "
            r4.append(r13)     // Catch:{ all -> 0x0118 }
            r4.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r13 = " to "
            r4.append(r13)     // Catch:{ all -> 0x0118 }
            r4.append(r14)     // Catch:{ all -> 0x0118 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0118 }
            r0.<init>(r13)     // Catch:{ all -> 0x0118 }
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x011b:
            throw r13
        L_0x011c:
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngs.b(java.lang.String, nfw):ngq");
    }

    public final File a(String str) {
        return new File(this.j, str);
    }

    public final void a(String str, String str2) {
        ngq ngq;
        amrl.a((Object) str, (Object) "url");
        amrl.a((Object) str2, (Object) "filename");
        ngz.c("FontsHttpClientDL", "forget(%s, %s)", str, str2);
        synchronized (this.l) {
            ngq = (ngq) this.m.get(str);
            if (ngq != null) {
                this.m.remove(ngq.a);
            }
        }
        if (ngq == null) {
            ngz.a("FontsHttpClientDL", "Asked to forget %s but we weren't tracking it", str);
            return;
        }
        ngq.a(c);
    }

    public final byte[] b(String str) {
        return jjt.a(a(str));
    }
}
