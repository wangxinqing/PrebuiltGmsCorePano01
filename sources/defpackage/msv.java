package defpackage;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: msv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msv implements DialogInterface.OnClickListener {
    private final mta a;
    private final EditText b;

    public msv(mta mta, EditText editText) {
        this.a = mta;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.renameDevice(this.b.getText().toString());
    }
}
