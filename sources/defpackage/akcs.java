package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcs implements akdc {
    final /* synthetic */ akcv a;

    public akcs(akcv akcv) {
        this.a = akcv;
    }

    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.e(true);
        akcv akcv = this.a;
        akcv.m.setChecked(!akcv.c());
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
