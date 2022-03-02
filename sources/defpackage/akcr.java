package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: akcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcr implements TextWatcher {
    final /* synthetic */ akcv a;

    public akcr(akcv akcv) {
        this.a = akcv;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        akcv akcv = this.a;
        akcv.m.setChecked(!akcv.c());
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
