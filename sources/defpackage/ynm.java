package defpackage;

import android.view.View;
import com.google.android.gms.plus.apps.ManageDeviceChimeraActivity;

/* renamed from: ynm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynm implements View.OnClickListener {
    final /* synthetic */ ManageDeviceChimeraActivity a;

    public ynm(ManageDeviceChimeraActivity manageDeviceChimeraActivity) {
        this.a = manageDeviceChimeraActivity;
    }

    public void onClick(View view) {
        ManageDeviceChimeraActivity manageDeviceChimeraActivity = this.a;
        manageDeviceChimeraActivity.a.show(manageDeviceChimeraActivity.getSupportFragmentManager(), yna.class.getSimpleName());
    }
}
