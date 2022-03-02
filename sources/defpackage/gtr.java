package defpackage;

import android.content.Context;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: gtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtr extends iby implements gte {
    public final gun a;

    public gtr(Context context) {
        super(context, gtd.a, (ibm) null, ibx.a);
        if (gun.a == null) {
            synchronized (gun.class) {
                if (gun.a == null) {
                    gun.a = new gun();
                }
            }
        }
        this.a = gun.a;
    }

    public final acwa a() {
        iha b = ihb.b();
        b.a = gto.a;
        return a(b.a());
    }

    public final acwa a(gth gth) {
        return a(igf.a(gth, gtr.class.getSimpleName()));
    }

    public final acwa a(gth gth, BleSettings bleSettings) {
        ige a2 = this.a.a(gth, gtr.class.getSimpleName());
        gtm gtm = new gtm(this, gth, a2, bleSettings);
        gtn gtn = new gtn(this, gth, a2);
        ign a3 = igo.a();
        a3.a = gtm;
        a3.b = gtn;
        a3.c = a2;
        return a(a3.a());
    }
}
