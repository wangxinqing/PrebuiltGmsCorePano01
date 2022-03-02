package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akcx implements TextWatcher {
    final /* synthetic */ TextInputLayout a;

    public akcx(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.a(!textInputLayout.o);
        TextInputLayout textInputLayout2 = this.a;
        if (textInputLayout2.b) {
            textInputLayout2.a(editable.length());
        }
        TextInputLayout textInputLayout3 = this.a;
        if (textInputLayout3.f) {
            textInputLayout3.b(editable.length());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
