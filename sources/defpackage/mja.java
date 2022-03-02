package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mja implements DialogInterface.OnClickListener {
    private final mjc a;
    private final boolean b;

    public mja(mjc mjc, boolean z) {
        this.a = mjc;
        this.b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mjc mjc = this.a;
        mjc.a.getSupportLoaderManager().restartLoader(1, (Bundle) null, new mjc(mjc.a, this.b));
    }
}
