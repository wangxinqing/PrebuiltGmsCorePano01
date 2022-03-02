package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: aixh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixh implements ajbg {
    final aiym[] a = new aiym[e];
    public final Context b;
    public final PendingIntent[] c;
    public final aivu d;
    private final aicn f;
    private final AlarmManager g;
    private final long[] h = new long[e];
    private final long[] i = new long[e];

    public aixh(Context context, aivu aivu, aicn aicn) {
        this.b = context;
        this.f = aicn;
        this.d = aivu;
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        this.g = (AlarmManager) context.getSystemService("alarm");
        this.c = new PendingIntent[e];
    }

    public static final Intent a(String str) {
        return new Intent(str);
    }

    private final void d(ajbe ajbe) {
        this.d.a((Runnable) new aixf(this, ajbe));
    }

    public final Executor b() {
        return new aixg(this);
    }

    public final void c(ajbe ajbe) {
        int ordinal = ajbe.ordinal();
        aicn aicn = this.f;
        aicn.a(new aicl(aico.WAKELOCK_RELEASE, aicn.b(), "%2$d", ordinal));
        try {
            this.a[ordinal].a();
        } catch (Exception e) {
        }
    }

    private static boolean a(long j, long j2) {
        return j2 - j <= 5000 && axwx.a.a().allowInstantAlarm();
    }

    public final void b(ajbe ajbe, long j, aizx aizx) {
        int ordinal = ajbe.ordinal();
        aicn aicn = this.f;
        aicn.a(new aicl(aico.WAKELOCK_ACQUIRE, aicn.b(), "%2$d", ordinal));
        aiym aiym = this.a[ordinal];
        if (aizx == null || jni.b(this.b).a("android.permission.UPDATE_DEVICE_STATS") != 0) {
            aizx = null;
        }
        aiym.a(j, aizx);
    }

    public final aizx a() {
        return new ajrc();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.h[i2] = -1;
        this.i[i2] = -1;
    }

    public final void a(ajbe ajbe) {
        int ordinal = ajbe.ordinal();
        a(ordinal);
        aicn aicn = this.f;
        aicn.a(new aicl(aico.ALARM_CANCEL, aicn.b(), "%2$d", ordinal));
        PendingIntent pendingIntent = this.c[ordinal];
        if (pendingIntent != null) {
            this.g.cancel(pendingIntent);
        }
    }

    public final boolean b(ajbe ajbe) {
        return this.a[ajbe.ordinal()].b();
    }

    public final void a(ajbe ajbe, long j) {
        int ordinal = ajbe.ordinal();
        long[] jArr = this.h;
        if (jArr[ordinal] != j) {
            jArr[ordinal] = j;
            aito.a(this.f, ordinal, j, true);
            boolean a2 = a(SystemClock.elapsedRealtime(), j);
            if (!a2) {
                String str = ajbe.v;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                sb.append("Alarm ");
                sb.append(str);
                sb.append(" will ring at ");
                sb.append(j);
                sb.toString();
                aiyk.g.a(this.g, j, this.c[ordinal]);
            }
            this.d.a(ajbe, j, 0);
            if (a2) {
                String str2 = ajbe.v;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
                sb2.append("Alarm ");
                sb2.append(str2);
                sb2.append(" will ring now.");
                sb2.toString();
                d(ajbe);
                return;
            }
            return;
        }
        String str3 = ajbe.v;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 79);
        sb3.append("Redundant alarmSetExactAndAllowWhileIdle of ");
        sb3.append(str3);
        sb3.append(" with deadline ");
        sb3.append(j);
        sb3.toString();
    }

    public final void a(ajbe ajbe, long j, long j2, aizx aizx) {
        ajbe ajbe2 = ajbe;
        long j3 = j;
        long j4 = j2;
        int ordinal = ajbe.ordinal();
        long[] jArr = this.h;
        if (jArr[ordinal] == j3 && this.i[ordinal] == j4) {
            String str = ajbe2.v;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
            sb.append("Redundant alarmWindowReset of ");
            sb.append(str);
            sb.append(" with deadline ");
            sb.append(j3);
            sb.toString();
            return;
        }
        jArr[ordinal] = j3;
        this.i[ordinal] = j4;
        aicn aicn = this.f;
        int i2 = (int) j4;
        aitf aitf = r8;
        aitf aitf2 = new aitf(aico.ALARM_RESET_WINDOW, aicn.b(), ordinal, (int) j3, i2, ordinal, j, j2);
        aicn.a((aicl) aitf);
        boolean a2 = a(SystemClock.elapsedRealtime(), j3);
        if (!a2) {
            aiyk.g.a(this.g, j, j2, this.c[ordinal], aizx);
        }
        this.d.a(ajbe, j, j2);
        if (a2) {
            String str2 = ajbe2.v;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb2.append("Alarm ");
            sb2.append(str2);
            sb2.append(" will ring now.");
            sb2.toString();
            d(ajbe);
        }
    }

    public final void a(ajbe ajbe, long j, aizx aizx) {
        ajbe ajbe2 = ajbe;
        long j2 = j;
        int ordinal = ajbe.ordinal();
        long[] jArr = this.h;
        if (jArr[ordinal] == j2 && this.i[ordinal] == -1) {
            String str = ajbe2.v;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("Redundant alarmReset of ");
            sb.append(str);
            sb.append(" with deadline ");
            sb.append(j);
            sb.toString();
            return;
        }
        jArr[ordinal] = j2;
        this.i[ordinal] = -1;
        aito.a(this.f, ordinal, j, false);
        boolean a2 = a(SystemClock.elapsedRealtime(), j);
        if (!a2) {
            aiyk.g.a(this.g, j, this.c[ordinal], aizx);
        }
        this.d.a(ajbe, j, -1);
        if (a2) {
            String str2 = ajbe2.v;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb2.append("Alarm ");
            sb2.append(str2);
            sb2.append(" will ring now.");
            sb2.toString();
            d(ajbe);
        }
    }

    public final void a(Object obj) {
        aivu aivu = this.d;
        aivu.a((Runnable) new aivf(aivu, obj));
    }

    public final void a(Runnable runnable, long j) {
        aivu aivu = this.d;
        if (aivu.g) {
            return;
        }
        if (j != 0) {
            aivu.h.postDelayed(runnable, j);
        } else {
            aivu.h.post(runnable);
        }
    }

    public final void a(boolean z) {
        for (ajbe ajbe : ajbe.values()) {
            int ordinal = ajbe.ordinal();
            if (!z || (ajbe.w & 1) != 0) {
                if (this.a[ordinal].b()) {
                    String str = ajbe.v;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24);
                    sb.append("Client ");
                    sb.append(str);
                    sb.append(" leaked wakelock.");
                    sb.toString();
                    c(ajbe);
                }
                a(ajbe);
            }
        }
    }

    public final boolean a(Runnable runnable) {
        return this.d.a(runnable);
    }
}
