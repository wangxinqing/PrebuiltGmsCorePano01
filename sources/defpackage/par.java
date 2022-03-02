package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: par  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class par implements paq {
    public final SharedPreferences a;
    public final pxn b;
    public Mac c;
    private final SecureRandom d = new SecureRandom();

    public par(Context context, String str, File file) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("AppDataSearch-");
        sb.append(str);
        sb.append("-config");
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.a = sharedPreferences;
        if (!sharedPreferences.contains("created")) {
            this.a.edit().putLong("created", System.currentTimeMillis()).commit();
        }
        b();
        this.b = new pxn(new File(file, String.valueOf(str).concat("-corpus-scratch-data.tmp")), otb.class, (auef) otb.e.c(7));
    }

    public final String a(pao pao) {
        byte[] bytes = pao.a.getBytes(Charset.defaultCharset());
        byte[] bytes2 = pao.b.getBytes(Charset.defaultCharset());
        this.c.reset();
        this.c.update(bytes);
        this.c.update((byte) 45);
        this.c.update(bytes2);
        String d2 = jjp.d(this.c.doFinal());
        if (pao.c == null) {
            return d2;
        }
        String valueOf = String.valueOf(d2);
        String str = pao.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final void b() {
        amrl.a((Object) this.a);
        String string = this.a.getString("hmackey", (String) null);
        if (string == null) {
            byte[] bArr = new byte[20];
            this.d.nextBytes(bArr);
            string = jjp.d(bArr);
            this.a.edit().putString("hmackey", string).commit();
        }
        try {
            Mac a2 = plc.a("HmacSHA1");
            this.c = a2;
            if (a2 != null) {
                this.c.init(new SecretKeySpec(string.getBytes("UTF-8"), "HmacSHA1"));
                return;
            }
            throw new IllegalArgumentException("Cannot find algo");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("CannotHappenException", e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException("Bad key type", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[SYNTHETIC, Splitter:B:30:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5 A[SYNTHETIC, Splitter:B:40:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9 A[SYNTHETIC, Splitter:B:47:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection a() {
        /*
            r11 = this;
            java.lang.String r0 = "Error while closing stream to %s"
            java.util.ArrayList r1 = new java.util.ArrayList
            android.content.SharedPreferences r2 = r11.a
            java.util.Map r2 = r2.getAll()
            int r2 = r2.size()
            r1.<init>(r2)
            android.content.SharedPreferences r2 = r11.a
            java.util.Map r2 = r2.getAll()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "corpuskey:"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x001f
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            ota r4 = defpackage.ota.d
            r5 = 7
            java.lang.Object r4 = r4.c(r5)
            auef r4 = (defpackage.auef) r4
            audx r3 = defpackage.plc.a((java.lang.String) r3, (defpackage.auef) r4)
            ota r3 = (defpackage.ota) r3
            r1.add(r3)
            goto L_0x001f
        L_0x0052:
            pxn r2 = r11.b
            java.lang.String r3 = r2.c
            java.lang.String r4 = "Requested read of file %s"
            defpackage.oso.d((java.lang.String) r4, (java.lang.Object) r3)
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            java.io.File r7 = r2.d     // Catch:{ IllegalArgumentException -> 0x00f8 }
            long r7 = r7.length()     // Catch:{ IllegalArgumentException -> 0x00f8 }
            int r8 = (int) r7     // Catch:{ IllegalArgumentException -> 0x00f8 }
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ IllegalArgumentException -> 0x00f8 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00ac, all -> 0x00aa }
            java.io.File r9 = r2.d     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00ac, all -> 0x00aa }
            r8.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00ac, all -> 0x00aa }
            java.nio.channels.FileChannel r9 = r8.getChannel()     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x00a6, all -> 0x00a3 }
            r9.read(r7)     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x00a6, all -> 0x00a3 }
            r8.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r5 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = r2.c
            r8[r6] = r9
            defpackage.oso.b((java.lang.Throwable) r5, (java.lang.String) r0, (java.lang.Object[]) r8)
        L_0x0086:
            r7.rewind()
            java.lang.String r0 = r2.c
            java.lang.String r5 = "Reading file %s"
            defpackage.oso.a((java.lang.String) r5, (java.lang.Object) r0)
            java.lang.Class r0 = r2.a
            auef r5 = r2.b
            java.util.List r5 = defpackage.jkw.a((java.nio.ByteBuffer) r7, (java.lang.Class) r0, (defpackage.auef) r5, (boolean) r4)
            if (r5 != 0) goto L_0x0110
            java.lang.String r0 = r2.c
            java.lang.String r2 = "Failed to read valid data from file %s"
            defpackage.oso.b((java.lang.String) r2, (java.lang.Object) r0)
            goto L_0x0110
        L_0x00a3:
            r1 = move-exception
            r5 = r8
            goto L_0x00e7
        L_0x00a6:
            r7 = move-exception
            goto L_0x00ae
        L_0x00a8:
            r7 = move-exception
            goto L_0x00cc
        L_0x00aa:
            r1 = move-exception
            goto L_0x00e7
        L_0x00ac:
            r7 = move-exception
            r8 = r5
        L_0x00ae:
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = r2.c     // Catch:{ all -> 0x00e5 }
            r9[r6] = r10     // Catch:{ all -> 0x00e5 }
            java.lang.String r10 = "Error while reading from %s"
            defpackage.oso.b((java.lang.Throwable) r7, (java.lang.String) r10, (java.lang.Object[]) r9)     // Catch:{ all -> 0x00e5 }
            if (r8 == 0) goto L_0x00e4
            r8.close()     // Catch:{ IOException -> 0x00bf }
            goto L_0x0110
        L_0x00bf:
            r7 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = r2.c
            r4[r6] = r2
            defpackage.oso.b((java.lang.Throwable) r7, (java.lang.String) r0, (java.lang.Object[]) r4)
            goto L_0x0110
        L_0x00ca:
            r7 = move-exception
            r8 = r5
        L_0x00cc:
            java.lang.String r7 = "File %s not found, ignoring"
            java.lang.String r9 = r2.c     // Catch:{ all -> 0x00e5 }
            defpackage.oso.d((java.lang.String) r7, (java.lang.Object) r9)     // Catch:{ all -> 0x00e5 }
            if (r8 == 0) goto L_0x00e4
            r8.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x0110
        L_0x00d9:
            r7 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = r2.c
            r4[r6] = r2
            defpackage.oso.b((java.lang.Throwable) r7, (java.lang.String) r0, (java.lang.Object[]) r4)
            goto L_0x0110
        L_0x00e4:
            goto L_0x0110
        L_0x00e5:
            r1 = move-exception
            r5 = r8
        L_0x00e7:
            if (r5 == 0) goto L_0x00f7
            r5.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00f7
        L_0x00ed:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = r2.c
            r4[r6] = r2
            defpackage.oso.b((java.lang.Throwable) r3, (java.lang.String) r0, (java.lang.Object[]) r4)
        L_0x00f7:
            throw r1
        L_0x00f8:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = r2.c
            r7[r6] = r8
            java.io.File r2 = r2.d
            long r8 = r2.length()
            java.lang.String r2 = defpackage.plc.a((long) r8)
            r7[r4] = r2
            java.lang.String r2 = "Error while reading from %s: file too large: %s"
            defpackage.oso.b((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.Object[]) r7)
        L_0x0110:
            if (r5 == 0) goto L_0x01c5
            android.util.SparseArray r0 = new android.util.SparseArray
            int r2 = r5.size()
            r0.<init>(r2)
            int r2 = r5.size()
            r4 = 0
        L_0x0120:
            if (r4 >= r2) goto L_0x0130
            java.lang.Object r7 = r5.get(r4)
            otb r7 = (defpackage.otb) r7
            int r8 = r7.b
            r0.append(r8, r7)
            int r4 = r4 + 1
            goto L_0x0120
        L_0x0130:
            r2 = 0
        L_0x0131:
            int r4 = r1.size()
            if (r2 >= r4) goto L_0x01c5
            java.lang.Object r4 = r1.get(r2)
            ota r4 = (defpackage.ota) r4
            osz r5 = r4.b
            if (r5 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            osz r5 = defpackage.osz.s
        L_0x0144:
            int r5 = r5.b
            java.lang.Object r5 = r0.get(r5)
            otb r5 = (defpackage.otb) r5
            if (r5 == 0) goto L_0x01c1
            r7 = 5
            java.lang.Object r8 = r4.c(r7)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r4)
            otg r4 = r4.c
            if (r4 != 0) goto L_0x015e
            otg r4 = defpackage.otg.h
        L_0x015e:
            java.lang.Object r7 = r4.c(r7)
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r4)
            boolean r4 = r7.c
            if (r4 == 0) goto L_0x0171
            r7.c()
            r7.c = r6
        L_0x0171:
            aucj r4 = r7.b
            otg r4 = (defpackage.otg) r4
            aucx r9 = defpackage.aucj.s()
            r4.b = r9
            aucx r4 = r5.d
            r7.L(r4)
            int r4 = r5.c
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x0187
            goto L_0x018c
        L_0x0187:
            r7.c()
            r7.c = r6
        L_0x018c:
            aucj r5 = r7.b
            otg r5 = (defpackage.otg) r5
            int r9 = r5.a
            r9 = r9 | 16
            r5.a = r9
            r5.e = r4
            boolean r4 = r8.c
            if (r4 != 0) goto L_0x019d
            goto L_0x01a2
        L_0x019d:
            r8.c()
            r8.c = r6
        L_0x01a2:
            aucj r4 = r8.b
            ota r4 = (defpackage.ota) r4
            aucj r5 = r7.i()
            otg r5 = (defpackage.otg) r5
            ota r7 = defpackage.ota.d
            r5.getClass()
            r4.c = r5
            int r5 = r4.a
            r5 = r5 | r3
            r4.a = r5
            aucj r4 = r8.i()
            ota r4 = (defpackage.ota) r4
            r1.set(r2, r4)
        L_0x01c1:
            int r2 = r2 + 1
            goto L_0x0131
        L_0x01c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.par.a():java.util.Collection");
    }

    public final boolean a(ota ota) {
        String valueOf = String.valueOf(a(new pao(ota)));
        return this.a.edit().putString(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf), plc.a((audx) ota)).commit();
    }
}
