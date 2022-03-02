package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: eke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eke extends qvr {
    final /* synthetic */ ekf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eke(ekf ekf, Looper looper) {
        super(looper);
        this.a = ekf;
    }

    public final void handleMessage(Message message) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest;
        String string;
        int i = message.what;
        if (i == 1) {
            byte[] byteArray = message.getData().getByteArray("bootstrapAssertion");
            ekf ekf = this.a;
            if (byteArray != null) {
                exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) ivy.a(byteArray, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
            } else {
                exchangeAssertionsForUserCredentialsRequest = null;
            }
            iwd iwd = ekf.a;
            ekf.b = exchangeAssertionsForUserCredentialsRequest;
        } else if (i == 1001 && (string = message.getData().getString("errorMsg")) != null) {
            ekf.a.e("Error fetching assertion: %s", string);
        }
        ekf.c.release();
    }
}
