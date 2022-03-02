package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: aev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aev {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private aev(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static aev a(Context context, int i, int[] iArr) {
        return new aev(context, context.obtainStyledAttributes(i, iArr));
    }

    public final int b(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final int c(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int e(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int f(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final float g(int i) {
        return this.b.getDimension(i, -1.0f);
    }

    public final int h(int i) {
        return this.b.getColor(i, 0);
    }

    public static aev a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aev(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final Drawable b(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return yu.b().c(this.a, resourceId);
    }

    public final CharSequence c(int i) {
        return this.b.getText(i);
    }

    public final String d(int i) {
        return this.b.getString(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = defpackage.uj.a(r2.a, (r0 = r2.b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001b
            android.content.res.TypedArray r0 = r2.b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001b
            android.content.Context r1 = r2.a
            android.content.res.ColorStateList r0 = defpackage.uj.a(r1, r0)
            if (r0 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            return r0
        L_0x001b:
            android.content.res.TypedArray r0 = r2.b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aev.e(int):android.content.res.ColorStateList");
    }

    public final boolean f(int i) {
        return this.b.hasValue(i);
    }

    public static aev a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aev(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final Drawable a(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return this.b.getDrawable(i);
        }
        return uj.b(this.a, resourceId);
    }

    public final void a() {
        this.b.recycle();
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }
}
