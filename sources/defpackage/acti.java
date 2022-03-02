package defpackage;

import android.os.Build;

/* renamed from: acti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acti extends actp {
    public acti() {
        super("Diskstats", "diskstats", "DISK_STATS", false);
    }

    public final String[] a(long j, long j2) {
        return acrl.g;
    }

    public final long c() {
        return aznn.a.a().a();
    }

    public final boolean b() {
        int i = Build.VERSION.SDK_INT;
        return azms.a.a().b();
    }
}
