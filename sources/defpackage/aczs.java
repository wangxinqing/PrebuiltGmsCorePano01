package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: aczs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczs extends aczl {
    public aczs(Context context, adbx adbx, ClientContext clientContext, String str, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, "FetchSettingsOperation", aczg, bArr);
    }

    public final void a(Context context) {
        super.a(context);
        atzb atzb = (atzb) atzc.h.o();
        try {
            b();
            atzb.b(this.b, aubs.c());
            atzv atzv = ((atzc) atzb.b).f;
            if (atzv == null) {
                atzv = atzv.i;
            }
            aucd a = a(atzv);
            String c = c();
            atyh a2 = adhi.a(context, c);
            if (a2 != null) {
                if (atzb.c) {
                    atzb.c();
                    atzb.c = false;
                }
                atzc atzc = (atzc) atzb.b;
                a2.getClass();
                atzc.b = a2;
                atzc.a |= 1;
            }
            String a3 = a(((atzc) atzb.b).c);
            if (atzb.c) {
                atzb.c();
                atzb.c = false;
            }
            atzc atzc2 = (atzc) atzb.b;
            a3.getClass();
            atzc2.a |= 2;
            atzc2.c = a3;
            if (a(atzc2.c, c)) {
                adao a4 = a();
                adan a5 = a4.a();
                if (a5 != null) {
                    if (Status.a.equals(a5.a)) {
                        if (atzb.c) {
                            atzb.c();
                            atzb.c = false;
                        }
                        ((atzc) atzb.b).g = aucj.s();
                        atzb.a(a5.b);
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
            if (atzb.c) {
                atzb.c();
                atzb.c = false;
            }
            atzc atzc3 = (atzc) atzb.b;
            atzv atzv4 = (atzv) a.i();
            atzv4.getClass();
            atzc3.f = atzv4;
            atzc3.a |= 8;
            atze a6 = this.a.a(this.e, (atzc) atzb.i());
            atyi atyi = a6.b;
            if (atyi == null) {
                atyi = atyi.c;
            }
            adhi.a(atyi, this.c, c);
            a(0);
            this.d.a(Status.a, a6.k());
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
        this.d.a(status, (byte[]) null);
    }
}
