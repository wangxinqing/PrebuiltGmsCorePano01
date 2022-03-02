package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: ajtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajtm implements rf {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public ajtm(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    public final boolean a(View view) {
        this.b.c(this.a);
        return true;
    }
}
