package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbs {
    public static final long a = a("WINDOW_EXACT");
    static final long b = a("WINDOW_HEURISTIC");
    static final int c = b("FLAG_STANDALONE");
    static final int d = b("FLAG_WAKE_FROM_IDLE");
    public final AlarmManager e;
    public final Context f;
    final AtomicInteger g = new AtomicInteger(0);
    private final boolean h;
    private final boolean i;
    private final Random j = new Random();

    public jbs(Context context) {
        Context applicationContext = context.getApplicationContext();
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = context.getApplicationInfo().targetSdkVersion;
        boolean z = false;
        iva.a((Object) applicationContext);
        this.f = applicationContext;
        iva.a((Object) alarmManager);
        this.e = alarmManager;
        this.h = i2 < 19 ? true : z;
        if (jbv.a == null) {
            jbv.a = new jbv();
        }
        this.i = jlr.a(this.f);
    }

    private static long a(String str) {
        try {
            return ((Long) AlarmManager.class.getDeclaredField(str).get((Object) null)).longValue();
        } catch (Exception e2) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            return ((Integer) AlarmManager.class.getDeclaredField(str).get((Object) null)).intValue();
        } catch (Exception e2) {
            return -1;
        }
    }

    public final long a() {
        return !this.h ? b : a;
    }

    public final boolean a(long j2) {
        return j2 > 0;
    }

    private final void a(IllegalStateException illegalStateException) {
        Log.e("AlarmManager", "Too many alarms, choosing not to crash here.", illegalStateException);
        if (this.j.nextInt(this.g.incrementAndGet()) == 0) {
            jis.a(this.f, illegalStateException, 134217728);
        }
    }

    public final void b(String str, int i2, long j2, PendingIntent pendingIntent) {
        long j3 = j2;
        if (a(j3)) {
            try {
                this.e.setExactAndAllowWhileIdle(i2, j3, pendingIntent);
                jbv.a(this.f, i2, str, j2, a, 0, (List) null, d | c);
                amlv.b("AlarmManager");
            } catch (SecurityException e2) {
                Log.e("AlarmManager", "Failed to set alarm", e2);
            } catch (IllegalStateException e3) {
                a(e3);
            }
        }
    }

    public final void a(PendingIntent pendingIntent) {
        this.e.cancel(pendingIntent);
    }

    public final void a(String str, int i2, long j2, long j3, long j4, PendingIntent pendingIntent, WorkSource workSource) {
        if (a(j2)) {
            WorkSource workSource2 = !this.i ? null : workSource;
            try {
                this.e.set(i2, j2, j3, j4, pendingIntent, workSource2);
                a(str, i2, j2, j3, j4, workSource2);
            } catch (SecurityException e2) {
                Log.e("AlarmManager", "Failed to set alarm", e2);
            } catch (IllegalStateException e3) {
                a(e3);
            }
        }
    }

    public final void b(String str, int i2, long j2, PendingIntent pendingIntent, WorkSource workSource) {
        a(str, i2, j2, a, 0, pendingIntent, workSource);
    }

    public final void b(String str, int i2, long j2, PendingIntent pendingIntent, String str2) {
        b(str, i2, j2, pendingIntent, jlr.a(this.f, str2));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, long j2, long j3, long j4, WorkSource workSource) {
        long j5;
        int i3 = i2;
        if (i3 == 2 || i3 == 0) {
            int i4 = j3 == a ? c : 0;
            if (i3 == 2) {
                j5 = j2 - SystemClock.elapsedRealtime();
            } else {
                j5 = j2 - System.currentTimeMillis();
            }
            jbv.a(this.f, i2, str, j5, j3, j4, jlr.b(workSource), i4);
            amlv.b("AlarmManager");
        }
    }

    public final void a(String str, int i2, long j2, long j3, PendingIntent pendingIntent, String str2) {
        WorkSource a2 = jlr.a(this.f, str2);
        if (a(j2)) {
            int i3 = Build.VERSION.SDK_INT;
            a(str, i2, j2, b, j3, pendingIntent, a2);
        }
    }

    public final void a(String str, int i2, long j2, long j3, jbr jbr, Handler handler, WorkSource workSource) {
        WorkSource workSource2;
        if (a(j2)) {
            if (this.i) {
                workSource2 = workSource;
            } else {
                workSource2 = null;
            }
            try {
                this.e.set(i2, j2, j3, 0, jbr, handler, workSource2);
                a(str, i2, j2, j3, 0, workSource2);
            } catch (SecurityException e2) {
                Log.e("AlarmManager", "Failed to set alarm", e2);
            } catch (IllegalStateException e3) {
                a(e3);
            }
        }
    }

    public final void a(String str, int i2, long j2, PendingIntent pendingIntent) {
        long j3 = j2;
        if (a(j3)) {
            try {
                this.e.setAndAllowWhileIdle(i2, j3, pendingIntent);
                jbv.a(this.f, i2, str, j2, a, 0, (List) null, d);
                amlv.b("AlarmManager");
            } catch (SecurityException e2) {
                Log.e("AlarmManager", "Failed to set alarm", e2);
            } catch (IllegalStateException e3) {
                a(e3);
            }
        }
    }

    public final void a(String str, int i2, long j2, PendingIntent pendingIntent, WorkSource workSource) {
        if (a(j2)) {
            int i3 = Build.VERSION.SDK_INT;
            a(str, i2, j2, a(), 0, pendingIntent, workSource);
        }
    }

    public final void a(String str, int i2, long j2, PendingIntent pendingIntent, String str2) {
        a(str, i2, j2, pendingIntent, jlr.a(this.f, str2));
    }

    public final void a(String str, int i2, long j2, jbr jbr, String str2) {
        String str3 = str;
        int i3 = i2;
        long j3 = j2;
        a(str3, i3, j3, a(), jbr, (Handler) null, jlr.a(this.f, str2));
    }

    public final void a(jbr jbr) {
        this.e.cancel(jbr);
    }
}
