package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mjd implements DialogInterface.OnClickListener {
    private final mjf a;

    public mjd(mjf mjf) {
        this.a = mjf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mjf mjf = this.a;
        mjf.a.getSupportLoaderManager().restartLoader(5, (Bundle) null, new mjf(mjf.a));
    }
}
