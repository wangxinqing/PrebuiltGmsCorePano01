package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ghd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ghd extends qvy {
    final /* synthetic */ ghe a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ghd(ghe ghe, String str) {
        super(str);
        this.a = ghe;
    }

    public final void a(ComponentName componentName) {
        this.a.e = null;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        ber ber;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IBillingAccountService");
            if (queryLocalInterface instanceof ber) {
                ber = (ber) queryLocalInterface;
            } else {
                ber = new ber(iBinder);
            }
        } else {
            ber = null;
        }
        this.a.c.lock();
        try {
            ghe ghe = this.a;
            ghe.e = ber;
            ghe.d.signalAll();
        } finally {
            this.a.c.unlock();
        }
    }
}
