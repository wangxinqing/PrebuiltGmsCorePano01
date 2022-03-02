package defpackage;

import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: achf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface achf {
    acwa a(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    acwa a(Account[] accountArr);

    acwa a(Assertion[] assertionArr);

    acwa a(Challenge[] challengeArr, boolean z, boolean z2);

    acwa a(UserBootstrapInfo[] userBootstrapInfoArr);

    acwa b(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);

    acwa c(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest);
}
