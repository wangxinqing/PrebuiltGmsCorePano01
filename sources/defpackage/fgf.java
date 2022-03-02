package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: fgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface fgf extends IInterface {
    void a(fgb fgb);

    void a(fgb fgb, Account account);

    void a(fgb fgb, Account account, String str, Credential credential);

    void a(fgb fgb, Account account, String str, Credential credential, boolean z, String str2, String str3);

    void a(fgb fgb, Account account, String str, String str2, String str3);

    void a(fgb fgb, Account account, String str, boolean z);

    void a(fgb fgb, Account account, boolean z);

    void a(fgb fgb, HintRequest hintRequest);

    void a(fgb fgb, String str, CredentialRequest credentialRequest);

    void a(fgb fgb, String str, boolean z);

    void b(fgb fgb, Account account, boolean z);
}
