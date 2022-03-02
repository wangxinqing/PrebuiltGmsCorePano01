package com.google.android.pano.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FrameLayoutWithShadows extends FrameLayout {
    public int a;
    public int b;
    public float c;
    public ArrayList d;
    private Rect e;
    private RectF f;

    public FrameLayoutWithShadows(Context context) {
        this(context, (AttributeSet) null);
    }

    public static FrameLayoutWithShadows a(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof FrameLayoutWithShadows)) {
            parent = parent.getParent();
        }
        return (FrameLayoutWithShadows) parent;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (getWindowToken() != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof akft) {
                    akft akft = (akft) childAt;
                    View view2 = akft.a;
                    if (this != a(view2)) {
                        view2.setTag(R.id.ShadowView, (Object) null);
                        akft.a = null;
                        removeView(akft);
                        if (this.d.size() < 12) {
                            this.d.add(akft);
                        }
                    }
                }
            }
        }
        for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
            View childAt2 = getChildAt(childCount2);
            if ((childAt2 instanceof akft) && (view = ((akft) childAt2).a) != null && this == a(view)) {
                ImageView imageView = (ImageView) view;
                Matrix imageMatrix = imageView.getImageMatrix();
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    this.e.set(drawable.getBounds());
                    this.f.set(this.e);
                    imageMatrix.mapRect(this.f);
                    this.f.offset((float) view.getPaddingLeft(), (float) view.getPaddingTop());
                    this.f.intersect((float) view.getPaddingLeft(), (float) view.getPaddingTop(), (float) ((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()), (float) ((view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom()));
                    this.f.left -= (float) childAt2.getPaddingLeft();
                    this.f.top -= (float) childAt2.getPaddingTop();
                    this.f.right += (float) childAt2.getPaddingRight();
                    this.f.bottom += (float) childAt2.getPaddingBottom();
                    this.e.left = (int) (this.f.left + 0.5f);
                    this.e.top = (int) (this.f.top + 0.5f);
                    this.e.right = (int) (this.f.right + 0.5f);
                    this.e.bottom = (int) (this.f.bottom + 0.5f);
                } else {
                    this.e.left = view.getPaddingLeft() - childAt2.getPaddingLeft();
                    this.e.top = view.getPaddingTop() - childAt2.getPaddingTop();
                    this.e.right = view.getWidth() + view.getPaddingRight() + childAt2.getPaddingRight();
                    this.e.bottom = view.getHeight() + view.getPaddingBottom() + childAt2.getPaddingBottom();
                }
                offsetDescendantRectToMyCoords(view, this.e);
                childAt2.layout(this.e.left, this.e.top, this.e.right, this.e.bottom);
            }
        }
    }

    public FrameLayoutWithShadows(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FrameLayoutWithShadows(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new RectF();
        this.c = 1.0f;
        this.d = new ArrayList(12);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akdi.a);
            this.a = obtainStyledAttributes.getResourceId(0, 0);
            this.b = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(float f2) {
        this.c = f2;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof akft) {
                childAt.setAlpha(f2);
            }
        }
    }
}
