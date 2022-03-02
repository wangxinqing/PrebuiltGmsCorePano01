package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aczv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczv extends aczj {
    private static final anij k = addh.b();
    private final adew l;
    private final addq o;
    private final aekn p;
    private long q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aczv(mfa mfa, ClientContext clientContext, adev adev, adew adew, addq addq, aful aful, Executor executor, FacsCacheCallOptions facsCacheCallOptions, adde adde, agos agos, aekn aekn, mep mep) {
        super("GetActivityControlsSettingsOperation", mfa, clientContext, adev, aful, executor, facsCacheCallOptions, adde, agos, 1008, mep);
        this.l = adew;
        this.o = addq;
        this.p = aekn;
    }

    private final atwh d() {
        k.d().a("aczv", "d", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Forwarding operation '%s' to internal FACS API...", (Object) this.m);
        try {
            aubs b = aubs.b();
            return (atwh) aucj.a((aucj) atwh.d, (byte[]) a(this.i.a(new FacsInternalSyncCallOptions(false))), b);
        } catch (auda e) {
            throw new nja(35002, "Failure parsing the bytes returned by the internal sync API call.", (PendingIntent) null, e);
        }
    }

    public final void a(Context context) {
        boolean z;
        atwh atwh;
        atwh atwh2;
        long j;
        int i;
        atwh atwh3;
        String str = "aczv";
        k.d().a(str, "a", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        this.q = this.p.b();
        a();
        a(azrk.a.a().x());
        this.h.a();
        acyb acyb = (acyb) adhn.a(aopr.a(this.l.a(this.b.c, aosd.a()), aczu.a, (Executor) aoqm.a));
        if (acyb != null) {
            atwh = acyb.b;
            if (atwh == null) {
                atwh = atwh.d;
            }
            z = false;
        } else {
            if (!azrk.g()) {
                atwh3 = a(adeu.EMPTY_CACHE);
            } else {
                k.d().a(str, "d", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Forwarding operation '%s' to internal FACS API...", (Object) this.m);
                try {
                    atwh3 = (atwh) aucj.a((aucj) atwh.d, (byte[]) a(this.i.a(new FacsInternalSyncCallOptions(false))), aubs.b());
                } catch (auda e) {
                    throw new nja(35002, "Failure parsing the bytes returned by the internal sync API call.", (PendingIntent) null, e);
                }
            }
            z = true;
        }
        if (this.o.a()) {
            aucd aucd = (aucd) atwh.c(5);
            aucd.a((aucj) atwh);
            atvp b = this.o.b();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            atwh atwh4 = (atwh) aucd.b;
            atwh atwh5 = atwh.d;
            b.getClass();
            atwh4.c = b;
            atwh4.a |= 1;
            atwh = (atwh) aucd.i();
        }
        adde adde = this.g;
        String b2 = b();
        long c = c();
        String str2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
        long b3 = this.p.b() - this.q;
        if (z) {
            atwh2 = atwh;
            j = 0;
        } else if ((acyb.a & 2) != 0) {
            atwh2 = atwh;
            j = this.p.a() - acyb.c;
        } else {
            atwh2 = atwh;
            j = -1;
        }
        atwh atwh6 = atwh2;
        aucx aucx = atwh6.b;
        amzt j2 = amzy.j();
        int size = aucx.size();
        int i2 = 0;
        while (i2 < size) {
            aucx aucx2 = aucx;
            atwg atwg = (atwg) aucx.get(i2);
            int i3 = size;
            aucd o2 = atvu.e.o();
            atwh atwh7 = atwh6;
            int i4 = atwg.b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atvu atvu = (atvu) o2.b;
            String str3 = str;
            int i5 = atvu.a | 1;
            atvu.a = i5;
            atvu.b = i4;
            boolean z2 = atwg.e;
            int i6 = i5 | 4;
            atvu.a = i6;
            atvu.d = z2;
            boolean z3 = atwg.c;
            atvu.a = i6 | 2;
            atvu.c = z3;
            j2.c((atvu) o2.i());
            i2++;
            atwh6 = atwh7;
            aucx = aucx2;
            size = i3;
            str = str3;
        }
        String str4 = str;
        atwh atwh8 = atwh6;
        long longValue = ((Long) adde.c.a()).longValue();
        if (adde.d.a(longValue)) {
            aucd o3 = atvv.g.o();
            if (!o3.c) {
                i = 0;
            } else {
                o3.c();
                i = 0;
                o3.c = false;
            }
            atvv atvv = (atvv) o3.b;
            int i7 = atvv.a | 1;
            atvv.a = i7;
            atvv.b = i;
            atvv atvv2 = atvv;
            atvv2.a = i7 | 2;
            atvv2.c = b3;
            aucd o4 = atvt.d.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atvt atvt = (atvt) o4.b;
            b2.getClass();
            int i8 = atvt.a | 1;
            atvt.a = i8;
            atvt.b = b2;
            atvt.a = i8 | 2;
            atvt.c = c;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvv atvv3 = (atvv) o3.b;
            atvt atvt2 = (atvt) o4.i();
            atvt2.getClass();
            atvv3.d = atvt2;
            atvv3.a |= 4;
            amzy a = j2.a();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvv atvv4 = (atvv) o3.b;
            if (!atvv4.f.a()) {
                atvv4.f = aucj.a(atvv4.f);
            }
            auab.a((Iterable) a, (List) atvv4.f);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvv atvv5 = (atvv) o3.b;
            atvv5.a |= 8;
            atvv5.e = j;
            atvv atvv6 = (atvv) o3.i();
            hol hol = (hol) adde.b.a();
            aucd o5 = atwz.h.o();
            int i9 = (int) longValue;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atwz atwz = (atwz) o5.b;
            atwz.a |= 64;
            atwz.d = i9;
            aucd o6 = atvy.c.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            atvy atvy = (atvy) o6.b;
            atvv6.getClass();
            atvy.b = atvv6;
            atvy.a = 3;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atwz atwz2 = (atwz) o5.b;
            atvy atvy2 = (atvy) o6.i();
            atvy2.getClass();
            atwz2.c = atvy2;
            atwz2.b = 3;
            aucd o7 = atws.d.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            atws atws = (atws) o7.b;
            "com.google.android.gms#udc-facs".getClass();
            atws.a |= 1;
            atws.b = "com.google.android.gms#udc-facs";
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atwz atwz3 = (atwz) o5.b;
            atws atws2 = (atws) o7.i();
            atws2.getClass();
            atwz3.e = atws2;
            atwz3.a |= 128;
            hoi a2 = hol.a((audx) o5.i());
            a2.b(1007);
            a2.b();
        }
        k.d().a(str4, "a", 131, str2).a("Operation '%s' successful!", (Object) this.m);
        this.a.a(Status.a, new GetActivityControlsSettingsResult(atwh8.k()));
    }

    public final void a(Status status) {
        a(status.i, this.p.b() - this.q);
        this.a.a(status, (GetActivityControlsSettingsResult) null);
    }
}
