package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HeaderRecyclerView extends RecyclerView {
    public View a;
    private int b;

    public HeaderRecyclerView(Context context) {
        super(context);
        a((AttributeSet) null, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bdg.i, i, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.a != null) {
            i = 1;
        } else {
            i = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public final void setAdapter(acg acg) {
        if (!(this.a == null || acg == null)) {
            ben ben = new ben(acg);
            ben.a = this.a;
            acg = ben;
        }
        super.setAdapter(acg);
    }

    public final void setLayoutManager(act act) {
        super.setLayoutManager(act);
        if (act != null && this.a == null && this.b != 0) {
            this.a = LayoutInflater.from(getContext()).inflate(this.b, this, false);
        }
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
