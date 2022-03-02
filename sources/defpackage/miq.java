package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: miq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class miq implements DialogInterface.OnClickListener {
    private final mis a;

    public miq(mis mis) {
        this.a = mis;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mis mis = this.a;
        mis.a.getSupportLoaderManager().restartLoader(7, (Bundle) null, new mis(mis.a));
    }
}
