package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: acbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbw implements acbs {
    public static final String a = new String(new byte[]{0});
    private final String b;
    private final acbq c;

    public acbw(String str, acbq acbq) {
        this.b = str;
        this.c = acbq;
    }

    public final String a() {
        return this.b;
    }

    public final acbp b() {
        return this.c;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(new String(new byte[]{1}));
        sb.append(this.b);
        try {
            sb.append(new String(Base64.encode(this.c.a, 3), "UTF-8"));
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acbw) {
            acbw acbw = (acbw) obj;
            if (this.b.equals(acbw.b)) {
                return this.c.equals(acbw.c);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public acbw(byte[] bArr) {
        boolean z;
        int i = 1;
        while (true) {
            if (i < 19) {
                if (bArr[i] == 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                i = 19;
                z = false;
                break;
            }
        }
        try {
            this.b = new String(Arrays.copyOfRange(bArr, 1, i), "UTF-8");
            this.c = new acbq(Arrays.copyOfRange(bArr, z ? i + 1 : i, bArr.length));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
