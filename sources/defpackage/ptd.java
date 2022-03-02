package defpackage;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ptd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptd {
    public final long a;

    public ptd(long j) {
        this.a = j;
    }

    public static amzy a(Signature[] signatureArr) {
        if (signatureArr == null) {
            return amzy.h();
        }
        ArrayList arrayList = new ArrayList(r0);
        MessageDigest a2 = jhh.a("SHA-256");
        if (a2 != null) {
            for (Signature byteArray : signatureArr) {
                aucd o = pti.c.o();
                auay a3 = auay.a(a2.digest(byteArray.toByteArray()));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                pti pti = (pti) o.b;
                a3.getClass();
                pti.a |= 1;
                pti.b = a3;
                arrayList.add((pti) o.i());
            }
            return amzy.a((Collection) arrayList);
        }
        throw new NoSuchAlgorithmException("Unable to create SHA-256 message digest for signatures!");
    }

    public static void a(avqh avqh, String str, long j, long j2) {
        if (j != j2) {
            avqf avqf = (avqf) avqg.i.o();
            if (avqf.c) {
                avqf.c();
                avqf.c = false;
            }
            avqg avqg = (avqg) avqf.b;
            str.getClass();
            avqg.a |= 1;
            avqg.b = str;
            avqf.c(j);
            avqh.a(avqf);
        }
    }

    public static void a(avqh avqh, String str, avqi avqi) {
        if (avqi != null && !avqi.equals(avqi.f)) {
            avqf avqf = (avqf) avqg.i.o();
            if (avqf.c) {
                avqf.c();
                avqf.c = false;
            }
            avqg avqg = (avqg) avqf.b;
            str.getClass();
            avqg.a |= 1;
            avqg.b = str;
            avqf.a(avqi);
            avqh.a(avqf);
        }
    }

    public static void a(avqh avqh, String str, String str2) {
        if (str2 != null && !str2.equals("")) {
            avqf avqf = (avqf) avqg.i.o();
            if (avqf.c) {
                avqf.c();
                avqf.c = false;
            }
            avqg avqg = (avqg) avqf.b;
            str.getClass();
            avqg.a |= 1;
            avqg.b = str;
            avqf.a(str2);
            avqh.a(avqf);
        }
    }
}
