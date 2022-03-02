package defpackage;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqg implements TextView.OnEditorActionListener {
    private final SetupChimeraActivity a;
    private final ss b;
    private final EditText c;

    public vqg(SetupChimeraActivity setupChimeraActivity, ss ssVar, EditText editText) {
        this.a = setupChimeraActivity;
        this.b = ssVar;
        this.c = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        ss ssVar = this.b;
        EditText editText = this.c;
        Button a2 = ssVar.a(-1);
        if (a2 == null || i != 6 || !a2.isEnabled()) {
            return false;
        }
        setupChimeraActivity.a((CharSequence) editText.getText());
        ssVar.dismiss();
        return true;
    }
}
