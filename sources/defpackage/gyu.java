package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

/* renamed from: gyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyu extends gyr {
    private final Object a = new Object();
    private final ivk b;

    public gyu(Context context) {
        this.b = gxv.a(context, "package_rate_limit_backoff_shared_pref_name");
    }

    public final long a(long j, Bundle bundle) {
        long max;
        if (!awrq.a.a().m()) {
            return 0;
        }
        String string = bundle.getString("checkin_source_package", "");
        String valueOf = String.valueOf(string);
        String str = valueOf.length() == 0 ? new String("package_last_checkin_time_") : "package_last_checkin_time_".concat(valueOf);
        synchronized (this.a) {
            if (string.isEmpty() || !this.b.contains(str)) {
                return 0;
            }
            synchronized (this.a) {
                max = Math.max((this.b.getLong(str, 0) + awrq.a.a().x()) - j, 0);
            }
            return max;
        }
    }

    public final String a() {
        return "PackageRateLimitBackoffDelayComputer";
    }

    public final void b() {
        synchronized (this.a) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.clear();
            edit.commit();
        }
    }

    public final void a(long j, gvx gvx) {
        gzr gzr = gvx.d;
        String str = null;
        if (gzr != null) {
            had had = gzr.l;
            if (had == null) {
                had = had.o;
            }
            if ((had.a & 2048) != 0) {
                had had2 = gzr.l;
                if (had2 == null) {
                    had2 = had.o;
                }
                hag hag = had2.l;
                if (hag == null) {
                    hag = hag.g;
                }
                str = hag.d;
            }
        }
        String b2 = amrk.b(str);
        if (!b2.isEmpty()) {
            synchronized (this.a) {
                SharedPreferences.Editor edit = this.b.edit();
                edit.putLong(b2.length() == 0 ? new String("package_last_checkin_time_") : "package_last_checkin_time_".concat(b2), j);
                edit.commit();
            }
        }
    }
}
