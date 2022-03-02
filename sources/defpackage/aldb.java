package defpackage;

import android.view.View;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.Locale;

/* renamed from: aldb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aldb implements View.OnClickListener {
    final /* synthetic */ aldg a;

    public aldb(aldg aldg) {
        this.a = aldg;
    }

    public void onClick(View view) {
        alda alda = this.a.a;
        rhq rhq = alda.g;
        if (rhq == null) {
            rhq rhq2 = alda.i;
            if (rhq2 == null) {
                aleu aleu = alda.b;
                LatLng latLng = alda.h;
                String a2 = aue.a(latLng.a, latLng.b);
                rkj rkj = new rkj();
                rkj.a = a2;
                rkj.c = latLng;
                rkj.k = Collections.singletonList(0);
                rkj.b = "";
                rkj.l = "";
                rkj.j = -1;
                rkj.i = -1.0f;
                PlaceEntity a3 = rkj.a();
                a3.r = Locale.getDefault();
                aleu.b((rhq) a3);
                return;
            }
            alda.b.b(rhq2);
            return;
        }
        alda.b.b(rhq);
    }
}
