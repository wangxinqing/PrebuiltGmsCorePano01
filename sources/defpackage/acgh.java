package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: acgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgh {
    static final byte[] a = "smartdevice.postsetup.key".getBytes(Charset.forName("UTF-8"));
    private static final iwd c = acqa.a("PostSetup", "PostSetupManager");
    auta b;
    private final abpk d;
    private final int e;
    private final acad f;

    public acgh(Context context, int i, acad acad) {
        this.d = acec.d(context);
        this.e = i;
        this.f = acad;
        if (i == 100) {
            acad.a(7);
        } else {
            acad.a(6);
        }
    }

    private final void a(acgz acgz, Status status, ConnectionHint connectionHint) {
        try {
            a(status, false);
            acgz.a(status, connectionHint);
        } catch (RemoteException e2) {
            c.a((Throwable) e2);
        }
    }

    private final void b(acgz acgz, Status status, HandshakeData handshakeData) {
        try {
            a(status, false);
            acgz.b(status, handshakeData);
        } catch (RemoteException e2) {
            c.a((Throwable) e2);
        }
    }

    private final void c(acgz acgz, Status status, HandshakeData handshakeData) {
        try {
            a(status, false);
            acgz.c(status, handshakeData);
        } catch (RemoteException e2) {
            c.a((Throwable) e2);
        }
    }

    public final void d(acgz acgz, HandshakeData handshakeData) {
        auta auta;
        if (handshakeData == null || handshakeData.b == null || handshakeData.c == null) {
            c.d("Handshake data is invalid for authenticate().", new Object[0]);
            a(acgz, new Status(13), new PostSetupAuthData());
        } else if (this.e == 100 && (auta = this.b) != null && auta.d() == 3) {
            byte[] a2 = this.d.a();
            if (a2 != null) {
                try {
                    a(handshakeData, a(a2, handshakeData.b), a2, acgz, 100);
                } catch (IOException | IllegalArgumentException e2) {
                    c.e("Error happened when generateCode. ", e2, new Object[0]);
                    a(acgz, new Status(13), new PostSetupAuthData());
                }
            } else {
                c.d("No shared secret stored on target device.", new Object[0]);
                a(acgz, new Status(10590), new PostSetupAuthData());
            }
        } else {
            a(acgz, new Status(10593), new PostSetupAuthData());
        }
    }

    private final void a(acgz acgz, Status status, HandshakeData handshakeData) {
        try {
            a(status, false);
            acgz.a(status, handshakeData);
        } catch (RemoteException e2) {
            c.a((Throwable) e2);
        }
    }

    public final void b(acgz acgz) {
        try {
            this.b = auta.a(ausy.a);
            if (!a(100)) {
                a(acgz, new Status(10593), new HandshakeData());
                return;
            }
            a(acgz, Status.a, new HandshakeData(this.b.a()));
        } catch (ausp e2) {
            a(acgz, new Status(10592), new HandshakeData());
        }
    }

    public final void c(acgz acgz, HandshakeData handshakeData) {
        if (handshakeData == null || handshakeData.b == null || handshakeData.c == null) {
            c.d("Handshake data is invalid for authenticate().", new Object[0]);
            a(acgz, new Status(13), new PostSetupAuthData());
        }
        if (!a(200)) {
            a(acgz, new Status(10593), new PostSetupAuthData());
            return;
        }
        byte[] a2 = this.d.a();
        if (a2 == null) {
            c.d("No shared secret stored on target device.", new Object[0]);
            a(acgz, new Status(10590), new PostSetupAuthData());
            return;
        }
        try {
            this.b.a(handshakeData.b);
            try {
                try {
                    a(handshakeData, a(a2, this.b.a(32)), a2, acgz, 200);
                } catch (IOException | IllegalArgumentException e2) {
                    c.e("Error happened when generateCode. ", e2, new Object[0]);
                    a(acgz, new Status(13), new PostSetupAuthData());
                }
            } catch (ausp e3) {
                a(acgz, new Status(10592), new PostSetupAuthData());
            }
        } catch (ausp | ausx e4) {
            c.a(e4);
            a(acgz, new Status(10592), new PostSetupAuthData());
        }
    }

    private final void a(acgz acgz, Status status, PostSetupAuthData postSetupAuthData) {
        try {
            a(status, true);
            acgz.a(status, postSetupAuthData);
        } catch (RemoteException e2) {
            c.a((Throwable) e2);
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null) {
            Mac c2 = jhg.c("HmacSHA256");
            if (c2 != null) {
                try {
                    c2.init(new SecretKeySpec(bArr, "HmacSHA256"));
                    return c2.doFinal(bArr2);
                } catch (InvalidKeyException e2) {
                    c.a((Throwable) e2);
                    throw new IOException("Invalid key.", e2);
                }
            } else {
                throw new IOException("Failed to get Mac.");
            }
        } else {
            throw new IllegalArgumentException("Missing argument, message.");
        }
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
        if (handshakeData == null || handshakeData.b == null) {
            c.d("Handshake data couldn't be null for targetFinish().", new Object[0]);
            c(acgz, new Status(13), new HandshakeData());
        } else if (!a(100)) {
            c(acgz, new Status(10593), new HandshakeData());
        } else {
            byte[] a2 = this.d.a();
            if (a2 != null) {
                try {
                    this.b.a(handshakeData.b);
                    try {
                        try {
                            c(acgz, Status.a, new HandshakeData(this.b.a(), a(a2, this.b.a(32))));
                        } catch (IOException | IllegalArgumentException e2) {
                            c.e("Error getting HMAC.", e2, new Object[0]);
                            c(acgz, new Status(13), new HandshakeData());
                        }
                    } catch (ausp e3) {
                        c(acgz, new Status(10592), new HandshakeData());
                    }
                } catch (ausp | ausx | IllegalStateException e4) {
                    c.a(e4);
                    c(acgz, new Status(10592), new HandshakeData());
                }
            } else {
                c.d("No shared secret stored on target device.", new Object[0]);
                c(acgz, new Status(10590), new HandshakeData());
            }
        }
    }

    public final void a(acgz acgz) {
        long j = ((aceb) this.d).a.getLong("session", 0);
        ConnectionHint connectionHint = new ConnectionHint();
        if (j != 0) {
            connectionHint.b = Long.toString(j);
            connectionHint.a.add(2);
            this.f.a(j);
            a(acgz, Status.a, connectionHint);
            return;
        }
        a(acgz, new Status(10590), connectionHint);
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
        if (handshakeData == null || handshakeData.b == null) {
            c.d("Handshake data couldn't be null for sourceInit().", new Object[0]);
            b(acgz, new Status(13), new HandshakeData());
        }
        try {
            this.b = auta.b(ausy.a);
            if (!a(200)) {
                b(acgz, new Status(10593), new HandshakeData());
                return;
            }
            this.b.a(handshakeData.b);
            b(acgz, Status.a, new HandshakeData(this.b.a()));
        } catch (ausp | ausx | IllegalStateException e2) {
            c.a(e2);
            b(acgz, new Status(10592), new HandshakeData());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Status status, boolean z) {
        boolean c2 = status.c();
        if (!c2 || z) {
            this.f.a.a(c2);
            if (!status.c()) {
                acad acad = this.f;
                int i = status.i;
                acad.a.a(false);
                acad.a.a(i);
            }
            this.f.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(HandshakeData handshakeData, byte[] bArr, byte[] bArr2, acgz acgz, int i) {
        if (MessageDigest.isEqual(handshakeData.c, bArr)) {
            this.b.b();
            try {
                byte[] a2 = this.b.c().a();
                PostSetupAuthData postSetupAuthData = new PostSetupAuthData(autp.a(new SecretKeySpec(a2, "HmacSHA256"), bArr2, a));
                if (i == 200) {
                    byte[] bArr3 = new byte[32];
                    new SecureRandom().nextBytes(bArr3);
                    postSetupAuthData.c = new HandshakeData(bArr3, a(bArr2, bArr3));
                    postSetupAuthData.a.add(3);
                }
                a(acgz, Status.a, postSetupAuthData);
            } catch (Exception e2) {
                throw new IOException(e2);
            } catch (ausp | IOException | NoSuchAlgorithmException e3) {
                c.d("Error getting a symmetric key from ukey2Handshake. ", e3, new Object[0]);
                a(acgz, new Status(10592), new PostSetupAuthData());
            }
            c.b("Post authentication succeed. ", new Object[0]);
            return;
        }
        a(acgz, new Status(10591), new PostSetupAuthData());
        c.d("HMAC on two devices don't match. ", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i) {
        if (this.e != i) {
            c.d("Device is not in the right Role.", new Object[0]);
            return false;
        }
        auta auta = this.b;
        if (auta != null && auta.d() == 1) {
            return true;
        }
        c.d("Handshake is not started yet", new Object[0]);
        return false;
    }
}
