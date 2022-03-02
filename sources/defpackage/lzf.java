package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: lzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lzf {
    private final lzc a;

    public lzf(lzc lzc) {
        this.a = lzc;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        MediaDrm mediaDrm;
        byte[] openSession;
        try {
            mediaDrm = new MediaDrm(UUID.fromString(this.a.a(new int[]{68, 220, 223, 20, 228, 227, 68, 27, 216, 98, 137, 197, 218, 223, 219, 222, 207, 227, 198, 201, 228, 19, 207, 7, 198, 211, 202, 212, 20, 156, 214, 226, 204, 19, 225, 89, 197, 212, 121, 68, 19, 197, 105, 121, 98, 201, 19, 228, 201, 212, 224, 216, 199, 227, 210, 7, 205, 206, 20, 121, 20, 228, 207, 228, 115, 53, 20, 199, 53, 68, 20})));
            openSession = mediaDrm.openSession();
            int[] iArr = new int[29];
            iArr[0] = 219;
            iArr[1] = 197;
            iArr[2] = 68;
            iArr[3] = 127;
            iArr[4] = 221;
            iArr[5] = 102;
            iArr[6] = 121;
            iArr[7] = 223;
            iArr[8] = 137;
            iArr[9] = 121;
            iArr[10] = 102;
            iArr[11] = 194;
            iArr[12] = 224;
            iArr[13] = 208;
            iArr[14] = 209;
            iArr[15] = 204;
            iArr[16] = 190;
            iArr[17] = 71;
            iArr[18] = 191;
            iArr[19] = 226;
            iArr[20] = 192;
            int[] iArr2 = iArr;
            iArr2[21] = 192;
            iArr2[22] = 222;
            iArr2[23] = 224;
            iArr2[24] = 209;
            iArr2[25] = 195;
            iArr2[26] = 149;
            iArr2[27] = 210;
            iArr2[28] = 182;
            mediaDrm.getCryptoSession(openSession, this.a.a(iArr2), this.a.a(new int[]{4, 38, 200, 222, 216, 191, 188, 127, 205, 213, 222, 4, 197, 199, 213, 211, 205, 115, 156}));
            HashMap hashMap = new HashMap();
            String a2 = this.a.a(new int[]{212, 38});
            MessageDigest b = jhg.b(this.a.a(new int[]{127, 211, 206, 208, 4, 209, 222, 216, 229, 213, 197, 19, 207, 210, 206, 223, 53}));
            if (b != null) {
                b.update(str.getBytes());
                hashMap.put(a2, a(b.digest()));
                MediaDrm mediaDrm2 = mediaDrm;
                byte[] bArr = openSession;
                String a3 = a(mediaDrm2.getKeyRequest(bArr, this.a.a(new int[]{131}).getBytes(), this.a.a(new int[]{218, 191, 220, 145, 229, 203, 203, 145, 117, 195, 218, 188, 217, 191, 186, 195, 215, 221, 190, 226, 149, 206, 201, 203, 102, 220, 190, 188, 208, 186, 183, 186, 19, 214, 196, 222, 186, 154, 224, 210, 183, 191, 38}), 1, hashMap).getData());
                synchronized (mbp.a) {
                    try {
                        mediaDrm.closeSession(openSession);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                return a3;
            }
            throw new lzg(5);
        } catch (MediaDrmException e) {
            throw new lzg(1, e);
        } catch (RuntimeException e2) {
            throw new lzg(2, e2);
        } catch (Throwable th2) {
            while (true) {
                th = th2;
            }
            throw th;
        }
    }
}
