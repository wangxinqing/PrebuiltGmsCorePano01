package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akcz implements Runnable {
    final /* synthetic */ TextInputLayout a;

    public akcz(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void run() {
        this.a.a.requestLayout();
    }
}
