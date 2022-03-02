package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: zok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zok extends nis {
    private final zod a;

    public zok(zod zod) {
        super(38, "GetToken");
        iva.a((Object) zod);
        this.a = zod;
    }

    public static PseudonymousIdToken b(Context context) {
        PseudonymousIdToken pseudonymousIdToken;
        synchronized ("PseudonymousIdService") {
            if (zom.b != null) {
                pseudonymousIdToken = zom.b;
            } else {
                try {
                    PseudonymousIdToken pseudonymousIdToken2 = new PseudonymousIdToken(context.getSharedPreferences("PseudonymousIdIntentService", 0).getString("pseudonymousId", (String) null));
                    zom.b = pseudonymousIdToken2;
                    pseudonymousIdToken = pseudonymousIdToken2;
                } catch (IllegalStateException e) {
                    e = e;
                    if (aekv.a() && !((UserManager) context.getSystemService(UserManager.class)).isUserRunning(Process.myUserHandle())) {
                        e = new zoi("User Stopping", e);
                    }
                    throw e;
                }
            }
        }
        return pseudonymousIdToken;
    }

    public final void a(Context context) {
        this.a.a(Status.a, b(context));
    }

    public final void a(Status status) {
        this.a.a(status, (PseudonymousIdToken) null);
    }
}
