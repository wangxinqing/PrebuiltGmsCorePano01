package defpackage;

import java.io.IOException;

/* renamed from: nuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuu {
    public static byte a(audx audx) {
        if (audx instanceof amnj) {
            return 0;
        }
        if (audx instanceof amng) {
            return 1;
        }
        if (audx instanceof amna) {
            return 4;
        }
        if (audx instanceof amns) {
            return 2;
        }
        if (audx instanceof amnt) {
            return 3;
        }
        if (audx instanceof amnn) {
            return 7;
        }
        if (audx instanceof amnc) {
            return 8;
        }
        if (!(audx instanceof amne)) {
            return audx == null ? (byte) -1 : -2;
        }
        return 17;
    }

    public static int b(audx audx) {
        if (audx instanceof amnt) {
            return ((amnt) audx).c;
        }
        if (audx instanceof amnn) {
            return ((amnn) audx).e;
        }
        if (audx instanceof amnc) {
            return ((amnc) audx).i;
        }
        if (audx instanceof amnj) {
            return ((amnj) audx).b;
        }
        if (audx instanceof amng) {
            return ((amng) audx).b;
        }
        return -1;
    }

    public static audx a(byte b, byte[] bArr) {
        if (b == 0) {
            return (amnj) aucj.a((aucj) amnj.e, bArr);
        }
        if (b == 1) {
            return (amng) aucj.a((aucj) amng.e, bArr);
        }
        if (b == 2) {
            return (amns) aucj.a((aucj) amns.z, bArr);
        }
        if (b == 3) {
            return (amnt) aucj.a((aucj) amnt.e, bArr);
        }
        if (b == 4) {
            return (amna) aucj.a((aucj) amna.a, bArr);
        }
        if (b == 7) {
            return (amnn) aucj.a((aucj) amnn.g, bArr);
        }
        if (b == 8) {
            return (amnc) aucj.a((aucj) amnc.r, bArr);
        }
        throw new IOException("Unknown tag");
    }
}
