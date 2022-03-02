package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: ate  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ate extends Drawable.ConstantState {
    int a;
    atd b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public ate() {
        this.c = null;
        this.d = atg.a;
        this.b = new atd();
    }

    public final void a(int i2, int i3) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        atd atd = this.b;
        atd.a(atd.d, atd.a, canvas, i2, i3);
    }

    public int getChangingConfigurations() {
        return this.a;
    }

    public final Drawable newDrawable() {
        return new atg(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new atg(this);
    }

    public final boolean a() {
        atd atd = this.b;
        if (atd.k == null) {
            atd.k = Boolean.valueOf(atd.d.b());
        }
        return atd.k.booleanValue();
    }

    public ate(ate ate) {
        this.c = null;
        this.d = atg.a;
        if (ate != null) {
            this.a = ate.a;
            this.b = new atd(ate.b);
            Paint paint = ate.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = ate.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = ate.c;
            this.d = ate.d;
            this.e = ate.e;
        }
    }
}
