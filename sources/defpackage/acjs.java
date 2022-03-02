package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;

/* renamed from: acjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface acjs extends IInterface {
    void a(Status status);

    void a(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    void a(Status status, BootstrapAccount[] bootstrapAccountArr);

    void a(Status status, Assertion[] assertionArr);

    void a(Status status, Challenge[] challengeArr);

    void a(Status status, UserBootstrapInfo[] userBootstrapInfoArr);

    void a(Status status, UserCredential[] userCredentialArr);

    void a(Status status, UserCredential[] userCredentialArr, String str, String str2);

    void b(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    void c(Status status, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);
}
