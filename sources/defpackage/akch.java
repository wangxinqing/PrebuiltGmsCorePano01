package defpackage;

import android.widget.AutoCompleteTextView;

/* renamed from: akch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akch implements AutoCompleteTextView.OnDismissListener {
    final /* synthetic */ akck a;

    public akch(akck akck) {
        this.a = akck;
    }

    public final void onDismiss() {
        akck akck = this.a;
        akck.c = true;
        akck.e = System.currentTimeMillis();
        this.a.b(false);
    }
}
