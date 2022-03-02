package defpackage;

import android.view.View;
import com.google.android.gms.family.model.MemberDataModel;

/* renamed from: mom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mom implements View.OnClickListener {
    final /* synthetic */ MemberDataModel a;
    final /* synthetic */ moo b;

    public mom(moo moo, MemberDataModel memberDataModel) {
        this.b = moo;
        this.a = memberDataModel;
    }

    public void onClick(View view) {
        this.b.a.b().a(6);
        moo moo = this.b;
        moo.a.a(this.a, moo.b, false);
    }
}
