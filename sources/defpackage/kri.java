package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.drive.deprecation.UpgradeDialogChimeraActivity;

/* renamed from: kri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class kri implements DialogInterface.OnClickListener {
    private final UpgradeDialogChimeraActivity a;

    public kri(UpgradeDialogChimeraActivity upgradeDialogChimeraActivity) {
        this.a = upgradeDialogChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UpgradeDialogChimeraActivity upgradeDialogChimeraActivity = this.a;
        upgradeDialogChimeraActivity.setResult(0);
        upgradeDialogChimeraActivity.finish();
    }
}
