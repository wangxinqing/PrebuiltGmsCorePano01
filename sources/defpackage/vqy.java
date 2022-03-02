package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.gms.R;

/* renamed from: vqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vqy implements TextWatcher {
    final /* synthetic */ ss a;
    final /* synthetic */ EditText b;

    public vqy(ss ssVar, EditText editText) {
        this.a = ssVar;
        this.b = editText;
    }

    public final void afterTextChanged(Editable editable) {
        Button a2 = this.a.a(-1);
        if (a2 != null) {
            String trim = editable.toString().trim();
            boolean z = false;
            if (trim.length() > 0 && !trim.equals(this.b.getTag(R.id.device_name))) {
                z = true;
            }
            a2.setEnabled(z);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
