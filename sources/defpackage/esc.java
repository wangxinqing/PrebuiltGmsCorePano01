package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.UserManager;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.util.concurrent.Executors;

/* renamed from: esc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esc extends ejd implements niz {
    private static final iwd a = ehv.a("WorkAccountServiceImpl");
    private final nix b;
    private final Context c;
    private final ekt d;
    private final gbs e;
    private final fys f;
    private final epw g;
    private final qub h;
    private final fyg i;
    private final Object j = new Object();

    public esc(Context context, LifecycleSynchronizer lifecycleSynchronizer) {
        nix a2 = nix.a(context, lifecycleSynchronizer, Executors.newSingleThreadExecutor());
        ihs b2 = ihs.b();
        ekt ekt = (ekt) ekt.a.b();
        gck gck = new gck(ihs.b());
        epw epw = (epw) epw.a.b();
        qub a3 = qub.a((Context) ihs.b());
        fyg fyg = (fyg) fyg.d.b();
        this.b = a2;
        this.c = b2;
        amrl.a((Object) ekt);
        this.d = ekt;
        amrl.a((Object) gck);
        this.e = gck;
        this.f = (fys) fys.d.b();
        amrl.a((Object) epw);
        this.g = epw;
        amrl.a((Object) a3);
        this.h = a3;
        amrl.a((Object) fyg);
        this.i = fyg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r8 = this;
            android.content.Context r0 = r8.c
            java.lang.String r1 = "work_account_prefs"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.Context r1 = r8.c
            java.lang.String r3 = "device_policy"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.app.admin.DevicePolicyManager r1 = (android.app.admin.DevicePolicyManager) r1
            java.lang.String r1 = r1.getDeviceOwner()
            r3 = 1
            if (r1 != 0) goto L_0x002a
            android.os.UserManager r1 = r8.d()
            boolean r1 = r1.isManagedProfile()
            if (r1 == 0) goto L_0x0028
            r1 = 1
            goto L_0x002b
        L_0x0028:
            r1 = 0
            goto L_0x002b
        L_0x002a:
            r1 = 1
        L_0x002b:
            java.lang.String r4 = "enabled_by_admin"
            boolean r0 = r0.getBoolean(r4, r1)
            if (r0 != 0) goto L_0x0052
            int r0 = android.os.Build.VERSION.SDK_INT
            android.os.UserManager r0 = r8.d()
            android.content.Context r1 = r8.c
            java.lang.String r1 = r1.getPackageName()
            android.os.Bundle r0 = r0.getApplicationRestrictions(r1)
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = "enableWorkAccountAdmin"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L_0x0052
            r0 = 0
            goto L_0x0053
        L_0x0050:
            r0 = 0
            goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            if (r0 != 0) goto L_0x0057
            r1 = 2
            goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "com.google.android.gms"
            java.lang.String r6 = "com.google.android.gms.auth.account.authenticator.WorkAccountAuthenticatorService"
            r4.<init>(r5, r6)
            android.content.Context r5 = r8.c
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r4)
            if (r5 == r1) goto L_0x0090
            iwd r5 = a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 46
            r6.<init>(r7)
            java.lang.String r7 = "updating authenticator enabled state to: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5.c(r0, r2)
            android.content.Context r0 = r8.c
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r4, r1, r3)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esc.a():void");
    }

    private final UserManager d() {
        return (UserManager) this.c.getSystemService("user");
    }

    public final boolean b() {
        return this.d.a();
    }

    public final void c() {
        synchronized (this.j) {
            a.c("init work authenticator", new Object[0]);
            a();
        }
    }

    public final void a(ejb ejb, Account account) {
        if (!"com.google.work".equals(account.type)) {
            throw new SecurityException("This API can only remove work accounts");
        } else if (this.f.a() != null || this.g.a(account) == Binder.getCallingUid()) {
            this.b.a(new erz(this.h, account, ejb));
        } else {
            throw new SecurityException("Account is not owned by package");
        }
    }

    public final void a(ejb ejb, String str) {
        this.b.a(new ery(ejb, str, this.i, this.e, this.g, Binder.getCallingUid()));
    }

    public final void a(String str, erf erf) {
        boolean z;
        synchronized (this.j) {
            try {
                z = this.d.a(str);
            } catch (ekp e2) {
                a.a((Throwable) e2);
                z = false;
            }
        }
        erf.a(0, z);
    }

    public final void a(boolean z) {
        synchronized (this.j) {
            if (this.c.getSharedPreferences("work_account_prefs", 0).edit().putBoolean("enabled_by_admin", z).commit()) {
                a.c("update authenticator enabled for admin", new Object[0]);
                a();
                return;
            }
            a.d("failed writing to SharedPreference", new Object[0]);
        }
    }

    public final boolean a(String str, String str2) {
        return this.d.a(str, str2);
    }
}
