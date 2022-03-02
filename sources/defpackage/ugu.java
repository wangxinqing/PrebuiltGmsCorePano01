package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;

/* renamed from: ugu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ugu extends IInterface {
    String a();

    void a(long j);

    void a(AcceptConnectionRequestParams acceptConnectionRequestParams);

    void a(CancelPayloadParams cancelPayloadParams);

    void a(ClientDisconnectingParams clientDisconnectingParams);

    void a(DisconnectFromEndpointParams disconnectFromEndpointParams);

    void a(InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams);

    void a(RejectConnectionRequestParams rejectConnectionRequestParams);

    void a(SendConnectionRequestParams sendConnectionRequestParams);

    void a(SendPayloadParams sendPayloadParams);

    void a(StartAdvertisingParams startAdvertisingParams);

    void a(StartDiscoveryParams startDiscoveryParams);

    void a(StopAdvertisingParams stopAdvertisingParams);

    void a(StopAllEndpointsParams stopAllEndpointsParams);

    void a(StopDiscoveryParams stopDiscoveryParams);

    void a(String str, long j);

    void a(ugr ugr, String str, long j);

    void a(ugr ugr, String str, long j, long j2);

    void a(ugr ugr, String str, String str2, byte[] bArr, long j);

    void a(ugr ugr, String str, byte[] bArr, long j);

    void a(String[] strArr, byte[] bArr, long j);

    void b(long j);

    void b(ugr ugr, String str, long j, long j2);

    void b(String[] strArr, byte[] bArr, long j);

    void c(long j);

    String d(long j);

    void g(long j);
}
