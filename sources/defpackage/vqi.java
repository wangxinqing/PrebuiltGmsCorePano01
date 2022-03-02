package defpackage;

import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqi implements acvv {
    private final SetupChimeraActivity a;
    private final EditText b;
    private final ss c;

    public vqi(SetupChimeraActivity setupChimeraActivity, EditText editText, ss ssVar) {
        this.a = setupChimeraActivity;
        this.b = editText;
        this.c = ssVar;
    }

    public final void a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        EditText editText = this.b;
        ss ssVar = this.c;
        String str = (String) obj;
        editText.setTag(R.id.device_name, str);
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        if (setupChimeraActivity.isFinishing()) {
            ((anih) vvj.a.c()).a("SetupActivity#editDeviceName: Alert dialog cannot show because Setup Activity is not running.");
        } else {
            ssVar.show();
        }
    }
}
