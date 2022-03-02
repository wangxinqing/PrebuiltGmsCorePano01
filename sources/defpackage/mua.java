package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.PreviewChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: mua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mua implements Runnable {
    final /* synthetic */ muc a;

    public mua(muc muc) {
        this.a = muc;
    }

    public final void run() {
        muc muc = this.a;
        PreviewChimeraActivity previewChimeraActivity = muc.a;
        HelpConfig helpConfig = previewChimeraActivity.a;
        if (helpConfig != null) {
            helpConfig.c(previewChimeraActivity);
            if (helpConfig.G) {
                List a2 = helpConfig.a((Context) muc.a);
                if (a2 != null) {
                    muc.a(a2);
                }
                muc.e = false;
                muc.as();
                return;
            }
            muc.c();
            return;
        }
        throw new IllegalStateException("HelpConfig required but not available.");
    }
}
