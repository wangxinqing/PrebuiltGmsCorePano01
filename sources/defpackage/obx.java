package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/* renamed from: obx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class obx implements View.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ LinearLayout b;
    final /* synthetic */ oby c;

    public obx(oby oby, EditText editText, LinearLayout linearLayout) {
        this.c = oby;
        this.a = editText;
        this.b = linearLayout;
    }

    public void onClick(View view) {
        oby oby = this.c;
        EditText editText = this.a;
        if (editText.hasFocus()) {
            int indexOf = oby.b.indexOf(editText) - 1;
            if (indexOf >= 0) {
                ((EditText) oby.b.get(indexOf)).requestFocus();
            } else {
                oby.a.requestFocus();
            }
        }
        oby.b.remove(editText);
        oby.a();
        this.c.removeView(this.b);
    }
}
