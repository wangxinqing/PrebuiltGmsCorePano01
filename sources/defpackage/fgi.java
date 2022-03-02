package defpackage;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.DeleteRequest;
import com.google.android.gms.auth.api.credentials.internal.SaveRequest;

/* renamed from: fgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface fgi extends IInterface {
    void a(fgc fgc);

    void a(fgc fgc, CredentialRequest credentialRequest);

    void a(fgc fgc, DeleteRequest deleteRequest);

    void a(fgc fgc, SaveRequest saveRequest);
}
