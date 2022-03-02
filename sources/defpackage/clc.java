package defpackage;

import android.os.IInterface;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: clc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clc {
    public final HashMap a = new HashMap();
    private final Looper b;
    private final clb c;

    public clc(Looper looper, clb clb) {
        this.b = looper;
        this.c = clb;
    }

    public final IInterface a(Object obj) {
        IInterface iInterface = (IInterface) this.a.get(obj);
        if (iInterface != null) {
            return iInterface;
        }
        IInterface a2 = this.c.a(obj, this.b);
        this.a.put(obj, a2);
        return a2;
    }
}
