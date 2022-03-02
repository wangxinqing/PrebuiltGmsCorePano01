package defpackage;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akcv extends akcl {
    public final TextWatcher a = new akcr(this);
    private final akdc b = new akcs(this);
    private final akct c = new akct();

    public akcv(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public final void a() {
        this.k.b(uj.b(this.l, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.k;
        textInputLayout.d(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.k.a((View.OnClickListener) new akcu(this));
        this.k.a(this.b);
        TextInputLayout textInputLayout2 = this.k;
        textInputLayout2.m.add(this.c);
        EditText editText = this.k.a;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean c() {
        EditText editText = this.k.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
