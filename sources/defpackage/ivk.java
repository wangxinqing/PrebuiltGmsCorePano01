package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: ivk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivk implements SharedPreferences {
    private final SharedPreferences a;

    public ivk(Context context, String str, boolean z) {
        this(context, str, z, false);
    }

    public final boolean contains(String str) {
        return this.a.contains(str);
    }

    public final SharedPreferences.Editor edit() {
        return ((ivm) this.a).edit();
    }

    public final Map getAll() {
        return this.a.getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return this.a.getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return this.a.getStringSet(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public ivk(Context context, String str, boolean z, boolean z2) {
        synchronized (ivk.class) {
        }
        this.a = new ivm(context, str, z, z2);
    }
}
