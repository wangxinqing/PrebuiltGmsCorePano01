package defpackage;

import android.os.SystemClock;
import com.android.volley.NetworkResponse;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aczg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczg {
    public final aczf a;
    private final adhv b;
    private long c;

    public aczg(aczf aczf, adhv adhv) {
        this.a = aczf;
        this.b = adhv;
    }

    public static final String a(VolleyError volleyError) {
        NetworkResponse networkResponse;
        if ((volleyError instanceof TimeoutError) || (networkResponse = volleyError.networkResponse) == null) {
            return "NETWORK";
        }
        int i = networkResponse.statusCode;
        return (i < 500 || i >= 600) ? "OTHER" : "SERVER";
    }

    public final atza a(ClientContext clientContext, atyz atyz) {
        a();
        try {
            iyn iyn = this.a.a;
            StringBuilder sb = new StringBuilder();
            String a2 = iyv.a(String.valueOf(atyz.c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 32);
            sb2.append("/users/");
            sb2.append(a2);
            sb2.append("/overviewConfig?alt=proto");
            sb.append(sb2.toString());
            atza atza = (atza) iyn.a(clientContext, 1, sb.toString(), atyz.k(), (Object) atza.e);
            a("FetchOverviewConfig", (String) null);
            return atza;
        } catch (eif e) {
            a("FetchOverviewConfig", "AUTH");
            throw e;
        } catch (VolleyError e2) {
            a("FetchOverviewConfig", a(e2));
            throw e2;
        }
    }

    public final atze a(ClientContext clientContext, atzc atzc) {
        a();
        try {
            iyn iyn = this.a.a;
            StringBuilder sb = new StringBuilder();
            String a2 = iyv.a(String.valueOf(atzc.c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 26);
            sb2.append("/users/");
            sb2.append(a2);
            sb2.append("/settings?alt=proto");
            sb.append(sb2.toString());
            atze atze = (atze) iyn.a(clientContext, 1, sb.toString(), atzc.k(), (Object) atze.f);
            a("FetchSettings", (String) null);
            return atze;
        } catch (eif e) {
            a("FetchSettings", "AUTH");
            throw e;
        } catch (VolleyError e2) {
            a("FetchSettings", a(e2));
            throw e2;
        }
    }

    public final void a() {
        this.c = SystemClock.elapsedRealtime();
    }

    public final void a(String str, String str2) {
        int i;
        if (this.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.c;
            adhv adhv = this.b;
            long j2 = elapsedRealtime - j;
            aucd o = aqna.d.o();
            aucf aucf = (aucf) aqmz.l.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz = (aqmz) aucf.b;
            aqmz.b = 39;
            aqmz.a |= 1;
            if (!amrk.a(str2)) {
                i = 29005;
            } else {
                i = 29004;
            }
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz2 = (aqmz) aucf.b;
            aqmz2.c = i - 1;
            int i2 = aqmz2.a | 2;
            aqmz2.a = i2;
            aqmz2.a = i2 | 16;
            aqmz2.f = true;
            aucd o2 = aqmh.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmh aqmh = (aqmh) o2.b;
            str.getClass();
            aqmh.a |= 1;
            aqmh.b = str;
            String replace = azrh.e().replace("https://", "");
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmh aqmh2 = (aqmh) o2.b;
            replace.getClass();
            aqmh2.a |= 4;
            aqmh2.d = replace;
            String replace2 = azrh.d().replace("/userdatacontrols/", "");
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmh aqmh3 = (aqmh) o2.b;
            replace2.getClass();
            int i3 = aqmh3.a | 2;
            aqmh3.a = i3;
            aqmh3.c = replace2;
            int i4 = i3 | 8;
            aqmh3.a = i4;
            aqmh3.e = (int) j2;
            if (str2 != null) {
                str2.getClass();
                aqmh3.a = i4 | 16;
                aqmh3.f = str2;
            }
            aqmh aqmh4 = (aqmh) o2.i();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz3 = (aqmz) aucf.b;
            aqmh4.getClass();
            aqmz3.g = aqmh4;
            aqmz3.a |= 32;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqna aqna = (aqna) o.b;
            aqmz aqmz4 = (aqmz) aucf.i();
            aqmz4.getClass();
            aqna.b = aqmz4;
            aqna.a |= 1;
            adhv.a((aqna) o.i());
        }
    }
}
