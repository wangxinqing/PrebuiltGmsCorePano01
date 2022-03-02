package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.location.reporting.collectors.ble.BleScanner$2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ajic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajic {
    public static final BleSettings a;
    public static final BleSettings b;
    public final gtu c;
    public final ArrayList d;
    public final Executor e;
    public final jiq f;
    public final boolean g;
    public final boolean h;
    public final Context i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public ajhv r;
    public final BroadcastReceiver s = new BleScanner$2(this, "location");
    private final ajid t;
    private final List u;
    private final jbs v;
    private final PendingIntent w;
    private final gth x = new ajia(this);

    static {
        gtj gtj = new gtj();
        gtj.b(2);
        gtj.a = 3;
        a = gtj.a();
        gtj gtj2 = new gtj();
        gtj2.b(3);
        gtj2.a(0);
        gtj2.a = 3;
        b = gtj2.a();
    }

    public ajic(Context context, jiq jiq, ajid ajid, jbs jbs, boolean z, long j2, long j3, long j4) {
        this.i = context;
        this.f = jiq;
        this.t = ajid;
        this.v = jbs;
        this.g = z;
        this.h = true;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.c = new gtu();
        this.u = ajig.a();
        this.d = new ArrayList();
        this.m = false;
        this.n = false;
        this.p = false;
        this.o = -1;
        this.e = jfm.b(10);
        this.w = ajnw.b(context, "com.google.android.location.reporting.collectors.ble.ULR_BLE_SCAN_ALARM");
    }

    private final String e() {
        long j2 = this.j;
        long j3 = this.k;
        long j4 = this.l;
        StringBuilder sb = new StringBuilder(115);
        sb.append("{scanActiveTimeMs=");
        sb.append(j2);
        sb.append(", scanAlarmDelayMs=");
        sb.append(j3);
        sb.append(", scanMinDelayMs=");
        sb.append(j4);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        if (this.n) {
            this.d.addAll(list);
        } else if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ajml) list.get(i2)).h = true;
            }
            ajhv ajhv = this.r;
            if (ajhv != null) {
                ajhv.a(list);
            }
        }
    }

    public final void b() {
        ajix.a("GCoreUlr", "Stopping BLE scanner");
        ajid ajid = this.t;
        if (ajid != null) {
            ajid.a(this.x);
        }
        this.n = false;
    }

    public final void d() {
        this.v.a(this.w);
        if (this.q) {
            this.i.unregisterReceiver(this.s);
            this.q = false;
        }
    }

    public final void c() {
        long j2;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.k;
        StringBuilder sb = new StringBuilder(52);
        sb.append("Scheduling BLE alarm, interval: ");
        sb.append(j3);
        sb.toString();
        long bN = aztb.a.a().bN();
        long j4 = this.o;
        if (elapsedRealtime - j4 >= bN || j4 == -1) {
            j2 = elapsedRealtime;
        } else {
            j2 = j4 + bN;
        }
        if (!aztb.P()) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        jbs jbs = this.v;
        long j5 = this.k;
        PendingIntent pendingIntent = this.w;
        WorkSource a2 = jlr.a(jbs.f, "com.google.android.gms");
        if (jbs.a(j2)) {
            int i3 = Build.VERSION.SDK_INT;
            jbs.a("BleScanner", i2, j2, jbs.a(), j5, pendingIntent, a2);
        }
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.m) {
            this.v.a(this.w);
            if (this.j != 0) {
                this.j = 0;
                this.k = 0;
                this.l = 0;
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(long j2, long j3, long j4) {
        if (j2 == this.j) {
            if (j3 == this.k && j4 == this.l) {
                String valueOf = String.valueOf(e());
                if (valueOf.length() == 0) {
                    new String("Not changing BLE scan rates: ");
                } else {
                    "Not changing BLE scan rates: ".concat(valueOf);
                }
                return false;
            }
        }
        this.l = j4;
        this.j = j2;
        if (this.k != j3) {
            this.k = j3;
            if (this.m && this.h) {
                this.p = true;
                c();
            }
        }
        String valueOf2 = String.valueOf(e());
        ajix.a("GCoreUlr", valueOf2.length() == 0 ? new String("Updated BLE scan rates: ") : "Updated BLE scan rates: ".concat(valueOf2));
        return true;
    }

    public final boolean a(BleSettings bleSettings) {
        int i2 = bleSettings.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Starting BLE scan: mode: ");
        sb.append(i2);
        ajix.a("GCoreUlr", sb.toString());
        boolean z = false;
        if (this.t == null) {
            return false;
        }
        gtj gtj = new gtj(bleSettings);
        gtj.a(this.u);
        this.t.a(this.x, gtj.a());
        if (bleSettings.a == a.a) {
            z = true;
        }
        this.n = z;
        return true;
    }
}
