package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: ltw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltw extends lut {
    final /* synthetic */ String a;
    final /* synthetic */ lty b;

    public ltw(lty lty, String str) {
        this.b = lty;
        this.a = str;
    }

    public final void a() {
        anxt anxt;
        lty lty = this.b;
        String str = this.a;
        if ("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(str) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(str)) {
            Log.i("CAR.DRIVINGMODE", "Driving Mode started by launch notification accept/timeout.");
            lty.c.a(anxx.DRIVING_MODE, "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(str) ? anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT : anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT);
            lty.a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            luu luu = lty.d;
            lxg o = luu.o();
            iva.a((Object) o);
            luu.c(o);
            lty.d.p();
            lty.a();
        } else if ("com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(str)) {
            Log.i("CAR.DRIVINGMODE", "Cancelled Driving Mode launch from notification.");
            lty.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL);
            lty.d.p();
            lty.b.c();
            lty.a();
        } else if (!lty.d.g()) {
            lty.a();
        } else if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(str)) {
            try {
                if (lty.d.c.l()) {
                    Log.i("CAR.DRIVINGMODE", "Auto-launch activity transition is suppressed");
                    anxt = anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_SUPPRESSED;
                    lty.a();
                    lty.c.a(anxu.DRIVING_MODE, anxt);
                }
            } catch (RemoteException e) {
                Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            }
            Log.i("CAR.DRIVINGMODE", "Auto-launch started by activity transition.");
            anxt = anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_LAUNCH;
            lty.a(lxg.ACTIVITY_RECOGNITION);
            lty.c.a(anxu.DRIVING_MODE, anxt);
        } else if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(str)) {
            Log.i("CAR.DRIVINGMODE", "Ending driving mode by activity transition.");
            lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_TERMINATE);
            if (!lty.d.b(lxg.ACTIVITY_RECOGNITION)) {
                lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECT_IGNORED);
            }
            lty.b();
            lty.a();
        }
    }
}
