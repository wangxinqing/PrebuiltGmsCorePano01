package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: aldz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aldz implements rqs {
    final /* synthetic */ alee a;

    public aldz(alee alee) {
        this.a = alee;
    }

    public final void a(rqn rqn) {
        alee alee = this.a;
        alee.a();
        rvb rvb = alee.e;
        if (rvb != null) {
            rvb.a();
        }
        alee.d = rqn;
        try {
            alee.d.a.a((rsm) new rsl(alee));
            alee.d.a(true);
            rqw d = alee.d.d();
            d.c();
            d.a();
            d.a(false);
            d.b();
            d.d();
            aleo aleo = alee.a;
            List list = aleo.l;
            if (list != null) {
                ((alee) aleo.e).b.a(list);
            }
            if (!aleo.m) {
                aleo.m = true;
                LatLngBounds latLngBounds = aleo.d;
                if (latLngBounds == null) {
                    aleo.c.a((ica) new aleg(aleo));
                } else {
                    alen alen = aleo.e;
                    alee alee2 = (alee) alen;
                    if (alee2.d != null) {
                        if (alee2.c.getWidth() > 0) {
                            alee2.d.a(rqi.a(latLngBounds, alee2.c.getWidth(), alee2.c.getHeight()));
                        } else {
                            alan.a((View) alen, (Runnable) new aled(alee2, latLngBounds));
                        }
                    }
                    aleo.k = aleo.d;
                }
            }
            rqn.a((rqk) new alea(alee));
            try {
                rqn.a.a((rtd) new rtc(new aleb(alee)));
                try {
                    rqn.a.a((rsy) new rsx(new alec(alee)));
                    rqn.a((rqm) alee.b);
                } catch (RemoteException e) {
                    throw new rvl(e);
                }
            } catch (RemoteException e2) {
                throw new rvl(e2);
            }
        } catch (RemoteException e3) {
            throw new rvl(e3);
        }
    }
}
