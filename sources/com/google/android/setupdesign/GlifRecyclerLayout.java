package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifRecyclerLayout extends GlifLayout {
    public alja a;

    public GlifRecyclerLayout(Context context) {
        this(context, 0, 0);
    }

    private final void b(AttributeSet attributeSet, int i) {
        boolean z;
        alja alja = this.a;
        Context context = alja.a.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alhx.o, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            alih alih = (alih) new alio(context).a(resourceId);
            TemplateLayout templateLayout = alja.a;
            if (templateLayout instanceof GlifLayout) {
                z = ((GlifLayout) templateLayout).g;
            } else {
                z = false;
            }
            alin alin = new alin(alih, z);
            alin.a(obtainStyledAttributes.getBoolean(4, false));
            alja.b.setAdapter(alin);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize == -1) {
            alja.a(obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0));
        } else {
            alja.a(dimensionPixelSize, 0);
        }
        obtainStyledAttributes.recycle();
        a(alja.class, (alhi) this.a);
        aljc aljc = (aljc) a(aljc.class);
    }

    /* access modifiers changed from: protected */
    public final View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_recycler_template;
        }
        return super.a(layoutInflater, i);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        View findViewById = findViewById(R.id.sud_recycler_view);
        if (findViewById instanceof RecyclerView) {
            this.a = new alja(this, (RecyclerView) findViewById);
            return;
        }
        throw new IllegalStateException("GlifRecyclerLayout should use a template with recycler view");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        alja alja = this.a;
        if (alja.e == null) {
            alja.a();
        }
    }

    public GlifRecyclerLayout(Context context, int i) {
        this(context, i, 0);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.sud_recycler_view;
        }
        return super.a(i);
    }

    public GlifRecyclerLayout(Context context, int i, int i2) {
        super(context, i, i2);
        b((AttributeSet) null, 0);
    }

    public GlifRecyclerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 0);
    }

    public GlifRecyclerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.findViewById(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View b(int r2) {
        /*
            r1 = this;
            alja r0 = r1.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.GlifRecyclerLayout.b(int):android.view.View");
    }
}
