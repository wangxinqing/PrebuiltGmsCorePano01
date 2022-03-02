package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mkg implements DialogInterface.OnClickListener {
    private final mkx a;

    public mkg(mkx mkx) {
        this.a = mkx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mkx mkx = this.a;
        mkx.a.h();
        mkx.getLoaderManager().restartLoader(0, (Bundle) null, new mkr(mkx));
        mkx.getLoaderManager().restartLoader(1, (Bundle) null, new mks(mkx));
        if (mkx.a.p() != null) {
            mkx.f = mkx.a.p();
        } else {
            mkx.getLoaderManager().restartLoader(2, (Bundle) null, new mkw(mkx));
        }
    }
}
