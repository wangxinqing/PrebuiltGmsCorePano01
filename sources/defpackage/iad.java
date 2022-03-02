package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: iad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iad extends acg {
    public final pzq a;
    public List e;
    private final int f;
    private final int g;
    private agcf h;

    public iad(pzq pzq, int i, int i2) {
        this.a = pzq;
        this.f = i;
        this.g = i2;
    }

    public final int a() {
        List list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int a(int i) {
        List list = this.e;
        iva.a((Object) list);
        return ((pzh) list.get(i)).a;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        Context context = viewGroup.getContext();
        aoru a2 = jfm.a(9);
        this.h = new agcf(qaq);
        hzy hzy = new hzy();
        AccountParticleDisc.a(context, this.h, a2, hzy, hzy, pzh.class);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new iaa(from.inflate(R.layout.common_account_account_picker_header_row, viewGroup, false));
        }
        if (i == 2) {
            return new hzz(from.inflate(R.layout.common_account_add_account_chip_view, viewGroup, false));
        }
        if (i == 3) {
            return new iab(from.inflate(this.f, viewGroup, false));
        }
        if (i != 4) {
            return new hzx(from.inflate(R.layout.common_account_chip_account_with_disc_row, viewGroup, false), this.h);
        }
        return new iac(from.inflate(this.g, viewGroup, false), this.h);
    }

    public final void a(adl adl, int i) {
        List list = this.e;
        if (list != null && i < list.size()) {
            pzh pzh = (pzh) this.e.get(i);
            int i2 = pzh.a;
            if (i2 == 0) {
                hzx hzx = (hzx) adl;
                hzx.s.setText(pzh.d);
                hzx.t.setText(pzh.c);
                hzx.u.a((Object) pzh);
                hzx.v.setOnClickListener(new hzv(this, pzh));
            } else if (i2 == 1) {
                ((iaa) adl).s.setText(pzh.c);
            } else if (i2 == 2) {
                ((hzz) adl).s.setOnClickListener(new hzu(this, pzh));
            } else if (i2 != 3) {
                iac iac = (iac) adl;
                iac.s.setText(pzh.d);
                iac.t.setText(pzh.c);
                iac.u.a((Object) pzh);
                iac.v.setClickable(false);
            } else {
                ((iab) adl).s.setOnClickListener(new hzw(this, pzh));
            }
        }
    }
}
