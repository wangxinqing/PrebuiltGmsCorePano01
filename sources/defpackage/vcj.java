package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vcj extends bhv implements vcl {
    public vcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final void a(GetPermissionStatusRequest getPermissionStatusRequest) {
        throw null;
    }

    public final void a(PublishRequest publishRequest) {
        throw null;
    }

    public final void a(RegisterStatusCallbackRequest registerStatusCallbackRequest) {
        throw null;
    }

    public final void a(UnpublishRequest unpublishRequest) {
        throw null;
    }

    public final void a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) handleClientLifecycleEventRequest);
        c(9, aQ);
    }

    public final void a(SubscribeRequest subscribeRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) subscribeRequest);
        c(3, aQ);
    }

    public final void a(UnsubscribeRequest unsubscribeRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) unsubscribeRequest);
        c(4, aQ);
    }
}
