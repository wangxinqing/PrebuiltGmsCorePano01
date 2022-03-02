package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: rpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpm implements rpf {
    private static adsa e;
    private final Context a;
    private final anuv b;
    private final rpk c;
    private final PackageManager d;

    public rpm(Context context, anuv anuv, rpk rpk) {
        this.a = context;
        this.b = anuv;
        this.c = rpk;
        this.d = context.getPackageManager();
    }

    public final adsa a() {
        if (e == null) {
            e = new rph();
        }
        return e;
    }

    public final boolean b() {
        return true;
    }

    public final String a(audx audx) {
        return ((ansg) audx).d;
    }

    public final rpe a(long j) {
        return new rpl(this.a.getSharedPreferences("AppUsageEventWatcher", 0), this.c, this.b, j, this.d);
    }
}
