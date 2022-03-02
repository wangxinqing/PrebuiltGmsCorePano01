package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: lup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lup extends bso {
    public lts c;
    public luu d;
    public ltb e;
    public PreferenceCategory f;
    private final lut g = new luo(this);

    public final void a(boolean z) {
        if (!z) {
            List c2 = this.e.c();
            int size = c2.size();
            int i = 0;
            while (i < size) {
                String a = ltn.a((BluetoothDevice) c2.get(i));
                i++;
                if (this.d.a(a)) {
                    this.d.b(true);
                    return;
                }
            }
            this.d.b(false);
            return;
        }
        this.d.b(true);
    }

    public final void d() {
        Context context = getContext();
        lww.a();
        this.e = lww.c(context);
        lww.a();
        this.c = lww.e(context);
        lww.a();
        luu f2 = lww.f(context);
        this.d = f2;
        f2.k();
        a((int) R.xml.pref_driving_mode_bluetooth_autolaunch);
        PreferenceScreen b = b();
        this.f = (PreferenceCategory) b().c((CharSequence) getString(R.string.car_pref_key_driving_mode_bluetooth_auto_launch_category));
        if (!this.e.a()) {
            Log.w("CAR.DRIVINGMODE", "Bluetooth permission is missing; remove bluetooth preferences.");
            this.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_NO_BLUETOOTH_PERMISSION);
            b.b((Preference) this.f);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.d.n();
    }

    public final void onPause() {
        super.onPause();
        this.d.a((lut) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeBluetoothAutolaunchFragment#onResume");
        ((lwx) getActivity()).a().a((int) R.string.car_driving_mode_automatic_rules_preferences_title);
        this.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS);
        this.d.a(this.g);
    }
}
