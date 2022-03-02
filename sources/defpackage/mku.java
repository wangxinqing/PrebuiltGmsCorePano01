package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mku implements DialogInterface.OnClickListener {
    private final mkw a;

    public mku(mkw mkw) {
        this.a = mkw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mkw mkw = this.a;
        mkw.a.getLoaderManager().restartLoader(2, (Bundle) null, new mkw(mkw.a));
    }
}
