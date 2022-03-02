package defpackage;

import android.view.View;

/* renamed from: mni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mni implements View.OnClickListener {
    final /* synthetic */ mnn a;

    public mni(mnn mnn) {
        this.a = mnn;
    }

    public void onClick(View view) {
        mfv.c("DeleteFamilyConfirmationFragment", "Delete family canceled", new Object[0]);
        this.a.a.c();
    }
}
