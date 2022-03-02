package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: yx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yx {
    private final ImageView a;
    private aet b;

    public yx(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b2 = uj.b(this.a.getContext(), i);
            if (b2 != null) {
                aak.b(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable((Drawable) null);
        }
        b();
    }

    public final void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            aak.b(drawable);
        }
        if (drawable != null && Build.VERSION.SDK_INT <= 21) {
            if (this.b == null) {
                this.b = new aet();
            }
            aet aet = this.b;
            aet.a();
            ImageView imageView = this.a;
            int i = Build.VERSION.SDK_INT;
            ColorStateList imageTintList = imageView.getImageTintList();
            if (imageTintList != null) {
                aet.d = true;
                aet.a = imageTintList;
            }
            ImageView imageView2 = this.a;
            int i2 = Build.VERSION.SDK_INT;
            PorterDuff.Mode imageTintMode = imageView2.getImageTintMode();
            if (imageTintMode != null) {
                aet.c = true;
                aet.b = imageTintMode;
            }
            if (aet.d || aet.c) {
                yu.a(drawable, aet, this.a.getDrawableState());
            }
        }
    }

    public final void a(AttributeSet attributeSet, int i) {
        Drawable drawable;
        int f;
        aev a2 = aev.a(this.a.getContext(), attributeSet, uh.f, i, 0);
        ImageView imageView = this.a;
        qb.a(imageView, imageView.getContext(), uh.f, attributeSet, a2.b, i, 0);
        try {
            Drawable drawable2 = this.a.getDrawable();
            if (!(drawable2 != null || (f = a2.f(1, -1)) == -1 || (drawable2 = uj.b(this.a.getContext(), f)) == null)) {
                this.a.setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                aak.b(drawable2);
            }
            if (a2.f(2)) {
                rt.a(this.a, a2.e(2));
            }
            if (a2.f(3)) {
                ImageView imageView2 = this.a;
                PorterDuff.Mode a3 = aak.a(a2.a(3, -1), (PorterDuff.Mode) null);
                int i2 = Build.VERSION.SDK_INT;
                imageView2.setImageTintMode(a3);
                if (!(Build.VERSION.SDK_INT != 21 || (drawable = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable);
                }
            }
        } finally {
            a2.a();
        }
    }

    public final boolean a() {
        Drawable background = this.a.getBackground();
        int i = Build.VERSION.SDK_INT;
        return !(background instanceof RippleDrawable);
    }
}
