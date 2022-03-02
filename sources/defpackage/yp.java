package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: yp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yp {
    public aet a;
    private final View b;
    private final yu c;
    private int d = -1;
    private aet e;
    private aet f;

    public yp(View view) {
        this.b = view;
        this.c = yu.b();
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.e != null) {
                if (this.f == null) {
                    this.f = new aet();
                }
                aet aet = this.f;
                aet.a();
                ColorStateList w = qb.w(this.b);
                if (w != null) {
                    aet.d = true;
                    aet.a = w;
                }
                PorterDuff.Mode x = qb.x(this.b);
                if (x != null) {
                    aet.c = true;
                    aet.b = x;
                }
                if (aet.d || aet.c) {
                    yu.a(background, aet, this.b.getDrawableState());
                    return;
                }
            }
            aet aet2 = this.a;
            if (aet2 != null) {
                yu.a(background, aet2, this.b.getDrawableState());
                return;
            }
            aet aet3 = this.e;
            if (aet3 != null) {
                yu.a(background, aet3, this.b.getDrawableState());
            }
        }
    }

    public final void b() {
        this.d = -1;
        a((ColorStateList) null);
        a();
    }

    public final void a(int i) {
        ColorStateList colorStateList;
        this.d = i;
        yu yuVar = this.c;
        if (yuVar != null) {
            colorStateList = yuVar.b(this.b.getContext(), i);
        } else {
            colorStateList = null;
        }
        a(colorStateList);
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new aet();
            }
            aet aet = this.e;
            aet.a = colorStateList;
            aet.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void a(AttributeSet attributeSet, int i) {
        aev a2 = aev.a(this.b.getContext(), attributeSet, uh.B, i, 0);
        View view = this.b;
        qb.a(view, view.getContext(), uh.B, attributeSet, a2.b, i, 0);
        try {
            if (a2.f(0)) {
                this.d = a2.f(0, -1);
                ColorStateList b2 = this.c.b(this.b.getContext(), this.d);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.f(1)) {
                qb.a(this.b, a2.e(1));
            }
            if (a2.f(2)) {
                qb.a(this.b, aak.a(a2.a(2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a2.a();
        }
    }
}
