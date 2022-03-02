package defpackage;

import androidx.preference.Preference;

/* renamed from: lud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lud implements amk {
    private final lui a;

    public lud(lui lui) {
        this.a = lui;
    }

    public final boolean a(Preference preference, Object obj) {
        lui lui = this.a;
        lui.c.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION);
        lui.d.a(((Boolean) obj).booleanValue());
        return true;
    }
}
