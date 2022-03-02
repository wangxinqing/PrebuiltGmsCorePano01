package defpackage;

import java.util.Arrays;

/* renamed from: usu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usu {
    public final String a;

    public usu(String str) {
        this.a = str;
    }

    public static usu a(byte[] bArr) {
        return new usu(jjp.d(ulu.a(bArr, 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof usu) {
            return ius.a(this.a, ((usu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return String.format("PeerId<id: %s>", new Object[]{this.a});
    }
}
