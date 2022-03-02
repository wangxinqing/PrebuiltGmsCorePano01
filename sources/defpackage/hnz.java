package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: hnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hnz implements TextWatcher {
    final /* synthetic */ hoa a;

    public hnz(hoa hoa) {
        this.a = hoa;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.e.c.setEnabled(charSequence.length() > 0);
    }
}
