package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ajsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajsz extends FrameLayout implements xi {
    private static final int[] e = {16842912};
    public final ImageView a;
    public int b = -1;
    public ww c;
    public ajss d;
    private final int f;
    private float g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private final TextView l;
    private final TextView m;
    private ColorStateList n;
    private Drawable o;
    private Drawable p;

    private final void a(float f2, float f3) {
        this.g = f2 - f3;
        this.h = f3 / f2;
        this.i = f2 / f3;
    }

    public final ww a() {
        return this.c;
    }

    public final void b(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.a.setLayoutParams(layoutParams);
    }

    public final boolean b() {
        return false;
    }

    public final void c(int i2) {
        ry.a(this.l, i2);
        a(this.l.getTextSize(), this.m.getTextSize());
    }

    public final boolean c() {
        return this.d != null;
    }

    public final void d(int i2) {
        ry.a(this.m, i2);
        a(this.l.getTextSize(), this.m.getTextSize());
    }

    public final void e(int i2) {
        a(i2 != 0 ? kf.a(getContext(), i2) : null);
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        ww wwVar = this.c;
        if (wwVar != null && wwVar.isCheckable() && this.c.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ajss ajss = this.d;
        if (ajss != null && ajss.isVisible()) {
            ww wwVar = this.c;
            CharSequence charSequence = wwVar.d;
            if (!TextUtils.isEmpty(wwVar.k)) {
                charSequence = this.c.k;
            }
            String valueOf = String.valueOf(charSequence);
            ajss ajss2 = this.d;
            Object obj = null;
            if (ajss2.isVisible()) {
                if (!ajss2.a()) {
                    obj = ajss2.d.f;
                } else if (ajss2.d.g > 0 && (context = (Context) ajss2.a.get()) != null) {
                    obj = context.getResources().getQuantityString(ajss2.d.g, ajss2.b(), new Object[]{Integer.valueOf(ajss2.b())});
                }
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        qs a2 = qs.a(accessibilityNodeInfo);
        a2.b((Object) qr.a(0, 1, this.b, 1, isSelected()));
        if (isSelected()) {
            a2.c(false);
            a2.b(qp.a);
        }
        a2.f((CharSequence) "Tab");
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.l.setEnabled(z);
        this.m.setEnabled(z);
        this.a.setEnabled(z);
        if (z) {
            qb.a((View) this, ps.a(getContext()));
        } else {
            qb.a((View) this, (ps) null);
        }
    }

    public ajsz(Context context) {
        super(context, (AttributeSet) null, 0);
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.design_bottom_navigation_item, this, true);
        setBackgroundResource(R.drawable.design_bottom_navigation_item_background);
        this.f = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_margin);
        this.a = (ImageView) findViewById(R.id.icon);
        this.l = (TextView) findViewById(R.id.smallLabel);
        this.m = (TextView) findViewById(R.id.largeLabel);
        qb.b((View) this.l, 2);
        qb.b((View) this.m, 2);
        setFocusable(true);
        a(this.l.getTextSize(), this.m.getTextSize());
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ajsy(this));
        }
    }

    private static final void a(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    private static final void a(View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l.setTextColor(colorStateList);
            this.m.setTextColor(colorStateList);
        }
    }

    public final void b(boolean z) {
        TextView textView = this.m;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.m;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.l;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.l;
        textView4.setPivotY((float) textView4.getBaseline());
        int i2 = this.j;
        if (i2 != -1) {
            if (i2 == 0) {
                if (!z) {
                    a(this.a, this.f, 17);
                    a(this.m, 0.5f, 0.5f, 4);
                } else {
                    a(this.a, this.f, 49);
                    a(this.m, 1.0f, 1.0f, 0);
                }
                this.l.setVisibility(4);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    a(this.a, this.f, 17);
                    this.m.setVisibility(8);
                    this.l.setVisibility(8);
                }
            } else if (z) {
                a(this.a, (int) (((float) this.f) + this.g), 49);
                a(this.m, 1.0f, 1.0f, 0);
                TextView textView5 = this.l;
                float f2 = this.h;
                a(textView5, f2, f2, 4);
            } else {
                a(this.a, this.f, 49);
                TextView textView6 = this.m;
                float f3 = this.i;
                a(textView6, f3, f3, 4);
                a(this.l, 1.0f, 1.0f, 0);
            }
        } else if (this.k) {
            if (!z) {
                a(this.a, this.f, 17);
                a(this.m, 0.5f, 0.5f, 4);
            } else {
                a(this.a, this.f, 49);
                a(this.m, 1.0f, 1.0f, 0);
            }
            this.l.setVisibility(4);
        } else if (z) {
            a(this.a, (int) (((float) this.f) + this.g), 49);
            a(this.m, 1.0f, 1.0f, 0);
            TextView textView7 = this.l;
            float f4 = this.h;
            a(textView7, f4, f4, 4);
        } else {
            a(this.a, this.f, 49);
            TextView textView8 = this.m;
            float f5 = this.i;
            a(textView8, f5, f5, 4);
            a(this.l, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public final void a(int i2) {
        if (this.j != i2) {
            this.j = i2;
            ww wwVar = this.c;
            if (wwVar != null) {
                b(wwVar.isChecked());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ajss ajss) {
        this.d = ajss;
        ImageView imageView = this.a;
        if (imageView != null && c()) {
            setClipChildren(false);
            setClipToPadding(false);
            ajss ajss2 = this.d;
            a((View) imageView);
            ajst.b(ajss2, imageView);
            imageView.getOverlay().add(ajss2);
        }
    }

    public final void a(ColorStateList colorStateList) {
        Drawable drawable;
        this.n = colorStateList;
        if (this.c != null && (drawable = this.p) != null) {
            ma.a(drawable, colorStateList);
            this.p.invalidateSelf();
        }
    }

    public final void a(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        qb.a((View) this, drawable);
    }

    public final void a(View view) {
        if (view == this.a) {
            int i2 = ajst.a;
        }
    }

    public final void a(ww wwVar) {
        CharSequence charSequence;
        this.c = wwVar;
        wwVar.isCheckable();
        refreshDrawableState();
        b(wwVar.isChecked());
        setEnabled(wwVar.isEnabled());
        Drawable icon = wwVar.getIcon();
        if (icon != this.o) {
            this.o = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = ma.f(icon).mutate();
                this.p = icon;
                ColorStateList colorStateList = this.n;
                if (colorStateList != null) {
                    ma.a(icon, colorStateList);
                }
            }
            this.a.setImageDrawable(icon);
        }
        CharSequence charSequence2 = wwVar.d;
        this.l.setText(charSequence2);
        this.m.setText(charSequence2);
        ww wwVar2 = this.c;
        if (wwVar2 == null || TextUtils.isEmpty(wwVar2.k)) {
            setContentDescription(charSequence2);
        }
        ww wwVar3 = this.c;
        if (wwVar3 != null && !TextUtils.isEmpty(wwVar3.l)) {
            charSequence2 = this.c.l;
        }
        afg.a(this, charSequence2);
        setId(wwVar.a);
        if (!TextUtils.isEmpty(wwVar.k)) {
            setContentDescription(wwVar.k);
        }
        if (TextUtils.isEmpty(wwVar.l)) {
            charSequence = wwVar.d;
        } else {
            charSequence = wwVar.l;
        }
        afg.a(this, charSequence);
        setVisibility(!wwVar.isVisible() ? 8 : 0);
    }

    public final void a(boolean z) {
        if (this.k != z) {
            this.k = z;
            ww wwVar = this.c;
            if (wwVar != null) {
                b(wwVar.isChecked());
            }
        }
    }
}
