package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.concurrent.TimeUnit;

/* renamed from: alea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alea implements rqk {
    final /* synthetic */ alee a;

    public alea(alee alee) {
        this.a = alee;
    }

    public final void a() {
        this.a.d.e();
        try {
            LatLngBounds latLngBounds = this.a.d.e().a.b().e;
            aleo aleo = this.a.a;
            aleo.k = latLngBounds;
            alem alem = aleo.h;
            if (alem != null) {
                ((aler) alem).d = latLngBounds;
            }
            LatLngBounds latLngBounds2 = aleo.j;
            if (latLngBounds2 != null) {
                float a2 = aleo.a(latLngBounds.b, latLngBounds2.b);
                float a3 = aleo.a(latLngBounds.a, latLngBounds2.a);
                if (a2 < 50.0f && a3 < 50.0f) {
                    return;
                }
            }
            aleo.j = latLngBounds;
            icf icf = aleo.i;
            if (icf != null) {
                icf.b();
                aleo.i = null;
            }
            if (aleo.n) {
                rjl rjl = aleo.p;
                aleo.i = rjl.a(aleo.b, latLngBounds, (int) azcc.c(), "*", (PlaceFilter) null);
                aleo.i.a(new alei(aleo), azcc.d(), TimeUnit.MILLISECONDS);
            }
            alen alen = aleo.e;
            alek alek = aleo.f;
            if (alek != null) {
                aldp aldp = ((aldu) alek).b;
                aldp.f = true;
                aldp.as();
            }
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
