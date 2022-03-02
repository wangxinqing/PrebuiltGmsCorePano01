package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.DeviceVersion;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyt extends nis {
    private final zsg a = zsg.a("FetchDeviceBackupsOp");
    private final zvm b;
    private final String c;
    private final String d;
    private final zsp e;

    public zyt(zvm zvm, String str, String str2) {
        super(135, "FetchDeviceBackups");
        this.b = zvm;
        this.c = str;
        this.d = str2;
        this.e = new zsp(4);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        Context context2 = context;
        zsn zsn = new zsn(context2);
        ArrayList arrayList = new ArrayList();
        try {
            zvu zvu = new zvu(context2);
            this.e.a();
            ClientContext a2 = zvr.a(context2, this.c);
            String str = this.d;
            aucd o = aqvl.b.o();
            aucd o2 = aqvi.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            str.getClass();
            ((aqvi) o2.b).a = str;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqvi aqvi = (aqvi) o2.i();
            aqvi.getClass();
            ((aqvl) o.b).a = aqvi;
            aqvl aqvl = (aqvl) o.i();
            zvt zvt = zvu.a;
            long b2 = azer.b();
            if (zvt.b == null) {
                zvt.b = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/FetchBackUpDeviceContactInfo", baoq.a(aqvl.b), baoq.a(aqvm.b));
            }
            this.e.a(context2, "fetch_backups", true);
            for (aqxo aqxo : ((aqvm) zvt.a.a(zvt.b, a2, aqvl, b2, TimeUnit.MILLISECONDS)).a) {
                if (azfh.c()) {
                    if (azfh.a.a().e()) {
                        aqxr aqxr = aqxo.f;
                        if (aqxr == null) {
                            aqxr = aqxr.b;
                        }
                        if (((long) aqxr.a) >= azfh.a.a().f()) {
                            zsg zsg = this.a;
                            Object[] objArr = new Object[1];
                            aqxr aqxr2 = aqxo.f;
                            if (aqxr2 == null) {
                                aqxr2 = aqxr.b;
                            }
                            objArr[0] = Integer.valueOf(aqxr2.a);
                            zsg.a("Filtered Footprints backup with SDK version: %d", objArr);
                        }
                    }
                }
                zvv zvv = new zvv();
                zvv.a = aqxo.a;
                zvv.d = aqxo.d;
                zvv.e = Long.valueOf(aqxo.e);
                zvv.f = Long.valueOf(zys.a(context).getLong(zys.a(aqxo.a), 0));
                if (azfh.c()) {
                    zvv.b = Long.valueOf(aqxo.b);
                }
                for (aqyf aqyf : aqxo.c) {
                    zwe zwe = new zwe();
                    zwe.a = aqyf.a;
                    zwe.b = Integer.valueOf(aqyf.b);
                    SourceStats[] sourceStatsArr = {new SourceStatsEntity(zwe.a, zwe.b)};
                    if (zvv.c == null) {
                        zvv.c = new ArrayList();
                    }
                    SourceStats sourceStats = sourceStatsArr[0];
                    if (sourceStats != null) {
                        zvv.c.add(sourceStats);
                    }
                }
                String str2 = zvv.a;
                Long l = zvv.b;
                List list = zvv.c;
                BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = new BackedUpContactsPerDeviceEntity(str2, l, list, zvv.d, zvv.e, zvv.f, (DeviceVersion) null, true);
                arrayList.add(new BackedUpContactsPerDeviceEntity(backedUpContactsPerDeviceEntity.a, backedUpContactsPerDeviceEntity.b, backedUpContactsPerDeviceEntity.c(), backedUpContactsPerDeviceEntity.c, backedUpContactsPerDeviceEntity.d, backedUpContactsPerDeviceEntity.e, backedUpContactsPerDeviceEntity.f, false));
            }
            this.b.b(Status.a, arrayList);
            return;
        } catch (eif e2) {
            eif eif = e2;
            zsn.a(eif, azfa.l());
            this.a.a((Throwable) eif, "Auth Exception when fetching contacts from server");
            zsi.a().a("fetch_backups_error:authentication_failure");
        } catch (babk e3) {
            babk babk = e3;
            zsn.a(babk, azfa.l());
            this.a.a((Throwable) babk, "Status Exception when fetching contacts from server");
            zsi a3 = zsi.a();
            String valueOf = String.valueOf(babk.a.r);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("fetch_backups_error:status_error:");
            sb.append(valueOf);
            a3.a(sb.toString());
        } catch (RuntimeException e4) {
            RuntimeException runtimeException = e4;
            zsn.a(runtimeException, azfa.m());
            this.a.a((Throwable) runtimeException, "Failed to fetch contacts backup due to runtime exception.");
            zsi a4 = zsi.a();
            String valueOf2 = String.valueOf(runtimeException.getMessage());
            a4.a(valueOf2.length() == 0 ? new String("fetch_backups_error:runtime_error:") : "fetch_backups_error:runtime_error:".concat(valueOf2));
        } catch (Throwable th) {
            Throwable th2 = th;
            a(Status.c);
            throw th2;
        }
        a(Status.c);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.b(status, (List) null);
    }
}
