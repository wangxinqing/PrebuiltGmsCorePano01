package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.R;

/* renamed from: amc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amc implements amn {
    public static amc a;

    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.k.getString(R.string.not_set) : editTextPreference.g;
    }
}
