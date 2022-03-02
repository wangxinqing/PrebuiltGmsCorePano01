package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import com.google.android.gms.R;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: ekl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekl {
    public static final iwd a = ehv.a("AccountStatusChecker");
    private final Context b;
    private final ekr c;
    private final fys d = ((fys) fys.d.b());
    private final ekm e;

    public ekl(Context context) {
        ekr ekr = new ekr(context);
        ekm ekm = new ekm(context);
        this.b = context;
        this.c = ekr;
        this.e = ekm;
    }

    public final void a(eny eny, Account account) {
        boolean z;
        if (!TextUtils.isEmpty((CharSequence) eny.a(account, eqb.a))) {
            String str = (String) eny.a(account, eqb.d);
            if (!TextUtils.isEmpty(str)) {
                if (this.d.b("com.google.android.apps.work.clouddpc") || this.d.b("com.google.android.apps.work.clouddpc.arc")) {
                    z = true;
                } else {
                    z = false;
                }
                boolean hasSystemFeature = this.d.a.hasSystemFeature("org.chromium.arc.device_management");
                if (z || hasSystemFeature) {
                    ekm ekm = this.e;
                    iwd iwd = ekm.a;
                    String valueOf = String.valueOf(str);
                    iwd.c(valueOf.length() == 0 ? new String("Broadcasting bad device management: ") : "Broadcasting bad device management: ".concat(valueOf), new Object[0]);
                    String a2 = ekm.j.a();
                    if (a2 != null) {
                        Intent intent = new Intent("com.google.android.gms.auth.BAD_DEVICE_MANAGEMENT");
                        fzl fzl = new fzl();
                        fzl.b(ekm.e, account);
                        fzl.b(ekm.f, str);
                        ekm.g.sendBroadcast(intent.putExtras(fzl.a).setPackage(a2));
                    }
                }
                this.b.sendBroadcast(new Intent("com.google.android.apps.enterprise.dmagent.AUTO_SYNC").setPackage("com.google.android.apps.enterprise.dmagent").putExtra("com.google.android.apps.enterprise.dmagent.Email", account.name).putExtra("com.google.android.apps.enterprise.dmagent.DmResponseStatusCode", str));
                Long l = (Long) eny.a(account, (enx) eqb.o);
                int i = Build.VERSION.SDK_INT;
                Bundle applicationRestrictions = ((UserManager) this.b.getSystemService("user")).getApplicationRestrictions(this.b.getPackageName());
                if ((applicationRestrictions == null || !applicationRestrictions.getBoolean("auth_account:hide_dm_notification")) && (l == null || System.currentTimeMillis() >= l.longValue())) {
                    a.b("Notifying for %s because of DeviceManagement", iwd.a((Object) account));
                    if (hasSystemFeature) {
                        a.c("Notifying 'Account blocked' because of DeviceManagement", new Object[0]);
                        ekr ekr = this.c;
                        if (ekr.c(account)) {
                            ekr.a(ekr.d(account), (PendingIntent) null, account, ekr.a.getString(R.string.account_blocked_title), BitmapFactory.decodeResource(ekr.a.getResources(), R.drawable.ic_google), false);
                            return;
                        }
                        return;
                    }
                    a.c("Notifying 'Account action required' because of DeviceManagement", new Object[0]);
                    this.c.a(account);
                    return;
                }
                a.c("Canceling for %s because of DM suppression", iwd.a((Object) account));
                this.c.b(account);
                return;
            }
            a.c("Canceling for %s", iwd.a((Object) account));
            this.c.b(account);
            return;
        }
        a.c("Notifying for %s because of bad LST", iwd.a((Object) account));
        this.c.a(account);
        if (this.d.a(account)) {
            ekm ekm2 = this.e;
            if (ent.D()) {
                ekm.a.c("Broadcasting account reauth required.", new Object[0]);
                Intent intent2 = new Intent("com.google.android.gms.auth.ACCOUNT_REAUTH_REQUIRED");
                fzl fzl2 = new fzl();
                fzl2.b(ekm.e, account);
                Intent putExtras = intent2.putExtras(fzl2.a);
                fys fys = ekm2.j;
                HashSet<String> hashSet = new HashSet<>();
                String a3 = fys.a();
                if (a3 != null) {
                    hashSet.add(a3);
                }
                String[] a4 = fys.b.a(fys.c.a(account));
                if (a4 != null) {
                    Collections.addAll(hashSet, a4);
                }
                for (String a5 : hashSet) {
                    ekm2.a(putExtras, a5);
                }
            }
        }
    }
}
