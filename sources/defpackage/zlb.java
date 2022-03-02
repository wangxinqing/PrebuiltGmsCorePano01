package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: zlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zlb implements TextWatcher {
    final /* synthetic */ zld a;

    public zlb(zld zld) {
        this.a = zld;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a(charSequence);
    }
}
