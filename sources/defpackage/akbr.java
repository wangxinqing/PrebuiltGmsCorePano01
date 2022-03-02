package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akbr implements akdc {
    final /* synthetic */ akbx a;

    public akbr(akbx akbx) {
        this.a = akbx;
    }

    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.e(akbx.a(editText.getText()));
        textInputLayout.f(false);
        editText.setOnFocusChangeListener(new akbq(this));
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
