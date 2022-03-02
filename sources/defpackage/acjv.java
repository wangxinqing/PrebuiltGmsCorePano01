package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: acjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface acjv extends IInterface {
    void a();

    void a(acjs acjs);

    void a(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    void a(acjs acjs, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest);

    void a(acjs acjs, boolean z);

    void a(acjs acjs, Account[] accountArr);

    void a(acjs acjs, Assertion[] assertionArr);

    void a(acjs acjs, Challenge[] challengeArr, boolean z);

    void a(acjs acjs, Challenge[] challengeArr, boolean z, boolean z2);

    void a(acjs acjs, UserBootstrapInfo[] userBootstrapInfoArr);

    void b(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    void c(acjs acjs, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);
}
