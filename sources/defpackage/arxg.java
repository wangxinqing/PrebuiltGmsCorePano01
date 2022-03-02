package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: arxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxg {
    private final Context a;

    public arxg(Context context) {
        this.a = context;
    }

    public final int a(String str) {
        if (c().contains(str)) {
            return c().getBoolean(str, true) ? 3 : 4;
        }
        return 2;
    }

    public final void b(boolean z) {
        c().edit().putBoolean("has_pending_app_install", z).commit();
    }

    public final SharedPreferences c() {
        return this.a.getSharedPreferences("discovery_shared_pref", 4);
    }

    public final boolean e() {
        return c().getBoolean("notification_settings_devcie", aymq.a.a().o());
    }

    public final void f() {
        int i = c().getInt("education_flow_counter", 0) + 1;
        if (((long) i) > aymq.a.a().ae()) {
            c().edit().putBoolean("education_flow_completed", true).commit();
        }
        c().edit().putInt("education_flow_counter", i).commit();
    }

    public final boolean g() {
        return c().getBoolean("education_flow_completed", false);
    }

    public final boolean b() {
        return c().getBoolean("key_auto_test_running", false);
    }

    public final boolean d() {
        return c().getBoolean("notification_settings_beacon", aymq.a.a().m()) || e();
    }

    public final void a(int i) {
        c().edit().putInt("KEY_NOTIFICATION_CONSECUTIVE_DISMISS", i).commit();
    }

    public final void a(long j) {
        c().edit().putLong("KEY_NOTIFICATION_ALLOWED_AT_TIMESTAMP_SECONDS", j).commit();
    }

    public final void a(boolean z) {
        c().edit().putBoolean("key_auto_test_running", z).commit();
    }

    public final boolean a() {
        return c().getBoolean("nearby_debug_mode", aymq.c());
    }
}
