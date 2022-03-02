package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.preference.Preference;

/* renamed from: lug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lug implements amk {
    private final lui a;

    public lug(lui lui) {
        this.a = lui;
    }

    public final boolean a(Preference preference, Object obj) {
        lui lui = this.a;
        lui.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING);
        luu luu = lui.d;
        try {
            luu.c.e(((Boolean) obj).booleanValue());
            return true;
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return true;
        }
    }
}
