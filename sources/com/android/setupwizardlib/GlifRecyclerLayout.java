package com.android.setupwizardlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifRecyclerLayout extends GlifLayout {
    public bec a;

    public GlifRecyclerLayout(Context context) {
        this(context, 0, 0);
    }

    private final void a(AttributeSet attributeSet, int i) {
        bec bec = this.a;
        Context context = bec.a.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bdg.o, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            bdp bdp = new bdp((bdk) new bdq(context).a(resourceId));
            bdp.a(obtainStyledAttributes.getBoolean(4, false));
            bec.a(bdp);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize == -1) {
            bec.a(obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0));
        } else {
            bec.a(dimensionPixelSize, 0);
        }
        obtainStyledAttributes.recycle();
        a(bec.class, (bea) this.a);
        bed bed = (bed) a(bed.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.findViewById(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View c(int r2) {
        /*
            r1 = this;
            bec r0 = r1.a
            android.view.View r0 = r0.c
            if (r0 == 0) goto L_0x000e
            android.view.View r0 = r0.findViewById(r2)
            if (r0 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            android.view.View r2 = super.findViewById(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.setupwizardlib.GlifRecyclerLayout.c(int):android.view.View");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bec bec = this.a;
        if (bec.d == null) {
            bec.a();
        }
    }

    public GlifRecyclerLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifRecyclerLayout(Context context, int i, int i2) {
        super(context, i, i2);
        a((AttributeSet) null, 0);
    }

    public GlifRecyclerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    public GlifRecyclerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.suw_glif_recycler_template;
        }
        return super.a(layoutInflater, i);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.suw_recycler_view;
        }
        return super.a(i);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        View findViewById = findViewById(R.id.suw_recycler_view);
        if (findViewById instanceof RecyclerView) {
            this.a = new bec(this, (RecyclerView) findViewById);
            return;
        }
        throw new IllegalStateException("GlifRecyclerLayout should use a template with recycler view");
    }
}
