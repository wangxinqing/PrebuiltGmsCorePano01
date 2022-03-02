package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, xi, yi {
    public ww b;
    public ws c;
    public wf d;
    private CharSequence e;
    private Drawable f;
    private aav g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        return i2 >= 480 || configuration.orientation == 2;
    }

    private final void g() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && ((this.b.m & 4) != 4 || !this.h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.b.k;
        if (!TextUtils.isEmpty(charSequence4)) {
            setContentDescription(charSequence4);
        } else {
            if (!z3) {
                charSequence2 = this.b.d;
            } else {
                charSequence2 = null;
            }
            setContentDescription(charSequence2);
        }
        CharSequence charSequence5 = this.b.l;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.b.d;
            }
            afg.a(this, charSequence3);
            return;
        }
        afg.a(this, charSequence5);
    }

    public final ww a() {
        return this.b;
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean d() {
        return c() && this.b.getIcon() == null;
    }

    public final boolean e() {
        return c();
    }

    public void onClick(View view) {
        ws wsVar = this.c;
        if (wsVar != null) {
            wsVar.a(this.b);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        boolean c2 = c();
        if (c2 && (i5 = this.j) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, this.i);
        } else {
            i4 = this.i;
        }
        if (mode != 1073741824 && this.i > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY), i3);
        }
        if (!c2 && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aav aav;
        if (!this.b.hasSubMenu() || (aav = this.g) == null || !aav.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.j = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ww wwVar) {
        this.b = wwVar;
        Drawable icon = wwVar.getIcon();
        this.f = icon;
        int i2 = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i3 = this.k;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i3) / ((float) intrinsicWidth)));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
            } else {
                i3 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(icon, (Drawable) null, (Drawable) null, (Drawable) null);
        g();
        this.e = wwVar.a((xi) this);
        g();
        setId(wwVar.a);
        if (!wwVar.isVisible()) {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(wwVar.isEnabled());
        if (wwVar.hasSubMenu() && this.g == null) {
            this.g = new we(this);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.h = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uh.c, i2, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }
}
