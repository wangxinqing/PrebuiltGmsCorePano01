package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ptc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptc {
    private final Context a;

    public ptc(Context context) {
        this.a = context;
    }

    public final SharedPreferences a() {
        return this.a.getSharedPreferences("ActionsUploadSharedPrefs", 0);
    }
}
