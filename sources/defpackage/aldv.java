package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aldv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aldv implements alej, rqm {
    private final aleo a;
    private final alee b;
    private final Map c = new HashMap();
    private final akyr d;

    public aldv(aleo aleo, alee alee, akyr akyr) {
        this.a = aleo;
        this.b = alee;
        this.d = akyr;
    }

    public final void a(List list) {
        rvg rvg;
        this.b.a();
        this.c.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rhq rhq = (rhq) list.get(i);
            Bitmap a2 = this.d.a(rhq);
            alee alee = this.b;
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.a(rhq.d());
            markerOptions.a();
            markerOptions.d = ruw.a(a2);
            rqn rqn = alee.d;
            if (rqn != null) {
                rvg = rqn.a(markerOptions);
                alee.i.add(rvg);
            } else {
                rvg = null;
            }
            if (rvg != null) {
                this.c.put(rvg, rhq);
            }
        }
    }

    public final boolean a(rvg rvg) {
        rhq rhq = (rhq) this.c.get(rvg);
        if (rhq == null) {
            return false;
        }
        this.a.a(rhq);
        return true;
    }
}
