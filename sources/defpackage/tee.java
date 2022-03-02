package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: tee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface tee extends IInterface {
    void a(ConnectRequest connectRequest);

    void a(ContinueConnectRequest continueConnectRequest);

    void a(DisableTargetRequest disableTargetRequest);

    void a(DisconnectRequest disconnectRequest);

    void a(EnableTargetRequest enableTargetRequest);

    void a(SendDataRequest sendDataRequest);

    void a(StartScanRequest startScanRequest);

    void a(StopScanRequest stopScanRequest);

    void a(teb teb);

    String b();
}
