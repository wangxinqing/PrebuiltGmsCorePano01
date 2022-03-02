package defpackage;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filterable;
import com.google.android.gms.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alcp extends acg implements Filterable {
    public final rlr a;
    public int e = 0;
    public int f = 0;
    private final Map g;

    public alcp(icc icc) {
        this.a = new rlr(icc);
        this.g = new HashMap();
        a(true);
        this.a.registerDataSetObserver(new alcn(this));
    }

    public final long J(int i) {
        if (this.a.getItemViewType(i) != 0) {
            return (long) this.a.getItem(i).d().hashCode();
        }
        return -1;
    }

    public final int a() {
        return this.a.getCount();
    }

    public final void b(aci aci) {
        super.b(aci);
        if (this.g.containsKey(aci)) {
            this.a.unregisterDataSetObserver((DataSetObserver) this.g.get(aci));
            this.g.remove(aci);
        }
    }

    /* renamed from: c */
    public final rlq getFilter() {
        return this.a.a;
    }

    public final int a(int i) {
        return this.a.getItemViewType(i);
    }

    public final adl a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new adl(from.inflate(R.layout.place_autocomplete_item_powered_by_google, viewGroup, false));
        }
        if (i == 1) {
            return new alct(from.inflate(R.layout.place_autocomplete_item_prediction, viewGroup, false));
        }
        throw new IllegalStateException();
    }

    public final void a(aci aci) {
        super.a(aci);
        alco alco = new alco(aci);
        this.a.registerDataSetObserver(alco);
        this.g.put(aci, alco);
    }

    public final void a(adl adl, int i) {
        if (this.a.getItemViewType(i) != 0) {
            boolean z = false;
            if (this.e == 0 && this.f > 0) {
                z = true;
            }
            alct alct = (alct) adl;
            rlr rlr = this.a;
            alct.s = i;
            alct.t = z;
            rlr.a(alct.a, i);
            alct.a.setOnClickListener(new alcs(alct, rlr, i));
            return;
        }
        this.a.a(adl.a);
    }
}
