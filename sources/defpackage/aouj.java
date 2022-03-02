package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aouj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aouj {
    public final aoza a;

    public aouj(aoza aoza) {
        this.a = aoza;
    }

    public static final aouj a(aoza aoza) {
        b(aoza);
        return new aouj(aoza);
    }

    public static void b(aoza aoza) {
        if (aoza == null || aoza.b.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return aovc.a(this.a).toString();
    }

    public final aouj a() {
        if (this.a != null) {
            aoyy aoyy = (aoyy) aoza.c.o();
            aucx aucx = this.a.b;
            int size = aucx.size();
            int i = 0;
            while (i < size) {
                aoyz aoyz = (aoyz) aucx.get(i);
                aoyu aoyu = aoyz.a;
                if (aoyu == null) {
                    aoyu = aoyu.d;
                }
                int b = aoyt.b(aoyu.c);
                if (b == 0 || b != 4) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                String str = aoyu.a;
                auay auay = aoyu.b;
                aoud a2 = aovb.a(str, (Class) null);
                if (a2 instanceof aous) {
                    aous aous = (aous) a2;
                    try {
                        audx a3 = aous.a.a(auay);
                        aous.a.a(a3);
                        audx b2 = aous.a.b(a3);
                        aous.b.a(b2);
                        aucd o = aoyu.d.o();
                        String a4 = aous.b.a();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        a4.getClass();
                        ((aoyu) o.b).a = a4;
                        auay au = b2.au();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        au.getClass();
                        ((aoyu) o.b).b = au;
                        int d = aous.b.d();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        ((aoyu) o.b).c = aoyt.a(d);
                        aoyu aoyu2 = (aoyu) o.i();
                        aovb.a(aoyu2);
                        aucd o2 = aoyz.e.o();
                        o2.a((aucj) aoyz);
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aoyu2.getClass();
                        ((aoyz) o2.b).a = aoyu2;
                        aoyy.a((aoyz) o2.i());
                        i++;
                    } catch (auda e) {
                        throw new GeneralSecurityException("expected serialized proto of type ", e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
                    sb.append("manager for key type ");
                    sb.append(str);
                    sb.append(" is not a PrivateKeyManager");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            int i2 = this.a.a;
            if (aoyy.c) {
                aoyy.c();
                aoyy.c = false;
            }
            ((aoza) aoyy.b).a = i2;
            return new aouj((aoza) aoyy.i());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public final Object a(Class cls) {
        return aovb.a(aovb.a(this, cls));
    }

    public final void a(aowz aowz, aotx aotx) {
        aoza aoza = this.a;
        byte[] a2 = aotx.a(aoza.k(), new byte[0]);
        try {
            if (((aoza) aucj.a((aucj) aoza.c, aotx.b(a2, new byte[0]), aubs.b())).equals(aoza)) {
                aucd o = aoyo.c.o();
                auay a3 = auay.a(a2);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                a3.getClass();
                ((aoyo) o.b).a = a3;
                aozc a4 = aovc.a(aoza);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                a4.getClass();
                ((aoyo) o.b).b = a4;
                if (!aowz.a.putString(aowz.b, apcq.a(((aoyo) o.i()).k())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (auda e) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }
}
