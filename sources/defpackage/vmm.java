package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.ProviderAcceptParams;
import com.google.android.gms.nearby.sharing.internal.ProviderCancelParams;
import com.google.android.gms.nearby.sharing.internal.ProviderDenyParams;
import com.google.android.gms.nearby.sharing.internal.ProviderOpenParams;
import com.google.android.gms.nearby.sharing.internal.ProviderSendParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStartAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStartDiscoveryParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStopAdvertisingParams;
import com.google.android.gms.nearby.sharing.internal.ProviderStopDiscoveryParams;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: vmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vmm implements wbv {
    final /* synthetic */ String a;
    final /* synthetic */ vmt b;
    final /* synthetic */ vye c;

    public vmm(vmt vmt, String str, vye vye) {
        this.b = vmt;
        this.a = str;
        this.c = vye;
    }

    private final void e(ShareTarget shareTarget) {
        if (shareTarget.i) {
            NearbySharingChimeraService nearbySharingChimeraService = this.b.c;
            TransferMetadata a2 = new vtv(7).a();
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a(shareTarget, a2);
            return;
        }
        NearbySharingChimeraService nearbySharingChimeraService2 = this.b.c;
        TransferMetadata a3 = new vtv(7).a();
        Charset charset2 = NearbySharingChimeraService.a;
        nearbySharingChimeraService2.b(shareTarget, a3);
    }

    public final int a(Contact contact) {
        return 13;
    }

    public final void a(int i) {
    }

    public final void a(PrintWriter printWriter) {
    }

    public final int b(Contact contact) {
        return 13;
    }

    public final int c(ShareTarget shareTarget) {
        try {
            vye vye = this.c;
            ProviderOpenParams providerOpenParams = new vzs().a;
            providerOpenParams.a = shareTarget;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerOpenParams);
            vye.c(9, aQ);
            return 0;
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider open for %s", (Object) this.c);
            e(shareTarget);
            return 13;
        }
    }

    public final List c() {
        return wbu.a();
    }

    public final int d(ShareTarget shareTarget) {
        try {
            vye vye = this.c;
            ProviderCancelParams providerCancelParams = new vzo().a;
            providerCancelParams.a = shareTarget;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerCancelParams);
            vye.c(8, aQ);
            return 0;
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider cancel for %s", (Object) this.c);
            e(shareTarget);
            return 13;
        }
    }

    public final void d() {
    }

    public final void e() {
    }

    public final List f() {
        return wbu.b();
    }

    public final void g() {
    }

    public final void h() {
    }

    public final int a(ShareTarget shareTarget) {
        try {
            vye vye = this.c;
            ProviderAcceptParams providerAcceptParams = new vzm().a;
            providerAcceptParams.a = shareTarget;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerAcceptParams);
            vye.c(6, aQ);
            return 0;
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider accept for %s", (Object) this.c);
            e(shareTarget);
            return 13;
        }
    }

    public final int b(ShareTarget shareTarget) {
        try {
            vye vye = this.c;
            ProviderDenyParams providerDenyParams = new vzq().a;
            providerDenyParams.a = shareTarget;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerDenyParams);
            vye.c(7, aQ);
            return 0;
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider deny for %s", (Object) this.c);
            e(shareTarget);
            return 13;
        }
    }

    public final void a() {
        try {
            vye vye = this.c;
            ProviderStopDiscoveryParams providerStopDiscoveryParams = new wac().a;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerStopDiscoveryParams);
            vye.c(2, aQ);
            ((anih) vvj.a.d()).a("External sharing provider has stopped discovery");
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider stopDiscovery for %s", (Object) this.c);
        }
    }

    public final void b() {
        try {
            vye vye = this.c;
            ProviderStopAdvertisingParams providerStopAdvertisingParams = new waa().a;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerStopAdvertisingParams);
            vye.c(4, aQ);
            ((anih) vvj.a.d()).a("External sharing provider has stopped advertising");
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider stopAdvertising for %s", (Object) this.c);
        }
    }

    public final void a(String str, ShareTarget shareTarget, vtx vtx) {
        List list = shareTarget.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vmt vmt = this.b;
            NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
            String str2 = vmt.a;
            Uri uri = ((FileAttachment) list.get(i)).d;
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a(str2, uri);
        }
        try {
            vye vye = this.c;
            vzu vzu = new vzu();
            ProviderSendParams providerSendParams = vzu.a;
            providerSendParams.a = str;
            providerSendParams.b = shareTarget;
            vml vml = new vml(vtx);
            ProviderSendParams providerSendParams2 = vzu.a;
            providerSendParams2.c = vml;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerSendParams2);
            vye.c(5, aQ);
        } catch (RemoteException e) {
            NearbySharingChimeraService nearbySharingChimeraService2 = this.b.c;
            TransferMetadata a2 = new vtv(7).a();
            Charset charset2 = NearbySharingChimeraService.a;
            nearbySharingChimeraService2.b(shareTarget, a2);
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider send for %s", (Object) this.c);
        }
    }

    public final void a(String str, vtx vtx, wbq wbq) {
        try {
            vye vye = this.c;
            vzw vzw = new vzw();
            vzw.a.a = str;
            vmk vmk = new vmk(this, vtx);
            ProviderStartAdvertisingParams providerStartAdvertisingParams = vzw.a;
            providerStartAdvertisingParams.b = vmk;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerStartAdvertisingParams);
            vye.c(3, aQ);
            ((anih) vvj.a.d()).a("External sharing provider has started advertising");
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider stopAdvertising for %s", (Object) this.c);
        }
    }

    public final void a(vsh vsh, wbt wbt) {
        vmi vmi = new vmi(this, vsh);
        ProviderStartDiscoveryParams providerStartDiscoveryParams = new vzy().a;
        providerStartDiscoveryParams.a = vmi;
        try {
            vye vye = this.c;
            Parcel aQ = vye.aQ();
            bhx.a(aQ, (Parcelable) providerStartDiscoveryParams);
            vye.c(1, aQ);
            ((anih) vvj.a.d()).a("External sharing provider has started discovery");
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to call external provider startDiscovery for %s", (Object) this.c);
        }
    }
}
