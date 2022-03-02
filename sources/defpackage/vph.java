package defpackage;

import android.os.Bundle;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vph implements acvv {
    private final SettingsChimeraActivity a;
    private final EditText b;
    private final ss c;
    private final Bundle d;

    public vph(SettingsChimeraActivity settingsChimeraActivity, EditText editText, ss ssVar, Bundle bundle) {
        this.a = settingsChimeraActivity;
        this.b = editText;
        this.c = ssVar;
        this.d = bundle;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        EditText editText = this.b;
        ss ssVar = this.c;
        Bundle bundle = this.d;
        String str = (String) obj;
        editText.setTag(R.id.device_name, str);
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        ssVar.setOnDismissListener(new vpq(settingsChimeraActivity));
        if (bundle != null) {
            ssVar.onRestoreInstanceState(bundle);
        }
        if (settingsChimeraActivity.isFinishing()) {
            ((anih) vvj.a.c()).a("SettingsActivity#editDeviceName: Alert dialog cannot show because Settings Activity is not running.");
            return;
        }
        ssVar.show();
        settingsChimeraActivity.h = ssVar;
    }
}
