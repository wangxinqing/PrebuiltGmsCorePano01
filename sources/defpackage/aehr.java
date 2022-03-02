package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aehr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehr extends bhw implements IInterface {
    private final Context a;

    public aehr() {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairDeviceDetailService");
    }

    /* JADX INFO: finally extract failed */
    public final TrueWirelessHeadset a(String str) {
        boolean z;
        tzw tzw = new tzw(this.a);
        ((anih) tsp.a.d()).a("FastPair: Device detail service try to bind DiscoveryService");
        aosh f = aosh.f();
        if (tzw.b == null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Don't reuse the DiscoveryServiceBinder!");
        tzw.b = new tzv("nearby", f);
        Intent b = arza.b(tzw.a);
        b.setAction("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE");
        jca.a().a(tzw.a, b, tzw.b, 1);
        try {
            TrueWirelessHeadset a2 = ((arxw) f.get(15000, TimeUnit.MILLISECONDS)).a(str);
            tzw.a();
            return a2;
        } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) tsp.a.c();
            anih.a(e);
            anih.a("FastPair: Exception when try to getTrueWirelessHeadset");
            tzw.a();
            return null;
        } catch (Throwable th) {
            tzw.a();
            throw th;
        }
    }

    public aehr(Context context) {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairDeviceDetailService");
        this.a = context;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        TrueWirelessHeadset a2 = a(parcel.readString());
        parcel2.writeNoException();
        bhx.b(parcel2, a2);
        return true;
    }
}
