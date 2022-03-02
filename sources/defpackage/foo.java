package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: foo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class foo extends qcg {
    public static final iwd a = ehv.b("AccountReauthFragment");
    public String b;
    public int c;
    public Account d;
    public Context e;
    public gck f;
    public fop g;
    public String h;
    private final aoru i = jfb.a(1, 9);
    private jls j;
    private aosh k;
    private boolean l;
    private final amsv m = new fok(this);

    public static foo a(Account account, String str, String str2) {
        amrl.a((Object) account);
        amrl.a((Object) str);
        amrl.a((Object) str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putString("calling_package", str);
        bundle.putString("session_id", str2);
        foo foo = new foo();
        foo.setArguments(bundle);
        return foo;
    }

    private final aorr c() {
        aosh f2 = aosh.f();
        this.k = f2;
        return qay.a((aorr) f2, (Object) amri.b(1));
    }

    public final void b() {
        aorr aorr;
        int i2 = this.c;
        if (i2 == 1) {
            aorr = this.i.b(new fol(this, amzy.a((Object) new Scope("profile"))));
        } else if (i2 == 2) {
            aorr = c();
            qub.a(this.e).a(this.d, this.h, Bundle.EMPTY, (Activity) null, (AccountManagerCallback) new fom(this));
        } else if (i2 == 3) {
            aorr = c();
            amri a2 = pzw.a(this.e, this.d, Bundle.EMPTY);
            if (!a2.a()) {
                this.k.a((Throwable) qbf.a("Device management is not supported", 8));
            } else {
                startActivityForResult((Intent) a2.b(), 102);
            }
        } else if (i2 == 4) {
            startActivityForResult(pzw.a(this.e, this.d), 103);
            aorr = c();
        } else {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Invalid flowStep was reached: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        aorl.a(aorr, new fon(this), this.j);
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        amri amri;
        Status status;
        switch (i2) {
            case 101:
            case 103:
                if (i3 == -1) {
                    this.k.b((Object) null);
                    return;
                } else if (i3 != 0) {
                    this.k.a((Throwable) qbf.a(8));
                    return;
                } else {
                    this.k.a((Throwable) qbf.a(16));
                    return;
                }
            case 102:
                switch (i3) {
                    case 2:
                    case 7:
                    case 8:
                        status = new Status(8, "Unexpected server error");
                        break;
                    case 3:
                        status = new Status(7, "Network error");
                        break;
                    case 4:
                        status = new Status(8, "App installation failure");
                        break;
                    case 5:
                    case 9:
                        status = new Status(8, "Device management not supported");
                        break;
                    case 6:
                    case 10:
                        status = new Status(16, "User canceled");
                        break;
                    default:
                        amri = ampu.a;
                        break;
                }
                amri = amri.b(status);
                if (amri.a()) {
                    this.k.a((Throwable) qbf.a(((Status) amri.b()).j, ((Status) amri.b()).i));
                    return;
                } else {
                    this.k.b((Object) null);
                    return;
                }
            default:
                return;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        amrl.a((Object) arguments);
        Account account = (Account) arguments.getParcelable("account");
        amrl.a((Object) account);
        this.d = account;
        String string = arguments.getString("calling_package");
        amrl.a((Object) string);
        this.b = string;
        amrl.a((Object) arguments.getString("session_id"));
        this.j = new jls((Handler) new qvr(Looper.getMainLooper()));
        this.e = getContext().getApplicationContext();
        this.c = 1;
        this.g = (fop) qck.a(getActivity()).a(fop.class);
        this.j = new jls((Handler) new qvr(Looper.getMainLooper()));
        this.f = (gck) this.m.a();
    }

    public final void a() {
        if (!this.l) {
            this.l = true;
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
            if (intent == null) {
                this.k.a((Throwable) qbf.a(8));
            } else {
                startActivityForResult(intent, 101);
            }
        } catch (AuthenticatorException e2) {
            this.k.a((Throwable) qbf.a("Authenticator error", 8));
        } catch (OperationCanceledException e3) {
            this.k.a((Throwable) qbf.a("Reauth canceled", 16));
        } catch (IOException e4) {
            this.k.a((Throwable) qbf.a("Network error", 8));
        }
    }
}
