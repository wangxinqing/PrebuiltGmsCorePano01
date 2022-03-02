package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

/* renamed from: fqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fqo implements amsv {
    private final CredentialPickerChimeraActivity a;
    private final Account b;
    private final InternalCredentialWrapper c;

    public fqo(CredentialPickerChimeraActivity credentialPickerChimeraActivity, Account account, InternalCredentialWrapper internalCredentialWrapper) {
        this.a = credentialPickerChimeraActivity;
        this.b = account;
        this.c = internalCredentialWrapper;
    }

    public final Object a() {
        CredentialPickerChimeraActivity credentialPickerChimeraActivity = this.a;
        return qbc.a(credentialPickerChimeraActivity.i.a((ihb) new eus(this.b, credentialPickerChimeraActivity.a, this.c.a, ((CredentialRequest) credentialPickerChimeraActivity.c.b()).f, ((CredentialRequest) credentialPickerChimeraActivity.c.b()).g, ((CredentialRequest) credentialPickerChimeraActivity.c.b()).h)));
    }
}
