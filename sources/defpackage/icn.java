package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: icn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class icn implements icm {
    public abstract void a(Status status);

    public final void a(icl icl) {
        Status aO = icl.aO();
        if (aO.c()) {
            b(icl);
            return;
        }
        a(aO);
        if (icl instanceof ici) {
            try {
                ((ici) icl).c();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(icl);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("ResultCallbacks", sb.toString(), e);
            }
        }
    }

    public abstract void b(icl icl);
}
