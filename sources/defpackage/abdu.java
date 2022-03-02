package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* renamed from: abdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface abdu extends IInterface {
    void a(int i);

    void a(int i, Account account, abdr abdr);

    void a(abdr abdr);

    void a(AuthAccountRequest authAccountRequest, abdr abdr);

    void a(ResolveAccountRequest resolveAccountRequest, iue iue);

    void a(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, abdr abdr);

    void a(RecordConsentRequest recordConsentRequest, abdr abdr);

    void a(SignInRequest signInRequest, abdr abdr);

    void a(itm itm, int i, boolean z);

    void a(boolean z);

    void b();

    void c();
}
