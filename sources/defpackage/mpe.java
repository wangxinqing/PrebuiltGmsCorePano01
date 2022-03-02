package defpackage;

import android.view.View;

/* renamed from: mpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mpe implements View.OnClickListener {
    final /* synthetic */ mpj a;

    public mpe(mpj mpj) {
        this.a = mpj;
    }

    public void onClick(View view) {
        if (this.a.getArguments().containsKey("memberId")) {
            mfv.c("RemoveMemberConfirmationFragment", "remove member canceled", new Object[0]);
            this.a.a.f();
            return;
        }
        mfv.c("RemoveMemberConfirmationFragment", "leave family canceled", new Object[0]);
        this.a.a.h();
    }
}
