package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

/* renamed from: fqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqv implements aora {
    final /* synthetic */ CredentialPickerChimeraActivity a;

    public fqv(CredentialPickerChimeraActivity credentialPickerChimeraActivity) {
        this.a = credentialPickerChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a(-1, 201, (Credential) obj);
    }

    public final void a(Throwable th) {
        this.a.a(0, 205);
    }
}
