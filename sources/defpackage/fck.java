package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: fck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fck extends ajtn {
    final /* synthetic */ BottomSheetBehavior a;
    final /* synthetic */ fcl b;

    public fck(fcl fcl, BottomSheetBehavior bottomSheetBehavior) {
        this.b = fcl;
        this.a = bottomSheetBehavior;
    }

    public final void a(int i) {
    }

    public final void a(View view, float f) {
        this.b.d = (int) (((1.0f - f) * ((float) this.a.b())) + (f * ((float) view.getMeasuredHeight())));
    }
}
