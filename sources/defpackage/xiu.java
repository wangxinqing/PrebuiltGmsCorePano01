package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

/* renamed from: xiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xiu implements icm {
    final /* synthetic */ AvatarChimeraActivity a;

    public xiu(AvatarChimeraActivity avatarChimeraActivity) {
        this.a = avatarChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlk wlk = (wlk) icl;
        Status aO = wlk.aO();
        String b = wlk.b();
        AvatarChimeraActivity avatarChimeraActivity = this.a;
        avatarChimeraActivity.f = false;
        DialogFragment dialogFragment = avatarChimeraActivity.a;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        Intent intent = new Intent();
        if (!aO.c() || TextUtils.isEmpty(b)) {
            this.a.setResult(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL", b);
            this.a.a(iau.b, "2");
            this.a.a(iat.a, (String) null);
            this.a.setResult(-1, intent);
        }
        this.a.finish();
    }
}
