package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.gms.nearby.mediums.WifiRadio$1;
import com.google.android.gms.nearby.mediums.WifiRadio$2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: upb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upb {
    public final aoru a;
    private final Context b;
    private final uru c;
    private final WifiManager d;
    private final AtomicBoolean e;
    private urq f;
    private final BroadcastReceiver g = new WifiRadio$1(this, "nearby");

    public upb(Context context, uru uru) {
        aoru b2 = tid.b();
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = uru;
        this.a = b2;
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService("wifi");
        this.d = wifiManager;
        if (wifiManager != null) {
            if (!b(1)) {
                g();
            } else if (!f()) {
                ((anih) ((anih) ulh.a.c()).a("upb", "<init>", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to take register radio state upon initialization.", (Object) "[WIFI_RADIO]");
                this.e = null;
                return;
            }
            this.e = new AtomicBoolean(this.d.isWifiEnabled());
            jjg jjg = ulh.a;
            this.d.isWifiEnabled();
            h();
            return;
        }
        ((anih) ((anih) ulh.a.b()).a("upb", "<init>", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve WifiManager, Wifi is unsupported.");
        this.e = null;
    }

    private final boolean a(int i) {
        boolean z;
        if (b(i)) {
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WifiRadio$2 wifiRadio$2 = new WifiRadio$2("nearby", i, countDownLatch);
        this.b.registerReceiver(wifiRadio$2, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        i();
        try {
            WifiManager wifiManager = this.d;
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            wifiManager.setWifiEnabled(z);
            if (!countDownLatch.await(aymi.ak(), TimeUnit.SECONDS)) {
                ((anih) ((anih) ulh.a.c()).a("upb", "a", 520, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s timed out while waiting for latch to signal Wifi state change completion.", (Object) "[WIFI_RADIO]");
            } else {
                jjg jjg = ulh.a;
            }
            thp.a(this.b, (BroadcastReceiver) wifiRadio$2);
            h();
            if (b(i)) {
                return true;
            }
            ((anih) ((anih) ulh.a.b()).a("upb", "a", 540, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set Wifi state to %s after waiting %d seconds, bailing.", (Object) ulf.a(i), aymi.ak());
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("upb", "a", 526, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to set Wifi state to %s", (Object) ulf.a(i));
            thp.a(this.b, (BroadcastReceiver) wifiRadio$2);
            h();
            return false;
        } catch (Throwable th) {
            thp.a(this.b, (BroadcastReceiver) wifiRadio$2);
            h();
            throw th;
        }
    }

    private final boolean b(int i) {
        return this.d.getWifiState() == i;
    }

    private final boolean e() {
        return (this.d == null || this.e == null) ? false : true;
    }

    private final boolean f() {
        if (k()) {
            jjg jjg = ulh.a;
            return true;
        }
        urq urq = new urq(11);
        if (this.c.b(urq) != urt.SUCCESS) {
            ((anih) ((anih) ulh.a.c()).a("upb", "f", 423, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to mark Wifi as disabled because we were unable to register the MediumOperation.", (Object) "[WIFI_RADIO]");
            return false;
        }
        this.f = urq;
        jjg jjg2 = ulh.a;
        return true;
    }

    private final void g() {
        if (!k()) {
            jjg jjg = ulh.a;
            return;
        }
        this.c.c(this.f);
        this.f = null;
        jjg jjg2 = ulh.a;
    }

    private final void h() {
        this.b.registerReceiver(this.g, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        j();
    }

    private final void i() {
        thp.a(this.b, this.g);
        j();
    }

    private final void j() {
        if (b(3)) {
            g();
        } else {
            f();
        }
    }

    private final boolean k() {
        return this.f != null;
    }

    public final synchronized void c() {
        uru uru;
        if (!aymi.y()) {
            if (jkr.h()) {
                jjg jjg = ulh.a;
                return;
            }
        }
        if (!e()) {
            ((anih) ((anih) ulh.a.c()).a("upb", "c", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to toggle Wifi Radio since it was never initialized.", (Object) "[WIFI_RADIO]");
            return;
        }
        urq urq = new urq(12);
        if (urt.SUCCESS != this.c.b(urq)) {
            ((anih) ((anih) ulh.a.d()).a("upb", "c", 281, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to toggle because we were unable to register the MediumOperation.", (Object) "[WIFI_RADIO]");
            return;
        }
        try {
            if (!a(1)) {
                ((anih) ((anih) ulh.a.c()).a("upb", "c", 289, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to turn Wifi off while toggling state.", (Object) "[WIFI_RADIO]");
            }
            Thread.sleep(aymi.a.a().bL());
            if (!a(3)) {
                ((anih) ((anih) ulh.a.b()).a("upb", "c", 302, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to enable Wifi at the end of a toggle attempt, Wifi-related operations may not work correctly here onwards!", (Object) "[WIFI_RADIO]");
            }
            uru = this.c;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("upb", "c", 296, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Interrupted while waiting in between a Wifi toggle.", (Object) "[WIFI_RADIO]");
            uru = this.c;
        } catch (Throwable th) {
            this.c.c(urq);
            throw th;
        }
        uru.c(urq);
    }

    public final synchronized void d() {
        String str;
        int i;
        if (!e()) {
            ((anih) ((anih) ulh.a.c()).a("upb", "d", 316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to revert Wifi Radio since it was never initialized.", (Object) "[WIFI_RADIO]");
            return;
        }
        jjg jjg = ulh.a;
        this.e.get();
        try {
            if (!this.e.get()) {
                i = 1;
            } else {
                i = 3;
            }
            if (!a(i)) {
                ((anih) ((anih) ulh.a.c()).a("upb", "d", 329, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to revert Wifi back to its most recent manually-set state.", (Object) "[WIFI_RADIO]");
            }
        } finally {
            i();
            str = "WifiRadio.singleThreadOffloader";
            tid.a(this.a, str);
        }
    }

    public final synchronized boolean b() {
        if (!e()) {
            ((anih) ((anih) ulh.a.c()).a("upb", "b", 219, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to disable Wifi Radio since it was never initialized.", (Object) "[WIFI_RADIO]");
            return false;
        } else if (b(1)) {
            jjg jjg = ulh.a;
            return f();
        } else {
            if (!aymi.y()) {
                if (jkr.h()) {
                    jjg jjg2 = ulh.a;
                    g();
                    return false;
                }
            }
            if (!f()) {
                jjg jjg3 = ulh.a;
                return false;
            } else if (!a(1)) {
                jjg jjg4 = ulh.a;
                g();
                return false;
            } else {
                jjg jjg5 = ulh.a;
                return true;
            }
        }
    }

    upb(Context context, uru uru, aoru aoru) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = uru;
        this.a = aoru;
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService("wifi");
        this.d = wifiManager;
        if (wifiManager != null) {
            if (!b(1)) {
                g();
            } else if (!f()) {
                ((anih) ((anih) ulh.a.c()).a("upb", "<init>", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to take register radio state upon initialization.", (Object) "[WIFI_RADIO]");
                this.e = null;
                return;
            }
            this.e = new AtomicBoolean(this.d.isWifiEnabled());
            jjg jjg = ulh.a;
            this.d.isWifiEnabled();
            h();
            return;
        }
        ((anih) ((anih) ulh.a.b()).a("upb", "<init>", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve WifiManager, Wifi is unsupported.");
        this.e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (k() != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Intent r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "upb"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r5.e()     // Catch:{ all -> 0x009c }
            if (r3 != 0) goto L_0x0026
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x009c }
            anie r6 = r6.c()     // Catch:{ all -> 0x009c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x009c }
            r3 = 350(0x15e, float:4.9E-43)
            anie r6 = r6.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x009c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "%s Unable to process manual radio state change since Wifi Radio was never initialized."
            java.lang.String r1 = "[WIFI_RADIO]"
            r6.a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return
        L_0x0026:
            java.lang.String r3 = "android.net.wifi.WIFI_STATE_CHANGED"
            java.lang.String r4 = r6.getAction()     // Catch:{ all -> 0x009c }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = "wifi_state"
            r4 = 4
            int r6 = r6.getIntExtra(r3, r4)     // Catch:{ all -> 0x009c }
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x009c }
            defpackage.ulf.a(r6)     // Catch:{ all -> 0x009c }
            r3 = 1
            r4 = 3
            if (r6 == r4) goto L_0x0047
            if (r6 != r3) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            monitor-exit(r5)
            return
        L_0x0047:
            if (r6 == r4) goto L_0x0050
            boolean r4 = r5.k()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0083
            goto L_0x0056
        L_0x0050:
            boolean r4 = r5.k()     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0083
        L_0x0056:
            if (r6 != r3) goto L_0x005c
            r5.f()     // Catch:{ all -> 0x009c }
            goto L_0x005f
        L_0x005c:
            r5.g()     // Catch:{ all -> 0x009c }
        L_0x005f:
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x009c }
            anie r6 = r6.c()     // Catch:{ all -> 0x009c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x009c }
            r3 = 388(0x184, float:5.44E-43)
            anie r6 = r6.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x009c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "%s State was changed outside of our control. Updating the snapshot to match current radio state."
            java.lang.String r1 = "[WIFI_RADIO]"
            r6.a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x009c }
            android.net.wifi.WifiManager r6 = r5.d     // Catch:{ all -> 0x009c }
            boolean r6 = r6.isWifiEnabled()     // Catch:{ all -> 0x009c }
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.e     // Catch:{ all -> 0x009c }
            r0.getAndSet(r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return
        L_0x0083:
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x009c }
            anie r6 = r6.d()     // Catch:{ all -> 0x009c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x009c }
            r3 = 371(0x173, float:5.2E-43)
            anie r6 = r6.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x009c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "%s Received spurious broadcast for Wifi Radio state change."
            java.lang.String r1 = "[WIFI_RADIO]"
            r6.a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return
        L_0x009c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upb.a(android.content.Intent):void");
    }

    public final synchronized boolean a() {
        if (!e()) {
            ((anih) ((anih) ulh.a.c()).a("upb", "a", 174, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to enable Wifi Radio since it was never initialized.", (Object) "[WIFI_RADIO]");
            return false;
        } else if (b(3)) {
            jjg jjg = ulh.a;
            g();
            return true;
        } else {
            if (!aymi.y()) {
                if (jkr.h()) {
                    jjg jjg2 = ulh.a;
                    f();
                    return false;
                }
            }
            if (!a(3)) {
                jjg jjg3 = ulh.a;
                f();
                return false;
            }
            g();
            jjg jjg4 = ulh.a;
            return true;
        }
    }
}
