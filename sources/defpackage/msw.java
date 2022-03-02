package defpackage;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;

/* renamed from: msw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msw implements DialogInterface.OnShowListener {
    private final mta a;
    private final ss b;
    private final EditText c;

    public msw(mta mta, ss ssVar, EditText editText) {
        this.a = mta;
        this.b = ssVar;
        this.c = editText;
    }

    public final void onShow(DialogInterface dialogInterface) {
        mta mta = this.a;
        ss ssVar = this.b;
        EditText editText = this.c;
        Button a2 = ssVar.a(-1);
        a2.setEnabled(false);
        ((anih) ((anih) mte.a.d()).a("mta", "a", 444, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: show RenameDialog for device %s", (Object) mta.c);
        editText.addTextChangedListener(new msz(mta, a2));
    }
}
