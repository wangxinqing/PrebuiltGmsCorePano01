package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: agsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsh extends BroadcastReceiver {
    public final agsf a;
    public final aekn b;
    private final agrm c;

    public agsh(agrm agrm, agsf agsf, aekn aekn) {
        this.c = agrm;
        this.a = agsf;
        this.b = aekn;
    }

    public final void onReceive(Context context, Intent intent) {
        long b2 = this.b.b();
        if ("com.google.android.gms.udc.action.FACS_CACHE_UPDATED".equals(intent.getAction())) {
            aorl.a(this.c.a(), new agsg(this, b2, goAsync()), aoqm.a);
        }
    }
}
