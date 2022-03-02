package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import org.chromium.net.UrlRequest;

/* renamed from: aeav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aeav extends bhw implements IInterface {
    public aeav() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    public void a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    public void a(SendMessageResponse sendMessageResponse) {
        throw new UnsupportedOperationException();
    }

    public void a(StorageInfoResponse storageInfoResponse) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                GetConfigResponse getConfigResponse = (GetConfigResponse) bhx.a(parcel, GetConfigResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                PutDataResponse putDataResponse = (PutDataResponse) bhx.a(parcel, PutDataResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 4:
                GetDataItemResponse getDataItemResponse = (GetDataItemResponse) bhx.a(parcel, GetDataItemResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                DataHolder dataHolder = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 6:
                DeleteDataItemsResponse deleteDataItemsResponse = (DeleteDataItemsResponse) bhx.a(parcel, DeleteDataItemsResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                a((SendMessageResponse) bhx.a(parcel, SendMessageResponse.CREATOR));
                break;
            case 8:
                GetFdForAssetResponse getFdForAssetResponse = (GetFdForAssetResponse) bhx.a(parcel, GetFdForAssetResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                GetLocalNodeResponse getLocalNodeResponse = (GetLocalNodeResponse) bhx.a(parcel, GetLocalNodeResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 10:
                GetConnectedNodesResponse getConnectedNodesResponse = (GetConnectedNodesResponse) bhx.a(parcel, GetConnectedNodesResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 11:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                a();
                break;
            case 12:
                a((StorageInfoResponse) bhx.a(parcel, StorageInfoResponse.CREATOR));
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                GetConfigsResponse getConfigsResponse = (GetConfigsResponse) bhx.a(parcel, GetConfigsResponse.CREATOR);
                throw new UnsupportedOperationException();
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                OpenChannelResponse openChannelResponse = (OpenChannelResponse) bhx.a(parcel, OpenChannelResponse.CREATOR);
                throw new UnsupportedOperationException();
            case Service.START_CONTINUATION_MASK:
                CloseChannelResponse closeChannelResponse = (CloseChannelResponse) bhx.a(parcel, CloseChannelResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 16:
                CloseChannelResponse closeChannelResponse2 = (CloseChannelResponse) bhx.a(parcel, CloseChannelResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 17:
                GetChannelInputStreamResponse getChannelInputStreamResponse = (GetChannelInputStreamResponse) bhx.a(parcel, GetChannelInputStreamResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 18:
                GetChannelOutputStreamResponse getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) bhx.a(parcel, GetChannelOutputStreamResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 19:
                ChannelReceiveFileResponse channelReceiveFileResponse = (ChannelReceiveFileResponse) bhx.a(parcel, ChannelReceiveFileResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 20:
                ChannelSendFileResponse channelSendFileResponse = (ChannelSendFileResponse) bhx.a(parcel, ChannelSendFileResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 22:
                GetCapabilityResponse getCapabilityResponse = (GetCapabilityResponse) bhx.a(parcel, GetCapabilityResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 23:
                GetAllCapabilitiesResponse getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) bhx.a(parcel, GetAllCapabilitiesResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 26:
                a((AddLocalCapabilityResponse) bhx.a(parcel, AddLocalCapabilityResponse.CREATOR));
                break;
            case 27:
                a((RemoveLocalCapabilityResponse) bhx.a(parcel, RemoveLocalCapabilityResponse.CREATOR));
                break;
            case 28:
                GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) bhx.a(parcel, GetCloudSyncOptInOutDoneResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 29:
                GetCloudSyncSettingResponse getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) bhx.a(parcel, GetCloudSyncSettingResponse.CREATOR);
                throw new UnsupportedOperationException();
            case 30:
                GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) bhx.a(parcel, GetCloudSyncOptInStatusResponse.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
