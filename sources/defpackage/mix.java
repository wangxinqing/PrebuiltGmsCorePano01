package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mix implements DialogInterface.OnClickListener {
    private final miz a;

    public mix(miz miz) {
        this.a = miz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        miz miz = this.a;
        miz.a.getSupportLoaderManager().restartLoader(2, (Bundle) null, new miz(miz.a));
    }
}
