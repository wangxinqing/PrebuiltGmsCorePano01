package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.manage.FamilyManagementChimeraActivity;

/* renamed from: mog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mog implements DialogInterface.OnClickListener {
    final /* synthetic */ FamilyManagementChimeraActivity a;

    public mog(FamilyManagementChimeraActivity familyManagementChimeraActivity) {
        this.a = familyManagementChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c.a(2, 7);
        this.a.a(-9);
    }
}
