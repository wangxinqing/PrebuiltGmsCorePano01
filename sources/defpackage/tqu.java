package defpackage;

import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* renamed from: tqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
interface tqu {
    int a(tlh tlh, String str);

    int a(tlh tlh, String str, DiscoveryOptions discoveryOptions, ugq ugq);

    int a(tlh tlh, String str, byte[] bArr, AdvertisingOptions advertisingOptions, ugh ugh);

    int a(tlh tlh, String str, byte[] bArr, ugx ugx);

    int a(tlh tlh, byte[] bArr, String str, byte[] bArr2, ConnectionOptions connectionOptions, ugh ugh);

    void a();

    Strategy g();

    void h(tlh tlh);

    void i(tlh tlh);
}
