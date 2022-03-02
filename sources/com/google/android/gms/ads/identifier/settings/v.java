package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.spec.ECPoint;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class v {
    private static v a = null;
    private final Context b;
    private aowv c = null;
    private byte[] d = null;

    public v(Context context) {
        this.b = context;
    }

    public static synchronized v a(Context context) {
        v vVar;
        synchronized (v.class) {
            if (a == null) {
                a = new v(context);
            }
            vVar = a;
        }
        return vVar;
    }

    private final synchronized aowv d() {
        if (this.c == null) {
            aowl.a();
            apas.a();
            aowu aowu = new aowu();
            Context context = this.b;
            if (context != null) {
                aowu.a = new aowy(context, "event_attestation_signature_keyset", "event_attestation_settings");
                aowu.d = new aowz(context, "event_attestation_signature_keyset", "event_attestation_settings");
                aowu.c = apat.a;
                aowu.b = "android-keystore://event_attestation_master_key";
                this.c = new aowv(aowu);
                this.d = null;
            } else {
                throw new IllegalArgumentException("need an Android context");
            }
        }
        return this.c;
    }

    private final SharedPreferences e() {
        return this.b.getSharedPreferences("event_attestation_settings", 0);
    }

    public final synchronized void b() {
        e().edit().clear().commit();
        this.c = null;
        this.d = null;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x006f=Splitter:B:26:0x006f, B:59:0x00bf=Splitter:B:59:0x00bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(byte[] r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            goto L_0x00bf
        L_0x0005:
            int r0 = r6.length     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00bf
            aubs r0 = defpackage.aubs.c()     // Catch:{ auda -> 0x00b5 }
            aotw r1 = defpackage.aotw.d     // Catch:{ auda -> 0x00b5 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r1, (byte[]) r6, (defpackage.aubs) r0)     // Catch:{ auda -> 0x00b5 }
            aotw r0 = (defpackage.aotw) r0     // Catch:{ auda -> 0x00b5 }
            auay r0 = r0.b     // Catch:{ auda -> 0x00b5 }
            aubs r1 = defpackage.aubs.c()     // Catch:{ auda -> 0x00b5 }
            aots r2 = defpackage.aots.b     // Catch:{ auda -> 0x00b5 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x00b3 }
            r3 = 4
            java.lang.Object r2 = r2.c(r3)     // Catch:{ auda -> 0x00b3 }
            aucj r2 = (defpackage.aucj) r2     // Catch:{ auda -> 0x00b3 }
            aueh r3 = defpackage.aueh.a     // Catch:{ IOException -> 0x0099, RuntimeException -> 0x0088 }
            aueq r3 = r3.a((java.lang.Object) r2)     // Catch:{ IOException -> 0x0099, RuntimeException -> 0x0088 }
            aubd r4 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x0099, RuntimeException -> 0x0088 }
            r3.a(r2, r4, r1)     // Catch:{ IOException -> 0x0099, RuntimeException -> 0x0088 }
            r3.d(r2)     // Catch:{ IOException -> 0x0099, RuntimeException -> 0x0088 }
            r1 = 0
            r0.a((int) r1)     // Catch:{ auda -> 0x0086 }
            defpackage.aucj.b((defpackage.aucj) r2)     // Catch:{ auda -> 0x00b5 }
            aots r2 = (defpackage.aots) r2     // Catch:{ auda -> 0x00b5 }
            byte[] r0 = r5.c()     // Catch:{ IOException -> 0x007c, GeneralSecurityException -> 0x007a }
            if (r2 != 0) goto L_0x0047
            goto L_0x006f
        L_0x0047:
            if (r0 == 0) goto L_0x006f
            auay r1 = r2.a     // Catch:{ all -> 0x00ca }
            byte[] r1 = r1.k()     // Catch:{ all -> 0x00ca }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x006f
            android.content.SharedPreferences r0 = r5.e()     // Catch:{ all -> 0x00ca }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00ca }
            java.nio.charset.Charset r2 = defpackage.amqn.b     // Catch:{ all -> 0x00ca }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = "event_attestation_integrity_token"
            android.content.SharedPreferences$Editor r6 = r0.putString(r6, r1)     // Catch:{ all -> 0x00ca }
            r6.apply()     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x006f:
            android.content.Context r6 = r5.b     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "deviceIntegrityTokenError"
            java.lang.String r1 = "public key mismatch"
            com.google.android.gms.ads.identifier.settings.f.a((android.content.Context) r6, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x007a:
            r6 = move-exception
            goto L_0x007d
        L_0x007c:
            r6 = move-exception
        L_0x007d:
            android.content.Context r0 = r5.b     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "publicKeyError"
            com.google.android.gms.ads.identifier.settings.f.a((android.content.Context) r0, (java.lang.String) r1, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x0086:
            r6 = move-exception
            throw r6     // Catch:{ auda -> 0x00b3 }
        L_0x0088:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ auda -> 0x00b3 }
            boolean r0 = r0 instanceof defpackage.auda     // Catch:{ auda -> 0x00b3 }
            if (r0 == 0) goto L_0x0098
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ auda -> 0x00b3 }
            auda r6 = (defpackage.auda) r6     // Catch:{ auda -> 0x00b3 }
            throw r6     // Catch:{ auda -> 0x00b3 }
        L_0x0098:
            throw r6     // Catch:{ auda -> 0x00b3 }
        L_0x0099:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ auda -> 0x00b3 }
            boolean r0 = r0 instanceof defpackage.auda     // Catch:{ auda -> 0x00b3 }
            if (r0 != 0) goto L_0x00ac
            auda r0 = new auda     // Catch:{ auda -> 0x00b3 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ auda -> 0x00b3 }
            r0.<init>((java.lang.String) r6)     // Catch:{ auda -> 0x00b3 }
            throw r0     // Catch:{ auda -> 0x00b3 }
        L_0x00ac:
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ auda -> 0x00b3 }
            auda r6 = (defpackage.auda) r6     // Catch:{ auda -> 0x00b3 }
            throw r6     // Catch:{ auda -> 0x00b3 }
        L_0x00b3:
            r6 = move-exception
            throw r6     // Catch:{ auda -> 0x00b5 }
        L_0x00b5:
            r6 = move-exception
            android.content.Context r0 = r5.b     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "deviceIntegriyTokenDecodeError"
            com.google.android.gms.ads.identifier.settings.f.a((android.content.Context) r0, (java.lang.String) r1, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x00bf:
            android.content.Context r6 = r5.b     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "deviceIntegrityTokenError"
            java.lang.String r1 = "empty token"
            com.google.android.gms.ads.identifier.settings.f.a((android.content.Context) r6, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.v.c(byte[]):void");
    }

    public static UUID a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(f.a(bArr), 16, 16);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public final synchronized byte[] b(byte[] bArr) {
        return ((aouu) d().a().a(aouu.class)).a(bArr);
    }

    public final synchronized aotw a() {
        String string = e().getString("event_attestation_integrity_token", (String) null);
        if (string == null) {
            return null;
        }
        try {
            return (aotw) aucj.a((aucj) aotw.d, string.getBytes(amqn.b), aubs.c());
        } catch (auda e) {
            f.a(this.b, "deviceIntegrityTokenError", (Throwable) e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized byte[] a(aoza aoza, String str, amrm amrm) {
        byte[] bArr = this.d;
        if (bArr != null) {
            return bArr;
        }
        aucx aucx = aoza.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aoyz aoyz = (aoyz) aucx.get(i);
            if (aoyz.c == aoza.a) {
                int b2 = aoyv.b(aoyz.b);
                if (b2 != 0 && b2 == 3) {
                    int b3 = aozh.b(aoyz.d);
                    if (b3 != 0 && b3 == 5) {
                        aoyu aoyu = aoyz.a;
                        if (aoyu == null) {
                            aoyu = aoyu.d;
                        }
                        if (!aoyu.a.equals(str)) {
                            continue;
                        } else {
                            aoyu aoyu2 = aoyz.a;
                            if (aoyu2 == null) {
                                aoyu2 = aoyu.d;
                            }
                            int b4 = aoyt.b(aoyu2.c);
                            if (b4 != 0 && b4 == 5) {
                                aoyu aoyu3 = aoyz.a;
                                if (aoyu3 == null) {
                                    aoyu3 = aoyu.d;
                                }
                                if (aoyu3.b.j()) {
                                    continue;
                                } else {
                                    aoyu aoyu4 = aoyz.a;
                                    if (aoyu4 == null) {
                                        aoyu4 = aoyu.d;
                                    }
                                    auay auay = aoyu4.b;
                                    aubs c2 = aubs.c();
                                    aoyc aoyc = aoyc.e;
                                    try {
                                        aubc h = auay.h();
                                        aucj aucj = (aucj) aoyc.c(4);
                                        aueq a2 = aueh.a.a((Object) aucj);
                                        a2.a(aucj, aubd.a(h), c2);
                                        a2.d(aucj);
                                        h.a(0);
                                        aucj.b(aucj);
                                        aoyc aoyc2 = (aoyc) aucj;
                                        aoya aoya = aoyc2.b;
                                        if (aoya == null) {
                                            aoya = aoya.d;
                                        }
                                        if (amrm.a(aoya)) {
                                            if (this.d != null) {
                                                f.a(this.b, "publicKeyError", "Multiple public key.");
                                            }
                                            this.d = apcd.a(apcd.a(1).getCurve(), 2, new ECPoint(new BigInteger(aoyc2.c.k()), new BigInteger(aoyc2.d.k())));
                                        }
                                    } catch (IOException e) {
                                        if (!(e.getCause() instanceof auda)) {
                                            throw new auda(e.getMessage());
                                        }
                                        throw ((auda) e.getCause());
                                    } catch (RuntimeException e2) {
                                        if (e2.getCause() instanceof auda) {
                                            throw ((auda) e2.getCause());
                                        }
                                        throw e2;
                                    } catch (auda e3) {
                                        throw e3;
                                    } catch (auda e4) {
                                        throw e4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.d == null) {
            f.a(this.b, "publicKeyError", "Not found.");
        }
        return this.d;
    }

    public final synchronized byte[] c() {
        aouj a2;
        a2 = d().a().a();
        return a(a2.a, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey", u.a);
    }
}
