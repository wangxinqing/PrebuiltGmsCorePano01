package defpackage;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: maw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class maw {
    private final String a;
    private final lyp b;

    public maw(Context context) {
        String str = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxW77dCKJ8mhEIfXXdeidi7/7LMNM/fzwI+wj1Ed8xIKgTYWCnekRko3JxQb4Cv/gEL5hEA8e9lFs3V67VUL6hCo1FxysXj7Q8n3Kp7hARDkbiZ0mdk8bSanqrPAXTPx6pEL2ZOzfFCHEtJdhz5Ozp2C4XTKF1SBv/YbpsqSUJwdhG7ZPGjyCMRloMww6ITpGdVQ8lChklkCek0WPbz2UrY5RC1qIJKmmcB6KNxxE776Dn6QoYbhN5jPeVBp7lDD3UxjfVzTxKKDAome6fUVBop3dpcLM6rq3+nNT2YArgqTD1qtsVM9vHlcLaAYaPg82vtIN80iDUseMlVHgK+nf6wIDAQAB";
        if (axeq.a.a().b()) {
            try {
                FileInputStream openFileInput = context.openFileInput("PUB_KEY");
                InputStreamReader inputStreamReader = new InputStreamReader(openFileInput);
                StringBuilder sb = new StringBuilder();
                iva.a((Object) inputStreamReader);
                iva.a((Object) sb);
                CharBuffer allocate = CharBuffer.allocate(1024);
                while (inputStreamReader.read(allocate) != -1) {
                    allocate.flip();
                    sb.append(allocate);
                    allocate.remaining();
                    allocate.clear();
                }
                str = sb.toString();
                try {
                    openFileInput.close();
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                Log.e("DG", "Failed to read key override", e);
                this.a = str;
                this.b = lyp.a(context);
            }
        }
        this.a = str;
        this.b = lyp.a(context);
    }

    public final boolean a(byte[] bArr, byte[] bArr2) {
        try {
            KeyFactory e = jhg.e("RSA");
            if (e == null) {
                this.b.a((Throwable) new RuntimeException("Failed to get key factory object."));
                return false;
            }
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(this.a, 0));
            Signature d = jhg.d("SHA256withRSA");
            if (d == null) {
                this.b.a((Throwable) new RuntimeException("Failed to get signature object."));
                return false;
            }
            d.initVerify(e.generatePublic(x509EncodedKeySpec));
            d.update(bArr);
            return d.verify(bArr2);
        } catch (GeneralSecurityException e2) {
            this.b.a((Throwable) e2);
            return false;
        }
    }
}
