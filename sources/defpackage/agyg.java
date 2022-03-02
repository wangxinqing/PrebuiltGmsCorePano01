package defpackage;

import com.google.android.libraries.rocket.impressions.Session;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyg {
    public final Object a = new Object();
    public final agym b;
    public final Session c;
    public final agyl d;

    public agyg(agyl agyl, agym agym, Session session) {
        this.d = agyl;
        if (agym != null) {
            this.b = agym;
            if (session != null) {
                this.c = session;
                return;
            }
            throw new IllegalArgumentException("session must be non-null");
        }
        throw new IllegalArgumentException("transport must be non-null");
    }

    public final void a() {
        a(agyf.a(this.d, 717, (Long) null, (Long) null));
    }

    public final void b(agyf agyf) {
        alzm alzm = (alzm) agyf.b.b;
        int i = alzm.a;
        if ((i & 2) == 0) {
            throw new IllegalStateException("must call setImpressionCode() before build()");
        } else if ((i & 16) != 0) {
            alzl alzl = alzm.f;
            if (alzl == null) {
                alzl = alzl.e;
            }
            int a2 = alzk.a(alzl.d);
            if (a2 != 0) {
                int i2 = 1;
                if (a2 != 1) {
                    alzl alzl2 = ((alzm) agyf.b.b).f;
                    if (alzl2 == null) {
                        alzl2 = alzl.e;
                    }
                    int a3 = alzk.a(alzl2.d);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i3 = a3 - 1;
                    if (i3 == 1) {
                        alzl alzl3 = ((alzm) agyf.b.b).f;
                        if (alzl3 == null) {
                            alzl3 = alzl.e;
                        }
                        alzi alzi = alzl3.b;
                        if (alzi == null) {
                            alzi = alzi.c;
                        }
                        if ((alzi.a & 1) == 0) {
                            throw new IllegalStateException("instant timing without timestamp");
                        }
                    } else if (i3 != 2) {
                        alzl alzl4 = ((alzm) agyf.b.b).f;
                        if (alzl4 == null) {
                            alzl4 = alzl.e;
                        }
                        int a4 = alzk.a(alzl4.d);
                        if (a4 != 0) {
                            i2 = a4;
                        }
                        String valueOf = String.valueOf(alzk.b(i2));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                        sb.append("unknown timing type ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    } else {
                        alzl alzl5 = ((alzm) agyf.b.b).f;
                        if (alzl5 == null) {
                            alzl5 = alzl.e;
                        }
                        alzh alzh = alzl5.c;
                        if (alzh == null) {
                            alzh = alzh.d;
                        }
                        if ((alzh.a & 1) != 0) {
                            alzl alzl6 = ((alzm) agyf.b.b).f;
                            if (alzl6 == null) {
                                alzl6 = alzl.e;
                            }
                            alzh alzh2 = alzl6.c;
                            if (alzh2 == null) {
                                alzh2 = alzh.d;
                            }
                            if ((alzh2.a & 2) == 0) {
                                throw new IllegalStateException("elapsed timing without end timestamp");
                            }
                        } else {
                            throw new IllegalStateException("elapsed timing without start timestamp");
                        }
                    }
                    this.c.b.add((alzm) agyf.b.i());
                    Session session = this.c;
                    if (session.b.size() != 0) {
                        aucd o = alzn.f.o();
                        alzu alzu = session.d;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        alzn alzn = (alzn) o.b;
                        alzu.getClass();
                        alzn.d = alzu;
                        alzn.a = 2 | alzn.a;
                        alzs alzs = (alzs) session.j.i();
                        alzs.getClass();
                        alzn.c = alzs;
                        alzn.a = 1 | alzn.a;
                        alzq alzq = session.e;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        alzn alzn2 = (alzn) o.b;
                        alzq.getClass();
                        alzn2.e = alzq;
                        alzn2.a |= 4;
                        ArrayList arrayList = session.b;
                        if (!alzn2.b.a()) {
                            alzn2.b = aucj.a(alzn2.b);
                        }
                        auab.a((Iterable) arrayList, (List) alzn2.b);
                        session.b.clear();
                        this.b.b((alzn) o.i());
                        return;
                    }
                    throw new IllegalStateException("cannot flush empty impression queue");
                }
            }
            int a5 = alzp.a(((alzm) agyf.b.b).b);
            if (a5 == 0) {
                a5 = 1005;
            }
            String valueOf2 = String.valueOf(alzp.b(a5));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 64);
            sb2.append("cannot build an impression without any timing information: code ");
            sb2.append(valueOf2);
            throw new IllegalStateException(sb2.toString());
        } else {
            throw new IllegalStateException("must call setSequenceNumber() before build()");
        }
    }

    public final void a(agyf agyf) {
        Long l;
        Session session = this.c;
        alzl alzl = ((alzm) agyf.b.b).f;
        if (alzl == null) {
            alzl = alzl.e;
        }
        int a2 = alzk.a(alzl.d);
        int i = 1;
        if (a2 != 0 && a2 == 2) {
            alzl alzl2 = ((alzm) agyf.b.b).f;
            if (alzl2 == null) {
                alzl2 = alzl.e;
            }
            alzi alzi = alzl2.b;
            if (alzi == null) {
                alzi = alzi.c;
            }
            if ((alzi.a & 1) != 0) {
                alzl alzl3 = ((alzm) agyf.b.b).f;
                if (alzl3 == null) {
                    alzl3 = alzl.e;
                }
                alzi alzi2 = alzl3.b;
                if (alzi2 == null) {
                    alzi2 = alzi.c;
                }
                l = Long.valueOf(alzi2.b);
            } else {
                l = null;
            }
            long longValue = l.longValue();
            long j = session.f;
            session.g = j;
            session.h = longValue;
            session.f = 1 + j;
            agyf.b(j);
            b(agyf);
            return;
        }
        alzl alzl4 = ((alzm) agyf.b.b).f;
        if (alzl4 == null) {
            alzl4 = alzl.e;
        }
        int a3 = alzk.a(alzl4.d);
        if (a3 != 0) {
            i = a3;
        }
        String valueOf = String.valueOf(alzk.b(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("not an instant timing impression; instead: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(agyj agyj, String str) {
        agyj agyj2 = this.c.c;
        if (agyj2 != agyj) {
            String valueOf = String.valueOf(agyj2);
            StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(valueOf).length());
            sb.append("cannot ");
            sb.append(str);
            sb.append(" in a ");
            sb.append(valueOf);
            sb.append(" session");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean b() {
        Session session = this.c;
        long b2 = agyl.b();
        long j = session.i;
        if (j <= b2 && b2 - j < Session.a) {
            return false;
        }
        agyl agyl = this.d;
        Session session2 = this.c;
        a(agyf.a(agyl, 692, Long.valueOf(session2.g), Long.valueOf(session2.h)));
        this.c.a(this.d);
        a();
        this.c.c = agyj.IN_PROGRESS;
        return true;
    }
}
