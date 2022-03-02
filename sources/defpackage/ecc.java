package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ecc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ecc {
    public final HashSet a = new HashSet();
    private final HashMap b = new HashMap();

    public final synchronized ecb a(edv edv, IBinder iBinder) {
        ecb ecb = (ecb) this.b.get(edv);
        if (ecb == null) {
            try {
                ecb ecb2 = new ecb(this, edv);
                ecb2.a(iBinder);
                this.b.put(edv, ecb2);
                return ecb2;
            } catch (RemoteException e) {
                return null;
            }
        } else {
            ecb.a(iBinder);
            return ecb;
        }
    }

    public final synchronized void a() {
        this.b.size();
    }

    public final synchronized void a(eca eca) {
        iva.a((Object) eca);
        this.a.add(eca);
    }

    public final synchronized void a(edv edv) {
        ecb ecb = (ecb) this.b.remove(edv);
        if (ecb != null) {
            ecb.c = false;
            Iterator it = ecb.b.iterator();
            while (it.hasNext()) {
                ((IBinder) it.next()).unlinkToDeath(ecb, 0);
            }
        }
    }
}
