package com.google.android.gms.ads.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.clearcut.a;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.ads.internal.util.client.c;
import com.google.android.gms.ads.internal.util.client.d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b {
    boolean a;
    a b;

    public b() {
    }

    public final a a(byte[] bArr) {
        return new a(this, bArr);
    }

    public b(Context context, String str) {
        a aVar;
        n.a(context);
        try {
            IBinder a2 = mcx.a(context, mcx.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
            if (a2 != null) {
                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                aVar = !(queryLocalInterface instanceof a) ? new a(a2) : (a) queryLocalInterface;
            } else {
                aVar = null;
            }
            try {
                this.b = aVar;
                mbz.a((Object) context);
                a aVar2 = this.b;
                mby a3 = mbz.a((Object) context);
                Parcel aQ = aVar2.aQ();
                bhx.a(aQ, (IInterface) a3);
                aQ.writeString(str);
                aQ.writeString((String) null);
                aVar2.b(8, aQ);
                this.a = true;
            } catch (RemoteException | d | NullPointerException e) {
                c.a("Cannot dynamite load clearcut");
            }
        } catch (Exception e2) {
            throw new d(e2);
        } catch (Exception e3) {
            throw new d(e3);
        }
    }
}
