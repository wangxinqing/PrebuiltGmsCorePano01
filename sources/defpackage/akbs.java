package defpackage;

import android.text.Editable;
import android.view.View;

/* renamed from: akbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbs implements View.OnClickListener {
    final /* synthetic */ akbx a;

    public akbs(akbx akbx) {
        this.a = akbx;
    }

    public void onClick(View view) {
        Editable text = this.a.k.a.getText();
        if (text != null) {
            text.clear();
        }
    }
}
