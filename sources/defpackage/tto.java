package defpackage;

import android.content.DialogInterface;

/* renamed from: tto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tto implements DialogInterface.OnCancelListener {
    private final ttp a;

    public tto(ttp ttp) {
        this.a = ttp;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a.finish();
    }
}
