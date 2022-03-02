package defpackage;

/* renamed from: aeyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aeyd implements amqy {
    private final aeyf a;

    public aeyd(aeyf aeyf) {
        this.a = aeyf;
    }

    public final Object a(Object obj) {
        aukp aukp;
        boolean z;
        boolean z2;
        long j;
        aeyf aeyf = this.a;
        aesx aesx = (aesx) obj;
        aeth a2 = aesx.a();
        aeye aeye = aeyf.a;
        int d = aesx.d();
        Long c = a2.c();
        Long b = aesx.b();
        int i = d - 1;
        if (d != 0) {
            String str = "null";
            if (i == 0 || i == 1) {
                if (c != null) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.a(z, (Object) "Absolute timestamp must be set for Override and TrustedTime modes!");
                aucd o = aukp.c.o();
                aucd o2 = aukn.c.o();
                long longValue = c.longValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aukn aukn = (aukn) o2.b;
                aukn.a |= 1;
                aukn.b = longValue;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aukp aukp2 = (aukp) o.b;
                aukn aukn2 = (aukn) o2.i();
                aukn2.getClass();
                aukp2.b = aukn2;
                aukp2.a = 1;
                aukp = (aukp) o.i();
            } else if (i == 2) {
                if (c == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                amrl.a(z2, (Object) "Absolute timestamp must be unset for ServerPolicyTime mode!");
                aucd o3 = aukp.c.o();
                aubo aubo = aubo.a;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aukp aukp3 = (aukp) o3.b;
                aubo.getClass();
                aukp3.b = aubo;
                aukp3.a = 3;
                aukp = (aukp) o3.i();
            } else if (i != 3) {
                if (d == 1) {
                    str = "OVERRIDE";
                } else if (d == 2) {
                    str = "TRUSTED_TIME";
                } else if (d == 3) {
                    str = "SERVER_POLICY_TIME";
                } else if (d == 4) {
                    str = "BEST_TIME";
                }
                StringBuilder sb = new StringBuilder(str.length() + 28);
                sb.append("Unsupported timestamp mode ");
                sb.append(str);
                sb.append("!");
                throw new AssertionError(sb.toString());
            } else {
                if (b == null) {
                    aeye.b++;
                }
                if (b != null) {
                    j = -(aeye.a - (b.longValue() * 1000));
                } else {
                    j = -(aeye.a + ((long) aeye.b));
                }
                aucd o4 = aukp.c.o();
                aucd o5 = auko.c.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                auko auko = (auko) o5.b;
                auko.a |= 1;
                auko.b = j;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aukp aukp4 = (aukp) o4.b;
                auko auko2 = (auko) o5.i();
                auko2.getClass();
                aukp4.b = auko2;
                aukp4.a = 2;
                aukp = (aukp) o4.i();
            }
            aucd o6 = aukq.f.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aukq aukq = (aukq) o6.b;
            aukp.getClass();
            aukq.e = aukp;
            aukq.a |= 8;
            if (a2.b() != null) {
                auay a3 = auay.a(a2.b());
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                aukq aukq2 = (aukq) o6.b;
                a3.getClass();
                aukq2.a |= 2;
                aukq2.c = a3;
            }
            if (a2.a() != null) {
                auay a4 = auay.a(a2.a());
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                aukq aukq3 = (aukq) o6.b;
                a4.getClass();
                aukq3.a |= 4;
                aukq3.d = a4;
            }
            aucd o7 = aukc.e.o();
            int c2 = aesx.c();
            int i2 = c2 - 1;
            if (c2 == 0) {
                throw null;
            } else if (i2 != 0) {
                if (c2 == 1) {
                    str = "WRITE";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 38);
                sb2.append("Unknown local Footprints change type ");
                sb2.append(str);
                sb2.append("!");
                throw new AssertionError(sb2.toString());
            } else {
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                aukc aukc = (aukc) o7.b;
                aukc.d = 2;
                aukc.a |= 1;
                aukq aukq4 = (aukq) o6.i();
                aukq4.getClass();
                aukc.c = aukq4;
                aukc.b = 4;
                return (aukc) o7.i();
            }
        } else {
            throw null;
        }
    }
}
