package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ugq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ugq extends IInterface {
    void a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams);

    void a(OnEndpointFoundParams onEndpointFoundParams);

    void a(OnEndpointLostParams onEndpointLostParams);

    void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams);
}
