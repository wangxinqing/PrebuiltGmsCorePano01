package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: thb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class thb {
    public boolean a;
    private final Context b;
    private final iwr c;
    private final amth d;
    private iwq e;
    private final Handler f = new qvr(Looper.getMainLooper());

    private thb(Context context) {
        amtm a2 = amtm.a();
        a2.a(100);
        a2.b(300, TimeUnit.MILLISECONDS);
        this.d = a2.d();
        this.b = context;
        this.c = iwr.a(context);
    }

    public static thb a(Context context) {
        return new thb(context);
    }

    private final boolean b(tha tha) {
        if (this.a) {
            return a(tha);
        }
        return false;
    }

    private final void a(tha tha, Runnable runnable) {
        long j;
        Long l = (Long) this.d.b(tha);
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        this.f.postDelayed(runnable, Math.max(0, 300 - j));
    }

    private final boolean a(tha tha) {
        return this.d.b(tha) != null;
    }

    private final boolean a(tha tha, Notification notification) {
        if (this.a && a(tha)) {
            int i = Build.VERSION.SDK_INT;
            if (!notification.extras.containsKey("android.progress") || !notification.extras.containsKey("android.progressMax") || !notification.extras.containsKey("android.progressIndeterminate") || notification.extras.getInt("android.progressMax") == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final NotificationChannel a(String str) {
        return a().a(str);
    }

    public final iwq a() {
        if (this.e == null) {
            this.e = iwq.a(this.b);
        }
        iwq iwq = this.e;
        if (iwq != null) {
            return iwq;
        }
        throw new IllegalStateException("No notification manager");
    }

    public final void a(int i) {
        iwr iwr = this.c;
        iwr.a.a((String) null, i);
        if (!iwq.f()) {
            iwr.b.b();
        }
        this.d.c(new tha(i));
    }

    public final void a(int i, Notification notification) {
        tha tha = new tha(i);
        if (a(tha, notification)) {
            return;
        }
        if (b(tha)) {
            a(tha, (Runnable) new tgy(this, i, notification));
            return;
        }
        this.d.a(tha, Long.valueOf(SystemClock.elapsedRealtime()));
        iwr iwr = this.c;
        if (!iwq.f()) {
            iwr.a((String) null, i, notification);
        } else {
            iwr.a.a((String) null, i, notification);
        }
    }

    public final void a(NotificationChannel notificationChannel) {
        a().a(notificationChannel);
    }

    public final void a(NotificationChannelGroup notificationChannelGroup) {
        a().a(notificationChannelGroup);
    }

    public final void a(String str, int i) {
        this.c.a(str, i);
        this.d.c(new tha(str, i));
    }

    public final void a(String str, int i, Notification notification) {
        tha tha = new tha(str, i);
        if (a(tha, notification)) {
            return;
        }
        if (b(tha)) {
            a(tha, (Runnable) new tgz(this, str, i, notification));
            return;
        }
        this.d.a(tha, Long.valueOf(SystemClock.elapsedRealtime()));
        this.c.a(str, i, notification);
    }
}
