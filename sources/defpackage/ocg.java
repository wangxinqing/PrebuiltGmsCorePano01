package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ocg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocg extends LinearLayout implements obm {
    private final List a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ocg(Context context, obg obg, avnj avnj) {
        super(context);
        Context context2 = context;
        avnj avnj2 = avnj;
        setTag(avnj2.b);
        setOrientation(1);
        this.a = new ArrayList(avnj2.f.size());
        aucx aucx = avnj2.f;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            avnl avnl = (avnl) aucx.get(i);
            aucx aucx2 = avnj2.n;
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            linearLayout.addView(oay.b(context2, jlh.a(avnl.c), avnl.f));
            TextView a2 = oay.a(context2, context2.getString(R.string.gh_cuf_rating_selection_prefix), false);
            linearLayout.addView(a2);
            ocf ocf = new ocf(context, obg, avnl, aucx2, a2);
            this.a.add(ocf);
            obg.a(ocf);
            linearLayout.addView(ocf);
            addView(linearLayout);
        }
    }

    public final List aY() {
        ArrayList arrayList = new ArrayList();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ocf ocf = (ocf) list.get(i);
            if (ocf.a) {
                arrayList.add(ocf);
            }
        }
        return arrayList;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ocf ocf = (ocf) list.get(i);
            String d = ocf.d();
            if (d != null) {
                arrayList.add(oaq.a((String) ocf.getTag(), d));
            }
        }
        return arrayList;
    }
}
