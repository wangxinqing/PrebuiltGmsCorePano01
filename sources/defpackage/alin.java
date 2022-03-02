package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.items.AbstractItem;

/* renamed from: alin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alin extends acg implements alig {
    public final alih a;
    public final boolean e;
    public alil f;

    public alin(alih alih, boolean z) {
        this.e = z;
        this.a = alih;
        alih.a((alig) this);
    }

    public final long J(int i) {
        int i2;
        alid f2 = f(i);
        if (!(f2 instanceof AbstractItem) || (i2 = ((AbstractItem) f2).b) <= 0) {
            return -1;
        }
        return (long) i2;
    }

    public final int a() {
        return this.a.a();
    }

    public final void b(alih alih, int i, int i2) {
        d(i, i2);
    }

    public final alid f(int i) {
        return this.a.a(i);
    }

    public final int a(int i) {
        return f(i).e();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        Drawable drawable;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        alij alij = new alij(inflate);
        if (!"noBackground".equals(inflate.getTag())) {
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(alhx.n);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 == null) {
                drawable2 = obtainStyledAttributes.getDrawable(2);
                drawable = null;
            } else {
                drawable = inflate.getBackground();
                if (drawable == null) {
                    if (this.e) {
                        drawable = new ColorDrawable(alhb.a(inflate.getContext()).a(inflate.getContext(), alha.CONFIG_LAYOUT_BACKGROUND_COLOR));
                    } else {
                        drawable = obtainStyledAttributes.getDrawable(0);
                    }
                }
            }
            if (drawable2 == null || drawable == null) {
                String valueOf = String.valueOf(drawable2);
                String valueOf2 = String.valueOf(drawable);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(valueOf2).length());
                sb.append("Cannot resolve required attributes. selectableItemBackground=");
                sb.append(valueOf);
                sb.append(" background=");
                sb.append(valueOf2);
                Log.e("RecyclerItemAdapter", sb.toString());
            } else {
                inflate.setBackgroundDrawable(new alim(new Drawable[]{drawable, drawable2}));
            }
            obtainStyledAttributes.recycle();
        }
        inflate.setOnClickListener(new alik(this, alij));
        return alij;
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        alij alij = (alij) adl;
        alid f2 = f(i);
        boolean d = f2.d();
        alij.s = d;
        alij.a.setClickable(d);
        alij.a.setEnabled(d);
        alij.a.setFocusable(d);
        alij.t = f2;
        f2.a(alij.a);
    }

    public final void a(alih alih, int i) {
        h(i, 1);
    }

    public final void a(alih alih, int i, int i2) {
        c(i, i2);
    }
}
