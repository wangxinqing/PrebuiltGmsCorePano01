package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: nsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsi {
    public static String a(Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 4).getString("regId", (String) null);
    }

    public static void a(Context context, Intent intent) {
        if (intent != null && "1".equals(intent.getStringExtra("wake"))) {
            acrm.b(context, intent);
        }
    }
}
