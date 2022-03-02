package defpackage;

import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import com.google.android.gms.nearby.sharing.internal.OptInParams;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;
import org.chromium.net.UrlRequest;

/* renamed from: vyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vyj extends bhw implements vyk {
    public vyj() {
        super("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((SetEnabledParams) bhx.a(parcel, SetEnabledParams.CREATOR));
                return true;
            case 2:
                a((IsEnabledParams) bhx.a(parcel, IsEnabledParams.CREATOR));
                return true;
            case 3:
                a((SetDeviceNameParams) bhx.a(parcel, SetDeviceNameParams.CREATOR));
                return true;
            case 4:
                a((GetDeviceNameParams) bhx.a(parcel, GetDeviceNameParams.CREATOR));
                return true;
            case 7:
                a((RegisterReceiveSurfaceParams) bhx.a(parcel, RegisterReceiveSurfaceParams.CREATOR));
                return true;
            case 8:
                a((UnregisterReceiveSurfaceParams) bhx.a(parcel, UnregisterReceiveSurfaceParams.CREATOR));
                return true;
            case 9:
                a((RegisterSendSurfaceParams) bhx.a(parcel, RegisterSendSurfaceParams.CREATOR));
                return true;
            case 10:
                a((UnregisterSendSurfaceParams) bhx.a(parcel, UnregisterSendSurfaceParams.CREATOR));
                return true;
            case 11:
                a((SendParams) bhx.a(parcel, SendParams.CREATOR));
                return true;
            case 12:
                a((AcceptParams) bhx.a(parcel, AcceptParams.CREATOR));
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                a((RejectParams) bhx.a(parcel, RejectParams.CREATOR));
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                a((CancelParams) bhx.a(parcel, CancelParams.CREATOR));
                return true;
            case Service.START_CONTINUATION_MASK:
                a((OpenParams) bhx.a(parcel, OpenParams.CREATOR));
                return true;
            case 16:
                a((OptInParams) bhx.a(parcel, OptInParams.CREATOR));
                return true;
            case 17:
                a((IsOptedInParams) bhx.a(parcel, IsOptedInParams.CREATOR));
                return true;
            case 21:
                a((SetAccountParams) bhx.a(parcel, SetAccountParams.CREATOR));
                return true;
            case 22:
                a((GetAccountParams) bhx.a(parcel, GetAccountParams.CREATOR));
                return true;
            case 23:
                a((SetDataUsageParams) bhx.a(parcel, SetDataUsageParams.CREATOR));
                return true;
            case 24:
                a((GetDataUsageParams) bhx.a(parcel, GetDataUsageParams.CREATOR));
                return true;
            case 25:
                a((SetVisibilityParams) bhx.a(parcel, SetVisibilityParams.CREATOR));
                return true;
            case 26:
                a((GetVisibilityParams) bhx.a(parcel, GetVisibilityParams.CREATOR));
                return true;
            case 27:
                a((GetContactsParams) bhx.a(parcel, GetContactsParams.CREATOR));
                return true;
            case 28:
                a((MarkContactAsSelectedParams) bhx.a(parcel, MarkContactAsSelectedParams.CREATOR));
                return true;
            case 29:
                a((UnmarkContactAsSelectedParams) bhx.a(parcel, UnmarkContactAsSelectedParams.CREATOR));
                return true;
            case 30:
                a((GetContactsCountParams) bhx.a(parcel, GetContactsCountParams.CREATOR));
                return true;
            case 31:
                a((RegisterSharingProviderParams) bhx.a(parcel, RegisterSharingProviderParams.CREATOR));
                return true;
            case 32:
                a((UnregisterSharingProviderParams) bhx.a(parcel, UnregisterSharingProviderParams.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
