package com.google.android.gms.accountsettings.mg.poc.ui.search;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.R;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchItemsListView extends cye {
    public cyg a;
    public czu b;
    public czr c;
    public cyf d;
    public cyh e;
    public djk f;

    public SearchItemsListView(Context context) {
        super(context);
    }

    public final int a() {
        return getResources().getDimensionPixelSize(R.dimen.as_search_list_vertical_item_padding);
    }

    public SearchItemsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addItemDecoration(new czl(a()));
    }

    public final void a(List list, aqrj aqrj, String str) {
        iva.a((Object) this.f);
        czr czr = new czr(getContext(), list, new czs(this), aqrj, new czt(this), str, this.f);
        this.c = czr;
        czr.a(this.d, this.e);
        setAdapter(this.c);
    }
}
