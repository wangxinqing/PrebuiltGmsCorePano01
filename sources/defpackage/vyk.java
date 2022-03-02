package defpackage;

import android.os.IInterface;
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

/* renamed from: vyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface vyk extends IInterface {
    void a(AcceptParams acceptParams);

    void a(CancelParams cancelParams);

    void a(GetAccountParams getAccountParams);

    void a(GetContactsCountParams getContactsCountParams);

    void a(GetContactsParams getContactsParams);

    void a(GetDataUsageParams getDataUsageParams);

    void a(GetDeviceNameParams getDeviceNameParams);

    void a(GetVisibilityParams getVisibilityParams);

    void a(IsEnabledParams isEnabledParams);

    void a(IsOptedInParams isOptedInParams);

    void a(MarkContactAsSelectedParams markContactAsSelectedParams);

    void a(OpenParams openParams);

    void a(OptInParams optInParams);

    void a(RegisterReceiveSurfaceParams registerReceiveSurfaceParams);

    void a(RegisterSendSurfaceParams registerSendSurfaceParams);

    void a(RegisterSharingProviderParams registerSharingProviderParams);

    void a(RejectParams rejectParams);

    void a(SendParams sendParams);

    void a(SetAccountParams setAccountParams);

    void a(SetDataUsageParams setDataUsageParams);

    void a(SetDeviceNameParams setDeviceNameParams);

    void a(SetEnabledParams setEnabledParams);

    void a(SetVisibilityParams setVisibilityParams);

    void a(UnmarkContactAsSelectedParams unmarkContactAsSelectedParams);

    void a(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams);

    void a(UnregisterSendSurfaceParams unregisterSendSurfaceParams);

    void a(UnregisterSharingProviderParams unregisterSharingProviderParams);
}
