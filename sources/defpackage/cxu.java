package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cxu extends czi {
    public final cxd a;
    public final agcf e;
    public dii f;

    public cxu(Context context, List list, cyg cyg, cxd cxd, djk djk, agcf agcf, dii dii) {
        super(context, list, cyg, djk);
        this.a = cxd;
        this.e = agcf;
        this.f = dii;
    }

    public static List a(aqst aqst, List list) {
        ArrayList arrayList = new ArrayList();
        if (aqst != null) {
            arrayList.add(new cxm(aqst));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqqh aqqh = (aqqh) it.next();
            int i = aqqh.a;
            if (i == 1) {
                arrayList.add(new cxq(aqqh));
            } else if (i == 2) {
                arrayList.add(new cxg(aqqh));
            } else if (i == 3) {
                arrayList.add(new cxf(aqqh));
            }
        }
        return arrayList;
    }

    public static final void a(View view, int i) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.as_card_deck_vertical_padding);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (i == 1) {
            marginLayoutParams.topMargin = dimensionPixelSize;
        } else {
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void a(View view, int i, int i2) {
        if (i > i2) {
            int i3 = (i - i2) / 2;
            view.setPadding(i3, view.getPaddingTop(), i3, view.getPaddingBottom());
        }
    }

    public final int a(int i) {
        int a2 = ((cze) this.g.get(i)).a();
        if (a2 == 3 || a2 == 4 || a2 == 2 || a2 == 8) {
            return a2 - 1;
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.j);
        if (i == 2) {
            return new cxt(this, from.inflate(R.layout.as_card, viewGroup, false));
        }
        if (i == 3) {
            return new cxl(this, from.inflate(R.layout.as_prompt_carousel, viewGroup, false));
        }
        if (i == 1) {
            return new cxp(this, from.inflate(R.layout.as_screen_intro, viewGroup, false));
        }
        if (i == 7) {
            return new cxe(this, from.inflate(R.layout.as_clp_card, viewGroup, false));
        }
        return super.a(viewGroup);
    }
}
