package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dyp implements View.OnClickListener {
    final /* synthetic */ dyq a;

    public dyp(dyq dyq) {
        this.a = dyq;
    }

    public void onClick(View view) {
        dxx dxx = (dxx) this.a.f;
        if (dxx.h) {
            if (dxx.C == null) {
                dxx.d();
            }
            while (view.getId() != R.id.container && view.getParent() != null) {
                view = (View) view.getParent();
            }
            if (view.getId() != R.id.container) {
                view = null;
            }
            dxx.D.a((ContactPerson) view.getTag(R.id.appinvite_chip_view_holder_tag_person), 1);
            abs abs = dxx.C;
            abs.l = view;
            abs.ar();
        }
    }
}
