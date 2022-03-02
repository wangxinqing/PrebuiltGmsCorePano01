package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: ul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ul extends ux {
    oh a;
    ov b;

    public ul(ul ulVar, uq uqVar, Resources resources) {
        super(ulVar, uqVar, resources);
        ov ovVar;
        if (ulVar == null) {
            this.a = new oh();
            ovVar = new ov();
        } else {
            this.a = ulVar.a;
            ovVar = ulVar.b;
        }
        this.b = ovVar;
    }

    public static long a(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public final Drawable newDrawable() {
        return new uq(this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        if (i >= 0) {
            return ((Integer) this.b.a(i, 0)).intValue();
        }
        return 0;
    }

    public final Drawable newDrawable(Resources resources) {
        return new uq(this, resources);
    }

    /* access modifiers changed from: package-private */
    public final int a(int[] iArr) {
        int b2 = super.b(iArr);
        return b2 < 0 ? super.b(StateSet.WILD_CARD) : b2;
    }

    public final void a() {
        this.a = this.a.clone();
        this.b = this.b.clone();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, Drawable drawable, boolean z) {
        long j;
        int a2 = super.a(drawable);
        long a3 = a(i, i2);
        if (!z) {
            j = 0;
        } else {
            j = 8589934592L;
        }
        long j2 = (long) a2;
        this.a.c(a3, Long.valueOf(j2 | j));
        if (z) {
            this.a.c(a(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
    }
}
