package defpackage;

import android.content.Context;
import android.widget.CompoundButton;

/* renamed from: yzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzm extends CompoundButton {
    final /* synthetic */ yzn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yzm(yzn yzn, Context context) {
        super(context);
        this.a = yzn;
    }

    public final void toggle() {
        yzn yzn = this.a;
        if (yzn.a) {
            super.toggle();
            return;
        }
        yzn.a = true;
        yzn.b(2);
        yzn.d.setVisibility(0);
        yzn.e();
    }
}
