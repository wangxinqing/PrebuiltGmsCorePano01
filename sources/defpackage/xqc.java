package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: xqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xqc implements Callable {
    private final PeopleGalChimeraProvider a;
    private final int b;
    private final String[] c;
    private final Account d;
    private final String e;
    private final String f;
    private final long g;
    private final boolean h;
    private final aucd i;

    public xqc(PeopleGalChimeraProvider peopleGalChimeraProvider, int i2, String[] strArr, Account account, String str, String str2, long j, boolean z, aucd aucd) {
        this.a = peopleGalChimeraProvider;
        this.b = i2;
        this.c = strArr;
        this.d = account;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = z;
        this.i = aucd;
    }

    public final Object call() {
        String str;
        String str2;
        long j;
        PeopleGalChimeraProvider peopleGalChimeraProvider = this.a;
        int i2 = this.b;
        String[] strArr = this.c;
        Account account = this.d;
        String str3 = this.e;
        String str4 = this.f;
        long j2 = this.g;
        boolean z = this.h;
        aucd aucd = this.i;
        boolean z2 = i2 == 4;
        boolean z3 = i2 == 5;
        String str5 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 16 + String.valueOf(str3).length());
        sb.append("handleFilter(");
        sb.append(str5);
        sb.append(", ");
        sb.append(str3);
        sb.append(")");
        sb.toString();
        if (str3 == null) {
            str = "PeopleGalProvider";
        } else if (str3.length() < 2) {
            str = "PeopleGalProvider";
        } else {
            if (z3) {
                str2 = "PeopleGalProvider";
                j = ayuk.a.a().p() * j2;
            } else {
                str2 = "PeopleGalProvider";
                j = j2;
            }
            String str6 = "Error listAutocompletions grpc response: ";
            long min = Math.min(j, ayuk.a.a().m());
            ClientContext a2 = peopleGalChimeraProvider.a(account);
            int i3 = (int) min;
            aucd o = aqwb.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((aqwb) o.b).b = 10;
            String decode = Uri.decode(str3);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqwb aqwb = (aqwb) o.b;
            decode.getClass();
            aqwb.a = decode;
            aqwb.c = i3;
            aucd a3 = xpx.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqur aqur = (aqur) a3.i();
            aqur.getClass();
            ((aqwb) o.b).d = aqur;
            aqwb aqwb2 = (aqwb) o.i();
            try {
                xpn xpn = peopleGalChimeraProvider.a.c;
                long millis = TimeUnit.SECONDS.toMillis(ayuk.g());
                if (xpn.b == null) {
                    xpn.b = baaj.a(baai.UNARY, "google.internal.people.v2.InternalAutocompleteService/ListAutocompletions", baoq.a(aqwb.e), baoq.a(aqwc.b));
                }
                return xpt.a(strArr, (aqwc) xpn.a.a(xpn.b, a2, aqwb2, millis, TimeUnit.MILLISECONDS), account.name, str4, j2, z2, z3, z, aucd);
            } catch (babk | eif e2) {
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e2);
                throw e2;
            } catch (eif e3) {
                String str7 = str2;
                String str8 = str6;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xlj xlj = (xlj) aucd.b;
                xlj xlj2 = xlj.g;
                xlj.c = 3;
                xlj.a |= 2;
                String valueOf = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb2.append(str8);
                sb2.append(valueOf);
                Log.e(str7, sb2.toString());
                return null;
            } catch (babk e4) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xlj xlj3 = (xlj) aucd.b;
                xlj xlj4 = xlj.g;
                xlj3.c = 14;
                int i4 = xlj3.a | 2;
                xlj3.a = i4;
                int i5 = e4.a.r.r;
                xlj3.a = i4 | 16;
                xlj3.f = i5;
                String valueOf2 = String.valueOf(e4);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                sb3.append(str6);
                sb3.append(valueOf2);
                Log.e(str2, sb3.toString());
                return null;
            }
        }
        Log.e(str, "Not enough query characters.");
        return null;
    }
}
