package defpackage;

import android.view.View;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: dvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvr implements View.OnClickListener {
    final /* synthetic */ AppInviteChimeraActivity a;

    public dvr(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.a = appInviteChimeraActivity;
    }

    public void onClick(View view) {
        this.a.getSupportFragmentManager().beginTransaction().remove(this.a.h).commitAllowingStateLoss();
    }
}
