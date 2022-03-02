package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConstraintLayout extends ViewGroup {
    SparseArray a = new SparseArray();
    fh b = new fh();
    private final ArrayList c = new ArrayList(100);
    private int d = 0;
    private int e = 0;
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MAX_VALUE;
    private boolean h = true;
    private int i = 2;
    private eu j = null;

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    private final fg a(int i2) {
        if (i2 == 0) {
            return this.b;
        }
        View view = (View) this.a.get(i2);
        if (view == this) {
            return this.b;
        }
        if (view != null) {
            return ((es) view.getLayoutParams()).Y;
        }
        return null;
    }

    protected static final es b() {
        return new es();
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        int i3 = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof es;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new es(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            es esVar = (es) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || esVar.Q || isInEditMode) {
                fg fgVar = esVar.Y;
                int g2 = fgVar.g();
                int h2 = fgVar.h();
                childAt.layout(g2, h2, fgVar.c() + g2, fgVar.f() + h2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        int i11;
        boolean z3;
        int baseline;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f2;
        int i17;
        fg a2;
        fg a3;
        fg a4;
        fg a5;
        int i18 = i2;
        int i19 = i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        fh fhVar = this.b;
        fhVar.w = paddingLeft;
        fhVar.x = paddingTop;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        getLayoutParams();
        if (mode == Integer.MIN_VALUE) {
            i4 = 2;
        } else if (mode == 0) {
            i4 = 2;
            size = 0;
        } else if (mode != 1073741824) {
            i4 = 1;
            size = 0;
        } else {
            size = Math.min(this.f, size) - paddingLeft2;
            i4 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            i5 = 2;
        } else if (mode2 == 0) {
            i5 = 2;
            size2 = 0;
        } else if (mode2 != 1073741824) {
            i5 = 1;
            size2 = 0;
        } else {
            size2 = Math.min(this.g, size2) - paddingTop2;
            i5 = 1;
        }
        this.b.c(0);
        this.b.d(0);
        this.b.f(i4);
        this.b.a(size);
        this.b.g(i5);
        this.b.b(size2);
        this.b.c((this.d - getPaddingLeft()) - getPaddingRight());
        this.b.d((this.e - getPaddingTop()) - getPaddingBottom());
        int i20 = -1;
        if (this.h) {
            this.h = false;
            int childCount = getChildCount();
            int i21 = 0;
            while (true) {
                if (i21 >= childCount) {
                    break;
                } else if (getChildAt(i21).isLayoutRequested()) {
                    this.c.clear();
                    eu euVar = this.j;
                    if (euVar != null) {
                        int childCount2 = getChildCount();
                        HashSet hashSet = new HashSet(euVar.a.keySet());
                        for (int i22 = 0; i22 < childCount2; i22++) {
                            View childAt = getChildAt(i22);
                            int id = childAt.getId();
                            HashMap hashMap = euVar.a;
                            Integer valueOf = Integer.valueOf(id);
                            if (hashMap.containsKey(valueOf)) {
                                hashSet.remove(valueOf);
                                et etVar = (et) euVar.a.get(valueOf);
                                es esVar = (es) childAt.getLayoutParams();
                                etVar.a(esVar);
                                childAt.setLayoutParams(esVar);
                                childAt.setVisibility(etVar.G);
                                int i23 = Build.VERSION.SDK_INT;
                                childAt.setAlpha(etVar.R);
                                childAt.setRotationX(etVar.U);
                                childAt.setRotationY(etVar.V);
                                childAt.setScaleX(etVar.W);
                                childAt.setScaleY(etVar.X);
                                childAt.setPivotX(etVar.Y);
                                childAt.setPivotY(etVar.Z);
                                childAt.setTranslationX(etVar.aa);
                                childAt.setTranslationY(etVar.ab);
                                int i24 = Build.VERSION.SDK_INT;
                                childAt.setTranslationZ(etVar.ac);
                                if (etVar.S) {
                                    childAt.setElevation(etVar.T);
                                }
                            }
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            Integer num = (Integer) it.next();
                            et etVar2 = (et) euVar.a.get(num);
                            if (etVar2.a) {
                                ev evVar = new ev(getContext());
                                evVar.setId(num.intValue());
                                es b2 = b();
                                etVar2.a(b2);
                                addView(evVar, b2);
                            }
                        }
                    }
                    int childCount3 = getChildCount();
                    this.b.al.clear();
                    int i25 = 0;
                    while (i25 < childCount3) {
                        View childAt2 = getChildAt(i25);
                        fg a6 = a(childAt2);
                        if (a6 != null) {
                            es esVar2 = (es) childAt2.getLayoutParams();
                            a6.a();
                            a6.K = childAt2.getVisibility();
                            a6.J = childAt2;
                            fh fhVar2 = this.b;
                            fhVar2.al.add(a6);
                            fg fgVar = a6.r;
                            if (fgVar != null) {
                                ((fl) fgVar).a(a6);
                            }
                            a6.r = fhVar2;
                            if (!esVar2.O || !esVar2.N) {
                                this.c.add(a6);
                            }
                            if (esVar2.Q) {
                                fi fiVar = (fi) a6;
                                int i26 = esVar2.a;
                                if (i26 != i20 && i26 >= 0) {
                                    fiVar.af = -1.0f;
                                    fiVar.ag = i26;
                                    fiVar.ah = i20;
                                }
                                int i27 = esVar2.b;
                                if (i27 != i20 && i27 >= 0) {
                                    fiVar.af = -1.0f;
                                    fiVar.ag = i20;
                                    fiVar.ah = i27;
                                }
                                float f3 = esVar2.c;
                                if (f3 != -1.0f && f3 > -1.0f) {
                                    fiVar.af = f3;
                                    fiVar.ag = i20;
                                    fiVar.ah = i20;
                                }
                                i14 = childCount3;
                            } else if (esVar2.R == i20 && esVar2.S == i20 && esVar2.T == i20 && esVar2.U == i20 && esVar2.h == i20 && esVar2.i == i20 && esVar2.j == i20 && esVar2.k == i20 && esVar2.l == i20 && esVar2.K == i20 && esVar2.L == i20 && esVar2.width != i20 && esVar2.height != i20) {
                                i14 = childCount3;
                            } else {
                                int i28 = esVar2.R;
                                int i29 = esVar2.S;
                                int i30 = esVar2.T;
                                int i31 = esVar2.U;
                                int i32 = esVar2.V;
                                int i33 = esVar2.W;
                                float f4 = esVar2.X;
                                int i34 = Build.VERSION.SDK_INT;
                                i14 = childCount3;
                                if (i28 != -1) {
                                    fg a7 = a(i28);
                                    if (a7 != null) {
                                        a6.a(2, a7, 2, esVar2.leftMargin, i32);
                                    }
                                } else if (!(i29 == -1 || (a5 = a(i29)) == null)) {
                                    a6.a(2, a5, 4, esVar2.leftMargin, i32);
                                }
                                if (i30 != -1) {
                                    fg a8 = a(i30);
                                    if (a8 != null) {
                                        a6.a(4, a8, 2, esVar2.rightMargin, i33);
                                    }
                                } else if (!(i31 == -1 || (a4 = a(i31)) == null)) {
                                    a6.a(4, a4, 4, esVar2.rightMargin, i33);
                                }
                                int i35 = esVar2.h;
                                if (i35 != -1) {
                                    fg a9 = a(i35);
                                    if (a9 != null) {
                                        a6.a(3, a9, 3, esVar2.topMargin, esVar2.r);
                                    }
                                } else {
                                    int i36 = esVar2.i;
                                    if (!(i36 == -1 || (a3 = a(i36)) == null)) {
                                        a6.a(3, a3, 5, esVar2.topMargin, esVar2.r);
                                    }
                                }
                                int i37 = esVar2.j;
                                if (i37 != -1) {
                                    fg a10 = a(i37);
                                    if (a10 != null) {
                                        a6.a(5, a10, 3, esVar2.bottomMargin, esVar2.t);
                                    }
                                } else {
                                    int i38 = esVar2.k;
                                    if (!(i38 == -1 || (a2 = a(i38)) == null)) {
                                        a6.a(5, a2, 5, esVar2.bottomMargin, esVar2.t);
                                    }
                                }
                                int i39 = esVar2.l;
                                if (i39 != -1) {
                                    View view = (View) this.a.get(i39);
                                    fg a11 = a(esVar2.l);
                                    if (!(a11 == null || view == null || !(view.getLayoutParams() instanceof es))) {
                                        esVar2.P = true;
                                        ((es) view.getLayoutParams()).P = true;
                                        a6.e(6).a(a11.e(6), 0, -1, 2, 0, true);
                                        a6.e(3).b();
                                        a6.e(5).b();
                                    }
                                }
                                if (f4 >= 0.0f && f4 != 0.5f) {
                                    a6.H = f4;
                                }
                                float f5 = esVar2.x;
                                if (f5 >= 0.0f && f5 != 0.5f) {
                                    a6.I = f5;
                                }
                                if (isInEditMode() && !((i17 = esVar2.K) == -1 && esVar2.L == -1)) {
                                    int i40 = esVar2.L;
                                    a6.w = i17;
                                    a6.x = i40;
                                }
                                if (esVar2.N) {
                                    a6.f(1);
                                    a6.a(esVar2.width);
                                } else if (esVar2.width == -1) {
                                    a6.f(4);
                                    a6.e(2).c = esVar2.leftMargin;
                                    a6.e(4).c = esVar2.rightMargin;
                                } else {
                                    a6.f(3);
                                    a6.a(0);
                                }
                                if (esVar2.O) {
                                    a6.g(1);
                                    a6.b(esVar2.height);
                                } else if (esVar2.height == -1) {
                                    a6.g(4);
                                    a6.e(3).c = esVar2.topMargin;
                                    a6.e(5).c = esVar2.bottomMargin;
                                } else {
                                    a6.g(3);
                                    a6.b(0);
                                }
                                String str = esVar2.y;
                                if (str != null) {
                                    if (str.length() != 0) {
                                        int length = str.length();
                                        int indexOf = str.indexOf(44);
                                        if (indexOf <= 0) {
                                            i16 = 0;
                                            i15 = -1;
                                        } else if (indexOf < length - 1) {
                                            String substring = str.substring(0, indexOf);
                                            i15 = !substring.equalsIgnoreCase("W") ? substring.equalsIgnoreCase("H") ? 1 : -1 : 0;
                                            i16 = indexOf + 1;
                                        } else {
                                            i16 = 0;
                                            i15 = -1;
                                        }
                                        int indexOf2 = str.indexOf(58);
                                        if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                            String substring2 = str.substring(i16, indexOf2);
                                            String substring3 = str.substring(indexOf2 + 1);
                                            if (substring2.length() > 0 && substring3.length() > 0) {
                                                try {
                                                    float parseFloat = Float.parseFloat(substring2);
                                                    float parseFloat2 = Float.parseFloat(substring3);
                                                    if (parseFloat > 0.0f) {
                                                        f2 = parseFloat2 <= 0.0f ? 0.0f : i15 != 1 ? Math.abs(parseFloat / parseFloat2) : Math.abs(parseFloat2 / parseFloat);
                                                    }
                                                } catch (NumberFormatException e2) {
                                                    f2 = 0.0f;
                                                }
                                            }
                                            f2 = 0.0f;
                                        } else {
                                            String substring4 = str.substring(i16);
                                            f2 = substring4.length() > 0 ? Float.parseFloat(substring4) : 0.0f;
                                        }
                                        if (f2 > 0.0f) {
                                            a6.u = f2;
                                            a6.v = i15;
                                        }
                                    } else {
                                        a6.u = 0.0f;
                                    }
                                }
                                a6.Z = esVar2.A;
                                a6.aa = esVar2.B;
                                a6.V = esVar2.C;
                                a6.W = esVar2.D;
                                int i41 = esVar2.E;
                                int i42 = esVar2.G;
                                int i43 = esVar2.I;
                                a6.c = i41;
                                a6.e = i42;
                                a6.f = i43;
                                int i44 = esVar2.F;
                                int i45 = esVar2.H;
                                int i46 = esVar2.J;
                                a6.d = i44;
                                a6.g = i45;
                                a6.h = i46;
                            }
                        } else {
                            i14 = childCount3;
                        }
                        i25++;
                        childCount3 = i14;
                        i20 = -1;
                    }
                } else {
                    i21++;
                    i20 = -1;
                }
            }
        }
        int paddingTop3 = getPaddingTop() + getPaddingBottom();
        int paddingLeft3 = getPaddingLeft() + getPaddingRight();
        int childCount4 = getChildCount();
        int i47 = 0;
        while (true) {
            i6 = 8;
            if (i47 >= childCount4) {
                break;
            }
            View childAt3 = getChildAt(i47);
            if (childAt3.getVisibility() != 8) {
                es esVar3 = (es) childAt3.getLayoutParams();
                fg fgVar2 = esVar3.Y;
                if (!esVar3.Q) {
                    int i48 = esVar3.width;
                    int i49 = esVar3.height;
                    if (esVar3.N || esVar3.O || esVar3.E == 1 || esVar3.width == -1 || (!esVar3.O && (esVar3.F == 1 || esVar3.height == -1))) {
                        if (i48 == 0 || i48 == -1) {
                            i12 = ViewGroup.getChildMeasureSpec(i18, paddingLeft3, -2);
                            z3 = true;
                        } else {
                            i12 = ViewGroup.getChildMeasureSpec(i18, paddingLeft3, i48);
                            z3 = false;
                        }
                        if (i49 == 0 || i49 == -1) {
                            i13 = ViewGroup.getChildMeasureSpec(i19, paddingTop3, -2);
                            z2 = true;
                        } else {
                            i13 = ViewGroup.getChildMeasureSpec(i19, paddingTop3, i49);
                            z2 = false;
                        }
                        childAt3.measure(i12, i13);
                        i11 = childAt3.getMeasuredWidth();
                        i49 = childAt3.getMeasuredHeight();
                    } else {
                        i11 = i48;
                        z3 = false;
                        z2 = false;
                    }
                    fgVar2.a(i11);
                    fgVar2.b(i49);
                    if (z3) {
                        fgVar2.F = i11;
                    }
                    if (z2) {
                        fgVar2.G = i49;
                    }
                    if (esVar3.P && (baseline = childAt3.getBaseline()) != -1) {
                        fgVar2.C = baseline;
                    }
                }
            }
            i47++;
        }
        if (getChildCount() > 0) {
            a();
        }
        int size3 = this.c.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            fh fhVar3 = this.b;
            int i50 = fhVar3.ad;
            int i51 = fhVar3.ae;
            int i52 = 0;
            int i53 = 0;
            boolean z4 = false;
            while (i53 < size3) {
                fg fgVar3 = (fg) this.c.get(i53);
                if (!(fgVar3 instanceof fi) && (obj = fgVar3.J) != null) {
                    View view2 = (View) obj;
                    if (view2.getVisibility() != i6) {
                        es esVar4 = (es) view2.getLayoutParams();
                        if (esVar4.width == -2) {
                            i9 = ViewGroup.getChildMeasureSpec(i18, paddingRight, esVar4.width);
                        } else {
                            i9 = View.MeasureSpec.makeMeasureSpec(fgVar3.c(), JGCastService.FLAG_PRIVATE_DISPLAY);
                        }
                        if (esVar4.height == -2) {
                            i10 = ViewGroup.getChildMeasureSpec(i19, paddingBottom, esVar4.height);
                        } else {
                            i10 = View.MeasureSpec.makeMeasureSpec(fgVar3.f(), JGCastService.FLAG_PRIVATE_DISPLAY);
                        }
                        view2.measure(i9, i10);
                        int measuredWidth = view2.getMeasuredWidth();
                        int measuredHeight = view2.getMeasuredHeight();
                        if (measuredWidth != fgVar3.c()) {
                            fgVar3.a(measuredWidth);
                            if (i50 != 2 || fgVar3.i() <= this.b.c()) {
                                i8 = size3;
                                z = true;
                            } else {
                                i8 = size3;
                                this.b.a(Math.max(this.d, fgVar3.i() + fgVar3.e(4).a()));
                                z = true;
                            }
                        } else {
                            i8 = size3;
                            z = z4;
                        }
                        if (measuredHeight != fgVar3.f()) {
                            fgVar3.b(measuredHeight);
                            if (i51 != 2 || fgVar3.j() <= this.b.f()) {
                                z = true;
                            } else {
                                this.b.b(Math.max(this.e, fgVar3.j() + fgVar3.e(5).a()));
                                z = true;
                            }
                        }
                        if (esVar4.P) {
                            int baseline2 = view2.getBaseline();
                            if (!(baseline2 == -1 || baseline2 == fgVar3.C)) {
                                fgVar3.C = baseline2;
                                z = true;
                            }
                        }
                        int i54 = Build.VERSION.SDK_INT;
                        i52 = combineMeasuredStates(i52, view2.getMeasuredState());
                        z4 = z;
                        i53++;
                        size3 = i8;
                        i6 = 8;
                    }
                }
                i8 = size3;
                i53++;
                size3 = i8;
                i6 = 8;
            }
            if (z4) {
                a();
            }
            i7 = i52;
        } else {
            i7 = 0;
        }
        int c2 = this.b.c();
        int f6 = this.b.f();
        int i55 = Build.VERSION.SDK_INT;
        int resolveSizeAndState = resolveSizeAndState(c2 + paddingRight, i18, i7);
        int resolveSizeAndState2 = resolveSizeAndState(f6 + paddingBottom, i19, i7 << 16);
        int min = Math.min(this.f, resolveSizeAndState) & 16777215;
        int min2 = Math.min(this.g, resolveSizeAndState2) & 16777215;
        fh fhVar4 = this.b;
        if (fhVar4.aj) {
            min |= 16777216;
        }
        if (fhVar4.ak) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public final void onViewAdded(View view) {
        int i2 = Build.VERSION.SDK_INT;
        super.onViewAdded(view);
        fg a2 = a(view);
        if ((view instanceof ev) && !(a2 instanceof fi)) {
            es esVar = (es) view.getLayoutParams();
            esVar.Y = new fi();
            esVar.Q = true;
            ((fi) esVar.Y).h(esVar.M);
            fg fgVar = esVar.Y;
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    public final void onViewRemoved(View view) {
        int i2 = Build.VERSION.SDK_INT;
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.a(a(view));
        this.h = true;
    }

    public final void removeView(View view) {
        super.removeView(view);
        int i2 = Build.VERSION.SDK_INT;
    }

    public final void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    public final void setId(int i2) {
        this.a.remove(getId());
        super.setId(i2);
        this.a.put(getId(), this);
    }

    private final fg a(View view) {
        if (view == this) {
            return this.b;
        }
        if (view != null) {
            return ((es) view.getLayoutParams()).Y;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new es(layoutParams);
    }

    private final void a(AttributeSet attributeSet) {
        this.b.J = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ew.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 8) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(8, this.d);
                } else if (index == 9) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(9, this.e);
                } else if (index == 6) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(6, this.f);
                } else if (index == 7) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(7, this.g);
                } else if (index == 85) {
                    this.i = obtainStyledAttributes.getInt(85, this.i);
                } else if (index == 14) {
                    int resourceId = obtainStyledAttributes.getResourceId(14, 0);
                    eu euVar = new eu();
                    this.j = euVar;
                    euVar.a(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b.ai = this.i;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.n();
    }
}
