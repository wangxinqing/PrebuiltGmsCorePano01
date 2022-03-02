package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: fco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fco extends acg {
    public final fcr a;
    private final String e;
    private List f;
    private agcf g;

    public fco(fcr fcr, String str) {
        this.a = fcr;
        this.e = str;
    }

    public final int a() {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int a(int i) {
        List list = this.f;
        iva.a((Object) list);
        return ((fcp) list.get(i)).a;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        Context context = viewGroup.getContext();
        aoru a2 = jfm.a(9);
        this.g = new agcf(qaq);
        fct fct = new fct(this.e);
        AccountParticleDisc.a(context, this.g, a2, fct, fct, fcp.class);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            return new fcn(from.inflate(R.layout.credentials_assisted_account_row, viewGroup, false), this.g);
        }
        return new adl(from.inflate(R.layout.credentials_assisted_header_row, viewGroup, false), (byte[]) null);
    }

    public final void a(adl adl, int i) {
        List list = this.f;
        if (list != null && i < list.size()) {
            fcp fcp = (fcp) this.f.get(i);
            fcn fcn = (fcn) adl;
            int i2 = fcp.a;
            fcn.s.setText(fcp.d);
            fcn.t.setText(fcp.c);
            fcn.t.setTypeface(i2 == 0 ? Typeface.SANS_SERIF : Typeface.MONOSPACE);
            fcn.u.a((Object) fcp);
            fcn.v.setOnClickListener(new fcm(this, fcp, fcn));
        }
    }

    public final void a(List list) {
        this.f = list;
        as();
    }
}
