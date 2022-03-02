package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity;

/* renamed from: mjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mjm implements DialogInterface.OnClickListener {
    private final FamilyInvitationChimeraActivity a;

    public mjm(FamilyInvitationChimeraActivity familyInvitationChimeraActivity) {
        this.a = familyInvitationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FamilyInvitationChimeraActivity familyInvitationChimeraActivity = this.a;
        dialogInterface.dismiss();
        familyInvitationChimeraActivity.s();
    }
}
