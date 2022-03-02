package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.location.nearby.direct.bluetooth.BluetoothNameScan$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbx implements ashj {
    public final asda a;
    public final AtomicBoolean b;
    public final asfi c;
    public asgs d;
    public final BroadcastReceiver e = new BluetoothNameScan$1(this, "nearby");

    public asbx(Context context, asfi asfi) {
        this.a = (asda) thl.a(context, asda.class);
        this.c = asfi;
        this.b = new AtomicBoolean(false);
    }

    public static void a(Context context, asgc asgc) {
        asfi asfi = asgc.c;
        if (asfi == null) {
            asfi = asfi.c;
        }
        if (asfi != null) {
            asfh asfh = asfi.b;
            if (asfh == null) {
                asfh = asfh.d;
            }
            if (asfh.b.length() > 0) {
                asda asda = (asda) thl.b(context, asda.class);
                if (asda == null || !asda.a()) {
                    throw new asjk(asda.class, asbv.class);
                }
                return;
            }
        }
        throw new asji("Data to advertise on bluetooth name is not correctly set");
    }

    public final /* bridge */ /* synthetic */ audx a() {
        return asgh.d;
    }

    public final void a(asgs asgs, asiz asiz) {
        this.d = asgs;
        this.a.a((asiz) new asbw(this, asiz));
    }

    public final void a(asiz asiz) {
        if (this.b.compareAndSet(true, false)) {
            asda asda = this.a;
            asda.i.unregisterReceiver(this.e);
            this.a.g();
        }
        this.a.b(asiz);
    }
}
