package defpackage;

import android.app.ActivityManager;
import android.os.Handler;

/* renamed from: jho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jho extends jhl {
    private final ActivityManager c;
    private final jnh d;
    private final ActivityManager.OnUidImportanceListener e = new jhn(this);

    public jho(ActivityManager activityManager, jnh jnh, Handler handler) {
        super(handler);
        this.c = activityManager;
        this.d = jnh;
    }

    public static boolean b(int i) {
        return i <= 125;
    }

    public final boolean a(int i) {
        String[] a = this.d.a(i);
        if (a != null) {
            for (String packageImportance : a) {
                if (b(this.c.getPackageImportance(packageImportance))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.c.removeOnUidImportanceListener(this.e);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.c.addOnUidImportanceListener(this.e, 125);
    }
}
