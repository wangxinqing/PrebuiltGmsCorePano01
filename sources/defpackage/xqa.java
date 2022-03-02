package defpackage;

import android.accounts.Account;
import android.database.MatrixCursor;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: xqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xqa implements Callable {
    private final PeopleGalChimeraProvider a;
    private final String[] b;
    private final String c;
    private final String d;
    private final aucd e;

    public xqa(PeopleGalChimeraProvider peopleGalChimeraProvider, String[] strArr, String str, String str2, aucd aucd) {
        this.a = peopleGalChimeraProvider;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = aucd;
    }

    public final Object call() {
        PeopleGalChimeraProvider peopleGalChimeraProvider = this.a;
        String[] strArr = this.b;
        String str = this.c;
        String str2 = this.d;
        aucd aucd = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append("handlePhoneLookup(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(")");
        sb.toString();
        if (str == null || str.length() < 2) {
            Log.e("PeopleGalProvider", "Error phone number format.");
            return null;
        }
        Account a2 = peopleGalChimeraProvider.a(str2, aucd);
        if (a2 == null) {
            String valueOf = String.valueOf(str2);
            Log.e("PeopleGalProvider", valueOf.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(valueOf));
            return null;
        }
        ClientContext a3 = peopleGalChimeraProvider.a(a2);
        aucd o = aqwg.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aqwg) o.b).c = 2;
        aucd o2 = aqwp.d.o();
        aucd o3 = aqwo.b.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ((aqwo) o3.b).c = true;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqwo aqwo = (aqwo) o3.i();
        aqwo.getClass();
        ((aqwp) o2.b).b = aqwo;
        aucd a4 = xpx.a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqur aqur = (aqur) a4.i();
        aqur.getClass();
        ((aqwp) o2.b).a = aqur;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqwp aqwp = (aqwp) o2.i();
        aqwp.getClass();
        ((aqwg) o.b).d = aqwp;
        aqwu aqwu = (aqwu) aqww.d.o();
        aqwu.a(aqwx.PROFILE);
        aqwu.a(aqwx.DOMAIN_PROFILE);
        aubv aubv = (aubv) aubw.b.o();
        aubv.a("person.metadata");
        aubv.a("person.address");
        aubv.a("person.name");
        aubv.a("person.photo");
        aubv.a("person.phone");
        if (aqwu.c) {
            aqwu.c();
            aqwu.c = false;
        }
        aubw aubw = (aubw) aubv.i();
        aubw.getClass();
        ((aqww) aqwu.b).a = aubw;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqww aqww = (aqww) aqwu.i();
        aqww.getClass();
        ((aqwg) o.b).e = aqww;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aqwg) o.b).b = 3;
        aqwg aqwg = (aqwg) o.b;
        str.getClass();
        if (!aqwg.a.a()) {
            aqwg.a = aucj.a(aqwg.a);
        }
        aqwg.a.add(str);
        aqwl aqwl = (aqwl) aqwn.d.o();
        aucd o4 = aquv.b.o();
        aquu aquu = aquu.PHONE_JOIN;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aquv aquv = (aquv) o4.b;
        aquu.getClass();
        if (!aquv.a.a()) {
            aquv.a = aucj.a(aquv.a);
        }
        aquv.a.d(aquu.a());
        if (aqwl.c) {
            aqwl.c();
            aqwl.c = false;
        }
        aquv aquv2 = (aquv) o4.i();
        aquv2.getClass();
        ((aqwn) aqwl.b).a = aquv2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqwn aqwn = (aqwn) aqwl.i();
        aqwn.getClass();
        ((aqwg) o.b).f = aqwn;
        aqwg aqwg2 = (aqwg) o.i();
        try {
            xpo xpo = peopleGalChimeraProvider.a.b;
            long millis = TimeUnit.SECONDS.toMillis(ayuk.g());
            if (xpo.c == null) {
                xpo.c = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/ListPeopleByKnownId", baoq.a(aqwg.g), baoq.a(aqwj.c));
            }
            int i = 0;
            aqwj aqwj = (aqwj) xpo.a.a(xpo.c, a3, aqwg2, millis, TimeUnit.MILLISECONDS);
            if (aqwj.a.size() <= 0) {
                return null;
            }
            aqwh aqwh = (aqwh) aqwj.a.get(0);
            int size = aqwh.a.size();
            MatrixCursor matrixCursor = new MatrixCursor(strArr, size);
            Map unmodifiableMap = Collections.unmodifiableMap(aqwj.b);
            int i2 = 0;
            while (i2 < size) {
                amgi amgi = (amgi) unmodifiableMap.get((String) aqwh.a.get(i2));
                if (amgi != null) {
                    amgo amgo = !amgi.h.isEmpty() ? (amgo) amgi.h.get(i) : null;
                    Object[] objArr = new Object[strArr.length];
                    for (int i3 = 0; i3 < strArr.length; i3++) {
                        String str3 = strArr[i3];
                        if (str3.equals("_id")) {
                            objArr[i3] = Integer.valueOf(i2 + 1);
                        } else if (str3.equals("display_name") && !amgi.d.isEmpty()) {
                            objArr[i3] = ((amfz) amgi.d.get(0)).c;
                        } else if (str3.equals("photo_uri") && PeopleGalChimeraProvider.a(amgi)) {
                            objArr[i3] = PeopleGalChimeraProvider.a(str2, false, amgi.b);
                        } else if (str3.equals("has_phone_number")) {
                            objArr[i3] = Integer.valueOf(amgi.h.size() == 0 ? 0 : 1);
                        } else if (str3.equals("lookup")) {
                            objArr[i3] = amgi.b;
                        } else if (amgo != null) {
                            if (str3.equals("number")) {
                                objArr[i3] = amgo.c;
                            } else if (str3.equals("type")) {
                                objArr[i3] = amgo.d;
                            } else if (str3.equals("label")) {
                                objArr[i3] = amgo.e;
                            } else if (str3.equals("normalized_number")) {
                                objArr[i3] = amgo.f;
                            }
                        }
                    }
                    matrixCursor.addRow(objArr);
                    i2++;
                    i = 0;
                } else {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    xlj xlj = (xlj) aucd.b;
                    xlj xlj2 = xlj.g;
                    xlj.c = 9;
                    xlj.a |= 2;
                    Log.e("PeopleGalProvider", "Person not found on phone lookup.");
                    return null;
                }
            }
            return matrixCursor;
        } catch (babk | eif e2) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e2);
            throw e2;
        } catch (eif e3) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj3 = (xlj) aucd.b;
            xlj xlj4 = xlj.g;
            xlj3.c = 3;
            xlj3.a |= 2;
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb2.append("Error listPeopleByKnownId grpc response: ");
            sb2.append(valueOf2);
            Log.e("PeopleGalProvider", sb2.toString());
            return null;
        } catch (babk e4) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj5 = (xlj) aucd.b;
            xlj xlj6 = xlj.g;
            xlj5.c = 14;
            int i4 = xlj5.a | 2;
            xlj5.a = i4;
            int i5 = e4.a.r.r;
            xlj5.a = i4 | 16;
            xlj5.f = i5;
            String valueOf3 = String.valueOf(e4);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 41);
            sb3.append("Error listPeopleByKnownId grpc response: ");
            sb3.append(valueOf3);
            Log.e("PeopleGalProvider", sb3.toString());
            return null;
        }
    }
}
