package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mih implements DialogInterface.OnClickListener {
    private final mij a;

    public mih(mij mij) {
        this.a = mij;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mij mij = this.a;
        mij.a.getSupportLoaderManager().restartLoader(4, (Bundle) null, new mij(mij.a));
    }
}
