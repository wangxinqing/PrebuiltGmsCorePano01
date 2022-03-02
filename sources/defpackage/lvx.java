package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;

/* renamed from: lvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvx extends lvi {
    public luu a;
    public boolean b;

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_INTRO;
    }

    public final void f() {
        this.a.a((lut) new lvv(this));
    }

    public final CharSequence h() {
        int i;
        boolean o = o();
        int i2 = R.string.car_driving_mode_frx_intro_body_generic_trigger;
        if (o) {
            i2 = R.string.car_driving_mode_frx_intro_body_car_dock_trigger;
        } else if (awqd.e() && axxd.c()) {
            i2 = R.string.car_driving_mode_frx_intro_body_audio_enabled_trigger;
        }
        String string = getString(i2);
        if (!o()) {
            i = !this.b ? R.string.car_driving_mode_frx_intro_body_generic_behavior : R.string.car_driving_mode_frx_intro_body_recommend_aa_behavior;
        } else {
            i = R.string.car_driving_mode_frx_intro_body_car_dock_behavior;
        }
        return b(getString(R.string.car_driving_mode_frx_intro_body_generic_template, string, getString(i)));
    }

    public final int i() {
        return R.drawable.car_driving_mode_frx_intro;
    }

    public final CharSequence k() {
        if (this.b) {
            return getString(R.string.common_more_options);
        }
        return null;
    }

    public final void l() {
        m().c(new lvl());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxChooseBehaviorFragment#onCreate");
        lww.a();
        luu f = lww.f(getContext());
        this.a = f;
        f.k();
        boolean z = false;
        if (awqj.d()) {
            Context context = getContext();
            lww.a();
            try {
                if ((context.getPackageManager().getApplicationInfo("com.google.android.projection.gearhead", 128).flags & 129) != 0 && new lta().d(getContext())) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        this.b = z;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.n();
    }

    public final /* bridge */ /* synthetic */ CharSequence c() {
        int i;
        if (!o()) {
            i = R.string.car_driving_mode_frx_intro_header;
        } else {
            i = R.string.car_driving_mode_frx_intro_turn_on_header;
        }
        return getString(i);
    }

    public final /* bridge */ /* synthetic */ CharSequence e() {
        int i;
        if (!o()) {
            i = R.string.car_driving_mode_frx_intro_next_button_text;
        } else {
            i = R.string.common_turn_on;
        }
        return getString(i);
    }

    public final /* bridge */ /* synthetic */ CharSequence j() {
        return getString(R.string.common_cancel);
    }
}
