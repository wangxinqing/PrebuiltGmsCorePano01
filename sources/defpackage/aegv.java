package defpackage;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: aegv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aegv {
    public byte[] a;
    private String b;

    public aegv(aeiy aeiy) {
        aeix c = aeiy.c(aeft.a, aefq.a);
        aegu aegu = new aegu(this);
        synchronized (c.a) {
            c.b = aegu;
            while (true) {
                byte[] bArr = (byte[]) c.a.poll();
                if (bArr != null) {
                    aegu.a(bArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized String a(byte[] bArr) {
        Object obj;
        int length;
        String str = this.b;
        if (str != null) {
            return str;
        }
        byte[] bArr2 = this.a;
        if (bArr2 != null) {
            if (bArr != null) {
                try {
                    if (bArr.length == 16) {
                        int length2 = bArr2.length;
                        if (length2 <= 8 || length2 > 64) {
                            String valueOf = String.valueOf(Integer.valueOf(length2));
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                            sb.append("Naming packet size is incorrect, namingPacket.length is ");
                            sb.append(valueOf);
                            throw new GeneralSecurityException(sb.toString());
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, 8);
                        byte[] copyOf = Arrays.copyOf(aehq.a(bArr, Arrays.copyOfRange(bArr2, 8, length2)), 8);
                        if (!(copyOfRange == null || copyOf == null || copyOfRange.length != copyOf.length)) {
                            byte b2 = 0;
                            for (int i = 0; i < copyOfRange.length; i++) {
                                b2 |= copyOfRange[i] ^ copyOf[i];
                            }
                            if (b2 == 0) {
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, 8, bArr2.length);
                                if (copyOfRange2 == null || (length = copyOfRange2.length) <= 8) {
                                    String valueOf2 = String.valueOf(copyOfRange2 != null ? Integer.valueOf(copyOfRange2.length) : "NULL");
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 65);
                                    sb2.append("Incorrect data length ");
                                    sb2.append(valueOf2);
                                    sb2.append(" to decrypt, the data should contain nonce.");
                                    throw new GeneralSecurityException(sb2.toString());
                                }
                                this.b = new String(aeeu.a(bArr, Arrays.copyOfRange(copyOfRange2, 8, length), Arrays.copyOf(copyOfRange2, 8)), StandardCharsets.UTF_8);
                                ((anih) ((anih) aehd.a.d()).a("aegv", "a", 1718, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceNameReceiver: decrypted provider's name from naming response, name = %s.", (Object) this.b);
                                return this.b;
                            }
                        }
                        throw new GeneralSecurityException("Verify HMAC failed, could be incorrect key or naming packet.");
                    }
                } catch (GeneralSecurityException e) {
                    anih anih = (anih) aehd.a.c();
                    anih.a((Throwable) e);
                    ((anih) anih.a("aegv", "a", 1722, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceNameReceiver: fail to parse the NameCharacteristic from provider.");
                    return null;
                }
            }
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "NULL";
            }
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 59);
            sb3.append("Incorrect secret for decoding name packet, secret.length = ");
            sb3.append(valueOf3);
            throw new GeneralSecurityException(sb3.toString());
        }
        ((anih) ((anih) aehd.a.d()).a("aegv", "a", 1713, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceNameReceiver: no device name sent from the Provider.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(byte[] bArr) {
        synchronized (this) {
            ((anih) ((anih) aehd.a.d()).a("aegv", "b", 1691, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceNameReceiver: device name response size = %d", bArr.length);
            this.a = bArr;
        }
    }
}
