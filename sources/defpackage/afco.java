package defpackage;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: afco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afco implements afci {
    private static final auay d = auay.a(new byte[]{47});
    private static final auay e = auay.a(new byte[]{48});
    private static final auay f = auay.a(new byte[]{58});
    private static final auay g = auay.a(new byte[]{59});
    private static final afdc h;
    public final Map a = new HashMap();
    public final auay b;
    public volatile boolean c;
    private final awdn i;
    private final afcj j;
    private final afcv k;
    private final afco l;
    private final Map m = new HashMap();
    private final aeri n;
    private final awdn o;
    private final afca p;

    static {
        afdb a2 = afdc.a();
        a2.a((byte) 47);
        a2.a((byte) 48);
        a2.a((byte) 58);
        a2.a((byte) 59);
        h = a2.a();
    }

    public afco(afco afco, awdn awdn, afcj afcj, auay auay, auay auay2, afcv afcv, aeri aeri, awdn awdn2, afca afca) {
        this.i = awdn;
        this.j = afcj;
        this.l = afco;
        auay a2 = auay.a(h.a(auay2)).a(d);
        this.b = a2;
        this.k = afcv;
        this.n = aeri;
        this.o = awdn2;
        this.p = afca;
        if (afco != null) {
            synchronized (afco.b) {
                amrl.b(!afco.c, (Object) "Factory is closed");
                amrl.a(!afco.m.containsKey(a2), (Object) "Namespace already created");
                afco.m.put(a2, this);
            }
        }
    }

    static auay a(auay auay) {
        boolean z;
        if (auay.a(auay.a() - 1) == 58) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        return auay.a(0, auay.a() - 1).a(g);
    }

    private final void c() {
        if (!this.a.isEmpty()) {
            a(this.i, this.a.keySet(), "Close failed due to opened storages:");
            throw new IllegalStateException("Not every KeyValueStorage created with this factory is closed");
        } else if (!this.m.isEmpty()) {
            a(this.i, this.m.keySet(), "Close failed due to opened factories:");
            throw new IllegalStateException("Not every KeyValueStorageFactory created with this factory is closed");
        }
    }

    public final afci b(String str) {
        return new afco(this, this.i, this.j, this.b, auay.a(str), new afcv(this.i, this.j, this.n, this.o, this.p), this.n, this.o, this.p);
    }

    public final void close() {
        boolean z;
        synchronized (this.b) {
            amrl.b(!this.c, (Object) "Factory is closed");
            c();
            afco afco = this.l;
            if (afco != null) {
                auay auay = this.b;
                synchronized (afco.b) {
                    afco.m.remove(auay);
                }
            } else {
                afcj afcj = this.j;
                synchronized (afcj.e) {
                    if (afcj.h != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    amrl.b(z);
                    afcj.h = null;
                }
            }
            this.c = true;
        }
    }

    private static void a(awdn awdn, Set set, String str) {
        if (((pia) awdn.a()).a(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Iterator it = set.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                auay auay = (auay) it.next();
                if (i2 != 0) {
                    if (i2 >= 10) {
                        break;
                    }
                    sb.append(", ");
                } else {
                    sb.append(' ');
                }
                sb.append(auay.b(amqn.c));
                i2++;
            }
            if (i2 != set.size()) {
                sb.append("...");
            }
            ((pia) awdn.a()).a(sb.toString(), new Object[0]);
        }
    }

    public final afcv b() {
        amrl.b(!this.c, (Object) "Factory is closed");
        return this.k;
    }

    public final afch a(String str) {
        return new afcn(this.b.a(h.a(auay.a(str))).a(f), this, this.j, this.n, this.p);
    }

    public final void a() {
        synchronized (this.b) {
            boolean z = true;
            amrl.b(!this.c, (Object) "Factory is closed");
            c();
            try {
                LevelDb e2 = this.j.e();
                byte[] k2 = this.b.k();
                auay auay = this.b;
                if (auay.a(auay.a() - 1) != 47) {
                    z = false;
                }
                amrl.a(z);
                e2.deleteRange(k2, auay.a(0, auay.a() - 1).a(e).k());
            } catch (LevelDbException e3) {
                if (!this.n.f()) {
                    this.j.a((Exception) e3);
                } else if (afcj.a((Throwable) e3)) {
                    this.p.a();
                }
                throw new afdm("Error removing data from database", e3);
            }
        }
    }
}
