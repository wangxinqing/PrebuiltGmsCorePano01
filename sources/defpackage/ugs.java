package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
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

/* renamed from: ugs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugs extends bhv implements ugu {
    public ugs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    public final String a() {
        throw null;
    }

    public final void a(long j) {
        throw null;
    }

    public final void a(String str, long j) {
        throw null;
    }

    public final void a(ugr ugr, String str, long j) {
        throw null;
    }

    public final void a(ugr ugr, String str, long j, long j2) {
        throw null;
    }

    public final void a(ugr ugr, String str, String str2, byte[] bArr, long j) {
        throw null;
    }

    public final void a(ugr ugr, String str, byte[] bArr, long j) {
        throw null;
    }

    public final void a(String[] strArr, byte[] bArr, long j) {
        throw null;
    }

    public final void b(long j) {
        throw null;
    }

    public final void b(ugr ugr, String str, long j, long j2) {
        throw null;
    }

    public final void b(String[] strArr, byte[] bArr, long j) {
        throw null;
    }

    public final void c(long j) {
        throw null;
    }

    public final String d(long j) {
        throw null;
    }

    public final void g(long j) {
        throw null;
    }

    public final void a(AcceptConnectionRequestParams acceptConnectionRequestParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) acceptConnectionRequestParams);
        b(2006, aQ);
    }

    public final void a(CancelPayloadParams cancelPayloadParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) cancelPayloadParams);
        b(2012, aQ);
    }

    public final void a(ClientDisconnectingParams clientDisconnectingParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) clientDisconnectingParams);
        b(2011, aQ);
    }

    public final void a(DisconnectFromEndpointParams disconnectFromEndpointParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) disconnectFromEndpointParams);
        b(2009, aQ);
    }

    public final void a(InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) initiateBandwidthUpgradeParams);
        b(2013, aQ);
    }

    public final void a(RejectConnectionRequestParams rejectConnectionRequestParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) rejectConnectionRequestParams);
        b(2007, aQ);
    }

    public final void a(SendConnectionRequestParams sendConnectionRequestParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) sendConnectionRequestParams);
        b(2005, aQ);
    }

    public final void a(SendPayloadParams sendPayloadParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) sendPayloadParams);
        b(2008, aQ);
    }

    public final void a(StartAdvertisingParams startAdvertisingParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) startAdvertisingParams);
        b(2001, aQ);
    }

    public final void a(StartDiscoveryParams startDiscoveryParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) startDiscoveryParams);
        b(2003, aQ);
    }

    public final void a(StopAdvertisingParams stopAdvertisingParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) stopAdvertisingParams);
        b(2002, aQ);
    }

    public final void a(StopAllEndpointsParams stopAllEndpointsParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) stopAllEndpointsParams);
        b(2010, aQ);
    }

    public final void a(StopDiscoveryParams stopDiscoveryParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) stopDiscoveryParams);
        b(2004, aQ);
    }
}
