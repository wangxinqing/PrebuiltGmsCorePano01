package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vck extends bhw implements vcl {
    public vck() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((PublishRequest) bhx.a(parcel, PublishRequest.CREATOR));
        } else if (i == 2) {
            a((UnpublishRequest) bhx.a(parcel, UnpublishRequest.CREATOR));
        } else if (i == 3) {
            a((SubscribeRequest) bhx.a(parcel, SubscribeRequest.CREATOR));
        } else if (i == 4) {
            a((UnsubscribeRequest) bhx.a(parcel, UnsubscribeRequest.CREATOR));
        } else if (i == 7) {
            a((GetPermissionStatusRequest) bhx.a(parcel, GetPermissionStatusRequest.CREATOR));
        } else if (i == 8) {
            a((RegisterStatusCallbackRequest) bhx.a(parcel, RegisterStatusCallbackRequest.CREATOR));
        } else if (i != 9) {
            return false;
        } else {
            a((HandleClientLifecycleEventRequest) bhx.a(parcel, HandleClientLifecycleEventRequest.CREATOR));
        }
        return true;
    }
}
