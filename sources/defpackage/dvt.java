package defpackage;

import android.widget.EditText;

/* renamed from: dvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dvt implements Runnable {
    final /* synthetic */ dvu a;

    public dvt(dvu dvu) {
        this.a = dvu;
    }

    public final void run() {
        EditText editText = this.a.a.f;
        editText.setSelection(editText.getText().length());
    }
}
