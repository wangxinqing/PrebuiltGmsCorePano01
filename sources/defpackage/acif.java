package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: acif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acif implements icl {
    public final ExchangeAssertionsForUserCredentialsRequest a;
    private final Status b;

    public acif(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.b = status;
        this.a = exchangeAssertionsForUserCredentialsRequest;
    }

    public final Status aO() {
        return this.b;
    }
}
