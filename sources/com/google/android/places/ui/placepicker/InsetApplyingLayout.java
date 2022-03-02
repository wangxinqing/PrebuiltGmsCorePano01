package com.google.android.places.ui.placepicker;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InsetApplyingLayout extends FrameLayout {
    private final List a = new ArrayList();
    private Rect b;

    public InsetApplyingLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        this.b = new Rect(rect);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aldk) list.get(i)).a(new Rect(this.b));
        }
        return true;
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof aldk) {
            aldk aldk = (aldk) view;
            this.a.add(aldk);
            Rect rect = this.b;
            if (rect != null) {
                aldk.a(new Rect(rect));
            }
        }
    }

    public final void removeView(View view) {
        super.removeView(view);
        if (view instanceof aldk) {
            this.a.remove(view);
        }
    }

    public InsetApplyingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetApplyingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
