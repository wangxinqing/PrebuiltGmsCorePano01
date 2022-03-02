package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;

/* renamed from: moc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class moc implements DialogInterface.OnClickListener {
    private final FamilyManagementChimeraActivity a;

    public moc(FamilyManagementChimeraActivity familyManagementChimeraActivity) {
        this.a = familyManagementChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FamilyManagementChimeraActivity familyManagementChimeraActivity = this.a;
        familyManagementChimeraActivity.c.a(2, 9);
        familyManagementChimeraActivity.a(-8);
    }
}
