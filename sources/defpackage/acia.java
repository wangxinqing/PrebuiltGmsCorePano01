package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: acia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acia implements icl {
    public final UserCredential[] a;
    private final Status b;

    public acia(Status status, UserCredential[] userCredentialArr) {
        this.b = status;
        this.a = userCredentialArr;
    }

    public final Status aO() {
        return this.b;
    }
}
