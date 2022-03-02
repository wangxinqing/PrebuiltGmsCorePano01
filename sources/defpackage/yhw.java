package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import java.util.Arrays;

/* renamed from: yhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhw {
    public final String a;
    public final String b;
    public final apgu c;
    yhx d = null;
    avta e = null;

    public yhw(String str, int i, String[] strArr, byte[] bArr, String str2, String str3, String str4) {
        this.a = str2;
        this.b = str3;
        apgq apgq = (apgq) apgu.l.o();
        if (apgq.c) {
            apgq.c();
            apgq.c = false;
        }
        apgu apgu = (apgu) apgq.b;
        int i2 = apgu.a | 2;
        apgu.a = i2;
        apgu.e = i;
        apgu.j = 1;
        int i3 = i2 | 64;
        apgu.a = i3;
        if (str != null) {
            str.getClass();
            apgu.a = 1 | i3;
            apgu.d = str;
        }
        if (str4 != null) {
            str4.getClass();
            apgu.b = 7;
            apgu.c = str4;
        }
        if (strArr != null && strArr.length > 0) {
            apgq.a((Iterable) Arrays.asList(strArr));
        }
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
        this.c = (apgu) apgq.i();
    }

    public final void a(Context context) {
        String str = this.a;
        if (str == null) {
            throw new yfy(29500, "No user");
        } else if (!str.equals("") && !ygd.a(this.a, context)) {
            throw new yfy(29500, "User not on device");
        }
    }

    public final void a(Context context, boolean z) {
        if (yhs.a(this.c.d, this.d.c)) {
            this.e = (avta) avtd.h.o();
            yiu b2 = HeterodyneSyncTaskChimeraService.b(context);
            if (z) {
                b2.d = null;
                b2.e = null;
                b2.f = true;
            }
            int i = this.d.c;
            String str = this.c.d;
            String str2 = this.a;
            avta avta = this.e;
            String[] a2 = b2.a();
            if ("".equals(str2)) {
                b2.a(i, str, new String[0], a2, true, avta);
                return;
            }
            b2.a(i, str, new String[]{str2}, a2, false, avta);
        }
    }
}
