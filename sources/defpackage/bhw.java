package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bhw extends Binder implements IInterface {
    private static nka CU = null;

    protected bhw(String str) {
        attachInterface(this, str);
    }

    public static synchronized void a(nka nka) {
        synchronized (bhw.class) {
            if (CU == null) {
                CU = nka;
            } else {
                throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
            }
        }
    }

    public boolean a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (CU == null) {
            return a(i, parcel, parcel2);
        }
        if ((this instanceof niz) || (this instanceof jbh) || amlv.b(amlw.a)) {
            return a(i, parcel, parcel2);
        }
        amky a = new njk(this).a(i, (amsv) null);
        try {
            boolean a2 = a(i, parcel, parcel2);
            if (a == null) {
                return a2;
            }
            a.close();
            return a2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
