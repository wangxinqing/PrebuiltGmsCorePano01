package defpackage;

import android.widget.AutoCompleteTextView;

/* renamed from: akca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akca implements Runnable {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ akcb b;

    public akca(akcb akcb, AutoCompleteTextView autoCompleteTextView) {
        this.b = akcb;
        this.a = autoCompleteTextView;
    }

    public final void run() {
        boolean isPopupShowing = this.a.isPopupShowing();
        this.b.a.b(isPopupShowing);
        this.b.a.c = isPopupShowing;
    }
}
