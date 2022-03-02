package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: accq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class accq implements DialogInterface.OnClickListener {
    final /* synthetic */ accr a;

    public accq(accr accr) {
        this.a = accr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            Bundle bundle = new Bundle();
            bundle.putString("deviceName", this.a.d);
            this.a.b.b(117, bundle);
            this.a.c.b();
        }
    }
}
