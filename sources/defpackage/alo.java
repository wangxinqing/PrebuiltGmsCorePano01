package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class alo extends FrameLayout {
    private float a;
    private float b;
    private float c;
    private int d;
    private Interpolator e;
    private float f;
    public ViewGroup h;
    public final List i;
    public ArrayList j;
    public int k;
    public List l;
    public int m;
    public int n;
    public final akj o;

    public alo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pickerStyle);
    }

    private final void a(View view, boolean z, float f2, Interpolator interpolator) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(f2);
        } else {
            view.animate().alpha(f2).setDuration((long) this.d).setInterpolator(interpolator).start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        boolean z;
        VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i2);
        int a2 = verticalGridView.a();
        for (int i3 = 0; i3 < verticalGridView.getAdapter().a(); i3++) {
            View b2 = verticalGridView.getLayoutManager().b(i3);
            if (b2 != null) {
                if (a2 == i3) {
                    z = true;
                } else {
                    z = false;
                }
                a(b2, z, i2, true);
            }
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3 = this.k;
        if (i3 < 0 || i3 >= this.i.size()) {
            return false;
        }
        return ((VerticalGridView) this.i.get(i3)).requestFocus(i2, rect);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (((VerticalGridView) this.i.get(i2)).hasFocus()) {
                if (this.k != i2) {
                    this.k = i2;
                    for (int i3 = 0; i3 < this.i.size(); i3++) {
                        b(i3);
                    }
                }
                VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i2);
                if (hasFocus() && !verticalGridView.hasFocus()) {
                    verticalGridView.requestFocus();
                }
            }
        }
    }

    public final void setActivated(boolean z) {
        int i2;
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean hasFocus = hasFocus();
        int i3 = this.k;
        setDescendantFocusability(131072);
        if (z) {
            i2 = 0;
        } else {
            if (hasFocus && isFocusable()) {
                requestFocus();
            }
            i2 = 0;
        }
        while (i2 < a()) {
            ((VerticalGridView) this.i.get(i2)).setFocusable(z);
            i2++;
        }
        for (int i4 = 0; i4 < a(); i4++) {
            a((VerticalGridView) this.i.get(i4));
        }
        boolean isActivated = isActivated();
        for (int i5 = 0; i5 < a(); i5++) {
            VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i5);
            for (int i6 = 0; i6 < verticalGridView.getChildCount(); i6++) {
                verticalGridView.getChildAt(i6).setFocusable(isActivated);
            }
        }
        if (z && hasFocus && i3 >= 0) {
            ((VerticalGridView) this.i.get(i3)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public alo(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new ArrayList();
        this.f = 3.0f;
        this.k = 0;
        this.l = new ArrayList();
        this.o = new all(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.f, i2, 0);
        qb.a(this, context, ait.f, attributeSet, obtainStyledAttributes, i2, 0);
        this.m = obtainStyledAttributes.getResourceId(0, R.layout.lb_picker_item);
        this.n = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.b = 1.0f;
        this.a = 1.0f;
        this.c = 0.5f;
        this.d = 200;
        this.e = new DecelerateInterpolator(2.5f);
        this.h = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.lb_picker, this, true)).findViewById(R.id.picker);
    }

    public final int a() {
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final alp a(int i2) {
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            return (alp) arrayList.get(i2);
        }
        return null;
    }

    public void a(int i2, int i3) {
        alp alp = (alp) this.j.get(i2);
        if (alp.a != i3) {
            alp.a = i3;
        }
    }

    public final void a(int i2, alp alp) {
        this.j.set(i2, alp);
        VerticalGridView verticalGridView = (VerticalGridView) this.i.get(i2);
        alm alm = (alm) verticalGridView.getAdapter();
        if (alm != null) {
            alm.as();
        }
        verticalGridView.a(alp.a - alp.b);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, boolean z, int i2, boolean z2) {
        boolean z3 = true;
        if (i2 != this.k && hasFocus()) {
            z3 = false;
        }
        if (!z) {
            if (!z3) {
                a(view, z2, 0.0f, this.e);
            } else {
                a(view, z2, this.c, this.e);
            }
        } else if (!z3) {
            a(view, z2, this.a, this.e);
        } else {
            a(view, z2, this.b, this.e);
        }
    }

    public final void a(VerticalGridView verticalGridView) {
        float f2;
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        if (isActivated()) {
            f2 = this.f;
        } else {
            f2 = 1.0f;
        }
        layoutParams.height = (int) ((((float) getContext().getResources().getDimensionPixelSize(R.dimen.picker_item_height)) * f2) + (((float) verticalGridView.a.F) * (f2 - 4.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }
}
