package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* renamed from: ekm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekm {
    public static final iwd a = ehv.a("BroadcastManager");
    public static final fzk b = fzk.a("accountsAdded");
    public static final fzk c = fzk.a("accountsRemoved");
    public static final fzk d = fzk.a("accountsMutated");
    public static final fzk e = fzk.a("account");
    public static final fzk f = fzk.a("dmStatus");
    public final Context g;
    public final PackageManager h;
    public final hya i;
    public final fys j = ((fys) fys.d.b());

    public ekm(Context context) {
        PackageManager packageManager = context.getPackageManager();
        hya a2 = hya.a(context);
        this.g = context;
        this.h = packageManager;
        this.i = a2;
    }

    public final void a(Intent intent, String str) {
        this.g.sendBroadcast(new Intent(intent).setPackage(str));
    }
}
