package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import java.util.HashSet;

/* renamed from: ajtc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajtc extends ViewGroup implements xj {
    private static final int[] p = {16842912};
    private static final int[] q = {-16842910};
    private final or A = new os(5);
    public final aru a;
    public boolean b;
    public int c;
    public ajsz[] d;
    public int e = 0;
    public int f = 0;
    public int g;
    public ColorStateList h;
    public int i;
    public int j;
    public Drawable k;
    public int l;
    public SparseArray m = new SparseArray(5);
    public ajte n;
    public wt o;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final View.OnClickListener w;
    private ColorStateList x;
    private final ColorStateList y;
    private final int[] z;

    public final void a() {
        ajss ajss;
        removeAllViews();
        ajsz[] ajszArr = this.d;
        if (ajszArr != null) {
            for (ajsz ajsz : ajszArr) {
                if (ajsz != null) {
                    this.A.a(ajsz);
                    ImageView imageView = ajsz.a;
                    if (ajsz.c()) {
                        if (imageView != null) {
                            ajsz.setClipChildren(true);
                            ajsz.setClipToPadding(true);
                            ajss ajss2 = ajsz.d;
                            ajsz.a((View) imageView);
                            ajst.a(ajss2, (View) imageView);
                        }
                        ajsz.d = null;
                    }
                }
            }
        }
        if (this.o.size() != 0) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                hashSet.add(Integer.valueOf(this.o.getItem(i2).getItemId()));
            }
            for (int i3 = 0; i3 < this.m.size(); i3++) {
                int keyAt = this.m.keyAt(i3);
                if (!hashSet.contains(Integer.valueOf(keyAt))) {
                    this.m.delete(keyAt);
                }
            }
            this.d = new ajsz[this.o.size()];
            boolean a2 = a(this.c, this.o.g().size());
            for (int i4 = 0; i4 < this.o.size(); i4++) {
                this.n.b = true;
                this.o.getItem(i4).setCheckable(true);
                this.n.b = false;
                ajsz ajsz2 = (ajsz) this.A.a();
                if (ajsz2 == null) {
                    ajsz2 = new ajsz(getContext());
                }
                this.d[i4] = ajsz2;
                ajsz2.a(this.x);
                ajsz2.b(this.g);
                ajsz2.b(this.y);
                ajsz2.c(this.i);
                ajsz2.d(this.j);
                ajsz2.b(this.h);
                Drawable drawable = this.k;
                if (drawable != null) {
                    ajsz2.a(drawable);
                } else {
                    ajsz2.e(this.l);
                }
                ajsz2.a(a2);
                ajsz2.a(this.c);
                ajsz2.a((ww) this.o.getItem(i4));
                ajsz2.b = i4;
                ajsz2.setOnClickListener(this.w);
                if (this.e != 0 && this.o.getItem(i4).getItemId() == this.e) {
                    this.f = i4;
                }
                int id = ajsz2.getId();
                if (!(id == -1 || (ajss = (ajss) this.m.get(id)) == null)) {
                    ajsz2.a(ajss);
                }
                addView(ajsz2);
            }
            int min = Math.min(this.o.size() - 1, this.f);
            this.f = min;
            this.o.getItem(min).setChecked(true);
            return;
        }
        this.e = 0;
        this.f = 0;
        this.d = null;
    }

    public final void a(wt wtVar) {
        this.o = wtVar;
    }

    public final boolean a(int i2, int i3) {
        return i2 == -1 ? i3 > 3 : i2 == 0;
    }

    public final ColorStateList b() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            ColorStateList a2 = uj.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a2.getDefaultColor();
                return new ColorStateList(new int[][]{q, p, EMPTY_STATE_SET}, new int[]{a2.getColorForState(q, defaultColor), i2, defaultColor});
            }
        }
        return null;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        qs.a(accessibilityNodeInfo).a((Object) qq.a(1, this.o.g().size(), 1));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (qb.h(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.o.g().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.v, JGCastService.FLAG_PRIVATE_DISPLAY);
        int i7 = 1;
        if (!a(this.c, size2) || !this.b) {
            if (size2 != 0) {
                i7 = size2;
            }
            int min = Math.min(size / i7, this.t);
            int i8 = size - (size2 * min);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr = this.z;
                    iArr[i9] = min;
                    if (i8 > 0) {
                        iArr[i9] = min + 1;
                        i8--;
                    }
                } else {
                    this.z[i9] = 0;
                }
            }
            i5 = 0;
            i4 = 0;
        } else {
            View childAt = getChildAt(this.f);
            int i10 = this.u;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.t, Integer.MIN_VALUE), makeMeasureSpec);
                i10 = Math.max(i10, childAt.getMeasuredWidth());
            }
            int i11 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.s * i11), Math.min(i10, this.t));
            int i12 = size - min2;
            if (i11 != 0) {
                i7 = i11;
            }
            int min3 = Math.min(i12 / i7, this.r);
            int i13 = i12 - (i11 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    int[] iArr2 = this.z;
                    if (i14 == this.f) {
                        i6 = min2;
                    } else {
                        i6 = min3;
                    }
                    iArr2[i14] = i6;
                    if (i13 > 0) {
                        iArr2[i14] = i6 + 1;
                        i13--;
                    }
                } else {
                    this.z[i14] = 0;
                }
            }
            i5 = 0;
            i4 = 0;
        }
        while (i5 < childCount) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.z[i5], JGCastService.FLAG_PRIVATE_DISPLAY), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i4 += childAt2.getMeasuredWidth();
            }
            i5++;
        }
        setMeasuredDimension(View.resolveSizeAndState(i4, View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY), 0), View.resolveSizeAndState(this.v, makeMeasureSpec, 0));
    }

    public ajtc(Context context) {
        super(context, (AttributeSet) null);
        Resources resources = getResources();
        this.r = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.s = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.t = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.u = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.v = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_height);
        this.y = b();
        aru aru = new aru((byte[]) null);
        this.a = aru;
        aru.b(0);
        this.a.a(115);
        this.a.a((TimeInterpolator) new aiq());
        this.a.a((arn) new ajxz());
        this.w = new ajtb(this);
        this.z = new int[5];
        qb.b((View) this, 1);
    }

    public final void a(ColorStateList colorStateList) {
        this.x = colorStateList;
        ajsz[] ajszArr = this.d;
        if (ajszArr != null) {
            for (ajsz a2 : ajszArr) {
                a2.a(colorStateList);
            }
        }
    }

    public final void a(Drawable drawable) {
        this.k = drawable;
        ajsz[] ajszArr = this.d;
        if (ajszArr != null) {
            for (ajsz a2 : ajszArr) {
                a2.a(drawable);
            }
        }
    }
}
