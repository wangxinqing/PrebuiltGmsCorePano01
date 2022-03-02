package defpackage;

import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: byw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byw extends bva {
    final /* synthetic */ String a;
    final /* synthetic */ bzv b;
    final /* synthetic */ byy c;
    final /* synthetic */ PlaceFenceHelper d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public byw(PlaceFenceHelper placeFenceHelper, String str, Object[] objArr, String str2, bzv bzv, byy byy) {
        super(str, objArr);
        this.d = placeFenceHelper;
        this.a = str2;
        this.b = bzv;
        this.c = byy;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rhq rhq;
        rhs rhs = (rhs) obj;
        try {
            if (rhs.a() == 0 || (rhq = (rhq) rhs.a(0)) == null) {
                ((anih) ((anih) bxk.a.b()).a("byw", "a", 356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] Place not found");
            } else {
                LatLng d2 = rhq.d();
                new Object[1][0] = d2;
                PlaceFenceHelper placeFenceHelper = this.d;
                placeFenceHelper.a(this.a, d2.a, d2.b, placeFenceHelper.a(rhq), this.b, this.c);
            }
        } finally {
            rhs.c();
        }
    }

    public final void a(rhs rhs) {
        rhq rhq;
        try {
            if (rhs.a() == 0 || (rhq = (rhq) rhs.a(0)) == null) {
                ((anih) ((anih) bxk.a.b()).a("byw", "a", 356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] Place not found");
            } else {
                LatLng d2 = rhq.d();
                new Object[1][0] = d2;
                PlaceFenceHelper placeFenceHelper = this.d;
                placeFenceHelper.a(this.a, d2.a, d2.b, placeFenceHelper.a(rhq), this.b, this.c);
            }
        } finally {
            rhs.c();
        }
    }
}
