package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: abee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abee {
    public static final abee a = new abee();

    private abee() {
    }

    public static final void a(Context context, String str) {
        SharedPreferences.Editor edit = jgu.a(context).edit();
        String valueOf = String.valueOf(str);
        edit.putBoolean(valueOf.length() == 0 ? new String("x-client-auth:") : "x-client-auth:".concat(valueOf), true);
        edit.apply();
    }
}
