package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: acjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acjm implements igp {
    private final ExchangeAssertionsForUserCredentialsRequest a;

    public acjm(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.a = exchangeAssertionsForUserCredentialsRequest;
    }

    public final void a(Object obj, Object obj2) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = this.a;
        acix acix = (acix) obj;
        acjp acjp = new acjp((acwd) obj2, acja.a);
        acix.w();
        ((acjv) acix.x()).c(new acip(acjp), exchangeAssertionsForUserCredentialsRequest);
    }
}
