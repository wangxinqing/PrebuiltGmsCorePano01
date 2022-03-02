package defpackage;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* renamed from: omy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class omy implements View.OnClickListener {
    private final onb a;

    public omy(onb onb) {
        this.a = onb;
    }

    public void onClick(View view) {
        onb onb = this.a;
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            EditText editText = onb.a.s.i;
            Editable text = editText.getText();
            editText.setText(tag.toString());
            editText.setSelection(editText.getText().length());
            okg.a((nzu) onb.a, (CharSequence) text);
        }
    }
}
