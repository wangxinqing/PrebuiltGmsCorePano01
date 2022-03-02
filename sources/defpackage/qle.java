package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: qle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qle implements qlf {
    private final Context a;

    public qle(Context context) {
        this.a = context;
    }

    public final void a(Account account, int i, int i2) {
        if (kf.a(this.a, "com.google.android.finsky.permission.INSTANT_APP_STATE") == 0 && this.a.getPackageManager().checkPermission("com.google.android.finsky.permission.INSTANT_APP_STATE", "com.android.vending") == 0) {
            Intent intent = new Intent("com.google.android.instantapps.OPT_IN_STATUS_CHANGED").setPackage("com.android.vending");
            intent.putExtra("com.google.android.instantapps.OPT_IN_STATUS_CHANGED_ACCOUNT", account);
            intent.putExtra("com.google.android.instantapps.OPT_IN_STATUS_CHANGED_OLD_STATE", i);
            intent.putExtra("com.google.android.instantapps.OPT_IN_STATUS_CHANGED_NEW_STATE", i2);
            List<ResolveInfo> queryBroadcastReceivers = this.a.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                this.a.sendBroadcast(intent);
            }
        }
    }
}
