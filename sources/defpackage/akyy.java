package defpackage;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: akyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyy implements rqs {
    final /* synthetic */ boolean a;
    public final /* synthetic */ akzj b;

    public akyy(akzj akzj, boolean z) {
        this.b = akzj;
        this.a = z;
    }

    public final void a(rqn rqn) {
        akzj akzj = this.b;
        if (!akzj.v) {
            akzh akzh = akzj.t;
            if (akzh != null) {
                akzh.a();
                return;
            }
            return;
        }
        Location c = rqn.c();
        if (c == null) {
            this.b.b = false;
            rqn.a(new akyw(this));
            if (this.a) {
                new qvr(Looper.getMainLooper()).postDelayed(new akyx(this), azcc.a.a().b());
                return;
            }
            akzh akzh2 = this.b.t;
            if (akzh2 != null) {
                akzh2.a();
                return;
            }
            return;
        }
        akzh akzh3 = this.b.t;
        if (akzh3 != null) {
            akzh3.a(new LatLng(c.getLatitude(), c.getLongitude()));
        }
    }
}
