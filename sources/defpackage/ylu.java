package defpackage;

import android.content.DialogInterface;

/* renamed from: ylu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ylu implements DialogInterface.OnCancelListener {
    final /* synthetic */ ymb a;

    public ylu(ymb ymb) {
        this.a = ymb;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a();
    }
}
