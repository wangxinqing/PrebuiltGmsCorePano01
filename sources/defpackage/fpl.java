package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.Executor;

/* renamed from: fpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fpl implements fcu {
    public final Context a;
    public final fis b;
    public final String c;
    public final CredentialRequest d;
    public final String e;
    public final fkw f = fkw.a();
    public final fjh g;

    public fpl(Context context, String str, CredentialRequest credentialRequest, String str2) {
        this.a = context;
        this.g = fjh.a(context);
        this.b = fkm.a(context);
        this.c = str;
        this.d = credentialRequest;
        this.e = str2;
    }

    public final aorr a(fde fde) {
        aorr a2 = new fmo(this.a).a(fde);
        return aopr.a(aopr.a(a2, (aoqb) new fpa(this, fde), (Executor) aoqm.a), (aoqb) new fpc(this, a2), (Executor) aoqm.a);
    }

    public final aorr a(boolean z) {
        String c2 = hiq.c(this.c);
        CredentialRequest credentialRequest = this.d;
        String str = this.e;
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", c2).putExtra("firstTime", z);
        putExtra.putExtra("logSessionId", str);
        ivy.a((SafeParcelable) credentialRequest, putExtra, "credentialRequest");
        qbe a2 = qbf.a();
        a2.c = 28422;
        a2.d = amri.b(PendingIntent.getActivity(this.a, 0, putExtra, 134217728));
        throw a2.a().c();
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_REQUEST;
    }
}
