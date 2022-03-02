package com.google.android.setupdesign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifListLayout extends GlifLayout {
    private aliw a;

    public GlifListLayout(Context context) {
        this(context, 0, 0);
    }

    private final void b(AttributeSet attributeSet, int i) {
        aliw aliw = new aliw(this, attributeSet, i);
        this.a = aliw;
        a(aliw.class, (alhi) aliw);
        a();
        new alix((aljc) a(aljc.class));
    }

    /* access modifiers changed from: protected */
    public final View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_list_template;
        }
        return super.a(layoutInflater, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.b();
    }

    public GlifListLayout(Context context, int i) {
        this(context, i, 0);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup a(int i) {
        if (i == 0) {
            i = 16908298;
        }
        return super.a(i);
    }

    public GlifListLayout(Context context, int i, int i2) {
        super(context, i, i2);
        b((AttributeSet) null, 0);
    }

    public final ListView a() {
        return this.a.a();
    }

    public GlifListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 0);
    }

    public GlifListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i);
    }
}
