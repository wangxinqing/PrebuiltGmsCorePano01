package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: akha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akha extends Drawable {
    private final Drawable a;
    private final akgz[] b;
    private akgz c;
    private int d = 255;
    private ColorFilter e;

    public akha(Drawable drawable, akgz[] akgzArr) {
        this.a = drawable;
        this.b = akgzArr;
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        if (this.a != null) {
            Rect copyBounds = copyBounds();
            int i2 = this.d;
            akgz akgz = this.c;
            if (akgz != null) {
                f = akgz.b;
                i = akgz.c;
            } else {
                i = i2;
                f = 1.0f;
            }
            if (f != 1.0f) {
                float f2 = (float) (copyBounds.bottom - copyBounds.top);
                float f3 = (float) (copyBounds.right - copyBounds.left);
                StringBuilder sb = new StringBuilder(75);
                sb.append("Height is ");
                sb.append(f2);
                sb.append(" width is ");
                sb.append(f3);
                sb.append(" scale is ");
                sb.append(f);
                sb.toString();
                float f4 = ((f * f2) - f2) / 2.0f;
                float f5 = ((f * f3) - f3) / 2.0f;
                copyBounds.left = (int) (((float) copyBounds.left) - f5);
                copyBounds.right = (int) (((float) copyBounds.right) + f5);
                copyBounds.top = (int) (((float) copyBounds.top) - f4);
                copyBounds.bottom = (int) (((float) copyBounds.bottom) + f4);
            }
            this.a.setBounds(copyBounds);
            this.a.setAlpha(i);
            this.a.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        akgz akgz = null;
        if (this.b != null) {
            int i = 0;
            while (true) {
                akgz[] akgzArr = this.b;
                int length = akgzArr.length;
                if (i >= 2) {
                    break;
                } else if (StateSet.stateSetMatches(akgzArr[i].a, iArr)) {
                    akgz = this.b[i];
                    break;
                } else {
                    i++;
                }
            }
        }
        if (akgz == this.c) {
            return false;
        }
        this.c = akgz;
        return true;
    }

    public final void setAlpha(int i) {
        this.d = i & 255;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e = colorFilter;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    public final boolean setState(int[] iArr) {
        boolean z;
        Drawable drawable = this.a;
        if (drawable != null) {
            z = drawable.setState(iArr);
        } else {
            z = false;
        }
        return super.setState(iArr) | z;
    }
}
