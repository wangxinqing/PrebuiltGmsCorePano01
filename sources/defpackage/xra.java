package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: xra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xra {
    private icc a;
    private final boolean b;

    public xra(boolean z) {
        this.b = z;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.data_layer_settings, viewGroup, false);
        if (this.b) {
            xrh.a((ViewGroup) inflate, this.a);
        } else {
            inflate.findViewById(R.id.debuggability_uploaders_label).setVisibility(8);
        }
        return inflate;
    }

    public final void a(bjs bjs) {
        bjs.setTitle((CharSequence) "APDL Debug");
        sg aE = bjs.aE();
        if (aE != null) {
            aE.b(true);
        }
        wlr wlr = new wlr();
        wlr.a = 80;
        wls a2 = wlr.a();
        ibz ibz = new ibz(bjs.getApplicationContext());
        ibz.a(wlt.a, (ibj) a2);
        ibz.a(bjs, 0, (icb) null);
        if (this.b) {
            xrh.a((Context) bjs, ibz);
        }
        this.a = ibz.b();
    }
}
