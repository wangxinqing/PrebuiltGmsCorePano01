package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: npe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npe {
    public final SharedPreferences a;
    public final Context b;

    public npe(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("spptach", 0);
    }
}
