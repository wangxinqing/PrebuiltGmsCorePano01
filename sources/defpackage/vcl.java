package defpackage;

import android.os.IInterface;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface vcl extends IInterface {
    void a(GetPermissionStatusRequest getPermissionStatusRequest);

    void a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest);

    void a(PublishRequest publishRequest);

    void a(RegisterStatusCallbackRequest registerStatusCallbackRequest);

    void a(SubscribeRequest subscribeRequest);

    void a(UnpublishRequest unpublishRequest);

    void a(UnsubscribeRequest unsubscribeRequest);
}
