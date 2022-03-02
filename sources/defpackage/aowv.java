package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;

/* renamed from: aowv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aowv {
    private static final String a = aowv.class.getSimpleName();
    private final aoul b;
    private final boolean c;
    private final aotx d;
    private final aoyw e;
    private final aouk f;
    private final aowz g;

    public aowv(aowu aowu) {
        aouk aouk;
        aoul aoul = aowu.a;
        this.b = aoul;
        if (aoul != null) {
            aowz aowz = aowu.d;
            this.g = aowz;
            if (aowz != null) {
                this.c = true;
                if (aowu.b != null) {
                    if (c()) {
                        String str = aowu.b;
                        String a2 = apdc.a("android-keystore://", str);
                        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                        instance.load((KeyStore.LoadStoreParameter) null);
                        if (!instance.containsAlias(a2)) {
                            String a3 = apdc.a("android-keystore://", str);
                            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            instance2.init(new KeyGenParameterSpec.Builder(a3, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                            instance2.generateKey();
                        }
                        new aowx();
                        this.d = aowx.a(str);
                    } else {
                        this.d = null;
                    }
                    this.e = aowu.c;
                    try {
                        aouk = b();
                    } catch (IOException e2) {
                        String str2 = a;
                        String valueOf = String.valueOf(e2.toString());
                        Log.i(str2, valueOf.length() == 0 ? new String("cannot read keyset: ") : "cannot read keyset: ".concat(valueOf));
                        if (this.e != null) {
                            aouk = aouk.a();
                            aouk.b(this.e);
                            if (c()) {
                                aouk.b().a(this.g, this.d);
                            } else {
                                aouj b2 = aouk.b();
                                aowz aowz2 = this.g;
                                if (!aowz2.a.putString(aowz2.b, apcq.a(b2.a.k())).commit()) {
                                    throw new IOException("Failed to write to SharedPreferences");
                                }
                            }
                        } else {
                            throw new GeneralSecurityException("cannot obtain keyset handle");
                        }
                    } catch (IOException e3) {
                        throw new GeneralSecurityException(e3);
                    }
                    this.f = aouk;
                    return;
                }
                throw new IllegalArgumentException("need a master key URI, please set it with Builder#masterKeyUri");
            }
            throw new IllegalArgumentException("need to specify where to write the keyset to with Builder#withSharedPref");
        }
        throw new IllegalArgumentException("need to specify where to read the keyset from with Builder#withSharedPref");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r0 = new java.lang.String("cannot decrypt keyset: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        r0 = "cannot decrypt keyset: ".concat(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[ExcHandler: GeneralSecurityException (e java.security.GeneralSecurityException), Splitter:B:2:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.aouk b() {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 != 0) goto L_0x0008
            goto L_0x0081
        L_0x0008:
            aoul r0 = r4.b     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aotx r1 = r4.d     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aowy r0 = (defpackage.aowy) r0     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            byte[] r0 = r0.b()     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aubs r2 = defpackage.aubs.b()     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aoyo r3 = defpackage.aoyo.c     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r0, (defpackage.aubs) r2)     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aoyo r0 = (defpackage.aoyo) r0     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            if (r0 == 0) goto L_0x0057
            auay r2 = r0.a     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            int r2 = r2.a()     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            if (r2 == 0) goto L_0x0057
            aouj r2 = new aouj     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            auay r0 = r0.a     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            byte[] r0 = r0.k()     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            r3 = 0
            byte[] r3 = new byte[r3]     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            byte[] r0 = r1.b(r0, r3)     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            aubs r1 = defpackage.aubs.b()     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            aoza r3 = defpackage.aoza.c     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r0, (defpackage.aubs) r1)     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            aoza r0 = (defpackage.aoza) r0     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            defpackage.aouj.b(r0)     // Catch:{ auda -> 0x004e, GeneralSecurityException -> 0x005f }
            r2.<init>(r0)     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            aouk r0 = defpackage.aouk.a((defpackage.aouj) r2)     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            return r0
        L_0x004e:
            r0 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            java.lang.String r1 = "invalid keyset, corrupted key material"
            r0.<init>(r1)     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            throw r0     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
        L_0x0057:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            java.lang.String r1 = "empty keyset"
            r0.<init>(r1)     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
            throw r0     // Catch:{ auda -> 0x0061, GeneralSecurityException -> 0x005f }
        L_0x005f:
            r0 = move-exception
            goto L_0x0062
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            java.lang.String r1 = a
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "cannot decrypt keyset: "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x007a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x007e
        L_0x007a:
            java.lang.String r0 = r2.concat(r0)
        L_0x007e:
            android.util.Log.i(r1, r0)
        L_0x0081:
            aoul r0 = r4.b
            aowy r0 = (defpackage.aowy) r0
            byte[] r0 = r0.b()
            aubs r1 = defpackage.aubs.b()
            aoza r2 = defpackage.aoza.c
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r0, (defpackage.aubs) r1)
            aoza r0 = (defpackage.aoza) r0
            aouj r0 = defpackage.aouj.a((defpackage.aoza) r0)
            boolean r1 = r4.c()
            if (r1 == 0) goto L_0x00a6
            aowz r1 = r4.g
            aotx r2 = r4.d
            r0.a(r1, r2)
        L_0x00a6:
            aouk r0 = defpackage.aouk.a((defpackage.aouj) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aowv.b():aouk");
    }

    private final boolean c() {
        return this.c && Build.VERSION.SDK_INT >= 23;
    }

    public final synchronized aouj a() {
        return this.f.b();
    }
}
