package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;

/* renamed from: acjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acjn implements igp {
    private final ExchangeSessionCheckpointsForUserCredentialsRequest a;

    public acjn(ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.a = exchangeSessionCheckpointsForUserCredentialsRequest;
    }

    public final void a(Object obj, Object obj2) {
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = this.a;
        acix acix = (acix) obj;
        acjp acjp = new acjp((acwd) obj2, aciz.a);
        acix.w();
        ((acjv) acix.x()).a((acjs) new aciq(acjp), exchangeSessionCheckpointsForUserCredentialsRequest);
    }
}
