package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: akag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akag implements Runnable {
    final /* synthetic */ akat a;

    public akag(akat akat) {
        this.a = akat;
    }

    public final void run() {
        Context context;
        akat akat = this.a;
        if (akat.e != null && (context = akat.d) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            akat akat2 = this.a;
            int[] iArr = new int[2];
            akat2.e.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + akat2.e.getHeight())) + ((int) this.a.e.getTranslationY());
            akat akat3 = this.a;
            if (height < akat3.j) {
                ViewGroup.LayoutParams layoutParams = akat3.e.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(akat.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.a.j - height;
                this.a.e.requestLayout();
            }
        }
    }
}
