package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
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

/* renamed from: vyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyi extends bhv implements vyk {
    public vyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.INearbySharingService");
    }

    public final void a(AcceptParams acceptParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) acceptParams);
        c(12, aQ);
    }

    public final void a(RegisterSharingProviderParams registerSharingProviderParams) {
        throw null;
    }

    public final void a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        throw null;
    }

    public final void a(CancelParams cancelParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) cancelParams);
        c(14, aQ);
    }

    public final void a(GetAccountParams getAccountParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getAccountParams);
        c(22, aQ);
    }

    public final void a(GetContactsCountParams getContactsCountParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getContactsCountParams);
        c(30, aQ);
    }

    public final void a(GetContactsParams getContactsParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getContactsParams);
        c(27, aQ);
    }

    public final void a(GetDataUsageParams getDataUsageParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getDataUsageParams);
        c(24, aQ);
    }

    public final void a(GetDeviceNameParams getDeviceNameParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getDeviceNameParams);
        c(4, aQ);
    }

    public final void a(GetVisibilityParams getVisibilityParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getVisibilityParams);
        c(26, aQ);
    }

    public final void a(IsEnabledParams isEnabledParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) isEnabledParams);
        c(2, aQ);
    }

    public final void a(IsOptedInParams isOptedInParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) isOptedInParams);
        c(17, aQ);
    }

    public final void a(MarkContactAsSelectedParams markContactAsSelectedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) markContactAsSelectedParams);
        c(28, aQ);
    }

    public final void a(OpenParams openParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) openParams);
        c(15, aQ);
    }

    public final void a(OptInParams optInParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) optInParams);
        c(16, aQ);
    }

    public final void a(RegisterReceiveSurfaceParams registerReceiveSurfaceParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) registerReceiveSurfaceParams);
        c(7, aQ);
    }

    public final void a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) registerSendSurfaceParams);
        c(9, aQ);
    }

    public final void a(RejectParams rejectParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) rejectParams);
        c(13, aQ);
    }

    public final void a(SendParams sendParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) sendParams);
        c(11, aQ);
    }

    public final void a(SetAccountParams setAccountParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setAccountParams);
        c(21, aQ);
    }

    public final void a(SetDataUsageParams setDataUsageParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setDataUsageParams);
        c(23, aQ);
    }

    public final void a(SetDeviceNameParams setDeviceNameParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setDeviceNameParams);
        c(3, aQ);
    }

    public final void a(SetEnabledParams setEnabledParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setEnabledParams);
        c(1, aQ);
    }

    public final void a(SetVisibilityParams setVisibilityParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setVisibilityParams);
        c(25, aQ);
    }

    public final void a(UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) unmarkContactAsSelectedParams);
        c(29, aQ);
    }

    public final void a(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) unregisterReceiveSurfaceParams);
        c(8, aQ);
    }

    public final void a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) unregisterSendSurfaceParams);
        c(10, aQ);
    }
}
