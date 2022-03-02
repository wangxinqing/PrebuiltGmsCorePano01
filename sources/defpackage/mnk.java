package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: mnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mnk implements DialogInterface.OnClickListener {
    private final mnm a;

    public mnk(mnm mnm) {
        this.a = mnm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mnm mnm = this.a;
        mnm.a.c.clear();
        mnm.a.getLoaderManager().restartLoader(1, (Bundle) null, new mnm(mnm.a));
    }
}
