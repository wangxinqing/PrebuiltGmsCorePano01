package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import com.google.android.gms.common.util.ScreenEventMonitor$1;

/* renamed from: jkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkz {
    private final Context a;
    private final Handler b;
    private final PowerManager c;
    private jky d;
    private BroadcastReceiver e;

    public jkz(Context context, Handler handler) {
        this.a = context.getApplicationContext();
        this.b = handler;
        this.c = (PowerManager) context.getSystemService("power");
    }

    public final synchronized void a() {
        if (this.d != null) {
            this.d = null;
            this.a.unregisterReceiver(this.e);
            this.e = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Intent r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            java.lang.String r1 = r3.getAction()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            java.lang.String r3 = r3.getAction()     // Catch:{ all -> 0x002b }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0020
            jky r3 = r2.d     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0020
            r3.e()     // Catch:{ all -> 0x002b }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            jky r3 = r2.d     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0020
            r3.d()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x002f
        L_0x002e:
            throw r3
        L_0x002f:
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkz.a(android.content.Intent):void");
    }

    public final boolean b() {
        int i = Build.VERSION.SDK_INT;
        return this.c.isInteractive();
    }

    public final synchronized void a(jky jky) {
        boolean z;
        iva.a((Object) jky);
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        this.d = jky;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ScreenEventMonitor$1 screenEventMonitor$1 = new ScreenEventMonitor$1(this, "common-base");
        this.e = screenEventMonitor$1;
        this.a.registerReceiver(screenEventMonitor$1, intentFilter, (String) null, this.b);
    }
}
