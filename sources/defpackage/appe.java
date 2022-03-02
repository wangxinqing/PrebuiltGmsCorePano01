package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: appe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class appe extends aptg {
    final /* synthetic */ appf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public appe(appf appf, aptg aptg) {
        super(aptg.c, aptg.b);
        this.a = appf;
    }

    public final void a(Status status) {
        appf.a.d("onFailure", new Object[0]);
        appf.a(this.a.d, new appc(), status);
        this.a.h = 5;
    }

    public final void a(String str) {
        appf.a.d("onCodeSent", new Object[0]);
        appf appf = this.a;
        appf.i = str;
        appf.h = 3;
        appf.b();
        appf appf2 = this.a;
        if (appf2.e && !TextUtils.isEmpty(appf2.j)) {
            this.a.a(false);
        }
        appf appf3 = this.a;
        if (!appf3.f || !appf3.e) {
            appf3.c();
        }
    }
}
