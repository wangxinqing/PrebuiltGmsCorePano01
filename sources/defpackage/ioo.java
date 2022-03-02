package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ioo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ioo {
    public final SharedPreferences a;

    public ioo(Context context) {
        this.a = context.getSharedPreferences("usagereporting", 0);
    }
}
