package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Toolbar extends ViewGroup {
    private ImageView A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private ColorStateList G;
    private ColorStateList H;
    private boolean I;
    private boolean J;
    private final ArrayList K;
    private final int[] L;
    private aff M;
    private final Runnable N;
    private final aew O;
    public ActionMenuView a;
    public TextView b;
    public Drawable c;
    public CharSequence d;
    public ImageButton e;
    public View f;
    public Context g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public adu o;
    public CharSequence p;
    public CharSequence q;
    public final ArrayList r;
    public afb s;
    public yh t;
    public aez u;
    public xg v;
    public wr w;
    public boolean x;
    private TextView y;
    private ImageButton z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new afc();
        int c;
        boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private final int a(View view, int i2) {
        int i3;
        afa afa = (afa) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int i4 = afa.a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.F & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - afa.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i5 < afa.topMargin) {
            i5 = afa.topMargin;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            if (i6 < afa.bottomMargin) {
                i5 = Math.max(0, i5 - (afa.bottomMargin - i6));
            }
        }
        return paddingTop + i5;
    }

    private final int b(View view, int i2, int[] iArr, int i3) {
        afa afa = (afa) view.getLayoutParams();
        int i4 = afa.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + afa.leftMargin);
    }

    private static final int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return ph.a(marginLayoutParams) + ph.b(marginLayoutParams);
    }

    private static final int d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final int f(int i2) {
        int h2 = qb.h(this);
        int a2 = pd.a(i2, h2) & 7;
        if (a2 == 1 || a2 == 3 || a2 == 5) {
            return a2;
        }
        return h2 == 1 ? 5 : 3;
    }

    public static final afa q() {
        return new afa();
    }

    private final void r() {
        if (this.A == null) {
            this.A = new AppCompatImageView(getContext());
        }
    }

    private final void s() {
        if (this.z == null) {
            this.z = new yw(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            afa q2 = q();
            q2.a = (this.j & 112) | 8388611;
            this.z.setLayoutParams(q2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r1 = this;
            android.support.v7.widget.ActionMenuView r0 = r1.a
            if (r0 == 0) goto L_0x0010
            yh r0 = r0.c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.b():boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof afa);
    }

    public final void e() {
        aez aez = this.u;
        ww wwVar = aez != null ? aez.b : null;
        if (wwVar != null) {
            wwVar.collapseActionView();
        }
    }

    public final Drawable g() {
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return q();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new afa(getContext(), attributeSet);
    }

    public final Menu h() {
        i();
        return this.a.a();
    }

    public final void i() {
        j();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu a2 = actionMenuView.a();
            if (this.u == null) {
                this.u = new aez(this);
            }
            this.a.c.h();
            ((wt) a2).a((xh) this.u, this.g);
        }
    }

    public final void j() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.a(this.h);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.O;
            actionMenuView2.a(this.v, this.w);
            afa q2 = q();
            q2.a = (this.j & 112) | 8388613;
            this.a.setLayoutParams(q2);
            a((View) this.a, false);
        }
    }

    public final int k() {
        adu adu = this.o;
        if (adu != null) {
            return !adu.g ? adu.a : adu.b;
        }
        return 0;
    }

    public final int l() {
        adu adu = this.o;
        if (adu != null) {
            return !adu.g ? adu.b : adu.a;
        }
        return 0;
    }

    public final int m() {
        return g() != null ? Math.max(k(), Math.max(this.D, 0)) : k();
    }

    public final int n() {
        wt wtVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView == null || (wtVar = actionMenuView.a) == null || !wtVar.hasVisibleItems()) {
            return l();
        }
        return Math.max(l(), Math.max(this.E, 0));
    }

    public final zx o() {
        if (this.M == null) {
            this.M = new aff(this, true);
        }
        return this.M;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int h2 = qb.h(this);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.L;
        iArr[1] = 0;
        iArr[0] = 0;
        int l2 = qb.l(this);
        if (l2 >= 0) {
            i6 = Math.min(l2, i5 - i3);
        } else {
            i6 = 0;
        }
        if (!a((View) this.z)) {
            i8 = paddingLeft;
            i7 = i20;
        } else if (h2 != 1) {
            i8 = a(this.z, paddingLeft, iArr, i6);
            i7 = i20;
        } else {
            i7 = b(this.z, i20, iArr, i6);
            i8 = paddingLeft;
        }
        if (a((View) this.e)) {
            if (h2 != 1) {
                i8 = a(this.e, i8, iArr, i6);
            } else {
                i7 = b(this.e, i7, iArr, i6);
            }
        }
        if (a((View) this.a)) {
            if (h2 != 1) {
                i7 = b(this.a, i7, iArr, i6);
            } else {
                i8 = a(this.a, i8, iArr, i6);
            }
        }
        int n2 = qb.h(this) == 1 ? n() : m();
        int m2 = qb.h(this) == 1 ? m() : n();
        int i21 = paddingRight;
        iArr[0] = Math.max(0, n2 - i8);
        iArr[1] = Math.max(0, m2 - (i20 - i7));
        int max = Math.max(i8, n2);
        int min = Math.min(i7, i20 - m2);
        if (a(this.f)) {
            if (h2 != 1) {
                max = a(this.f, max, iArr, i6);
            } else {
                min = b(this.f, min, iArr, i6);
            }
        }
        if (a((View) this.A)) {
            if (h2 != 1) {
                max = a(this.A, max, iArr, i6);
            } else {
                min = b(this.A, min, iArr, i6);
            }
        }
        boolean a2 = a((View) this.y);
        boolean a3 = a((View) this.b);
        if (a2) {
            afa afa = (afa) this.y.getLayoutParams();
            i10 = afa.bottomMargin + afa.topMargin + this.y.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        if (a3) {
            afa afa2 = (afa) this.b.getLayoutParams();
            i11 = width;
            i10 += afa2.topMargin + this.b.getMeasuredHeight() + afa2.bottomMargin;
        } else {
            i11 = width;
        }
        if (a2 || a3) {
            TextView textView = !a2 ? this.b : this.y;
            TextView textView2 = !a3 ? this.y : this.b;
            afa afa3 = (afa) textView.getLayoutParams();
            afa afa4 = (afa) textView2.getLayoutParams();
            boolean z3 = (!a2 || this.y.getMeasuredWidth() <= 0) ? a3 && this.b.getMeasuredWidth() > 0 : true;
            i13 = paddingLeft;
            int i22 = this.F & 112;
            i12 = i6;
            if (i22 == 48) {
                i14 = min;
                i15 = getPaddingTop() + afa3.topMargin + this.m;
            } else if (i22 != 80) {
                int i23 = (((height - paddingTop) - paddingBottom) - i10) / 2;
                i14 = min;
                if (i23 < afa3.topMargin + this.m) {
                    i23 = afa3.topMargin + this.m;
                } else {
                    int i24 = (((height - paddingBottom) - i10) - i23) - paddingTop;
                    if (i24 < afa3.bottomMargin + this.n) {
                        i23 = Math.max(0, i23 - ((afa4.bottomMargin + this.n) - i24));
                    }
                }
                i15 = paddingTop + i23;
            } else {
                i14 = min;
                i15 = (((height - paddingBottom) - afa4.bottomMargin) - this.n) - i10;
            }
            if (h2 != 1) {
                int i25 = (z3 ? this.k : 0) - iArr[0];
                i9 += Math.max(0, i25);
                iArr[0] = Math.max(0, -i25);
                if (a2) {
                    int measuredWidth = this.y.getMeasuredWidth() + i9;
                    int measuredHeight = this.y.getMeasuredHeight() + i15;
                    this.y.layout(i9, i15, measuredWidth, measuredHeight);
                    i18 = measuredWidth + this.l;
                    i15 = measuredHeight + ((afa) this.y.getLayoutParams()).bottomMargin;
                } else {
                    i18 = i9;
                }
                if (a3) {
                    afa afa5 = (afa) this.b.getLayoutParams();
                    int i26 = i15 + afa5.topMargin;
                    int measuredWidth2 = this.b.getMeasuredWidth() + i9;
                    this.b.layout(i9, i26, measuredWidth2, this.b.getMeasuredHeight() + i26);
                    i19 = measuredWidth2 + this.l;
                    int i27 = afa5.bottomMargin;
                } else {
                    i19 = i9;
                }
                if (z3) {
                    i9 = Math.max(i18, i19);
                }
                min = i14;
            } else {
                int i28 = (z3 ? this.k : 0) - iArr[1];
                min = i14 - Math.max(0, i28);
                iArr[1] = Math.max(0, -i28);
                if (a2) {
                    int measuredWidth3 = min - this.y.getMeasuredWidth();
                    int measuredHeight2 = this.y.getMeasuredHeight() + i15;
                    this.y.layout(measuredWidth3, i15, min, measuredHeight2);
                    i16 = measuredWidth3 - this.l;
                    i15 = measuredHeight2 + ((afa) this.y.getLayoutParams()).bottomMargin;
                } else {
                    i16 = min;
                }
                if (a3) {
                    afa afa6 = (afa) this.b.getLayoutParams();
                    int i29 = i15 + afa6.topMargin;
                    this.b.layout(min - this.b.getMeasuredWidth(), i29, min, this.b.getMeasuredHeight() + i29);
                    i17 = min - this.l;
                    int i30 = afa6.bottomMargin;
                } else {
                    i17 = min;
                }
                if (z3) {
                    min = Math.min(i16, i17);
                }
            }
        } else {
            i13 = paddingLeft;
            i12 = i6;
        }
        a((List) this.K, 3);
        int size = this.K.size();
        for (int i31 = 0; i31 < size; i31++) {
            i9 = a((View) this.K.get(i31), i9, iArr, i12);
        }
        int i32 = i12;
        a((List) this.K, 5);
        int size2 = this.K.size();
        for (int i33 = 0; i33 < size2; i33++) {
            min = b((View) this.K.get(i33), min, iArr, i32);
        }
        a((List) this.K, 1);
        ArrayList arrayList = this.K;
        int i34 = iArr[0];
        int i35 = iArr[1];
        int size3 = arrayList.size();
        int i36 = 0;
        int i37 = 0;
        while (i36 < size3) {
            View view = (View) arrayList.get(i36);
            afa afa7 = (afa) view.getLayoutParams();
            int i38 = afa7.leftMargin - i34;
            int i39 = afa7.rightMargin - i35;
            int max2 = Math.max(0, i38);
            int max3 = Math.max(0, i39);
            int max4 = Math.max(0, -i38);
            int max5 = Math.max(0, -i39);
            i37 += max2 + view.getMeasuredWidth() + max3;
            i36++;
            i35 = max5;
            i34 = max4;
        }
        int i40 = (i13 + (((i11 - i13) - i21) / 2)) - (i37 / 2);
        int i41 = i37 + i40;
        if (i40 >= i9) {
            i9 = i41 > min ? i40 - (i41 - min) : i40;
        }
        int size4 = this.K.size();
        for (int i42 = 0; i42 < size4; i42++) {
            i9 = a((View) this.K.get(i42), i9, iArr, i32);
        }
        this.K.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.L;
        char a2 = afs.a(this);
        char c2 = a2 ^ 1;
        int i11 = 0;
        if (a((View) this.z)) {
            a(this.z, i2, 0, i3, this.C);
            i6 = this.z.getMeasuredWidth() + c((View) this.z);
            i5 = Math.max(0, this.z.getMeasuredHeight() + d((View) this.z));
            i4 = View.combineMeasuredStates(0, this.z.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (a((View) this.e)) {
            a(this.e, i2, 0, i3, this.C);
            i6 = this.e.getMeasuredWidth() + c((View) this.e);
            i5 = Math.max(i5, this.e.getMeasuredHeight() + d((View) this.e));
            i4 = View.combineMeasuredStates(i4, this.e.getMeasuredState());
        }
        int m2 = m();
        int max = Math.max(m2, i6);
        iArr[a2] = Math.max(0, m2 - i6);
        if (a((View) this.a)) {
            a(this.a, i2, max, i3, this.C);
            i7 = this.a.getMeasuredWidth() + c((View) this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + d((View) this.a));
            i4 = View.combineMeasuredStates(i4, this.a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int n2 = n();
        int max2 = max + Math.max(n2, i7);
        iArr[c2] = Math.max(0, n2 - i7);
        if (a(this.f)) {
            max2 += a(this.f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f.getMeasuredHeight() + d(this.f));
            i4 = View.combineMeasuredStates(i4, this.f.getMeasuredState());
        }
        if (a((View) this.A)) {
            max2 += a(this.A, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.A.getMeasuredHeight() + d((View) this.A));
            i4 = View.combineMeasuredStates(i4, this.A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            int i13 = i2;
            int i14 = i3;
            View childAt = getChildAt(i12);
            if (((afa) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                View view = childAt;
                max2 += a(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, view.getMeasuredHeight() + d(view));
                i4 = View.combineMeasuredStates(i4, view.getMeasuredState());
            }
        }
        int i15 = this.m + this.n;
        int i16 = this.k + this.l;
        if (a((View) this.y)) {
            a(this.y, i2, max2 + i16, i3, i15, iArr);
            int measuredWidth = this.y.getMeasuredWidth() + c((View) this.y);
            i8 = this.y.getMeasuredHeight() + d((View) this.y);
            i10 = View.combineMeasuredStates(i4, this.y.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (a((View) this.b)) {
            int i17 = i8 + i15;
            i9 = Math.max(i9, a(this.b, i2, max2 + i16, i3, i17, iArr));
            i8 += this.b.getMeasuredHeight() + d((View) this.b);
            i10 = View.combineMeasuredStates(i10, this.b.getMeasuredState());
        } else {
            int i18 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(max2 + i9 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.x) {
            int childCount2 = getChildCount();
            int i19 = 0;
            while (true) {
                if (i19 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i19);
                if (a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i19++;
            }
        }
        i11 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        wt wtVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            wtVar = actionMenuView.a;
        } else {
            wtVar = null;
        }
        int i2 = savedState.c;
        if (!(i2 == 0 || this.u == null || wtVar == null || (findItem = wtVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.d) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    public final void onRtlPropertiesChanged(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(i2);
        p();
        adu adu = this.o;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != adu.g) {
            adu.g = z2;
            if (!adu.h) {
                adu.a = adu.e;
                adu.b = adu.f;
            } else if (!z2) {
                int i4 = adu.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = adu.e;
                }
                adu.a = i4;
                int i5 = adu.d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = adu.f;
                }
                adu.b = i5;
            } else {
                int i6 = adu.d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = adu.e;
                }
                adu.a = i6;
                int i7 = adu.c;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = adu.f;
                }
                adu.b = i7;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        ww wwVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        aez aez = this.u;
        if (!(aez == null || (wwVar = aez.b) == null)) {
            savedState.c = wwVar.a;
        }
        savedState.d = a();
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    public final void p() {
        if (this.o == null) {
            this.o = new adu();
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private final boolean b(View view) {
        return view.getParent() == this || this.r.contains(view);
    }

    public final void c(int i2) {
        c(i2 != 0 ? getContext().getText(i2) : null);
    }

    public final void d() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.b();
        }
    }

    public final CharSequence f() {
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.F = 8388627;
        this.K = new ArrayList();
        this.r = new ArrayList();
        this.L = new int[2];
        this.O = new aew(this);
        this.N = new aex(this);
        aev a2 = aev.a(getContext(), attributeSet, uh.z, i2, 0);
        qb.a(this, context, uh.z, attributeSet, a2.b, i2, 0);
        this.B = a2.f(28, 0);
        this.i = a2.f(19, 0);
        this.F = a2.b(0, this.F);
        this.j = a2.b(2, 48);
        int c2 = a2.c(22, 0);
        c2 = a2.f(27) ? a2.c(27, c2) : c2;
        this.n = c2;
        this.m = c2;
        this.l = c2;
        this.k = c2;
        int c3 = a2.c(25, -1);
        if (c3 >= 0) {
            this.k = c3;
        }
        int c4 = a2.c(24, -1);
        if (c4 >= 0) {
            this.l = c4;
        }
        int c5 = a2.c(26, -1);
        if (c5 >= 0) {
            this.m = c5;
        }
        int c6 = a2.c(23, -1);
        if (c6 >= 0) {
            this.n = c6;
        }
        this.C = a2.d(13, -1);
        int c7 = a2.c(9, Integer.MIN_VALUE);
        int c8 = a2.c(5, Integer.MIN_VALUE);
        int d2 = a2.d(7, 0);
        int d3 = a2.d(8, 0);
        p();
        adu adu = this.o;
        adu.h = false;
        if (d2 != Integer.MIN_VALUE) {
            adu.e = d2;
            adu.a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            adu.f = d3;
            adu.b = d3;
        }
        if (!(c7 == Integer.MIN_VALUE && c8 == Integer.MIN_VALUE)) {
            adu.a(c7, c8);
        }
        this.D = a2.c(10, Integer.MIN_VALUE);
        this.E = a2.c(6, Integer.MIN_VALUE);
        this.c = a2.a(4);
        this.d = a2.c(3);
        CharSequence c9 = a2.c(21);
        if (!TextUtils.isEmpty(c9)) {
            a(c9);
        }
        CharSequence c10 = a2.c(18);
        if (!TextUtils.isEmpty(c10)) {
            b(c10);
        }
        this.g = getContext();
        a(a2.f(17, 0));
        Drawable a3 = a2.a(16);
        if (a3 != null) {
            b(a3);
        }
        CharSequence c11 = a2.c(15);
        if (!TextUtils.isEmpty(c11)) {
            c(c11);
        }
        Drawable a4 = a2.a(11);
        if (a4 != null) {
            a(a4);
        }
        CharSequence c12 = a2.c(12);
        if (!TextUtils.isEmpty(c12)) {
            if (!TextUtils.isEmpty(c12)) {
                r();
            }
            ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setContentDescription(c12);
            }
        }
        if (a2.f(29)) {
            a(a2.e(29));
        }
        if (a2.f(20)) {
            ColorStateList e2 = a2.e(20);
            this.H = e2;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(e2);
            }
        }
        if (a2.f(14)) {
            e(a2.f(14, 0));
        }
        a2.a();
    }

    public final void b(int i2) {
        a(ColorStateList.valueOf(i2));
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            s();
        }
        ImageButton imageButton = this.z;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public final void d(int i2) {
        b(uj.b(getContext(), i2));
    }

    public void e(int i2) {
        new vz(getContext()).inflate(i2, h());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            s();
            if (!b((View) this.z)) {
                a((View) this.z, true);
            }
        } else {
            ImageButton imageButton = this.z;
            if (imageButton != null && b((View) imageButton)) {
                removeView(this.z);
                this.r.remove(this.z);
            }
        }
        ImageButton imageButton2 = this.z;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r1 = this;
            android.support.v7.widget.ActionMenuView r0 = r1.a
            if (r0 == 0) goto L_0x0010
            yh r0 = r0.c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.c():boolean");
    }

    public void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && b((View) textView)) {
                removeView(this.b);
                this.r.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.i;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!b((View) this.b)) {
                a((View) this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.q = charSequence;
    }

    private final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final int a(View view, int i2, int[] iArr, int i3) {
        afa afa = (afa) view.getLayoutParams();
        int i4 = afa.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + afa.rightMargin;
    }

    protected static final afa a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof afa) {
            return new afa((afa) layoutParams);
        }
        if (layoutParams instanceof se) {
            return new afa((se) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new afa((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new afa(layoutParams);
    }

    private final void a(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final void a(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        afa q2 = layoutParams == null ? q() : !checkLayoutParams(layoutParams) ? a(layoutParams) : (afa) layoutParams;
        q2.b = 1;
        if (!z2 || this.f == null) {
            addView(view, q2);
            return;
        }
        view.setLayoutParams(q2);
        this.r.add(view);
    }

    private final void a(List list, int i2) {
        int h2 = qb.h(this);
        int childCount = getChildCount();
        int a2 = pd.a(i2, qb.h(this));
        list.clear();
        if (h2 == 1) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                afa afa = (afa) childAt.getLayoutParams();
                if (afa.b == 0 && a(childAt) && f(afa.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            afa afa2 = (afa) childAt2.getLayoutParams();
            if (afa2.b == 0 && a(childAt2) && f(afa2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private final boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void a(int i2) {
        if (this.h != i2) {
            this.h = i2;
            if (i2 != 0) {
                this.g = new ContextThemeWrapper(getContext(), i2);
            } else {
                this.g = getContext();
            }
        }
    }

    public final void a(Context context, int i2) {
        this.B = i2;
        TextView textView = this.y;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.G = colorStateList;
        TextView textView = this.y;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            r();
            if (!b((View) this.A)) {
                a((View) this.A, true);
            }
        } else {
            ImageView imageView = this.A;
            if (imageView != null && b((View) imageView)) {
                removeView(this.A);
                this.r.remove(this.A);
            }
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        s();
        this.z.setOnClickListener(onClickListener);
    }

    public void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.y;
            if (textView != null && b((View) textView)) {
                removeView(this.y);
                this.r.remove(this.y);
            }
        } else {
            if (this.y == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.y = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.y.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.B;
                if (i2 != 0) {
                    this.y.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.y.setTextColor(colorStateList);
                }
            }
            if (!b((View) this.y)) {
                a((View) this.y, true);
            }
        }
        TextView textView2 = this.y;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.p = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r1 = this;
            android.support.v7.widget.ActionMenuView r0 = r1.a
            if (r0 == 0) goto L_0x0010
            yh r0 = r0.c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.a():boolean");
    }
}
