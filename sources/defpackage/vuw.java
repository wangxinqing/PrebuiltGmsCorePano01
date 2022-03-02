package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: vuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class vuw {
    public final asmc a;

    public vuw(asmc asmc) {
        this.a = asmc;
    }

    public final String toString() {
        String str;
        int i = 1;
        Object[] objArr = new Object[1];
        int a2 = aspi.a(this.a.b);
        if (a2 != 0) {
            i = a2;
        }
        switch (i) {
            case 1:
                str = "UNKNOWN_EVENT_TYPE";
                break;
            case 2:
                str = "ACCEPT_AGREEMENTS";
                break;
            case 3:
                str = "ENABLE_NEARBY_SHARING";
                break;
            case 4:
                str = "SET_VISIBILITY";
                break;
            case 5:
                str = "DESCRIBE_ATTACHMENTS";
                break;
            case 6:
                str = "SCAN_FOR_SHARE_TARGETS_START";
                break;
            case 7:
                str = "SCAN_FOR_SHARE_TARGETS_END";
                break;
            case 8:
                str = "ADVERTISE_DEVICE_PRESENCE_START";
                break;
            case 9:
                str = "ADVERTISE_DEVICE_PRESENCE_END";
                break;
            case 10:
                str = "SEND_FAST_INITIALIZATION";
                break;
            case 11:
                str = "RECEIVE_FAST_INITIALIZATION";
                break;
            case 12:
                str = "DISCOVER_SHARE_TARGET";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                str = "SEND_INTRODUCTION";
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                str = "RECEIVE_INTRODUCTION";
                break;
            case Service.START_CONTINUATION_MASK:
                str = "RESPOND_TO_INTRODUCTION";
                break;
            case 16:
                str = "SEND_ATTACHMENTS_START";
                break;
            case 17:
                str = "SEND_ATTACHMENTS_END";
                break;
            case 18:
                str = "RECEIVE_ATTACHMENTS_START";
                break;
            case 19:
                str = "RECEIVE_ATTACHMENTS_END";
                break;
            case 20:
                str = "CANCEL_SENDING_ATTACHMENTS";
                break;
            case 21:
                str = "CANCEL_RECEIVING_ATTACHMENTS";
                break;
            case 22:
                str = "OPEN_RECEIVED_ATTACHMENTS";
                break;
            case 23:
                str = "LAUNCH_SETUP_ACTIVITY";
                break;
            case 24:
                str = "ADD_CONTACT";
                break;
            case 25:
                str = "REMOVE_CONTACT";
                break;
            case 26:
                str = "FAST_SHARE_SERVER_RESPONSE";
                break;
            case 27:
                str = "SEND_START";
                break;
            case 28:
                str = "ACCEPT_FAST_INITIALIZATION";
                break;
            default:
                str = "SET_DATA_USAGE";
                break;
        }
        objArr[0] = str;
        return String.format("NearbySharingLog:{%s}", objArr);
    }
}
