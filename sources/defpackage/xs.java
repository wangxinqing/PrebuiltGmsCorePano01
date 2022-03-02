package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: xs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xs extends ViewGroup {
    protected final xr a;
    protected final Context b;
    protected ActionMenuView c;
    protected yh d;
    public int e;
    protected qg f;
    private boolean g;
    private boolean h;

    xs(Context context) {
        this(context, (AttributeSet) null);
    }

    protected static int a(int i, int i2, boolean z) {
        return !z ? i + i2 : i - i2;
    }

    public void a(int i) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, uh.a, R.attr.actionBarStyle, 0);
        a(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        yh yhVar = this.d;
        if (yhVar != null) {
            yhVar.k = vp.a(yhVar.b).a();
            wt wtVar = yhVar.c;
            if (wtVar != null) {
                wtVar.b(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            qg qgVar = this.f;
            if (qgVar != null) {
                qgVar.a();
            }
            super.setVisibility(i);
        }
    }

    public xs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static final int a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public xs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new xr(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static final int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final qg a(int i, long j) {
        qg qgVar = this.f;
        if (qgVar != null) {
            qgVar.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            qg m = qb.m(this);
            m.a(1.0f);
            m.a(j);
            xr xrVar = this.a;
            xrVar.a(m, 0);
            m.a((qh) xrVar);
            return m;
        }
        qg m2 = qb.m(this);
        m2.a(0.0f);
        m2.a(j);
        xr xrVar2 = this.a;
        xrVar2.a(m2, i);
        m2.a((qh) xrVar2);
        return m2;
    }
}
