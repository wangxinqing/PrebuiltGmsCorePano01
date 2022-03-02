package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: fpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpc implements aoqb {
    private final fpl a;
    private final aorr b;

    public fpc(fpl fpl, aorr aorr) {
        this.a = fpl;
        this.b = aorr;
    }

    public final aorr a(Object obj) {
        fpl fpl = this.a;
        aorr aorr = this.b;
        amzy amzy = (amzy) obj;
        if (amzy.isEmpty()) {
            evc evc = new evc();
            CredentialRequest credentialRequest = fpl.d;
            evc.a = credentialRequest.b;
            String[] strArr = credentialRequest.c;
            if (strArr == null) {
                strArr = new String[0];
            }
            evc.b = strArr;
            CredentialPickerConfig credentialPickerConfig = credentialRequest.e;
            iva.a((Object) credentialPickerConfig);
            evc.c = credentialPickerConfig;
            if (evc.b == null) {
                evc.b = new String[0];
            }
            boolean z = evc.a;
            if (z || evc.b.length != 0) {
                HintRequest hintRequest = new HintRequest(2, evc.c, z, false, evc.b, false, (String) null, (String) null);
                String c = hiq.c(fpl.c);
                String str = fpl.e;
                Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", c);
                putExtra.putExtra("logSessionId", str);
                ivy.a((SafeParcelable) hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
                qbe a2 = qbf.a();
                a2.c = 28421;
                a2.d = amri.b(PendingIntent.getActivity(fpl.a, 0, putExtra, 134217728));
                throw a2.a();
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
        amzy amzy2 = (amzy) aorl.a((Future) aorr);
        return aopr.a(qay.a(amzy.a(anbs.a((Iterable) amzy2, (amqy) new fpd(fpl))), fpe.a), (aoqb) new fpf(fpl, amzy, amzy2), (Executor) aoqm.a);
    }
}
