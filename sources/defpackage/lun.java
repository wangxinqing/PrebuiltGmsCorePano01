package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreference;

/* renamed from: lun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lun implements aml {
    private final lup a;
    private final String b;
    private final SwitchPreference c;

    public lun(lup lup, String str, SwitchPreference switchPreference) {
        this.a = lup;
        this.b = str;
        this.c = switchPreference;
    }

    public final boolean a(Preference preference) {
        lup lup = this.a;
        String str = this.b;
        SwitchPreference switchPreference = this.c;
        lup.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE);
        lup.d.a(str, switchPreference.a);
        lup.a(switchPreference.a);
        return true;
    }
}
