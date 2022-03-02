package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.drive.deprecation.UpgradeDialogChimeraActivity;

/* renamed from: krh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class krh implements DialogInterface.OnClickListener {
    private final UpgradeDialogChimeraActivity a;
    private final String b;

    public krh(UpgradeDialogChimeraActivity upgradeDialogChimeraActivity, String str) {
        this.a = upgradeDialogChimeraActivity;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UpgradeDialogChimeraActivity upgradeDialogChimeraActivity = this.a;
        upgradeDialogChimeraActivity.startActivity(itg.b(this.b));
        upgradeDialogChimeraActivity.setResult(0);
        upgradeDialogChimeraActivity.finish();
    }
}
