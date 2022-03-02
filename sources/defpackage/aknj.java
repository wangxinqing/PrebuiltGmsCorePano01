package defpackage;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashMap;

/* renamed from: aknj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknj {
    final /* synthetic */ aknk a;
    private final int b;
    private final long c;

    public aknj(aknk aknk, long j, int i) {
        this.a = aknk;
        this.c = j;
        this.b = i;
    }

    public final void a(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.c;
        akma akma = this.a.a;
        int i = this.b;
        akun akun = (akun) akma;
        aobv a2 = akun.a((int) (elapsedRealtime - j));
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv = (aobv) aucd.b;
        aobv aobv2 = aobv.j;
        int i2 = 3;
        aobv.c = 3;
        aobv.a |= 2;
        aoch aoch = aobv.f;
        if (aoch == null) {
            aoch = aoch.f;
        }
        aucd aucd2 = (aucd) aoch.c(5);
        aucd2.a((aucj) aoch);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoch aoch2 = (aoch) aucd2.b;
        int i3 = aoch2.a | 1;
        aoch2.a = i3;
        aoch2.b = i;
        aoch2.a = i3 | 8;
        aoch2.e = z;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv3 = (aobv) aucd.b;
        aoch aoch3 = (aoch) aucd2.i();
        aoch3.getClass();
        aobv3.f = aoch3;
        aobv3.a |= 16;
        if (!azda.d()) {
            i2 = 2;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv4 = (aobv) aucd.b;
        aobv4.i = i2 - 1;
        aobv4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        akun.a(akun.a((aobv) aucd.i()));
    }

    public final void a(astz[] astzArr, asto[] astoArr, boolean z) {
        int length;
        astz[] astzArr2 = astzArr;
        asto[] astoArr2 = astoArr;
        boolean z2 = z;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        int i = 0;
        for (astz astz : astzArr2) {
            int i2 = astz.U;
            if (i2 == -1) {
                i2 = aueh.a.a((Object) astz).b(astz);
                astz.U = i2;
            }
            i += i2;
        }
        int i3 = 0;
        while (true) {
            length = astoArr2.length;
            if (i3 >= length) {
                break;
            }
            asto asto = astoArr2[i3];
            int i4 = asto.U;
            if (i4 == -1) {
                i4 = aueh.a.a((Object) asto).b(asto);
                asto.U = i4;
            }
            i += i4;
            i3++;
        }
        akma akma = this.a.a;
        int i5 = this.b;
        int length2 = astzArr2.length;
        akun akun = (akun) akma;
        aobv a2 = akun.a((int) elapsedRealtime);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv = (aobv) aucd.b;
        aobv aobv2 = aobv.j;
        int i6 = 1;
        aobv.c = 1;
        aobv.a |= 2;
        aucd o = aoch.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoch aoch = (aoch) o.b;
        int i7 = aoch.a | 1;
        aoch.a = i7;
        aoch.b = i5;
        int i8 = i7 | 2;
        aoch.a = i8;
        aoch.c = length2;
        int i9 = i8 | 4;
        aoch.a = i9;
        aoch.d = i;
        aoch.a = i9 | 8;
        aoch.e = z2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv3 = (aobv) aucd.b;
        aoch aoch2 = (aoch) o.i();
        aoch2.getClass();
        aobv3.f = aoch2;
        aobv3.a |= 16;
        int i10 = !azda.d() ? 2 : 3;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv4 = (aobv) aucd.b;
        aobv4.i = i10 - 1;
        aobv4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        akun.a(akun.a((aobv) aucd.i()));
        aknk aknk = this.a;
        aklo aklo = aknk.b;
        if (aklo != null) {
            aklo.o += i;
        }
        akke akke = aknk.c;
        if (akke != null) {
            aklf aklf = akke.b;
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (i11 < length) {
                asto asto2 = astoArr2[i11];
                if ((asto2.a & i6) != 0) {
                    long[] jArr = new long[asto2.c.size()];
                    for (int i12 = 0; i12 < asto2.c.size(); i12++) {
                        jArr[i12] = asto2.c.a(i12);
                    }
                    hashMap.put(Long.valueOf(asto2.b), jArr);
                }
                i11++;
                i6 = 1;
            }
            aklb aklb = (aklb) aklf;
            aklb.g.execute(new akku(aklb, hashMap, z2));
            aklf aklf2 = akke.b;
            HashMap hashMap2 = new HashMap();
            for (astz astz2 : astzArr2) {
                if ((astz2.a & i6) != 0) {
                    asth asth = astz2.b;
                    if (asth == null) {
                        asth = asth.b;
                    }
                    hashMap2.put(Long.valueOf(asth.a), astz2);
                }
            }
            aklb aklb2 = (aklb) aklf2;
            aklb2.g.execute(new akkv(aklb2, hashMap2, z2));
            if (!z2 && astoArr2.length > 0 && astzArr2.length > 0 && akke.f < 2) {
                akke.a(akke.e, akke.d, akkl.c);
            }
        }
    }
}
