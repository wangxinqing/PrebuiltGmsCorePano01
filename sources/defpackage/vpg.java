package defpackage;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpg implements DialogInterface.OnShowListener {
    private final SettingsChimeraActivity a;
    private final EditText b;
    private final ss c;

    public vpg(SettingsChimeraActivity settingsChimeraActivity, EditText editText, ss ssVar) {
        this.a = settingsChimeraActivity;
        this.b = editText;
        this.c = ssVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        InputMethodManager inputMethodManager;
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        EditText editText = this.b;
        ss ssVar = this.c;
        boolean z = true;
        if (editText.requestFocus() && (inputMethodManager = (InputMethodManager) settingsChimeraActivity.getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
        Button a2 = ssVar.a(-1);
        a2.setTextColor(settingsChimeraActivity.getResources().getColorStateList(R.color.sharing_button_borderless_text_color));
        String trim = editText.getText().toString().trim();
        if (trim.isEmpty() || trim.equals(editText.getTag(R.id.device_name))) {
            z = false;
        }
        a2.setEnabled(z);
    }
}
