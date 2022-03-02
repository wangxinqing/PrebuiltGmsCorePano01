package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: al  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class al extends ae {
    private final g a = new g();
    private ad b;
    private final WeakReference c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private final ArrayList g = new ArrayList();

    public al(aj ajVar) {
        this.c = new WeakReference(ajVar);
        this.b = ad.INITIALIZED;
    }

    static ad a(ad adVar, ad adVar2) {
        return (adVar2 == null || adVar2.compareTo(adVar) >= 0) ? adVar : adVar2;
    }

    static ad b(ac acVar) {
        ad adVar = ad.DESTROYED;
        ac acVar2 = ac.ON_CREATE;
        int ordinal = acVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ad.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ad.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + acVar);
                    }
                }
            }
            return ad.STARTED;
        }
        return ad.CREATED;
    }

    private static ac c(ad adVar) {
        ad adVar2 = ad.DESTROYED;
        ac acVar = ac.ON_CREATE;
        int ordinal = adVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return ac.ON_CREATE;
        }
        if (ordinal == 2) {
            return ac.ON_START;
        }
        if (ordinal == 3) {
            return ac.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + adVar);
        }
        throw new IllegalArgumentException();
    }

    public final ad a() {
        return this.b;
    }

    private final void b() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void a(ac acVar) {
        a(b(acVar));
    }

    private final void b(ad adVar) {
        this.g.add(adVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ad} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ad c(defpackage.ai r4) {
        /*
            r3 = this;
            g r0 = r3.a
            boolean r1 = r0.c(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.util.HashMap r0 = r0.a
            java.lang.Object r4 = r0.get(r4)
            j r4 = (defpackage.j) r4
            j r4 = r4.d
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x001e
            java.lang.Object r4 = r4.b
            ak r4 = (defpackage.ak) r4
            ad r4 = r4.a
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            java.util.ArrayList r0 = r3.g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0037
            java.util.ArrayList r0 = r3.g
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            ad r2 = (defpackage.ad) r2
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            ad r0 = r3.b
            ad r4 = a(r0, r4)
            ad r4 = a(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al.c(ai):ad");
    }

    public final void a(ad adVar) {
        if (this.b != adVar) {
            this.b = adVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            c();
            this.e = false;
        }
    }

    public final void a(ai aiVar) {
        ad adVar;
        Object obj;
        aj ajVar;
        boolean z;
        if (this.b != ad.DESTROYED) {
            adVar = ad.INITIALIZED;
        } else {
            adVar = ad.DESTROYED;
        }
        ak akVar = new ak(aiVar, adVar);
        g gVar = this.a;
        j a2 = gVar.a(aiVar);
        if (a2 == null) {
            gVar.a.put(aiVar, gVar.b(aiVar, akVar));
            obj = null;
        } else {
            obj = a2.b;
        }
        if (((ak) obj) == null && (ajVar = (aj) this.c.get()) != null) {
            if (this.d != 0 || this.e) {
                z = true;
            } else {
                z = false;
            }
            ad c2 = c(aiVar);
            this.d++;
            while (akVar.a.compareTo(c2) < 0 && this.a.c(aiVar)) {
                b(akVar.a);
                akVar.a(ajVar, c(akVar.a));
                b();
                c2 = c(aiVar);
            }
            if (!z) {
                c();
            }
            this.d--;
        }
    }

    public final void b(ai aiVar) {
        this.a.b(aiVar);
    }

    private final void c() {
        ad adVar;
        ad adVar2;
        ac acVar;
        aj ajVar = (aj) this.c.get();
        if (ajVar != null) {
            while (true) {
                g gVar = this.a;
                if (gVar.e == 0 || ((adVar = ((ak) gVar.b.b).a) == (adVar2 = ((ak) gVar.c.b).a) && this.b == adVar2)) {
                    this.f = false;
                } else {
                    this.f = false;
                    if (this.b.compareTo(adVar) < 0) {
                        g gVar2 = this.a;
                        i iVar = new i(gVar2.c, gVar2.b);
                        gVar2.d.put(iVar, false);
                        while (iVar.hasNext() && !this.f) {
                            Map.Entry entry = (Map.Entry) iVar.next();
                            ak akVar = (ak) entry.getValue();
                            while (akVar.a.compareTo(this.b) > 0 && !this.f && this.a.c(entry.getKey())) {
                                ad adVar3 = akVar.a;
                                ad adVar4 = ad.DESTROYED;
                                ac acVar2 = ac.ON_CREATE;
                                int ordinal = adVar3.ordinal();
                                if (ordinal == 0) {
                                    throw new IllegalArgumentException();
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        acVar = ac.ON_DESTROY;
                                    } else if (ordinal == 3) {
                                        acVar = ac.ON_STOP;
                                    } else if (ordinal == 4) {
                                        acVar = ac.ON_PAUSE;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected state value " + adVar3);
                                    }
                                    b(b(acVar));
                                    akVar.a(ajVar, acVar);
                                    b();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    j jVar = this.a.c;
                    if (!this.f && jVar != null && this.b.compareTo(((ak) jVar.b).a) > 0) {
                        k a2 = this.a.a();
                        while (a2.hasNext() && !this.f) {
                            j jVar2 = (j) a2.next();
                            ak akVar2 = (ak) jVar2.b;
                            while (akVar2.a.compareTo(this.b) < 0 && !this.f && this.a.c(jVar2.a)) {
                                b(akVar2.a);
                                akVar2.a(ajVar, c(akVar2.a));
                                b();
                            }
                        }
                    }
                }
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
}
