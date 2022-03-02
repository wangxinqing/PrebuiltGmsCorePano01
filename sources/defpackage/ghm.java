package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import com.google.android.gms.auth.managed.intentoperations.RevokePasswordRequirementsIntentOperation;

/* renamed from: ghm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghm {
    private static final iwd a = ehv.a("AuthManaged", "PasswordComplexityCheckerImpl");
    private static ghm b;
    private final gjj c;

    private ghm(gjj gjj) {
        this.c = gjj;
    }

    public static synchronized ghm a() {
        ghm a2;
        synchronized (ghm.class) {
            a2 = a((gjj) gjk.b());
        }
        return a2;
    }

    private final synchronized int c(Context context) {
        ghk[] ghkArr = ghk.a;
        int length = ghkArr.length;
        for (int i = 0; i < 3; i++) {
            ghk ghk = ghkArr[i];
            anhk i2 = ghk.c.listIterator();
            while (i2.hasNext()) {
                ghl ghl = (ghl) i2.next();
                if (this.c.a(d(context), ghl.a, ghl.b)) {
                    return ghk.b;
                }
            }
        }
        return 0;
    }

    private static final DevicePolicyManager d(Context context) {
        return (DevicePolicyManager) context.getSystemService("device_policy");
    }

    public final synchronized void b(Context context) {
        int a2 = this.c.a();
        if (a2 != 1) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a2);
            iwd.d(sb.toString(), new Object[0]);
        } else if (!this.c.a(context)) {
            a.d("Device admin not active.", new Object[0]);
        } else {
            this.c.a(d(context));
            ((gjk) this.c).c(context).a(RevokePasswordRequirementsIntentOperation.a(context));
        }
    }

    public static synchronized ghm a(gjj gjj) {
        ghm ghm;
        synchronized (ghm.class) {
            if (b == null) {
                b = new ghm(gjj);
            }
            ghm = b;
        }
        return ghm;
    }

    public final synchronized int a(Context context) {
        int a2 = this.c.a();
        if (a2 != 1) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a2);
            iwd.d(sb.toString(), new Object[0]);
            return a2;
        } else if (!this.c.a(context)) {
            a.d("Device admin not active.", new Object[0]);
            return 5;
        } else if (!d(context).isActivePasswordSufficient()) {
            return 0;
        } else {
            return c(context);
        }
    }

    public final synchronized void a(Context context, int i) {
        ghl ghl;
        int a2 = this.c.a();
        if (a2 != 1) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a2);
            iwd.d(sb.toString(), new Object[0]);
        } else if (!this.c.a(context)) {
            a.d("Device admin not active.", new Object[0]);
        } else {
            ghk[] ghkArr = ghk.a;
            int length = ghkArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    ghl = new ghl(0, 0);
                    break;
                }
                ghk ghk = ghkArr[i2];
                if (ghk.b == i) {
                    ghl = (ghl) ghk.c.get(0);
                    break;
                }
                i2++;
            }
            ((gjk) this.c).c(context).a("PasswordComplexityRevokeAlarm", 1, 300000 + System.currentTimeMillis(), RevokePasswordRequirementsIntentOperation.a(context), (String) null);
            this.c.b(d(context), ghl.a, ghl.b);
        }
    }
}
