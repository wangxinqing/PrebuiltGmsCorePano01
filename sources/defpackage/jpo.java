package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: jpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jpo {
    public final SharedPreferences a;

    public jpo(Context context) {
        this.a = context.getSharedPreferences("contactinteractions_gms_prefs", 0);
    }
}
