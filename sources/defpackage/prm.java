package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: prm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prm {
    private static final Map e = new HashMap();
    public final Object a = new Object();
    public final Context b;
    public final ppp c;
    public osf d;
    private final String f;
    private Thread g;
    private int h;

    private prm(String str, Context context, ppp ppp) {
        this.f = str;
        this.b = context;
        this.c = ppp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.prm a(java.lang.String r4, android.content.Context r5) {
        /*
            java.util.Map r0 = e
            monitor-enter(r0)
            java.util.Map r1 = e     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x007d }
            prm r1 = (defpackage.prm) r1     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x003c
            boolean r1 = defpackage.axsd.f()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0034
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007d }
            r1.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "com.google.android.gms.icing.service.IndexWorkerService"
            android.content.Intent r1 = r1.setClassName(r5, r2)     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "com.google.android.gms.icing.START_STICKY"
            android.content.Intent r1 = r1.setAction(r2)     // Catch:{ all -> 0x007d }
            ppp r2 = new ppp     // Catch:{ all -> 0x007d }
            r2.<init>(r5, r4, r1)     // Catch:{ all -> 0x007d }
            prm r1 = new prm     // Catch:{ all -> 0x007d }
            r1.<init>(r4, r5, r2)     // Catch:{ all -> 0x007d }
            java.util.Map r5 = e     // Catch:{ all -> 0x007d }
            r5.put(r4, r1)     // Catch:{ all -> 0x007d }
            goto L_0x003d
        L_0x0034:
            java.lang.String r4 = "StaticContext cannot be created as indexing is disabled on this device"
            defpackage.oso.a(r4)     // Catch:{ all -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            r4 = 0
            return r4
        L_0x003c:
        L_0x003d:
            c()     // Catch:{ all -> 0x007d }
            int r4 = r1.h     // Catch:{ all -> 0x007d }
            r5 = 1
            int r4 = r4 + r5
            r1.h = r4     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "onCreate count=%d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007d }
            defpackage.oso.a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x007d }
            int r4 = r1.h     // Catch:{ all -> 0x007d }
            if (r4 != r5) goto L_0x007b
            axrm r4 = defpackage.axrm.a     // Catch:{ all -> 0x007d }
            axrn r4 = r4.a()     // Catch:{ all -> 0x007d }
            boolean r4 = r4.c()     // Catch:{ all -> 0x007d }
            if (r4 == 0) goto L_0x007b
            java.lang.Thread r4 = r1.g     // Catch:{ all -> 0x007d }
            if (r4 != 0) goto L_0x007b
            jfx r4 = new jfx     // Catch:{ all -> 0x007d }
            pqb r5 = new pqb     // Catch:{ all -> 0x007d }
            oyq r2 = new oyq     // Catch:{ all -> 0x007d }
            android.content.Context r3 = r1.b     // Catch:{ all -> 0x007d }
            r2.<init>(r3)     // Catch:{ all -> 0x007d }
            r5.<init>(r2)     // Catch:{ all -> 0x007d }
            r2 = 10
            r4.<init>(r2, r5)     // Catch:{ all -> 0x007d }
            r1.g = r4     // Catch:{ all -> 0x007d }
            r4.start()     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return r1
        L_0x007d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prm.a(java.lang.String, android.content.Context):prm");
    }

    private static void c() {
        iva.a(Looper.getMainLooper() == Looper.myLooper());
    }

    public final osf b() {
        osf osf;
        synchronized (this.a) {
            osf = this.d;
            if (osf == null) {
                osf = new osf(this.b, this.c, this.f);
                oso.a("%s: Starting asynchronous initialization", (Object) this.f);
                osf.a(false);
                this.d = osf;
                new jfx(10, new prl(this, osf)).start();
            } else {
                oso.a("%s: Re-using cached", (Object) this.f);
            }
        }
        return osf;
    }

    public final void a() {
        boolean z;
        c();
        int i = this.h - 1;
        this.h = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "More calls to onDestroy than onCreate");
        oso.a("onDestroy count=%d", (Object) Integer.valueOf(this.h));
        if (this.h == 0) {
            synchronized (this.a) {
            }
            Thread thread = this.g;
            if (thread != null) {
                thread.interrupt();
                this.g = null;
            }
        }
    }
}
