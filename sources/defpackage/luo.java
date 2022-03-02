package defpackage;

import android.bluetooth.BluetoothDevice;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreference;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: luo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class luo extends lut {
    final /* synthetic */ lup a;

    public luo(lup lup) {
        this.a = lup;
    }

    public final void a() {
        lup lup = this.a;
        if (lup.e.a()) {
            PreferenceCategory preferenceCategory = lup.f;
            synchronized (preferenceCategory) {
                List list = preferenceCategory.b;
                for (int size = list.size() - 1; size >= 0; size--) {
                    preferenceCategory.c((Preference) list.get(0));
                }
            }
            preferenceCategory.l();
            List c = lup.e.c();
            if (c.isEmpty()) {
                PreferenceCategory preferenceCategory2 = lup.f;
                Preference preference = new Preference(lup.getActivity());
                preference.b((int) R.string.car_driving_mode_bluetooth_auto_launch_no_device_title);
                preference.a(false);
                preference.y = false;
                preference.q();
                preferenceCategory2.a(preference);
            } else {
                int size2 = c.size();
                for (int i = 0; i < size2; i++) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) c.get(i);
                    PreferenceCategory preferenceCategory3 = lup.f;
                    String a2 = ltn.a(bluetoothDevice);
                    SwitchPreference switchPreference = new SwitchPreference(lup.getContext());
                    switchPreference.h(lup.d.a(a2));
                    switchPreference.b((CharSequence) lup.e.a(bluetoothDevice));
                    switchPreference.a(kf.a(lup.getContext(), (int) R.drawable.quantum_ic_bluetooth_grey600_24));
                    switchPreference.y = true;
                    switchPreference.p = new lun(lup, a2, switchPreference);
                    preferenceCategory3.a((Preference) switchPreference);
                }
            }
        }
        this.a.a(false);
    }
}
