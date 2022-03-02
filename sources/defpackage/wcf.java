package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: wcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wcf {
    public final wbo a;
    public final whf b;
    public boolean c;
    public final ExecutorService d = tid.c();
    private final Context e;
    private final SecureRandom f;
    private final wgz g;
    private final auay h;
    private int i = 0;

    public wcf(Context context, wbo wbo, wgz wgz, whf whf, auay auay) {
        this.e = context;
        this.a = wbo;
        this.g = wgz;
        this.b = whf;
        this.f = new SecureRandom();
        this.h = auay;
    }

    private static long a(long j, long j2) {
        long j3 = j + j2;
        if (j2 < 0 && j3 > j) {
            return Long.MIN_VALUE;
        }
        if (j2 <= 0 || j3 >= j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    private static final boolean b(vhk vhk) {
        return vhk.f <= System.currentTimeMillis();
    }

    private static final boolean c(vhk vhk) {
        long currentTimeMillis = System.currentTimeMillis();
        return vhk.e <= currentTimeMillis && currentTimeMillis < vhk.f;
    }

    private final vhl g(Account account) {
        byte[] bArr;
        String str;
        vhl vhl;
        long j;
        String str2;
        int i2;
        int i3;
        vhl vhl2;
        String str3;
        long j2;
        String str4;
        long j3;
        String str5;
        String str6;
        long j4;
        String str7;
        Account account2 = account;
        String f2 = this.a.f();
        if (f2 != null) {
            bArr = f2.getBytes();
        } else {
            bArr = null;
        }
        aucx aucx = b(account).a;
        int size = aucx.size();
        char c2 = 0;
        int i4 = 0;
        while (true) {
            str = "g";
            if (i4 >= size) {
                break;
            }
            vhl vhl3 = (vhl) aucx.get(i4);
            vhk vhk = vhl3.b;
            if (vhk == null) {
                vhk = vhk.l;
            }
            if (a(vhk, bArr)) {
                vhk vhk2 = vhl3.c;
                if (vhk2 == null) {
                    vhk2 = vhk.l;
                }
                i4++;
                if (!a(vhk2, bArr)) {
                    break;
                }
            } else {
                break;
            }
        }
        ((anih) ((anih) vvj.a.d()).a("wcf", str, 1102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Current private certificates are not advertisable. Deleting all.");
        e(account);
        long currentTimeMillis = System.currentTimeMillis();
        aucx aucx2 = b(account).a;
        int size2 = aucx2.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            vhl vhl4 = (vhl) aucx2.get(i6);
            vhk vhk3 = vhl4.b;
            if (vhk3 == null) {
                vhk3 = vhk.l;
            }
            if (!b(vhk3)) {
                vhk vhk4 = vhl4.b;
                if (vhk4 == null) {
                    vhk4 = vhk.l;
                }
                currentTimeMillis = Math.max(currentTimeMillis, vhk4.f);
                i5++;
            }
        }
        int i7 = i5;
        while (i7 < 3) {
            String f3 = this.a.f();
            String d2 = this.a.d();
            String e2 = this.a.e();
            if (TextUtils.isEmpty(f3) || TextUtils.isEmpty(d2) || TextUtils.isEmpty(e2)) {
                i2 = i7;
                j = currentTimeMillis;
                str2 = str;
                i3 = i5;
                vhl2 = null;
            } else {
                byte[] a2 = a(32);
                byte[][] bArr2 = new byte[1][];
                bArr2[c2] = a2;
                byte[] a3 = a(bArr2);
                byte[] a4 = a(32);
                byte[] a5 = a(a4);
                if (a3 == null) {
                    i2 = i7;
                    j3 = currentTimeMillis;
                    str5 = str;
                    i3 = i5;
                    str4 = "a";
                } else if (a5 != null) {
                    i3 = i5;
                    i2 = i7;
                    String encodeToString = Base64.encodeToString(a3, 11);
                    String encodeToString2 = Base64.encodeToString(a5, 11);
                    if (encodeToString == null) {
                        j4 = currentTimeMillis;
                        str2 = str;
                        str6 = "a";
                    } else if (encodeToString2 != null) {
                        str2 = str;
                        String str8 = encodeToString.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString);
                        String str9 = encodeToString2.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString2);
                        X509Certificate a6 = a(str8, currentTimeMillis);
                        X509Certificate a7 = a(str9, currentTimeMillis);
                        if (a6 == null) {
                            j = currentTimeMillis;
                            str7 = "a";
                        } else if (a7 != null) {
                            j = currentTimeMillis;
                            aucd o = vhk.l.o();
                            auay a8 = auay.a(a3);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            vhk vhk5 = (vhk) o.b;
                            a8.getClass();
                            String str10 = "a";
                            int i8 = vhk5.a | 1;
                            vhk5.a = i8;
                            vhk5.b = a8;
                            str8.getClass();
                            vhk5.a = i8 | 2;
                            vhk5.c = str8;
                            long time = a6.getNotBefore().getTime();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            vhk vhk6 = (vhk) o.b;
                            vhk6.a |= 8;
                            vhk6.e = time;
                            long time2 = a6.getNotAfter().getTime();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            vhk vhk7 = (vhk) o.b;
                            vhk7.a |= 16;
                            vhk7.f = time2;
                            auay a9 = auay.a(a2);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            vhk vhk8 = (vhk) o.b;
                            a9.getClass();
                            vhk8.a |= 4;
                            vhk8.d = a9;
                            auay a10 = auay.a(a(14));
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            vhk vhk9 = (vhk) o.b;
                            a10.getClass();
                            int i9 = vhk9.a | 32;
                            vhk9.a = i9;
                            vhk9.h = a10;
                            f3.getClass();
                            int i10 = i9 | 64;
                            vhk9.a = i10;
                            vhk9.i = f3;
                            d2.getClass();
                            int i11 = i10 | 128;
                            vhk9.a = i11;
                            vhk9.j = d2;
                            e2.getClass();
                            vhk9.a = i11 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            vhk9.k = e2;
                            vhk vhk10 = (vhk) o.i();
                            aucd o2 = vhk.l.o();
                            auay a11 = auay.a(a5);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            vhk vhk11 = (vhk) o2.b;
                            a11.getClass();
                            int i12 = vhk11.a | 1;
                            vhk11.a = i12;
                            vhk11.b = a11;
                            str9.getClass();
                            vhk11.a = i12 | 2;
                            vhk11.c = str9;
                            long time3 = a6.getNotBefore().getTime();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            vhk vhk12 = (vhk) o2.b;
                            vhk12.a |= 8;
                            vhk12.e = time3;
                            long time4 = a6.getNotAfter().getTime();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            vhk vhk13 = (vhk) o2.b;
                            vhk13.a |= 16;
                            vhk13.f = time4;
                            auay a12 = auay.a(a4);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            vhk vhk14 = (vhk) o2.b;
                            a12.getClass();
                            vhk14.a |= 4;
                            vhk14.d = a12;
                            auay a13 = auay.a(a(14));
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            vhk vhk15 = (vhk) o2.b;
                            a13.getClass();
                            int i13 = vhk15.a | 32;
                            vhk15.a = i13;
                            vhk15.h = a13;
                            f3.getClass();
                            int i14 = i13 | 64;
                            vhk15.a = i14;
                            vhk15.i = f3;
                            d2.getClass();
                            int i15 = i14 | 128;
                            vhk15.a = i15;
                            vhk15.j = d2;
                            e2.getClass();
                            vhk15.a = i15 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            vhk15.k = e2;
                            vhk vhk16 = (vhk) o2.i();
                            aucd o3 = vhl.d.o();
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            vhl vhl5 = (vhl) o3.b;
                            vhk10.getClass();
                            vhl5.b = vhk10;
                            int i16 = vhl5.a | 1;
                            vhl5.a = i16;
                            vhk16.getClass();
                            vhl5.c = vhk16;
                            vhl5.a = i16 | 2;
                            vhl2 = (vhl) o3.i();
                            if (!a(account2, vhl2)) {
                                ((anih) ((anih) vvj.a.d()).a("wcf", str10, 415, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to save the certificate.");
                                vhl2 = null;
                            }
                        } else {
                            j = currentTimeMillis;
                            str7 = "a";
                        }
                        ((anih) ((anih) vvj.a.d()).a("wcf", str7, 370, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to create the certificate with alias %s, %s.", (Object) str8, (Object) str9);
                        vhl2 = null;
                    } else {
                        j4 = currentTimeMillis;
                        str2 = str;
                        str6 = "a";
                    }
                    ((anih) ((anih) vvj.a.d()).a("wcf", str6, 358, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to create the paired key alias.");
                    vhl2 = null;
                } else {
                    i2 = i7;
                    j3 = currentTimeMillis;
                    str5 = str;
                    i3 = i5;
                    str4 = "a";
                }
                ((anih) ((anih) vvj.a.d()).a("wcf", str4, 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to create a secret id.");
                vhl2 = null;
            }
            if (vhl2 == null) {
                str3 = str2;
                ((anih) ((anih) vvj.a.d()).a("wcf", str3, 1123, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create new private certificate.");
                j2 = j;
            } else {
                str3 = str2;
                vhk vhk17 = vhl2.b;
                if (vhk17 == null) {
                    vhk17 = vhk.l;
                }
                j2 = vhk17.f;
            }
            str = str3;
            i5 = i3;
            currentTimeMillis = j2;
            i7 = i2 + 1;
            c2 = 0;
        }
        int i17 = i5;
        aucx aucx3 = b(account).a;
        int size3 = aucx3.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                vhl = null;
                break;
            }
            vhl vhl6 = (vhl) aucx3.get(i18);
            vhk vhk18 = vhl6.b;
            if (vhk18 == null) {
                vhk18 = vhk.l;
            }
            if (c(vhk18)) {
                vhk vhk19 = vhl6.c;
                if (vhk19 == null) {
                    vhk19 = vhk.l;
                }
                if (c(vhk19)) {
                    vhl = vhl6;
                    break;
                }
            }
            i18++;
        }
        if (vhl == null) {
            e(account);
            if (this.i != 0 && (TextUtils.isEmpty(this.a.e()) || TextUtils.isEmpty(this.a.d()))) {
                a((Runnable) new wcb(this, account2));
            }
        } else if (i17 < 3) {
            a((Runnable) new wcc(this, account2));
        }
        return vhl;
    }

    private final File h(Account account) {
        return who.a(this.e, account, "nearby_sharing_public_certificate_book");
    }

    private final wce j() {
        return new wce(whu.a(14, this.f), whu.a(2, this.f));
    }

    private final void k() {
        FileInputStream fileInputStream;
        List a2 = who.a(this.e, "nearby_sharing_private_certificate_book");
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                fileInputStream = new FileInputStream((File) a2.get(i2));
                for (vhl vhl : ((vhm) aucj.a((aucj) vhm.b, (InputStream) fileInputStream)).a) {
                    try {
                        wgz wgz = this.g;
                        vhk vhk = vhl.b;
                        if (vhk == null) {
                            vhk = vhk.l;
                        }
                        wgz.b(vhk.c);
                    } catch (KeyStoreException e2) {
                    }
                    try {
                        wgz wgz2 = this.g;
                        vhk vhk2 = vhl.c;
                        if (vhk2 == null) {
                            vhk2 = vhk.l;
                        }
                        wgz2.b(vhk2.c);
                    } catch (KeyStoreException e3) {
                    }
                }
                fileInputStream.close();
            } catch (auda e4) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e4);
                ((anih) anih.a("wcf", "k", 1584, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read proto objects. Delete all certificate files.");
                g();
            } catch (IOException e5) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e5);
                ((anih) anih2.a("wcf", "k", 1588, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read PRIVATE_CERTIFICATES_BOOK");
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        return;
        throw th;
    }

    public final synchronized void b(int i2) {
        this.i = i2;
    }

    /* access modifiers changed from: package-private */
    public final File d(Account account) {
        return who.a(this.e, account, "nearby_sharing_private_certificate_book");
    }

    public final synchronized List e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Account b2 = this.a.b();
        if (!(b2 == null || this.a.c() == null)) {
            aucx aucx = b(b2).a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                vhl vhl = (vhl) aucx.get(i2);
                vhk vhk = vhl.b;
                if (vhk == null) {
                    vhk = vhk.l;
                }
                vhn a2 = a(vhk);
                if (a2 != null) {
                    arrayList.add(a2);
                }
                if (this.i == 2) {
                    vhk vhk2 = vhl.c;
                    if (vhk2 == null) {
                        vhk2 = vhk.l;
                    }
                    vhn a3 = a(vhk2);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void f() {
        Account b2 = this.a.b();
        if (b2 != null) {
            e(b2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        ((anih) ((anih) vvj.a.d()).a("wcf", "i", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Running certificates syncing task.");
        d();
        Account b2 = this.a.b();
        if (b2 != null && !this.c) {
            this.c = f(b2);
        }
    }

    private final vhn a(vhk vhk) {
        try {
            X509Certificate x509Certificate = (X509Certificate) this.g.a(vhk.c);
            if (x509Certificate == null) {
                return null;
            }
            aucd o = vhj.f.o();
            auay auay = this.h;
            if (o.c) {
                o.c();
                o.c = false;
            }
            vhj vhj = (vhj) o.b;
            auay.getClass();
            int i2 = vhj.a | 8;
            vhj.a = i2;
            vhj.e = auay;
            String str = vhk.i;
            str.getClass();
            int i3 = i2 | 1;
            vhj.a = i3;
            vhj.b = str;
            String str2 = vhk.j;
            str2.getClass();
            int i4 = i3 | 2;
            vhj.a = i4;
            vhj.c = str2;
            String str3 = vhk.k;
            str3.getClass();
            vhj.a = i4 | 4;
            vhj.d = str3;
            byte[] b2 = b(((vhj) o.i()).k(), vhk.h.k(), vhk.d.k());
            aucd o2 = vhn.i.o();
            auay auay2 = vhk.b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vhn vhn = (vhn) o2.b;
            auay2.getClass();
            int i5 = vhn.a | 1;
            vhn.a = i5;
            vhn.b = auay2;
            auay auay3 = vhk.d;
            auay3.getClass();
            vhn.a = i5 | 2;
            vhn.c = auay3;
            auay a2 = auay.a(x509Certificate.getPublicKey().getEncoded());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vhn vhn2 = (vhn) o2.b;
            a2.getClass();
            vhn2.a |= 4;
            vhn2.d = a2;
            long millis = vhk.e - TimeUnit.MINUTES.toMillis((long) this.f.nextInt((int) ayni.e()));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vhn vhn3 = (vhn) o2.b;
            vhn3.a |= 8;
            vhn3.e = millis;
            long millis2 = vhk.f + TimeUnit.MINUTES.toMillis((long) this.f.nextInt((int) ayni.e()));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vhn vhn4 = (vhn) o2.b;
            vhn4.a |= 16;
            vhn4.f = millis2;
            auay a3 = auay.a(b2);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vhn vhn5 = (vhn) o2.b;
            a3.getClass();
            vhn5.a |= 32;
            vhn5.g = a3;
            auay a4 = auay.a(b(vhk.h.k()));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            vhn vhn6 = (vhn) o2.b;
            a4.getClass();
            vhn6.a |= 64;
            vhn6.h = a4;
            return (vhn) o2.i();
        } catch (KeyStoreException e2) {
            return null;
        }
    }

    private static boolean b(vhn vhn) {
        long j = vhn.f;
        return j <= a(j, -1800000);
    }

    private static boolean c(vhn vhn) {
        return (vhn.a & 1) != 0 && !b(vhn);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0028, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.vhk d() {
        /*
            r3 = this;
            monitor-enter(r3)
            wbo r0 = r3.a     // Catch:{ all -> 0x0029 }
            android.accounts.Account r0 = r0.b()     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 == 0) goto L_0x0027
            vhl r0 = r3.g(r0)     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            int r2 = r3.i     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0027
            r1 = 2
            if (r2 == r1) goto L_0x001f
            vhk r0 = r0.b     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x001d
            vhk r0 = defpackage.vhk.l     // Catch:{ all -> 0x0029 }
        L_0x001d:
            monitor-exit(r3)
            return r0
        L_0x001f:
            vhk r0 = r0.c     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0025
            vhk r0 = defpackage.vhk.l     // Catch:{ all -> 0x0029 }
        L_0x0025:
            monitor-exit(r3)
            return r0
        L_0x0027:
            monitor-exit(r3)
            return r1
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcf.d():vhk");
    }

    public final synchronized void h() {
        k();
        g();
        ((anih) ((anih) vvj.a.d()).a("wcf", "h", 1622, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("CertificateManager has been reset");
    }

    private static byte[] b(byte[] bArr) {
        byte[] a2 = whu.a(bArr, new byte[16]);
        return a2 == null ? whu.a(32) : a2;
    }

    /* access modifiers changed from: package-private */
    public final vho c(Account account) {
        FileInputStream fileInputStream;
        File h2 = h(account);
        if (!h2.exists()) {
            return vho.b;
        }
        try {
            fileInputStream = new FileInputStream(h2);
            aucd o = vho.b.o();
            for (vhn vhn : ((vho) aucj.a((aucj) vho.b, (InputStream) fileInputStream)).a) {
                long currentTimeMillis = System.currentTimeMillis();
                if (a(vhn.e, -1800000) <= currentTimeMillis && currentTimeMillis < a(vhn.f, 1800000)) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    vho vho = (vho) o.b;
                    vhn.getClass();
                    vho.a();
                    vho.a.add(vhn);
                }
            }
            vho vho2 = (vho) o.i();
            fileInputStream.close();
            return vho2;
        } catch (auda e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wcf", "c", 1474, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read proto objects. Delete all certificate files.");
            g();
            return vho.b;
        } catch (IOException e3) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("wcf", "c", 1478, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read PUBLIC_CERTIFICATES_BOOK");
            return vho.b;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final boolean f(Account account) {
        if (this.i != 0) {
            List a2 = a(account);
            if (!a2.isEmpty()) {
                return this.b.a(account, a2);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final vhm b(Account account) {
        FileInputStream fileInputStream;
        File d2 = d(account);
        if (!d2.exists()) {
            return vhm.b;
        }
        try {
            fileInputStream = new FileInputStream(d2);
            vhm vhm = (vhm) aucj.a((aucj) vhm.b, (InputStream) fileInputStream);
            fileInputStream.close();
            return vhm;
        } catch (auda e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wcf", "b", 1442, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read proto objects. Delete all certificate files.");
            g();
            return vhm.b;
        } catch (IOException e3) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("wcf", "b", 1446, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read PRIVATE_CERTIFICATES_BOOK");
            return vhm.b;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final wce d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] a2 = a(bArr.length);
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            int length = bArr2.length;
            if (length == 0) {
                bArr2 = new byte[32];
            } else if (length != 32) {
                bArr2 = a(bArr2, 32);
            }
            try {
                instance.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(a(bArr3, 16)));
                try {
                    return new wce(instance.doFinal(bArr), bArr3);
                } catch (BadPaddingException | IllegalBlockSizeException e2) {
                    return new wce(a2, bArr3);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                return new wce(a2, bArr3);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            return new wce(a2, bArr3);
        }
    }

    public final synchronized void e(Account account) {
        File[] listFiles;
        aucx aucx = b(account).a;
        if (!aucx.isEmpty()) {
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                vhl vhl = (vhl) aucx.get(i2);
                try {
                    wgz wgz = this.g;
                    vhk vhk = vhl.b;
                    if (vhk == null) {
                        vhk = vhk.l;
                    }
                    wgz.b(vhk.c);
                } catch (KeyStoreException e2) {
                }
                try {
                    wgz wgz2 = this.g;
                    vhk vhk2 = vhl.c;
                    if (vhk2 == null) {
                        vhk2 = vhk.l;
                    }
                    wgz2.b(vhk2.c);
                } catch (KeyStoreException e3) {
                }
            }
            String[] strArr = {"nearby_sharing_private_certificate_book"};
            File file = new File(String.format("%s/%s", new Object[]{who.a(this.e).getAbsolutePath(), account.name}));
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.exists()) {
                        if (strArr[0].equals(file2.getName())) {
                            file2.delete();
                        }
                    }
                }
                File[] listFiles2 = file.listFiles();
                if (listFiles2 != null) {
                    if (listFiles2.length == 0) {
                        file.delete();
                    }
                }
            }
            thp.a(this.e, "com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        }
    }

    public final synchronized void b() {
        a((Runnable) new wca(this));
    }

    public final synchronized byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Cipher instance;
        SecretKeySpec secretKeySpec = new SecretKeySpec(a(bArr2, 32), "AES");
        try {
            instance = Cipher.getInstance("AES/GCM/NoPadding");
            try {
                instance.init(1, secretKeySpec, new GCMParameterSpec(32, a(bArr3, 12)));
                try {
                } catch (BadPaddingException | IllegalBlockSizeException e2) {
                    anih anih = (anih) vvj.a.c();
                    anih.a(e2);
                    ((anih) anih.a("wcf", "b", 869, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to encrypt with secret key. Returning a random value.");
                    return a(12);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a(e3);
                ((anih) anih2.a("wcf", "b", 861, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to encrypt with secret key. Returning a random value.");
                return a(12);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            anih anih3 = (anih) vvj.a.c();
            anih3.a(e4);
            ((anih) anih3.a("wcf", "b", 848, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to encrypt with secret key. Returning a random value.");
            return a(12);
        }
        return instance.doFinal(bArr);
    }

    public final synchronized wce c() {
        vhk vhk;
        Account b2 = this.a.b();
        if (b2 == null) {
            return j();
        }
        vhl g2 = g(b2);
        if (g2 != null) {
            int i2 = this.i;
            if (i2 != 0) {
                if (i2 != 2) {
                    vhk = g2.b;
                    if (vhk == null) {
                        vhk = vhk.l;
                    }
                } else {
                    vhk = g2.c;
                    if (vhk == null) {
                        vhk = vhk.l;
                    }
                }
                if (((long) vhk.g.size()) >= ayni.a.a().aq()) {
                    ((anih) ((anih) vvj.a.d()).a("wcf", "c", 947, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exhausted all salts: refreshing all certificates");
                    e(b2);
                    vhk = d();
                }
                if (vhk != null) {
                    aucs aucs = vhk.g;
                    for (int i3 = 0; i3 < 128; i3++) {
                        byte[] a2 = a(2);
                        short a3 = aoom.a(a2);
                        if (!aucs.contains(Integer.valueOf(a3))) {
                            aucd aucd = (aucd) g2.c(5);
                            aucd.a((aucj) g2);
                            int i4 = this.i;
                            if (i4 != 0) {
                                if (i4 != 2) {
                                    aucd aucd2 = (aucd) vhk.c(5);
                                    aucd2.a((aucj) vhk);
                                    aucd2.z((int) a3);
                                    vhk vhk2 = (vhk) aucd2.i();
                                    if (aucd.c) {
                                        aucd.c();
                                        aucd.c = false;
                                    }
                                    vhl vhl = (vhl) aucd.b;
                                    vhk2.getClass();
                                    vhl.b = vhk2;
                                    vhl.a |= 1;
                                } else {
                                    aucd aucd3 = (aucd) vhk.c(5);
                                    aucd3.a((aucj) vhk);
                                    aucd3.z((int) a3);
                                    vhk vhk3 = (vhk) aucd3.i();
                                    if (aucd.c) {
                                        aucd.c();
                                        aucd.c = false;
                                    }
                                    vhl vhl2 = (vhl) aucd.b;
                                    vhk3.getClass();
                                    vhl2.c = vhk3;
                                    vhl2.a |= 2;
                                }
                                a(b2, (vhl) aucd.i());
                                return d(vhk.h.k(), vhk.d.k(), a2);
                            }
                            return j();
                        }
                    }
                    ((anih) ((anih) vvj.a.c()).a("wcf", "c", 983, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to generate a salt: this should never happen");
                    return j();
                }
                return j();
            }
            return j();
        }
        return j();
    }

    private final boolean a(Account account, vho vho) {
        FileOutputStream fileOutputStream;
        File h2 = h(account);
        if (!h2.exists()) {
            try {
                h2.createNewFile();
            } catch (IOException e2) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("wcf", "a", 470, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save public certificates to disk. Unable to create the file.");
                return false;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(h2);
            vho.a(fileOutputStream);
            ((anih) ((anih) vvj.a.d()).a("wcf", "a", 478, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Saved public certificates to disk.");
            fileOutputStream.close();
            return true;
        } catch (IOException e3) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("wcf", "a", 481, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save public certificates to disk.");
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private final boolean a(vhk vhk, byte[] bArr) {
        try {
            wce d2 = d(vhk.h.k(), vhk.d.k(), new byte[2]);
            wby.a(d2.b, d2.a, bArr);
            if (!ius.a(this.a.d(), vhk.j) || !ius.a(this.a.e(), vhk.k) || !ius.a(this.a.f(), vhk.i)) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException | NullPointerException e2) {
            return false;
        }
    }

    public final synchronized byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Cipher instance;
        SecretKeySpec secretKeySpec = new SecretKeySpec(a(bArr2, 32), "AES");
        try {
            instance = Cipher.getInstance("AES/GCM/NoPadding");
            try {
                instance.init(2, secretKeySpec, new GCMParameterSpec(32, a(bArr3, 12)));
                try {
                } catch (IllegalBlockSizeException e2) {
                    anih anih = (anih) vvj.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("wcf", "c", 913, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to decrypt bytes with secret key.");
                    return null;
                } catch (BadPaddingException e3) {
                    ((anih) ((anih) vvj.a.d()).a("wcf", "c", 918, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to decrypt bytes with secret key. BadPaddingException");
                    return null;
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a(e4);
                ((anih) anih2.a("wcf", "c", 906, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to decrypt bytes with secret key.");
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e5) {
            anih anih3 = (anih) vvj.a.c();
            anih3.a(e5);
            ((anih) anih3.a("wcf", "c", 895, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to decrypt bytes with secret key.");
            return null;
        }
        return instance.doFinal(bArr);
    }

    private static byte[] a(byte[] bArr, int i2) {
        byte[] a2 = whu.a(bArr, new byte[32], i2);
        return a2 == null ? whu.a(i2) : a2;
    }

    static final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            try {
                instance.init(2, secretKeySpec, new IvParameterSpec(a(bArr3, 16)));
                try {
                    byte[] doFinal = instance.doFinal(bArr);
                    if (!Arrays.equals(b(doFinal), bArr4)) {
                        return null;
                    }
                    return doFinal;
                } catch (BadPaddingException | IllegalBlockSizeException e2) {
                    return null;
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            return null;
        }
    }

    private static byte[] a(byte[]... bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (byte[] update : bArr) {
                instance.update(update);
            }
            byte[] digest = instance.digest();
            ((anih) ((anih) vvj.a.d()).a("wcf", "a", 585, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Generated ID from certificate.");
            return digest;
        } catch (NoSuchAlgorithmException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wcf", "a", 588, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to generate ID from certificate.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final X509Certificate a(String str, long j) {
        try {
            Certificate a2 = this.g.a(str);
            if (a2 != null) {
                X509Certificate x509Certificate = (X509Certificate) a2;
                long currentTimeMillis = System.currentTimeMillis();
                if (x509Certificate.getNotBefore().getTime() > currentTimeMillis || currentTimeMillis >= x509Certificate.getNotAfter().getTime()) {
                    this.g.b(str);
                    ((anih) ((anih) vvj.a.d()).a("wcf", "a", 627, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Deleted expired paired key.");
                } else {
                    ((anih) ((anih) vvj.a.d()).a("wcf", "a", 623, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No need to create paired key. Already exists.");
                    return x509Certificate;
                }
            }
            Date date = new Date(j);
            Date date2 = new Date(j + ayni.a.a().o());
            KeyGenParameterSpec.Builder keyValidityForOriginationEnd = new KeyGenParameterSpec.Builder(str, 12).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setCertificateSubject(new X500Principal("O=Google, OU=Android, C=US")).setRandomizedEncryptionRequired(false).setCertificateNotBefore(date).setCertificateNotAfter(date2).setKeyValidityForOriginationEnd(date2);
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                try {
                    instance.initialize(keyValidityForOriginationEnd.build());
                    try {
                        instance.generateKeyPair();
                        ((anih) ((anih) vvj.a.d()).a("wcf", "a", 673, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully create paired key.");
                        try {
                            return (X509Certificate) this.g.a(str);
                        } catch (KeyStoreException e2) {
                            anih anih = (anih) vvj.a.c();
                            anih.a((Throwable) e2);
                            ((anih) anih.a("wcf", "a", 677, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                            return null;
                        }
                    } catch (ProviderException e3) {
                        anih anih2 = (anih) vvj.a.c();
                        anih2.a((Throwable) e3);
                        ((anih) anih2.a("wcf", "a", 669, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                        return null;
                    }
                } catch (InvalidAlgorithmParameterException e4) {
                    anih anih3 = (anih) vvj.a.c();
                    anih3.a((Throwable) e4);
                    ((anih) anih3.a("wcf", "a", 662, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                    return null;
                }
            } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
                anih anih4 = (anih) vvj.a.c();
                anih4.a(e5);
                ((anih) anih4.a("wcf", "a", 655, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
                return null;
            }
        } catch (KeyStoreException e6) {
            anih anih5 = (anih) vvj.a.c();
            anih5.a((Throwable) e6);
            ((anih) anih5.a("wcf", "a", 631, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create paired key.");
            return null;
        }
    }

    public final synchronized List a(Account account) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        aucx aucx = b(account).a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            vhl vhl = (vhl) aucx.get(i2);
            vhk vhk = vhl.b;
            if (vhk == null) {
                vhk = vhk.l;
            }
            vhn a2 = a(vhk);
            if (a2 != null) {
                arrayList.add(new whe(a2, vhk.h, false));
            }
            vhk vhk2 = vhl.c;
            if (vhk2 == null) {
                vhk2 = vhk.l;
            }
            vhn a3 = a(vhk2);
            if (a3 != null) {
                arrayList.add(new whe(a3, vhk2.h, true));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final vhl a(Account account, long j) {
        String str;
        String str2;
        String str3;
        long j2 = j;
        String f2 = this.a.f();
        String d2 = this.a.d();
        String e2 = this.a.e();
        if (TextUtils.isEmpty(f2) || TextUtils.isEmpty(d2) || TextUtils.isEmpty(e2)) {
            return null;
        }
        byte[] a2 = a(32);
        byte[] a3 = a(a2);
        byte[] a4 = a(32);
        byte[] a5 = a(a4);
        if (a3 == null) {
            str = "wcf";
        } else if (a5 != null) {
            String encodeToString = Base64.encodeToString(a3, 11);
            String encodeToString2 = Base64.encodeToString(a5, 11);
            if (encodeToString == null) {
                str2 = "wcf";
            } else if (encodeToString2 != null) {
                String str4 = encodeToString.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString);
                String str5 = encodeToString2.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString2);
                X509Certificate a6 = a(str4, j2);
                X509Certificate a7 = a(str5, j2);
                if (a6 == null) {
                    str3 = "wcf";
                } else if (a7 != null) {
                    aucd o = vhk.l.o();
                    auay a8 = auay.a(a3);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    vhk vhk = (vhk) o.b;
                    a8.getClass();
                    String str6 = "wcf";
                    int i2 = vhk.a | 1;
                    vhk.a = i2;
                    vhk.b = a8;
                    str4.getClass();
                    vhk.a = i2 | 2;
                    vhk.c = str4;
                    long time = a6.getNotBefore().getTime();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    vhk vhk2 = (vhk) o.b;
                    vhk2.a |= 8;
                    vhk2.e = time;
                    long time2 = a6.getNotAfter().getTime();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    vhk vhk3 = (vhk) o.b;
                    vhk3.a |= 16;
                    vhk3.f = time2;
                    auay a9 = auay.a(a2);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    vhk vhk4 = (vhk) o.b;
                    a9.getClass();
                    vhk4.a |= 4;
                    vhk4.d = a9;
                    auay a10 = auay.a(a(14));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    vhk vhk5 = (vhk) o.b;
                    a10.getClass();
                    int i3 = vhk5.a | 32;
                    vhk5.a = i3;
                    vhk5.h = a10;
                    f2.getClass();
                    int i4 = i3 | 64;
                    vhk5.a = i4;
                    vhk5.i = f2;
                    d2.getClass();
                    int i5 = i4 | 128;
                    vhk5.a = i5;
                    vhk5.j = d2;
                    e2.getClass();
                    vhk5.a = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    vhk5.k = e2;
                    vhk vhk6 = (vhk) o.i();
                    aucd o2 = vhk.l.o();
                    auay a11 = auay.a(a5);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    vhk vhk7 = (vhk) o2.b;
                    a11.getClass();
                    int i6 = vhk7.a | 1;
                    vhk7.a = i6;
                    vhk7.b = a11;
                    str5.getClass();
                    vhk7.a = i6 | 2;
                    vhk7.c = str5;
                    long time3 = a6.getNotBefore().getTime();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    vhk vhk8 = (vhk) o2.b;
                    vhk8.a |= 8;
                    vhk8.e = time3;
                    long time4 = a6.getNotAfter().getTime();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    vhk vhk9 = (vhk) o2.b;
                    vhk9.a |= 16;
                    vhk9.f = time4;
                    auay a12 = auay.a(a4);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    vhk vhk10 = (vhk) o2.b;
                    a12.getClass();
                    vhk10.a |= 4;
                    vhk10.d = a12;
                    auay a13 = auay.a(a(14));
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    vhk vhk11 = (vhk) o2.b;
                    a13.getClass();
                    int i7 = vhk11.a | 32;
                    vhk11.a = i7;
                    vhk11.h = a13;
                    f2.getClass();
                    int i8 = i7 | 64;
                    vhk11.a = i8;
                    vhk11.i = f2;
                    d2.getClass();
                    int i9 = i8 | 128;
                    vhk11.a = i9;
                    vhk11.j = d2;
                    e2.getClass();
                    vhk11.a = i9 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    vhk11.k = e2;
                    vhk vhk12 = (vhk) o2.i();
                    aucd o3 = vhl.d.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    vhl vhl = (vhl) o3.b;
                    vhk6.getClass();
                    vhl.b = vhk6;
                    int i10 = vhl.a | 1;
                    vhl.a = i10;
                    vhk12.getClass();
                    vhl.c = vhk12;
                    vhl.a = i10 | 2;
                    vhl vhl2 = (vhl) o3.i();
                    if (a(account, vhl2)) {
                        return vhl2;
                    }
                    ((anih) ((anih) vvj.a.d()).a(str6, "a", 415, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to save the certificate.");
                    return null;
                } else {
                    str3 = "wcf";
                }
                ((anih) ((anih) vvj.a.d()).a(str3, "a", 370, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to create the certificate with alias %s, %s.", (Object) str4, (Object) str5);
                return null;
            } else {
                str2 = "wcf";
            }
            ((anih) ((anih) vvj.a.d()).a(str2, "a", 358, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to create the paired key alias.");
            return null;
        } else {
            str = "wcf";
        }
        ((anih) ((anih) vvj.a.d()).a(str, "a", 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create private certificate because it failed to create a secret id.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        who.b(this.e, "nearby_sharing_private_certificate_book", "nearby_sharing_public_certificate_book");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r6 = c(r0.g.k(), r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r6 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r16 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6 = (defpackage.vhj) defpackage.aucj.a((defpackage.aucj) defpackage.vhj.f, r6, defpackage.aubs.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        if (android.text.TextUtils.isEmpty(r6.b) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.vvj.a.d()).a("wcf", "a", 1275, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Encrypted metadata does not contain device name. Ignore.");
        r16 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        r2 = new defpackage.wcd(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r16 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.wcd a(byte[] r19, byte[] r20) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            wbo r0 = r1.a     // Catch:{ all -> 0x00f2 }
            android.accounts.Account r2 = r0.b()     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = "wcf"
            java.lang.String r4 = "a"
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r6 = 0
            if (r2 != 0) goto L_0x0029
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x00f2 }
            anie r0 = r0.d()     // Catch:{ all -> 0x00f2 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00f2 }
            r2 = 1225(0x4c9, float:1.717E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r5)     // Catch:{ all -> 0x00f2 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "No active account has been set. Failed to query for public certificate."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r18)
            return r6
        L_0x0029:
            vho r0 = r1.c((android.accounts.Account) r2)     // Catch:{ all -> 0x00f2 }
            aucx r7 = r0.a     // Catch:{ all -> 0x00f2 }
            int r8 = r7.size()     // Catch:{ all -> 0x00f2 }
            r10 = 0
        L_0x0034:
            if (r10 >= r8) goto L_0x00ef
            java.lang.Object r0 = r7.get(r10)     // Catch:{ all -> 0x00f2 }
            vhn r0 = (defpackage.vhn) r0     // Catch:{ all -> 0x00f2 }
            auay r11 = r0.c     // Catch:{ all -> 0x00f2 }
            byte[] r11 = r11.k()     // Catch:{ all -> 0x00f2 }
            auay r12 = r0.h     // Catch:{ all -> 0x00f2 }
            byte[] r12 = r12.k()     // Catch:{ all -> 0x00f2 }
            r13 = r19
            r14 = r20
            byte[] r12 = a(r13, r11, r14, r12)     // Catch:{ all -> 0x00f2 }
            if (r12 == 0) goto L_0x00e6
            vhm r15 = r1.b((android.accounts.Account) r2)     // Catch:{ all -> 0x00f2 }
            aucx r15 = r15.a     // Catch:{ all -> 0x00f2 }
            int r9 = r15.size()     // Catch:{ all -> 0x00f2 }
            r6 = 0
        L_0x005d:
            if (r6 < r9) goto L_0x00a6
            auay r6 = r0.g     // Catch:{ all -> 0x00f2 }
            byte[] r6 = r6.k()     // Catch:{ all -> 0x00f2 }
            byte[] r6 = r1.c(r6, r12, r11)     // Catch:{ all -> 0x00f2 }
            if (r6 != 0) goto L_0x006f
            r16 = r2
            goto L_0x00e8
        L_0x006f:
            aubs r9 = defpackage.aubs.c()     // Catch:{ auda -> 0x00a2 }
            vhj r11 = defpackage.vhj.f     // Catch:{ auda -> 0x00a2 }
            aucj r6 = defpackage.aucj.a((defpackage.aucj) r11, (byte[]) r6, (defpackage.aubs) r9)     // Catch:{ auda -> 0x00a2 }
            vhj r6 = (defpackage.vhj) r6     // Catch:{ auda -> 0x00a2 }
            java.lang.String r9 = r6.b     // Catch:{ all -> 0x00f2 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x00f2 }
            if (r9 == 0) goto L_0x009b
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x00f2 }
            anie r0 = r0.d()     // Catch:{ all -> 0x00f2 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00f2 }
            r6 = 1275(0x4fb, float:1.787E-42)
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r6, (java.lang.String) r5)     // Catch:{ all -> 0x00f2 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = "Encrypted metadata does not contain device name. Ignore."
            r0.a((java.lang.String) r6)     // Catch:{ all -> 0x00f2 }
            r16 = r2
            goto L_0x00e8
        L_0x009b:
            wcd r2 = new wcd     // Catch:{ all -> 0x00f2 }
            r2.<init>(r0, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r18)
            return r2
        L_0x00a2:
            r0 = move-exception
            r16 = r2
            goto L_0x00e8
        L_0x00a6:
            java.lang.Object r16 = r15.get(r6)     // Catch:{ all -> 0x00f2 }
            r17 = r0
            r0 = r16
            vhl r0 = (defpackage.vhl) r0     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00b5
            r16 = r2
            goto L_0x00de
        L_0x00b5:
            r16 = r2
            vhk r2 = r0.b     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            vhk r2 = defpackage.vhk.l     // Catch:{ all -> 0x00f2 }
        L_0x00be:
            auay r2 = r2.h     // Catch:{ all -> 0x00f2 }
            byte[] r2 = r2.k()     // Catch:{ all -> 0x00f2 }
            boolean r2 = java.util.Arrays.equals(r2, r12)     // Catch:{ all -> 0x00f2 }
            if (r2 != 0) goto L_0x00e8
            vhk r0 = r0.c     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            vhk r0 = defpackage.vhk.l     // Catch:{ all -> 0x00f2 }
        L_0x00d1:
            auay r0 = r0.h     // Catch:{ all -> 0x00f2 }
            byte[] r0 = r0.k()     // Catch:{ all -> 0x00f2 }
            boolean r0 = java.util.Arrays.equals(r0, r12)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            int r6 = r6 + 1
            r2 = r16
            r0 = r17
            goto L_0x005d
        L_0x00e6:
            r16 = r2
        L_0x00e8:
            int r10 = r10 + 1
            r2 = r16
            r6 = 0
            goto L_0x0034
        L_0x00ef:
            monitor-exit(r18)
            r2 = 0
            return r2
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x00f6
        L_0x00f5:
            throw r0
        L_0x00f6:
            goto L_0x00f5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcf.a(byte[], byte[]):wcd");
    }

    public final synchronized void a() {
        a((Runnable) new wbz(this));
        b();
    }

    public final synchronized void a(Account account, List list) {
        ob obVar = new ob();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            vhn vhn = (vhn) list.get(i2);
            if (c(vhn)) {
                obVar.add(vhn.b);
                arrayList.add(vhn);
            }
        }
        aucx aucx = c(account).a;
        int size2 = aucx.size();
        for (int i3 = 0; i3 < size2; i3++) {
            vhn vhn2 = (vhn) aucx.get(i3);
            if (c(vhn2)) {
                if (!obVar.contains(vhn2.b)) {
                    arrayList.add(vhn2);
                }
            }
        }
        aucd o = vho.b.o();
        o.ac(arrayList);
        a(account, (vho) o.i());
        thp.a(this.e, "com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD");
    }

    public final synchronized void a(PrintWriter printWriter) {
        if (vvb.a() == 2 || vvb.a() == 3) {
            printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.provider.connections.CertificateManager"}));
            printWriter.write("  Public certificates:\n");
            Account b2 = this.a.b();
            if (b2 == null) {
                printWriter.write("    No public certificate stored on device.\n");
            } else {
                vho c2 = c(b2);
                printWriter.write(String.format("    Public certificates size: %s\n", new Object[]{Integer.valueOf(c2.a.size())}));
                aucx aucx = c2.a;
                int size = aucx.size();
                for (int i2 = 0; i2 < size; i2++) {
                    printWriter.write(String.format("    Public certificate: %s\n", new Object[]{Arrays.toString(((vhn) aucx.get(i2)).b.k())}));
                }
            }
            printWriter.write("  Private certificates:\n");
            Account b3 = this.a.b();
            if (b3 == null) {
                printWriter.write("    No private certificate stored on device.\n");
                return;
            }
            vhm b4 = b(b3);
            printWriter.write(String.format("    Private certificates size: %s\n", new Object[]{Integer.valueOf(b4.a.size())}));
            aucx aucx2 = b4.a;
            int size2 = aucx2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                vhl vhl = (vhl) aucx2.get(i3);
                Object[] objArr = new Object[2];
                vhk vhk = vhl.b;
                if (vhk == null) {
                    vhk = vhk.l;
                }
                objArr[0] = Arrays.toString(vhk.b.k());
                vhk vhk2 = vhl.c;
                if (vhk2 == null) {
                    vhk2 = vhk.l;
                }
                objArr[1] = Arrays.toString(vhk2.b.k());
                printWriter.write(String.format("    Private certificate: %s, %s\n", objArr));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Account account, vhl vhl) {
        FileOutputStream fileOutputStream;
        vhk vhk = vhl.b;
        if (vhk == null) {
            vhk = vhk.l;
        }
        if (b(vhk)) {
            ((anih) ((anih) vvj.a.d()).a("wcf", "a", 499, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save private certificate to disk. Certificate is invalid.");
            return false;
        }
        File d2 = d(account);
        if (!d2.exists()) {
            try {
                d2.createNewFile();
            } catch (IOException e2) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("wcf", "a", 508, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save private certificate to disk. Unable to create the file.");
                return false;
            }
        }
        ArrayList arrayList = new ArrayList();
        aucx aucx = b(account).a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            vhl vhl2 = (vhl) aucx.get(i2);
            vhk vhk2 = vhl2.b;
            if (vhk2 == null) {
                vhk2 = vhk.l;
            }
            if (!b(vhk2)) {
                arrayList.add(vhl2);
            } else {
                try {
                    wgz wgz = this.g;
                    vhk vhk3 = vhl2.b;
                    if (vhk3 == null) {
                        vhk3 = vhk.l;
                    }
                    wgz.b(vhk3.c);
                } catch (KeyStoreException e3) {
                    anih anih2 = (anih) vvj.a.c();
                    anih2.a((Throwable) e3);
                    anih anih3 = (anih) anih2.a("wcf", "a", 526, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    vhk vhk4 = vhl2.b;
                    if (vhk4 == null) {
                        vhk4 = vhk.l;
                    }
                    anih3.a("Failed to delete key store entry for %s", (Object) vhk4.c);
                }
                try {
                    wgz wgz2 = this.g;
                    vhk vhk5 = vhl2.c;
                    if (vhk5 == null) {
                        vhk5 = vhk.l;
                    }
                    wgz2.b(vhk5.c);
                } catch (KeyStoreException e4) {
                    anih anih4 = (anih) vvj.a.c();
                    anih4.a((Throwable) e4);
                    anih anih5 = (anih) anih4.a("wcf", "a", 535, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    vhk vhk6 = vhl2.c;
                    if (vhk6 == null) {
                        vhk6 = vhk.l;
                    }
                    anih5.a("Failed to delete key store entry for %s", (Object) vhk6.c);
                }
            }
        }
        aucd o = vhm.b.o();
        o.a(vhl);
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            vhl vhl3 = (vhl) arrayList.get(i3);
            vhk vhk7 = vhl3.b;
            if (vhk7 == null) {
                vhk7 = vhk.l;
            }
            auay auay = vhk7.b;
            vhk vhk8 = vhl.b;
            if (vhk8 == null) {
                vhk8 = vhk.l;
            }
            if (!auay.equals(vhk8.b)) {
                vhk vhk9 = vhl3.c;
                if (vhk9 == null) {
                    vhk9 = vhk.l;
                }
                auay auay2 = vhk9.b;
                vhk vhk10 = vhl.c;
                if (vhk10 == null) {
                    vhk10 = vhk.l;
                }
                if (!auay2.equals(vhk10.b)) {
                    o.a(vhl3);
                }
            }
        }
        try {
            fileOutputStream = new FileOutputStream(d2);
            ((vhm) o.i()).a(fileOutputStream);
            ((anih) ((anih) vvj.a.d()).a("wcf", "a", 561, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Saved private certificates to disk.");
            fileOutputStream.close();
            return true;
        } catch (IOException e5) {
            anih anih6 = (anih) vvj.a.c();
            anih6.a((Throwable) e5);
            ((anih) anih6.a("wcf", "a", 564, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save private certificate to disk.");
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final synchronized boolean a(vhn vhn) {
        Account b2 = this.a.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.d()).a("wcf", "a", 433, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save public certificate to disk. No account set.");
            return false;
        } else if (b(vhn)) {
            ((anih) ((anih) vvj.a.d()).a("wcf", "a", 438, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save public certificate to disk. Certificate is invalid.");
            return false;
        } else {
            ArrayList arrayList = new ArrayList();
            aucx aucx = c(b2).a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                vhn vhn2 = (vhn) aucx.get(i2);
                if (!b(vhn2)) {
                    if (!vhn2.b.equals(vhn.b)) {
                        arrayList.add(vhn2);
                    }
                }
            }
            arrayList.add(vhn);
            aucd o = vho.b.o();
            o.ac(arrayList);
            return a(b2, (vho) o.i());
        }
    }

    public final synchronized boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (this.a.b() == null) {
            return false;
        }
        jjg jjg = vvj.a;
        Arrays.toString(bArr);
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
            try {
                PublicKey generatePublic = instance.generatePublic(x509EncodedKeySpec);
                try {
                    Signature instance2 = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance2.initVerify(generatePublic);
                        try {
                            instance2.update(bArr2);
                            return instance2.verify(bArr3);
                        } catch (SignatureException e2) {
                            anih anih = (anih) vvj.a.c();
                            anih.a((Throwable) e2);
                            ((anih) anih.a("wcf", "a", 798, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key.");
                            return false;
                        }
                    } catch (InvalidKeyException e3) {
                        anih anih2 = (anih) vvj.a.c();
                        anih2.a((Throwable) e3);
                        ((anih) anih2.a("wcf", "a", 790, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key.");
                        return false;
                    }
                } catch (NoSuchAlgorithmException e4) {
                    anih anih3 = (anih) vvj.a.c();
                    anih3.a((Throwable) e4);
                    ((anih) anih3.a("wcf", "a", 782, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key: %s", (Object) "SHA256withECDSA");
                    return false;
                }
            } catch (InvalidKeySpecException e5) {
                anih anih4 = (anih) vvj.a.c();
                anih4.a((Throwable) e5);
                ((anih) anih4.a("wcf", "a", 773, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key: %s", (Object) x509EncodedKeySpec.getFormat());
                return false;
            }
        } catch (NoSuchAlgorithmException e6) {
            anih anih5 = (anih) vvj.a.c();
            anih5.a((Throwable) e6);
            ((anih) anih5.a("wcf", "a", 763, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to verify bytes with paired key: %s", (Object) "EC");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] a(int i2) {
        return whu.a(i2, this.f);
    }

    public final synchronized byte[] a(byte[] bArr) {
        vhk d2 = d();
        if (d2 != null) {
            try {
                String str = d2.c;
                KeyStore keyStore = this.g.a;
                if (keyStore != null) {
                    PrivateKey privateKey = (PrivateKey) keyStore.getKey(str, (char[]) null);
                    X509Certificate x509Certificate = (X509Certificate) this.g.a(str);
                    if (privateKey == null) {
                        ((anih) ((anih) vvj.a.c()).a("wcf", "a", 706, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No private key is available. Failed to sign with paired key.");
                        return a(72);
                    }
                    if (x509Certificate != null) {
                        if (x509Certificate.getPublicKey() != null) {
                            jjg jjg = vvj.a;
                            Arrays.toString(x509Certificate.getPublicKey().getEncoded());
                        }
                    }
                    try {
                        Signature instance = Signature.getInstance("SHA256withECDSA");
                        try {
                            instance.initSign(privateKey);
                            try {
                                instance.update(bArr);
                                return instance.sign();
                            } catch (SignatureException e2) {
                                anih anih = (anih) vvj.a.c();
                                anih.a((Throwable) e2);
                                ((anih) anih.a("wcf", "a", 738, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key.");
                                return a(72);
                            }
                        } catch (InvalidKeyException e3) {
                            anih anih2 = (anih) vvj.a.c();
                            anih2.a((Throwable) e3);
                            ((anih) anih2.a("wcf", "a", 729, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key: %s", (Object) privateKey.getAlgorithm());
                            return a(72);
                        }
                    } catch (NoSuchAlgorithmException e4) {
                        anih anih3 = (anih) vvj.a.c();
                        anih3.a((Throwable) e4);
                        ((anih) anih3.a("wcf", "a", 722, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key.");
                        return a(72);
                    }
                } else {
                    throw new KeyStoreException("No AndroidKeyStore found on device, cannot get key.");
                }
            } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e5) {
                anih anih4 = (anih) vvj.a.c();
                anih4.a(e5);
                ((anih) anih4.a("wcf", "a", 701, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sign with paired key.");
                return a(72);
            }
        } else {
            return a(72);
        }
    }
}
