package defpackage;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpn implements DialogInterface.OnShowListener {
    private final SettingsChimeraActivity a;
    private final ss b;
    private final RadioButton c;
    private final RadioButton d;
    private final RadioButton e;
    private final RadioGroup f;

    public vpn(SettingsChimeraActivity settingsChimeraActivity, ss ssVar, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup) {
        this.a = settingsChimeraActivity;
        this.b = ssVar;
        this.c = radioButton;
        this.d = radioButton2;
        this.e = radioButton3;
        this.f = radioGroup;
    }

    public final void onShow(DialogInterface dialogInterface) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        ss ssVar = this.b;
        RadioButton radioButton = this.c;
        RadioButton radioButton2 = this.d;
        RadioButton radioButton3 = this.e;
        RadioGroup radioGroup = this.f;
        int i = -1;
        Button a2 = ssVar.a(-1);
        a2.setTextColor(settingsChimeraActivity.getResources().getColorStateList(R.color.sharing_button_borderless_text_color));
        boolean isChecked = radioButton.isChecked();
        boolean z = true;
        if (isChecked) {
            i = 2;
        } else if (radioButton2.isChecked()) {
            i = 3;
        } else if (radioButton3.isChecked()) {
            i = 1;
        }
        if (i == ((Integer) radioGroup.getTag(R.id.data_usage)).intValue()) {
            z = false;
        }
        a2.setEnabled(z);
    }
}
