package defpackage;

/* renamed from: fi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fi extends fg {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    public int ai = 0;
    private ff aj = this.j;

    public fi() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void a(fb fbVar) {
        fg fgVar = this.r;
        if (fgVar != null) {
            ff e = fgVar.e(2);
            ff e2 = fgVar.e(4);
            if (this.ai == 0) {
                e = fgVar.e(3);
                e2 = fgVar.e(5);
            }
            if (this.ag != -1) {
                fbVar.a(fb.a(fbVar, fbVar.a((Object) this.aj), fbVar.a((Object) e), this.ag, false));
            } else if (this.ah != -1) {
                fbVar.a(fb.a(fbVar, fbVar.a((Object) this.aj), fbVar.a((Object) e2), -this.ah, false));
            } else if (this.af != -1.0f) {
                fd a = fbVar.a((Object) this.aj);
                fd a2 = fbVar.a((Object) e);
                fd a3 = fbVar.a((Object) e2);
                float f = this.af;
                ey b = fbVar.b();
                b.d.a(a, -1.0f);
                b.d.a(a2, 1.0f - f);
                b.d.a(a3, f);
                fbVar.a(b);
            }
        }
    }

    public final ff e(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ai == 0) {
                return this.aj;
            }
            return null;
        }
        if (this.ai == 1) {
            return this.aj;
        }
        return null;
    }

    public final void h(int i) {
        if (this.ai != i) {
            this.ai = i;
            this.q.clear();
            if (this.ai == 1) {
                this.aj = this.i;
            } else {
                this.aj = this.j;
            }
            this.q.add(this.aj);
        }
    }

    public final void m() {
        if (this.r != null) {
            int b = fb.b(this.aj);
            if (this.ai == 1) {
                this.w = b;
                this.x = 0;
                b(this.r.f());
                a(0);
                return;
            }
            this.w = 0;
            this.x = b;
            a(this.r.c());
            b(0);
        }
    }
}
