package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: akbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbq implements View.OnFocusChangeListener {
    final /* synthetic */ akbr a;

    public akbq(akbr akbr) {
        this.a = akbr;
    }

    public final void onFocusChange(View view, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(((EditText) view).getText());
        akbx akbx = this.a.a;
        boolean z2 = true;
        if (!(!isEmpty)) {
            z2 = false;
        } else if (!z) {
            z2 = false;
        }
        akbx.b(z2);
    }
}
