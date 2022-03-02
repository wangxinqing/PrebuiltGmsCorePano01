package defpackage;

/* renamed from: afr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afr {
    public final ou a = new ou();
    public final oh b = new oh();

    public final acn a(adl adl, int i) {
        afp afp;
        acn acn;
        int a2 = this.a.a((Object) adl);
        if (a2 >= 0 && (afp = (afp) this.a.c(a2)) != null) {
            int i2 = afp.a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                afp.a = i3;
                if (i == 4) {
                    acn = afp.b;
                } else if (i == 8) {
                    acn = afp.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.d(a2);
                    afp.a(afp);
                }
                return acn;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void b(adl adl) {
        afp afp = (afp) this.a.get(adl);
        if (afp == null) {
            afp = afp.a();
            this.a.put(adl, afp);
        }
        afp.a |= 1;
    }

    /* access modifiers changed from: package-private */
    public final void c(adl adl) {
        afp afp = (afp) this.a.get(adl);
        if (afp != null) {
            afp.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(adl adl) {
        int b2 = this.b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (adl == this.b.b(b2)) {
                oh ohVar = this.b;
                if (ohVar.d[b2] != oh.a) {
                    ohVar.d[b2] = oh.a;
                    ohVar.b = true;
                }
            } else {
                b2--;
            }
        }
        afp afp = (afp) this.a.remove(adl);
        if (afp != null) {
            afp.a(afp);
        }
    }

    public final void b(adl adl, acn acn) {
        afp afp = (afp) this.a.get(adl);
        if (afp == null) {
            afp = afp.a();
            this.a.put(adl, afp);
        }
        afp.c = acn;
        afp.a |= 8;
    }

    public final void a() {
        this.a.clear();
        this.b.c();
    }

    public final void a(long j, adl adl) {
        this.b.b(j, adl);
    }

    public final void a(adl adl, acn acn) {
        afp afp = (afp) this.a.get(adl);
        if (afp == null) {
            afp = afp.a();
            this.a.put(adl, afp);
        }
        afp.b = acn;
        afp.a |= 4;
    }

    public final boolean a(adl adl) {
        afp afp = (afp) this.a.get(adl);
        return (afp == null || (afp.a & 1) == 0) ? false : true;
    }
}
