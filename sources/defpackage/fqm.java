package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;
import java.util.concurrent.Executor;

/* renamed from: fqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fqm implements amsv {
    private final CredentialPickerChimeraActivity a;

    public fqm(CredentialPickerChimeraActivity credentialPickerChimeraActivity) {
        this.a = credentialPickerChimeraActivity;
    }

    public final Object a() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.a;
        if (credentialPickerChimeraActivity.c.a()) {
            return qbc.a(credentialPickerChimeraActivity.i.a((ihb) new euq(credentialPickerChimeraActivity.a, (CredentialRequest) credentialPickerChimeraActivity.c.b())));
        }
        return aopr.a(qbc.a(credentialPickerChimeraActivity.i.a((ihb) new eur((HintRequest) credentialPickerChimeraActivity.b.b()))), fqs.a, (Executor) aoqm.a);
    }
}
