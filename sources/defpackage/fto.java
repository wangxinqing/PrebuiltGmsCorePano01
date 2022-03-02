package defpackage;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.List;

/* renamed from: fto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface fto extends IInterface {
    void a(ftc ftc, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper);

    void a(fth fth, String str, String str2);

    void a(ftk ftk, String str, String str2);

    void a(ftr ftr, String str, BeginSignInRequest beginSignInRequest);

    void a(ftu ftu, SavePasswordRequest savePasswordRequest, String str);

    void a(ifu ifu, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2);

    void a(ifu ifu, SavePasswordRequest savePasswordRequest, List list, String str);

    void a(ifu ifu, String str, String str2);

    void a(ifu ifu, String str, String str2, Account account);

    void b(ifu ifu, String str, String str2);

    void b(ifu ifu, String str, String str2, Account account);
}
