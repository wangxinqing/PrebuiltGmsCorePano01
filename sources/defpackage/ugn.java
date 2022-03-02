package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ugn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ugn extends IInterface {
    void a(OnEndpointFoundParams onEndpointFoundParams);

    void a(OnEndpointLostParams onEndpointLostParams);

    void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams);
}
