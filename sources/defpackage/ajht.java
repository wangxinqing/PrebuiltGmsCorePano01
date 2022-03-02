package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import com.google.android.location.reporting.collectors.ble.BleLowPowerScanReporter$AlarmBroadcastReceiver;
import com.google.android.ulr.ApiBleRate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ajht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajht extends gth implements ajhw {
    public static final /* synthetic */ int a = 0;
    private static final BleSettings b;
    private static final BleSettings c;
    private final jbs d;
    private final ajid e;
    private final ajhv f;
    private final Context g;
    private nla h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m = aztb.c();
    private long n;

    static {
        gtj gtj = new gtj();
        gtj.b(0);
        gtj.a = 3;
        b = gtj.a();
        gtj gtj2 = new gtj();
        gtj2.b(3);
        gtj2.a = 3;
        c = gtj2.a();
    }

    public ajht(Context context, jbs jbs, ajid ajid, ajhv ajhv) {
        this.g = context;
        this.d = jbs;
        this.e = ajid;
        this.f = ajhv;
    }

    public static boolean g() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!aztb.a.a().n()) {
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (defaultAdapter == null || !defaultAdapter.isOffloadedFilteringSupported()) {
                return false;
            }
            return true;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    private final void i() {
        this.e.a((gth) this);
    }

    private final void j() {
        nla nla = this.h;
        if (nla != null) {
            this.g.unregisterReceiver(nla);
            this.h = null;
        }
        this.d.a(ajnw.b(this.g, "com.google.android.location.reporting.collectors.ble.ULR_BLE_BACKOFF_ALARM"));
    }

    public final synchronized void a() {
        if (!this.i) {
            this.i = true;
            h();
        }
    }

    public final synchronized void b() {
        this.i = false;
        j();
        i();
    }

    public final synchronized ApiBleRate c() {
        if (this.j) {
            return new ApiBleRate((Long) null, Boolean.valueOf(ajif.a()), Long.valueOf(this.n), 0L, "lowPowerOsBackoff");
        }
        return new ApiBleRate((Long) null, Boolean.valueOf(ajif.a()), (Long) null, 0L, "lowPowerOs");
    }

    public final synchronized void d() {
        if (this.i) {
            i();
            h();
        }
    }

    public final synchronized void e() {
    }

    public final synchronized void f() {
    }

    public final void h() {
        if (this.i) {
            j();
            this.j = false;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.k = elapsedRealtime;
            this.l = elapsedRealtime;
            gtj gtj = new gtj(b);
            gtj.a(ajig.a());
            this.e.a(this, gtj.a());
            this.f.a(c());
        }
    }

    public final void a(int i2, BleSighting bleSighting) {
        if (i2 != 4) {
            ArrayList a2 = ajml.a(new gtu(), Collections.singletonList(bleSighting));
            synchronized (this) {
                if (this.i) {
                    this.f.a((List) a2);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - this.l > aztb.a.a().r()) {
                        this.k = elapsedRealtime;
                    } else if (elapsedRealtime - this.k > aztb.a.a().p() && !this.j) {
                        this.j = true;
                        gtj gtj = new gtj(c);
                        gtj.a(ajig.a());
                        this.e.a(this, gtj.a());
                        if (SystemClock.elapsedRealtime() - this.k > aztb.a.a().q()) {
                            this.m = aztb.c();
                        }
                        long j2 = this.m;
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("Backing off for ");
                        sb.append(j2);
                        sb.append(" millis.");
                        sb.toString();
                        j();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.location.reporting.collectors.ble.ULR_BLE_BACKOFF_ALARM");
                        BleLowPowerScanReporter$AlarmBroadcastReceiver bleLowPowerScanReporter$AlarmBroadcastReceiver = new BleLowPowerScanReporter$AlarmBroadcastReceiver(this);
                        this.h = bleLowPowerScanReporter$AlarmBroadcastReceiver;
                        this.g.registerReceiver(bleLowPowerScanReporter$AlarmBroadcastReceiver, intentFilter);
                        this.d.a("BleLowPowerScanReporter", 3, SystemClock.elapsedRealtime() + this.m, ajnw.b(this.g, "com.google.android.location.reporting.collectors.ble.ULR_BLE_BACKOFF_ALARM"), "com.google.android.gms");
                        long j3 = this.m;
                        this.n = j3;
                        this.m = j3 + aztb.a.a().l();
                        long o = aztb.a.a().o();
                        if (this.m > o) {
                            this.m = o;
                        }
                        this.f.a(c());
                    }
                    this.l = SystemClock.elapsedRealtime();
                }
            }
        }
    }
}
