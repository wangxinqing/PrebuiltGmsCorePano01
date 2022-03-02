package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: vat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class vat {
    private final Object a = new Object();
    private final nz b = new nz();

    public final void a() {
        synchronized (this.a) {
            this.b.clear();
        }
    }

    public void a(Object obj) {
    }

    public final Collection b() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.b.h);
            for (vas vas : this.b.values()) {
                arrayList.add(vas.a);
            }
        }
        return arrayList;
    }

    public final IInterface c(Object obj) {
        synchronized (this.a) {
            vas vas = (vas) this.b.get(obj);
            if (vas == null) {
                return null;
            }
            IInterface iInterface = vas.a;
            return iInterface;
        }
    }

    public final void a(Object obj, IInterface iInterface) {
        synchronized (this.a) {
            vas vas = new vas(this, obj, iInterface);
            try {
                iInterface.asBinder().linkToDeath(vas, 0);
                this.b.put(obj, vas);
            } catch (RemoteException e) {
            }
        }
    }

    public final void b(Object obj) {
        boolean z;
        synchronized (this.a) {
            vas vas = (vas) this.b.remove(obj);
            z = false;
            if (vas != null) {
                vas.a.asBinder().unlinkToDeath(vas, 0);
                z = true;
            }
        }
        if (z) {
            a(obj);
        }
    }
}
