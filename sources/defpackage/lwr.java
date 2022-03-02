package defpackage;

import android.content.Intent;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.GearPreference;
import com.google.android.gms.drivingmode.ToggleButtonPreference;
import java.util.ArrayList;

/* renamed from: lwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwr extends bso {
    public lum c;
    public lts d;
    public luu e;
    private GearPreference f;
    private ToggleButtonPreference g;
    private Preference h;
    private final lut i = new lwq(this);

    private final void a(lwl lwl) {
        ((lxi) getActivity()).a(lwl);
    }

    public final void d() {
        lww.a();
        this.d = lww.e(getContext());
        lww.a();
        luu f2 = lww.f(getContext());
        this.e = f2;
        f2.k();
        a((int) R.xml.pref_driving_mode);
        PreferenceScreen b = b();
        this.f = (GearPreference) b.c((CharSequence) getString(R.string.car_pref_key_driving_mode_behavior_switch));
        ToggleButtonPreference toggleButtonPreference = (ToggleButtonPreference) b.c((CharSequence) getString(R.string.car_pref_key_driving_mode_switch));
        this.g = toggleButtonPreference;
        toggleButtonPreference.a(false);
        this.h = b.c((CharSequence) getString(R.string.car_pref_key_automatic_rules_preferences));
    }

    public final void e() {
        boolean z;
        boolean z2 = true;
        if (this.e.a().c() == 3 && this.e.b() && iwq.a(getContext()).c() == 1) {
            StringBuilder sb = new StringBuilder(74);
            sb.append("DnD appears to be off. Turning off DrivingMode. currentFilter: 1");
            sb.toString();
            this.e.b(lxg.MANUAL);
        }
        ToggleButtonPreference toggleButtonPreference = this.g;
        if (!awqj.c()) {
            z = true;
        } else if (this.e.a().c() != 0) {
            z = true;
        } else {
            z = false;
        }
        toggleButtonPreference.a(z);
        this.g.c = new lwo(this);
        this.g.h(this.e.b());
        luj a = this.e.a();
        this.f.a(a.c() == 2 ? getString(R.string.car_driving_mode_behavior_android_auto_pref_option_title) : a.c() == 3 ? getString(R.string.car_driving_mode_behavior_dnd_pref_option_title) : a.c() == 4 ? getString(R.string.car_driving_mode_behavior_morris_pref_option_title) : a.c() == 1 ? a.a(getContext()) : getString(R.string.car_driving_mode_behavior_empty_pref_option_title));
        this.f.p = new lwm(this);
        Intent b = a.b();
        if (b == null) {
            this.f.a((lwn) null);
            this.f.h(false);
        } else {
            this.f.a(new lwn(this, b));
            this.f.h(true);
        }
        if (awqj.c()) {
            Preference preference = this.h;
            if (this.e.a().c() == 0) {
                z2 = false;
            }
            preference.a(z2);
        }
        this.h.p = new lwp(this);
        ArrayList a2 = anda.a();
        if (this.e.c()) {
            a2.add(getString(R.string.car_driving_mode_bluetooth_auto_launch_title));
        }
        if (this.e.g()) {
            a2.add(getString(R.string.car_driving_mode_activity_recognition_auto_launch_title));
        }
        if (a2.isEmpty()) {
            a2.add(getString(R.string.common_never));
        }
        this.h.a((CharSequence) amre.a(", ").a((Iterable) a2));
    }

    public final lwy f() {
        return ((lwx) getActivity()).a();
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1) {
            e();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.e.n();
    }

    public final void onPause() {
        super.onPause();
        this.c = null;
        this.e.a((lut) null);
        a((lwl) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeSettingsFragment#onResume");
        this.d.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_SETTINGS);
        this.e.a(this.i);
        f().a((int) R.string.car_connected_devices_car_setting);
        a(new lwl(this));
    }
}
