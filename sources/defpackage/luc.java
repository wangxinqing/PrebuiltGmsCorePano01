package defpackage;

import androidx.preference.Preference;
import com.google.android.gms.R;

/* renamed from: luc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class luc implements aml {
    private final lui a;

    public luc(lui lui) {
        this.a = lui;
    }

    public final boolean a(Preference preference) {
        lui lui = this.a;
        lui.b().b(preference);
        if (lui.d.h()) {
            lui.e = lui.a(R.string.car_pref_key_prompt_before_launch_preferences, R.string.car_driving_mode_prompt_before_launch_title);
            lui.b().a((Preference) lui.e);
        }
        lui.g = lui.a(R.string.car_pref_key_turn_on_bluetooth_preferences, R.string.car_driving_mode_turn_on_bluetooth_title);
        lui.b().a((Preference) lui.g);
        if (lui.d.d()) {
            lui.f = lui.a(R.string.car_pref_key_pocket_detection_preferences, R.string.car_driving_mode_pocket_detection_title);
            lui.f.c((int) R.string.car_driving_mode_pocket_detection_summary);
            lui.b().a((Preference) lui.f);
        }
        lui.e();
        return true;
    }
}
