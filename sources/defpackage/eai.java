package defpackage;

import android.content.Context;

/* renamed from: eai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eai extends eaf {
    public final Thread c = Thread.currentThread();
    public boolean d;
    public ead e;
    public int f;
    private eah g;
    private int h = 0;

    public eai(Context context) {
        super(context);
    }

    public final void a() {
        ead ead = this.e;
        if (ead == null) {
            ead ead2 = new ead(this.a, this);
            this.e = ead2;
            ead2.a(this.f);
            this.e.e();
        } else {
            ead.e();
        }
        ead ead3 = this.e;
        if (ead3 != null) {
            ead3.b();
        }
    }

    public final int getVerticalScrollbarWidth() {
        ead ead = this.e;
        if (ead == null || !ead.a()) {
            return super.getVerticalScrollbarWidth();
        }
        return Math.max(super.getVerticalScrollbarWidth(), this.e.b);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getAdapter() != null && this.g == null) {
            this.g = new eah(this);
            getAdapter().a((aci) this.g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getAdapter() != null && this.g != null) {
            getAdapter().b((aci) this.g);
            this.g = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e != null && getAdapter() != null) {
            ead ead = this.e;
            int childCount = getChildCount();
            int a = getAdapter().a();
            if (ead.h != a || ead.i != childCount) {
                ead.h = a;
                ead.i = childCount;
                if (a - childCount > 0 && ead.e != 2) {
                    eai eai = ead.a;
                    ead.a(ead.a(eai.getChildPosition(eai.getChildAt(0)), childCount, a));
                }
                ead.a(childCount, a);
            }
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ead ead = this.e;
        if (ead != null) {
            ead.b(getVerticalScrollbarPosition());
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ead ead = this.e;
        if (ead != null) {
            ead.b();
        }
    }

    public final void setAdapter(acg acg) {
        super.setAdapter(acg);
        if (getParent() != null && this.g == null) {
            eah eah = new eah(this);
            this.g = eah;
            acg.a((aci) eah);
        }
    }

    public final void setScrollBarStyle(int i) {
        super.setScrollBarStyle(i);
        ead ead = this.e;
        if (ead != null && ead.g != i) {
            ead.g = i;
            ead.b();
        }
    }

    public final void setVerticalScrollbarPosition(int i) {
        super.setVerticalScrollbarPosition(i);
        ead ead = this.e;
        if (ead != null) {
            ead.b(i);
        }
    }

    public final void a(int i) {
        acy acy;
        if (i != this.h && (acy = this.b) != null) {
            this.h = i;
            acy.a(this, i);
        }
    }

    public final void a(int i, int i2, int i3) {
        long j;
        ead ead = this.e;
        if (ead == null) {
            return;
        }
        if (ead.a()) {
            if (i3 - i2 > 0 && ead.e != 2) {
                ead.a(ead.a(i, i2, i3));
            }
            acg acg = ead.f;
            if (acg != null) {
                j = acg.J(i);
            } else {
                j = (long) i;
            }
            if (ead.d != j) {
                ead.d = j;
                if (ead.e != 2) {
                    ead.c(1);
                    ead.c();
                    return;
                }
                return;
            }
            return;
        }
        ead.c(0);
    }
}
