package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: btc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btc {
    public final boolean[] a = new boolean[5];
    public HashMap b;
    private final btn c;

    public btc(atjv atjv) {
        btn btn;
        a();
        cbi.af();
        int i = atjv.bA;
        if (bta.a(i)) {
            btn = new btp();
        } else if (bta.b(i)) {
            btn = new btj();
        } else if (bta.c(i)) {
            btn = new bto();
        } else if (jhx.a(bta.f, i)) {
            btn = new btm();
        } else if (jhx.a(bta.g, i)) {
            btn = new btk();
        } else {
            btn = bta.e(i) ? new btl() : null;
        }
        this.c = btn;
    }

    public final int a(int i, ContextManagerClientInfo contextManagerClientInfo) {
        btn btn = this.c;
        if (btn == null) {
            return 1;
        }
        if (i == 0) {
            return btn.c(contextManagerClientInfo);
        }
        if (i == 1) {
            return btn.d(contextManagerClientInfo);
        }
        if (i == 2) {
            return btn.b(contextManagerClientInfo);
        }
        if (i == 3) {
            return btn.a(contextManagerClientInfo);
        }
        if (i == 4) {
            return btn.e(contextManagerClientInfo);
        }
        ((anih) ((anih) bxk.a.b()).a("btn", "a", 154, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextSpecificAclFactory] Unknown permission: %s, clientInfo=%s", i, (Object) contextManagerClientInfo);
        return -1;
    }

    public final void a() {
        this.b = new HashMap();
        Arrays.fill(this.a, 0, 5, false);
    }
}
