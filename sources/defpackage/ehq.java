package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ehq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ehq {
    public final Context a;
    private final ehp b;

    public ehq(Context context) {
        this.a = context;
        this.b = new ehp(new izd(context, awin.a.a().a(), (int) awin.a.a().b(), -1, 4103));
    }

    public static boolean a(Throwable th) {
        babg babg = babg.OK;
        babj babj = th instanceof babl ? ((babl) th).a : th instanceof babk ? ((babk) th).a : null;
        if (babj == null) {
            babj = babj.d;
        }
        int ordinal = babj.r.ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14;
    }

    public final void a() {
        this.b.a.h();
    }

    public final ClientContext a(Account account, String str) {
        String str2;
        ClientContext clientContext = new ClientContext();
        clientContext.f = "com.google.android.gms";
        if (!str.isEmpty()) {
            clientContext.b = jhg.i(this.a, str);
            clientContext.e = str;
        }
        if (account != null) {
            try {
                str2 = eim.d(this.a, account, "oauth2:https://www.googleapis.com/auth/auditrecording-pa");
            } catch (eif | IOException e) {
                str2 = null;
            }
            if (str2 != null) {
                clientContext.d = account;
                clientContext.c = account;
                clientContext.d("https://www.googleapis.com/auth/auditrecording-pa");
                clientContext.a("auth_token", str2);
            }
        }
        return clientContext;
    }

    public final void a(ClientContext clientContext, aqoc aqoc) {
        ehp ehp = this.b;
        if (ehp.c == null) {
            ehp.c = baaj.a(baai.UNARY, "google.internal.api.auditrecording.v1.AuditRecordingMobileService/CreateAuditRecord", baoq.a(aqoc.h), baoq.a(aqod.a));
        }
        aqod aqod = (aqod) ehp.a.a(ehp.c, clientContext, aqoc, (long) ehp.b, TimeUnit.MILLISECONDS);
    }
}
