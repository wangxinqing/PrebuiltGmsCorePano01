package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: dpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpq {
    private static dpq a;
    private final SharedPreferences b;

    public dpq(Context context) {
        this.b = context.getSharedPreferences("GoogleAnalyticsPlayLogs", 0);
    }

    public static synchronized dpq a(Context context) {
        dpq dpq;
        synchronized (dpq.class) {
            if (a == null) {
                a = new dpq(context.getApplicationContext());
            }
            dpq = a;
        }
        return dpq;
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putInt("hitsReceived", this.b.getInt("hitsReceived", 0) + 1);
        edit.commit();
    }

    public final synchronized void a() {
        SharedPreferences.Editor edit = this.b.edit();
        edit.clear();
        edit.commit();
    }
}
