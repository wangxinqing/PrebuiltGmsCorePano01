package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: yqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqj implements TextWatcher {
    final /* synthetic */ yqq a;

    public yqj(yqq yqq) {
        this.a = yqq;
    }

    public final void afterTextChanged(Editable editable) {
        this.a.b();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
