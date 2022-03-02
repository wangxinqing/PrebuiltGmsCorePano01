package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: miu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class miu implements DialogInterface.OnClickListener {
    private final miw a;

    public miu(miw miw) {
        this.a = miw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        miw miw = this.a;
        miw.a.getSupportLoaderManager().restartLoader(6, (Bundle) null, new miw(miw.a));
    }
}
