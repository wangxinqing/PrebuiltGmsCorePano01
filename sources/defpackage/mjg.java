package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mjg implements DialogInterface.OnClickListener {
    private final mjk a;

    public mjg(mjk mjk) {
        this.a = mjk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mjk mjk = this.a;
        mjk.a.getSupportLoaderManager().restartLoader(3, (Bundle) null, new mjk(mjk.a));
    }
}
