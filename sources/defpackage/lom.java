package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.Window;

/* renamed from: lom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lom implements View.OnFocusChangeListener {
    final /* synthetic */ Dialog a;

    public lom(Dialog dialog) {
        this.a = dialog;
    }

    public final void onFocusChange(View view, boolean z) {
        Window window = this.a.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }
}
