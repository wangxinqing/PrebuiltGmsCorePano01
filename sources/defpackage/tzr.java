package defpackage;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.PowerManager;
import com.google.android.gms.nearby.discovery.fastpair.scanner.FastPairScanner$FastPairFoundScanCallback;
import java.util.concurrent.TimeUnit;

/* renamed from: tzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzr {
    public static final anax a = anax.a((Object) "fc128e");
    public static final ParcelUuid b = new ParcelUuid(aeft.a);
    public final Context c;
    public tzq d = tzq.OFF;
    private final arwg e;
    private FastPairScanner$FastPairFoundScanCallback f;
    private final arwm g = new tzn(this, "FastPairScannerDowngrade");
    private final arwm h = new tzo(this, "FastPairScreenOffScannerUpgrade");

    public tzr(Context context) {
        this.c = context;
        this.e = (arwg) thl.a(context, arwg.class);
        txr txr = (txr) thl.a(context, txr.class);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f = new FastPairScanner$FastPairFoundScanCallback(context, txr, this.e);
        }
    }

    private final void a(boolean z) {
        this.e.e(this.g);
        if (!f()) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Skipping stop, already stopped scanning");
            return;
        }
        tgn a2 = tgn.a();
        if (a2 == null) {
            ((anih) tsp.a.c()).a("FastPairScanner2: No bluetooth adapter found to stop scanning");
        } else if (h() || !aymw.Q() || z) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Stopping scan");
            a2.a(this.f);
            this.d = tzq.OFF;
        } else {
            ((anih) tsp.a.d()).a("FastPairScanner2: Scanning still allowed, not stopping, just downgrading.");
            d();
            b();
        }
    }

    private final void b(long j) {
        this.e.e(this.g);
        this.e.a(this.g, j);
    }

    private final boolean h() {
        Context context = this.c;
        return context != null && ((PowerManager) context.getSystemService(PowerManager.class)).isInteractive();
    }

    public final void c() {
        tzq tzq = !h() ? tzq.SCREEN_OFF_INACTIVE_SCANNING : tzq.LOW_POWER_SCANNING;
        if (this.d.equals(tzq)) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Already in %s scanning", (Object) this.d);
            return;
        }
        d();
        if (a(tzq)) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Starting %s scanning", (Object) tzq);
            if (tzq.equals(tzq.SCREEN_OFF_INACTIVE_SCANNING)) {
                long aT = aymt.a.a().aT();
                ((anih) tsp.a.d()).a("FastPairScanner2: Starting screen off scan in %s seconds", TimeUnit.MILLISECONDS.toSeconds(aT));
                this.e.e(this.h);
                this.e.a(this.h, aT);
            }
        }
    }

    public final void d() {
        a(true);
    }

    public final void e() {
        a(false);
    }

    public final boolean f() {
        return this.d.equals(tzq.LOW_LATENCY_SCANNING) || this.d.equals(tzq.LOW_POWER_SCANNING) || this.d.equals(tzq.SCREEN_OFF_ACTIVE_SCANNING) || this.d.equals(tzq.SCREEN_OFF_INACTIVE_SCANNING);
    }

    public final boolean g() {
        ((anih) tsp.a.d()).a("FastPairScanner2: isAlive? bleEnabled:%b, btEnabled:%b, bleScanAvailable:%b", (Object) Boolean.valueOf(arxk.b()), (Object) Boolean.valueOf(arxk.a()), (Object) Boolean.valueOf(arxk.c()));
        return arxk.a() || arxk.c();
    }

    public final void b() {
        long j;
        if (f()) {
            d();
        }
        if (h()) {
            j = aymt.n();
        } else {
            j = aymt.a.a().aS();
        }
        tzq tzq = !h() ? tzq.SCREEN_OFF_ACTIVE_SCANNING : tzq.LOW_LATENCY_SCANNING;
        if (a(tzq)) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Starting %s scan for %s seconds", (Object) tzq, TimeUnit.MILLISECONDS.toSeconds(j));
            b(j);
        }
    }

    private final boolean a(tzq tzq) {
        ScanSettings scanSettings;
        tgn a2 = tgn.a();
        if (a2 == null) {
            ((anih) tsp.a.c()).a("FastPairScanner2: No bluetooth adapter available to start scanning in %s", (Object) tzq);
            return false;
        } else if (this.f == null) {
            ((anih) tsp.a.c()).a("FastPairScanner2: API level not high enough to start scanning in %s", (Object) tzq);
            return false;
        } else if (!a()) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Skipping start scanning in %s, scanning not allowed now (screen on: %s)", (Object) tzq, h());
            return false;
        } else if (this.d.equals(tzq)) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Skipping restart scanning in %s, already scanning", (Object) tzq);
            return false;
        } else {
            this.d = tzq;
            tzq tzq2 = tzq.OFF;
            int ordinal = tzq.ordinal();
            if (ordinal == 1) {
                scanSettings = new ScanSettings.Builder().setScanMode((int) aymt.a.a().aR()).build();
            } else if (ordinal == 2) {
                scanSettings = new ScanSettings.Builder().setScanMode(-1).build();
            } else if (ordinal != 4) {
                scanSettings = new ScanSettings.Builder().setScanMode((int) aymt.q()).build();
            } else {
                scanSettings = new ScanSettings.Builder().setScanMode((int) aymt.a.a().aj()).build();
            }
            FastPairScanner$FastPairFoundScanCallback fastPairScanner$FastPairFoundScanCallback = this.f;
            int scanMode = scanSettings.getScanMode();
            int i = FastPairScanner$FastPairFoundScanCallback.c;
            fastPairScanner$FastPairFoundScanCallback.b.set(scanMode);
            a2.a(amzy.a((Object) new ScanFilter.Builder().setServiceData(b, new byte[]{0}, new byte[]{0}).build()), scanSettings, this.f);
            return true;
        }
    }

    public final void a(long j) {
        tzq tzq = !h() ? tzq.SCREEN_OFF_ACTIVE_SCANNING : tzq.LOW_LATENCY_SCANNING;
        if (this.d.equals(tzq)) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Already in %s scanning, downgrade after %s seconds", (Object) tzq, TimeUnit.MILLISECONDS.toSeconds(j));
            b(j);
            return;
        }
        e();
        if (a(tzq)) {
            ((anih) tsp.a.d()).a("FastPairScanner2: Starting %s scanning for %s seconds", (Object) tzq, TimeUnit.MILLISECONDS.toSeconds(j));
            b(j);
        }
    }

    public final boolean a() {
        return h() || aymw.Q();
    }
}
