package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: bti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bti {
    public final jhr a;

    public bti(Context context) {
        this.a = jhr.a(context);
    }

    public final int a(int i, ContextManagerClientInfo contextManagerClientInfo) {
        int i2 = 0;
        for (String c : bta.a(i, true)) {
            i2 = this.a.c(c, contextManagerClientInfo.c, contextManagerClientInfo.b);
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }
}
