package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mkp implements DialogInterface.OnClickListener {
    private final mkr a;

    public mkp(mkr mkr) {
        this.a = mkr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mkr mkr = this.a;
        mkr.a.getLoaderManager().restartLoader(0, (Bundle) null, new mkr(mkr.a));
    }
}
