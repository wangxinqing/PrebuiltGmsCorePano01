package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dys implements View.OnClickListener {
    final /* synthetic */ dyx a;

    public dys(dyx dyx) {
        this.a = dyx;
    }

    public void onClick(View view) {
        ContactPerson contactPerson = (ContactPerson) view.getTag(R.id.appinvite_chip_view_holder_tag_person);
        dxx dxx = (dxx) this.a.f;
        if (dxx.C == null) {
            dxx.d();
        }
        dxx.D.a(contactPerson, 0);
        dxx.C.l = (ViewGroup) view.getParent();
        dxx.C.ar();
    }
}
