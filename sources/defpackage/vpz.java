package defpackage;

import android.content.Context;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpz implements acvv {
    private final SettingsChimeraActivity a;

    public vpz(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        if (!((Boolean) obj).booleanValue()) {
            settingsChimeraActivity.startActivityForResult(SetupChimeraActivity.a((Context) settingsChimeraActivity), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
    }
}
