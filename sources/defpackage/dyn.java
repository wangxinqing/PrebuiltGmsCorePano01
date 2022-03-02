package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dyn implements View.OnClickListener {
    final /* synthetic */ dyq a;

    public dyn(dyq dyq) {
        this.a = dyq;
    }

    public void onClick(View view) {
        ContactPerson contactPerson = (ContactPerson) view.getTag(R.id.appinvite_chip_view_holder_tag_person);
        dyq dyq = this.a;
        dyr dyr = dyq.f;
        int i = dyq.g;
        int indexOf = dyq.m.indexOf(contactPerson);
        dxx dxx = (dxx) dyr;
        if (dxx.b(contactPerson)) {
            String a2 = eap.a(dxx.a, contactPerson);
            if (!TextUtils.isEmpty(dxx.p)) {
                if (dxx.q != null) {
                    eat.b(((Fragment) dyr).getActivity(), dxx.q);
                }
                dxx.q = eat.a(((Fragment) dyr).getActivity(), String.format(dxx.p, new Object[]{a2}), true, false);
            }
        } else if (dxx.a(contactPerson)) {
            dxx.a(contactPerson, i, indexOf);
        } else {
            dxx.b(contactPerson, i, indexOf);
        }
    }
}
