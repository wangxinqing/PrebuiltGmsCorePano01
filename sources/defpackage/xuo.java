package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: xuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuo {
    private static xuo b;
    public final SharedPreferences a;

    public xuo(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static synchronized xuo a(Context context) {
        xuo xuo;
        synchronized (xuo.class) {
            if (b == null) {
                b = new xuo(context.getSharedPreferences("gms.people.ui", 0));
            }
            xuo = b;
        }
        return xuo;
    }

    public final String a() {
        return this.a.getString("core_ui_selected_account", "");
    }
}
