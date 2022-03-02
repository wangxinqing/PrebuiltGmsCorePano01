package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: adfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adfa {
    public static final jjg a = jjg.a();

    public static int a(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 3;
    }

    public static int b(int i) {
        if (i == R.string.udc_auth_error) {
            return 3;
        }
        if (i == R.string.udc_generic_error) {
            return 2;
        }
        if (i == R.string.udc_network_error) {
            return 4;
        }
        if (i == R.string.udc_server_error) {
            return 5;
        }
        if (i != R.string.udc_network_error_write) {
            return i == R.string.udc_setting_write_error ? 6 : 1;
        }
        return 7;
    }

    public static aqms a(atyw atyw, atyx atyx, ConsentFlowConfig consentFlowConfig, int i) {
        aucd o = aqms.m.o();
        if (atyw == null) {
            return (aqms) o.i();
        }
        if ((atyw.a & 16) != 0) {
            atzv atzv = atyw.g;
            if (atzv == null) {
                atzv = atzv.i;
            }
            int i2 = atzv.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqms aqms = (aqms) o.b;
            aqms.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aqms.h = i2;
            atzv atzv2 = atyw.g;
            if (atzv2 == null) {
                atzv2 = atzv.i;
            }
            if ((atzv2.a & 8) != 0) {
                atzv atzv3 = atyw.g;
                if (atzv3 == null) {
                    atzv3 = atzv.i;
                }
                String str = atzv3.d;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqms aqms2 = (aqms) o.b;
                str.getClass();
                aqms2.a |= 512;
                aqms2.i = str;
            }
            atzv atzv4 = atyw.g;
            if (atzv4 == null) {
                atzv4 = atzv.i;
            }
            if ((atzv4.a & 1) != 0) {
                atzv atzv5 = atyw.g;
                if (atzv5 == null) {
                    atzv5 = atzv.i;
                }
                String str2 = atzv5.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqms aqms3 = (aqms) o.b;
                str2.getClass();
                aqms3.a |= 2048;
                aqms3.k = str2;
            }
        }
        boolean a2 = a(atyw.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqms aqms4 = (aqms) o.b;
        aqms4.a |= 1024;
        aqms4.j = a2;
        atyv atyv = atyv.UNKNOWN;
        atyv a3 = atyv.a(atyw.f);
        if (a3 == null) {
            a3 = atyv.UNKNOWN;
        }
        int ordinal = a3.ordinal();
        int i3 = 3;
        int[] iArr = null;
        if (ordinal == 1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqms aqms5 = (aqms) o.b;
            aqms5.b = 4;
            aqms5.a |= 1;
            aqlu aqlu = (aqlu) aqlv.h.o();
            if (atyw.d.size() != 0) {
                aqlu.a(atyw.d);
            }
            if (!(atyx == null || atyx.i.size() == 0)) {
                iArr = new int[atyx.i.size()];
                aucx aucx = atyx.i;
                int size = aucx.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    atzl atzl = ((atzm) aucx.get(i5)).b;
                    if (atzl == null) {
                        atzl = atzl.e;
                    }
                    iArr[i4] = atzl.b;
                    i4++;
                }
            }
            if (iArr != null) {
                aqlu.b(aoog.b(iArr));
            }
            int i6 = consentFlowConfig.d;
            if (i6 == 0) {
                i3 = 2;
            } else if (i6 == 1) {
                i3 = 4;
            } else if (i6 != 2) {
                i3 = i6 != 4 ? i6 != 5 ? i6 != 6 ? 1 : 7 : 6 : 5;
            }
            if (aqlu.c) {
                aqlu.c();
                aqlu.c = false;
            }
            aqlv aqlv = (aqlv) aqlu.b;
            aqlv.d = i3 - 1;
            int i7 = aqlv.a | 1;
            aqlv.a = i7;
            boolean z = consentFlowConfig.c;
            int i8 = i7 | 2;
            aqlv.a = i8;
            aqlv.e = z;
            boolean z2 = consentFlowConfig.b;
            int i9 = i8 | 4;
            aqlv.a = i9;
            aqlv.f = z2;
            boolean z3 = consentFlowConfig.a;
            aqlv.a = i9 | 8;
            aqlv.g = z3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqms aqms6 = (aqms) o.b;
            aqlv aqlv2 = (aqlv) aqlu.i();
            aqlv2.getClass();
            aqms6.e = aqlv2;
            aqms6.a |= 32;
        } else if (ordinal != 2) {
            anih anih = (anih) ((anih) a.c()).a("adfa", "a", 127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            atyv a4 = atyv.a(atyw.f);
            if (a4 == null) {
                a4 = atyv.UNKNOWN;
            }
            anih.a("Invalid ViewType: %s", (Object) a4);
            return null;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqms aqms7 = (aqms) o.b;
            aqms7.b = 3;
            aqms7.a |= 1;
            aucd o2 = aqly.d.o();
            int a5 = atzq.a(atyw.e);
            if (a5 == 0) {
                a5 = 1;
            }
            int i10 = a5 - 1;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqly aqly = (aqly) o2.b;
            aqly.a |= 2;
            aqly.c = i10;
            if (atyw.d.size() > 0) {
                int c = atyw.d.c(0);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqly aqly2 = (aqly) o2.b;
                aqly2.a |= 1;
                aqly2.b = c;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqms aqms8 = (aqms) o.b;
            aqly aqly3 = (aqly) o2.i();
            aqly3.getClass();
            aqms8.d = aqly3;
            aqms8.a |= 16;
        }
        int a6 = a(i);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqms aqms9 = (aqms) o.b;
        aqms9.c = a6 - 1;
        aqms9.a |= 2;
        return (aqms) o.i();
    }

    public static boolean a(String str) {
        return str != null && !str.isEmpty() && !str.equalsIgnoreCase("me");
    }
}
