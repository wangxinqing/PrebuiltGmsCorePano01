package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* renamed from: ltp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltp {
    private final Context a;

    public ltp(Context context) {
        this.a = context;
    }

    public final void a(boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(this.a, "com.google.android.location.settings.CarDndNotifierIntentOperation", "com.google.android.location.internal.CAR_DND_ACTION");
        if (startIntent != null) {
            startIntent.putExtra("car_dnd_key", z);
            StringBuilder sb = new StringBuilder(28);
            sb.append("Sending DnD broadcast: ");
            sb.append(z);
            Log.i("CAR.DRIVINGMODE", sb.toString());
            this.a.startService(startIntent);
        }
    }

    public final boolean b() {
        if (jkr.c() && a()) {
            lww.a();
            iwq a2 = iwq.a(this.a);
            if (a2 != null) {
                ComponentName componentName = new ComponentName(this.a.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
                try {
                    for (AutomaticZenRule automaticZenRule : a2.d().values()) {
                        if (componentName.equals(automaticZenRule.getOwner()) && automaticZenRule.isEnabled()) {
                            return true;
                        }
                    }
                } catch (SecurityException e) {
                    Log.w("CAR.DRIVINGMODE", "Getting zen rules failed", e);
                }
            }
        }
        return false;
    }

    public final boolean a() {
        if (jkr.c()) {
            lww.a();
            iwq a2 = iwq.a(this.a);
            if (a2 == null || !a2.e()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
