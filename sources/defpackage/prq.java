package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: prq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prq {
    public final SharedPreferences a;
    public final Context b;

    public prq(Context context, String str) {
        this.b = context;
        this.a = prp.a(context, str);
    }
}
