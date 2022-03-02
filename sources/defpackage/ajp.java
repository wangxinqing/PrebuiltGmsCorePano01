package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: ajp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajp extends RecyclerView {
    public final akb a;
    adc b;
    final int c = 4;
    private final boolean d = true;
    private int e;

    public ajp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        akb akb = new akb(this);
        this.a = akb;
        setLayoutManager(akb);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((aek) getItemAnimator()).i = false;
        super.setRecyclerListener(new ajo(this));
    }

    public final int a() {
        return this.a.m;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return isChildrenDrawingOrderEnabled();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View focusSearch(int i) {
        if (isFocused()) {
            akb akb = this.a;
            View b2 = akb.b(akb.m);
            if (b2 != null) {
                return focusSearch(b2, i);
            }
        }
        return super.focusSearch(i);
    }

    public final int getChildDrawingOrder(int i, int i2) {
        int indexOfChild;
        akb akb = this.a;
        View b2 = akb.b(akb.m);
        if (b2 == null || i2 < (indexOfChild = indexOfChild(b2))) {
            return i2;
        }
        return i2 < i + -1 ? ((indexOfChild + i) - 1) - i2 : indexOfChild;
    }

    public final boolean hasOverlappingRendering() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        akb akb = this.a;
        if (z) {
            int i2 = akb.m;
            while (true) {
                View b2 = akb.b(i2);
                if (b2 == null) {
                    return;
                }
                if (b2.getVisibility() == 0 && b2.hasFocusable()) {
                    b2.requestFocus();
                    return;
                }
                i2++;
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if ((this.e & 1) != 1) {
            akb akb = this.a;
            View b2 = akb.b(akb.m);
            if (b2 != null) {
                return b2.requestFocus(i, rect);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r7) {
        /*
            r6 = this;
            akb r0 = r6.a
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000d
            if (r7 != r3) goto L_0x0012
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0013
        L_0x000d:
            if (r7 != r3) goto L_0x0012
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int r4 = r0.k
            r5 = 786432(0xc0000, float:1.102026E-39)
            r5 = r5 & r4
            if (r5 == r1) goto L_0x002e
            r5 = -786433(0xfffffffffff3ffff, float:NaN)
            r4 = r4 & r5
            r1 = r1 | r4
            r0.k = r1
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.k = r1
            alj r0 = r0.L
            ali r0 = r0.c
            if (r7 != r3) goto L_0x002c
            r2 = 1
        L_0x002c:
            r0.i = r2
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajp.onRtlPropertiesChanged(int):void");
    }

    public final void removeView(View view) {
        boolean z = false;
        if (view.hasFocus() && isFocusable()) {
            z = true;
        }
        if (z) {
            this.e |= 1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.e ^= -2;
        }
    }

    public final void removeViewAt(int i) {
        boolean hasFocus = getChildAt(i).hasFocus();
        if (hasFocus) {
            this.e |= 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (hasFocus) {
            this.e ^= -2;
        }
    }

    public final void scrollToPosition(int i) {
        if (this.a.n()) {
            this.a.l(i);
        } else {
            super.scrollToPosition(i);
        }
    }

    public final void setRecyclerListener(adc adc) {
        this.b = adc;
    }

    public final void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null, Integer.MIN_VALUE);
    }

    public final void smoothScrollToPosition(int i) {
        if (this.a.n()) {
            this.a.l(i);
        } else {
            super.smoothScrollToPosition(i);
        }
    }

    public final void a(int i) {
        this.a.b(i, false);
    }

    public final void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.c);
        boolean z = obtainStyledAttributes.getBoolean(4, false);
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        akb akb = this.a;
        int i5 = akb.k & -6145;
        if (!z) {
            i = 0;
        } else {
            i = 2048;
        }
        int i6 = i | i5;
        if (!z2) {
            i2 = 0;
        } else {
            i2 = FragmentTransaction.TRANSIT_ENTER_MASK;
        }
        akb.k = i6 | i2;
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        boolean z4 = obtainStyledAttributes.getBoolean(5, true);
        akb akb2 = this.a;
        int i7 = akb2.k & -24577;
        if (!z3) {
            i3 = 0;
        } else {
            i3 = FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        int i8 = i3 | i7;
        if (!z4) {
            i4 = 0;
        } else {
            i4 = 16384;
        }
        akb2.k = i8 | i4;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (akb2.d == 1) {
            akb2.F = dimensionPixelSize;
            akb2.G = dimensionPixelSize;
        } else {
            akb2.F = dimensionPixelSize;
            akb2.H = dimensionPixelSize;
        }
        akb akb3 = this.a;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (akb3.d == 0) {
            akb3.G = dimensionPixelSize2;
        } else {
            akb3.H = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.a.I = obtainStyledAttributes.getInt(0, 0);
            requestLayout();
        }
        obtainStyledAttributes.recycle();
    }
}
