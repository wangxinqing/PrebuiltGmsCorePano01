package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: crj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class crj {
    public static Context a;
    private final String b;

    public crj() {
    }

    public static void a(SharedPreferences.Editor editor) {
        int i = Build.VERSION.SDK_INT;
        editor.apply();
    }

    @Deprecated
    public crj(String str) {
        this.b = str;
    }

    public final SharedPreferences a() {
        return a.getSharedPreferences(this.b, 4);
    }

    public final cri a(String str, Boolean bool) {
        return new crg(this, str, bool);
    }

    public final cri a(String str, Integer num) {
        return new crh(this, str, num);
    }

    public final cri a(String str, String str2) {
        return new crf(this, str, str2);
    }
}
