package defpackage;

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

/* renamed from: vhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class vhh extends vyj implements niz {
    static final void a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 24);
        sb.append("Denied access to ");
        sb.append(str);
        sb.append(" method");
        throw new IllegalAccessError(sb.toString());
    }

    public void a(AcceptParams acceptParams) {
        a("accept");
    }

    public void a(CancelParams cancelParams) {
        a("cancel");
    }

    public void a(GetAccountParams getAccountParams) {
        a("getAccount");
    }

    public void a(GetContactsCountParams getContactsCountParams) {
        a("getContactsCount");
    }

    public void a(GetContactsParams getContactsParams) {
        a("getContacts");
    }

    public void a(GetDataUsageParams getDataUsageParams) {
        a("getDataUsage");
    }

    public void a(GetDeviceNameParams getDeviceNameParams) {
        a("getDeviceName");
    }

    public void a(GetVisibilityParams getVisibilityParams) {
        a("getVisibility");
    }

    public void a(IsEnabledParams isEnabledParams) {
        a("isEnabled");
    }

    public void a(IsOptedInParams isOptedInParams) {
        a("isOptedIn");
    }

    public void a(MarkContactAsSelectedParams markContactAsSelectedParams) {
        a("markContactAsSelected");
    }

    public void a(OpenParams openParams) {
        a("open");
    }

    public void a(OptInParams optInParams) {
        a("optIn");
    }

    public void a(RegisterReceiveSurfaceParams registerReceiveSurfaceParams) {
        a("registerReceiveSurface");
    }

    public void a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        a("registerSendSurface");
    }

    public void a(RegisterSharingProviderParams registerSharingProviderParams) {
        a("registerSharingProvider");
    }

    public void a(RejectParams rejectParams) {
        a("reject");
    }

    public void a(SendParams sendParams) {
        a("send");
    }

    public void a(SetAccountParams setAccountParams) {
        a("setAccount");
    }

    public void a(SetDataUsageParams setDataUsageParams) {
        a("setDataUsage");
    }

    public void a(SetDeviceNameParams setDeviceNameParams) {
        a("setDeviceName");
    }

    public void a(SetEnabledParams setEnabledParams) {
        a("setEnabled");
    }

    public void a(SetVisibilityParams setVisibilityParams) {
        a("setVisibility");
    }

    public void a(UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        a("unmarkContactAsSelected");
    }

    public void a(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams) {
        a("unregisterReceiveSurface");
    }

    public void a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        a("unregisterSendSurface");
    }

    public void a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        a("unregisterSharingProvider");
    }
}
