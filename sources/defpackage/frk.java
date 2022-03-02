package defpackage;

import android.content.pm.ApplicationInfo;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class frk implements amrm {
    public static final amrm a = new frk();

    private frk() {
    }

    public final boolean a(Object obj) {
        int i = CredentialsSettingsChimeraActivity.i;
        return (((ApplicationInfo) obj).flags & 1) == 0;
    }
}
