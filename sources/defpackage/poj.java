package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.icing.proxy.SmsMonitorIntentOperation;

/* renamed from: poj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poj extends qvv {
    private static poj e;
    private final Context a;
    private final jbs b;
    private final oyq c;
    private long d = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private poj(Context context) {
        super("icing", "SmsContentObserver", (Handler) null);
        oyq oyq = new oyq(context);
        jbs jbs = new jbs(context);
        this.a = context;
        this.b = jbs;
        this.c = oyq;
    }

    public static synchronized void a() {
        synchronized (poj.class) {
            if (e != null) {
                pnz.d("Unregistering SMS content observer");
                e.a.getContentResolver().unregisterContentObserver(e);
                e.c();
                e = null;
            }
        }
    }

    private final synchronized void a(long j) {
        this.d = j;
    }

    static synchronized void b(Context context) {
        synchronized (poj.class) {
            a(context);
            if (e != null) {
                e.c();
                e.a(SystemClock.elapsedRealtime());
                pnz.d("SMS Corpus update scheduled");
            }
        }
    }

    private final void c() {
        PendingIntent service = PendingIntent.getService(this.a, 0, d(this.a), 536870912);
        if (service != null) {
            synchronized (poj.class) {
                e.b.a(service);
            }
            service.cancel();
        }
    }

    static Intent d(Context context) {
        return IntentOperation.getStartIntent(context, SmsMonitorIntentOperation.class, "com.google.android.gms.icing.proxy.action.SMS_CHANGED");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<poj> r0 = defpackage.poj.class
            monitor-enter(r0)
            java.lang.String r1 = "SmsContentObserver.maybeRegister"
            defpackage.pnz.d(r1)     // Catch:{ all -> 0x0031 }
            boolean r1 = defpackage.poo.a((android.content.Context) r2)     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x0018
            java.lang.String r2 = "SMS content observer isn't registered because SMS Corpus is disabled."
            defpackage.pnz.d(r2)     // Catch:{ all -> 0x0031 }
            a()     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)
            return
        L_0x0018:
            poj r1 = e     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "Registering SMS content observer"
            defpackage.pnz.d(r1)     // Catch:{ all -> 0x0031 }
            poj r1 = new poj     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0031 }
            r1.<init>(r2)     // Catch:{ all -> 0x0031 }
            e = r1     // Catch:{ all -> 0x0031 }
            r1.b()     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)
            return
        L_0x0031:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poj.a(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        try {
            this.a.getContentResolver().registerContentObserver(poo.c, false, this);
        } catch (NoClassDefFoundError | SecurityException e2) {
            this.c.a("sms_register_observer_failed");
            pnz.b("Failed to register SMS Corpus observer");
        }
    }

    public static synchronized void c(Context context) {
        synchronized (poj.class) {
            a(context);
            if (e != null) {
                e.onChange(false);
            }
        }
    }

    public final synchronized void a(boolean z, Uri uri) {
        pnz.d("SmsObserver onChange selfChange=%b", Boolean.valueOf(z));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent d2 = d(this.a);
        if (PendingIntent.getService(this.a, 0, d2, 536870912) != null) {
            if (elapsedRealtime > this.d + ((Long) ozx.W.c()).longValue()) {
                pnz.d("Max deferral time for SMS processing reached");
                return;
            }
        }
        PendingIntent service = PendingIntent.getService(this.a, 0, d2, 134217728);
        long longValue = ((Long) ozx.V.c()).longValue();
        this.b.a("Icing:SmsObserverOnChange", 2, elapsedRealtime + longValue, service, (String) null);
        pnz.d("Deferring SMS processing by %d ms", Long.valueOf(longValue));
    }
}
