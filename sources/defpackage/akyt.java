package defpackage;

import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: akyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyt implements rqs {
    final /* synthetic */ rhq[] a;
    final /* synthetic */ akzj b;

    public akyt(akzj akzj, rhq[] rhqArr) {
        this.b = akzj;
        this.a = rhqArr;
    }

    public final void a(rqn rqn) {
        for (int length = this.a.length - 1; length >= 0; length--) {
            rhq rhq = this.a[length];
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.a(rhq.d());
            markerOptions.d = ruw.a(this.b.d.a(rhq));
            markerOptions.a();
            rvg a2 = rqn.a(markerOptions);
            if (a2 != null) {
                this.b.a.put(a2.b(), rhq);
            }
        }
    }
}
