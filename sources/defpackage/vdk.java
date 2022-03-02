package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: vdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdk extends uxi {
    public static final /* synthetic */ int b = 0;
    private static final ibq l = new ibq("Nearby.MESSAGES_API", n, m);
    private static final ibg m = new ibg();
    private static final ibn n = new vda();
    public final int a;

    public vdk(Context context, uxk uxk) {
        super(context, l, uxk, ibx.a);
        this.a = vcv.a(context);
    }

    private final acwa a(vdh vdh) {
        return b((ihb) new vdg(this, vdh));
    }

    public final ige b(acwd acwd) {
        return a((Object) new vdc(acwd), Status.class.getName());
    }

    public final isc c() {
        String str;
        isc c = super.c();
        ibm ibm = this.f;
        if (!(ibm == null || (str = ((uxk) ibm).e) == null)) {
            c.c = str;
        }
        return c;
    }

    public final acwa e(PendingIntent pendingIntent) {
        iva.a((Object) pendingIntent);
        return a((vdh) new vcz(pendingIntent));
    }

    private final ige a(Object obj) {
        if (obj != null) {
            return a(obj, obj.getClass().getName());
        }
        return null;
    }

    public final acwa a(PendingIntent pendingIntent, uyo uyo) {
        vdj vdj;
        iva.a((Object) pendingIntent);
        iva.a((Object) uyo);
        ige a2 = a((Object) uyo.c);
        if (a2 != null) {
            vdj = new vdj(a2);
        } else {
            vdj = null;
        }
        return a((vdh) new vcy(pendingIntent, vdj, uyo));
    }

    public final acwa a(uxh uxh) {
        iva.a((Object) uxh);
        acwd acwd = new acwd();
        a(igf.a(uxh, uxh.getClass().getName())).a((acvp) new vdd(acwd));
        return acwd.a;
    }

    public final acwa a(uxh uxh, uyo uyo) {
        boolean z;
        iva.a((Object) uxh);
        iva.a((Object) uyo);
        if (uyo.a.j == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ige a2 = a((Object) uxh);
        ige a3 = a((Object) uyo.c);
        vcw vcw = new vcw(this, a2, new vdb(this, a3, a3), uyo);
        vcx vcx = new vcx(a2);
        vde vde = new vde(this, a2, vcw);
        igc igc = a2.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        return a((igi) vde, (ihg) new vdf(this, igc, vcx));
    }
}
