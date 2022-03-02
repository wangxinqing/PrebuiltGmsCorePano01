package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: afhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afhu {
    public final byte[] a;
    public final byte[] b;
    public final long c;
    private final aubq d;

    public afhu(byte[] bArr, byte[] bArr2, long j, aubq aubq) {
        this.a = bArr;
        this.b = bArr2;
        this.c = j;
        this.d = aubq;
    }

    public final audx a() {
        aubs a2 = aubs.a();
        aubq aubq = this.d;
        if (auci.class.isAssignableFrom(aubq.getClass())) {
            a2.a((auci) aubq);
        }
        aujv aujv = (aujv) aucj.a((aucj) aujv.a, this.a, a2);
        auci auci = (auci) this.d;
        aujv.a(auci);
        if (aujv.m.a(auci.d)) {
            auci auci2 = (auci) this.d;
            aujv.a(auci2);
            Object b2 = aujv.m.b(auci2.d);
            if (b2 == null) {
                b2 = auci2.b;
            } else {
                auci2.a(b2);
            }
            return (audx) b2;
        }
        throw new auda("Missing MessageSet extension");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            afhu afhu = (afhu) obj;
            if (Arrays.equals(this.a, afhu.a) && Arrays.equals(this.b, afhu.b) && this.c == afhu.c) {
                aubq aubq = this.d;
                int a2 = aubq != null ? aubq.a() : 0;
                aubq aubq2 = afhu.d;
                if (a2 == (aubq2 != null ? aubq2.a() : 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((Arrays.hashCode(this.a) + 527) * 31) + Arrays.hashCode(this.b)) * 31) + Long.valueOf(this.c).hashCode()) * 31;
        aubq aubq = this.d;
        return hashCode + Integer.valueOf(aubq != null ? aubq.a() : 0).hashCode();
    }

    public final String toString() {
        String str;
        try {
            String valueOf = String.valueOf(a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("{");
            sb.append(valueOf);
            sb.append("}");
            str = sb.toString();
        } catch (auda e) {
            str = e.getMessage();
        }
        return String.format(Locale.ENGLISH, "MdhFootprint{data=%s, secondaryId=%s, serverEventIdTimestamp=%d}", new Object[]{str, Arrays.toString(this.b), Long.valueOf(this.c)});
    }
}
