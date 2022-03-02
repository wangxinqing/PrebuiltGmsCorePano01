package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

/* renamed from: fqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fqq implements amsv {
    private final CredentialPickerChimeraActivity a;
    private final amri b;

    public fqq(CredentialPickerChimeraActivity credentialPickerChimeraActivity, amri amri) {
        this.a = credentialPickerChimeraActivity;
        this.b = amri;
    }

    public final Object a() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.a;
        return qbc.a(credentialPickerChimeraActivity.i.a((ihb) new eut((Account) this.b.b(), credentialPickerChimeraActivity.a, ((HintRequest) credentialPickerChimeraActivity.b.b()).g, ((HintRequest) credentialPickerChimeraActivity.b.b()).h)));
    }
}
