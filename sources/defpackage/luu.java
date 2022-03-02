package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;

/* renamed from: luu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class luu {
    public final Context a;
    public lut b;
    public volatile lxc c;
    int d = 0;
    private final Handler e;
    private final ServiceConnection f = new lus(this, "car_setup");

    public luu(Context context) {
        this.a = context;
        this.e = new qvr(Looper.getMainLooper());
    }

    private final synchronized void a(int i) {
        this.d = i;
    }

    private final synchronized void s() {
        jca.a().a(this.a, this.f);
        a(0);
    }

    private final void t() {
        if (this.b != null) {
            this.e.post(new lur(this));
        }
    }

    public final void b(String str) {
        lww.a();
        lww.h(this.a).c();
        try {
            this.c.b(str);
            b(true);
            this.c.d(true);
            this.c.e(true);
            this.c.b(true);
            this.c.f(true);
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
        }
    }

    public final void c(lxg lxg) {
        try {
            this.c.a(true, lxg.ordinal());
        } catch (RemoteException e2) {
            Log.i("CAR.DRIVINGMODE", "startDrivingMode RemoteException", e2);
        }
    }

    public final boolean d() {
        int c2 = a().c();
        return (c2 == 3 || c2 == 0) ? false : true;
    }

    public final boolean e() {
        try {
            return d() && this.c.e();
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
            return false;
        }
    }

    public final boolean f() {
        return awqd.c() && lxh.a(a().a());
    }

    public final boolean g() {
        try {
            return f() && this.c.f();
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
            return false;
        }
    }

    public final boolean h() {
        int c2;
        if (!awqy.a.a().h() || (c2 = a().c()) == 3 || c2 == 0) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        try {
            return h() && this.c.g();
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
            return false;
        }
    }

    public final synchronized int j() {
        return this.d;
    }

    public final synchronized void k() {
        String str;
        if (j() == 0) {
            a(1);
            jca a2 = jca.a();
            Context context = this.a;
            if (!awqm.b()) {
                str = "com.google.android.gms.DRIVING_MODE";
            } else {
                str = "com.google.android.gms.DRIVING_MODE_LOCATION";
            }
            if (!a2.a(context, new Intent(str).setPackage("com.google.android.gms"), this.f, 1)) {
                Log.e("CAR.DRIVINGMODE", "Failed to bind to service");
                s();
            }
        }
    }

    public final boolean l() {
        k();
        if (m()) {
            return true;
        }
        n();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        if (j() != 2) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.j()     // Catch:{ all -> 0x0033 }
            r1 = 1
            r2 = 2
            if (r0 == r2) goto L_0x0031
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0033 }
            r5 = 10000(0x2710, double:4.9407E-320)
            long r5 = r5 + r3
        L_0x0010:
            int r0 = r8.j()     // Catch:{ all -> 0x0033 }
            r7 = 0
            if (r0 == r2) goto L_0x0028
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0028
            long r3 = r5 - r3
            r8.wait(r3)     // Catch:{ InterruptedException -> 0x0025 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0033 }
            goto L_0x0010
        L_0x0025:
            r0 = move-exception
            monitor-exit(r8)
            return r7
        L_0x0028:
            int r0 = r8.j()     // Catch:{ all -> 0x0033 }
            monitor-exit(r8)
            if (r0 != r2) goto L_0x0030
            return r1
        L_0x0030:
            return r7
        L_0x0031:
            monitor-exit(r8)
            return r1
        L_0x0033:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0037
        L_0x0036:
            throw r0
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luu.m():boolean");
    }

    public final synchronized void n() {
        if (j() != 0) {
            try {
                s();
            } catch (IllegalArgumentException | IllegalStateException e2) {
            }
        }
    }

    public final lxg o() {
        try {
            return lxg.b(this.c.j());
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
            return null;
        }
    }

    public final void p() {
        try {
            this.c.k();
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
        }
    }

    public final synchronized void q() {
        a(3);
        this.c = null;
        notifyAll();
    }

    public final void r() {
        String str;
        if (g()) {
            lww.a();
            lww.a(this.a).a();
            return;
        }
        if (jkr.h() && axzp.b()) {
            lww.a();
            iwq a2 = iwq.a(this.a);
            Pair a3 = ltq.a(a2, new ComponentName(this.a.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"));
            if (a3 != null) {
                str = (String) a3.first;
            } else {
                str = null;
            }
            if (str != null) {
                a2.d(str);
            }
        }
        lww.a();
        lsy a4 = lww.a(this.a);
        acwa b2 = a4.b.b(a4.a);
        b2.a(lsu.a);
        b2.a(lsv.a);
    }

    public final luj a() {
        try {
            return luj.a(this.c.c());
        } catch (RemoteException e2) {
            Log.i("CAR.DRIVINGMODE", "getSavedBehaviorApp RemoteException", e2);
            return luj.e(this.a);
        }
    }

    public final boolean c() {
        try {
            return this.c.d();
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
            return false;
        }
    }

    public final synchronized void a(IBinder iBinder) {
        lxc lxc;
        a(2);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drivingmode.IDrivingModeManager");
            lxc = queryLocalInterface instanceof lxc ? (lxc) queryLocalInterface : new lxa(iBinder);
        } else {
            lxc = null;
        }
        this.c = lxc;
        notifyAll();
        t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033 A[Catch:{ RemoteException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[Catch:{ RemoteException -> 0x003d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x002e
            defpackage.lww.a()
            android.content.Context r2 = r6.a
            ltb r2 = defpackage.lww.c(r2)
            java.util.List r2 = r2.c()
            int r3 = r2.size()
            r4 = 0
        L_0x0016:
            if (r4 >= r3) goto L_0x002e
            int r5 = r4 + 1
            java.lang.Object r4 = r2.get(r4)
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            java.lang.String r4 = defpackage.ltn.a((android.bluetooth.BluetoothDevice) r4)
            boolean r4 = r6.a((java.lang.String) r4)
            if (r4 == 0) goto L_0x002c
            r2 = 1
            goto L_0x002f
        L_0x002c:
            r4 = r5
            goto L_0x0016
        L_0x002e:
            r2 = 0
        L_0x002f:
            lxc r3 = r6.c     // Catch:{ RemoteException -> 0x003d }
            if (r7 != 0) goto L_0x0035
            r0 = 0
            goto L_0x0039
        L_0x0035:
            if (r2 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r3.a((boolean) r0)     // Catch:{ RemoteException -> 0x003d }
            return
        L_0x003d:
            r7 = move-exception
            java.lang.String r0 = "CAR.DRIVINGMODE"
            java.lang.String r1 = "Disconnected from DrivingModeManager."
            android.util.Log.e(r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luu.b(boolean):void");
    }

    public final void a(String str, boolean z) {
        try {
            this.c.a(str, z);
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
        }
    }

    public final boolean b() {
        try {
            return this.c.b();
        } catch (RemoteException e2) {
            Log.i("CAR.DRIVINGMODE", "isInDrivingMode RemoteException", e2);
            return false;
        }
    }

    public final void a(lut lut) {
        this.b = lut;
        if (lut != null && j() == 2) {
            t();
        }
    }

    public final boolean b(lxg lxg) {
        try {
            return this.c.b(true, lxg.ordinal());
        } catch (RemoteException e2) {
            Log.i("CAR.DRIVINGMODE", "endDrivingMode RemoteException", e2);
            return false;
        }
    }

    public final void a(lxg lxg) {
        try {
            this.c.a(lxg.ordinal());
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
        }
    }

    public final void a(boolean z) {
        try {
            this.c.c(z);
            r();
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
        }
    }

    public final boolean a(String str) {
        try {
            return this.c.a(str);
        } catch (RemoteException e2) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
            return false;
        }
    }
}
