package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.List;

/* renamed from: fbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fbw extends acg {
    private final pzq a;
    private final agcf e = new agcf(new qaq(new qvr(Looper.getMainLooper())));
    private final Bitmap f;
    private final int g;
    private List h;

    public fbw(int i, pzq pzq, Bitmap bitmap) {
        this.a = pzq;
        this.f = bitmap;
        this.g = i;
    }

    public final int a() {
        List list = this.h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int a(int i) {
        return ((pzh) this.h.get(i)).a;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        aoru a2 = jfm.a(9);
        fbv fbv = new fbv();
        AccountParticleDisc.a(context, this.e, a2, fbv, fbv, pzh.class);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new fbq(from.inflate(R.layout.credentials_assisted_account_row, viewGroup, false), this.e);
        }
        if (i == 1) {
            return new fbu(from.inflate(this.g, viewGroup, false), this.f);
        }
        if (i == 2) {
            return new fbs(from.inflate(R.layout.credentials_account_chooser_add_account, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid view type: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(adl adl, int i) {
        List list = this.h;
        if (list != null && i < list.size()) {
            ((fbt) adl).a((pzh) this.h.get(i), this.a);
        }
    }

    public final void a(List list) {
        this.h = list;
        as();
    }
}
