package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FloatingActionButton extends ajyg implements ajwi, ajzw, ahi {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final yx m;
    private final ajwj n;
    private ajxa o;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BaseBehavior extends ahj {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private final boolean a(View view, FloatingActionButton floatingActionButton) {
            ahm ahm = (ahm) floatingActionButton.getLayoutParams();
            if (this.b && ahm.f == view.getId() && floatingActionButton.d == 0) {
                return true;
            }
            return false;
        }

        private final boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ahm) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.c();
                return true;
            }
            floatingActionButton.d();
            return true;
        }

        private static boolean d(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ahm) {
                return ((ahm) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        public final void a(ahm ahm) {
            if (ahm.h == 0) {
                ahm.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajxe.c);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ajxk.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                floatingActionButton.c();
                return true;
            }
            floatingActionButton.d();
            return true;
        }

        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List b2 = coordinatorLayout.b((View) floatingActionButton);
            int size = b2.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) b2.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    if (d(view2) && b(view2, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.b(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            ahm ahm = (ahm) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ahm.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= ahm.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ahm.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ahm.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                qb.g(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            qb.h(floatingActionButton, i2);
            return true;
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            } else if (!d(view2)) {
                return false;
            } else {
                b(view2, floatingActionButton);
                return false;
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private final int a(int i2) {
        int i3 = this.j;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? a(1) : a(0);
        }
        if (i2 != 1) {
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
        }
        return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
    }

    private final ajxa e() {
        if (this.o == null) {
            int i2 = Build.VERSION.SDK_INT;
            this.o = new ajxc(this, new ajwp(this));
        }
        return this.o;
    }

    public final int b() {
        return a(this.i);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        ajxa e2 = e();
        if (e2.B.getVisibility() != 0) {
            if (e2.u != 2) {
                return;
            }
        } else if (e2.u == 1) {
            return;
        }
        Animator animator = e2.o;
        if (animator != null) {
            animator.cancel();
        }
        if (e2.i()) {
            ajrv ajrv = e2.q;
            if (ajrv == null) {
                if (e2.n == null) {
                    e2.n = ajrv.a(e2.B.getContext(), R.animator.design_fab_hide_motion_spec);
                }
                ajrv = e2.n;
                ot.a((Object) ajrv);
            }
            AnimatorSet a2 = e2.a(ajrv, 0.0f, 0.0f, 0.0f);
            a2.addListener(new ajwq(e2));
            a2.start();
            return;
        }
        e2.B.a(4, false);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        ajxa e2 = e();
        if (e2.B.getVisibility() == 0) {
            if (e2.u != 1) {
                return;
            }
        } else if (e2.u == 2) {
            return;
        }
        Animator animator = e2.o;
        if (animator != null) {
            animator.cancel();
        }
        if (e2.i()) {
            if (e2.B.getVisibility() != 0) {
                e2.B.setAlpha(0.0f);
                e2.B.setScaleY(0.0f);
                e2.B.setScaleX(0.0f);
                e2.a(0.0f);
            }
            ajrv ajrv = e2.p;
            if (ajrv == null) {
                if (e2.m == null) {
                    e2.m = ajrv.a(e2.B.getContext(), R.animator.design_fab_show_motion_spec);
                }
                ajrv = e2.m;
                ot.a((Object) ajrv);
            }
            AnimatorSet a2 = e2.a(ajrv, 1.0f, 1.0f, 1.0f);
            a2.addListener(new ajwr(e2));
            a2.start();
            return;
        }
        e2.B.a(0, false);
        e2.B.setAlpha(1.0f);
        e2.B.setScaleY(1.0f);
        e2.B.setScaleX(1.0f);
        e2.a(1.0f);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e().a(getDrawableState());
    }

    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        e().d();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ajxa e2 = e();
        ajzf ajzf = e2.c;
        if (ajzf != null) {
            ajzg.a((View) e2.B, ajzf);
        }
        if (e2.g()) {
            ViewTreeObserver viewTreeObserver = e2.B.getViewTreeObserver();
            if (e2.C == null) {
                e2.C = new ajwu(e2);
            }
            viewTreeObserver.addOnPreDrawListener(e2.C);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ajxa e2 = e();
        ViewTreeObserver viewTreeObserver = e2.B.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = e2.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            e2.C = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int b2 = b();
        this.a = (b2 - this.k) / 2;
        e().e();
        int min = Math.min(a(b2, i2), a(b2, i3));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.b);
        ajwj ajwj = this.n;
        Bundle bundle = (Bundle) extendableSavedState.c.get("expandableWidgetHelper");
        ot.a((Object) bundle);
        ajwj.b = bundle.getBoolean("expanded", false);
        ajwj.c = bundle.getInt("expandedComponentIdHint", 0);
        if (ajwj.b) {
            ViewParent parent = ajwj.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).a(ajwj.a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        ou ouVar = extendableSavedState.c;
        ajwj ajwj = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", ajwj.b);
        bundle.putInt("expandedComponentIdHint", ajwj.c);
        ouVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            if (qb.A(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            ajxa e2 = e();
            ajzf ajzf = e2.c;
            if (ajzf != null) {
                ajzf.setTintList(colorStateList);
            }
            ajwl ajwl = e2.e;
            if (ajwl != null) {
                ajwl.a(colorStateList);
            }
        }
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            ajzf ajzf = e().c;
            if (ajzf != null) {
                ajzf.setTintMode(mode);
            }
        }
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        e().b(f2);
    }

    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            e().b();
        }
    }

    public final void setImageResource(int i2) {
        this.m.a(i2);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ma.e(drawable);
        }
    }

    public final void setScaleX(float f2) {
        super.setScaleX(f2);
        e();
    }

    public final void setScaleY(float f2) {
        super.setScaleY(f2);
        e();
    }

    public final void setTranslationX(float f2) {
        super.setTranslationX(f2);
        e();
    }

    public final void setTranslationY(float f2) {
        super.setTranslationY(f2);
        e();
    }

    public final void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        e();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(akdg.a(context, attributeSet, i2, 2132018788), attributeSet, i2);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a2 = ajya.a(context2, attributeSet, ajxe.b, i2, 2132018788, new int[0]);
        this.e = ajym.a(context2, a2, 1);
        this.f = ajyf.a(a2.getInt(2, -1), (PorterDuff.Mode) null);
        this.g = ajym.a(context2, a2, 12);
        this.i = a2.getInt(7, -1);
        this.j = a2.getDimensionPixelSize(6, 0);
        this.h = a2.getDimensionPixelSize(3, 0);
        float dimension = a2.getDimension(4, 0.0f);
        float dimension2 = a2.getDimension(9, 0.0f);
        float dimension3 = a2.getDimension(11, 0.0f);
        this.b = a2.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.k = a2.getDimensionPixelSize(10, 0);
        ajrv a3 = ajrv.a(context2, a2, 15);
        ajrv a4 = ajrv.a(context2, a2, 8);
        ajzl a5 = ajzl.a(context2, attributeSet, i2, 2132018788, ajzl.a).a();
        boolean z = a2.getBoolean(5, false);
        setEnabled(a2.getBoolean(0, true));
        a2.recycle();
        yx yxVar = new yx(this);
        this.m = yxVar;
        yxVar.a(attributeSet, i2);
        this.n = new ajwj(this);
        e().a(a5);
        e().a(this.e, this.f, this.g, this.h);
        e().l = dimensionPixelSize;
        ajxa e2 = e();
        if (e2.i != dimension) {
            e2.i = dimension;
            e2.a(dimension, e2.j, e2.k);
        }
        ajxa e3 = e();
        if (e3.j != dimension2) {
            e3.j = dimension2;
            e3.a(e3.i, dimension2, e3.k);
        }
        ajxa e4 = e();
        if (e4.k != dimension3) {
            e4.k = dimension3;
            e4.a(e4.i, e4.j, dimension3);
        }
        ajxa e5 = e();
        int i3 = this.k;
        if (e5.t != i3) {
            e5.t = i3;
            e5.b();
        }
        e().p = a3;
        e().q = a4;
        e().g = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public final ahj a() {
        return new Behavior();
    }

    public final void a(ajzl ajzl) {
        e().a(ajzl);
    }
}
