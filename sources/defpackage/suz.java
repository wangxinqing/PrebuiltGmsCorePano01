package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: suz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class suz extends BroadcastReceiver {
    public final sze a;
    public boolean b;
    public boolean c;

    static {
        suz.class.getName();
    }

    public suz(sze sze) {
        iva.a((Object) sze);
        this.a = sze;
    }

    public final void a() {
        this.a.s();
        this.a.r();
        this.a.r();
        if (this.b) {
            c().k.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                b().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c().c.a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final Context b() {
        return this.a.n();
    }

    public final sut c() {
        return this.a.E();
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.s();
        String action = intent.getAction();
        c().k.a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean c2 = this.a.g().c();
            if (this.c != c2) {
                this.c = c2;
                this.a.F().a((Runnable) new suy(this));
                return;
            }
            return;
        }
        c().f.a("NetworkBroadcastReceiver received unknown action", action);
    }
}
