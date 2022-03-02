package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
import com.google.android.gms.udc.service.FacsCacheApiChimeraService;
import java.util.concurrent.Executor;

/* renamed from: addi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addi extends mfc implements niz {
    private final Account a;
    private final nix b;
    private final nix c;
    private final ClientContext d;
    private final adev e;
    private final adew f;
    private final addq g;
    private final aful h;
    private final Executor i;
    private final adde j;
    private final aekn k;
    private final mep l;
    private final addt m;

    public addi(Account account, nix nix, nix nix2, ClientContext clientContext, adev adev, adew adew, addq addq, aful aful, Executor executor, adde adde, addt addt, aekn aekn, mep mep) {
        this.a = account;
        this.b = nix;
        this.c = nix2;
        this.d = clientContext;
        this.e = adev;
        this.f = adew;
        this.g = addq;
        this.h = aful;
        this.i = executor;
        this.j = adde;
        this.m = addt;
        this.k = aekn;
        this.l = mep;
    }

    private final agos a(String str) {
        afjl afjl;
        afjl afjl2;
        afjl afjl3;
        addt addt = this.m;
        String str2 = this.d.e;
        Account account = this.a;
        Context context = addt.a;
        aftl aftl = addt.b;
        agny a2 = agny.a(str2, str);
        agop agop = new agop(context);
        if (aygo.b()) {
            synchronized (aftl.a) {
                afjl3 = (afjl) aftl.c.get(account);
                if (afjl3 == null) {
                    afjl3 = afjn.b(aftl.d, account.toString(), aftl.e);
                    aftl.c.put(account, afjl3);
                }
            }
            afjl = afjl3;
        } else {
            synchronized (aftl.a) {
                afjl2 = (afjl) aftl.b.get(account);
                if (afjl2 == null) {
                    afjl2 = afjn.a(aftl.d, account.toString(), aftl.e);
                    aftl.b.put(account, afjl2);
                }
            }
            afjl = afjl2;
        }
        return agos.a(a2, 1009, agop, account, afjl, aygo.c());
    }

    public final void b(mfa mfa, FacsCacheCallOptions facsCacheCallOptions) {
        FacsCacheCallOptions facsCacheCallOptions2 = facsCacheCallOptions;
        FacsCacheApiChimeraService.a.d().a("addi", "b", 215, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'getActivityControlsSettings' request from package '%s', instance id '%s', version '%d'...", (Object) this.d.e, (Object) facsCacheCallOptions2.a, (Object) Long.valueOf(facsCacheCallOptions2.b));
        if (!azrk.e()) {
            mfa.a(new Status(17), (GetActivityControlsSettingsResult) null);
            FacsCacheApiChimeraService.a.c().a("addi", "b", 227, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API request rejected!");
            return;
        }
        mfa mfa2 = mfa;
        nix nix = this.b;
        ClientContext clientContext = this.d;
        adev adev = this.e;
        adew adew = this.f;
        addq addq = this.g;
        aful aful = this.h;
        Executor executor = this.i;
        adde adde = this.j;
        agos a2 = a(facsCacheCallOptions2.a);
        aekn aekn = this.k;
        mep mep = this.l;
        aczv aczv = r1;
        nix nix2 = nix;
        aczv aczv2 = new aczv(mfa, clientContext, adev, adew, addq, aful, executor, facsCacheCallOptions, adde, a2, aekn, mep);
        nix2.a(aczv);
        FacsCacheApiChimeraService.a.d().a("addi", "b", 246, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation 'getActivityControlsSettings' dispatched!");
    }

    public final void a(mfa mfa) {
        FacsCacheApiChimeraService.a.d().a("addi", "a", 303, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'readDeviceLevelSettings' request from package '%s'...", (Object) this.d.e);
        this.c.a(new adac(mfa, this.g));
        FacsCacheApiChimeraService.a.d().a("addi", "a", 310, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation 'readDeviceLevelSettings' dispatched!");
    }

    public final void a(mfa mfa, FacsCacheCallOptions facsCacheCallOptions) {
        FacsCacheCallOptions facsCacheCallOptions2 = facsCacheCallOptions;
        FacsCacheApiChimeraService.a.d().a("addi", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'forceSettingsCacheRefresh' request from package '%s', instance id '%s', version '%d'...", (Object) this.d.e, (Object) facsCacheCallOptions2.a, (Object) Long.valueOf(facsCacheCallOptions2.b));
        if (!azrk.e()) {
            mfa.a(new Status(17), (ForceSettingsCacheRefreshResult) null);
            FacsCacheApiChimeraService.a.c().a("addi", "a", 192, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API request rejected!");
            return;
        }
        mfa mfa2 = mfa;
        nix nix = this.b;
        aczt aczt = r1;
        aczt aczt2 = new aczt(mfa, this.d, this.e, this.h, this.i, facsCacheCallOptions, this.j, a(facsCacheCallOptions2.a), this.k, this.l);
        nix.a(aczt);
        FacsCacheApiChimeraService.a.d().a("addi", "a", 209, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation 'forceSettingsCacheRefresh' dispatched!");
    }

    public final void a(mfa mfa, byte[] bArr) {
        FacsCacheApiChimeraService.a.d().a("addi", "a", 316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'writeDeviceLevelSettings' request from package '%s'...", (Object) this.d.e);
        try {
            this.c.a(new adak((atvp) aucj.a((aucj) atvp.d, bArr, aubs.c()), mfa, this.g));
            FacsCacheApiChimeraService.a.d().a("addi", "a", 327, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation 'writeDeviceLevelSettings' dispatched!");
        } catch (auda e2) {
            mfa.a(new Status(35002, "The given request couldn't be parsed!"));
            FacsCacheApiChimeraService.a.c().a("addi", "a", 332, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to dispatch operation 'writeDeviceLevelSettings' due to malformed request!");
        }
    }

    public final void a(mfa mfa, byte[] bArr, FacsCacheCallOptions facsCacheCallOptions) {
        String str;
        String str2;
        String str3;
        mfa mfa2 = mfa;
        FacsCacheCallOptions facsCacheCallOptions2 = facsCacheCallOptions;
        FacsCacheApiChimeraService.a.d().a("addi", "a", 255, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'updateActivityControlsSettings' request from package '%s', instance id '%s', version '%d'...", (Object) this.d.e, (Object) facsCacheCallOptions2.a, (Object) Long.valueOf(facsCacheCallOptions2.b));
        if (azrk.e()) {
            try {
                atxi atxi = (atxi) aucj.a((aucj) atxi.f, bArr);
                nix nix = this.b;
                ClientContext clientContext = this.d;
                adev adev = this.e;
                addq addq = this.g;
                aful aful = this.h;
                Executor executor = this.i;
                adde adde = this.j;
                agos a2 = a(facsCacheCallOptions2.a);
                aekn aekn = this.k;
                mep mep = this.l;
                adde adde2 = adde;
                adai adai = r2;
                nix nix2 = nix;
                String str4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
                String str5 = "a";
                String str6 = "addi";
                try {
                    adai adai2 = new adai(mfa, clientContext, adev, atxi, addq, aful, executor, facsCacheCallOptions, adde2, a2, aekn, mep);
                    nix2.a(adai);
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                } catch (auda e2) {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    mfa.a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsResult) null);
                    FacsCacheApiChimeraService.a.c().a(str3, str2, 295, str).a("Failed to dispatch operation 'updateActivityControlsSettings' due to malformed request!");
                }
                try {
                    FacsCacheApiChimeraService.a.d().a(str3, str2, 289, str).a("Operation 'updateActivityControlsSettings' dispatched!");
                } catch (auda e3) {
                    mfa.a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsResult) null);
                    FacsCacheApiChimeraService.a.c().a(str3, str2, 295, str).a("Failed to dispatch operation 'updateActivityControlsSettings' due to malformed request!");
                }
            } catch (auda e4) {
                str = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
                str2 = "a";
                str3 = "addi";
                mfa.a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsResult) null);
                FacsCacheApiChimeraService.a.c().a(str3, str2, 295, str).a("Failed to dispatch operation 'updateActivityControlsSettings' due to malformed request!");
            }
        } else {
            String str7 = "addi";
            mfa2.a(new Status(17), (UpdateActivityControlsSettingsResult) null);
            anie c2 = FacsCacheApiChimeraService.a.c();
            c2.a(str7, "a", 267, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API request rejected!");
        }
    }
}
