package defpackage;

import android.content.DialogInterface;

/* renamed from: cyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cyv implements DialogInterface.OnCancelListener {
    private final cza a;

    public cyv(cza cza) {
        this.a = cza;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a.a(false);
    }
}
