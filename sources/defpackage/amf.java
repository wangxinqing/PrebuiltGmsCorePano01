package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.R;

/* renamed from: amf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amf implements amn {
    public static amf a;

    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.g())) {
            return listPreference.k.getString(R.string.not_set);
        }
        return listPreference.g();
    }
}
