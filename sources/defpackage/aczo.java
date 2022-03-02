package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.SettingState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aczo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczo extends aczl {
    private static final jjg k = jjg.a();
    private final List l = new ArrayList();

    public aczo(Context context, adbx adbx, ClientContext clientContext, String str, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, "CheckConsentOperation", aczg, bArr);
    }

    private final int a(atze atze) {
        if (atze.c.size() != 0) {
            aucx aucx = atze.c;
            int size = aucx.size();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                atzl atzl = (atzl) aucx.get(i);
                int a = atzq.a(atzl.c);
                if (a == 0 || a != 3) {
                    z = false;
                }
                List list = this.l;
                int i2 = atzl.b;
                int a2 = atzq.a(atzl.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                list.add(new SettingState(i2, a2 - 1));
            }
            if (z) {
                return 0;
            }
            if ((atze.a & 2) == 0) {
                return 4501;
            }
            atzd atzd = atze.d;
            if (atzd == null) {
                atzd = atzd.b;
            }
            return atzd.a ? 4500 : 4501;
        }
        ((anih) ((anih) k.b()).a("aczo", "a", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("retrieved empty setting states list");
        return 4505;
    }

    public final void a(Context context) {
        char c;
        atyp atyp;
        super.a(context);
        aucd o = atyw.j.o();
        try {
            b();
            o.b(this.b, aubs.c());
            boolean z = false;
            boolean z2 = false;
            for (Integer num : Collections.unmodifiableList(((atyw) o.b).d)) {
                if (num.equals(2)) {
                    z2 = true;
                }
                if (num.equals(15)) {
                    z = true;
                }
            }
            if (!(z ^ z2)) {
                atzv atzv = ((atyw) o.b).g;
                if (atzv == null) {
                    atzv = atzv.i;
                }
                aucd a = a(atzv);
                String a2 = a(((atyw) o.b).c);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atyw atyw = (atyw) o.b;
                a2.getClass();
                atyw.a |= 2;
                atyw.c = a2;
                aucd o2 = aqnm.c.o();
                auay a3 = auay.a(egl.a());
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqnm aqnm = (aqnm) o2.b;
                a3.getClass();
                aqnm.a |= 1;
                aqnm.b = a3;
                String encodeToString = Base64.encodeToString(((aqnm) o2.i()).k(), 10);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atyw atyw2 = (atyw) o.b;
                encodeToString.getClass();
                atyw2.a |= 32;
                atyw2.i = encodeToString;
                String str = atyw2.c;
                List unmodifiableList = Collections.unmodifiableList(atyw2.d);
                atzb atzb = (atzb) atzc.h.o();
                if (atzb.c) {
                    atzb.c();
                    atzb.c = false;
                }
                atzc atzc = (atzc) atzb.b;
                str.getClass();
                atzc.a |= 2;
                atzc.c = str;
                if (!atzc.e.a()) {
                    atzc.e = aucj.a(atzc.e);
                }
                auab.a((Iterable) unmodifiableList, (List) atzc.e);
                boolean isEmpty = unmodifiableList.isEmpty();
                if (atzb.c) {
                    atzb.c();
                    atzb.c = false;
                }
                atzc atzc2 = (atzc) atzb.b;
                atzc2.a |= 4;
                atzc2.d = isEmpty;
                String c2 = c();
                atyh a4 = adhi.a(this.c, c2);
                if (a4 != null) {
                    if (atzb.c) {
                        atzb.c();
                        atzb.c = false;
                    }
                    atzc atzc3 = (atzc) atzb.b;
                    a4.getClass();
                    atzc3.b = a4;
                    atzc3.a |= 1;
                }
                if (a(((atzc) atzb.b).c, c2)) {
                    adao a5 = a();
                    adan a6 = a5.a();
                    if (a6 != null && Status.a.equals(a6.a)) {
                        atzb.a(a6.b);
                    }
                    atzu b = a5.b();
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
                atzc atzc4 = (atzc) atzb.b;
                atzv atzv4 = (atzv) a.i();
                atzv4.getClass();
                atzc4.f = atzv4;
                atzc4.a |= 8;
                atze a7 = this.a.a(this.e, (atzc) atzb.i());
                atyi atyi = a7.b;
                if (atyi == null) {
                    atyi = atyi.c;
                }
                adhi.a(atyi, this.c, c2);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atyw atyw3 = (atyw) o.b;
                atzv atzv5 = (atzv) a.i();
                atzv5.getClass();
                atyw3.g = atzv5;
                atyw3.a |= 16;
                if (a7.c.size() == 0) {
                    ((anih) ((anih) k.b()).a("aczo", "a", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("retrieved empty setting states list");
                    c = 4505;
                } else {
                    boolean z3 = true;
                    for (atzl atzl : a7.c) {
                        int a8 = atzq.a(atzl.c);
                        if (a8 == 0 || a8 != 3) {
                            z3 = false;
                        }
                        List list = this.l;
                        int i = atzl.b;
                        int a9 = atzq.a(atzl.c);
                        if (a9 == 0) {
                            a9 = 1;
                        }
                        list.add(new SettingState(i, a9 - 1));
                    }
                    if (!z3) {
                        if ((a7.a & 2) != 0) {
                            atzd atzd = a7.d;
                            if (atzd == null) {
                                atzd = atzd.b;
                            }
                            if (atzd.a) {
                                c = 4500;
                            }
                        }
                        c = 4501;
                    } else {
                        c = 0;
                    }
                }
                if (c == 0) {
                    a(0);
                    this.d.a(Status.a, this.l);
                } else if (c == 4500) {
                    a(4500, true);
                    Context context2 = this.c;
                    String str2 = this.f;
                    atyw atyw4 = (atyw) o.i();
                    if ((a7.a & 4) != 0) {
                        atyp = a7.e;
                        if (atyp == null) {
                            atyp = atyp.c;
                        }
                    } else {
                        atyp = null;
                    }
                    Intent intent = new Intent();
                    intent.setClassName(context2, "com.google.android.gms.udc.ui.UdcConsentActivity");
                    intent.putExtra("UdcAccountName", str2);
                    new Bundle();
                    if (!(atyp == null || (atyp.a & 1) == 0)) {
                        atyo atyo = atyp.b;
                        if (atyo == null) {
                            atyo = atyo.d;
                        }
                        adgq.a(intent, "UdcLayoutOverwrites", (audx) atyo);
                    }
                    adgq.a(intent, "UdcConsentRequest", (audx) atyw4);
                    this.d.a(new Status(4500, "User consent is required", jhg.a(this.c, intent, 134217728)), this.l);
                } else if (c == 4501) {
                    a(4501, true);
                    this.d.a(new Status(4501, "Settings unavailable", (PendingIntent) null), this.l);
                } else {
                    throw new nja(4505, (String) null);
                }
            } else {
                throw new aczn("LR and LH must be requested together.ReportingApi only allows a combined optin.");
            }
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
        } catch (aczn e6) {
            throw new nja(10, e6.getMessage());
        }
    }

    public final void a(Status status) {
        a(status.i);
        this.d.a(status, (List) null);
    }
}
