package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: agyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyf {
    public final agyl a;
    public final aucd b;

    public agyf() {
        this(agyl.a);
    }

    public static agyf a(agyl agyl, int i, Long l, Long l2) {
        agyf agyf = new agyf(agyl);
        agyf.a(i);
        agyf.a();
        if (l != null) {
            agyf.a(l.longValue());
        } else if (i != 717) {
            String valueOf = String.valueOf(alzp.b(i));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("cannot have a null lastHeartbeatSeqNum for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        if (l2 != null) {
            aucd o = ambm.d.o();
            aucd o2 = ambn.c.o();
            long longValue = l2.longValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ambn ambn = (ambn) o2.b;
            ambn.a |= 1;
            ambn.b = longValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ambm ambm = (ambm) o.b;
            ambn ambn2 = (ambn) o2.i();
            ambn2.getClass();
            ambm.b = ambn2;
            ambm.a |= 4;
            agyf.a((ambm) o.i());
        } else if (i != 717) {
            String valueOf2 = String.valueOf(alzp.b(i));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("cannot have a null lastHeartbeatClientTimeUsec for ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }
        return agyf;
    }

    public final void b(long j) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzm alzm = (alzm) aucd.b;
        alzm alzm2 = alzm.g;
        alzm.a |= 16;
        alzm.c = j;
    }

    public agyf(agyf agyf) {
        this.a = agyf.a;
        alzm alzm = (alzm) agyf.b.i();
        aucd aucd = (aucd) alzm.c(5);
        aucd.a((aucj) alzm);
        this.b = aucd;
    }

    public agyf(agyl agyl) {
        this.b = alzm.g.o();
        this.a = agyl;
    }

    public static agyf a(agyl agyl, long j, long j2) {
        return a(agyl, 1154, Long.valueOf(j), Long.valueOf(j2));
    }

    public final void a() {
        long a2 = this.a.a();
        aucd aucd = this.b;
        aucd o = alzl.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        alzl alzl = (alzl) o.b;
        alzl.d = 1;
        alzl.a |= 4;
        aucd o2 = alzi.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        alzi alzi = (alzi) o2.b;
        alzi.a |= 1;
        alzi.b = a2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        alzl alzl2 = (alzl) o.b;
        alzi alzi2 = (alzi) o2.i();
        alzi2.getClass();
        alzl2.b = alzi2;
        alzl2.a |= 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzm alzm = (alzm) aucd.b;
        alzl alzl3 = (alzl) o.i();
        alzm alzm2 = alzm.g;
        alzl3.getClass();
        alzm.f = alzl3;
        alzm.a |= 2048;
    }

    public final void a(int i) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzm alzm = (alzm) aucd.b;
        alzm alzm2 = alzm.g;
        alzm.b = i - 1;
        alzm.a |= 2;
    }

    public final void a(long j) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzm alzm = (alzm) aucd.b;
        alzm alzm2 = alzm.g;
        alzm.a |= 512;
        alzm.e = j;
    }

    public final void a(ambm ambm) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        alzm alzm = (alzm) aucd.b;
        alzm alzm2 = alzm.g;
        ambm.getClass();
        alzm.d = ambm;
        alzm.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }
}
