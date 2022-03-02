package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aeru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeru implements aerk {
    public final awdn a;
    public final awdn b;
    private final Executor c;
    private final Context d;

    public aeru(Executor executor, awdn awdn, Context context, awdn awdn2) {
        this.c = executor;
        this.a = awdn;
        this.d = context;
        this.b = awdn2;
    }

    public final aorr a(Account account, List list) {
        aorr aorr;
        aucd o = aokd.c.o();
        String valueOf = String.valueOf(amre.a(' ').a((Iterable) list));
        String str = valueOf.length() == 0 ? new String("oauth2:https://www.googleapis.com/auth/mdh ") : "oauth2:https://www.googleapis.com/auth/mdh ".concat(valueOf);
        try {
            aorr = aorl.a((Object) eim.d(this.d, account, str));
        } catch (UserRecoverableAuthException e) {
            aorr = aorl.a((Throwable) new aetl(e));
        } catch (eif e2) {
            aorr = aorl.a((Throwable) new aetk(e2));
        } catch (IOException e3) {
            aorr = aorl.a((Throwable) e3);
        }
        return aooz.a(aopr.a(aorr, (amqy) new aers(this, o), this.c), Exception.class, (aoqb) new aert(this, o, str), this.c);
    }

    public final azxf b(String str) {
        return new bacd(new ammu(new ammr(str)));
    }

    public final aorr a(String str) {
        try {
            eim.e(this.d, str);
            return aorl.a((Object) null);
        } catch (UserRecoverableAuthException e) {
            return aorl.a((Throwable) new aetl(e));
        } catch (eif e2) {
            return aorl.a((Throwable) new aetk(e2));
        } catch (IOException e3) {
            return aorl.a((Throwable) e3);
        }
    }
}
