package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: acbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbq implements acbp {
    public final byte[] a;

    public acbq() {
        this.a = new byte[84];
    }

    public final anxm a() {
        return anxm.a(this.a[0]);
    }

    public final String b() {
        byte[] bArr = new byte[5];
        int i = 2;
        int i2 = 0;
        while (i < 7) {
            byte[] bArr2 = this.a;
            bArr[i - 2] = bArr2[i];
            if (bArr2[i] != 0) {
                i2++;
                i++;
            }
        }
        try {
            return new String(bArr, 0, i2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        return new byte[]{bArr[7], bArr[8]};
    }

    public final int d() {
        return anwq.a(this.a[1]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acbq) {
            return Arrays.equals(this.a, ((acbq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public acbq(byte[] bArr) {
        this.a = Base64.decode(bArr, 0);
    }
}
