package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: aem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aem extends adh {
    final /* synthetic */ acw m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aem(acw acw, Context context) {
        super(context);
        this.m = acw;
    }

    /* access modifiers changed from: protected */
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public final void a(View view, adf adf) {
        acw acw = this.m;
        RecyclerView recyclerView = acw.a;
        if (recyclerView != null) {
            int[] a = acw.a(recyclerView.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int c = c(Math.max(Math.abs(i), Math.abs(i2)));
            if (c > 0) {
                adf.a(i, i2, c, this.i);
            }
        }
    }
}
