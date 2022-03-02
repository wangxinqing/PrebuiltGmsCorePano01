package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: alhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhe implements alhi {
    final boolean a;
    public LinearLayout b;
    public alhg c;
    public alhg d;
    public int e;
    ColorStateList f = null;
    ColorStateList g = null;
    final int h;
    public boolean i = true;
    public final algz j = new algz();
    private final Context k;
    private final ViewStub l;
    private int m;
    private int n;
    private int o;
    private final int p;
    private final int q;

    static {
        new AtomicInteger(1);
    }

    public alhe(TemplateLayout templateLayout, AttributeSet attributeSet, int i2) {
        this.k = templateLayout.getContext();
        this.l = (ViewStub) templateLayout.b(R.id.suc_layout_footer);
        this.a = ((algc) templateLayout).c();
        TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(attributeSet, algd.a, i2, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.h = dimensionPixelSize;
        this.n = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
        this.o = obtainStyledAttributes.getDimensionPixelSize(6, this.h);
        this.p = obtainStyledAttributes.getColor(9, 0);
        this.q = obtainStyledAttributes.getColor(11, 0);
        int resourceId = obtainStyledAttributes.getResourceId(10, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(12, 0);
        obtainStyledAttributes.recycle();
        alhh alhh = new alhh(this.k);
        if (resourceId2 != 0) {
            b(alhh.a(resourceId2));
            this.j.a(true, true);
        }
        if (resourceId != 0) {
            a(alhh.a(resourceId));
            this.j.b(true, true);
        }
    }

    private static int a(int i2, float f2) {
        return Color.argb((int) (f2 * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    private final LinearLayout g() {
        if (this.b == null) {
            if (this.l != null) {
                int i2 = Build.VERSION.SDK_INT;
                this.l.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.k, 2132018035)));
                this.l.setLayoutResource(R.layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.l.inflate();
                this.b = linearLayout;
                if (linearLayout != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), this.n, linearLayout.getPaddingRight(), this.o);
                }
                LinearLayout linearLayout2 = this.b;
                if (linearLayout2 != null && this.a) {
                    linearLayout2.setBackgroundColor(alhb.a(this.k).a(this.k, alha.CONFIG_FOOTER_BAR_BG_COLOR));
                    this.n = (int) alhb.a(this.k).e(this.k, alha.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                    this.o = (int) alhb.a(this.k).e(this.k, alha.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.n, linearLayout2.getPaddingRight(), this.o);
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.b;
    }

    public final void b(alhg alhg) {
        algm.a("setSecondaryButton");
        g();
        algh algh = new algh(alhg);
        algh.h = a(alhg, 2132018033, alha.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR);
        algh.a = alha.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
        algh.b = a(alhg.a);
        algh.f = alha.CONFIG_FOOTER_BUTTON_RADIUS;
        algh.g = alha.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
        algh.c = alha.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
        algh.d = alha.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
        algh.e = alha.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
        algi a2 = algh.a();
        FooterActionButton a3 = a(alhg, a2);
        this.m = a3.getId();
        this.g = a3.getTextColors();
        this.d = alhg;
        a((Button) a3, this.q);
        a((Button) a3, a2);
        c();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        LinearLayout g2 = g();
        Button a2 = a();
        Button e2 = e();
        g2.removeAllViews();
        if (e2 != null) {
            g2.addView(e2);
        }
        LinearLayout g3 = g();
        View view = new View(g3.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        view.setVisibility(4);
        g3.addView(view);
        if (a2 != null) {
            g2.addView(a2);
        }
    }

    public final void d() {
        boolean z;
        Button a2 = a();
        Button e2 = e();
        boolean z2 = true;
        int i2 = 0;
        if (a2 == null || a2.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (e2 == null || e2.getVisibility() != 0) {
            z2 = false;
        }
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            if (!z && !z2) {
                i2 = this.i ? 8 : 4;
            }
            linearLayout.setVisibility(i2);
        }
    }

    public final Button e() {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            return (Button) linearLayout.findViewById(this.m);
        }
        return null;
    }

    public final boolean f() {
        return e() != null && e().getVisibility() == 0;
    }

    private final int a(alhg alhg, int i2, alha alha) {
        int i3 = alhg.e;
        if (i3 != 0 && !this.a) {
            i2 = i3;
        }
        int a2 = alhb.a(this.k).a(this.k, alha);
        if (!this.a) {
            return i2;
        }
        if (a2 == 0) {
            return 2132018033;
        }
        if (a2 == 0) {
            return i2;
        }
        return 2132018032;
    }

    private static alha a(int i2) {
        switch (i2) {
            case 1:
                return alha.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return alha.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return alha.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return alha.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return alha.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return alha.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return alha.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return alha.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    public final boolean b() {
        return a() != null && a().getVisibility() == 0;
    }

    private final FooterActionButton a(alhg alhg, algi algi) {
        FooterActionButton footerActionButton = (FooterActionButton) LayoutInflater.from(new ContextThemeWrapper(this.k, algi.h)).inflate(R.layout.suc_button, (ViewGroup) null, false);
        int i2 = Build.VERSION.SDK_INT;
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(alhg.b);
        footerActionButton.setOnClickListener(alhg);
        footerActionButton.setVisibility(alhg.d);
        footerActionButton.setEnabled(alhg.c);
        footerActionButton.a = alhg;
        alhg.g = new alhd(this, footerActionButton.getId());
        return footerActionButton;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r11v7, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.widget.Button r11, defpackage.algi r12) {
        /*
            r10 = this;
            boolean r0 = r10.a
            if (r0 == 0) goto L_0x01bc
            alha r0 = r12.c
            r10.a((android.widget.Button) r11, (defpackage.alha) r0)
            alha r0 = r12.d
            android.content.Context r1 = r10.k
            alhb r1 = defpackage.alhb.a(r1)
            android.content.Context r2 = r10.k
            float r0 = r1.e(r2, r0)
            r1 = 0
            r2 = 0
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            r11.setTextSize(r2, r0)
        L_0x0020:
            alha r0 = r12.e
            android.content.Context r3 = r10.k
            alhb r3 = defpackage.alhb.a(r3)
            android.content.Context r4 = r10.k
            java.lang.String r0 = r3.c(r4, r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
            if (r0 == 0) goto L_0x0037
            r11.setTypeface(r0)
        L_0x0037:
            alha r0 = r12.a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            r5 = 1
            if (r3 < r4) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.lang.String r4 = "Update button background only support on sdk Q or higher"
            defpackage.algm.a((boolean) r3, (java.lang.String) r4)
            int[] r3 = new int[r5]
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r3[r2] = r4
            int[] r4 = new int[r2]
            android.content.Context r6 = r10.k
            alhb r6 = defpackage.alhb.a(r6)
            android.content.Context r7 = r10.k
            int r0 = r6.a((android.content.Context) r7, (defpackage.alha) r0)
            r6 = 2
            if (r0 == 0) goto L_0x009f
            android.content.Context r7 = r10.k
            int[] r8 = new int[r5]
            r9 = 16842803(0x1010033, float:2.36937E-38)
            r8[r2] = r9
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8)
            r8 = 1048911544(0x3e851eb8, float:0.26)
            float r8 = r7.getFloat(r2, r8)
            r7.recycle()
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            int[][] r9 = new int[r6][]
            r9[r2] = r3
            r9[r5] = r4
            int[] r3 = new int[r6]
            int r4 = a((int) r0, (float) r8)
            r3[r2] = r4
            r3[r5] = r0
            r7.<init>(r9, r3)
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int[] r3 = new int[r2]
            r0.setState(r3)
            r11.refreshDrawableState()
            r11.setBackgroundTintList(r7)
        L_0x009f:
            alha r0 = r12.f
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            r7 = 0
            if (r3 < r4) goto L_0x00e7
            android.content.Context r3 = r10.k
            alhb r3 = defpackage.alhb.a(r3)
            android.content.Context r4 = r10.k
            float r0 = r3.e(r4, r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            android.graphics.drawable.Drawable r3 = r11.getBackground()
            boolean r4 = r3 instanceof android.graphics.drawable.InsetDrawable
            if (r4 == 0) goto L_0x00cd
            android.graphics.drawable.InsetDrawable r3 = (android.graphics.drawable.InsetDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            android.graphics.drawable.LayerDrawable r3 = (android.graphics.drawable.LayerDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r2)
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            goto L_0x00e1
        L_0x00cd:
            boolean r4 = r3 instanceof android.graphics.drawable.RippleDrawable
            if (r4 == 0) goto L_0x00e0
            android.graphics.drawable.RippleDrawable r3 = (android.graphics.drawable.RippleDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r2)
            android.graphics.drawable.InsetDrawable r3 = (android.graphics.drawable.InsetDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            goto L_0x00e1
        L_0x00e0:
            r3 = r7
        L_0x00e1:
            if (r3 != 0) goto L_0x00e4
            goto L_0x00e7
        L_0x00e4:
            r3.setCornerRadius(r0)
        L_0x00e7:
            alha r0 = r12.b
            if (r11 != 0) goto L_0x00ec
            goto L_0x0125
        L_0x00ec:
            if (r0 == 0) goto L_0x00fb
            android.content.Context r3 = r10.k
            alhb r3 = defpackage.alhb.a(r3)
            android.content.Context r4 = r10.k
            android.graphics.drawable.Drawable r0 = r3.b(r4, r0)
            goto L_0x00fc
        L_0x00fb:
            r0 = r7
        L_0x00fc:
            if (r0 == 0) goto L_0x0109
            int r3 = r0.getIntrinsicHeight()
            int r4 = r0.getIntrinsicWidth()
            r0.setBounds(r2, r2, r4, r3)
        L_0x0109:
            int r3 = r11.getId()
            int r4 = r10.e
            if (r3 == r4) goto L_0x011e
            int r3 = r11.getId()
            int r4 = r10.m
            if (r3 != r4) goto L_0x011b
            r3 = r7
            goto L_0x0120
        L_0x011b:
            r0 = r7
            r3 = r0
            goto L_0x0120
        L_0x011e:
            r3 = r0
            r0 = r7
        L_0x0120:
            int r4 = android.os.Build.VERSION.SDK_INT
            r11.setCompoundDrawablesRelative(r0, r7, r3, r7)
        L_0x0125:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r0 = android.os.Build.VERSION.SDK_INT
            android.graphics.drawable.Drawable r11 = r11.getBackground()
            boolean r0 = r11 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L_0x013b
            android.graphics.drawable.InsetDrawable r11 = (android.graphics.drawable.InsetDrawable) r11
            android.graphics.drawable.Drawable r11 = r11.getDrawable()
            r7 = r11
            android.graphics.drawable.RippleDrawable r7 = (android.graphics.drawable.RippleDrawable) r7
            goto L_0x0144
        L_0x013b:
            boolean r0 = r11 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x0143
            r7 = r11
            android.graphics.drawable.RippleDrawable r7 = (android.graphics.drawable.RippleDrawable) r7
            goto L_0x0144
        L_0x0143:
        L_0x0144:
            if (r7 == 0) goto L_0x01bb
            int[] r11 = new int[r5]
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            r11[r2] = r0
            android.content.Context r0 = r10.k
            alhb r0 = defpackage.alhb.a(r0)
            android.content.Context r3 = r10.k
            alha r4 = r12.c
            int r0 = r0.a((android.content.Context) r3, (defpackage.alha) r4)
            android.content.Context r3 = r10.k
            alhb r3 = defpackage.alhb.a(r3)
            android.content.Context r4 = r10.k
            alha r12 = r12.g
            int r8 = r12.N
            r9 = 6
            if (r8 != r9) goto L_0x01b3
            java.util.EnumMap r8 = r3.b
            boolean r8 = r8.containsKey(r12)
            if (r8 == 0) goto L_0x017f
            java.util.EnumMap r1 = r3.b
            java.lang.Object r12 = r1.get(r12)
            java.lang.Float r12 = (java.lang.Float) r12
            float r1 = r12.floatValue()
            goto L_0x0198
        L_0x017f:
            java.lang.String r8 = r12.M     // Catch:{ NullPointerException -> 0x0197 }
            alhc r4 = r3.a((android.content.Context) r4, (java.lang.String) r8)     // Catch:{ NullPointerException -> 0x0197 }
            android.content.res.Resources r8 = r4.b     // Catch:{ NullPointerException -> 0x0197 }
            int r4 = r4.a     // Catch:{ NullPointerException -> 0x0197 }
            float r1 = r8.getFraction(r4, r5, r5)     // Catch:{ NullPointerException -> 0x0197 }
            java.util.EnumMap r3 = r3.b     // Catch:{ NullPointerException -> 0x0197 }
            java.lang.Float r4 = java.lang.Float.valueOf(r1)     // Catch:{ NullPointerException -> 0x0197 }
            r3.put(r12, r4)     // Catch:{ NullPointerException -> 0x0197 }
            goto L_0x0198
        L_0x0197:
            r12 = move-exception
        L_0x0198:
            android.content.res.ColorStateList r12 = new android.content.res.ColorStateList
            int[][] r3 = new int[r6][]
            r3[r2] = r11
            int[] r11 = android.util.StateSet.NOTHING
            r3[r5] = r11
            int[] r11 = new int[r6]
            int r0 = a((int) r0, (float) r1)
            r11[r2] = r0
            r11[r5] = r2
            r12.<init>(r3, r11)
            r7.setColor(r12)
            return
        L_0x01b3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Not a fraction resource"
            r11.<init>(r12)
            throw r11
        L_0x01bb:
            return
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alhe.a(android.widget.Button, algi):void");
    }

    public final Button a() {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            return (Button) linearLayout.findViewById(this.e);
        }
        return null;
    }

    public final void a(alhg alhg) {
        algm.a("setPrimaryButton");
        g();
        algh algh = new algh(alhg);
        algh.h = a(alhg, 2132018032, alha.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR);
        algh.a = alha.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
        algh.b = a(alhg.a);
        algh.f = alha.CONFIG_FOOTER_BUTTON_RADIUS;
        algh.g = alha.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
        algh.c = alha.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
        algh.d = alha.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
        algh.e = alha.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
        algi a2 = algh.a();
        FooterActionButton a3 = a(alhg, a2);
        this.e = a3.getId();
        this.f = a3.getTextColors();
        this.c = alhg;
        a((Button) a3, this.p);
        a((Button) a3, a2);
        c();
    }

    /* access modifiers changed from: protected */
    public final void a(Button button, int i2) {
        if (i2 != 0) {
            button.getBackground().mutate().setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
        this.b.addView(button);
        d();
    }

    public final void a(Button button, alha alha) {
        ColorStateList colorStateList;
        if (button.isEnabled()) {
            int a2 = alhb.a(this.k).a(this.k, alha);
            if (a2 != 0) {
                button.setTextColor(ColorStateList.valueOf(a2));
                return;
            }
            return;
        }
        if (button.getId() != this.e) {
            colorStateList = this.g;
        } else {
            colorStateList = this.f;
        }
        button.setTextColor(colorStateList);
    }
}
