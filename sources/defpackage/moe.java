package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;

/* renamed from: moe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class moe implements DialogInterface.OnClickListener {
    private final FamilyManagementChimeraActivity a;

    public moe(FamilyManagementChimeraActivity familyManagementChimeraActivity) {
        this.a = familyManagementChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FamilyManagementChimeraActivity familyManagementChimeraActivity = this.a;
        familyManagementChimeraActivity.c.a(2, 6);
        familyManagementChimeraActivity.a(-4);
    }
}
