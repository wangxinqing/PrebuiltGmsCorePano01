package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpv implements View.OnClickListener {
    private final SettingsChimeraActivity a;

    public vpv(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public void onClick(View view) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        settingsChimeraActivity.startActivityForResult(ContactSelectChimeraActivity.a((Context) settingsChimeraActivity), 1002);
    }
}
