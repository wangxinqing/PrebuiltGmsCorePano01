package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;

/* renamed from: achu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class achu implements icl {
    public final Assertion[] a;
    private final Status b;

    public achu(Status status, Assertion[] assertionArr) {
        this.b = status;
        this.a = assertionArr;
    }

    public final Status aO() {
        return this.b;
    }
}
