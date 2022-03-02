package defpackage;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqx implements DialogInterface.OnClickListener {
    private final SetupChimeraActivity a;
    private final EditText b;

    public vqx(SetupChimeraActivity setupChimeraActivity, EditText editText) {
        this.a = setupChimeraActivity;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a((CharSequence) this.b.getText());
    }
}
