package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

/* renamed from: fol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fol implements Callable {
    private final foo a;
    private final amzy b;

    public fol(foo foo, amzy amzy) {
        this.a = foo;
        this.b = amzy;
    }

    public final Object call() {
        Status status;
        foo foo = this.a;
        amzy amzy = this.b;
        Account account = foo.d;
        int i = jhg.i(foo.e, foo.b);
        qah a2 = qah.a(account, (Iterable) amzy);
        a2.a(5);
        a2.a(foo.b, i);
        TokenRequest a3 = a2.a();
        TokenResponse a4 = foo.f.a(a3);
        if (a4 != null) {
            gei gei = gei.CLIENT_LOGIN_DISABLED;
            int ordinal = a4.b().ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        status = new Status(7, "Network error");
                    } else if (ordinal == 6) {
                        status = new Status(8, "Service unavailable");
                    } else if (ordinal == 7) {
                        status = new Status(8, "Internal error");
                    } else if (ordinal != 8) {
                        if (!(ordinal == 20 || ordinal == 21)) {
                            switch (ordinal) {
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 35:
                                    break;
                                case 34:
                                    return amri.b(4);
                                default:
                                    status = new Status(8, "Unknown error");
                                    break;
                            }
                        }
                    } else {
                        foo.h = a3.b;
                        return amri.b(2);
                    }
                    throw qbf.a(status.j, status.i);
                }
                return ampu.a;
            }
            return amri.b(3);
        }
        throw qbf.a(8);
    }
}
