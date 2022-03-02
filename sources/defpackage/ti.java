package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: ti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ti {
    private BroadcastReceiver a;
    final /* synthetic */ tn b;

    public ti(tn tnVar) {
        this.b = tnVar;
    }

    public abstract int a();

    public abstract void b();

    public abstract IntentFilter c();

    /* access modifiers changed from: package-private */
    public final void d() {
        e();
        IntentFilter c = c();
        if (c != null && c.countActions() != 0) {
            if (this.a == null) {
                this.a = new th(this);
            }
            this.b.e.registerReceiver(this.a, c);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.b.e.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
            }
            this.a = null;
        }
    }
}
