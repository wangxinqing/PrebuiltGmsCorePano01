package defpackage;

import android.support.v7.widget.SwitchCompat;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqa implements acvv {
    private final SettingsChimeraActivity a;

    public vqa(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void a(Object obj) {
        int i;
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        Boolean bool = (Boolean) obj;
        if (settingsChimeraActivity.b.isChecked() != bool.booleanValue()) {
            settingsChimeraActivity.b.setChecked(bool.booleanValue());
        }
        SwitchCompat switchCompat = settingsChimeraActivity.b;
        if (!bool.booleanValue()) {
            i = R.string.sharing_settings_toggle_off;
        } else {
            i = R.string.sharing_settings_toggle_on;
        }
        switchCompat.setText(i);
    }
}
