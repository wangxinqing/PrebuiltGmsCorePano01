package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NavigationMenuView extends RecyclerView implements xj {
    public NavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(wt wtVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new abk(1));
    }
}
