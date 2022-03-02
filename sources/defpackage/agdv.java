package defpackage;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: agdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agdv implements agcv, agct {
    final /* synthetic */ agdx a;

    public agdv(agdx agdx) {
        this.a = agdx;
    }

    public final void a(Activity activity) {
        agfe agfe;
        agdx agdx = this.a;
        Class<?> cls = activity.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            String valueOf = String.valueOf((Object) null);
            String valueOf2 = String.valueOf(cls.getSimpleName());
            agfe = new agfe(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        } else {
            agfe = new agfe(cls.getSimpleName());
        }
        agdx.a = agfe;
    }

    public final void b(Activity activity) {
        this.a.a = null;
        if (this.a.c.get()) {
            ((aorv) this.a.b.a()).a(new agdu(this));
        }
    }
}
