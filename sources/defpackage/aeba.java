package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeba {
    private final Map a = new HashMap();

    public final void a(IBinder iBinder) {
        aeaz aeaz;
        aebu aebu;
        synchronized (this.a) {
            if (iBinder != null) {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    aeaz = !(queryLocalInterface instanceof aeaz) ? new aeaz(iBinder) : (aeaz) queryLocalInterface;
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(r3.getKey());
                    String valueOf2 = String.valueOf(aebu);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(valueOf);
                    sb.append("/");
                    sb.append(valueOf2);
                    Log.w("WearableClient", sb.toString());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                aeaz = null;
            }
            aebq aebq = new aebq();
            for (Map.Entry entry : this.a.entrySet()) {
                aebu = (aebu) entry.getValue();
                AddListenerRequest addListenerRequest = new AddListenerRequest(aebu);
                Parcel aQ = aeaz.aQ();
                bhx.a(aQ, (IInterface) aebq);
                bhx.a(aQ, (Parcelable) addListenerRequest);
                aeaz.b(16, aQ);
            }
        }
    }
}
