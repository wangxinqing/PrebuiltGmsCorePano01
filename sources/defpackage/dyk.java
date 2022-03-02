package defpackage;

import android.view.ViewGroup;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyk extends dyj {
    private static final Object[] f = {""};
    private final dxx g;
    private final int[] h;
    private final int i;

    public dyk(dxx dxx, int[] iArr, int i2) {
        this.g = dxx;
        this.h = iArr;
        this.i = i2;
    }

    public final long J(int i2) {
        return (long) i2;
    }

    public final int a() {
        if (!this.a) {
            return this.h.length;
        }
        return 0;
    }

    public final void a(adl adl, int i2) {
        dxv dxv = this.g.x;
    }

    public final void a(ContactPerson contactPerson) {
    }

    public final void a(ContactPerson contactPerson, int i2) {
    }

    public final void b(ContactPerson contactPerson) {
    }

    public final void c(boolean z) {
    }

    public final int f() {
        int length = f.length;
        return 1;
    }

    public final int g(int i2) {
        return this.i;
    }

    public final int getPositionForSection(int i2) {
        return 0;
    }

    public final int getSectionForPosition(int i2) {
        return 0;
    }

    public final Object[] getSections() {
        return f;
    }

    public final int a(int i2) {
        return this.h[i2];
    }

    /* access modifiers changed from: protected */
    public final void g(boolean z) {
        if (!z) {
            c(0, this.h.length);
        } else {
            d(0, this.h.length);
        }
    }

    public final adl a(ViewGroup viewGroup, int i2) {
        dxv dxv = this.g.x;
        if (dxv != null) {
            return dxv.k();
        }
        return null;
    }
}
