package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.gms.family.widget.DateSpinner;

/* renamed from: mqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mqz implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ DateSpinner b;

    public mqz(DateSpinner dateSpinner, EditText editText) {
        this.b = dateSpinner;
        this.a = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        DateSpinner dateSpinner = this.b;
        EditText editText = this.a;
        String str = dateSpinner.c;
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(editText.getText())) {
                String valueOf = String.valueOf(editText.getText());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(" ");
                sb.append(valueOf);
                editText.setContentDescription(sb.toString());
            } else {
                editText.setContentDescription(str);
            }
        }
        if (charSequence.length() == 4) {
            this.b.a();
        }
        DateSpinner dateSpinner2 = this.b;
        mhu mhu = dateSpinner2.d;
        if (mhu != null) {
            mhu.a(dateSpinner2.b());
        }
    }
}
