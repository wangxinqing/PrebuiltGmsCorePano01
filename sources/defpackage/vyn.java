package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: vyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface vyn extends IInterface {
    void a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams);

    void a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams);

    void a(OnShareTargetLostParams onShareTargetLostParams);
}
