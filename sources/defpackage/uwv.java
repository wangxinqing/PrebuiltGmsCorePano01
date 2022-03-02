package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: uwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwv {
    private final Context a;

    public uwv(Context context) {
        this.a = context;
    }

    private final SharedPreferences c() {
        return this.a.getSharedPreferences("copresence_gcm_pref", 0);
    }

    public final String a() {
        return c().getString("copresence_uuid_$$UNAUTH$$", (String) null);
    }

    public final String b() {
        return nsi.a(this.a);
    }

    public final void a(String str) {
        c().edit().putString("copresence_uuid_$$UNAUTH$$", str).putBoolean("REGISTERED_$$UNAUTH$$", true).commit();
    }
}
