package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: mib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mib implements DialogInterface.OnClickListener {
    private final FamilyCreationChimeraActivity a;

    public mib(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FamilyCreationChimeraActivity familyCreationChimeraActivity = this.a;
        familyCreationChimeraActivity.r.a(3, 9);
        familyCreationChimeraActivity.c(-8);
    }
}
