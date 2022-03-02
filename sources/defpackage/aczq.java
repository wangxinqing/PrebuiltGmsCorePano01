package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: aczq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczq extends aczl {
    public aczq(Context context, adbx adbx, ClientContext clientContext, String str, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, "FetchOverviewConfigOperation", aczg, bArr);
    }

    public final void a(Context context) {
        super.a(context);
        if (azrr.b()) {
            addd.a().a();
            return;
        }
        atyy atyy = (atyy) atyz.g.o();
        try {
            b();
            atyy.b(this.b, aubs.c());
            atzv atzv = ((atyz) atyy.b).e;
            if (atzv == null) {
                atzv = atzv.i;
            }
            aucd a = a(atzv);
            String c = c();
            atyh a2 = adhi.a(this.c, c);
            if (a2 != null) {
                if (atyy.c) {
                    atyy.c();
                    atyy.c = false;
                }
                atyz atyz = (atyz) atyy.b;
                a2.getClass();
                atyz.b = a2;
                atyz.a |= 1;
            }
            String a3 = a(((atyz) atyy.b).c);
            if (atyy.c) {
                atyy.c();
                atyy.c = false;
            }
            atyz atyz2 = (atyz) atyy.b;
            a3.getClass();
            atyz2.a |= 2;
            atyz2.c = a3;
            if (a(atyz2.c, c)) {
                adao a4 = a();
                adan a5 = a4.a();
                if (a5 != null) {
                    if (Status.a.equals(a5.a)) {
                        if (atyy.c) {
                            atyy.c();
                            atyy.c = false;
                        }
                        ((atyz) atyy.b).f = aucj.s();
                        atyy.a(a5.b);
                    }
                }
                atzu b = a4.b();
                if (b != null) {
                    if (a.c) {
                        a.c();
                        a.c = false;
                    }
                    atzv atzv2 = (atzv) a.b;
                    b.getClass();
                    atzv2.h = b;
                    atzv2.a |= 128;
                } else {
                    if (a.c) {
                        a.c();
                        a.c = false;
                    }
                    atzv atzv3 = (atzv) a.b;
                    atzv3.h = null;
                    atzv3.a &= -129;
                }
            }
            if (atyy.c) {
                atyy.c();
                atyy.c = false;
            }
            atyz atyz3 = (atyz) atyy.b;
            atzv atzv4 = (atzv) a.i();
            atzv4.getClass();
            atyz3.e = atzv4;
            atyz3.a |= 8;
            atza a6 = this.a.a(this.e, (atyz) atyy.i());
            atyi atyi = a6.b;
            if (atyi == null) {
                atyi = atyi.c;
            }
            adhi.a(atyi, this.c, c);
            a(0);
            this.d.b(Status.a, a6.k());
        } catch (eif e) {
            throw new nja(4504, (String) null);
        } catch (VolleyError e2) {
            throw a(e2);
        } catch (auda e3) {
            throw new nja(4503, (String) null);
        } catch (IOException e4) {
            throw new nja(4505, (String) null);
        } catch (adab e5) {
            throw new nja(10, (String) null);
        }
    }

    public final void a(Status status) {
        a(status.i);
        this.d.b(status, (byte[]) null);
    }
}
