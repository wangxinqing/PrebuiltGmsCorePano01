package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: ze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ze extends za {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d = null;
    private PorterDuff.Mode e = null;
    private boolean f = false;
    private boolean g = false;

    public ze(SeekBar seekBar) {
        super(seekBar);
        this.b = seekBar;
    }

    private final void a() {
        Drawable drawable = this.c;
        if (drawable == null) {
            return;
        }
        if (this.f || this.g) {
            Drawable f2 = ma.f(drawable.mutate());
            this.c = f2;
            if (this.f) {
                ma.a(f2, this.d);
            }
            if (this.g) {
                ma.a(this.c, this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }

    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aev a = aev.a(this.b.getContext(), attributeSet, uh.g, i, 0);
        SeekBar seekBar = this.b;
        qb.a(seekBar, seekBar.getContext(), uh.g, attributeSet, a.b, i, 0);
        Drawable b2 = a.b(0);
        if (b2 != null) {
            this.b.setThumb(b2);
        }
        Drawable a2 = a.a(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.c = a2;
        if (a2 != null) {
            a2.setCallback(this.b);
            ma.b(a2, qb.h(this.b));
            if (a2.isStateful()) {
                a2.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.f(3)) {
            this.e = aak.a(a.a(3, -1), this.e);
            this.g = true;
        }
        if (a.f(2)) {
            this.d = a.e(2);
            this.f = true;
        }
        a.a();
        a();
    }
}
