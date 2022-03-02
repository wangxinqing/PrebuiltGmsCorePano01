package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: agjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjc extends BroadcastReceiver {
    public final agic a;
    public final amsv b;
    private final amsv c;

    public agjc(agic agic, amsv amsv, amsv amsv2) {
        this.a = agic;
        this.b = amsv;
        this.c = amsv2;
    }

    public final void onReceive(Context context, Intent intent) {
        amsv amsv;
        aorv aorv;
        intent.getAction();
        if (this.a.b) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && (amsv = this.c) != null && (aorv = (aorv) amsv.a()) != null) {
            aorv.a(new agjb(this));
            anhq anhq = aggw.a;
        }
    }
}
