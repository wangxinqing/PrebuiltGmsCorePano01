package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: uge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface uge extends IInterface {
    void a(OnDisconnectedParams onDisconnectedParams);

    void a(OnPayloadReceivedParams onPayloadReceivedParams);

    void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams);
}
