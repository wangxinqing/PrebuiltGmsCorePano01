package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: ugh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ugh extends IInterface {
    void a(OnBandwidthChangedParams onBandwidthChangedParams);

    void a(OnConnectionInitiatedParams onConnectionInitiatedParams);

    void a(OnConnectionResultParams onConnectionResultParams);

    void a(OnDisconnectedParams onDisconnectedParams);
}
