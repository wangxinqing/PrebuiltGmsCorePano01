package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: xwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwv extends xwt {
    public static final String[] h;
    private static final aqvj[] j = {aqvj.GDATA_COMPATIBILITY};
    private static final String[] k;
    public final amri i;

    static {
        String[] strArr = {"person.about", "person.address", "person.birthday", "person.calendar", "person.client_data", "person.contact_group_membership", "person.email", "person.event", "person.external_id", "person.file_as", "person.gender", "person.im", "person.interest", "person.language", "person.name", "person.nickname", "person.occupation", "person.organization", "person.other_keyword", "person.phone", "person.relation", "person.sip_address", "person.user_defined", "person.website"};
        k = strArr;
        h = (String[]) jhx.a((Object[][]) new String[][]{strArr, new String[]{"person.photo", "person.metadata"}});
    }

    public xwv(Context context, ClientContext clientContext, xpp xpp, String str, jiq jiq, amsn amsn, yaz yaz, aqwp aqwp, ybu ybu, amri amri) {
        super(context, clientContext, xpp, str, amsn, yaz, aqwp, ybu);
        this.i = amri;
    }

    public static final aqun[] a(LinkedHashMap linkedHashMap, boolean z) {
        aqun[] aqunArr = new aqun[linkedHashMap.size()];
        int i2 = 0;
        for (xvs xvs : linkedHashMap.keySet()) {
            aucd o = aqun.c.o();
            amgi b = z ? xwx.b(xvs) : xwx.a(xvs);
            if (o.c) {
                o.c();
                o.c = false;
            }
            b.getClass();
            ((aqun) o.b).a = b;
            long longValue = ((Long) linkedHashMap.get(xvs)).longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((aqun) o.b).b = longValue;
            aqunArr[i2] = (aqun) o.i();
            i2++;
        }
        return aqunArr;
    }

    public static final aqvk b() {
        aucd o = aqvk.b.o();
        List<aqvj> asList = Arrays.asList(j);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqvk aqvk = (aqvk) o.b;
        if (!aqvk.a.a()) {
            aqvk.a = aucj.a(aqvk.a);
        }
        for (aqvj a : asList) {
            aqvk.a.d(a.a());
        }
        return (aqvk) o.i();
    }

    public static final aqwn c() {
        aqwl aqwl = (aqwl) aqwn.d.o();
        aucd o = aqwq.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aqwq) o.b).a = 2;
        if (aqwl.c) {
            aqwl.c();
            aqwl.c = false;
        }
        aqwq aqwq = (aqwq) o.i();
        aqwq.getClass();
        ((aqwn) aqwl.b).b = aqwq;
        xip.a();
        if (Boolean.valueOf(ayrj.a.a().be()).booleanValue()) {
            aqwl.a(aqwm.CORE_ID);
        }
        return (aqwn) aqwl.i();
    }

    public final aqvp b(String str) {
        aqvo aqvo = (aqvo) aqvp.g.o();
        if (!TextUtils.isEmpty(str)) {
            aqvo.a(str);
        }
        xip.a();
        if (!Boolean.valueOf(ayrj.a.a().o()).booleanValue()) {
            if (aqvo.c) {
                aqvo.c();
                aqvo.c = false;
            }
            ((aqvp) aqvo.b).e = aqvn.a(3);
        }
        aqvk b = b();
        if (aqvo.c) {
            aqvo.c();
            aqvo.c = false;
        }
        aqvp aqvp = (aqvp) aqvo.b;
        b.getClass();
        aqvp.c = b;
        aqwp aqwp = this.f;
        aqwp.getClass();
        aqvp.d = aqwp;
        aqwu aqwu = (aqwu) aqww.d.o();
        aubv aubv = (aubv) aubw.b.o();
        aubv.a((Iterable) Arrays.asList(h));
        aubw aubw = (aubw) aubv.i();
        if (aqwu.c) {
            aqwu.c();
            aqwu.c = false;
        }
        aubw.getClass();
        ((aqww) aqwu.b).a = aubw;
        if (aqvo.c) {
            aqvo.c();
            aqvo.c = false;
        }
        aqww aqww = (aqww) aqwu.i();
        aqww.getClass();
        ((aqvp) aqvo.b).b = aqww;
        aqwn c = c();
        if (aqvo.c) {
            aqvo.c();
            aqvo.c = false;
        }
        c.getClass();
        ((aqvp) aqvo.b).f = c;
        return (aqvp) aqvo.i();
    }

    public final xvs a(amgi amgi, String str) {
        aqwr aqwr;
        aucd o = aqxk.h.o();
        String str2 = amgi.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqxk aqxk = (aqxk) o.b;
        str2.getClass();
        aqxk.a = str2;
        amgi.getClass();
        aqxk.b = amgi;
        aubv aubv = (aubv) aubw.b.o();
        aubv.a((Iterable) Arrays.asList(k));
        aubw aubw = (aubw) aubv.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aubw.getClass();
        ((aqxk) o.b).c = aubw;
        aqwx aqwx = aqwx.CONTACT;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aqxk) o.b).d = aqwx.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aqxk) o.b).e = false;
        xip.a();
        if (!Boolean.valueOf(ayrj.a.a().p()).booleanValue()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqxk aqxk2 = (aqxk) o.b;
            str.getClass();
            if (!aqxk2.f.a()) {
                aqxk2.f = aucj.a(aqxk2.f);
            }
            aqxk2.f.add(str);
        }
        aqvp b = b((String) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        b.getClass();
        ((aqxk) o.b).g = b;
        this.d.a();
        xpp xpp = this.b;
        ClientContext clientContext = this.a;
        aqxk aqxk3 = (aqxk) o.i();
        try {
            xpo xpo = xpp.b;
            long j2 = (long) xpp.a;
            if (xpo.e == null) {
                xpo.e = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/UpdatePerson", baoq.a(aqxk.h), baoq.a(aqxl.b));
            }
            aqxl aqxl = (aqxl) xpo.a.a(xpo.e, clientContext, aqxk3, j2, TimeUnit.MILLISECONDS);
            this.d.a("FSA_updatePerson", 1, xxa.a(aqxl));
            if (aqxl == null || (aqwr = aqxl.a) == null || aqwr.a == null || aqwr.b == null) {
                Log.e("FSA2_ContactSyncGrpc", "Unexpected null result returned by updatePerson People API");
                throw new xya(3);
            }
            aurd aurd = aqwr.b;
            if (aurd == null) {
                aurd = aurd.b;
            }
            if (aurd.a == babg.OK.r) {
                aqwr aqwr2 = aqxl.a;
                if (aqwr2 == null) {
                    aqwr2 = aqwr.c;
                }
                amgi amgi2 = aqwr2.a;
                if (amgi2 == null) {
                    amgi2 = amgi.D;
                }
                return xwy.a(amgi2, str);
            }
            Log.e("FSA2_ContactSyncGrpc", "Failed to updatePerson: Failed to insertPerson, responseStatus is not OK.");
            throw new xya(3);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    public final xwu a(LinkedHashMap linkedHashMap) {
        return a(linkedHashMap, a(linkedHashMap, false));
    }

    public final xwu a(LinkedHashMap linkedHashMap, aqun[] aqunArr) {
        aucd o = aquo.d.o();
        List asList = Arrays.asList(aqunArr);
        int i2 = 0;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aquo aquo = (aquo) o.b;
        if (!aquo.a.a()) {
            aquo.a = aucj.a(aquo.a);
        }
        auab.a((Iterable) asList, (List) aquo.a);
        aqvp b = b((String) null);
        if (o.c) {
            o.c();
            o.c = false;
        }
        b.getClass();
        ((aquo) o.b).c = b;
        aubv aubv = (aubv) aubw.b.o();
        aubv.a((Iterable) Arrays.asList(k));
        if (o.c) {
            o.c();
            o.c = false;
        }
        aubw aubw = (aubw) aubv.i();
        aubw.getClass();
        ((aquo) o.b).b = aubw;
        aquo aquo2 = (aquo) o.i();
        this.d.a();
        xpp xpp = this.b;
        ClientContext clientContext = this.a;
        try {
            xpo xpo = xpp.b;
            if (xpo.o == null) {
                xpo.o = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/BulkInsertContacts", baoq.a(aquo.d), baoq.a(aquq.b));
            }
            aquq aquq = (aquq) xpo.a.a(xpo.o, clientContext, aquo2, 30000, TimeUnit.MILLISECONDS);
            this.d.a("FSA_bulkInsertContacts", 1, xxa.a(aquq));
            if (aquq == null || aquq.a.size() != aquo2.a.size()) {
                Log.e("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts.");
                throw new xya(3);
            }
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                aqwr aqwr = ((aqup) aquq.a.get(i2)).a;
                if (aqwr == null) {
                    aqwr = aqwr.c;
                }
                if (aqwr.a != null) {
                    aqwr aqwr2 = ((aqup) aquq.a.get(i2)).a;
                    if (aqwr2 == null) {
                        aqwr2 = aqwr.c;
                    }
                    if (aqwr2.b != null) {
                        aqwr aqwr3 = ((aqup) aquq.a.get(i2)).a;
                        if (aqwr3 == null) {
                            aqwr3 = aqwr.c;
                        }
                        aurd aurd = aqwr3.b;
                        if (aurd == null) {
                            aurd = aurd.b;
                        }
                        if (aurd.a == babg.OK.r) {
                            aqwr aqwr4 = ((aqup) aquq.a.get(i2)).a;
                            if (aqwr4 == null) {
                                aqwr4 = aqwr.c;
                            }
                            amgi amgi = aqwr4.a;
                            if (amgi == null) {
                                amgi = amgi.D;
                            }
                            String a = xwy.a(amgi);
                            aqwr aqwr5 = ((aqup) aquq.a.get(i2)).a;
                            if (aqwr5 == null) {
                                aqwr5 = aqwr.c;
                            }
                            amgi amgi2 = aqwr5.a;
                            if (amgi2 == null) {
                                amgi2 = amgi.D;
                            }
                            xvs a2 = xwy.a(amgi2, a);
                            if (a2.a.equals(Long.toHexString(((Long) entry.getValue()).longValue()))) {
                                arrayList.add(new yad(a2, (xvs) entry.getKey()));
                            } else {
                                throw new xya(3);
                            }
                        } else {
                            Log.e("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts, responseStatus is not OK.");
                            linkedHashMap2.put((xvs) entry.getKey(), (Long) entry.getValue());
                        }
                        i2++;
                    }
                }
                Log.e("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts.");
                throw new xya(3);
            }
            return new xwu(arrayList, linkedHashMap2);
        } catch (babk | eif e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    public final void a(List list, String str) {
        if (!list.isEmpty()) {
            aucd o = aqva.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqva aqva = (aqva) o.b;
            if (!aqva.a.a()) {
                aqva.a = aucj.a(aqva.a);
            }
            auab.a((Iterable) list, (List) aqva.a);
            aqwp aqwp = this.f;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqwp.getClass();
            ((aqva) o.b).b = aqwp;
            if (aytu.a.a().a()) {
                aucd o2 = avkk.e.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avkk avkk = (avkk) o2.b;
                avkk.d = 6;
                avkk.a |= 1;
                aucd o3 = avkf.c.o();
                String b = amqb.LOWER_UNDERSCORE.b(amqb.UPPER_CAMEL, ampw.a(Build.MANUFACTURER));
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 3 + String.valueOf(str2).length());
                sb.append(b);
                sb.append(" - ");
                sb.append(str2);
                String sb2 = sb.toString();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                avkf avkf = (avkf) o3.b;
                sb2.getClass();
                avkf.a |= 1;
                avkf.b = sb2;
                avkf avkf2 = (avkf) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avkk avkk2 = (avkk) o2.b;
                avkf2.getClass();
                avkk2.c = avkf2;
                avkk2.b = 3;
                avkk avkk3 = (avkk) o2.i();
                aucd o4 = avki.c.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                avki avki = (avki) o4.b;
                avkk3.getClass();
                avki.b = avkk3;
                avki.a |= 1;
                avki avki2 = (avki) o4.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avki2.getClass();
                ((aqva) o.b).c = avki2;
            }
            aqva aqva2 = (aqva) o.i();
            try {
                this.d.a();
                xpp xpp = this.b;
                ClientContext clientContext = this.a;
                try {
                    xpo xpo = xpp.b;
                    long j2 = (long) xpp.a;
                    if (xpo.d == null) {
                        xpo.d = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/DeletePeople", baoq.a(aqva.d), baoq.a(aqvb.a));
                    }
                    this.d.a(str, list.size(), xxa.a((aqvb) xpo.a.a(xpo.d, clientContext, aqva2, j2, TimeUnit.MILLISECONDS)));
                } catch (eif e) {
                    e = e;
                    Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                    throw e;
                } catch (babk e2) {
                    e = e2;
                    Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                    throw e;
                }
            } catch (babk | eif e3) {
                Log.e("FSA2_ContactSyncGrpc", "deleteContactIds() failed.", e3);
                throw e3;
            }
        }
    }
}
