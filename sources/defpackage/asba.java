package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asba implements ashj {
    public final asda a;
    public final asfp b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final asew d;

    public asba(Context context, asfp asfp, asew asew) {
        this.a = (asda) thl.a(context, asda.class);
        this.b = asfp;
        this.d = asew;
    }

    public static void a(Context context, asep asep) {
        int i = Build.VERSION.SDK_INT;
        asfp asfp = asep.c;
        if (asfp == null) {
            asfp = asfp.c;
        }
        if ((asfp.a & 1) != 0) {
            asfp asfp2 = asep.c;
            if (asfp2 == null) {
                asfp2 = asfp.c;
            }
            if (!asfp2.b.j()) {
                asda asda = (asda) thl.b(context, asda.class);
                if (asda == null || !asda.b()) {
                    throw new asjk(asda.class, asba.class);
                } else if ((asep.a & 8) != 0) {
                    asew asew = asep.e;
                    if (asew == null) {
                        asew = asew.d;
                    }
                    aseu a2 = aseu.a(asew.c);
                    if (a2 == null) {
                        a2 = aseu.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
                    }
                    if (a2 == aseu.BLE_ADVERTISE_SCAN_RECORD) {
                        throw new asji("Requesting to advertise over BLE using the entire scan record is not a supported operation.");
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        throw new asji("Advertise data is not set");
    }

    public final /* bridge */ /* synthetic */ audx a() {
        return aseq.c;
    }

    public final void a(asgs asgs, asiz asiz) {
        this.a.a((asiz) new asaz(this, asiz));
    }

    public final void a(asiz asiz) {
        if (this.c.compareAndSet(true, false)) {
            asda asda = this.a;
            jjg jjg = asil.a;
            asda.a((asiz) null, asda.h.n);
        }
        this.a.b(asiz);
    }
}
