package defpackage;

import android.content.Context;

/* renamed from: zvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvf {
    private static agqu a;

    public static synchronized agqu a(Context context) {
        agqu agqu;
        synchronized (zvf.class) {
            if (a == null) {
                Context applicationContext = context.getApplicationContext();
                agqw agqw = new agqw();
                agqw.a(applicationContext);
                agqw.a("gmscoreinmemoryfacscache_contact_uploads");
                agqw.a.c = new aekp();
                a = agqw.a();
            }
            agqu = a;
        }
        return agqu;
    }
}
