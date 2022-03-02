package defpackage;

import android.util.Pair;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: afcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afcn implements afch {
    private final afco a;
    private final afcj b;
    private final auay c;
    private final byte[] d;
    private final aeri e;
    private boolean f;
    private final afca g;

    public afcn(auay auay, afco afco, afcj afcj, aeri aeri, afca afca) {
        this.a = afco;
        this.b = afcj;
        this.c = auay;
        this.d = afco.a(auay).k();
        this.e = aeri;
        this.g = afca;
        synchronized (afco.b) {
            amrl.b(!afco.c, (Object) "Factory is closed");
            amrl.a(!afco.a.containsKey(auay), (Object) "Storage already created");
            afco.a.put(auay, this);
        }
    }

    private final afdm a(String str, Exception exc) {
        if (!this.e.f()) {
            this.b.a(exc);
        } else if (afcj.a((Throwable) exc)) {
            this.g.a();
        }
        return new afdm(str, exc);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [afcr, afdo] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.afdo r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof defpackage.afcs
            if (r0 == 0) goto L_0x000b
            afcs r2 = (defpackage.afcs) r2
            afcv r2 = r2.a()
            goto L_0x000f
        L_0x000b:
            afcv r2 = r2.a()
        L_0x000f:
            afcv r0 = r1.a()
            if (r2 != r0) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            java.lang.String r0 = "Using a transaction from a wrong namespace"
            defpackage.amrl.a((boolean) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcn.b(afdo):void");
    }

    public final void close() {
        amrl.b(!this.f, (Object) "Storage is closed");
        afco afco = this.a;
        auay auay = this.c;
        synchronized (afco.b) {
            afco.a.remove(auay);
        }
        this.f = true;
    }

    private final void a(afdp afdp) {
        boolean z = true;
        amrl.a(true, (Object) "Transaction is not a write transaction for LevelDB storage");
        if (((afcq) afdp).f != a()) {
            z = false;
        }
        amrl.a(z, (Object) "Using a transaction from a wrong namespace");
    }

    private final byte[] b(byte[] bArr) {
        return Arrays.copyOfRange(bArr, this.c.a(), bArr.length);
    }

    public final /* bridge */ /* synthetic */ Collection b(afdo afdo, auay auay) {
        LevelDb.Iterator it;
        if (this.e.C()) {
            ArrayList arrayList = new ArrayList();
            a(afdo, auay, (afcg) new afcl(arrayList));
            return arrayList;
        }
        b(afdo);
        amrl.b(!this.f, (Object) "Storage is closed");
        amrl.a((Object) auay);
        byte[] bArr = this.d;
        ArrayList arrayList2 = new ArrayList();
        try {
            it = this.b.e().iterator();
            Comparator comparator = aooo.b;
            it.seek(a(auay));
            while (it.isValid() && comparator.compare(it.key(), bArr) < 0) {
                arrayList2.add(Pair.create(auay.a(b(it.key())), auay.a(it.value())));
                it.next();
            }
            if (it == null) {
                return arrayList2;
            }
            it.close();
            return arrayList2;
        } catch (Exception e2) {
            throw a("Read range error", e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private final byte[] a(auay auay) {
        byte[] bArr = new byte[(this.c.a() + auay.a())];
        this.c.a(bArr, 0);
        auay.a(bArr, this.c.a());
        return bArr;
    }

    private final byte[] a(byte[] bArr) {
        int a2 = this.c.a();
        int length = bArr.length;
        byte[] bArr2 = new byte[(a2 + length)];
        this.c.a(bArr2, 0);
        System.arraycopy(bArr, 0, bArr2, this.c.a(), length);
        return bArr2;
    }

    public final afcv a() {
        amrl.b(!this.f, (Object) "Storage is closed");
        return this.a.b();
    }

    public final auay a(afdo afdo, auay auay) {
        byte[] a2 = a(afdo, auay.k());
        if (a2 != null) {
            return auay.a(a2);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Collection a(afdo afdo, byte[] bArr, byte[] bArr2) {
        ArrayList arrayList;
        LevelDb.Iterator it;
        if (this.e.C()) {
            arrayList = new ArrayList();
            afcm afcm = new afcm(arrayList);
            b(afdo);
            amrl.b(!this.f, (Object) "Storage is closed");
            amrl.a((Object) bArr);
            byte[] a2 = bArr2 == null ? this.d : a(bArr2);
            LevelDb.Iterator it2 = this.b.e().iterator();
            try {
                Comparator comparator = aooo.b;
                it2.seek(a(bArr));
                while (true) {
                    if (!it2.isValid() || comparator.compare(it2.key(), a2) >= 0) {
                        if (it2 != null) {
                            it2.close();
                            return arrayList;
                        }
                    } else if (afcm.a(b(it2.key()), it2.value())) {
                        it2.next();
                    } else if (it2 != null) {
                        it2.close();
                        return arrayList;
                    }
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            b(afdo);
            amrl.b(!this.f, (Object) "Storage is closed");
            amrl.a((Object) bArr);
            byte[] a3 = bArr2 == null ? this.d : a(bArr2);
            arrayList = new ArrayList();
            try {
                it = this.b.e().iterator();
                Comparator comparator2 = aooo.b;
                it.seek(a(bArr));
                while (it.isValid() && comparator2.compare(it.key(), a3) < 0) {
                    arrayList.add(Pair.create(b(it.key()), it.value()));
                    it.next();
                }
                if (it != null) {
                    it.close();
                }
            } catch (Exception e2) {
                throw a("Read range error", e2);
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        }
        return arrayList;
        throw th;
        throw th;
    }

    public final void b(afdp afdp, auay auay, auay auay2) {
        b(afdp, auay.k(), auay2 != null ? auay2.k() : null);
    }

    public final void b(afdp afdp, byte[] bArr, byte[] bArr2) {
        LevelDb.Iterator it;
        amrl.b(!this.f, (Object) "Storage is closed");
        amrl.a((Object) bArr);
        byte[] a2 = a(bArr);
        byte[] a3 = bArr2 == null ? this.d : a(bArr2);
        a(afdp);
        afcu afcu = (afcu) afdp;
        amrl.b(!afcu.a, (Object) "Transaction is closed");
        amrl.b(!afcu.k, (Object) "Trying to modify after setSuccessful()");
        synchronized (afcu.g) {
            try {
                it = ((afcu) afdp).l.c.e().iterator();
                it.seek(a2);
                while (it.isValid() && ((afcu) afdp).i.compare(it.key(), a3) < 0) {
                    ((afcu) afdp).h.delete(it.key());
                    ((afcu) afdp).j.remove(it.key());
                    it.next();
                }
                if (((afcu) afdp).i.compare(a2, a3) < 0) {
                    for (byte[] bArr3 : ((afcu) afdp).j.subSet(a2, true, a3, false)) {
                        ((afcu) afdp).h.delete(bArr3);
                        ((afcu) afdp).j.remove(bArr3);
                    }
                }
                if (it != null) {
                    it.close();
                }
            } catch (Exception e2) {
                ((pia) ((afcu) afdp).l.b.a()).e("Delete range error", new Object[0]);
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        return;
        throw th;
    }

    public final void a(afdo afdo, auay auay, afcg afcg) {
        b(afdo);
        amrl.b(!this.f, (Object) "Storage is closed");
        amrl.a((Object) auay);
        byte[] bArr = this.d;
        LevelDb.Iterator it = this.b.e().iterator();
        try {
            Comparator comparator = aooo.b;
            it.seek(a(auay));
            while (it.isValid() && comparator.compare(it.key(), bArr) < 0) {
                if (afcg.a(auay.a(b(it.key())), auay.a(it.value()))) {
                    it.next();
                } else if (it != null) {
                    it.close();
                    return;
                } else {
                    return;
                }
            }
            if (it != null) {
                it.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(afdp afdp, auay auay) {
        amrl.b(!this.f, (Object) "Storage is closed");
        amrl.a((Object) auay);
        a(afdp);
        byte[] a2 = a(auay);
        afcu afcu = (afcu) afdp;
        amrl.b(!afcu.a, (Object) "Transaction is closed");
        amrl.b(!afcu.k, (Object) "Trying to modify after setSuccessful()");
        synchronized (afcu.g) {
            ((afcu) afdp).h.delete(a2);
            ((afcu) afdp).j.remove(a2);
        }
    }

    public final void a(afdp afdp, auay auay, auay auay2) {
        a(afdp, auay.k(), auay2.k());
    }

    public final void a(afdp afdp, byte[] bArr, byte[] bArr2) {
        amrl.b(!this.f, (Object) "Storage is closed");
        amrl.a((Object) bArr);
        amrl.a((Object) bArr2);
        a(afdp);
        byte[] a2 = a(bArr);
        afcu afcu = (afcu) afdp;
        amrl.b(!afcu.a, (Object) "Transaction is closed");
        amrl.b(!afcu.k, (Object) "Trying to modify after setSuccessful()");
        synchronized (afcu.g) {
            ((afcu) afdp).h.put(a2, bArr2);
            ((afcu) afdp).j.add(a2);
        }
    }

    public final boolean a(afdo afdo) {
        LevelDb.Iterator it;
        b(afdo);
        boolean z = true;
        amrl.b(!this.f, (Object) "Storage is closed");
        try {
            it = this.b.e().iterator();
            it.seek(this.c.k());
            if (it.isValid() && aooo.b.compare(it.key(), this.d) < 0) {
                z = false;
            }
            if (it != null) {
                it.close();
            }
            return z;
        } catch (Exception e2) {
            throw a("Empty status resolution error", e2);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final byte[] a(afdo afdo, byte[] bArr) {
        b(afdo);
        amrl.b(!this.f, (Object) "Storage is closed");
        amrl.a((Object) bArr);
        try {
            return this.b.e().get(a(bArr));
        } catch (LevelDbException e2) {
            String valueOf = String.valueOf(Arrays.toString(bArr));
            throw a(valueOf.length() == 0 ? new String("Error getting value for key ") : "Error getting value for key ".concat(valueOf), (Exception) e2);
        }
    }
}
