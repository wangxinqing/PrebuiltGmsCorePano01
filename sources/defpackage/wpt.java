package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import com.google.android.gms.people.protomodel.SourceStats;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: wpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpt extends wnb {
    private final String c;
    private final String d;
    private final yde e;
    private final wmt f;
    private final wmo g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wpt(wzv wzv, String str, int i, String str2, String str3) {
        super(str, i, wzv, str2, "FetchBackUpDeviceContactInfoOperation");
        wmt wmt = wmt.a;
        yde yde = yde.a;
        wmo wmo = new wmo(amsn.a(ampt.a));
        this.d = str2;
        this.c = str3;
        this.f = wmt;
        this.e = yde;
        this.g = wmo;
    }

    public final Pair c(Context context) {
        Context context2 = context;
        ydd a = this.e.a(context2);
        xpp a2 = this.f.a(context2, 14081);
        try {
            this.g.a();
            ClientContext a3 = xqw.a(context2, this.d);
            String str = this.c;
            try {
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
                xpo xpo = a2.b;
                xip.a();
                long longValue = ((Long) xft.a.a()).longValue();
                if (xpo.m == null) {
                    xpo.m = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/FetchBackUpDeviceContactInfo", baoq.a(aqvl.b), baoq.a(aqvm.b));
                }
                aqvm aqvm = (aqvm) xpo.a.a(xpo.m, a3, aqvl, longValue, TimeUnit.MILLISECONDS);
                this.g.a(context2, "fetch_backups", true);
                xow xow = new xow();
                for (aqxo aqxo : aqvm.a) {
                    xop xop = new xop();
                    xop.a = aqxo.a;
                    xop.c = aqxo.d;
                    xop.d = Long.valueOf(aqxo.e);
                    xop.e = Long.valueOf(wpr.a(context).getLong(wpr.a(aqxo.a), 0));
                    for (aqyf aqyf : aqxo.c) {
                        xpi xpi = new xpi();
                        xpi.a = aqyf.a;
                        xpi.b = Integer.valueOf(aqyf.b);
                        SourceStats[] sourceStatsArr = {new SourceStatsEntity(xpi.a, xpi.b)};
                        if (xop.b == null) {
                            xop.b = new ArrayList();
                        }
                        SourceStats sourceStats = sourceStatsArr[0];
                        if (sourceStats != null) {
                            xop.b.add(sourceStats);
                        }
                    }
                    String str2 = xop.a;
                    List list = xop.b;
                    String str3 = xop.c;
                    String str4 = str2;
                    List list2 = list;
                    String str5 = str3;
                    Object[] objArr = {new BackedUpContactsPerDeviceEntity(str4, list2, str5, xop.d, xop.e)};
                    if (xow.a == null) {
                        xow.a = new ArrayList();
                    }
                    Object obj = objArr[0];
                    if (obj != null) {
                        xow.a.add(obj);
                    }
                }
                Bundle bundle = new Bundle(FetchBackUpDeviceContactInfoResponse.class.getClassLoader());
                bundle.putParcelable("people_restore_fetch_info", new FetchBackUpDeviceContactInfoResponseEntity(xow.a, (byte[]) null));
                return new Pair(xqy.c, bundle);
            } catch (eif e2) {
                e = e2;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            } catch (babk e3) {
                e = e3;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            }
        } catch (eif e4) {
            xip.a();
            a.a(e4, ((Double) xic.a.a()).doubleValue());
            Log.e("PeopleRestore", "Auth exception when fetching info from server.", e4);
            return new Pair(xqy.e, (Object) null);
        } catch (babk e5) {
            xip.a();
            a.a(e5, ((Double) xic.a.a()).doubleValue());
            Log.e("PeopleRestore", "Operation exception when loading info from server.", e5);
            return new Pair(xqy.e, (Object) null);
        }
    }
}
