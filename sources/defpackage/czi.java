package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: czi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class czi extends acg {
    private cyf a;
    public List g;
    public final cyg h;
    public cyh i;
    public final Context j;
    public final djk k;

    public czi(Context context, List list, cyg cyg, djk djk) {
        this.g = list;
        this.h = cyg;
        this.j = context;
        this.k = djk;
    }

    private final void c() {
        if (this.a != null) {
            if (this.g.isEmpty() || ((cze) this.g.get(0)).a() != 1) {
                this.g.add(0, new czh(this.a));
                L(0);
                return;
            }
            ((czh) this.g.get(0)).a = this.a;
            K(0);
        } else if (!this.g.isEmpty() && ((cze) this.g.get(0)).a() == 1) {
            this.g.remove(0);
            M(0);
        }
    }

    public final int a() {
        return this.g.size();
    }

    public /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i2) {
        throw null;
    }

    public final czj a(ViewGroup viewGroup) {
        return new czg(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.as_error_banner, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i2) {
        ((czj) adl).a((cze) this.g.get(i2));
    }

    public final void a(cyf cyf, cyh cyh) {
        this.a = cyf;
        this.i = cyh;
        c();
    }

    public final void a(List list) {
        this.g = list;
        c();
    }
}
