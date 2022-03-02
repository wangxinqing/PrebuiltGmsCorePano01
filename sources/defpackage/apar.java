package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: apar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apar {
    public static int a(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "SHA512" : "SHA256" : "SHA384" : "SHA1" : "UNKNOWN_HASH" : "UNRECOGNIZED";
        throw new GeneralSecurityException(str.length() == 0 ? new String("unsupported hash type: ") : "unsupported hash type: ".concat(str));
    }

    public static int b(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        String valueOf = String.valueOf(aoyn.c(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static int c(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        String valueOf = String.valueOf(Integer.toString(aoyd.a(i)));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("unknown ECDSA encoding: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static void a(aoya aoya) {
        int b = aoyd.b(aoya.c);
        if (b == 0) {
            b = 1;
        }
        int b2 = aoyp.b(aoya.a);
        if (b2 == 0) {
            b2 = 1;
        }
        int b3 = aoyn.b(aoya.b);
        if (b3 == 0) {
            b3 = 1;
        }
        int i = b - 2;
        if (i == 1 || i == 2) {
            int i2 = b3 - 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    } else if (b2 != 6) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    }
                } else if (b2 != 4 && b2 != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            } else if (b2 != 5) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
    }

    public static void a(aozk aozk) {
        int b = aoyp.b(aozk.a);
        if (b == 0) {
            b = 1;
        }
        a(b);
    }

    public static void a(aozo aozo) {
        int b = aoyp.b(aozo.a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        a(b);
        int b2 = aoyp.b(aozo.a);
        if (b2 == 0) {
            b2 = 1;
        }
        int b3 = aoyp.b(aozo.b);
        if (b3 != 0) {
            i = b3;
        }
        if (b2 != i) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
    }
}
