package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* renamed from: iwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwb extends bhw implements IInterface {
    private final Context a;
    private final String b;

    public iwb() {
        super("com.google.android.gms.common.internal.service.ICommonService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        iwa iwa;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            iwa = queryLocalInterface instanceof iwa ? (iwa) queryLocalInterface : new iwa(readStrongBinder);
        } else {
            iwa = null;
        }
        Log.i("CommonService", "clearDefaultAccount");
        jgu.c(this.a, this.b);
        Parcel aQ = iwa.aQ();
        aQ.writeInt(0);
        iwa.b(1, aQ);
        return true;
    }

    public iwb(Context context, String str) {
        super("com.google.android.gms.common.internal.service.ICommonService");
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) str);
        this.b = str;
    }
}
