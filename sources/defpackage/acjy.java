package defpackage;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;

/* renamed from: acjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acjy {
    public final qub a;

    public acjy(Context context) {
        this.a = acpd.a(context);
    }

    static final /* synthetic */ void a(agz agz, AccountManagerFuture accountManagerFuture) {
        try {
            agz.a((Object) (Boolean) accountManagerFuture.getResult());
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            agz.a(e);
        }
    }
}
