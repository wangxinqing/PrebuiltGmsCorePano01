package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.drivingmode.autolaunch.AutoLaunchServiceImpl;

/* renamed from: lty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lty {
    public final Context a;
    public final lwf b;
    public final lts c;
    public final luu d;
    public boolean e;
    public long f;
    public lxk g;
    private lwk h;
    private jbs i;
    private jbr j;

    public lty(Context context) {
        this.a = context;
        lww.a();
        this.d = lww.f(context);
        lww.a();
        this.b = lww.g(context);
        lww.a();
        this.c = lww.e(context);
    }

    public final void a() {
        this.e = false;
        this.d.n();
        lwk lwk = this.h;
        if (lwk != null) {
            lwk.a();
            this.h = null;
        }
        jbs jbs = this.i;
        if (jbs != null) {
            jbs.a(this.j);
            this.i = null;
        }
        lxk lxk = this.g;
        if (lxk != null) {
            AutoLaunchServiceImpl autoLaunchServiceImpl = lxk.a;
            if (!autoLaunchServiceImpl.a.e) {
                Log.i("CAR.DRIVINGMODE", "Autolaunch service stopping");
                autoLaunchServiceImpl.stopSelf();
            }
        }
    }

    public final void b() {
        if (aycw.a.a().autoDismissNotificationOnVehicleExit()) {
            Log.i("CAR.DRIVINGMODE", "Automatically dismiss launched notification!");
            this.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS);
            this.b.c();
        }
    }

    public final void c() {
        int c2 = this.d.a().c();
        if (((TelephonyManager) this.a.getSystemService("phone")).getCallState() == 0 || c2 == 3) {
            this.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_LAUNCH);
            if (this.d.i() && c2 != 3) {
                this.b.a();
            } else {
                luu luu = this.d;
                lxg o = luu.o();
                iva.a((Object) o);
                luu.c(o);
                this.d.p();
            }
        } else {
            this.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_SKIPPED_IN_CALL);
        }
        a();
    }

    public final void a(lxg lxg) {
        lwk lwk = this.h;
        if (!(lwk == null || lwk.c == null) || this.b.b || this.d.b()) {
            Log.i("CAR.DRIVINGMODE", "Aborting launch, not required");
            this.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_SKIPPED);
            if (this.d.b()) {
                try {
                    this.d.c.b(lxg.ordinal());
                } catch (RemoteException e2) {
                    Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
                }
            } else {
                this.d.a(lxg);
            }
        } else {
            this.d.a(lxg);
            if (this.d.e()) {
                if (this.h == null) {
                    lww.a();
                    this.h = new lwk(this.a);
                }
                lwk lwk2 = this.h;
                lwk2.c = new ltu(this);
                Sensor sensor = lwk2.a;
                if (sensor != null) {
                    lwk2.b.registerListener(lwk2, sensor, 3);
                }
                this.f = SystemClock.elapsedRealtime() + awqy.a.a().b();
                jbs jbs = this.i;
                if (jbs == null) {
                    lww.a();
                    this.i = lww.b(this.a);
                } else {
                    jbs.a(this.j);
                }
                jbr a2 = jbr.a("driving_mode", "PocketTimeout", new ltv(this));
                this.j = a2;
                this.i.a("CAR.DRIVINGMODE", 3, this.f, a2, (String) null);
                return;
            }
            c();
        }
    }
}
