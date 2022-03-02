package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.RemoteException;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.MasterSwitchPreference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lui extends bso {
    public lts c;
    public luu d;
    public SwitchPreference e;
    public SwitchPreference f;
    public SwitchPreference g;
    public SwitchPreference h;
    private ltb i;
    private Preference j;
    private SwitchPreference k;
    private MasterSwitchPreference l;
    private final lut m = new luh(this);

    public final SwitchPreference a(int i2, int i3) {
        SwitchPreference switchPreference = new SwitchPreference(this.a.a);
        switchPreference.t = getString(i2);
        if (switchPreference.x && !switchPreference.i()) {
            if (!TextUtils.isEmpty(switchPreference.t)) {
                switchPreference.x = true;
            } else {
                throw new IllegalStateException("Preference does not have a key assigned.");
            }
        }
        switchPreference.b(i3);
        switchPreference.q();
        return switchPreference;
    }

    public final void d() {
        Context context = getContext();
        lww.a();
        this.i = lww.c(context);
        lww.a();
        this.c = lww.e(context);
        lww.a();
        luu f2 = lww.f(context);
        this.d = f2;
        f2.k();
        a((int) R.xml.pref_driving_mode_automatic_rules);
        PreferenceScreen b = b();
        SwitchPreference switchPreference = (SwitchPreference) b.c((CharSequence) getString(R.string.car_pref_key_activity_recognition_auto_launch_preferences));
        this.k = switchPreference;
        b.b((Preference) switchPreference);
        if (awqd.e() && axxd.c()) {
            this.k.c((int) R.string.car_driving_mode_audio_activity_recognition_auto_launch_summary);
        }
        MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) b().c((CharSequence) getString(R.string.car_pref_key_settings_autolaunch_preference));
        this.l = masterSwitchPreference;
        masterSwitchPreference.p = new ltz(this);
        MasterSwitchPreference masterSwitchPreference2 = this.l;
        masterSwitchPreference2.c = new lua(this);
        SwitchCompat switchCompat = masterSwitchPreference2.a;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(masterSwitchPreference2.c);
        }
        this.l.b(false);
        SwitchPreference switchPreference2 = (SwitchPreference) b.c((CharSequence) getString(R.string.car_pref_key_settings_add_device_preference));
        this.h = switchPreference2;
        switchPreference2.p = new lub(this);
        this.h.b(false);
        Preference c2 = b().c((CharSequence) getString(R.string.car_pref_key_advanced_preferences));
        this.j = c2;
        c2.p = new luc(this);
        if (!this.i.b()) {
            Log.w("CAR.DRIVINGMODE", "Bluetooth not avaiable; remove bluetooth preferences.");
            this.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_NO_BLUETOOTH_PERMISSION);
            b.b((Preference) this.l);
            b.b((Preference) this.h);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        if (this.d.h()) {
            arrayList.add(getActivity().getString(R.string.car_driving_mode_prompt_before_launch_title));
        }
        arrayList.add(getActivity().getString(R.string.car_driving_mode_turn_on_bluetooth_title));
        if (this.d.d()) {
            arrayList.add(getActivity().getString(R.string.car_driving_mode_pocket_detection_title));
        }
        this.j.a((CharSequence) amre.a(", ").a((Iterable) arrayList));
        SwitchPreference switchPreference = this.e;
        if (switchPreference != null) {
            switchPreference.a(true);
            this.e.o = new lue(this);
            this.e.h(this.d.i());
        }
        SwitchPreference switchPreference2 = this.f;
        if (switchPreference2 != null) {
            switchPreference2.a(true);
            this.f.o = new luf(this);
            this.f.h(this.d.e());
        }
        if (this.d.f()) {
            b().a((Preference) this.k);
            this.k.a(true);
            this.k.o = new lud(this);
            this.k.h(this.d.g());
        }
        if (this.i.b()) {
            ArrayList a = anda.a();
            List c2 = this.i.c();
            int size = c2.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) c2.get(i2);
                if (this.d.a(ltn.a(bluetoothDevice))) {
                    a.add(this.i.a(bluetoothDevice));
                }
            }
            if (a.isEmpty()) {
                this.l.b(false);
                this.h.b(true);
                this.h.h(false);
            } else {
                this.h.b(false);
                this.l.b(true);
                this.l.h(this.d.c());
                this.l.a((CharSequence) amre.a(", ").a((Iterable) a));
            }
            SwitchPreference switchPreference3 = this.g;
            if (switchPreference3 != null) {
                switchPreference3.a(true);
                this.g.o = new lug(this);
                SwitchPreference switchPreference4 = this.g;
                try {
                    z = this.d.c.h();
                } catch (RemoteException e2) {
                    Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e2);
                }
                switchPreference4.h(z);
            }
        }
    }

    public final lwy f() {
        return ((lwx) getActivity()).a();
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
        Log.i("CAR.DRIVINGMODE", "DrivingModeAutomaticRulesFragment#onResume");
        super.onResume();
        f().a((int) R.string.car_driving_mode_automatic_rules_fragment_title);
        this.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_AUTOMATIC_RULES_SETTINGS);
        this.d.a(this.m);
    }
}
