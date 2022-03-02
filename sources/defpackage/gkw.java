package defpackage;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import com.google.android.gms.auth.setup.notification.PersistentNotificationIntentOperation;

@Deprecated
/* renamed from: gkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkw {
    private final iwq a;
    private final jbs b;

    public gkw(iwq iwq, jbs jbs) {
        iva.a((Object) iwq);
        this.a = iwq;
        iva.a((Object) jbs);
        this.b = jbs;
    }

    public static SharedPreferences a() {
        return ihs.b().getSharedPreferences("PersistentNotificationManager", 0);
    }

    private static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public final void a(String str, int i) {
        this.a.a(str, i);
        a().edit().remove(a(i, str)).commit();
    }

    public final void a(String str, int i, gkx gkx) {
        a().edit().putString(a(i, str), gkx.a()).commit();
        this.a.a(str, i, gkx.a.b());
        ihs b2 = ihs.b();
        this.b.a("PersistentNotificationManager", 1, gkx.b() + gkx.c(), PendingIntent.getService(b2, 0, PersistentNotificationIntentOperation.a(b2, str, i), 134217728), "com.google.android.gms");
    }
}
