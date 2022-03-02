package com.google.android.gms.ads.settings.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends qvy {
    private final Context a;
    private final a b;

    public c(Context context, a aVar) {
        super("ads");
        this.a = context;
        this.b = aVar;
    }

    public final void a(ComponentName componentName) {
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        akdh akdh;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.nfcprovision.ISchoolOwnedService");
            akdh = queryLocalInterface instanceof akdh ? (akdh) queryLocalInterface : new akdh(iBinder);
        } else {
            akdh = null;
        }
        boolean z = false;
        try {
            Parcel a2 = akdh.a(1, akdh.aQ());
            z = bhx.a(a2);
            a2.recycle();
        } catch (RemoteException e) {
            Log.w("EduDeviceHelper", "Error calling school-ownership service; assume it's not school-owned.");
            Log.w("EduDeviceHelper", e);
        } finally {
            jca.a().a(this.a, (ServiceConnection) this);
            this.b.a(z);
        }
    }
}
