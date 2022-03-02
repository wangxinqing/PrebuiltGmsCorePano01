package defpackage;

import android.content.DialogInterface;

/* renamed from: adgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adgx implements DialogInterface.OnCancelListener {
    final /* synthetic */ adgy a;

    public adgx(adgy adgy) {
        this.a = adgy;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel(true);
    }
}
