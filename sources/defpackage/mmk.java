package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPerson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmk extends acg {
    public final mms a;
    public final Context e;
    private final amzy f;

    public mmk(List list, Context context, mms mms) {
        this.f = amzy.a((Collection) list);
        this.e = context;
        this.a = mms;
    }

    public final int a() {
        return this.f.size();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new mmj(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fm_contact_picker_contact_row_container, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        boolean z;
        mmj mmj = (mmj) adl;
        ContactPerson contactPerson = (ContactPerson) this.f.get(i);
        int i2 = mmj.w;
        if (contactPerson.c != null) {
            z = true;
        } else {
            z = false;
        }
        mmj.u = z;
        if (mmj.v.a.b(contactPerson)) {
            View view = mmj.s;
            mmj.e(view).setVisibility(0);
            mmj.b(view).setVisibility(4);
            mmj.a(view).setVisibility(4);
        } else if (mmj.u) {
            mmj.a(mmj.s).setImageURI(Uri.parse(contactPerson.c.b));
            View view2 = mmj.s;
            mmj.e(view2).setVisibility(4);
            mmj.b(view2).setVisibility(4);
            mmj.a(view2).setVisibility(0);
        } else {
            View view3 = mmj.s;
            mmj.e(view3).setVisibility(4);
            mmj.b(view3).setVisibility(0);
            mmj.a(view3).setVisibility(4);
        }
        List c = mmj.v.a.c(contactPerson);
        if (c.isEmpty()) {
            c = contactPerson.d;
        }
        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) c.get(0);
        mmj.c(mmj.s).setText(contactPerson.a);
        mmj.d(mmj.s).setText(contactMethod.b);
        mmj.d(mmj.s).setVisibility(0);
        mmj.s.setOnClickListener(new mmg(mmj, contactPerson, contactMethod));
        mmj.t.removeAllViews();
        ImageView v = mmj.v();
        v.setVisibility(4);
        if (contactPerson.d.size() > 1) {
            v.setVisibility(0);
            v.setOnClickListener(new mmh(mmj, contactPerson));
            ArrayList arrayList = contactPerson.d;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) arrayList.get(i3);
                View inflate = ((LayoutInflater) mmj.v.e.getSystemService("layout_inflater")).inflate(R.layout.fm_contact_picker_contact_row, (ViewGroup) null);
                if (mmj.v.a.e(contactPerson, contactMethod2)) {
                    mmj.e(inflate).setBackground((Drawable) null);
                    mmj.e(inflate).setVisibility(0);
                }
                mmj.c(inflate).setText(contactMethod2.b);
                mmj.d(inflate).setVisibility(8);
                inflate.setOnClickListener(new mmi(mmj, contactPerson, contactMethod2));
                mmj.t.addView(inflate);
            }
            if (((mmq) ((mmr) mmj.v.a).b.get(contactPerson)).b) {
                mmj.v().setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
                mmj.v().setClickable(true);
                ImageView v2 = mmj.v();
                String str = contactPerson.a;
                String string = mmj.v.e.getResources().getString(R.string.fm_collapse);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
                sb.append(str);
                sb.append("; ");
                sb.append(string);
                v2.setContentDescription(sb.toString());
                mmj.t.setVisibility(0);
                mmj.d(mmj.s).setVisibility(8);
                return;
            }
            mmj.v().setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            ImageView v3 = mmj.v();
            String str2 = contactPerson.a;
            String string2 = mmj.v.e.getResources().getString(R.string.fm_expand);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(string2).length());
            sb2.append(str2);
            sb2.append("; ");
            sb2.append(string2);
            v3.setContentDescription(sb2.toString());
            mmj.t.setVisibility(8);
            mmj.d(mmj.s).setVisibility(0);
        }
    }
}
