package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: achx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achx implements icl {
    public final UserCredential[] a;
    public final String b;
    public final String c;
    private final Status d;

    public achx(Status status, UserCredential[] userCredentialArr, String str, String str2) {
        this.d = status;
        this.a = userCredentialArr;
        this.b = str;
        this.c = str2;
    }

    public final Status aO() {
        return this.d;
    }
}
