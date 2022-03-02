package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: fwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwm extends bhw implements fwn {
    private final Context a;

    public fwm() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    private final void a() {
        if (!jll.a(this.a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    public final void b() {
        fwf fwf;
        fwd fwd;
        a();
        fww a2 = fww.a(this.a);
        GoogleSignInAccount a3 = a2.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f;
        if (a3 != null) {
            googleSignInOptions = a2.b();
        }
        Context context = this.a;
        iva.a((Object) googleSignInOptions);
        fvr fvr = new fvr(context, googleSignInOptions);
        if (a3 == null) {
            icc icc = fvr.j;
            Context context2 = fvr.c;
            int a4 = fvr.a();
            fwh.a.b("Signing out", new Object[0]);
            fwh.a(context2);
            if (a4 == 3) {
                fwd = ich.a(Status.a, icc);
            } else {
                fwd fwd2 = new fwd(icc);
                icc.b((idf) fwd2);
                fwd = fwd2;
            }
            iux.a(fwd);
            return;
        }
        icc icc2 = fvr.j;
        Context context3 = fvr.c;
        int a5 = fvr.a();
        fwh.a.b("Revoking access", new Object[0]);
        String a6 = fww.a(context3).a("refreshToken");
        fwh.a(context3);
        if (a5 == 3) {
            fwf = fvz.a(a6);
        } else {
            fwf fwf2 = new fwf(icc2);
            icc2.b((idf) fwf2);
            fwf = fwf2;
        }
        iux.a(fwf);
    }

    public fwm(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
        } else if (i != 2) {
            return false;
        } else {
            a();
            fwj.a(this.a).a();
        }
        return true;
    }
}
