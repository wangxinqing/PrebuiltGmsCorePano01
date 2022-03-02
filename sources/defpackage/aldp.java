package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aldp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aldp extends acg implements alej {
    public final aleo a;
    public final akyr e;
    public boolean f;
    private List g = new ArrayList();

    public aldp(aleo aleo, akyr akyr) {
        this.a = aleo;
        this.e = akyr;
        this.f = true;
    }

    public final int a() {
        return this.g.size() + 1;
    }

    public final int a(int i) {
        return i != 0 ? 1 : 0;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (a(i) == 0) {
            return new aldo(from.inflate(R.layout.place_picker_list_title, viewGroup, false));
        }
        return new aldn(this, from.inflate(R.layout.place_picker_list_nearby_place, viewGroup, false));
    }

    public final void a(adl adl, int i) {
        int i2;
        Drawable drawable;
        String str;
        if (a(i) != 0) {
            aldn aldn = (aldn) adl;
            rhq rhq = (rhq) this.g.get(i - 1);
            aldn.v = rhq;
            aldn.s.setText(rhq.p());
            aldn.t.setText(rhq.q());
            ImageView imageView = aldn.u;
            akyr akyr = aldn.w.e;
            Iterator it = rhq.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    drawable = (Drawable) akyr.a.get("establishment");
                    break;
                }
                drawable = (Drawable) akyr.a.get(akic.a(((Integer) it.next()).intValue()));
                if (drawable != null) {
                    break;
                }
            }
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = aldn.u;
            akyr akyr2 = aldn.w.e;
            Iterator it2 = rhq.b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = (String) akyr2.b.get("establishment");
                    break;
                }
                str = (String) akyr2.b.get(akic.a(((Integer) it2.next()).intValue()));
                if (str != null) {
                    break;
                }
            }
            imageView2.setContentDescription(str);
            return;
        }
        boolean z = this.f;
        View view = ((aldo) adl).s;
        if (!z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public final void a(List list) {
        this.g = list;
        this.f = false;
        as();
    }
}
