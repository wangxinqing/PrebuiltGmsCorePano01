package defpackage;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: acoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acoj implements TextWatcher {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ acom b;

    public acoj(acom acom, AlertDialog alertDialog) {
        this.b = acom;
        this.a = alertDialog;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.c = charSequence.toString();
        this.b.a(this.a);
    }
}
