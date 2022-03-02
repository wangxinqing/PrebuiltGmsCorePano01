package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cbv extends bwp implements Response.Listener, Response.ErrorListener {
    public final Context c;
    public final bsz d;
    public final long e;
    private final int f = ((int) awuz.a.a().u());
    private final String g;
    private final String h;
    private final int i;
    private final audx j;
    private final cla k;
    private final String l;
    private long o;
    private long p;
    private int q;
    private final int r;

    protected cbv(Context context, String str, bsz bsz, String str2, int i2, int i3, audx audx, long j2, cbm cbm, but but, String str3) {
        super(str);
        this.c = context;
        iva.a((Object) str);
        this.g = str;
        iva.a((Object) bsz);
        this.d = bsz;
        iva.a((Object) str2);
        this.h = str2;
        this.i = i2;
        this.r = i3;
        iva.a((Object) audx);
        this.j = audx;
        this.k = cbm != null ? new cla(cbm, but) : null;
        this.q = this.f;
        this.l = str3;
        this.e = j2;
    }

    private final void a(int i2, int i3) {
        b(i2, i3);
        cla cla = this.k;
        if (cla != null) {
            cla.a((cky) new cbt(i3));
        }
    }

    private final cbj b(String str) {
        return new cbj(this.c, str);
    }

    /* access modifiers changed from: protected */
    public abstract atqk a(audx audx);

    /* access modifiers changed from: protected */
    public abstract audx c();

    public final void onErrorResponse(VolleyError volleyError) {
        int i2;
        int i3;
        int i4;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            i2 = networkResponse.statusCode;
        } else {
            i2 = -1;
        }
        anih anih = (anih) bxk.a.b();
        anih.a((Throwable) volleyError);
        ((anih) anih.a("cbv", "onErrorResponse", 328, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BaseServerTask] Server task (%s) got error statusCode=%s.", (Object) this.g, i2);
        NetworkResponse networkResponse2 = volleyError.networkResponse;
        if (networkResponse2 != null) {
            int i5 = networkResponse2.statusCode;
            i3 = i5 != 401 ? i5 != 403 ? i5 >= 500 ? 5 : 6 : 12 : 4;
        } else {
            i3 = -1;
        }
        if (i3 != 4 || (i4 = this.q) <= 0) {
            a(1, i3, (audx) null);
            return;
        }
        this.q = i4 - 1;
        ((anih) ((anih) bxk.a.c()).a("cbv", "a", 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BaseServerTask] Task(%s) invalid auth token - retrying (num retries remaining=%s)", (Object) this.g, this.q);
        a(a((String) null));
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        audx audx = (audx) obj;
        int i2 = 1;
        int i3 = 0;
        new Object[1][0] = this.g;
        new Object[1][0] = audx;
        atqk a = a(audx);
        if (a == null) {
            ((anih) ((anih) bxk.a.b()).a("cbv", "b", 308, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BaseServerTask] FATAL: No header received from server for task: %s", (Object) this.g);
            a(1, 2, audx);
            return;
        }
        atqs atqs = a.a;
        if (atqs == null) {
            atqs = atqs.b;
        }
        int a2 = atqu.a(atqs.a);
        if (a2 == 0) {
            a2 = 1;
        }
        atqs atqs2 = a.a;
        if (atqs2 == null) {
            atqs2 = atqs.b;
        }
        if (atqs2 != null) {
            int a3 = atqu.a(atqs2.a);
            if (a3 != 0) {
                i2 = a3;
            }
            int i4 = i2 - 2;
            if (i4 == -1) {
                i3 = 2;
            } else if (i4 != 0) {
                i3 = i4 != 201 ? i4 != 402 ? -1 : 11 : 3;
            }
        } else {
            i3 = -1;
        }
        a(a2, i3, audx);
    }

    private final void b(int i2, int i3) {
        int i4;
        long b = cbi.i().b();
        btx G = cbi.G();
        int i5 = this.r;
        if (!this.d.b()) {
            i4 = 2;
        } else {
            i4 = 3;
        }
        int i6 = i2 - 2;
        long j2 = this.p;
        long j3 = -1;
        if (j2 != -1) {
            j3 = this.o - j2;
        }
        long j4 = b - this.o;
        int i7 = this.f - this.q;
        aucd o2 = atpw.i.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atpw atpw = (atpw) o2.b;
        int i8 = i5 - 1;
        if (i5 != 0) {
            atpw.b = i8;
            int i9 = atpw.a | 1;
            atpw.a = i9;
            atpw.c = i4 - 1;
            int i10 = i9 | 2;
            atpw.a = i10;
            int i11 = i10 | 4;
            atpw.a = i11;
            atpw.d = i6;
            int i12 = i11 | 8;
            atpw.a = i12;
            atpw.e = i3;
            int i13 = i12 | 16;
            atpw.a = i13;
            atpw.f = j3;
            int i14 = i13 | 32;
            atpw.a = i14;
            atpw.g = j4;
            atpw.a = i14 | 64;
            atpw.h = i7;
            atpw atpw2 = (atpw) o2.i();
            aucd b2 = btx.b();
            if (b2.c) {
                b2.c();
                b2.c = false;
            }
            jud jud = (jud) b2.b;
            jud jud2 = jud.i;
            atpw2.getClass();
            jud.f = atpw2;
            jud.a |= 16;
            G.a((jud) b2.i(), 5);
            return;
        }
        throw null;
    }

    private final void a(int i2, int i3, audx audx) {
        if (i3 == 0) {
            b(i2, 0);
            cla cla = this.k;
            if (cla != null) {
                cla.a((cky) new cbu(audx));
                return;
            }
            return;
        }
        a(i2, i3);
    }

    private final boolean a(int i2) {
        int i3;
        if (i2 != 4 || (i3 = this.q) <= 0) {
            return false;
        }
        this.q = i3 - 1;
        ((anih) ((anih) bxk.a.c()).a("cbv", "a", 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BaseServerTask] Task(%s) invalid auth token - retrying (num retries remaining=%s)", (Object) this.g, this.q);
        a(a((String) null));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long j2;
        String str;
        ClientContext clientContext;
        String str2;
        new Object[1][0] = this.g;
        this.o = cbi.i().b();
        cbl w = cbi.w();
        int i2 = this.r;
        int i3 = i2 - 1;
        if (i2 != 0) {
            Long l2 = (Long) w.c.get(i3);
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = -1;
            }
            this.p = j2;
            cbl w2 = cbi.w();
            int i4 = this.r;
            int i5 = i4 - 1;
            if (i4 != 0) {
                w2.c.put(i5, Long.valueOf(cbi.i().b()));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    audx c2 = c();
                    new Object[1][0] = c2;
                    String str3 = this.l;
                    if (str3 == null) {
                        str = this.c.getPackageName();
                    } else {
                        str = str3;
                    }
                    if (this.d.b()) {
                        Account account = null;
                        clientContext = new ClientContext(Process.myUid(), account, account, str, str);
                    } else {
                        int myUid = Process.myUid();
                        String str4 = this.d.b;
                        clientContext = new ClientContext(myUid, str4, str4, str, str);
                        clientContext.a(new String[]{awuz.a.a().aH()});
                    }
                    if (!this.d.b()) {
                        cbj b = b((String) null);
                        String str5 = this.h;
                        byte[] k2 = c2.k();
                        audx audx = this.j;
                        int i6 = this.i;
                        String b2 = b.b(clientContext);
                        String c3 = b.c(clientContext);
                        if (b2 != null) {
                            HashMap a = b.a(b.i, clientContext);
                            int a2 = iyn.a(1, (Map) a);
                            String a3 = b.a(b.d, str5);
                            int i7 = clientContext.b;
                            b.h = i7;
                            b.b(b.a(a2, a3, k2, audx, b2, c3, this, this, a, i6, i7), b2);
                            return;
                        }
                        onErrorResponse(new VolleyError("Unable to obtain auth token - is the device online?"));
                        return;
                    }
                    String str6 = this.l;
                    if (str6 != null) {
                        str2 = jhg.a(this.c, str6, "com.google.android.awareness.API_KEY");
                    } else {
                        str2 = "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk";
                    }
                    b(str2).a(clientContext, this.h, c2.k(), (Object) this.j, (Response.Listener) this, (Response.ErrorListener) this);
                    return;
                }
                long j3 = this.e;
                if (j3 > 0) {
                    Object[] objArr = {this.g, Long.valueOf(j3)};
                    cbs cbs = cbi.w().b;
                    if (!cbs.c) {
                        cbs.a.add(new cbr(cbs, this, cbi.i().b() + this.e));
                        return;
                    }
                    new Object[1][0] = this;
                    b();
                    return;
                }
                b();
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void b() {
        String str;
        anih anih = (anih) ((anih) bxk.a.b()).a("cbv", "b", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        if (this.e <= 0) {
            str = "";
        } else {
            str = "expired";
        }
        anih.a("[BaseServerTask] Failed network request due to no network connectivity: %s", (Object) str);
        a(1, 1);
    }

    public final void b(audx audx) {
        int i2 = 1;
        int i3 = 0;
        new Object[1][0] = this.g;
        new Object[1][0] = audx;
        atqk a = a(audx);
        if (a == null) {
            ((anih) ((anih) bxk.a.b()).a("cbv", "b", 308, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BaseServerTask] FATAL: No header received from server for task: %s", (Object) this.g);
            a(1, 2, audx);
            return;
        }
        atqs atqs = a.a;
        if (atqs == null) {
            atqs = atqs.b;
        }
        int a2 = atqu.a(atqs.a);
        if (a2 == 0) {
            a2 = 1;
        }
        atqs atqs2 = a.a;
        if (atqs2 == null) {
            atqs2 = atqs.b;
        }
        if (atqs2 != null) {
            int a3 = atqu.a(atqs2.a);
            if (a3 != 0) {
                i2 = a3;
            }
            int i4 = i2 - 2;
            if (i4 == -1) {
                i3 = 2;
            } else if (i4 != 0) {
                i3 = i4 != 201 ? i4 != 402 ? -1 : 11 : 3;
            }
        } else {
            i3 = -1;
        }
        a(a2, i3, audx);
    }
}
