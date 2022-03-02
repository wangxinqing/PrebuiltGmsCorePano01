package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: aax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aax {
    int a;
    int b;
    int[] c;
    int d;

    /* access modifiers changed from: package-private */
    public final void a() {
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.d = 0;
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.d;
            int i4 = i3 + i3;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else {
                int length = iArr.length;
                if (i4 >= length) {
                    int[] iArr3 = new int[(i4 + i4)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, length);
                }
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        act act = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && act != null && act.x) {
            if (z) {
                if (!recyclerView.mAdapterHelper.d()) {
                    act.a(recyclerView.mAdapter.a(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                act.a(this.a, this.b, recyclerView.mState, this);
            }
            int i = this.d;
            if (i > act.y) {
                act.y = i;
                act.z = z;
                recyclerView.mRecycler.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i) {
        if (this.c != null) {
            int i2 = this.d;
            int i3 = i2 + i2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                if (this.c[i4] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
