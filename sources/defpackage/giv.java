package defpackage;

import android.content.pm.PackageInstaller;

/* renamed from: giv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class giv extends PackageInstaller.SessionCallback {
    final /* synthetic */ gix a;

    public giv(gix gix) {
        this.a = gix;
    }

    public final void onActiveChanged(int i, boolean z) {
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
    }

    public final void onFinished(int i, boolean z) {
    }

    public final void onProgressChanged(int i, float f) {
        gix gix = this.a;
        iwd iwd = gix.a;
        PackageInstaller.SessionInfo sessionInfo = gix.f.getSessionInfo(i);
        if (sessionInfo != null && this.a.e.equals(sessionInfo.getAppPackageName())) {
            this.a.a(Integer.valueOf((int) (f * 100.0f)));
        }
    }
}
