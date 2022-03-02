package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpb implements acvv {
    private final SettingsChimeraActivity a;

    public vpb(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 1) {
            settingsChimeraActivity.j.setText(R.string.sharing_settings_data_usage_item_never);
            settingsChimeraActivity.k.setText(R.string.sharing_settings_data_usage_item_never_description);
        } else if (intValue == 2) {
            settingsChimeraActivity.j.setText(R.string.sharing_settings_data_usage_item_always);
            settingsChimeraActivity.k.setText(R.string.sharing_settings_data_usage_item_always_description);
        } else if (intValue == 3) {
            settingsChimeraActivity.j.setText(R.string.sharing_settings_data_usage_item_wifi);
            settingsChimeraActivity.k.setText(R.string.sharing_settings_data_usage_item_wifi_description);
        }
    }
}
