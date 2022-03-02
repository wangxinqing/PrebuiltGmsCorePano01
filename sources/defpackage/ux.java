package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: ux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ux extends ut {
    int[][] K;

    public ux(ux uxVar, uy uyVar, Resources resources) {
        super(uxVar, uyVar, resources);
        if (uxVar == null) {
            this.K = new int[this.i.length][];
        } else {
            this.K = uxVar.K;
        }
    }

    public void a() {
        int length = this.K.length;
        int[][] iArr = new int[length][];
        for (int i = length - 1; i >= 0; i--) {
            int[] iArr2 = this.K[i];
            iArr[i] = iArr2 != null ? (int[]) iArr2.clone() : null;
        }
        this.K = iArr;
    }

    /* access modifiers changed from: package-private */
    public final int b(int[] iArr) {
        int[][] iArr2 = this.K;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public Drawable newDrawable() {
        return new uy(this, (Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new uy(this, resources);
    }

    public final void b(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        System.arraycopy(this.i, 0, drawableArr, 0, i);
        this.i = drawableArr;
        int[][] iArr = new int[i2][];
        System.arraycopy(this.K, 0, iArr, 0, i);
        this.K = iArr;
    }
}
