package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: fgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgy {
    public static final qcc a = qcb.a(fgx.a);
    public final Object b = new Object();
    public final SharedPreferences c;
    private final Context d;

    public fgy(Context context) {
        amrl.a((Object) context);
        this.d = context;
        this.c = context.getSharedPreferences("com.google.android.gms.auth.api.credentials.one_tap_app_cancellations", 0);
    }

    public final long a(String str, int i, TimeUnit timeUnit) {
        long size;
        synchronized (this.b) {
            String a2 = a(str);
            anax c2 = amym.a((Iterable) this.c.getStringSet(a2, new HashSet())).a(fgu.a).a((amrm) new fgv(System.currentTimeMillis(), timeUnit.toMillis((long) i))).a(fgw.a).c();
            this.c.edit().putStringSet(a2, c2).apply();
            size = (long) c2.size();
        }
        return size;
    }

    public final String a(String str) {
        amri a2 = hiq.a(this.d, str);
        if (a2.a()) {
            return (String) a2.b();
        }
        throw new PackageManager.NameNotFoundException("Application package is misconfigured");
    }
}
