package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dyo implements View.OnLongClickListener {
    final /* synthetic */ dyq a;

    public dyo(dyq dyq) {
        this.a = dyq;
    }

    public final boolean onLongClick(View view) {
        String str;
        ContactPerson contactPerson = (ContactPerson) view.getTag(R.id.appinvite_chip_view_holder_tag_person);
        dyr dyr = this.a.f;
        if (!TextUtils.isEmpty(contactPerson.b)) {
            str = ycm.f(contactPerson.b);
        } else {
            Long l = contactPerson.c;
            if (l == null) {
                ContactPerson.ContactMethod a2 = contactPerson.a();
                int i = a2.a;
                if (i == 1) {
                    str = ycm.h(a2.b);
                } else if (i != 2) {
                    str = null;
                } else {
                    String valueOf = String.valueOf(a2.b);
                    str = valueOf.length() == 0 ? new String("p:") : "p:".concat(valueOf);
                }
            } else {
                String valueOf2 = String.valueOf(l.toString());
                str = valueOf2.length() == 0 ? new String("c:") : "c:".concat(valueOf2);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            abgm abgm = new abgm();
            dxx dxx = (dxx) dyr;
            abgm.b(dxx.c);
            abgm.a(str);
            abgm.a(80);
            abgm.a.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME", eap.a(dxx.a, contactPerson));
            ((Fragment) dyr).startActivityForResult(abgm.a, 1);
        }
        return true;
    }
}
