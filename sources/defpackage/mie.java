package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: mie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mie implements DialogInterface.OnClickListener {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mie(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.o()) {
            this.a.j();
            dialogInterface.dismiss();
            return;
        }
        this.a.r.a(3, 3);
        this.a.c(-7);
    }
}
