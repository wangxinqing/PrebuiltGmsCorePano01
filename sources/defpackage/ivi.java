package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: ivi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ivi implements SharedPreferences {
    private final SharedPreferences a;

    public ivi(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final boolean contains(String str) {
        return this.a.contains(str);
    }

    public final SharedPreferences.Editor edit() {
        return this.a.edit();
    }

    public final Map getAll() {
        return this.a.getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.a.getBoolean(str, z);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SharedPreferences", sb.toString());
            return z;
        }
    }

    public final float getFloat(String str, float f) {
        try {
            return this.a.getFloat(str, f);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SharedPreferences", sb.toString());
            return f;
        }
    }

    public final int getInt(String str, int i) {
        try {
            return this.a.getInt(str, i);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SharedPreferences", sb.toString());
            return i;
        }
    }

    public final long getLong(String str, long j) {
        try {
            return this.a.getLong(str, j);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SharedPreferences", sb.toString());
            return j;
        }
    }

    public final String getString(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SharedPreferences", sb.toString());
            return str2;
        }
    }

    public final Set getStringSet(String str, Set set) {
        try {
            return this.a.getStringSet(str, set);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length());
            sb.append("Returning default for key ");
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            Log.w("SharedPreferences", sb.toString());
            return set;
        }
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
