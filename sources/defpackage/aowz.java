package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aowz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aowz {
    public final SharedPreferences.Editor a;
    public final String b;

    public aowz(Context context, String str, String str2) {
        this.b = str;
        this.a = context.getApplicationContext().getSharedPreferences(str2, 0).edit();
    }
}
