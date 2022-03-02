package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: yyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yyp implements TextWatcher {
    final /* synthetic */ yyq a;

    public yyp(yyq yyq) {
        this.a = yyq;
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
