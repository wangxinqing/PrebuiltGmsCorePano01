package defpackage;

import android.net.Uri;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

/* renamed from: xis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xis implements icm {
    final /* synthetic */ AvatarChimeraActivity a;

    public xis(AvatarChimeraActivity avatarChimeraActivity) {
        this.a = avatarChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wla wla = (wla) icl;
        if (!wla.aO().c() || wla.b().a() != 1) {
            this.a.f();
            this.a.d();
            return;
        }
        AvatarChimeraActivity avatarChimeraActivity = this.a;
        avatarChimeraActivity.b = true;
        Uri uri = avatarChimeraActivity.c;
        if (uri == null && avatarChimeraActivity.d == null && !avatarChimeraActivity.f) {
            new xjb().show(avatarChimeraActivity.getSupportFragmentManager(), "source_dialog");
        } else if ((uri == null && avatarChimeraActivity.d == null) || avatarChimeraActivity.f || avatarChimeraActivity.e != null) {
        } else {
            if (uri == null) {
                Uri uri2 = avatarChimeraActivity.d;
                if (uri2 != null) {
                    avatarChimeraActivity.a(uri2);
                    return;
                }
                return;
            }
            avatarChimeraActivity.a(uri);
        }
    }
}
