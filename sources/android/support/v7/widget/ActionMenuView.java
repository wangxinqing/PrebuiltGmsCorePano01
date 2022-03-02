package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionMenuView extends abf implements ws, xj {
    public wt a;
    public boolean b;
    public yh c;
    public wr d;
    public aew e;
    private Context i;
    private int j;
    private xg k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static final yk b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return d();
        }
        yk ykVar = layoutParams instanceof yk ? new yk((yk) layoutParams) : new yk(layoutParams);
        if (ykVar.h <= 0) {
            ykVar.h = 16;
        }
        return ykVar;
    }

    public static final yk d() {
        yk ykVar = new yk();
        ykVar.h = 16;
        return ykVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ abe a(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public final void a(wt wtVar) {
        this.a = wtVar;
    }

    public final void a(xg xgVar, wr wrVar) {
        this.k = xgVar;
        this.d = wrVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ abe c() {
        return d();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof yk;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.a(false);
            if (this.c.e()) {
                this.c.d();
                this.c.c();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.l) {
            int childCount = getChildCount();
            int i9 = (i5 - i3) / 2;
            int i10 = this.h;
            int i11 = i4 - i2;
            int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
            boolean a2 = afs.a(this);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    yk ykVar = (yk) childAt.getLayoutParams();
                    if (ykVar.a) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        if (b(i14)) {
                            measuredWidth += i10;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a2) {
                            i7 = getPaddingLeft() + ykVar.leftMargin;
                            i8 = i7 + measuredWidth;
                        } else {
                            i8 = (getWidth() - getPaddingRight()) - ykVar.rightMargin;
                            i7 = i8 - measuredWidth;
                        }
                        int i15 = i9 - (measuredHeight / 2);
                        childAt.layout(i7, i15, i8, measuredHeight + i15);
                        paddingRight -= measuredWidth;
                        i12 = 1;
                    } else {
                        paddingRight -= (childAt.getMeasuredWidth() + ykVar.leftMargin) + ykVar.rightMargin;
                        b(i14);
                        i13++;
                    }
                }
            }
            if (childCount == 1 && i12 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i16 = (i11 / 2) - (measuredWidth2 / 2);
                int i17 = i9 - (measuredHeight2 / 2);
                childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
                return;
            }
            int i18 = i13 - (i12 ^ 1);
            if (i18 > 0) {
                i6 = paddingRight / i18;
            } else {
                i6 = 0;
            }
            int max = Math.max(0, i6);
            if (a2) {
                int width = getWidth() - getPaddingRight();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt3 = getChildAt(i19);
                    yk ykVar2 = (yk) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8 && !ykVar2.a) {
                        int i20 = width - ykVar2.rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i21 = i9 - (measuredHeight3 / 2);
                        childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                        width = i20 - ((measuredWidth3 + ykVar2.leftMargin) + max);
                    }
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt4 = getChildAt(i22);
                yk ykVar3 = (yk) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !ykVar3.a) {
                    int i23 = paddingLeft + ykVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i24 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                    paddingLeft = i23 + measuredWidth4 + ykVar3.rightMargin + max;
                }
            }
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int i12;
        ActionMenuItemView actionMenuItemView;
        boolean z5;
        int i13;
        boolean z6;
        wt wtVar;
        boolean z7 = this.l;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        if (z7 != z) {
            this.m = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.l || (wtVar = this.a) == null || size == this.m)) {
            this.m = size;
            wtVar.b(true);
        }
        int childCount = getChildCount();
        if (!this.l) {
            int i14 = i3;
            i4 = 0;
        } else if (childCount > 0) {
            int mode = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i3);
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
            int i15 = size2 - (paddingLeft + paddingRight);
            int i16 = this.n;
            int i17 = i15 / i16;
            int i18 = i15 % i16;
            if (i17 == 0) {
                setMeasuredDimension(i15, 0);
                return;
            }
            int i19 = i16 + (i18 / i17);
            int childCount2 = getChildCount();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z8 = false;
            long j2 = 0;
            int i24 = 0;
            while (i23 < childCount2) {
                View childAt = getChildAt(i23);
                int i25 = size3;
                if (childAt.getVisibility() == 8) {
                    i8 = mode;
                    i9 = i15;
                    i10 = paddingTop;
                } else {
                    boolean z9 = childAt instanceof ActionMenuItemView;
                    int i26 = i21 + 1;
                    if (z9) {
                        int i27 = this.o;
                        i11 = i26;
                        z4 = false;
                        childAt.setPadding(i27, 0, i27, 0);
                    } else {
                        i11 = i26;
                        z4 = false;
                    }
                    yk ykVar = (yk) childAt.getLayoutParams();
                    ykVar.f = z4;
                    ykVar.c = z4 ? 1 : 0;
                    ykVar.b = z4;
                    ykVar.d = z4;
                    ykVar.leftMargin = z4;
                    ykVar.rightMargin = z4;
                    ykVar.e = z9 && ((ActionMenuItemView) childAt).c();
                    if (!ykVar.a) {
                        i12 = i17;
                    } else {
                        i12 = 1;
                    }
                    i9 = i15;
                    yk ykVar2 = (yk) childAt.getLayoutParams();
                    i8 = mode;
                    i10 = paddingTop;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z9) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView == null || !actionMenuItemView.c()) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (i12 <= 0) {
                        i13 = 0;
                    } else if (z5 && i12 < 2) {
                        i13 = 0;
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i13 = measuredWidth / i19;
                        if (measuredWidth % i19 != 0) {
                            i13++;
                        }
                        if (z5 && i13 < 2) {
                            i13 = 2;
                        }
                    }
                    if (ykVar2.a) {
                        z6 = false;
                    } else {
                        z6 = z5;
                    }
                    ykVar2.d = z6;
                    ykVar2.b = i13;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, JGCastService.FLAG_PRIVATE_DISPLAY), makeMeasureSpec);
                    i20 = Math.max(i20, i13);
                    if (ykVar.d) {
                        i24++;
                    }
                    z8 |= ykVar.a;
                    i17 -= i13;
                    i22 = Math.max(i22, childAt.getMeasuredHeight());
                    if (i13 == 1) {
                        j2 |= (long) (1 << i23);
                    }
                    i21 = i11;
                }
                i23++;
                size3 = i25;
                paddingTop = i10;
                i15 = i9;
                mode = i8;
            }
            int i28 = mode;
            int i29 = i15;
            int i30 = size3;
            boolean z10 = !z8 ? false : i21 == 2;
            boolean z11 = false;
            while (true) {
                if (i24 > 0) {
                    if (i17 <= 0) {
                        break;
                    }
                    int i31 = Integer.MAX_VALUE;
                    int i32 = 0;
                    long j3 = 0;
                    for (int i33 = 0; i33 < childCount2; i33++) {
                        yk ykVar3 = (yk) getChildAt(i33).getLayoutParams();
                        if (ykVar3.d) {
                            int i34 = ykVar3.b;
                            if (i34 < i31) {
                                j3 = 1 << i33;
                                i31 = i34;
                                i32 = 1;
                            } else if (i34 == i31) {
                                i32++;
                                j3 |= 1 << i33;
                            }
                        }
                    }
                    j2 |= j3;
                    if (i32 > i17) {
                        break;
                    }
                    int i35 = i31 + 1;
                    int i36 = 0;
                    while (i36 < childCount2) {
                        View childAt2 = getChildAt(i36);
                        yk ykVar4 = (yk) childAt2.getLayoutParams();
                        int i37 = i22;
                        long j4 = (long) (1 << i36);
                        if ((j3 & j4) == 0) {
                            if (ykVar4.b == i35) {
                                j2 |= j4;
                            }
                            z3 = z10;
                        } else {
                            if (!z10) {
                                z3 = z10;
                            } else if (!ykVar4.e || i17 != 1) {
                                z3 = z10;
                            } else {
                                int i38 = this.o;
                                z3 = z10;
                                childAt2.setPadding(i38 + i19, 0, i38, 0);
                            }
                            ykVar4.b++;
                            ykVar4.f = true;
                            i17--;
                        }
                        i36++;
                        i22 = i37;
                        z10 = z3;
                    }
                    boolean z12 = z10;
                    int i39 = i22;
                    z11 = true;
                } else {
                    i5 = i22;
                    break;
                }
            }
            i5 = i22;
            if (z8) {
                z2 = false;
            } else {
                z2 = i21 == 1;
            }
            if (i17 > 0 && j2 != 0 && (i17 < i21 - 1 || z2 || i20 > 1)) {
                float bitCount = (float) Long.bitCount(j2);
                if (!z2) {
                    if ((j2 & 1) != 0 && !((yk) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 8.0f;
                    }
                    int i40 = childCount2 - 1;
                    if ((j2 & ((long) (1 << i40))) != 0 && !((yk) getChildAt(i40).getLayoutParams()).e) {
                        bitCount -= 8.0f;
                    }
                }
                if (bitCount > 0.0f) {
                    i7 = (int) (((float) (i17 * i19)) / bitCount);
                } else {
                    i7 = 0;
                }
                boolean z13 = z11;
                for (int i41 = 0; i41 < childCount2; i41++) {
                    if ((j2 & ((long) (1 << i41))) != 0) {
                        View childAt3 = getChildAt(i41);
                        yk ykVar5 = (yk) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            ykVar5.c = i7;
                            ykVar5.f = true;
                            if (i41 == 0 && !ykVar5.e) {
                                ykVar5.leftMargin = (-i7) / 2;
                            }
                            z13 = true;
                        } else if (ykVar5.a) {
                            ykVar5.c = i7;
                            ykVar5.f = true;
                            ykVar5.rightMargin = (-i7) / 2;
                            z13 = true;
                        } else {
                            if (i41 != 0) {
                                ykVar5.leftMargin = i7 / 2;
                            }
                            if (i41 != childCount2 - 1) {
                                ykVar5.rightMargin = i7 / 2;
                            }
                        }
                    }
                }
                z11 = z13;
            }
            if (z11) {
                for (int i42 = 0; i42 < childCount2; i42++) {
                    View childAt4 = getChildAt(i42);
                    yk ykVar6 = (yk) childAt4.getLayoutParams();
                    if (ykVar6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((ykVar6.b * i19) + ykVar6.c, JGCastService.FLAG_PRIVATE_DISPLAY), childMeasureSpec);
                    }
                }
            }
            if (i28 != 1073741824) {
                i6 = i5;
            } else {
                i6 = i30;
            }
            setMeasuredDimension(i29, i6);
            return;
        } else {
            int i43 = i3;
            i4 = 0;
        }
        while (i4 < childCount) {
            yk ykVar7 = (yk) getChildAt(i4).getLayoutParams();
            ykVar7.rightMargin = 0;
            ykVar7.leftMargin = 0;
            i4++;
        }
        super.onMeasure(i2, i3);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    public final Menu a() {
        if (this.a == null) {
            Context context = getContext();
            wt wtVar = new wt(context);
            this.a = wtVar;
            wtVar.a((wr) new yl(this));
            yh yhVar = new yh(context);
            this.c = yhVar;
            yhVar.i();
            yh yhVar2 = this.c;
            xg xgVar = this.k;
            if (xgVar == null) {
                xgVar = new yj();
            }
            yhVar2.e = xgVar;
            this.a.a((xh) this.c, this.i);
            this.c.a(this);
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* renamed from: a */
    public final yk generateLayoutParams(AttributeSet attributeSet) {
        return new yk(getContext(), attributeSet);
    }

    public final void b() {
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.g();
        }
    }

    public final void a(int i2) {
        if (this.j != i2) {
            this.j = i2;
            if (i2 != 0) {
                this.i = new ContextThemeWrapper(getContext(), i2);
            } else {
                this.i = getContext();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i2) {
        boolean z = false;
        if (i2 != 0) {
            View childAt = getChildAt(i2 - 1);
            View childAt2 = getChildAt(i2);
            if (i2 < getChildCount() && (childAt instanceof yi)) {
                z = ((yi) childAt).e();
            }
            if (i2 > 0 && (childAt2 instanceof yi)) {
                return ((yi) childAt2).d() | z;
            }
        }
        return z;
    }

    public final void a(yh yhVar) {
        this.c = yhVar;
        yhVar.a(this);
    }

    public final boolean a(ww wwVar) {
        return this.a.a((MenuItem) wwVar, 0);
    }
}
