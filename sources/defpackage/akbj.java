package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: akbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbj extends LinearLayout {
    public int a;
    public final Paint b;
    public int c = -1;
    public float d;
    int e = -1;
    int f = -1;
    public ValueAnimator g;
    public int h = -1;
    public int i = -1;
    final /* synthetic */ TabLayout j;
    private final GradientDrawable k;
    private int l = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akbj(TabLayout tabLayout, Context context) {
        super(context);
        this.j = tabLayout;
        setWillNotDraw(false);
        this.b = new Paint();
        this.k = new GradientDrawable();
    }

    private final void a(akbn akbn, RectF rectF) {
        View[] viewArr = {akbn.a, akbn.b, null};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        for (int i4 = 0; i4 < 3; i4++) {
            View view = viewArr[i4];
            if (view != null && view.getVisibility() == 0) {
                i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                z = true;
            }
        }
        int i5 = i2 - i3;
        int a2 = (int) ajyf.a(getContext(), 24);
        if (i5 < a2) {
            i5 = a2;
        }
        int left = (akbn.getLeft() + akbn.getRight()) / 2;
        int i6 = i5 / 2;
        rectF.set((float) (left - i6), 0.0f, (float) (left + i6), 0.0f);
    }

    public final void draw(Canvas canvas) {
        int i2;
        Drawable drawable = this.j.m;
        int i3 = 0;
        if (drawable != null) {
            i2 = drawable.getIntrinsicHeight();
        } else {
            i2 = 0;
        }
        int i4 = this.a;
        if (i4 >= 0) {
            i2 = i4;
        }
        int i5 = this.j.u;
        if (i5 == 0) {
            i3 = getHeight() - i2;
            i2 = getHeight();
        } else if (i5 == 1) {
            i3 = (getHeight() - i2) / 2;
            i2 = (getHeight() + i2) / 2;
        } else if (i5 != 2) {
            if (i5 != 3) {
                i2 = 0;
            } else {
                i2 = getHeight();
            }
        }
        int i6 = this.e;
        if (i6 >= 0 && this.f > i6) {
            Drawable drawable2 = this.j.m;
            if (drawable2 == null) {
                drawable2 = this.k;
            }
            Drawable mutate = ma.f(drawable2).mutate();
            mutate.setBounds(this.e, i3, this.f, i2);
            if (this.b != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    mutate.setColorFilter(this.b.getColor(), PorterDuff.Mode.SRC_IN);
                } else {
                    ma.a(mutate, this.b.getColor());
                }
            }
            mutate.draw(canvas);
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            a();
        } else {
            a(false, this.c, -1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            TabLayout tabLayout = this.j;
            if (tabLayout.s == 1 || tabLayout.v == 2) {
                int childCount = getChildCount();
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 0) {
                        i4 = Math.max(i4, childAt.getMeasuredWidth());
                    }
                }
                if (i4 > 0) {
                    int a2 = (int) ajyf.a(getContext(), 16);
                    if (i4 * childCount > getMeasuredWidth() - (a2 + a2)) {
                        TabLayout tabLayout2 = this.j;
                        tabLayout2.s = 0;
                        tabLayout2.a(false);
                    } else {
                        boolean z = false;
                        for (int i6 = 0; i6 < childCount; i6++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                            if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i4;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    }
                    super.onMeasure(i2, i3);
                }
            }
        }
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (Build.VERSION.SDK_INT < 23 && this.l != i2) {
            requestLayout();
            this.l = i2;
        }
    }

    public final void a() {
        int i2;
        View childAt = getChildAt(this.c);
        int i3 = -1;
        if (childAt == null) {
            i2 = -1;
        } else if (childAt.getWidth() > 0) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = this.j;
            if (!tabLayout.x && (childAt instanceof akbn)) {
                int i4 = TabLayout.A;
                a((akbn) childAt, tabLayout.c);
                left = (int) this.j.c.left;
                right = (int) this.j.c.right;
            }
            if (this.d <= 0.0f || this.c >= getChildCount() - 1) {
                i3 = left;
                i2 = right;
            } else {
                View childAt2 = getChildAt(this.c + 1);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                TabLayout tabLayout2 = this.j;
                if (!tabLayout2.x && (childAt2 instanceof akbn)) {
                    int i5 = TabLayout.A;
                    a((akbn) childAt2, tabLayout2.c);
                    left2 = (int) this.j.c.left;
                    right2 = (int) this.j.c.right;
                }
                float f2 = this.d;
                float f3 = 1.0f - f2;
                i3 = (int) ((((float) left2) * f2) + (((float) left) * f3));
                i2 = (int) ((f2 * ((float) right2)) + (f3 * ((float) right)));
            }
        } else {
            i2 = -1;
        }
        a(i3, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (i2 != this.e || i3 != this.f) {
            this.e = i2;
            this.f = i3;
            qb.e(this);
        }
    }

    public final void a(boolean z, int i2, int i3) {
        View childAt = getChildAt(i2);
        if (childAt == null) {
            a();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        TabLayout tabLayout = this.j;
        if (!tabLayout.x && (childAt instanceof akbn)) {
            int i4 = TabLayout.A;
            a((akbn) childAt, tabLayout.c);
            left = (int) this.j.c.left;
            right = (int) this.j.c.right;
        }
        int i5 = this.e;
        int i6 = this.f;
        if (i5 != left || i6 != right) {
            if (z) {
                this.h = i5;
                this.i = i6;
            }
            akbh akbh = new akbh(this, left, right);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.g = valueAnimator;
                valueAnimator.setInterpolator(ajrr.b);
                valueAnimator.setDuration((long) i3);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(akbh);
                valueAnimator.addListener(new akbi(this, i2));
                valueAnimator.start();
                return;
            }
            this.g.removeAllUpdateListeners();
            this.g.addUpdateListener(akbh);
        }
    }
}
