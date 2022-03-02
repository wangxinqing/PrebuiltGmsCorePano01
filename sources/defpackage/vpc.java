package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vpc implements acvv {
    private final SettingsChimeraActivity a;

    public vpc(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        Integer num = (Integer) obj;
        settingsChimeraActivity.i.setText(settingsChimeraActivity.getResources().getQuantityString(R.plurals.sharing_settings_button_select_contacts_description, num.intValue(), new Object[]{num}));
    }
}
