package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fbj implements aora {
    final /* synthetic */ fbk a;

    public fbj(fbk fbk) {
        this.a = fbk;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qal qal = (qal) obj;
        if (qal == null) {
            this.a.f.a(new fbm(Status.c, ampu.a));
            return;
        }
        fbk fbk = this.a;
        int i = qal.a;
        Intent intent = qal.b;
        if (i == -1 && intent.hasExtra(ConsentResult.a)) {
            intent.setExtrasClassLoader(ConsentResult.class.getClassLoader());
            fbk.s = (ConsentResult) intent.getParcelableExtra(ConsentResult.a);
            fbk.g.c();
            return;
        }
        fbk.g.d();
        fbk.a(new fbm(Status.e, ampu.a));
    }

    public final void a(Throwable th) {
        Status b = qbf.a(th).b();
        fbk.a.d("Encountered an error in native consent {error code= %d, error message= %s}", Integer.valueOf(b.i), amrk.b(b.j));
        this.a.f.a(new fbm(b, ampu.a));
    }
}
