package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwn extends acg {
    public final List a = new ArrayList();
    Context e;

    public zwn() {
        new ArrayList();
        new ArrayList();
    }

    public final int a() {
        return this.a.size();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        this.e = viewGroup.getContext();
        return new zwm(LayoutInflater.from(this.e).inflate(R.layout.romanesco_contact_row, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        amri amri;
        amri amri2;
        zwm zwm = (zwm) adl;
        if (i >= 0 && i < a()) {
            amri = amri.b(((zwk) this.a.get(i)).a());
        } else {
            amri = ampu.a;
        }
        if (i >= 0 && i < a()) {
            amri2 = amri.b(((zwk) this.a.get(i)).b());
        } else {
            amri2 = ampu.a;
        }
        if (amri.a() && amri2.a()) {
            String string = this.e.getResources().getString(R.string.romanesco_avatar, new Object[]{amri.b()});
            zwm.s.setText((String) amri.b());
            zwm.t.setImageDrawable((Drawable) amri2.b());
            zwm.t.setContentDescription(string);
        }
    }
}
