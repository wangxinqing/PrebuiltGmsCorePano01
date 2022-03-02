package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: aqem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqem {
    private static final aqel[] b = new aqel[168];
    public final aqeu a;

    static {
        int i = 0;
        for (int i2 = 0; i2 <= 7; i2++) {
            int i3 = 16;
            while (i3 < 37) {
                b[i] = new aqel((i2 << 8) + i3, (Object) null);
                i3++;
                i++;
            }
        }
    }

    public aqem() {
        this.a = new aqeu();
    }

    public final int a(int i) {
        aqel aqel = (aqel) this.a.a(i);
        if (aqel != null) {
            return aqel.a & 255;
        }
        return 16;
    }

    public final Object b(int i) {
        aqel aqel = (aqel) this.a.a(i);
        if (aqel != null) {
            return aqel.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqem) {
            return this.a.equals(((aqem) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public aqem(int i) {
        this.a = new aqeu(i + 1);
    }

    public final void a(int i, int i2, Object obj) {
        aqel aqel;
        aqeu aqeu = this.a;
        if (obj == null) {
            aqel = b[(((i >> 8) & 255) * 21) + ((i & 255) - 16)];
        } else {
            aqel = new aqel(i, obj);
        }
        aqeu.a(i2, aqel);
    }

    public final boolean a(aqek aqek) {
        int i;
        aqet a2 = this.a.a();
        while (a2.a()) {
            int b2 = a2.b();
            aqel aqel = (aqel) this.a.a(b2);
            if (aqel != null) {
                i = aqel.a & 65280;
            } else {
                i = 1536;
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && !aqek.i(b2)) {
                return false;
            }
            int j = aqek.j(b2);
            if ((i & 1024) == 0 && j > 1) {
                return false;
            }
            if (a(b2) == 27 && (b(b2) instanceof aqem)) {
                aqem aqem = (aqem) b(b2);
                if (aqem != null) {
                    int i2 = 0;
                    while (i2 < j) {
                        if (aqem.a(aqek.f(b2, i2))) {
                            i2++;
                        }
                    }
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
