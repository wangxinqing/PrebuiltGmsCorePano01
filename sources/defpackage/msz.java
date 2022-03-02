package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: msz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class msz implements TextWatcher {
    final /* synthetic */ Button a;
    final /* synthetic */ mta b;

    public msz(mta mta, Button button) {
        this.b = mta;
        this.a = button;
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.trim().length() <= 0) {
            this.a.setEnabled(false);
        } else {
            this.a.setEnabled(!obj.equals(this.b.f()));
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
