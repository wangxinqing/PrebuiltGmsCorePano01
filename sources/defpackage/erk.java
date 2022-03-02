package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: erk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erk {
    private static final iwd a = new iwd("Auth", "AuthzenSecretProviderHelper");
    private static final long b = TimeUnit.MINUTES.toMillis(60);
    private static final byte[] c = {71, 111, 111, 103, 108, 101, 79, 102, 102, 108, 105, 110, 101, 79, 84, 80};
    private static final byte[] d = {84, 72, 79, 84, 80};
    private final Context e;

    static SecretKeySpec a(SecretKey secretKey) {
        try {
            MessageDigest b2 = jhg.b("SHA256");
            if (b2 != null) {
                return new SecretKeySpec(autp.a(secretKey, b2.digest(c), d), "");
            }
            return null;
        } catch (GeneralSecurityException e2) {
            a.e("Unexpected exception in key derivation.", e2, new Object[0]);
            return null;
        }
    }

    public erk(Context context) {
        this.e = context;
    }

    public final ert a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        acwa a2 = gac.a(this.e).a((ihb) new gag("authzen", new Account(str, "com.google")));
        try {
            acws.a(a2, b, TimeUnit.MILLISECONDS);
            ExportedSymmetricKey exportedSymmetricKey = (ExportedSymmetricKey) a2.d();
            long j = exportedSymmetricKey.c;
            SecretKeySpec a3 = a(ausq.a(exportedSymmetricKey.b));
            if (a3 != null) {
                return new ert(str, a3.getEncoded(), j);
            }
            a.e("Failed to derive secret for %s.", iwd.a((Object) str));
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            a.e("Error fetching key from Cryptauth", e2, new Object[0]);
            return null;
        }
    }
}
