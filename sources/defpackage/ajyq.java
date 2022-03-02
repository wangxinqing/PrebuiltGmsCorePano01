package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: ajyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyq {
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    public Typeface j;
    private final int k;
    /* access modifiers changed from: private */
    public boolean l = false;

    public ajyq(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, ajyn.a);
        this.a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.b = ajym.a(context, obtainStyledAttributes, 3);
        ajym.a(context, obtainStyledAttributes, 4);
        ajym.a(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i3 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.k = obtainStyledAttributes.getResourceId(i3, 0);
        this.e = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f = ajym.a(context, obtainStyledAttributes, 6);
        this.g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private final void b() {
        String str;
        if (this.j == null && (str = this.e) != null) {
            this.j = Typeface.create(str, this.c);
        }
        if (this.j == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.j = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.j = Typeface.SERIF;
            } else if (i2 != 3) {
                this.j = Typeface.DEFAULT;
            } else {
                this.j = Typeface.MONOSPACE;
            }
            this.j = Typeface.create(this.j, this.c);
        }
    }

    public final Typeface a() {
        b();
        return this.j;
    }

    public final void a(Context context, ajyr ajyr) {
        b();
        int i2 = this.k;
        if (i2 == 0) {
            this.l = true;
        }
        if (!this.l) {
            try {
                ajyo ajyo = new ajyo(this, ajyr);
                ot.a((Object) ajyo);
                if (!context.isRestricted()) {
                    li.a(context, i2, new TypedValue(), 0, ajyo, false);
                    return;
                }
                ajyo.b(-4);
            } catch (Resources.NotFoundException e2) {
                this.l = true;
                ajyr.a(1);
            } catch (Exception e3) {
                String valueOf = String.valueOf(this.e);
                if (valueOf.length() == 0) {
                    new String("Error loading font ");
                } else {
                    "Error loading font ".concat(valueOf);
                }
                this.l = true;
                ajyr.a(-3);
            }
        } else {
            ajyr.a(this.j, true);
        }
    }

    public final void b(Context context, TextPaint textPaint, ajyr ajyr) {
        a(textPaint, a());
        a(context, (ajyr) new ajyp(this, textPaint, ajyr));
    }

    public final void a(Context context, TextPaint textPaint, ajyr ajyr) {
        int i2;
        int i3;
        b(context, textPaint, ajyr);
        ColorStateList colorStateList = this.b;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, this.b.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        float f2 = this.i;
        float f3 = this.g;
        float f4 = this.h;
        ColorStateList colorStateList2 = this.f;
        if (colorStateList2 != null) {
            i3 = colorStateList2.getColorForState(textPaint.drawableState, this.f.getDefaultColor());
        } else {
            i3 = 0;
        }
        textPaint.setShadowLayer(f2, f3, f4, i3);
    }

    public final void a(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f2;
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.c;
        if ((style & 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        textPaint.setFakeBoldText(z);
        if ((style & 2) != 0) {
            f2 = -0.25f;
        } else {
            f2 = 0.0f;
        }
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.a);
    }
}
