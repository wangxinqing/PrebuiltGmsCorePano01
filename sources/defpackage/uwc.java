package defpackage;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: uwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwc {
    public static final long a = TimeUnit.SECONDS.toMillis(11);
    private final Context b;
    private final WifiP2pManager c;
    private WifiP2pManager.Channel d;
    private final Set e = new ob();
    private long f;

    public uwc(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = (WifiP2pManager) applicationContext.getSystemService("wifip2p");
    }

    public static boolean b() {
        if (jkr.i()) {
            return true;
        }
        if (!jkr.h() || !Build.ID.contains("QQ2")) {
            return false;
        }
        return true;
    }

    public final synchronized WifiP2pManager.Channel a(int i) {
        if (this.d == null) {
            WifiP2pManager.Channel initialize = this.c.initialize(this.b, Looper.getMainLooper(), new uwa(this));
            this.d = initialize;
            if (initialize == null) {
                ((anih) ((anih) ulh.a.b()).a("uwc", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Direct failed to initialize a channel.");
                return null;
            }
            jjg jjg = ulh.a;
        }
        this.e.add(Integer.valueOf(i));
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        ((anih) ((anih) ulh.a.d()).a("uwc", "c", 79, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Direct channel has disconnected.");
        a();
    }

    public final synchronized void b(int i) {
        if (this.d != null) {
            this.e.remove(Integer.valueOf(i));
            if (i == 3) {
                this.f = SystemClock.elapsedRealtime() + a;
            }
            if (this.e.isEmpty()) {
                a();
            }
        }
    }

    public final synchronized void a() {
        long j;
        if (this.d != null) {
            boolean z = false;
            if (this.f == 0 && !this.e.contains(3)) {
                z = true;
            }
            if (!b()) {
                if (!z) {
                    if (!this.e.contains(3)) {
                        j = this.f - SystemClock.elapsedRealtime();
                    } else {
                        j = a;
                    }
                    if (j > 0) {
                        new uwb(10, j, this.d, "WifiDirect").start();
                    } else {
                        this.d.close();
                    }
                    this.d = null;
                    ((anih) ((anih) ulh.a.d()).a("uwc", "a", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed WiFi Direct channel.");
                }
            }
            this.d.close();
            this.d = null;
            ((anih) ((anih) ulh.a.d()).a("uwc", "a", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed WiFi Direct channel.");
        }
        this.e.clear();
        this.f = 0;
    }
}
