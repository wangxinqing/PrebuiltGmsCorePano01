package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSaveConfirmationChimeraActivity;

/* renamed from: fqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fqd implements amqy {
    private final fqe a;
    private final amzy b;

    public fqd(fqe fqe, amzy amzy) {
        this.a = fqe;
        this.b = amzy;
    }

    public final Object a(Object obj) {
        ampu ampu;
        fqe fqe = this.a;
        amzy amzy = this.b;
        fqe.a.b("Returning intent for saving with %d accounts.", Integer.valueOf(amzy.size()));
        amri d = anbs.d(amzy, new fpo(fqe));
        Context context = fqe.b;
        String str = fqe.d;
        Credential credential = fqe.e;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        amzy a2 = amzy.a(anbs.a((Iterable) amzy, fpp.a));
        if (d.a()) {
            ampu = amri.b(((pyv) d.b()).a());
        } else {
            ampu = ampu.a;
        }
        PendingIntent activity = PendingIntent.getActivity(fqe.b, 0, CredentialsSaveConfirmationChimeraActivity.a(context, str, credential, booleanValue, a2, ampu, fqe.f), 134217728);
        qbe a3 = qbf.a();
        a3.c = 28423;
        a3.d = amri.b(activity);
        throw a3.a().c();
    }
}
