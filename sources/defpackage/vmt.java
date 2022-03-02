package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
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
import java.nio.charset.Charset;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: vmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vmt extends vhh {
    public final String a;
    public final ift b = new vmf();
    final /* synthetic */ NearbySharingChimeraService c;
    private final Map d = new nz();
    private final Map e = new nz();
    private final Map f = new nz();

    public vmt(NearbySharingChimeraService nearbySharingChimeraService, String str) {
        this.c = nearbySharingChimeraService;
        this.a = str;
    }

    public final void a(AcceptParams acceptParams) {
        iva.a((Object) acceptParams.a);
        iva.a((Object) acceptParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vko vko = new vko(this, acceptParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vko);
    }

    public final void a(CancelParams cancelParams) {
        iva.a((Object) cancelParams.a);
        iva.a((Object) cancelParams.b);
        vkq vkq = new vkq(this, cancelParams);
        Charset charset = NearbySharingChimeraService.a;
        new jfx(9, vkq).start();
    }

    public final void a(GetAccountParams getAccountParams) {
        iva.a((Object) getAccountParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vky vky = new vky(this, getAccountParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vky);
    }

    public final void a(GetContactsCountParams getContactsCountParams) {
        iva.a((Object) getContactsCountParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vku vku = new vku(this, getContactsCountParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vku);
    }

    public final void a(GetContactsParams getContactsParams) {
        boolean z;
        iva.a((Object) getContactsParams.a);
        boolean z2 = true;
        if (getContactsParams.b >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (getContactsParams.c < 0) {
            z2 = false;
        }
        iva.b(z2);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkt vkt = new vkt(this, getContactsParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkt);
    }

    public final void a(GetDataUsageParams getDataUsageParams) {
        iva.a((Object) getDataUsageParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vla vla = new vla(this, getDataUsageParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vla);
    }

    public final void a(GetDeviceNameParams getDeviceNameParams) {
        iva.a((Object) getDeviceNameParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vma vma = new vma(this, getDeviceNameParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vma);
    }

    public final void a(GetVisibilityParams getVisibilityParams) {
        iva.a((Object) getVisibilityParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vlc vlc = new vlc(this, getVisibilityParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vlc);
    }

    public final void a(IsEnabledParams isEnabledParams) {
        iva.a((Object) isEnabledParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vlo vlo = new vlo(this, isEnabledParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vlo);
    }

    public final void a(IsOptedInParams isOptedInParams) {
        iva.a((Object) isOptedInParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vks vks = new vks(this, isOptedInParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vks);
    }

    public final void a(MarkContactAsSelectedParams markContactAsSelectedParams) {
        iva.a((Object) markContactAsSelectedParams.a);
        iva.a((Object) markContactAsSelectedParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkv vkv = new vkv(this, markContactAsSelectedParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkv);
    }

    public final void a(OpenParams openParams) {
        iva.a((Object) openParams.a);
        iva.a((Object) openParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkr vkr = new vkr(this, openParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkr);
    }

    public final void a(OptInParams optInParams) {
        iva.a((Object) optInParams.a);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkh vkh = new vkh(this, optInParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkh);
    }

    public final void a(RegisterReceiveSurfaceParams registerReceiveSurfaceParams) {
        vyt vyt = registerReceiveSurfaceParams.a;
        int i = registerReceiveSurfaceParams.b;
        iva.a((Object) vyt);
        iva.a((Object) registerReceiveSurfaceParams.c);
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        iva.b(z);
        if (!this.d.containsKey(vyt.asBinder())) {
            vmp vmp = new vmp(vyt);
            vkk vkk = new vkk(this, vyt);
            this.d.put(vyt.asBinder(), new vmr(vmp, vkk));
            try {
                vyt.asBinder().linkToDeath(vkk, 0);
            } catch (RemoteException e2) {
                vkk.binderDied();
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.c;
            vkl vkl = new vkl(this, registerReceiveSurfaceParams, vmp, i);
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a((Runnable) vkl);
            return;
        }
        throw new IllegalArgumentException("registerReceiveSurface failed. Already registered.");
    }

    public final void a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        vyt vyt = registerSendSurfaceParams.a;
        vyn vyn = registerSendSurfaceParams.b;
        int i = registerSendSurfaceParams.c;
        iva.a((Object) vyt);
        iva.a((Object) vyn);
        iva.a((Object) registerSendSurfaceParams.d);
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4)) {
            z = false;
        }
        iva.b(z);
        if (!this.e.containsKey(vyt.asBinder())) {
            vmn vmn = new vmn(vyt);
            vmo vmo = new vmo(vyn);
            vme vme = new vme(this, vyt);
            this.e.put(vyt.asBinder(), new vms(vmn, vme));
            try {
                vyt.asBinder().linkToDeath(vme, 0);
            } catch (RemoteException e2) {
                vme.binderDied();
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.c;
            vki vki = new vki(this, i, registerSendSurfaceParams, vmn, vmo);
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a((Runnable) vki);
            return;
        }
        throw new IllegalArgumentException("registerSendSurface failed. Already registered.");
    }

    public final void a(RegisterSharingProviderParams registerSharingProviderParams) {
        vye vye = registerSharingProviderParams.b;
        iva.a((Object) vye);
        if (!this.f.containsKey(vye.a)) {
            String num = Integer.toString(Objects.hashCode(vye));
            vmm vmm = new vmm(this, num, vye);
            vmb vmb = new vmb(this, vye);
            this.f.put(vye.a, new vmq(vmm, vmb));
            try {
                vye.a.linkToDeath(vmb, 0);
            } catch (RemoteException e2) {
                vmb.binderDied();
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.c;
            vmc vmc = new vmc(this, registerSharingProviderParams, vmm, num);
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a((Runnable) vmc);
            return;
        }
        throw new IllegalArgumentException("registerSharingProvider failed. Already registered.");
    }

    public final void a(RejectParams rejectParams) {
        iva.a((Object) rejectParams.a);
        iva.a((Object) rejectParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkp vkp = new vkp(this, rejectParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkp);
    }

    public final void a(SendParams sendParams) {
        iva.a((Object) sendParams.a);
        iva.a((Object) sendParams.b);
        iva.a((Object) sendParams.c);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkn vkn = new vkn(this, sendParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkn);
    }

    public final void a(SetAccountParams setAccountParams) {
        iva.a((Object) setAccountParams.b);
        iva.a((Object) setAccountParams.a);
        iva.b("com.google".equals(setAccountParams.a.type));
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkx vkx = new vkx(this, setAccountParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkx);
    }

    public final void a(SetDataUsageParams setDataUsageParams) {
        iva.a((Object) setDataUsageParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkz vkz = new vkz(this, setDataUsageParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkz);
    }

    public final void a(SetDeviceNameParams setDeviceNameParams) {
        iva.a((Object) setDeviceNameParams.a);
        iva.a((Object) setDeviceNameParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vlz vlz = new vlz(this, setDeviceNameParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vlz);
    }

    public final void a(SetEnabledParams setEnabledParams) {
        iva.a((Object) setEnabledParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vld vld = new vld(this, setEnabledParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vld);
    }

    public final void a(SetVisibilityParams setVisibilityParams) {
        iva.a((Object) setVisibilityParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vlb vlb = new vlb(this, setVisibilityParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vlb);
    }

    public final void a(UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        iva.a((Object) unmarkContactAsSelectedParams.a);
        iva.a((Object) unmarkContactAsSelectedParams.b);
        NearbySharingChimeraService nearbySharingChimeraService = this.c;
        vkw vkw = new vkw(this, unmarkContactAsSelectedParams);
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a((Runnable) vkw);
    }

    public final void a(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams) {
        vyt vyt = unregisterReceiveSurfaceParams.a;
        iva.a((Object) vyt);
        iva.a((Object) unregisterReceiveSurfaceParams.b);
        if (this.d.containsKey(vyt.asBinder())) {
            vmr vmr = (vmr) this.d.remove(vyt.asBinder());
            try {
                vyt.asBinder().unlinkToDeath(vmr.b, 0);
            } catch (NoSuchElementException e2) {
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.c;
            vkm vkm = new vkm(this, unregisterReceiveSurfaceParams, vmr);
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a((Runnable) vkm);
            return;
        }
        throw new IllegalArgumentException("unregisterReceiveSurface failed. Unknown TransferUpdateCallback");
    }

    public final void a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        vyt vyt = unregisterSendSurfaceParams.a;
        iva.a((Object) vyt);
        iva.a((Object) unregisterSendSurfaceParams.b);
        if (this.e.containsKey(vyt.asBinder())) {
            vms vms = (vms) this.e.remove(vyt.asBinder());
            try {
                vyt.asBinder().unlinkToDeath(vms.b, 0);
            } catch (NoSuchElementException e2) {
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.c;
            vkj vkj = new vkj(this, unregisterSendSurfaceParams, vms);
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a((Runnable) vkj);
            return;
        }
        throw new IllegalArgumentException("unregisterSendSurface failed. Unknown TransferUpdateCallback");
    }

    public final void a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        vye vye = unregisterSharingProviderParams.b;
        iva.a((Object) vye);
        if (this.f.containsKey(vye.a)) {
            vmq vmq = (vmq) this.f.remove(vye.a);
            try {
                vye.a.unlinkToDeath(vmq.b, 0);
            } catch (NoSuchElementException e2) {
            }
            NearbySharingChimeraService nearbySharingChimeraService = this.c;
            vmd vmd = new vmd(this, unregisterSharingProviderParams, vmq);
            Charset charset = NearbySharingChimeraService.a;
            nearbySharingChimeraService.a((Runnable) vmd);
            return;
        }
        throw new IllegalArgumentException("unregisterSharingProvider failed. Unknown ExternalSharingProvider");
    }
}
