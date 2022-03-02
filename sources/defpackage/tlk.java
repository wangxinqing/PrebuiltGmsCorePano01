package defpackage;

import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.PrintWriter;

/* renamed from: tlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface tlk {
    int a(tlh tlh, long j);

    int a(tlh tlh, String str);

    int a(tlh tlh, String str, DiscoveryOptions discoveryOptions, ugq ugq);

    int a(tlh tlh, String str, byte[] bArr, ugx ugx);

    int a(tlh tlh, byte[] bArr, String str, AdvertisingOptions advertisingOptions, ugh ugh);

    int a(tlh tlh, byte[] bArr, String str, byte[] bArr2, ConnectionOptions connectionOptions, ugh ugh);

    void a();

    void a(PrintWriter printWriter);

    void a(tlh tlh, int i);

    void a(tlh tlh, String[] strArr, ParcelablePayload parcelablePayload);

    void b();

    void b(tlh tlh, int i);

    void b(tlh tlh, String str);

    void c(tlh tlh, String str);
}
