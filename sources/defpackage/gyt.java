package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: gyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyt extends gyr {
    private static final iwd a = gzk.a("NetworkBackoffDelayComputer");
    private final Object b = new Object();
    private final ivk c;
    private final Context d;

    public gyt(Context context) {
        this.c = gxv.a(context, "network_backoff_shared_pref_name");
        this.d = context;
    }

    public final long a(long j, Bundle bundle) {
        long j2;
        long j3;
        long j4;
        if (gyr.a(bundle)) {
            a.b("Ignore network delay for forced checkin.", new Object[0]);
            return 0;
        }
        synchronized (this.b) {
            j2 = this.c.getLong("backoff_stage", 0);
            j3 = this.c.getLong("last_checkin_start_time", 0);
        }
        if (j2 != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            double z = (double) awrq.a.a().z();
            double pow = Math.pow((double) awrq.a.a().y(), (double) (j2 - 1));
            Double.isNaN(z);
            j4 = timeUnit.toMillis((long) Math.min(z * pow, (double) awrq.a.a().B()));
        } else {
            j4 = 0;
        }
        if (!gwk.c(this.d)) {
            a.b("Enforcing smaller max delay for initial checkin.", new Object[0]);
            j4 = Math.min(awrq.a.a().A(), j4);
        }
        return Math.max(0, (j3 + j4) - j);
    }

    public final String a() {
        return "NetworkBackoffDelayComputer";
    }

    public final void b() {
        synchronized (this.b) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.clear();
            edit.commit();
        }
    }

    public final void a(long j, gvx gvx) {
        if (gvx.e != 3) {
            synchronized (this.b) {
                long j2 = 0;
                long j3 = this.c.getLong("backoff_stage", 0);
                int i = gvx.e;
                if (i != 2) {
                    if (i != 1) {
                        if (i != 0) {
                            j2 = j3;
                        }
                        SharedPreferences.Editor edit = this.c.edit();
                        edit.putLong("backoff_stage", j2);
                        edit.putLong("last_checkin_start_time", j);
                        edit.commit();
                    }
                }
                j2 = 1 + j3;
                SharedPreferences.Editor edit2 = this.c.edit();
                edit2.putLong("backoff_stage", j2);
                edit2.putLong("last_checkin_start_time", j);
                edit2.commit();
            }
        }
    }
}
