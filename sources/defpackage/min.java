package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: min  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class min implements DialogInterface.OnClickListener {
    private final mip a;

    public min(mip mip) {
        this.a = mip;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mip mip = this.a;
        mip.a.getSupportLoaderManager().restartLoader(0, (Bundle) null, new mip(mip.a));
    }
}
