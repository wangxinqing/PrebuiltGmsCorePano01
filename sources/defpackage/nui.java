package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;

/* renamed from: nui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nui {
    final jbs a;
    public final acrz b;
    public long c;
    private final Intent d;
    private final PendingIntent e;
    private long f;

    public nui(Context context, String str, String str2) {
        this.a = new jbs(context);
        acrz acrz = new acrz(context, str, (String) null);
        this.b = acrz;
        acrz.a(false);
        Intent intent = new Intent(str2);
        this.d = intent;
        this.e = PendingIntent.getBroadcast(context, 0, intent, 0);
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.f;
        }
        return j;
    }

    public final void b() {
        synchronized (this) {
            if (this.d != null) {
                d();
                this.e.cancel();
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this) {
            z = this.f != 0;
        }
        return z;
    }

    public final void d() {
        synchronized (this) {
            if (this.f != 0) {
                this.a.a(this.e);
                this.f = 0;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("alarm(");
        if (this.d == null) {
            sb.append("STOPPED");
        } else {
            sb.append(DateUtils.formatElapsedTime((this.f - SystemClock.elapsedRealtime()) / 1000));
            sb.append(" initial: ");
            sb.append(this.c / 1000);
            sb.append("s");
        }
        if (this.b.e()) {
            sb.append(" WAKE_LOCK");
        }
        sb.append(")");
        return sb.toString();
    }

    public final void a(long j) {
        synchronized (this) {
            if (this.f != 0) {
                try {
                    d();
                } catch (SecurityException e2) {
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 94);
                    sb.append("Failed to cancel previous alarms due to SecurityException. ");
                    sb.append(message);
                    sb.append(". Previous alarms will stay active.");
                    Log.e("GCM", sb.toString());
                }
            }
            this.c = j;
            long elapsedRealtime = SystemClock.elapsedRealtime() + j;
            this.f = elapsedRealtime;
            nqw.a(this.a, "Gcm-Alarm", elapsedRealtime, this.e);
        }
    }
}
