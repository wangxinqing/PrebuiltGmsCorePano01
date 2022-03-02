package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akcy implements Runnable {
    final /* synthetic */ TextInputLayout a;

    public akcy(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void run() {
        this.a.l.performClick();
        this.a.l.jumpDrawablesToCurrentState();
    }
}
