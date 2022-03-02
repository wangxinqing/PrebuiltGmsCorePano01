package defpackage;

import android.view.View;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: moj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class moj implements View.OnClickListener {
    final /* synthetic */ InvitationDataModel a;
    final /* synthetic */ mol b;

    public moj(mol mol, InvitationDataModel invitationDataModel) {
        this.b = mol;
        this.a = invitationDataModel;
    }

    public void onClick(View view) {
        mfv.c("ManageInvitationFragment", "Uninvite clicked", new Object[0]);
        this.b.a.b().a(14);
        this.b.a.b(this.a);
    }
}
