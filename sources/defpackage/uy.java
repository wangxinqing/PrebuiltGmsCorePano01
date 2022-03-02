package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: uy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class uy extends uu {
    private ux d;
    private boolean e;

    public uy() {
        this((ux) null, (Resources) null);
    }

    public void a(ut utVar) {
        super.a(utVar);
        if (utVar instanceof ux) {
            this.d = (ux) utVar;
        }
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: b */
    public ux c() {
        return new ux(this.d, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.e) {
            super.mutate();
            this.d.a();
            this.e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.d.b(iArr);
        if (b < 0) {
            b = this.d.b(StateSet.WILD_CARD);
        }
        return a(b) || onStateChange;
    }

    public uy(ux uxVar, Resources resources) {
        a((ut) new ux(uxVar, this, resources));
        onStateChange(getState());
    }

    public uy(byte[] bArr) {
    }
}
