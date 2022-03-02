package defpackage;

import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ecb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ecb implements IBinder.DeathRecipient {
    public final edv a;
    public final HashSet b = new HashSet();
    public boolean c = true;
    final /* synthetic */ ecc d;

    public ecb(ecc ecc, edv edv) {
        this.d = ecc;
        iva.a((Object) edv);
        this.a = edv;
    }

    public final void a(IBinder iBinder) {
        if (!this.b.contains(iBinder)) {
            iBinder.linkToDeath(this, 0);
            this.b.add(iBinder);
            if (this.b.size() > 1) {
                jjg jjg = edx.a;
                this.d.a();
            }
        }
    }

    public final synchronized void binderDied() {
        if (this.c) {
            ecc ecc = this.d;
            ecc.a(this.a);
            Iterator it = ecc.a.iterator();
            while (it.hasNext()) {
                ((eca) it.next()).a(this.a);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("listener(asBinder)=");
        sb.append(this.a.d.asBinder());
        if (this.b.isEmpty()) {
            sb.append("no binders");
        } else {
            sb.append(",binder=");
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                sb.append((IBinder) it.next());
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
