package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import java.util.Arrays;

/* renamed from: ygs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygs extends ygl implements niz {
    private final nix a;
    private final String b;
    private final hya c = hya.a((Context) ihs.b());

    public ygs(nix nix, String str) {
        this.a = nix;
        this.b = str;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!jhg.b()) {
            this.c.a(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a();
        if (!ayzv.a.a().h() && !yge.a.contains(this.b) && !Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("ranchu") && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            throw new SecurityException(String.valueOf(this.b).concat(" is not authorized for debug operations"));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (ayzv.j().a.contains(this.b)) {
            a();
        } else {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        String str2;
        String str3;
        if (!jhg.b() && !this.c.b(this.b)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str2 = str.substring(0, indexOf);
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = null;
                str2 = str;
            }
            if (!yge.a(ayya.b(), str2)) {
                this.c.a(this.b);
            } else if (!this.b.equals(str3)) {
                String str4 = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 33 + String.valueOf(str).length());
                sb.append(str4);
                sb.append(" is not authorized to operate on ");
                sb.append(str);
                throw new SecurityException(sb.toString());
            }
        }
    }

    public final void c(ygj ygj, String str) {
        a(str);
        this.a.a(new yha(ygj, str, this.b));
    }

    public final void a(ygj ygj) {
        b();
        this.a.a(new yhf(ygj));
    }

    public final void b(ygj ygj) {
        a();
        this.a.a(new yhm(ygj, this.b));
    }

    public final void c(ygj ygj, String str, String str2, String str3) {
        b();
        this.a.a(new yho(ygj, this.b, str, str2, str3));
    }

    public final void a(ygj ygj, String str) {
        a(str);
        this.a.a(new yig(ygj, str, this.b));
    }

    public final void b(ygj ygj, String str) {
        String str2;
        String[] a2 = yhe.a(str);
        if (a2 != null) {
            str2 = a2[5];
        } else {
            str2 = null;
        }
        a(str2);
        this.a.a(new ygw(ygj, str, this.b));
    }

    public final void a(ygj ygj, String str, int i, String[] strArr, byte[] bArr) {
        a(str);
        this.a.a(new yht(ygj, str, i, strArr, (int[]) null, bArr, false, this.b));
    }

    public final void a(ygj ygj, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
        a(str);
        nix nix = this.a;
        jjg jjg = HeterodyneSyncTaskChimeraService.a;
        nix.a(new yhv(ygj, str, i, strArr, bArr, str2, str3, this.b));
    }

    public final void a(ygj ygj, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
        a();
        this.a.a(new yht(ygj, str, i, strArr, iArr, bArr, true, this.b));
    }

    public final void a(ygj ygj, String str, long j) {
        a();
        this.a.a(new yie(ygj, HeterodyneSyncTaskChimeraService.m, str, j));
    }

    public final void b(ygj ygj, String str, String str2) {
        a(str);
        nix nix = this.a;
        String str3 = this.b;
        nix.a(new yhg(ygj, str, str2, (String) null, str3, str3));
    }

    public final void a(ygj ygj, String str, String str2) {
        a(str);
        this.a.a(new yhc(ygj, str, str2, (String) null, str, this.b));
    }

    public final void a(ygj ygj, String str, String str2, int i) {
        a(str);
        this.a.a(new yhk(ygj, str, str2, i, this.b));
    }

    public final void b(ygj ygj, String str, String str2, String str3) {
        b();
        nix nix = this.a;
        int i = ygg.a;
        nix.a(new ygy(ygj, this.b, str, str2, str3));
    }

    public final void a(ygj ygj, String str, String str2, String str3) {
        a(str);
        this.a.a(new yhc(ygj, str, str2, str3, str, this.b));
    }

    public final void b(ygj ygj, String str, String str2, String str3, String str4) {
        a();
        this.a.a(new yhg(ygj, str, str2, str3, str4, this.b));
    }

    public final void a(ygj ygj, String str, String str2, String str3, int i, int i2, String str4) {
        c();
        nix nix = this.a;
        int i3 = ygg.a;
        nix.a(new yic(ygj, this.b, str, str2, new Flag[]{new Flag(str3, str4, i2, i)}));
    }

    public final void a(ygj ygj, String str, String str2, String str3, String str4) {
        a(str);
        this.a.a(new yhc(ygj, str2, str3, str4, str, this.b));
    }

    public final void a(ygj ygj, String str, String str2, Flag[] flagArr) {
        c();
        nix nix = this.a;
        int i = ygg.a;
        nix.a(new yic(ygj, this.b, str, str2, flagArr));
    }

    public final void a(ygj ygj, String str, byte[] bArr) {
        a(str);
        this.a.a(new yhz(ygj, str, bArr, this.b));
    }

    public final void a(ygj ygj, byte[] bArr) {
        b();
        this.a.a(new yib(ygj, bArr));
    }

    public final void a(ygj ygj, RegistrationInfo[] registrationInfoArr) {
        apgu[] apguArr;
        a();
        nix nix = this.a;
        if (registrationInfoArr != null) {
            apguArr = new apgu[registrationInfoArr.length];
            for (int i = 0; i < registrationInfoArr.length; i++) {
                if (registrationInfoArr[i] != null) {
                    apgq apgq = (apgq) apgu.l.o();
                    String str = registrationInfoArr[i].g;
                    if (apgq.c) {
                        apgq.c();
                        apgq.c = false;
                    }
                    apgu apgu = (apgu) apgq.b;
                    str.getClass();
                    apgu.b = 7;
                    apgu.c = str;
                    apgu.j = 1;
                    int i2 = apgu.a | 64;
                    apgu.a = i2;
                    RegistrationInfo registrationInfo = registrationInfoArr[i];
                    String str2 = registrationInfo.a;
                    if (str2 != null) {
                        str2.getClass();
                        i2 |= 1;
                        apgu.a = i2;
                        apgu.d = str2;
                    }
                    int i3 = registrationInfo.b;
                    apgu.a = i2 | 2;
                    apgu.e = i3;
                    String[] strArr = registrationInfo.c;
                    if (strArr != null && strArr.length > 0) {
                        apgq.a((Iterable) Arrays.asList(strArr));
                    }
                    byte[] bArr = registrationInfoArr[i].d;
                    if (bArr != null && bArr.length > 0) {
                        auay a2 = auay.a(bArr);
                        if (apgq.c) {
                            apgq.c();
                            apgq.c = false;
                        }
                        apgu apgu2 = (apgu) apgq.b;
                        a2.getClass();
                        apgu2.a |= 4;
                        apgu2.h = a2;
                    }
                    boolean z = registrationInfoArr[i].e;
                    if (apgq.c) {
                        apgq.c();
                        apgq.c = false;
                    }
                    apgu apgu3 = (apgu) apgq.b;
                    apgu3.a |= 8;
                    apgu3.i = z;
                    int[] iArr = registrationInfoArr[i].f;
                    if (iArr != null && (r7 = iArr.length) > 0) {
                        for (int a3 : iArr) {
                            apgq.a(a3);
                        }
                    }
                    apguArr[i] = (apgu) apgq.i();
                }
            }
        } else {
            apguArr = null;
        }
        nix.a(new yhq(ygj, apguArr));
    }
}
