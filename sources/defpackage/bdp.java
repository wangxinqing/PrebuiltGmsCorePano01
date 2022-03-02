package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.setupwizardlib.items.AbstractItem;

@Deprecated
/* renamed from: bdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bdp extends acg implements bdj {
    public final bdk a;
    public lvz e;

    public bdp(bdk bdk) {
        this.a = bdk;
        bdk.a((bdj) this);
    }

    public final long J(int i) {
        int i2;
        bdi f = f(i);
        if (!(f instanceof AbstractItem) || (i2 = ((AbstractItem) f).a) <= 0) {
            return -1;
        }
        return (long) i2;
    }

    public final int a() {
        return this.a.a();
    }

    public final void b(bdk bdk, int i) {
        d(i, 1);
    }

    public final bdi f(int i) {
        return this.a.a(i);
    }

    public final int a(int i) {
        return f(i).e();
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        bdm bdm = new bdm(inflate);
        if (!"noBackground".equals(inflate.getTag())) {
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(bdg.n);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable == null) {
                drawable = obtainStyledAttributes.getDrawable(2);
            }
            Drawable background = inflate.getBackground();
            if (background == null) {
                background = obtainStyledAttributes.getDrawable(0);
            }
            if (drawable == null || background == null) {
                String valueOf = String.valueOf(drawable);
                String valueOf2 = String.valueOf(background);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(valueOf2).length());
                sb.append("Cannot resolve required attributes. selectableItemBackground=");
                sb.append(valueOf);
                sb.append(" background=");
                sb.append(valueOf2);
                Log.e("RecyclerItemAdapter", sb.toString());
            } else {
                inflate.setBackgroundDrawable(new bdo(new Drawable[]{background, drawable}));
            }
            obtainStyledAttributes.recycle();
        }
        inflate.setOnClickListener(new bdn(this, bdm));
        return bdm;
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        bdm bdm = (bdm) adl;
        bdi f = f(i);
        boolean d = f.d();
        bdm.s = d;
        bdm.a.setClickable(d);
        bdm.a.setEnabled(d);
        bdm.a.setFocusable(d);
        bdm.t = f;
        f.a(bdm.a);
    }

    public final void a(bdk bdk, int i) {
        h(i, 1);
    }

    public final void a(bdk bdk, int i, int i2) {
        c(i, i2);
    }
}
