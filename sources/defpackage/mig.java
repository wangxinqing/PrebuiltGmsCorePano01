package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.family.v2.create.FamilyCreationChimeraActivity;

/* renamed from: mig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mig implements DialogInterface.OnClickListener {
    final /* synthetic */ FamilyCreationChimeraActivity a;

    public mig(FamilyCreationChimeraActivity familyCreationChimeraActivity) {
        this.a = familyCreationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.getSupportLoaderManager().restartLoader(5, (Bundle) null, new mjf(this.a));
        this.a.b(5);
        this.a.getSupportLoaderManager().restartLoader(6, (Bundle) null, new miw(this.a));
        this.a.b(6);
        this.a.getSupportLoaderManager().restartLoader(4, (Bundle) null, new mij(this.a));
        this.a.b(4);
        this.a.getSupportLoaderManager().restartLoader(7, (Bundle) null, new mis(this.a));
        this.a.b(7);
    }
}
