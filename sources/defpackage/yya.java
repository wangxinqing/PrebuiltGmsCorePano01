package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: yya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yya implements TextWatcher {
    final /* synthetic */ yyb a;

    public yya(yyb yyb) {
        this.a = yyb;
    }

    public final void afterTextChanged(Editable editable) {
        this.a.c.a();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c.a();
    }
}
