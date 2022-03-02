package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: akcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcu implements View.OnClickListener {
    final /* synthetic */ akcv a;

    public akcu(akcv akcv) {
        this.a = akcv;
    }

    public void onClick(View view) {
        EditText editText = this.a.k.a;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (this.a.c()) {
                editText.setTransformationMethod((TransformationMethod) null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }
}
