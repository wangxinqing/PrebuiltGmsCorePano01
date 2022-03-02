package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: luq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class luq {
    public static void a(Context context, boolean z) {
        lww.a();
        luu f = lww.f(context);
        if (f.l()) {
            lww.a();
            boolean b = lww.d(context.getApplicationContext()).b();
            boolean z2 = true;
            if (!f.f() || (!f.g() && !b)) {
                z2 = false;
            }
            if (!lwu.b(context) && !z2) {
                Log.i("CAR.DRIVINGMODE", "Driving Mode ActivityTransition conditions not met. Skip registration.");
            } else {
                Log.i("CAR.DRIVINGMODE", "Driving Mode ActivityTransition client registered.");
                lww.a();
                lww.a(context.getApplicationContext()).a();
            }
            if (z) {
                f.b(lxg.FORCE);
            }
            f.n();
        }
    }
}
