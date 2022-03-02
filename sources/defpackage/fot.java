package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.DeleteRequest;
import com.google.android.gms.auth.api.credentials.internal.SaveRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: fot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fot extends fgh implements niz {
    public final String a;
    public final fgm b;
    private final Context c;
    private final nix d;
    private final String e;

    public fot(Context context, String str, esn esn, nix nix, fgm fgm) {
        String str2;
        this.c = context;
        this.a = str;
        iva.a((Object) esn);
        this.b = fgm;
        iva.a((Object) nix);
        this.d = nix;
        if (!TextUtils.isEmpty(esn.d)) {
            str2 = esn.d;
            iva.a((Object) str2);
        } else {
            str2 = qbw.a();
        }
        this.e = str2;
    }

    static Status a(qbf qbf) {
        int i = qbf.a;
        if (i == 7) {
            return new Status(7);
        }
        if (i == 11000) {
            return new Status(6, "Passphrase required.");
        }
        if (i == 28441) {
            return new Status(10, "Invalid credential data.");
        }
        if (i == 28442) {
            return new Status(10, "Invalid calling package.");
        }
        switch (i) {
            case 28421:
                return new Status(4, "Sign-in required.", (PendingIntent) qbf.b.b());
            case 28422:
            case 28423:
                return new Status(6, "Resolution required.", (PendingIntent) qbf.b.b());
            default:
                switch (i) {
                    case 28431:
                        return new Status(16, "Credentials API's save confirmation dialog has been disabled to avoid conflicts with the Android Autofill feature. This choice may be overridden via CredentialsOptions.");
                    case 28432:
                        return new Status(16, "Credentials API has been disabled.");
                    case 28433:
                        return new Status(16, "Cannot find a matching credential.");
                    case 28434:
                        return new Status(16, "No eligible accounts can be found.");
                    case 28435:
                        return new Status(16, "The save prompt is disabled for the current app. To restore, remove this app from the \"Never save\" list in the Smart Lock for Passwords settings for all accounts on this device.");
                    default:
                        return Status.c;
                }
        }
    }

    private final void a(aorr aorr, String str) {
        aorl.a(aorr, new fos(this, str, SystemClock.elapsedRealtime()), aoqm.a);
    }

    private final void a(fcu fcu, String str, fgc fgc) {
        fdb a2 = fdc.a(fcu, 68, str, this.e);
        this.d.a(a2);
        a((aorr) a2.a, str.concat("Operation"));
        aorl.a(a2.a, new Cfor(fgc), aoqm.a);
    }

    public final void a(fgc fgc) {
        a(new foz(this.a), "DisableAutoSignIn", fgc);
    }

    public final void a(fgc fgc, CredentialRequest credentialRequest) {
        fdb a2 = fdc.a(new fpl(this.c, this.a, credentialRequest, this.e), 68, "Request", this.e);
        this.d.a(a2);
        a((aorr) a2.a, "RequestOperation");
        aorl.a(a2.a, new foq(fgc), aoqm.a);
    }

    public final void a(fgc fgc, DeleteRequest deleteRequest) {
        a(new foy(this.c, this.a, deleteRequest.a), "Delete", fgc);
    }

    public final void a(fgc fgc, SaveRequest saveRequest) {
        a(new fqe(this.c, this.a, saveRequest.a, this.e), "Save", fgc);
    }
}
