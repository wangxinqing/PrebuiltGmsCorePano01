package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionBarContextView extends xs {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private LinearLayout l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private int q;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void c() {
        if (this.l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = linearLayout;
            this.m = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.n = (TextView) this.l.findViewById(R.id.action_bar_subtitle);
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.m.setText(this.g);
        this.n.setText(this.h);
        boolean z = !TextUtils.isEmpty(this.g);
        boolean isEmpty = TextUtils.isEmpty(this.h);
        boolean z2 = !isEmpty;
        int i2 = 8;
        this.n.setVisibility(!isEmpty ? 0 : 8);
        LinearLayout linearLayout2 = this.l;
        if (z) {
            i2 = 0;
        } else if (z2) {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        if (this.l.getParent() == null) {
            addView(this.l);
        }
    }

    public final void a() {
        removeAllViews();
        this.k = null;
        this.c = null;
    }

    public final void a(int i2) {
        this.e = i2;
    }

    public final void b() {
        yh yhVar = this.d;
        if (yhVar != null) {
            yhVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh yhVar = this.d;
        if (yhVar != null) {
            yhVar.d();
            this.d.j();
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean a = afs.a(this);
        int paddingRight = a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i6 = !a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = !a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int a2 = xs.a(paddingRight, i6, a);
            paddingRight = xs.a(a2 + xs.a(this.i, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.l;
        if (!(linearLayout == null || this.k != null || linearLayout.getVisibility() == 8)) {
            paddingRight += xs.a(this.l, paddingRight, paddingTop, paddingTop2, a);
        }
        View view2 = this.k;
        if (view2 != null) {
            xs.a(view2, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingRight2 = !a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            xs.a(actionMenuView, paddingRight2, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int mode = View.MeasureSpec.getMode(i2);
        int i7 = JGCastService.FLAG_PRIVATE_DISPLAY;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i8 = this.e;
            if (i8 <= 0) {
                i8 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i9 = i8 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
            View view = this.i;
            if (view != null) {
                int a = xs.a(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = xs.a((View) this.c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.l;
            if (linearLayout != null && this.k == null) {
                if (this.j) {
                    this.l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        i5 = paddingLeft - measuredWidth;
                    } else {
                        i5 = paddingLeft;
                    }
                    LinearLayout linearLayout2 = this.l;
                    if (measuredWidth > paddingLeft) {
                        i6 = 8;
                    } else {
                        i6 = 0;
                    }
                    linearLayout2.setVisibility(i6);
                    paddingLeft = i5;
                } else {
                    paddingLeft = xs.a((View) linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.k;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = JGCastService.FLAG_PRIVATE_DISPLAY;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i7 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i9 = Math.min(layoutParams.height, i9);
                }
                this.k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i9, i7));
            }
            if (this.e <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i8);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public final void b(CharSequence charSequence) {
        this.h = charSequence;
        c();
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        aev a = aev.a(context, attributeSet, uh.d, i2, 0);
        qb.a((View) this, a.a(0));
        this.o = a.f(5, 0);
        this.p = a.f(4, 0);
        this.e = a.e(3, 0);
        this.q = a.f(2, R.layout.abc_action_mode_close_item_material);
        a.a();
    }

    public final void a(View view) {
        LinearLayout linearLayout;
        View view2 = this.k;
        if (view2 != null) {
            removeView(view2);
        }
        this.k = view;
        if (!(view == null || (linearLayout = this.l) == null)) {
            removeView(linearLayout);
            this.l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charSequence) {
        this.g = charSequence;
        c();
    }

    public final void a(vr vrVar) {
        View view = this.i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.q, this, false);
            this.i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        this.i.findViewById(R.id.action_mode_close_button).setOnClickListener(new xu(vrVar));
        wt wtVar = (wt) vrVar.b();
        yh yhVar = this.d;
        if (yhVar != null) {
            yhVar.g();
        }
        this.d = new yh(getContext());
        this.d.i();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        wtVar.a((xh) this.d, this.b);
        yh yhVar2 = this.d;
        xj xjVar = yhVar2.f;
        if (yhVar2.f == null) {
            yhVar2.f = (xj) yhVar2.d.inflate(R.layout.abc_action_menu_layout, this, false);
            yhVar2.f.a(yhVar2.c);
            yhVar2.a(true);
        }
        xj xjVar2 = yhVar2.f;
        if (xjVar != xjVar2) {
            ((ActionMenuView) xjVar2).a(yhVar2);
        }
        this.c = (ActionMenuView) xjVar2;
        qb.a((View) this.c, (Drawable) null);
        addView(this.c, layoutParams);
    }

    public final void a(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }
}
