package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ekt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekt {
    public static final fzh a = new eks();
    private final ekq b;
    private final SharedPreferences c;

    public ekt(Context context) {
        ekq ekq = (ekq) ekq.b.b();
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth.work.account.whitelist.prefs", 0);
        iva.a((Object) ekq);
        this.b = ekq;
        iva.a((Object) sharedPreferences);
        this.c = sharedPreferences;
    }

    public final boolean a() {
        return this.c.edit().clear().commit();
    }

    public final boolean a(String str) {
        iva.a(str, (Object) "Package name must not be empty");
        if ("com.google.android.gms".equals(str) || "com.android.vending".equals(str)) {
            return true;
        }
        String string = this.c.getString(str, (String) null);
        if (string != null) {
            return string.equalsIgnoreCase(this.b.a(str).b);
        }
        return false;
    }

    public final boolean a(String str, String str2) {
        SharedPreferences.Editor edit = this.c.edit();
        if (str2 == null) {
            edit.remove(str);
        } else {
            edit.putString(str, str2);
        }
        return edit.commit();
    }
}
