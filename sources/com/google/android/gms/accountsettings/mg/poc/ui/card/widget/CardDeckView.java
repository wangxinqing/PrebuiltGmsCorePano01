package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CardDeckView extends cye {
    public cyg a;
    public cxu b;
    public cxd c;
    public cyf d;
    public cyh e;
    public djk f;
    public agcf g;
    public aqst h;
    public dii i;
    public List j = new ArrayList();

    public CardDeckView(Context context) {
        super(context);
    }

    public final void a() {
        cxu cxu = this.b;
        if (cxu != null) {
            aqst aqst = this.h;
            List list = this.j;
            dii dii = this.i;
            cxu.a(cxu.a(aqst, list));
            cxu.f = dii;
            cxu.as();
            return;
        }
        b();
    }

    public final void b() {
        amrl.a((Object) this.f, (Object) "initialize() needs to be called once before setting up the adapter and calling any setter method.");
        amrl.a((Object) this.g, (Object) "initialize() needs to be called once before setting up the adapter and calling any setter method.");
        Context context = getContext();
        aqst aqst = this.h;
        List list = this.j;
        cxu cxu = new cxu(context, cxu.a(aqst, list), new cxb(this), new cxc(this), this.f, this.g, this.i);
        this.b = cxu;
        cxu.a(this.d, this.e);
        setAdapter(this.b);
    }

    public CardDeckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
