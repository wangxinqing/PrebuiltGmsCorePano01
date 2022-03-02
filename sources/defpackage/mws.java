package defpackage;

import android.widget.EditText;

/* renamed from: mws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mws implements Runnable {
    private final EditText a;

    public mws(EditText editText) {
        this.a = editText;
    }

    public final void run() {
        this.a.requestFocus();
    }
}
