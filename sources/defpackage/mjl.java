package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.create.FamilyInvitationChimeraActivity;

/* renamed from: mjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mjl implements DialogInterface.OnClickListener {
    private final FamilyInvitationChimeraActivity a;

    public mjl(FamilyInvitationChimeraActivity familyInvitationChimeraActivity) {
        this.a = familyInvitationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FamilyInvitationChimeraActivity familyInvitationChimeraActivity = this.a;
        familyInvitationChimeraActivity.a.a(4, 9);
        familyInvitationChimeraActivity.b(-8);
    }
}
