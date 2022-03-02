package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: acoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acoi implements DialogInterface.OnShowListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ acom b;

    public acoi(acom acom, AlertDialog alertDialog) {
        this.b = acom;
        this.a = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.b.a();
        this.b.a(this.a);
    }
}
