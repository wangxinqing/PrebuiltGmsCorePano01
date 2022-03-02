package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;

/* renamed from: akcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcb implements TextWatcher {
    final /* synthetic */ akck a;

    public akcb(akck akck) {
        this.a = akck;
    }

    public final void afterTextChanged(Editable editable) {
        akck akck = this.a;
        AutoCompleteTextView a2 = akck.a(akck.k.a);
        a2.post(new akca(this, a2));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
