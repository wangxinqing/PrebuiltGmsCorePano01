package defpackage;

import android.content.SharedPreferences;
import android.view.View;

/* renamed from: adtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtr implements View.OnClickListener {
    public void onClick(View view) {
        adtm a = adtm.a();
        synchronized (a.a) {
            SharedPreferences b = a.b();
            irk.a((Object) b, (Object) "Unexpected null from getPrefs.");
            SharedPreferences.Editor edit = b.edit();
            edit.clear();
            edit.apply();
        }
    }
}
