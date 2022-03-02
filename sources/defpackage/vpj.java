package defpackage;

import android.content.DialogInterface;
import android.widget.RadioButton;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpj implements DialogInterface.OnClickListener {
    private final SettingsChimeraActivity a;
    private final RadioButton b;
    private final RadioButton c;
    private final RadioButton d;

    public vpj(SettingsChimeraActivity settingsChimeraActivity, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.a = settingsChimeraActivity;
        this.b = radioButton;
        this.c = radioButton2;
        this.d = radioButton3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        RadioButton radioButton = this.b;
        RadioButton radioButton2 = this.c;
        RadioButton radioButton3 = this.d;
        if (radioButton.isChecked()) {
            settingsChimeraActivity.a(2);
        } else if (radioButton2.isChecked()) {
            settingsChimeraActivity.a(3);
        } else if (radioButton3.isChecked()) {
            settingsChimeraActivity.a(1);
        }
    }
}
