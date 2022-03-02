package defpackage;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* renamed from: agl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agl {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public agl(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b.d.set(i, i2, i3, i4);
        CardView cardView = this.b;
        agl.super.setPadding(i + cardView.c.left, i2 + this.b.c.top, i3 + this.b.c.right, i4 + this.b.c.bottom);
    }

    public final boolean a() {
        return this.b.a;
    }

    public final boolean b() {
        return this.b.b;
    }
}
