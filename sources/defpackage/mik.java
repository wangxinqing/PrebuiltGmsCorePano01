package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mik implements DialogInterface.OnClickListener {
    private final mim a;

    public mik(mim mim) {
        this.a = mim;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mim mim = this.a;
        mim.a.getSupportLoaderManager().restartLoader(8, (Bundle) null, new mim(mim.a));
    }
}
