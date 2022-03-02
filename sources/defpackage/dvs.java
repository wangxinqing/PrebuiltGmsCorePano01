package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: dvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvs implements View.OnClickListener {
    final /* synthetic */ AppInviteChimeraActivity a;

    public dvs(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.a = appInviteChimeraActivity;
    }

    public void onClick(View view) {
        AppInviteChimeraActivity appInviteChimeraActivity = this.a;
        if (appInviteChimeraActivity.i != null) {
            FragmentManager supportFragmentManager = appInviteChimeraActivity.getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            this.a.h = (dyc) supportFragmentManager.findFragmentByTag("imagePreviewFragment");
            AppInviteChimeraActivity appInviteChimeraActivity2 = this.a;
            if (appInviteChimeraActivity2.h == null) {
                Bitmap bitmap = appInviteChimeraActivity2.i;
                dyc dyc = new dyc();
                Bundle bundle = new Bundle();
                bundle.putParcelable("image", bitmap);
                dyc.setArguments(bundle);
                appInviteChimeraActivity2.h = dyc;
                AppInviteChimeraActivity appInviteChimeraActivity3 = this.a;
                appInviteChimeraActivity3.h.a = appInviteChimeraActivity3.j;
            }
            beginTransaction.add((Fragment) this.a.h, "imagePreviewFragment");
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
