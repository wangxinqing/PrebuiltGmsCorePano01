package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mpg implements DialogInterface.OnClickListener {
    private final mpi a;

    public mpg(mpi mpi) {
        this.a = mpi;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mpi mpi = this.a;
        mpi.a.c.clear();
        mpi.a.getLoaderManager().restartLoader(1, (Bundle) null, new mpi(mpi.a));
    }
}
