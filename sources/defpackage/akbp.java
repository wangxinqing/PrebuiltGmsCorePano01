package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: akbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbp implements TextWatcher {
    final /* synthetic */ akbx a;

    public akbp(akbx akbx) {
        this.a = akbx;
    }

    public final void afterTextChanged(Editable editable) {
        akbx akbx = this.a;
        if (akbx.k.g == null) {
            akbx.b(akbx.a(editable));
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
