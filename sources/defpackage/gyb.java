package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyb {
    public static final gyz a = new gya();
    private static final iwd f = gzk.a("ExecutionManager");
    public final Context b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final gyp d = ((gyp) gyp.a.b());
    public final amzy e;

    public gyb(Context context) {
        this.b = context;
        this.e = amzy.a(new gyt(context), new gyu(context), new gys(context));
    }

    public final Bundle a(Bundle bundle) {
        if (this.d.b().a()) {
            Bundle bundle2 = ((gyn) this.d.b().b()).b;
            bundle = (Bundle) bundle.clone();
            if (bundle2.getBoolean("CheckinService_fetchSystemUpdates", false)) {
                bundle.putBoolean("CheckinService_fetchSystemUpdates", true);
            }
            if (bundle2.getBoolean("checkin_source_force")) {
                bundle.putBoolean("checkin_source_force", true);
                if (bundle2.containsKey("checkin_source_package")) {
                    bundle.putString("checkin_source_package", bundle2.getString("checkin_source_package"));
                }
                if (bundle2.containsKey("checkin_source_class")) {
                    bundle.putString("checkin_source_class", bundle2.getString("checkin_source_class"));
                }
            }
        }
        return bundle;
    }

    public final long b(long j, Bundle bundle) {
        anhk i = this.e.listIterator();
        long j2 = 0;
        while (i.hasNext()) {
            gyr gyr = (gyr) i.next();
            long a2 = gyr.a(j, bundle);
            f.b("Computer: %s with delay: %d", gyr.a(), Long.valueOf(a2));
            j2 = Math.max(j2, a2);
        }
        return j2;
    }

    public final void a(long j, Bundle bundle) {
        long j2 = j;
        Bundle a2 = a(bundle);
        long b2 = b(j2, a2);
        if (b2 < awre.b()) {
            b2 = awre.b();
        }
        long b3 = b2 + awre.a.a().b();
        amri b4 = this.d.b();
        if (!b4.a() || b3 + j2 <= ((gyn) b4.b()).a) {
            long j3 = b3 + j2;
            gyv a3 = gyw.a(this.b);
            a3.a();
            int i = Build.VERSION.SDK_INT;
            jbs jbs = a3.b;
            Context context = a3.a;
            jbs.b("checkin_attempt_alarm", 2, j3, PendingIntent.getService(context, 0, gyx.a(context, a2), 134217728), "com.google.android.gms.checkin");
            this.d.a(new gyn(j3, a2));
            f.c("Checkin scheduled at %d.", Long.valueOf(j3));
            return;
        }
        this.d.a(new gyn(((gyn) b4.b()).a, a2));
        f.c("Updated checkin scheduled at %d.", Long.valueOf(((gyn) b4.b()).a));
    }

    public final void a(long j, gvx gvx) {
        this.c.set(false);
        anhk i = this.e.listIterator();
        while (i.hasNext()) {
            ((gyr) i.next()).a(j, gvx);
        }
    }
}
