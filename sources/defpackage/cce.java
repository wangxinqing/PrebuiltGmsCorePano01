package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: cce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cce extends cbe {
    public final SharedPreferences a;

    public cce(Context context) {
        this.a = context.getSharedPreferences("CONTEXT_MANAGER", 0);
    }

    public final void a(int i, long j) {
        this.a.edit().putLong(cjv.a(i), j).apply();
    }
}
