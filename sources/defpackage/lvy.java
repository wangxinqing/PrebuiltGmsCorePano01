package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: lvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvy {
    public final SharedPreferences a;

    public lvy(Context context) {
        this.a = context.getSharedPreferences("driving_mode_frx_prefs", 0);
    }

    public final void a(boolean z) {
        this.a.edit().putBoolean("force_frx_rerun_once", z).apply();
    }

    public final boolean b() {
        return this.a.getBoolean("gearhead_frx_completed", false);
    }

    public final void c() {
        this.a.edit().putBoolean("frx_completed", true).apply();
    }

    public final boolean a() {
        return this.a.getBoolean("frx_completed", false);
    }
}
