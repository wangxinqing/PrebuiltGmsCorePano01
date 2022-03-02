package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TextInputLayout extends LinearLayout {
    private int A;
    private ColorStateList B;
    private ColorStateList C;
    private CharSequence D;
    private final TextView E;
    private final TextView F;
    private boolean G;
    private CharSequence H;
    private ajzf I;
    private ajzl J;
    private final int K;
    private final int L;
    private int M;
    private final int N;
    private final int O;
    private int P;
    private final Rect Q;
    private final Rect R;
    private final RectF S;
    private final CheckableImageButton T;
    private ColorStateList U;
    private boolean V;
    private PorterDuff.Mode W;
    public EditText a;
    private boolean aA;
    private boolean aB;
    private ValueAnimator aC;
    private boolean aD;
    private boolean aa;
    private Drawable ab;
    private int ac;
    private final LinkedHashSet ad;
    private int ae;
    private final SparseArray af;
    private ColorStateList ag;
    private boolean ah;
    private PorterDuff.Mode ai;
    private boolean aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private final CheckableImageButton an;
    private ColorStateList ao;
    private ColorStateList ap;
    private ColorStateList aq;
    private int ar;
    private int as;
    private int at;
    private ColorStateList au;
    private int av;
    private final int aw;
    private final int ax;
    private final int ay;
    private int az;
    public boolean b;
    public int c;
    public boolean d;
    public TextView e;
    public boolean f;
    public CharSequence g;
    public boolean h;
    public ajzf i;
    public int j;
    public int k;
    public final CheckableImageButton l;
    public final LinkedHashSet m;
    public final ajxj n;
    public boolean o;
    private final FrameLayout p;
    private final LinearLayout q;
    private final LinearLayout r;
    private final FrameLayout s;
    private CharSequence t;
    private final akcn u;
    private int v;
    private int w;
    private CharSequence x;
    private TextView y;
    private ColorStateList z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new akdd();
        CharSequence c;
        boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() != 1 ? false : true;
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 35 + String.valueOf(valueOf).length());
            sb.append("TextInputLayout.SavedState{");
            sb.append(hexString);
            sb.append(" error=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private final boolean A() {
        return this.ae != 0;
    }

    private final void B() {
        a(this.l, this.ah, this.ag, this.aj, this.ai);
    }

    private final boolean C() {
        boolean z2;
        if (this.a == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if ((this.T.getDrawable() != null || this.D != null) && this.q.getMeasuredWidth() > 0) {
            int measuredWidth = this.q.getMeasuredWidth() - this.a.getPaddingLeft();
            if (this.ab == null || this.ac != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ab = colorDrawable;
                this.ac = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] b2 = ry.b(this.a);
            Drawable drawable = b2[0];
            Drawable drawable2 = this.ab;
            if (drawable != drawable2) {
                ry.a(this.a, drawable2, b2[1], b2[2], b2[3]);
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (this.ab != null) {
            Drawable[] b3 = ry.b(this.a);
            ry.a(this.a, (Drawable) null, b3[1], b3[2], b3[3]);
            this.ab = null;
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.an.getVisibility() == 0 || ((A() && g()) || this.g != null)) && this.r.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.F.getMeasuredWidth() - this.a.getPaddingRight();
            if (this.an.getVisibility() == 0) {
                checkableImageButton = this.an;
            } else if (A() && g()) {
                checkableImageButton = this.l;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ph.a((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams());
            }
            Drawable[] b4 = ry.b(this.a);
            Drawable drawable3 = this.ak;
            if (drawable3 == null || this.al == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.ak = colorDrawable2;
                    this.al = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = b4[2];
                Drawable drawable5 = this.ak;
                if (drawable4 != drawable5) {
                    this.am = drawable4;
                    ry.a(this.a, b4[0], b4[1], drawable5, b4[3]);
                    return true;
                }
            } else {
                this.al = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                ry.a(this.a, b4[0], b4[1], this.ak, b4[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] b5 = ry.b(this.a);
            if (b5[2] == this.ak) {
                ry.a(this.a, b5[0], b5[1], this.am, b5[3]);
            } else {
                z3 = z2;
            }
            this.ak = null;
            return z3;
        }
        return z2;
    }

    private final boolean D() {
        return this.G && !TextUtils.isEmpty(this.H) && (this.i instanceof akbz);
    }

    private final void E() {
        float f2;
        float f3;
        if (D()) {
            RectF rectF = this.S;
            ajxj ajxj = this.n;
            int width = this.a.getWidth();
            int gravity = this.a.getGravity();
            boolean a2 = ajxj.a(ajxj.f);
            ajxj.g = a2;
            if (gravity == 17 || (gravity & 7) == 1) {
                f2 = (((float) width) / 2.0f) - (ajxj.a() / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                f2 = !a2 ? ((float) ajxj.b.right) - ajxj.a() : (float) ajxj.b.left;
            } else {
                f2 = a2 ? ((float) ajxj.b.right) - ajxj.a() : (float) ajxj.b.left;
            }
            rectF.left = f2;
            rectF.top = (float) ajxj.b.top;
            if (gravity == 17 || (gravity & 7) == 1) {
                f3 = (((float) width) / 2.0f) + (ajxj.a() / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                f3 = !ajxj.g ? (float) ajxj.b.right : rectF.left + ajxj.a();
            } else {
                f3 = ajxj.g ? (float) ajxj.b.right : rectF.left + ajxj.a();
            }
            rectF.right = f3;
            rectF.bottom = ((float) ajxj.b.top) + ajxj.b();
            rectF.left -= (float) this.K;
            rectF.top -= (float) this.K;
            rectF.right += (float) this.K;
            rectF.bottom += (float) this.K;
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((akbz) this.i).a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private final int a(int i2, boolean z2) {
        int compoundPaddingLeft = i2 + this.a.getCompoundPaddingLeft();
        return (this.D == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - this.E.getMeasuredWidth()) + this.E.getPaddingLeft();
    }

    private final int b(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.a.getCompoundPaddingRight();
        return (this.D == null || !z2) ? compoundPaddingRight : compoundPaddingRight + this.E.getMeasuredWidth() + this.E.getPaddingRight();
    }

    private final void g(boolean z2) {
        if (this.f != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.y = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_placeholder);
                qb.f(this.y, 1);
                c(this.A);
                a(this.z);
                TextView textView = this.y;
                if (textView != null) {
                    this.p.addView(textView);
                    this.y.setVisibility(0);
                }
            } else {
                TextView textView2 = this.y;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.y = null;
            }
            this.f = z2;
        }
    }

    private final void h(boolean z2) {
        int i2 = 8;
        this.an.setVisibility(!z2 ? 8 : 0);
        FrameLayout frameLayout = this.s;
        if (!z2) {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
        t();
        if (!A()) {
            C();
        }
    }

    private final void l() {
        int i2 = this.j;
        if (i2 == 0) {
            this.i = null;
            this.I = null;
        } else if (i2 == 1) {
            this.i = new ajzf(this.J);
            this.I = new ajzf();
        } else if (i2 == 2) {
            if (this.G && !(this.i instanceof akbz)) {
                this.i = new akbz(this.J);
            } else {
                this.i = new ajzf(this.J);
            }
            this.I = null;
        } else {
            StringBuilder sb = new StringBuilder(72);
            sb.append(i2);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        EditText editText = this.a;
        if (!(editText == null || this.i == null || editText.getBackground() != null || this.j == 0)) {
            qb.a((View) this.a, (Drawable) this.i);
        }
        i();
        if (this.j != 0) {
            m();
        }
    }

    private final void m() {
        if (this.j != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.p.getLayoutParams();
            int v2 = v();
            if (v2 != layoutParams.topMargin) {
                layoutParams.topMargin = v2;
                this.p.requestLayout();
            }
        }
    }

    private final void n() {
        if (this.e != null) {
            EditText editText = this.a;
            a(editText != null ? editText.getText().length() : 0);
        }
    }

    private final void o() {
        TextView textView = this.y;
        if (textView != null && this.f) {
            textView.setText(this.x);
            this.y.setVisibility(0);
            this.y.bringToFront();
        }
    }

    private final void p() {
        TextView textView = this.y;
        if (textView != null && this.f) {
            textView.setText((CharSequence) null);
            this.y.setVisibility(4);
        }
    }

    private final void q() {
        TextView textView = this.E;
        int i2 = 8;
        if (this.D != null && !this.aA) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        C();
    }

    private final void r() {
        int i2;
        if (this.a != null) {
            TextView textView = this.E;
            if (!f()) {
                i2 = this.a.getPaddingLeft();
            } else {
                i2 = 0;
            }
            textView.setPadding(i2, this.a.getCompoundPaddingTop(), this.E.getCompoundPaddingRight(), this.a.getCompoundPaddingBottom());
        }
    }

    private final void s() {
        boolean z2;
        int visibility = this.F.getVisibility();
        int i2 = 0;
        if (this.g == null || this.aA) {
            z2 = false;
        } else {
            z2 = true;
        }
        TextView textView = this.F;
        if (!z2) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (visibility != this.F.getVisibility()) {
            y().a(z2);
        }
        C();
    }

    private final void t() {
        if (this.a != null) {
            TextView textView = this.F;
            int paddingLeft = textView.getPaddingLeft();
            int paddingTop = this.a.getPaddingTop();
            int i2 = 0;
            if (!g() && this.an.getVisibility() != 0) {
                i2 = this.a.getPaddingRight();
            }
            textView.setPadding(paddingLeft, paddingTop, i2, this.a.getPaddingBottom());
        }
    }

    private final void u() {
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.e;
        if (textView != null) {
            if (!this.d) {
                i2 = this.w;
            } else {
                i2 = this.v;
            }
            a(textView, i2);
            if (!this.d && (colorStateList2 = this.B) != null) {
                this.e.setTextColor(colorStateList2);
            }
            if (this.d && (colorStateList = this.C) != null) {
                this.e.setTextColor(colorStateList);
            }
        }
    }

    private final int v() {
        if (!this.G) {
            return 0;
        }
        int i2 = this.j;
        if (i2 == 0 || i2 == 1) {
            return (int) this.n.b();
        }
        if (i2 != 2) {
            return 0;
        }
        return (int) (this.n.b() / 2.0f);
    }

    private final boolean w() {
        if (this.j != 1) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return this.a.getMinLines() <= 1;
    }

    private final boolean x() {
        return this.M >= 0 && this.P != 0;
    }

    private final akcl y() {
        akcl akcl = (akcl) this.af.get(this.ae);
        return akcl == null ? (akcl) this.af.get(0) : akcl;
    }

    private final void z() {
        a(this.T, this.V, this.U, this.aa, this.W);
    }

    public final CharSequence a() {
        if (this.G) {
            return this.H;
        }
        return null;
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.p.addView(view, layoutParams2);
            this.p.setLayoutParams(layoutParams);
            m();
            EditText editText = (EditText) view;
            if (this.a == null) {
                if (this.ae != 3 && !(editText instanceof TextInputEditText)) {
                    Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
                }
                this.a = editText;
                l();
                a(new akdb(this));
                ajxj ajxj = this.n;
                Typeface typeface = this.a.getTypeface();
                boolean a2 = ajxj.a(typeface);
                boolean b2 = ajxj.b(typeface);
                if (a2 || b2) {
                    ajxj.e();
                }
                this.n.a(this.a.getTextSize());
                int gravity = this.a.getGravity();
                this.n.b((gravity & -113) | 48);
                this.n.a(gravity);
                this.a.addTextChangedListener(new akcx(this));
                if (this.ap == null) {
                    this.ap = this.a.getHintTextColors();
                }
                if (this.G) {
                    if (TextUtils.isEmpty(this.H)) {
                        CharSequence hint = this.a.getHint();
                        this.t = hint;
                        a(hint);
                        this.a.setHint((CharSequence) null);
                    }
                    this.h = true;
                }
                if (this.e != null) {
                    a(this.a.getText().length());
                }
                c();
                this.u.c();
                this.q.bringToFront();
                this.r.bringToFront();
                this.s.bringToFront();
                this.an.bringToFront();
                Iterator it = this.ad.iterator();
                while (it.hasNext()) {
                    ((akdc) it.next()).a(this);
                }
                r();
                t();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                a(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i2, layoutParams);
    }

    public final boolean b() {
        return this.u.m;
    }

    public final void c() {
        Drawable background;
        TextView textView;
        EditText editText = this.a;
        if (editText != null && this.j == 0 && (background = editText.getBackground()) != null) {
            if (aak.c(background)) {
                background = background.mutate();
            }
            if (this.u.d()) {
                background.setColorFilter(yu.a(this.u.e(), PorterDuff.Mode.SRC_IN));
            } else if (this.d && (textView = this.e) != null) {
                background.setColorFilter(yu.a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                ma.e(background);
                this.a.refreshDrawableState();
            }
        }
    }

    public final CharSequence d() {
        akcn akcn = this.u;
        if (akcn.g) {
            return akcn.f;
        }
        return null;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.t == null || (editText = this.a) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.h;
        this.h = false;
        CharSequence hint = editText.getHint();
        this.a.setHint(this.t);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.a.setHint(hint);
            this.h = z2;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.o = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.o = false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.G) {
            this.n.a(canvas);
        }
        ajzf ajzf = this.I;
        if (ajzf != null) {
            Rect bounds = ajzf.getBounds();
            bounds.top = bounds.bottom - this.M;
            this.I.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        boolean z2;
        if (!this.aD) {
            boolean z3 = true;
            this.aD = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            ajxj ajxj = this.n;
            if (ajxj != null) {
                z2 = ajxj.a(drawableState);
            } else {
                z2 = false;
            }
            if (this.a != null) {
                if (!qb.A(this) || !isEnabled()) {
                    z3 = false;
                }
                a(z3);
            }
            c();
            i();
            if (z2) {
                invalidate();
            }
            this.aD = false;
        }
    }

    public final CharSequence e() {
        akcn akcn = this.u;
        if (akcn.m) {
            return akcn.l;
        }
        return null;
    }

    public final void f(boolean z2) {
        this.l.a(z2);
    }

    public final int getBaseline() {
        EditText editText = this.a;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + v();
        }
        return super.getBaseline();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r6 = this;
            ajzf r0 = r6.i
            if (r0 == 0) goto L_0x017e
            int r0 = r6.j
            if (r0 == 0) goto L_0x017e
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001e
            android.widget.EditText r0 = r6.a
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x001e
            r0 = 0
            goto L_0x001f
        L_0x001c:
            r0 = 0
            goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.a
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 != 0) goto L_0x0033
            r3 = 0
            goto L_0x0034
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto L_0x0077
            akcn r4 = r6.u
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x0053
            android.content.res.ColorStateList r4 = r6.au
            if (r4 != 0) goto L_0x004f
            akcn r4 = r6.u
            int r4 = r4.e()
            r6.P = r4
            goto L_0x007b
        L_0x004f:
            r6.b((boolean) r0, (boolean) r3)
            goto L_0x007b
        L_0x0053:
            boolean r4 = r6.d
            if (r4 == 0) goto L_0x006a
            android.widget.TextView r4 = r6.e
            if (r4 == 0) goto L_0x006a
            android.content.res.ColorStateList r5 = r6.au
            if (r5 != 0) goto L_0x0066
            int r4 = r4.getCurrentTextColor()
            r6.P = r4
            goto L_0x007b
        L_0x0066:
            r6.b((boolean) r0, (boolean) r3)
            goto L_0x007b
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            int r4 = r6.at
            goto L_0x0079
        L_0x006f:
            if (r3 != 0) goto L_0x0074
            int r4 = r6.ar
            goto L_0x0079
        L_0x0074:
            int r4 = r6.as
            goto L_0x0079
        L_0x0077:
            int r4 = r6.az
        L_0x0079:
            r6.P = r4
        L_0x007b:
            com.google.android.material.internal.CheckableImageButton r4 = r6.an
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            if (r4 == 0) goto L_0x0091
            akcn r4 = r6.u
            boolean r5 = r4.g
            if (r5 == 0) goto L_0x0091
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x0091
            r1 = 1
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            r6.h(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.an
            android.content.res.ColorStateList r4 = r6.ao
            r6.a((com.google.android.material.internal.CheckableImageButton) r1, (android.content.res.ColorStateList) r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.T
            android.content.res.ColorStateList r4 = r6.U
            r6.a((com.google.android.material.internal.CheckableImageButton) r1, (android.content.res.ColorStateList) r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.l
            android.content.res.ColorStateList r4 = r6.ag
            r6.a((com.google.android.material.internal.CheckableImageButton) r1, (android.content.res.ColorStateList) r4)
            akcl r1 = r6.y()
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00e1
            akcn r1 = r6.u
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00de
            android.graphics.drawable.Drawable r1 = r6.h()
            if (r1 != 0) goto L_0x00c3
            goto L_0x00de
        L_0x00c3:
            android.graphics.drawable.Drawable r1 = r6.h()
            android.graphics.drawable.Drawable r1 = defpackage.ma.f(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            akcn r4 = r6.u
            int r4 = r4.e()
            defpackage.ma.a((android.graphics.drawable.Drawable) r1, (int) r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.l
            r4.setImageDrawable(r1)
            goto L_0x00e1
        L_0x00de:
            r6.B()
        L_0x00e1:
            if (r0 != 0) goto L_0x00e4
            goto L_0x00ef
        L_0x00e4:
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00ef
            int r1 = r6.O
            r6.M = r1
            goto L_0x00f3
        L_0x00ef:
            int r1 = r6.N
            r6.M = r1
        L_0x00f3:
            int r1 = r6.j
            if (r1 == r2) goto L_0x00f8
            goto L_0x0112
        L_0x00f8:
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x0103
            int r0 = r6.aw
        L_0x0100:
            r6.k = r0
            goto L_0x0112
        L_0x0103:
            if (r3 == 0) goto L_0x010a
            if (r0 != 0) goto L_0x010a
            int r0 = r6.ay
            goto L_0x0100
        L_0x010a:
            if (r0 != 0) goto L_0x010f
            int r0 = r6.av
            goto L_0x0100
        L_0x010f:
            int r0 = r6.ax
            goto L_0x0100
        L_0x0112:
            ajzf r0 = r6.i
            if (r0 == 0) goto L_0x017d
            ajzl r1 = r6.J
            r0.a((defpackage.ajzl) r1)
            int r0 = r6.j
            r1 = 2
            if (r0 == r1) goto L_0x0121
            goto L_0x0131
        L_0x0121:
            boolean r0 = r6.x()
            if (r0 == 0) goto L_0x0131
            ajzf r0 = r6.i
            int r1 = r6.M
            float r1 = (float) r1
            int r3 = r6.P
            r0.a((float) r1, (int) r3)
        L_0x0131:
            int r0 = r6.k
            int r1 = r6.j
            if (r1 != r2) goto L_0x0148
            android.content.Context r0 = r6.getContext()
            r1 = 2130968899(0x7f040143, float:1.7546465E38)
            int r0 = defpackage.ajuo.a((android.content.Context) r0, (int) r1)
            int r1 = r6.k
            int r0 = defpackage.lk.a(r1, r0)
        L_0x0148:
            r6.k = r0
            ajzf r1 = r6.i
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.c((android.content.res.ColorStateList) r0)
            int r0 = r6.ae
            r1 = 3
            if (r0 != r1) goto L_0x0161
            android.widget.EditText r0 = r6.a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x0161:
            ajzf r0 = r6.I
            if (r0 == 0) goto L_0x0179
            boolean r0 = r6.x()
            if (r0 == 0) goto L_0x0176
            ajzf r0 = r6.I
            int r1 = r6.P
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.c((android.content.res.ColorStateList) r1)
        L_0x0176:
            r6.invalidate()
        L_0x0179:
            r6.invalidate()
            return
        L_0x017d:
            return
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    public final void j() {
        a(this.T, (View.OnClickListener) null);
    }

    public final void k() {
        a(this.T);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.a;
        if (editText != null) {
            Rect rect = this.Q;
            ajxk.a((ViewGroup) this, (View) editText, rect);
            if (this.I != null) {
                this.I.setBounds(rect.left, rect.bottom - this.O, rect.right, rect.bottom);
            }
            if (this.G) {
                this.n.a(this.a.getTextSize());
                int gravity = this.a.getGravity();
                this.n.b((gravity & -113) | 48);
                this.n.a(gravity);
                ajxj ajxj = this.n;
                if (this.a != null) {
                    Rect rect2 = this.R;
                    if (qb.h(this) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    rect2.bottom = rect.bottom;
                    int i8 = this.j;
                    if (i8 == 1) {
                        rect2.left = a(rect.left, z3);
                        rect2.top = rect.top + this.L;
                        rect2.right = b(rect.right, z3);
                    } else if (i8 != 2) {
                        rect2.left = a(rect.left, z3);
                        rect2.top = getPaddingTop();
                        rect2.right = b(rect.right, z3);
                    } else {
                        rect2.left = rect.left + this.a.getPaddingLeft();
                        rect2.top = rect.top - v();
                        rect2.right = rect.right - this.a.getPaddingRight();
                    }
                    ajxj.b(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    ajxj ajxj2 = this.n;
                    if (this.a != null) {
                        Rect rect3 = this.R;
                        TextPaint textPaint = ajxj2.h;
                        textPaint.setTextSize(ajxj2.c);
                        textPaint.setTypeface(ajxj2.e);
                        float f2 = -ajxj2.h.ascent();
                        rect3.left = rect.left + this.a.getCompoundPaddingLeft();
                        if (w()) {
                            i6 = (int) (((float) rect.centerY()) - (f2 / 2.0f));
                        } else {
                            i6 = rect.top + this.a.getCompoundPaddingTop();
                        }
                        rect3.top = i6;
                        rect3.right = rect.right - this.a.getCompoundPaddingRight();
                        if (w()) {
                            i7 = (int) (((float) rect3.top) + f2);
                        } else {
                            i7 = rect.bottom - this.a.getCompoundPaddingBottom();
                        }
                        rect3.bottom = i7;
                        ajxj2.a(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        this.n.e();
                        if (D() && !this.aA) {
                            E();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z2 = false;
        if (this.a != null && this.a.getMeasuredHeight() < (max = Math.max(this.r.getMeasuredHeight(), this.q.getMeasuredHeight()))) {
            this.a.setMinimumHeight(max);
            z2 = true;
        }
        boolean C2 = C();
        if (z2 || C2) {
            this.a.post(new akcz(this));
        }
        if (this.y != null && (editText = this.a) != null) {
            this.y.setGravity((editText.getGravity() & -113) | 48);
            this.y.setPadding(this.a.getCompoundPaddingLeft(), this.a.getCompoundPaddingTop(), this.a.getCompoundPaddingRight(), this.a.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        b(savedState.c);
        if (savedState.d) {
            this.l.post(new akcy(this));
        }
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.u.d()) {
            savedState.c = d();
        }
        boolean z2 = false;
        if (A() && this.l.a) {
            z2 = true;
        }
        savedState.d = z2;
        return savedState;
    }

    public final void setEnabled(boolean z2) {
        a((ViewGroup) this, z2);
        super.setEnabled(z2);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public final void d(int i2) {
        boolean z2;
        int i3 = this.ae;
        this.ae = i2;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        e(z2);
        if (y().a(this.j)) {
            y().a();
            B();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                akct akct = (akct) it.next();
                EditText editText = this.a;
                if (editText != null && i3 == 1) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            return;
        }
        int i4 = this.j;
        StringBuilder sb = new StringBuilder(93);
        sb.append("The current box background mode ");
        sb.append(i4);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final void e(boolean z2) {
        if (g() != z2) {
            this.l.setVisibility(!z2 ? 8 : 0);
            t();
            C();
        }
    }

    public final boolean f() {
        return this.T.getVisibility() == 0;
    }

    public final Drawable h() {
        return this.l.getDrawable();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            r9 = 2132018794(0x7f14066a, float:1.9675905E38)
            r1 = r21
            android.content.Context r1 = defpackage.akdg.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            akcn r1 = new akcn
            r1.<init>(r0)
            r0.u = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.Q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.R = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.S = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.ad = r1
            r10 = 0
            r0.ae = r10
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.af = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.m = r1
            ajxj r1 = new ajxj
            r1.<init>(r0)
            r0.n = r1
            android.content.Context r11 = r20.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r11)
            r0.p = r1
            r1.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r1 = r0.p
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            r0.q = r1
            r1.setOrientation(r10)
            android.widget.LinearLayout r1 = r0.q
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r14 = -1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2.<init>(r13, r14, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.p
            android.widget.LinearLayout r2 = r0.q
            r1.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            r0.r = r1
            r1.setOrientation(r10)
            android.widget.LinearLayout r1 = r0.r
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r2.<init>(r13, r14, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.p
            android.widget.LinearLayout r2 = r0.r
            r1.addView(r2)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r11)
            r0.s = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r13, r14)
            r1.setLayoutParams(r2)
            ajxj r1 = r0.n
            android.animation.TimeInterpolator r2 = defpackage.ajrr.a
            r1.a((android.animation.TimeInterpolator) r2)
            ajxj r1 = r0.n
            android.animation.TimeInterpolator r2 = defpackage.ajrr.a
            r1.i = r2
            r1.e()
            ajxj r1 = r0.n
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.b((int) r2)
            int[] r3 = defpackage.akcw.c
            r15 = 5
            int[] r6 = new int[r15]
            r6 = {18, 16, 31, 35, 39} // fill-array
            r5 = 2132018794(0x7f14066a, float:1.9675905E38)
            r1 = r11
            r2 = r22
            r4 = r23
            aev r1 = defpackage.ajya.b(r1, r2, r3, r4, r5, r6)
            r2 = 38
            boolean r2 = r1.a((int) r2, (boolean) r12)
            r0.G = r2
            r2 = 2
            java.lang.CharSequence r3 = r1.c(r2)
            r0.a((java.lang.CharSequence) r3)
            r3 = 37
            boolean r3 = r1.a((int) r3, (boolean) r12)
            r0.aB = r3
            ajzk r3 = defpackage.ajzl.a((android.content.Context) r11, (android.util.AttributeSet) r7, (int) r8, (int) r9)
            ajzl r3 = r3.a()
            r0.J = r3
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2131166764(0x7f07062c, float:1.7947783E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.K = r3
            int r3 = r1.c(r15, r10)
            r0.L = r3
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2131166765(0x7f07062d, float:1.7947785E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r4 = 12
            int r3 = r1.d(r4, r3)
            r0.N = r3
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2131166766(0x7f07062e, float:1.7947787E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r4 = 13
            int r3 = r1.d(r4, r3)
            r0.O = r3
            int r3 = r0.N
            r0.M = r3
            r3 = 9
            float r3 = r1.g(r3)
            r4 = 8
            float r5 = r1.g(r4)
            r6 = 6
            float r6 = r1.g(r6)
            r7 = 7
            float r7 = r1.g(r7)
            ajzl r8 = r0.J
            ajzk r8 = r8.b()
            r9 = 0
            int r15 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r15 >= 0) goto L_0x0164
            goto L_0x0167
        L_0x0164:
            r8.c(r3)
        L_0x0167:
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x016c
            goto L_0x016f
        L_0x016c:
            r8.d(r5)
        L_0x016f:
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0174
            goto L_0x0177
        L_0x0174:
            r8.b(r6)
        L_0x0177:
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x017c
            goto L_0x017f
        L_0x017c:
            r8.a((float) r7)
        L_0x017f:
            ajzl r3 = r8.a()
            r0.J = r3
            r3 = 3
            android.content.res.ColorStateList r5 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r3)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01e1
            int r7 = r5.getDefaultColor()
            r0.av = r7
            r0.k = r7
            boolean r7 = r5.isStateful()
            if (r7 == 0) goto L_0x01be
            int[] r7 = new int[r12]
            r7[r10] = r6
            int r7 = r5.getColorForState(r7, r14)
            r0.aw = r7
            int[] r7 = new int[r2]
            r7 = {16842908, 16842910} // fill-array
            int r7 = r5.getColorForState(r7, r14)
            r0.ax = r7
            int[] r7 = new int[r2]
            r7 = {16843623, 16842910} // fill-array
            int r5 = r5.getColorForState(r7, r14)
            r0.ay = r5
            goto L_0x01eb
        L_0x01be:
            int r5 = r0.av
            r0.ax = r5
            r5 = 2131100720(0x7f060430, float:1.781383E38)
            android.content.res.ColorStateList r5 = defpackage.uj.a(r11, r5)
            int[] r7 = new int[r12]
            r7[r10] = r6
            int r7 = r5.getColorForState(r7, r14)
            r0.aw = r7
            int[] r7 = new int[r12]
            r8 = 16843623(0x1010367, float:2.3696E-38)
            r7[r10] = r8
            int r5 = r5.getColorForState(r7, r14)
            r0.ay = r5
            goto L_0x01eb
        L_0x01e1:
            r0.k = r10
            r0.av = r10
            r0.aw = r10
            r0.ax = r10
            r0.ay = r10
        L_0x01eb:
            boolean r5 = r1.f(r12)
            if (r5 == 0) goto L_0x01fa
            android.content.res.ColorStateList r5 = r1.e(r12)
            r0.aq = r5
            r0.ap = r5
        L_0x01fa:
            r5 = 10
            android.content.res.ColorStateList r7 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r5)
            int r5 = r1.h(r5)
            r0.at = r5
            r5 = 2131100738(0x7f060442, float:1.7813866E38)
            int r5 = defpackage.kf.b(r11, r5)
            r0.ar = r5
            r5 = 2131100739(0x7f060443, float:1.7813868E38)
            int r5 = defpackage.kf.b(r11, r5)
            r0.az = r5
            r5 = 2131100742(0x7f060446, float:1.7813874E38)
            int r5 = defpackage.kf.b(r11, r5)
            r0.as = r5
            if (r7 == 0) goto L_0x0262
            boolean r5 = r7.isStateful()
            if (r5 == 0) goto L_0x0251
            int r5 = r7.getDefaultColor()
            r0.ar = r5
            int[] r5 = new int[r12]
            r5[r10] = r6
            int r5 = r7.getColorForState(r5, r14)
            r0.az = r5
            int[] r5 = new int[r2]
            r5 = {16843623, 16842910} // fill-array
            int r5 = r7.getColorForState(r5, r14)
            r0.as = r5
            int[] r5 = new int[r2]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r7.getColorForState(r5, r14)
            r0.at = r5
            goto L_0x025f
        L_0x0251:
            int r5 = r0.at
            int r6 = r7.getDefaultColor()
            if (r5 == r6) goto L_0x025f
            int r5 = r7.getDefaultColor()
            r0.at = r5
        L_0x025f:
            r20.i()
        L_0x0262:
            r5 = 11
            boolean r6 = r1.f(r5)
            if (r6 == 0) goto L_0x0278
            android.content.res.ColorStateList r5 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r5)
            android.content.res.ColorStateList r6 = r0.au
            if (r6 == r5) goto L_0x0278
            r0.au = r5
            r20.i()
        L_0x0278:
            r5 = 39
            int r6 = r1.f(r5, r14)
            if (r6 == r14) goto L_0x029a
            int r5 = r1.f(r5, r10)
            ajxj r6 = r0.n
            r6.c((int) r5)
            ajxj r5 = r0.n
            android.content.res.ColorStateList r5 = r5.d
            r0.aq = r5
            android.widget.EditText r5 = r0.a
            if (r5 == 0) goto L_0x029a
            r0.a((boolean) r10)
            r20.m()
        L_0x029a:
            r5 = 31
            int r5 = r1.f(r5, r10)
            r6 = 26
            java.lang.CharSequence r6 = r1.c(r6)
            r7 = 27
            boolean r7 = r1.a((int) r7, (boolean) r10)
            android.content.Context r8 = r20.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            android.widget.LinearLayout r9 = r0.r
            r15 = 2131624265(0x7f0e0149, float:1.8875705E38)
            android.view.View r8 = r8.inflate(r15, r9, r10)
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r0.an = r8
            r8.setVisibility(r4)
            r8 = 28
            boolean r9 = r1.f(r8)
            if (r9 == 0) goto L_0x02d3
            android.graphics.drawable.Drawable r8 = r1.a(r8)
            r0.a((android.graphics.drawable.Drawable) r8)
        L_0x02d3:
            r8 = 29
            boolean r9 = r1.f(r8)
            if (r9 == 0) goto L_0x0304
            android.content.res.ColorStateList r8 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r8)
            r0.ao = r8
            com.google.android.material.internal.CheckableImageButton r9 = r0.an
            android.graphics.drawable.Drawable r9 = r9.getDrawable()
            if (r9 == 0) goto L_0x02f6
            android.graphics.drawable.Drawable r9 = defpackage.ma.f(r9)
            android.graphics.drawable.Drawable r9 = r9.mutate()
            defpackage.ma.a((android.graphics.drawable.Drawable) r9, (android.content.res.ColorStateList) r8)
            goto L_0x02f7
        L_0x02f6:
        L_0x02f7:
            com.google.android.material.internal.CheckableImageButton r8 = r0.an
            android.graphics.drawable.Drawable r8 = r8.getDrawable()
            if (r8 == r9) goto L_0x0304
            com.google.android.material.internal.CheckableImageButton r8 = r0.an
            r8.setImageDrawable(r9)
        L_0x0304:
            r8 = 30
            boolean r9 = r1.f(r8)
            r13 = 0
            if (r9 == 0) goto L_0x0338
            int r8 = r1.a((int) r8, (int) r14)
            android.graphics.PorterDuff$Mode r8 = defpackage.ajyf.a((int) r8, (android.graphics.PorterDuff.Mode) r13)
            com.google.android.material.internal.CheckableImageButton r9 = r0.an
            android.graphics.drawable.Drawable r9 = r9.getDrawable()
            if (r9 == 0) goto L_0x032a
            android.graphics.drawable.Drawable r9 = defpackage.ma.f(r9)
            android.graphics.drawable.Drawable r9 = r9.mutate()
            defpackage.ma.a((android.graphics.drawable.Drawable) r9, (android.graphics.PorterDuff.Mode) r8)
            goto L_0x032b
        L_0x032a:
        L_0x032b:
            com.google.android.material.internal.CheckableImageButton r8 = r0.an
            android.graphics.drawable.Drawable r8 = r8.getDrawable()
            if (r8 == r9) goto L_0x0338
            com.google.android.material.internal.CheckableImageButton r8 = r0.an
            r8.setImageDrawable(r9)
        L_0x0338:
            com.google.android.material.internal.CheckableImageButton r8 = r0.an
            android.content.res.Resources r9 = r20.getResources()
            r3 = 2131952629(0x7f1303f5, float:1.9541706E38)
            java.lang.CharSequence r3 = r9.getText(r3)
            r8.setContentDescription(r3)
            com.google.android.material.internal.CheckableImageButton r3 = r0.an
            defpackage.qb.b((android.view.View) r3, (int) r2)
            com.google.android.material.internal.CheckableImageButton r3 = r0.an
            r3.setClickable(r10)
            com.google.android.material.internal.CheckableImageButton r3 = r0.an
            r3.c = r10
            r3.setFocusable(r10)
            r3 = 35
            int r3 = r1.f(r3, r10)
            r8 = 34
            boolean r8 = r1.a((int) r8, (boolean) r10)
            r9 = 33
            java.lang.CharSequence r9 = r1.c(r9)
            r2 = 47
            int r2 = r1.f(r2, r10)
            r15 = 46
            java.lang.CharSequence r15 = r1.c(r15)
            r13 = 50
            int r13 = r1.f(r13, r10)
            r12 = 49
            java.lang.CharSequence r12 = r1.c(r12)
            r4 = 60
            int r4 = r1.f(r4, r10)
            r14 = 59
            java.lang.CharSequence r14 = r1.c(r14)
            r16 = r4
            r4 = 14
            boolean r4 = r1.a((int) r4, (boolean) r10)
            r10 = 15
            r17 = r4
            r4 = -1
            int r10 = r1.a((int) r10, (int) r4)
            int r4 = r0.c
            if (r4 != r10) goto L_0x03a5
            goto L_0x03b4
        L_0x03a5:
            if (r10 <= 0) goto L_0x03aa
            r0.c = r10
            goto L_0x03ad
        L_0x03aa:
            r4 = -1
            r0.c = r4
        L_0x03ad:
            boolean r4 = r0.b
            if (r4 == 0) goto L_0x03b4
            r20.n()
        L_0x03b4:
            r4 = 18
            r10 = 0
            int r4 = r1.f(r4, r10)
            r0.w = r4
            r4 = 16
            int r4 = r1.f(r4, r10)
            r0.v = r4
            android.content.Context r4 = r20.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r10 = 2131624266(0x7f0e014a, float:1.8875707E38)
            r18 = r14
            android.widget.LinearLayout r14 = r0.q
            r19 = r13
            r13 = 0
            android.view.View r4 = r4.inflate(r10, r14, r13)
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.T = r4
            r10 = 8
            r4.setVisibility(r10)
            r20.j()
            r20.k()
            r4 = 56
            boolean r10 = r1.f(r4)
            if (r10 == 0) goto L_0x0431
            android.graphics.drawable.Drawable r4 = r1.a(r4)
            com.google.android.material.internal.CheckableImageButton r10 = r0.T
            r10.setImageDrawable(r4)
            if (r4 == 0) goto L_0x0405
            r4 = 1
            r0.d((boolean) r4)
            r20.z()
            goto L_0x0414
        L_0x0405:
            r4 = 0
            r0.d((boolean) r4)
            r20.j()
            r20.k()
            r4 = 0
            r0.c((java.lang.CharSequence) r4)
        L_0x0414:
            r4 = 55
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x0425
            r4 = 55
            java.lang.CharSequence r4 = r1.c(r4)
            r0.c((java.lang.CharSequence) r4)
        L_0x0425:
            r4 = 54
            r10 = 1
            boolean r4 = r1.a((int) r4, (boolean) r10)
            com.google.android.material.internal.CheckableImageButton r10 = r0.T
            r10.a(r4)
        L_0x0431:
            r4 = 57
            boolean r10 = r1.f(r4)
            if (r10 == 0) goto L_0x044a
            android.content.res.ColorStateList r4 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r4)
            android.content.res.ColorStateList r10 = r0.U
            if (r10 == r4) goto L_0x044a
            r0.U = r4
            r4 = 1
            r0.V = r4
            r20.z()
        L_0x044a:
            r4 = 58
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x046a
            r4 = 58
            r10 = -1
            int r4 = r1.a((int) r4, (int) r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r4 = defpackage.ajyf.a((int) r4, (android.graphics.PorterDuff.Mode) r10)
            android.graphics.PorterDuff$Mode r10 = r0.W
            if (r10 == r4) goto L_0x046a
            r0.W = r4
            r4 = 1
            r0.aa = r4
            r20.z()
        L_0x046a:
            r4 = 4
            r10 = 0
            int r4 = r1.a((int) r4, (int) r10)
            int r10 = r0.j
            if (r4 != r10) goto L_0x0475
            goto L_0x047e
        L_0x0475:
            r0.j = r4
            android.widget.EditText r4 = r0.a
            if (r4 == 0) goto L_0x047e
            r20.l()
        L_0x047e:
            android.content.Context r4 = r20.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            android.widget.FrameLayout r10 = r0.s
            r13 = 2131624265(0x7f0e0149, float:1.8875705E38)
            r14 = 0
            android.view.View r4 = r4.inflate(r13, r10, r14)
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.l = r4
            android.widget.FrameLayout r10 = r0.s
            r10.addView(r4)
            com.google.android.material.internal.CheckableImageButton r4 = r0.l
            r10 = 8
            r4.setVisibility(r10)
            android.util.SparseArray r4 = r0.af
            akby r10 = new akby
            r10.<init>(r0)
            r13 = -1
            r4.append(r13, r10)
            android.util.SparseArray r4 = r0.af
            akcq r10 = new akcq
            r10.<init>(r0)
            r13 = 0
            r4.append(r13, r10)
            android.util.SparseArray r4 = r0.af
            akcv r10 = new akcv
            r10.<init>(r0)
            r13 = 1
            r4.append(r13, r10)
            android.util.SparseArray r4 = r0.af
            akbx r10 = new akbx
            r10.<init>(r0)
            r13 = 2
            r4.append(r13, r10)
            android.util.SparseArray r4 = r0.af
            akck r10 = new akck
            r10.<init>(r0)
            r13 = 3
            r4.append(r13, r10)
            r4 = 23
            boolean r4 = r1.f(r4)
            r10 = 43
            if (r4 == 0) goto L_0x0518
            r4 = 23
            r13 = 0
            int r4 = r1.a((int) r4, (int) r13)
            r0.d((int) r4)
            r4 = 22
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x04fc
            r4 = 22
            android.graphics.drawable.Drawable r4 = r1.a(r4)
            r0.b((android.graphics.drawable.Drawable) r4)
        L_0x04fc:
            r4 = 21
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x050d
            r4 = 21
            java.lang.CharSequence r4 = r1.c(r4)
            r0.d((java.lang.CharSequence) r4)
        L_0x050d:
            r4 = 20
            r13 = 1
            boolean r4 = r1.a((int) r4, (boolean) r13)
            r0.f(r4)
            goto L_0x0561
        L_0x0518:
            boolean r4 = r1.f(r10)
            if (r4 == 0) goto L_0x0561
            r4 = 0
            boolean r13 = r1.a((int) r10, (boolean) r4)
            r0.d((int) r13)
            r4 = 42
            android.graphics.drawable.Drawable r4 = r1.a(r4)
            r0.b((android.graphics.drawable.Drawable) r4)
            r4 = 41
            java.lang.CharSequence r4 = r1.c(r4)
            r0.d((java.lang.CharSequence) r4)
            r4 = 44
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x054a
            r4 = 44
            android.content.res.ColorStateList r4 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r4)
            r0.b((android.content.res.ColorStateList) r4)
        L_0x054a:
            r4 = 45
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x0561
            r4 = 45
            r13 = -1
            int r4 = r1.a((int) r4, (int) r13)
            r13 = 0
            android.graphics.PorterDuff$Mode r4 = defpackage.ajyf.a((int) r4, (android.graphics.PorterDuff.Mode) r13)
            r0.a((android.graphics.PorterDuff.Mode) r4)
        L_0x0561:
            boolean r4 = r1.f(r10)
            if (r4 != 0) goto L_0x0590
            r4 = 24
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x0579
            r4 = 24
            android.content.res.ColorStateList r4 = defpackage.ajym.a((android.content.Context) r11, (defpackage.aev) r1, (int) r4)
            r0.b((android.content.res.ColorStateList) r4)
        L_0x0579:
            r4 = 25
            boolean r4 = r1.f(r4)
            if (r4 == 0) goto L_0x0590
            r4 = 25
            r10 = -1
            int r4 = r1.a((int) r4, (int) r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r4 = defpackage.ajyf.a((int) r4, (android.graphics.PorterDuff.Mode) r10)
            r0.a((android.graphics.PorterDuff.Mode) r4)
        L_0x0590:
            android.support.v7.widget.AppCompatTextView r4 = new android.support.v7.widget.AppCompatTextView
            r4.<init>(r11)
            r0.E = r4
            r10 = 2131429673(0x7f0b0929, float:1.8481025E38)
            r4.setId(r10)
            android.widget.TextView r4 = r0.E
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r10.<init>(r13, r13)
            r4.setLayoutParams(r10)
            android.widget.TextView r4 = r0.E
            r10 = 1
            defpackage.qb.f(r4, r10)
            android.widget.LinearLayout r4 = r0.q
            com.google.android.material.internal.CheckableImageButton r10 = r0.T
            r4.addView(r10)
            android.widget.LinearLayout r4 = r0.q
            android.widget.TextView r10 = r0.E
            r4.addView(r10)
            android.support.v7.widget.AppCompatTextView r4 = new android.support.v7.widget.AppCompatTextView
            r4.<init>(r11)
            r0.F = r4
            r10 = 2131429674(0x7f0b092a, float:1.8481027E38)
            r4.setId(r10)
            android.widget.TextView r4 = r0.F
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = 80
            r13 = -2
            r10.<init>(r13, r13, r11)
            r4.setLayoutParams(r10)
            android.widget.TextView r4 = r0.F
            r10 = 1
            defpackage.qb.f(r4, r10)
            android.widget.LinearLayout r4 = r0.r
            android.widget.TextView r10 = r0.F
            r4.addView(r10)
            android.widget.LinearLayout r4 = r0.r
            com.google.android.material.internal.CheckableImageButton r10 = r0.an
            r4.addView(r10)
            android.widget.LinearLayout r4 = r0.r
            android.widget.FrameLayout r10 = r0.s
            r4.addView(r10)
            r0.c((boolean) r8)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x0605
            boolean r4 = r20.b()
            if (r4 == 0) goto L_0x062e
            r4 = 0
            r0.c((boolean) r4)
            goto L_0x062e
        L_0x0605:
            boolean r4 = r20.b()
            if (r4 != 0) goto L_0x060f
            r4 = 1
            r0.c((boolean) r4)
        L_0x060f:
            akcn r4 = r0.u
            r4.b()
            r4.l = r9
            android.widget.TextView r8 = r4.n
            r8.setText(r9)
            int r8 = r4.d
            r10 = 2
            if (r8 != r10) goto L_0x0621
            goto L_0x0623
        L_0x0621:
            r4.e = r10
        L_0x0623:
            int r10 = r4.e
            android.widget.TextView r11 = r4.n
            boolean r9 = r4.a((android.widget.TextView) r11, (java.lang.CharSequence) r9)
            r4.a(r8, r10, r9)
        L_0x062e:
            akcn r4 = r0.u
            r4.b((int) r3)
            r0.b((boolean) r7)
            akcn r3 = r0.u
            r3.a((int) r5)
            akcn r3 = r0.u
            r3.a((java.lang.CharSequence) r6)
            boolean r3 = r0.f
            if (r3 == 0) goto L_0x0651
            boolean r3 = android.text.TextUtils.isEmpty(r15)
            if (r3 != 0) goto L_0x064b
            goto L_0x0651
        L_0x064b:
            r3 = 0
            r0.g(r3)
            goto L_0x065b
        L_0x0651:
            boolean r3 = r0.f
            if (r3 != 0) goto L_0x0659
            r3 = 1
            r0.g(r3)
        L_0x0659:
            r0.x = r15
        L_0x065b:
            android.widget.EditText r3 = r0.a
            if (r3 == 0) goto L_0x0668
            android.text.Editable r3 = r3.getText()
            int r3 = r3.length()
            goto L_0x0669
        L_0x0668:
            r3 = 0
        L_0x0669:
            r0.b((int) r3)
            r0.c((int) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto L_0x0677
            r4 = r12
            goto L_0x0678
        L_0x0677:
            r4 = 0
        L_0x0678:
            r0.D = r4
            android.widget.TextView r2 = r0.E
            r2.setText(r12)
            r20.q()
            android.widget.TextView r2 = r0.E
            r3 = r19
            defpackage.ry.a((android.widget.TextView) r2, (int) r3)
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 != 0) goto L_0x0692
            r4 = r18
            goto L_0x0693
        L_0x0692:
            r4 = 0
        L_0x0693:
            r0.g = r4
            android.widget.TextView r2 = r0.F
            r3 = r18
            r2.setText(r3)
            r20.s()
            android.widget.TextView r2 = r0.F
            r3 = r16
            defpackage.ry.a((android.widget.TextView) r2, (int) r3)
            r2 = 32
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x06b9
            r2 = 32
            android.content.res.ColorStateList r2 = r1.e(r2)
            akcn r3 = r0.u
            r3.a((android.content.res.ColorStateList) r2)
        L_0x06b9:
            r2 = 36
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x06cc
            r2 = 36
            android.content.res.ColorStateList r2 = r1.e(r2)
            akcn r3 = r0.u
            r3.b((android.content.res.ColorStateList) r2)
        L_0x06cc:
            r2 = 40
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x06f3
            r2 = 40
            android.content.res.ColorStateList r2 = r1.e(r2)
            android.content.res.ColorStateList r3 = r0.aq
            if (r3 != r2) goto L_0x06df
            goto L_0x06f3
        L_0x06df:
            android.content.res.ColorStateList r3 = r0.ap
            if (r3 == 0) goto L_0x06e4
            goto L_0x06e9
        L_0x06e4:
            ajxj r3 = r0.n
            r3.a((android.content.res.ColorStateList) r2)
        L_0x06e9:
            r0.aq = r2
            android.widget.EditText r2 = r0.a
            if (r2 == 0) goto L_0x06f3
            r2 = 0
            r0.a((boolean) r2)
        L_0x06f3:
            r2 = 19
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x070a
            r2 = 19
            android.content.res.ColorStateList r2 = r1.e(r2)
            android.content.res.ColorStateList r3 = r0.B
            if (r3 == r2) goto L_0x070a
            r0.B = r2
            r20.u()
        L_0x070a:
            r2 = 17
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0721
            r2 = 17
            android.content.res.ColorStateList r2 = r1.e(r2)
            android.content.res.ColorStateList r3 = r0.C
            if (r3 == r2) goto L_0x0721
            r0.C = r2
            r20.u()
        L_0x0721:
            r2 = 48
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0732
            r2 = 48
            android.content.res.ColorStateList r2 = r1.e(r2)
            r0.a((android.content.res.ColorStateList) r2)
        L_0x0732:
            r2 = 51
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0745
            r2 = 51
            android.content.res.ColorStateList r2 = r1.e(r2)
            android.widget.TextView r3 = r0.E
            r3.setTextColor(r2)
        L_0x0745:
            r2 = 61
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0758
            r2 = 61
            android.content.res.ColorStateList r2 = r1.e(r2)
            android.widget.TextView r3 = r0.F
            r3.setTextColor(r2)
        L_0x0758:
            boolean r2 = r0.b
            r3 = r17
            if (r2 != r3) goto L_0x075f
            goto L_0x07ac
        L_0x075f:
            if (r3 == 0) goto L_0x079f
            android.support.v7.widget.AppCompatTextView r2 = new android.support.v7.widget.AppCompatTextView
            android.content.Context r4 = r20.getContext()
            r2.<init>(r4)
            r0.e = r2
            r4 = 2131429669(0x7f0b0925, float:1.8481017E38)
            r2.setId(r4)
            android.widget.TextView r2 = r0.e
            r4 = 1
            r2.setMaxLines(r4)
            akcn r2 = r0.u
            android.widget.TextView r4 = r0.e
            r5 = 2
            r2.a((android.widget.TextView) r4, (int) r5)
            android.widget.TextView r2 = r0.e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r4 = r20.getResources()
            r5 = 2131166767(0x7f07062f, float:1.7947789E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            r2.setMarginStart(r4)
            r20.u()
            r20.n()
            goto L_0x07aa
        L_0x079f:
            akcn r2 = r0.u
            android.widget.TextView r4 = r0.e
            r5 = 2
            r2.b(r4, r5)
            r2 = 0
            r0.e = r2
        L_0x07aa:
            r0.b = r3
        L_0x07ac:
            r2 = 1
            r3 = 0
            boolean r2 = r1.a((int) r3, (boolean) r2)
            r0.setEnabled(r2)
            r1.a()
            r1 = 2
            defpackage.qb.b((android.view.View) r0, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private static void a(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z2);
            }
        }
    }

    private static void b(CheckableImageButton checkableImageButton) {
        boolean E2 = qb.E(checkableImageButton);
        checkableImageButton.setFocusable(E2);
        checkableImageButton.setClickable(E2);
        checkableImageButton.c = E2;
        checkableImageButton.setLongClickable(false);
        qb.b((View) checkableImageButton, !E2 ? 2 : 1);
    }

    public static void a(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        b(checkableImageButton);
    }

    private final void a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = ma.f(drawable).mutate();
            ma.a(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private final void b(boolean z2, boolean z3) {
        int defaultColor = this.au.getDefaultColor();
        int colorForState = this.au.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.au.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.P = colorForState2;
        } else if (!z3) {
            this.P = defaultColor;
        } else {
            this.P = colorForState;
        }
    }

    public final boolean g() {
        return this.s.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    public final void d(CharSequence charSequence) {
        if (this.l.getContentDescription() != charSequence) {
            this.l.setContentDescription(charSequence);
        }
    }

    private static void a(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b(checkableImageButton);
    }

    public final void b(int i2) {
        if (i2 != 0 || this.aA) {
            p();
        } else {
            o();
        }
    }

    private static final void a(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = ma.f(drawable).mutate();
            if (z2) {
                ma.a(drawable, colorStateList);
            }
            if (z3) {
                ma.a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public final void b(ColorStateList colorStateList) {
        if (this.ag != colorStateList) {
            this.ag = colorStateList;
            this.ah = true;
            B();
        }
    }

    public final void d(boolean z2) {
        if (f() != z2) {
            this.T.setVisibility(!z2 ? 8 : 0);
            r();
            C();
        }
    }

    public final void b(Drawable drawable) {
        this.l.setImageDrawable(drawable);
    }

    public final void c(int i2) {
        this.A = i2;
        TextView textView = this.y;
        if (textView != null) {
            ry.a(textView, i2);
        }
    }

    public final void b(CharSequence charSequence) {
        if (!this.u.g) {
            if (!TextUtils.isEmpty(charSequence)) {
                b(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            akcn akcn = this.u;
            akcn.b();
            akcn.f = charSequence;
            akcn.h.setText(charSequence);
            int i2 = akcn.d;
            if (i2 != 1) {
                akcn.e = 1;
            }
            akcn.a(i2, akcn.e, akcn.a(akcn.h, charSequence));
            return;
        }
        this.u.a();
    }

    public final void c(CharSequence charSequence) {
        if (this.T.getContentDescription() != charSequence) {
            this.T.setContentDescription(charSequence);
        }
    }

    private final void a(boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        TextView textView;
        ColorStateList colorStateList2;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.a;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z4 = false;
        } else {
            z4 = true;
        }
        EditText editText2 = this.a;
        if (editText2 == null || !editText2.hasFocus()) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean d2 = this.u.d();
        ColorStateList colorStateList3 = this.ap;
        if (colorStateList3 != null) {
            this.n.a(colorStateList3);
            this.n.b(this.ap);
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.ap;
            if (colorStateList4 != null) {
                i2 = colorStateList4.getColorForState(new int[]{-16842910}, this.az);
            } else {
                i2 = this.az;
            }
            this.n.a(ColorStateList.valueOf(i2));
            this.n.b(ColorStateList.valueOf(i2));
        } else if (d2) {
            ajxj ajxj = this.n;
            TextView textView2 = this.u.h;
            if (textView2 != null) {
                colorStateList2 = textView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            ajxj.a(colorStateList2);
        } else if (this.d && (textView = this.e) != null) {
            this.n.a(textView.getTextColors());
        } else if (z5 && (colorStateList = this.aq) != null) {
            this.n.a(colorStateList);
        }
        if (z4 || (isEnabled() && (z5 || d2))) {
            if (z3 || this.aA) {
                ValueAnimator valueAnimator = this.aC;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aC.cancel();
                }
                if (z2 && this.aB) {
                    a(1.0f);
                } else {
                    this.n.b(1.0f);
                }
                this.aA = false;
                if (D()) {
                    E();
                }
                o();
                q();
                s();
            }
        } else if (z3 || !this.aA) {
            ValueAnimator valueAnimator2 = this.aC;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aC.cancel();
            }
            if (z2 && this.aB) {
                a(0.0f);
            } else {
                this.n.b(0.0f);
            }
            if (D() && !((akbz) this.i).a.isEmpty() && D()) {
                ((akbz) this.i).a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.aA = true;
            p();
            q();
            s();
        }
    }

    public final void c(boolean z2) {
        akcn akcn = this.u;
        if (akcn.m != z2) {
            akcn.b();
            if (z2) {
                akcn.n = new AppCompatTextView(akcn.a);
                akcn.n.setId(R.id.textinput_helper_text);
                int i2 = Build.VERSION.SDK_INT;
                akcn.n.setTextAlignment(5);
                akcn.n.setVisibility(4);
                qb.f(akcn.n, 1);
                akcn.b(akcn.o);
                akcn.b(akcn.p);
                akcn.a(akcn.n, 1);
            } else {
                akcn.b();
                int i3 = akcn.d;
                if (i3 == 2) {
                    akcn.e = 0;
                }
                akcn.a(i3, akcn.e, akcn.a(akcn.n, (CharSequence) null));
                akcn.b(akcn.n, 1);
                akcn.n = null;
                akcn.b.c();
                akcn.b.i();
            }
            akcn.m = z2;
        }
    }

    public final void b(boolean z2) {
        akcn akcn = this.u;
        if (akcn.g != z2) {
            akcn.b();
            if (z2) {
                akcn.h = new AppCompatTextView(akcn.a);
                akcn.h.setId(R.id.textinput_error);
                int i2 = Build.VERSION.SDK_INT;
                akcn.h.setTextAlignment(5);
                akcn.a(akcn.j);
                akcn.a(akcn.k);
                akcn.a(akcn.i);
                akcn.h.setVisibility(4);
                qb.f(akcn.h, 1);
                akcn.a(akcn.h, 0);
            } else {
                akcn.a();
                akcn.b(akcn.h, 0);
                akcn.h = null;
                akcn.b.c();
                akcn.b.i();
            }
            akcn.g = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.n.a != f2) {
            if (this.aC == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.aC = valueAnimator;
                valueAnimator.setInterpolator(ajrr.b);
                this.aC.setDuration(167);
                this.aC.addUpdateListener(new akda(this));
            }
            this.aC.setFloatValues(new float[]{this.n.a, f2});
            this.aC.start();
        }
    }

    public final void a(int i2) {
        boolean z2;
        int i3;
        boolean z3 = this.d;
        int i4 = this.c;
        if (i4 == -1) {
            this.e.setText(String.valueOf(i2));
            this.e.setContentDescription((CharSequence) null);
            this.d = false;
        } else {
            if (i2 > i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.d = z2;
            Context context = getContext();
            TextView textView = this.e;
            int i5 = this.c;
            if (!this.d) {
                i3 = R.string.character_counter_content_description;
            } else {
                i3 = R.string.character_counter_overflowed_content_description;
            }
            Integer valueOf = Integer.valueOf(i2);
            textView.setContentDescription(context.getString(i3, new Object[]{valueOf, Integer.valueOf(i5)}));
            if (z3 != this.d) {
                u();
            }
            this.e.setText(getContext().getString(R.string.character_counter_pattern, new Object[]{valueOf, Integer.valueOf(this.c)}));
        }
        if (this.a != null && z3 != this.d) {
            a(false);
            i();
            c();
        }
    }

    public final void a(akdb akdb) {
        EditText editText = this.a;
        if (editText != null) {
            qb.a((View) editText, (oz) akdb);
        }
    }

    public final void a(akdc akdc) {
        this.ad.add(akdc);
        if (this.a != null) {
            akdc.a(this);
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            TextView textView = this.y;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public final void a(PorterDuff.Mode mode) {
        if (this.ai != mode) {
            this.ai = mode;
            this.aj = true;
            B();
        }
    }

    public final void a(Drawable drawable) {
        this.an.setImageDrawable(drawable);
        boolean z2 = false;
        if (drawable != null && this.u.g) {
            z2 = true;
        }
        h(z2);
    }

    public final void a(View.OnClickListener onClickListener) {
        a(this.l, onClickListener);
    }

    public final void a(TextView textView, int i2) {
        try {
            ry.a(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception e2) {
        }
        ry.a(textView, 2132018194);
        textView.setTextColor(kf.b(getContext(), R.color.design_error));
    }

    public final void a(CharSequence charSequence) {
        if (this.G) {
            if (!TextUtils.equals(charSequence, this.H)) {
                this.H = charSequence;
                this.n.b(charSequence);
                if (!this.aA) {
                    E();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void a(boolean z2) {
        a(z2, false);
    }
}
