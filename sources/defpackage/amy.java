package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: amy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amy {
    public final Context a;
    public boolean b;
    public PreferenceScreen c;
    public amx d;
    public amv e;
    public amw f;
    private long g = 0;
    private SharedPreferences h;
    private SharedPreferences.Editor i;
    private final String j;

    public amy(Context context) {
        this.a = context;
        this.j = context.getPackageName() + "_preferences";
        this.h = null;
    }

    public final long a() {
        long j2;
        synchronized (this) {
            j2 = this.g;
            this.g = 1 + j2;
        }
        return j2;
    }

    public final SharedPreferences b() {
        if (this.h == null) {
            this.h = this.a.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }

    public final SharedPreferences.Editor c() {
        if (!this.b) {
            return b().edit();
        }
        if (this.i == null) {
            this.i = b().edit();
        }
        return this.i;
    }

    public final Preference a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.c;
        if (preferenceScreen != null) {
            return preferenceScreen.c(charSequence);
        }
        return null;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.b = z;
    }
}
