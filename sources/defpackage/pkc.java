package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.mdh.service.MobileDataHubChimeraService;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;
import java.util.Map;

/* renamed from: pkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pkc extends sau implements niz {
    private final MobileDataHubChimeraService a;
    private final String b;
    private final nix c;

    public pkc(MobileDataHubChimeraService mobileDataHubChimeraService, String str, nix nix) {
        this.a = mobileDataHubChimeraService;
        this.b = str;
        this.c = nix;
    }

    private final void a(nis nis) {
        this.c.a(nis);
    }

    public final void b(ifu ifu) {
        pia B = this.a.a.B();
        pdz s = this.a.a.s();
        pdz.a(ifu, 1);
        Map map = (Map) s.a.a();
        pdz.a(map, 2);
        a((nis) new pjm(B, new pdy(ifu, map), "RefreshChannelConfigOp"));
    }

    public final void c(ifu ifu) {
        pia B = this.a.a.B();
        peb t = this.a.a.t();
        peb.a(ifu, 1);
        Map map = (Map) t.a.a();
        peb.a(map, 2);
        a((nis) new pjm(B, new pea(ifu, map), "ResetDataOp"));
    }

    public final void d(ifu ifu) {
        ifu.a(new Status(8, "Trivial Bigtable API is not supported."));
    }

    public final void e(ifu ifu) {
        ifu.a(new Status(8, "Trivial Bigtable API is not supported."));
    }

    public final void a(ifu ifu) {
        pia B = this.a.a.B();
        ped u = this.a.a.u();
        ped.a(ifu, 1);
        aeqd aeqd = (aeqd) u.a.a();
        ped.a(aeqd, 2);
        a((nis) new pjm(B, new pec(ifu, aeqd), "ResetTestingOp"));
    }

    public final void b(sad sad) {
        sad.a(new Status(8, "Trivial Bigtable API is not supported."), (byte[]) null);
    }

    public final void a(ifu ifu, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus) {
        pia B = this.a.a.B();
        pei x = this.a.a.x();
        pei.a(ifu, 1);
        Account account2 = account;
        pei.a(account2, 2);
        LatestFootprintFilter latestFootprintFilter2 = latestFootprintFilter;
        pei.a(latestFootprintFilter2, 5);
        afgs afgs = (afgs) x.a.a();
        pei.a(afgs, 6);
        SyncStatus syncStatus2 = syncStatus;
        pei.a(syncStatus2, 7);
        aeva aeva = (aeva) x.b.a();
        pei.a(aeva, 8);
        a((nis) new pjm(B, new peh(ifu, account2, i, i2, latestFootprintFilter2, afgs, syncStatus2, aeva), "WriteLatestOnlyChannelSyncStatusOperationDelegate"));
    }

    public final void a(ifu ifu, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        try {
            a((nis) new pjr(127, "SubscribeToFootprintsChannelAsyncOperationDelegate", this.b, this.a.a.g().a(this.b, account, i, i2, syncPolicy, latestFootprintFilter, ifu), this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            ifu ifu2 = ifu;
            ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    public final void a(ifu ifu, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        ifu ifu2 = ifu;
        if (pba.e()) {
            try {
                String str = this.b;
                pkz g = this.a.a.g();
                String str2 = this.b;
                afeb afeb = (afeb) g.a.a();
                pkz.a(afeb, 1);
                pkz.a(str2, 2);
                pkz.a(account, 3);
                pkz.a(syncPolicy, 6);
                pkz.a(timeSeriesFootprintsSubscriptionFilter, 7);
                pkz.a(ifu2, 8);
                pky pky = new pky(afeb, str2, account, i, i2, syncPolicy, timeSeriesFootprintsSubscriptionFilter, ifu);
                a((nis) new pjr(127, "SubscribeToFootprintsChannelAsyncOperationDelegate", str, pky, this.a.a));
            } catch (RuntimeException e) {
                pbu.a().a("Unexpected RuntimeException in MDH.", e);
                ifu2.a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            ifu2.a(new Status(8, "Time Series Footprints API is disabled."));
        }
    }

    public final void a(ifu ifu, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus) {
        pia B = this.a.a.B();
        pem w = this.a.a.w();
        pem.a(ifu, 1);
        Account account2 = account;
        pem.a(account2, 2);
        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter2 = timeSeriesFootprintsSubscriptionFilter;
        pem.a(timeSeriesFootprintsSubscriptionFilter2, 5);
        afgs afgs = (afgs) w.a.a();
        pem.a(afgs, 6);
        SyncStatus syncStatus2 = syncStatus;
        pem.a(syncStatus2, 7);
        aevl aevl = (aevl) w.b.a();
        pem.a(aevl, 8);
        a((nis) new pjm(B, new pel(ifu, account2, i, i2, timeSeriesFootprintsSubscriptionFilter2, afgs, syncStatus2, aevl), "WriteTimeSeriesChannelSyncStatusOperationDelegate"));
    }

    public final void a(ifu ifu, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        pia B = this.a.a.B();
        pek v = this.a.a.v();
        List list = mdhFootprintListSafeParcelable.a;
        pek.a(ifu, 1);
        pek.a(account, 2);
        pek.a(list, 5);
        aevl aevl = (aevl) v.a.a();
        pek.a(aevl, 6);
        a((nis) new pjm(B, new pej(ifu, account, i, i2, list, aevl), "WriteTimeSeriesChannelOperationDelegate"));
    }

    public final void a(ifu ifu, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable) {
        ifu ifu2 = ifu;
        try {
            String str = this.b;
            pht i3 = this.a.a.i();
            String str2 = this.b;
            byte[] bArr2 = byteArraySafeParcelable.a;
            awdn awdn = (awdn) i3.a.a();
            pht.a(awdn, 1);
            aeva aeva = (aeva) i3.b.a();
            pht.a(aeva, 2);
            pht.a(str2, 3);
            pht.a(account, 4);
            pht.a(ifu2, 9);
            phs phs = new phs(awdn, aeva, str2, account, i, i2, bArr, (byte[]) pht.a(bArr2, 8), ifu);
            a((nis) new pjr(127, "WriteLatestFootprintAsyncOperationDelegate", str, phs, this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            ifu2.a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    public final void a(ifu ifu, Account account, List list, SyncPolicy syncPolicy) {
        ryc a2 = LatestFootprintFilter.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a2.a(String.valueOf(((Integer) list.get(i)).intValue()).getBytes(amqn.c), 1);
        }
        try {
            a((nis) new pjr(127, "SubscribeToFootprintsChannelAsyncOperationDelegate", this.b, this.a.a.g().a(this.b, account, 553, aulx.d.a(), syncPolicy, a2.a(), ifu), this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    public final void a(ifu ifu, MdhBroadcastListenerKey mdhBroadcastListenerKey) {
        if (!ozz.a().contains(this.b)) {
            try {
                String str = this.b;
                pcx n = this.a.a.n();
                a((nis) new pjr(127, "UnregisterBroadcastListenerAsyncOperationDelegate", str, new pcw(n.a, mdhBroadcastListenerKey, this.b, ifu), this.a.a));
            } catch (aepg | RuntimeException e) {
                ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
                pbu.a().a("Unexpected RuntimeException in MDH.", e);
            }
        } else {
            ifu.a(new Status(8, "BroadcastListeners API is disabled."));
        }
    }

    public final void a(ifu ifu, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams) {
        ifu ifu2 = ifu;
        if (!ozz.a().contains(this.b)) {
            try {
                String str = this.b;
                pcv o = this.a.a.o();
                a((nis) new pjr(127, "RegisterBroadcastListenerAsyncOperationDelegate", str, new pcu(o.a, mdhBroadcastListenerKey, mdhBroadcastListenerParams, this.b, ifu), this.a.a));
            } catch (aepg | RuntimeException e) {
                ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
                pbu.a().a("Unexpected RuntimeException in MDH.", e);
            }
        } else {
            ifu.a(new Status(8, "BroadcastListeners API is disabled."));
        }
    }

    public final void a(ifu ifu, String str) {
        pia B = this.a.a.B();
        peg p = this.a.a.p();
        peg.a(ifu, 1);
        peg.a(str, 2);
        pjj pjj = (pjj) p.a.a();
        peg.a(pjj, 3);
        a((nis) new pjm(B, new pef(ifu, str, pjj), "StartImmediateTaskOp"));
    }

    public final void a(ifu ifu, byte[] bArr) {
        pia B = this.a.a.B();
        pdx q = this.a.a.q();
        pdx.a(ifu, 1);
        aeqd aeqd = (aeqd) q.a.a();
        pdx.a(aeqd, 3);
        a((nis) new pjm(B, new pdw(ifu, (byte[]) pdx.a(bArr, 2), aeqd), "InjectChannelConfigListOp"));
    }

    public final void a(sad sad) {
        pia B = this.a.a.B();
        pdv r = this.a.a.r();
        pdv.a(sad, 1);
        aorr aorr = (aorr) r.a.a();
        pdv.a(aorr, 2);
        a((nis) new pjm(B, new pdu(sad, aorr), "GetChannelConfigListOp"));
    }

    public final void a(sak sak, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        sak sak2 = sak;
        try {
            String str = this.b;
            pha f = this.a.a.f();
            String str2 = this.b;
            aeri aeri = (aeri) f.a.a();
            pha.a(aeri, 1);
            aext aext = (aext) f.b.a();
            pha.a(aext, 2);
            pha.a(str2, 3);
            pha.a(account, 4);
            pha.a(latestFootprintFilter, 7);
            pha.a(sak2, 8);
            pgz pgz = new pgz(aeri, aext, str2, account, i, i2, latestFootprintFilter, sak);
            a((nis) new pjr(127, "ReadLatestFootprintAsyncOperationDelegate", str, pgz, this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            Status status = new Status(8, "Unexpected RuntimeException in MDH.");
            if (this.a.a.e().F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(amzy.h());
            } else {
                mdhFootprintListSafeParcelable = null;
            }
            sak2.a(status, mdhFootprintListSafeParcelable);
        }
    }

    public final void a(sak sak, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        sak sak2 = sak;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = null;
        if (!pba.e()) {
            Status status = new Status(8, "Time Series Footprints API is disabled.");
            if (this.a.a.e().F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(amzy.h());
            }
            sak2.a(status, mdhFootprintListSafeParcelable);
            return;
        }
        try {
            String str = this.b;
            phf j = this.a.a.j();
            String str2 = this.b;
            aeri aeri = (aeri) j.a.a();
            phf.a(aeri, 1);
            awdn awdn = (awdn) j.b.a();
            phf.a(awdn, 2);
            aevl aevl = (aevl) j.c.a();
            phf.a(aevl, 3);
            afeb afeb = (afeb) j.d.a();
            phf.a(afeb, 4);
            phf.a(str2, 5);
            phf.a(account, 6);
            phf.a(timeSeriesFootprintsReadFilter, 9);
            phf.a(sak2, 10);
            phe phe = new phe(aeri, awdn, aevl, afeb, str2, account, i, i2, timeSeriesFootprintsReadFilter, sak);
            a((nis) new pjr(127, "ReadTimeSeriesFootprintsAsyncOperationDelegate", str, phe, this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            Status status2 = new Status(8, "Unexpected RuntimeException in MDH.");
            if (this.a.a.e().F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(amzy.h());
            }
            sak2.a(status2, mdhFootprintListSafeParcelable);
        }
    }

    public final void a(san san, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        san san2 = san;
        try {
            String str = this.b;
            phc h = this.a.a.h();
            String str2 = this.b;
            aexw aexw = (aexw) h.a.a();
            phc.a(aexw, 1);
            phc.a(str2, 2);
            phc.a(account, 3);
            phc.a(latestFootprintFilter, 6);
            phc.a(san, 7);
            phb phb = new phb(aexw, str2, account, i, i2, latestFootprintFilter, san);
            a((nis) new pjr(127, "ReadLatestFootprintWithSyncStatusAsyncOperationDelegate", str, phb, this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            san.a(new Status(8, "Unexpected RuntimeException in MDH."), (MdhFootprintsReadResult) null);
        }
    }

    public final void a(san san, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        san san2 = san;
        try {
            String str = this.b;
            phh l = this.a.a.l();
            String str2 = this.b;
            aexz aexz = (aexz) l.a.a();
            phh.a(aexz, 1);
            phh.a(str2, 2);
            phh.a(account, 3);
            phh.a(timeSeriesFootprintsReadFilter, 6);
            phh.a(san, 7);
            phg phg = new phg(aexz, str2, account, i, i2, timeSeriesFootprintsReadFilter, san);
            a((nis) new pjr(127, "ReadTimeSeriesFootprintsWithSyncStatusAsyncOperationDelegate", str, phg, this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            san.a(new Status(8, "Unexpected RuntimeException in MDH."), (MdhFootprintsReadResult) null);
        }
    }

    public final void a(sao sao, Account account, int i) {
        try {
            String str = this.b;
            pgx m = this.a.a.m();
            String str2 = this.b;
            aexr aexr = (aexr) m.a.a();
            pgx.a(aexr, 1);
            pgx.a(str2, 2);
            pgx.a(account, 3);
            pgx.a(sao, 5);
            pgw pgw = new pgw(aexr, str2, account, i, sao);
            a((nis) new pjr(127, "ReadFootprintsRecordingSettingAsyncOperationDelegate", str, pgw, this.a.a));
        } catch (RuntimeException e) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e);
            sao.a(new Status(8, "Unexpected RuntimeException in MDH."), (FootprintsRecordingSetting) null);
        }
    }

    public final void a(sap sap, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable) {
        sap sap2 = sap;
        if (pba.e()) {
            try {
                String str = this.b;
                phv k = this.a.a.k();
                String str2 = this.b;
                byte[] bArr = byteArraySafeParcelable.a;
                awdn awdn = (awdn) k.a.a();
                phv.a(awdn, 1);
                aevl aevl = (aevl) k.b.a();
                phv.a(aevl, 2);
                phv.a(str2, 3);
                phv.a(account, 4);
                phv.a(sap2, 8);
                phv.a((afgm) k.c.a(), 9);
                phu phu = new phu(awdn, aevl, str2, account, i, i2, (byte[]) phv.a(bArr, 7), sap);
                a((nis) new pjr(127, "WriteTimeSeriesFootprintAsyncOperationDelegate", str, phu, this.a.a));
            } catch (RuntimeException e) {
                pbu.a().a("Unexpected RuntimeException in MDH.", e);
                sap2.a(new Status(8, "Unexpected RuntimeException in MDH."), -1);
            }
        } else {
            sap2.a(new Status(8, "Time Series Footprints API is disabled."), -1);
        }
    }

    public final void a(sax sax) {
        Status status = new Status(8, "Trivial Bigtable API is not supported.");
        Parcel aQ = sax.aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList((List) null);
        sax.c(1, aQ);
    }
}
