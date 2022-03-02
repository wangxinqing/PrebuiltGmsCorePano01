package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vpp implements DialogInterface.OnDismissListener {
    private final SettingsChimeraActivity a;

    public vpp(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.l = null;
    }
}
