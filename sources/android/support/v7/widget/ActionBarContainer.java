package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionBarContainer extends FrameLayout {
    public View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private View h;
    private int i;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(boolean z) {
        this.g = z;
        setDescendantFocusability(!z ? 262144 : 393216);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(getDrawableState());
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.c.setState(getDrawableState());
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null && drawable3.isStateful()) {
            this.d.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.e) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            boolean z2 = true;
            if (this.b == null) {
                z2 = false;
            } else if (this.a.getVisibility() == 0) {
                this.b.setBounds(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom());
            } else {
                View view = this.h;
                if (view != null && view.getVisibility() == 0) {
                    this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else {
                    this.b.setBounds(0, 0, 0, 0);
                }
            }
            this.f = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.a == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.a != null) {
            View.MeasureSpec.getMode(i3);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b || this.e) {
            return (drawable == this.d && this.e) || super.verifyDrawable(drawable);
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        qb.a((View) this, (Drawable) new xt(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh.a);
        boolean z = false;
        this.b = obtainStyledAttributes.getDrawable(0);
        this.c = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.e) {
            if (this.b == null && this.c == null) {
                z = true;
            }
        } else if (this.d == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
