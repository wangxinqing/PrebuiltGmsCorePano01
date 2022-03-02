package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: aeax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aeax extends bhw implements aeay {
    public aeax() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((DataHolder) bhx.a(parcel, DataHolder.CREATOR));
                return true;
            case 2:
                a((MessageEventParcelable) bhx.a(parcel, MessageEventParcelable.CREATOR));
                return true;
            case 3:
                NodeParcelable nodeParcelable = (NodeParcelable) bhx.a(parcel, NodeParcelable.CREATOR);
                d();
                return true;
            case 4:
                NodeParcelable nodeParcelable2 = (NodeParcelable) bhx.a(parcel, NodeParcelable.CREATOR);
                e();
                return true;
            case 5:
                parcel.createTypedArrayList(NodeParcelable.CREATOR);
                a();
                return true;
            case 6:
                AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) bhx.a(parcel, AncsNotificationParcelable.CREATOR);
                c();
                return true;
            case 7:
                a((ChannelEventParcelable) bhx.a(parcel, ChannelEventParcelable.CREATOR));
                return true;
            case 8:
                a((CapabilityInfoParcelable) bhx.a(parcel, CapabilityInfoParcelable.CREATOR));
                return true;
            case 9:
                AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) bhx.a(parcel, AmsEntityUpdateParcelable.CREATOR);
                b();
                return true;
            default:
                return false;
        }
    }
}
