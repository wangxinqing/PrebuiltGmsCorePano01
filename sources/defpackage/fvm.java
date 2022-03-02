package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthChimeraService;
import com.google.android.gms.common.internal.ClientContext;
import java.lang.ref.WeakReference;

/* renamed from: fvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvm extends jba {
    private final jbb a;
    private final int d;
    private final Bundle e;
    private final ClientContext f;

    public fvm(jbb jbb, int i, Bundle bundle, ClientContext clientContext) {
        super(16, "ValidateAuthServiceOperation");
        this.a = jbb;
        this.d = i;
        this.e = bundle;
        this.f = clientContext;
    }

    private final void a(int i, fvb fvb) {
        if (i != 0) {
            this.a.a(i, new Bundle());
        } else {
            this.a.a(fvb);
        }
    }

    public final void a(Context context) {
        fvb fvb;
        if (this.e.getString("consumerPkg") == null || hya.a(context).a(this.d)) {
            WeakReference weakReference = (WeakReference) AuthChimeraService.a.get(this.f);
            if (weakReference != null) {
                fvb = (fvb) weakReference.get();
            } else {
                fvb = null;
            }
            if (fvb == null) {
                ClientContext clientContext = this.f;
                if (context instanceof AuthChimeraService) {
                    fvb fvb2 = new fvb((AuthChimeraService) context, jbf.a(), clientContext);
                    AuthChimeraService.a(clientContext, fvb2);
                    fvb = fvb2;
                } else {
                    fvb = null;
                }
            }
            if (fvb == null) {
                a(8, (fvb) null);
            } else {
                a(0, fvb);
            }
        } else {
            a(10, (fvb) null);
        }
    }
}
