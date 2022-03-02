package defpackage;

import android.content.DialogInterface;

/* renamed from: mph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mph implements DialogInterface.OnClickListener {
    private final mpi a;

    public mph(mpi mpi) {
        this.a = mpi;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mpi mpi = this.a;
        mpi.a.c.clear();
        if (mpi.a.getArguments().containsKey("memberId")) {
            mpi.a.a.f();
        } else {
            mpi.a.a.h();
        }
    }
}
