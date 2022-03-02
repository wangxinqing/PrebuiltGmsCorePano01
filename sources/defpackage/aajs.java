package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: aajs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aajs extends aafb {
    private final osf a;

    public aajs(osf osf, SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, ozc ozc) {
        super(aonk.SET_INCLUDE_IN_GLOBAL_SEARCH, 1, 2, osf.b, setIncludeInGlobalSearchCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response = new SetIncludeInGlobalSearchCall$Response();
        if (!"com.google.android.gms".equals(((SetIncludeInGlobalSearchCall$Request) this.n).a) || ((SetIncludeInGlobalSearchCall$Request) this.n).b != null) {
            oyz c = this.a.m.c(((SetIncludeInGlobalSearchCall$Request) this.n).a);
            SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = (SetIncludeInGlobalSearchCall$Request) this.n;
            String str = setIncludeInGlobalSearchCall$Request.b;
            boolean z = setIncludeInGlobalSearchCall$Request.c;
            boolean z2 = true;
            oso.b("package:%s source:%s enabled:%b", c.b, str, Boolean.valueOf(z));
            prp prp = c.d;
            String str2 = c.b;
            if (!"com.google.android.gms".equals(str2)) {
                otn otn = !z ? otn.DISABLED : otn.ENABLED;
                synchronized (prp.g) {
                    out d = prp.d(str2);
                    aucd aucd = (aucd) d.c(5);
                    aucd.a((aucj) d);
                    otn a2 = otn.a(((out) aucd.b).i);
                    if (a2 == null) {
                        a2 = otn.UNSET;
                    }
                    if (otn != a2) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        out out = (out) aucd.b;
                        out out2 = out.n;
                        out.i = otn.d;
                        out.a |= 128;
                        prp.a(str2, (out) aucd.i());
                    }
                }
            } else {
                if (str == null) {
                    z2 = false;
                }
                iva.b(z2);
                otn otn2 = !z ? otn.DISABLED : otn.ENABLED;
                synchronized (prp.g) {
                    ous ous = prp.d;
                    if (ous != null) {
                        aucd aucd2 = (aucd) ous.c(5);
                        aucd2.a((aucj) ous);
                        int i = 0;
                        while (true) {
                            if (i >= ((ous) aucd2.b).b.size()) {
                                break;
                            } else if (!plc.a((otl) ((ous) aucd2.b).a.get(i)).b.equals(str)) {
                                i++;
                            } else if (((otn) ous.c.a(Integer.valueOf(((ous) aucd2.b).b.c(i)))) != otn2) {
                                if (aucd2.c) {
                                    aucd2.c();
                                    aucd2.c = false;
                                }
                                ous ous2 = (ous) aucd2.b;
                                otn2.getClass();
                                ous2.a();
                                ous2.b.a(i, otn2.d);
                                prp.d = (ous) aucd2.i();
                                prp.a(prp.d);
                            }
                        }
                    }
                }
            }
            setIncludeInGlobalSearchCall$Response.a = Status.a;
        } else {
            setIncludeInGlobalSearchCall$Response.a = new Status(10, "Non-null source name required for GMSCore package", (PendingIntent) null);
        }
        return setIncludeInGlobalSearchCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return String.format("%s, package[%s]", new Object[]{super.f(), ((SetIncludeInGlobalSearchCall$Request) this.n).a});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response = new SetIncludeInGlobalSearchCall$Response();
        setIncludeInGlobalSearchCall$Response.a = status;
        return setIncludeInGlobalSearchCall$Response;
    }
}
