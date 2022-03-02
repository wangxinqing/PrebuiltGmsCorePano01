package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;

/* renamed from: epu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epu implements enu {
    private final enx a = eqb.f;

    public final void a(eny eny, Account account, enx enx, Object obj) {
        if (this.a.equals(enx)) {
            Set set = (Set) obj;
            ekm ekm = new ekm(ihs.b());
            ekm.a.c("Broadcasting account services changed.", new Object[0]);
            Intent intent = new Intent("com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED");
            fzl fzl = new fzl();
            fzl.b(ekm.e, account);
            Intent putExtras = intent.putExtras(fzl.a);
            List<ResolveInfo> queryBroadcastReceivers = ekm.h.queryBroadcastReceivers(putExtras, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null) {
                        String str = activityInfo.packageName;
                        if (!TextUtils.isEmpty(str) && ekm.i.b(str)) {
                            ekm.a(putExtras, str);
                        }
                    }
                }
            }
        }
    }
}
