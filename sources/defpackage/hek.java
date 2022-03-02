package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: hek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hek {
    private static volatile hek d = null;
    private final Context a;
    private final long b;
    private final List c = new ArrayList();

    public hek(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = bmz.b(applicationContext);
        hem.a();
    }

    private static bpw a(anax anax) {
        if (anax.isEmpty()) {
            return blj.d;
        }
        bpw b2 = bpw.b(anax, blj.b);
        anav j = anax.j();
        int size = b2.size();
        int i = 0;
        boc boc = null;
        while (i < size) {
            boc boc2 = (boc) b2.get(i);
            if (boc != null && boc.b.equals(boc2.b)) {
                j.b(boc);
            }
            i++;
            boc = boc2;
        }
        return b2.a((Set) j.a());
    }

    /* access modifiers changed from: package-private */
    public final int b(boolean z) {
        hfz a2 = hfz.a(this.a);
        bpw<ansk> b2 = a2.b(anfv.a);
        if (b2 != null) {
            if (b2.isEmpty()) {
                hem.a().a(this.a, 52);
                return 1;
            }
            try {
                bkv a3 = bkv.a(this.a);
                bpw c2 = a3.c(a3.f());
                if (bmy.a((bpw) b2, c2)) {
                    hem.a().a(this.a, 50);
                    return 3;
                } else if (!z) {
                    bpw b3 = bpw.b(c2, bmy.b);
                    ArrayList arrayList = new ArrayList();
                    for (ansk ansk : b2) {
                        int a4 = b3.a((Object) ansk);
                        if (a4 >= 0) {
                            aucx aucx = ((ansk) b3.get(a4)).f;
                            if (!ansk.f.equals(aucx)) {
                                ArrayList arrayList2 = new ArrayList(ansk.f);
                                arrayList2.removeAll(aucx);
                                if (!arrayList2.isEmpty()) {
                                    aucd aucd = (aucd) ansk.c(5);
                                    aucd.a((aucj) ansk);
                                    if (aucd.c) {
                                        aucd.c();
                                        aucd.c = false;
                                    }
                                    ansk ansk2 = ansk.g;
                                    ((ansk) aucd.b).f = aucj.s();
                                    aucd.ak(arrayList2);
                                    arrayList.add((ansk) aucd.i());
                                }
                            }
                        } else {
                            arrayList.add(ansk);
                        }
                    }
                    bpw b4 = bpw.b(arrayList, bmy.a);
                    String a5 = bmy.a((List) b4);
                    Collection a6 = a2.a((anax) anfv.a);
                    String valueOf = String.valueOf(a5);
                    int size = a6 != null ? a6.size() : -1;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb.append(valueOf);
                    sb.append("|");
                    sb.append(size);
                    hem.a().a(this.a, 51, sb.toString(), b4);
                    return 2;
                }
            } catch (InvalidConfigException e) {
            }
        }
        return 1;
    }

    public static hek a(Context context) {
        hek hek = d;
        if (hek == null) {
            synchronized (hek.class) {
                hek = d;
                if (hek == null) {
                    hek = new hek(context);
                    d = hek;
                }
            }
        }
        return hek;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: hfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v19, resolved type: hfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v20, resolved type: hfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v33, resolved type: hfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v39, resolved type: hfy} */
    /* JADX WARNING: type inference failed for: r19v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0282, code lost:
        if (r7 == false) goto L_0x0287;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01dc A[SYNTHETIC, Splitter:B:102:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(defpackage.bpw r18, boolean r19, defpackage.anax r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r20
            android.content.Context r3 = r1.a
            hen r4 = defpackage.hen.d
            if (r4 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            java.lang.Class<hen> r4 = defpackage.hen.class
            monitor-enter(r4)
            hen r5 = defpackage.hen.d     // Catch:{ all -> 0x02d2 }
            if (r5 != 0) goto L_0x001b
            hen r5 = new hen     // Catch:{ all -> 0x02d2 }
            r5.<init>(r3)     // Catch:{ all -> 0x02d2 }
            defpackage.hen.d = r5     // Catch:{ all -> 0x02d2 }
        L_0x001b:
            monitor-exit(r4)     // Catch:{ all -> 0x02d2 }
        L_0x001c:
            hen r3 = defpackage.hen.d
            android.content.Context r4 = r3.c
            hef r4 = defpackage.hef.a((android.content.Context) r4)
            boolean r5 = r3.a
            r6 = 0
            r9 = 0
            if (r5 != 0) goto L_0x002d
            goto L_0x028c
        L_0x002d:
            if (r19 == 0) goto L_0x028c
            android.content.Context r5 = r3.c
            hef r5 = defpackage.hef.a((android.content.Context) r5)
            android.content.SharedPreferences r5 = r5.a
            java.lang.String r11 = "Chimera.downloadFrom"
            long r11 = r5.getLong(r11, r6)
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x004a
            android.content.Context r5 = r3.c
            hhk r5 = defpackage.hhk.a((android.content.Context) r5)
            r5.a()
        L_0x004a:
            r5 = 1
            r4.a((long) r5)
            android.content.Context r4 = r3.c
            long r5 = r3.b
            hgn r3 = defpackage.hgn.a
            if (r3 == 0) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            java.lang.Class<hgn> r11 = defpackage.hgn.class
            monitor-enter(r11)
            hgn r3 = defpackage.hgn.a     // Catch:{ all -> 0x0289 }
            if (r3 != 0) goto L_0x0066
            hgn r3 = new hgn     // Catch:{ all -> 0x0289 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0289 }
            defpackage.hgn.a = r3     // Catch:{ all -> 0x0289 }
        L_0x0066:
            monitor-exit(r11)     // Catch:{ all -> 0x0289 }
        L_0x0067:
            hgn r3 = defpackage.hgn.a
            android.content.Context r4 = r3.c
            hfz r4 = defpackage.hfz.a((android.content.Context) r4)
            java.util.Collection r0 = r4.a((defpackage.anax) r0)
            if (r0 == 0) goto L_0x0287
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x0285
            android.content.Context r5 = r3.c
            blu r5 = defpackage.blu.a((android.content.Context) r5)
            anaf r5 = r5.e()
            if (r5 == 0) goto L_0x0287
            java.util.Iterator r6 = r0.iterator()
            r7 = 1
        L_0x008c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0282
            java.lang.Object r0 = r6.next()
            r11 = r0
            hfy r11 = (defpackage.hfy) r11
            bmr r12 = new bmr
            java.lang.String r0 = r11.a
            java.lang.String r13 = r11.b
            r12.<init>(r0, r13)
            boolean r0 = r5.containsKey(r12)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = java.lang.String.valueOf(r12)
            long r11 = r3.b
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r13 = r13.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r13 = r13 + 59
            r14.<init>(r13)
            r14.append(r0)
            java.lang.String r0 = " already present. skipping it for user "
            r14.append(r0)
            r14.append(r11)
            java.lang.String r0 = r14.toString()
            java.lang.String r11 = "PeerModuleDownloader"
            android.util.Log.i(r11, r0)
            goto L_0x008c
        L_0x00d2:
            java.lang.String r0 = "content://com.google.android.gms.chimera.container.sharedmoduleprovider"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r13 = new android.net.Uri$Builder
            r13.<init>()
            java.lang.String r14 = "moduleapk-identifier"
            android.net.Uri$Builder r13 = r13.scheme(r14)
            java.lang.String r14 = r12.a
            android.net.Uri$Builder r13 = r13.appendPath(r14)
            java.lang.String r14 = r12.b
            android.net.Uri$Builder r13 = r13.appendPath(r14)
            android.net.Uri r13 = r13.build()
            java.lang.String r13 = r13.toString()
            android.net.Uri r0 = android.net.Uri.withAppendedPath(r0, r13)
            android.content.Context r14 = r3.c     // Catch:{ FileNotFoundException -> 0x0213, IOException -> 0x01ea }
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0213, IOException -> 0x01ea }
            java.lang.String r15 = "r"
            android.os.ParcelFileDescriptor r14 = r14.openFileDescriptor(r0, r15)     // Catch:{ FileNotFoundException -> 0x0213, IOException -> 0x01ea }
            if (r14 != 0) goto L_0x0147
            java.lang.String r0 = "PeerModuleDownloader"
            java.lang.String r15 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0142 }
            r19 = r11
            long r10 = r3.b     // Catch:{ all -> 0x01d8 }
            java.lang.String r16 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x01d8 }
            int r16 = r16.length()     // Catch:{ all -> 0x01d8 }
            int r13 = r16 + 57
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r8.<init>(r13)     // Catch:{ all -> 0x01d8 }
            java.lang.String r13 = "no parcel file descriptor for "
            r8.append(r13)     // Catch:{ all -> 0x01d8 }
            r8.append(r15)     // Catch:{ all -> 0x01d8 }
            java.lang.String r13 = "(user "
            r8.append(r13)     // Catch:{ all -> 0x01d8 }
            r8.append(r10)     // Catch:{ all -> 0x01d8 }
            java.lang.String r10 = ")"
            r8.append(r10)     // Catch:{ all -> 0x01d8 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x01d8 }
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x01d8 }
            r13 = 0
            goto L_0x023b
        L_0x0142:
            r0 = move-exception
            r19 = r11
            goto L_0x01d9
        L_0x0147:
            r19 = r11
            android.content.Context r0 = r3.c     // Catch:{ all -> 0x01d8 }
            blu r0 = defpackage.blu.a((android.content.Context) r0)     // Catch:{ all -> 0x01d8 }
            java.io.File r0 = r0.d()     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x0157
            goto L_0x01cc
        L_0x0157:
            boolean r8 = r0.isDirectory()     // Catch:{ all -> 0x01d8 }
            if (r8 == 0) goto L_0x01cc
            java.lang.String r8 = "copied-"
            java.lang.String r10 = ".apk"
            java.io.File r8 = java.io.File.createTempFile(r8, r10, r0)     // Catch:{ all -> 0x01d8 }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r10 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IOException -> 0x01a3 }
            r10.<init>(r14)     // Catch:{ IOException -> 0x01a3 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x0197 }
            r11.<init>(r8)     // Catch:{ all -> 0x0197 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x018b }
        L_0x0173:
            int r13 = r10.read(r0)     // Catch:{ all -> 0x018b }
            r15 = -1
            if (r13 != r15) goto L_0x0186
            r11.close()     // Catch:{ all -> 0x0197 }
            r10.close()     // Catch:{ IOException -> 0x01a3 }
            r14.close()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01e6 }
            r13 = r8
            goto L_0x023b
        L_0x0186:
            r11.write(r0, r9, r13)     // Catch:{ all -> 0x018b }
            goto L_0x0173
        L_0x018b:
            r0 = move-exception
            r13 = r0
            r11.close()     // Catch:{ all -> 0x0191 }
            goto L_0x0196
        L_0x0191:
            r0 = move-exception
            r11 = r0
            defpackage.apev.a((java.lang.Throwable) r13, (java.lang.Throwable) r11)     // Catch:{ all -> 0x0197 }
        L_0x0196:
            throw r13     // Catch:{ all -> 0x0197 }
        L_0x0197:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch:{ all -> 0x019d }
            goto L_0x01a2
        L_0x019d:
            r0 = move-exception
            r10 = r0
            defpackage.apev.a((java.lang.Throwable) r11, (java.lang.Throwable) r10)     // Catch:{ IOException -> 0x01a3 }
        L_0x01a2:
            throw r11     // Catch:{ IOException -> 0x01a3 }
        L_0x01a3:
            r0 = move-exception
            java.lang.String r0 = "PeerModuleDownloader"
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01d8 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01d8 }
            int r11 = r11.length()     // Catch:{ all -> 0x01d8 }
            int r11 = r11 + 39
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r13.<init>(r11)     // Catch:{ all -> 0x01d8 }
            java.lang.String r11 = "Failed to copy the file with identifier"
            r13.append(r11)     // Catch:{ all -> 0x01d8 }
            r13.append(r10)     // Catch:{ all -> 0x01d8 }
            java.lang.String r10 = r13.toString()     // Catch:{ all -> 0x01d8 }
            android.util.Log.e(r0, r10)     // Catch:{ all -> 0x01d8 }
            r8.delete()     // Catch:{ all -> 0x01d8 }
            goto L_0x01d3
        L_0x01cc:
            java.lang.String r0 = "PeerModuleDownloader"
            java.lang.String r8 = "Failed to create the modules directory."
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x01d8 }
        L_0x01d3:
            r14.close()     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01e6 }
            r13 = 0
            goto L_0x023b
        L_0x01d8:
            r0 = move-exception
        L_0x01d9:
            r8 = r0
            if (r14 == 0) goto L_0x01e5
            r14.close()     // Catch:{ all -> 0x01e0 }
            goto L_0x01e5
        L_0x01e0:
            r0 = move-exception
            r10 = r0
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r10)     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01e6 }
        L_0x01e5:
            throw r8     // Catch:{ FileNotFoundException -> 0x01e8, IOException -> 0x01e6 }
        L_0x01e6:
            r0 = move-exception
            goto L_0x01ed
        L_0x01e8:
            r0 = move-exception
            goto L_0x0216
        L_0x01ea:
            r0 = move-exception
            r19 = r11
        L_0x01ed:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 31
            r10.<init>(r8)
            java.lang.String r8 = "Cannot create scratch file for "
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r8 = "PeerModuleDownloader"
            android.util.Log.e(r8, r0)
            r13 = 0
            goto L_0x023b
        L_0x0213:
            r0 = move-exception
            r19 = r11
        L_0x0216:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + 36
            r10.<init>(r8)
            java.lang.String r8 = "Cannot find the file with identifier"
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r8 = "PeerModuleDownloader"
            android.util.Log.e(r8, r0)
            r13 = 0
        L_0x023b:
            if (r13 == 0) goto L_0x008c
            r8 = r19
            java.lang.String r0 = r8.a     // Catch:{ all -> 0x027d }
            java.lang.String r8 = r8.b     // Catch:{ all -> 0x027d }
            boolean r0 = r4.a((java.lang.String) r0, (java.lang.String) r8, (java.io.File) r13)     // Catch:{ all -> 0x027d }
            if (r0 != 0) goto L_0x0278
            java.lang.String r0 = "PeerModuleDownloader"
            java.lang.String r7 = r13.getAbsolutePath()     // Catch:{ all -> 0x027d }
            long r10 = r3.b     // Catch:{ all -> 0x027d }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x027d }
            int r8 = r8.length()     // Catch:{ all -> 0x027d }
            int r8 = r8 + 46
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x027d }
            r12.<init>(r8)     // Catch:{ all -> 0x027d }
            java.lang.String r8 = "failure pulling "
            r12.append(r8)     // Catch:{ all -> 0x027d }
            r12.append(r7)     // Catch:{ all -> 0x027d }
            java.lang.String r7 = " for user "
            r12.append(r7)     // Catch:{ all -> 0x027d }
            r12.append(r10)     // Catch:{ all -> 0x027d }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x027d }
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x027d }
            r7 = 0
        L_0x0278:
            r13.delete()
            goto L_0x008c
        L_0x027d:
            r0 = move-exception
            r13.delete()
            throw r0
        L_0x0282:
            if (r7 != 0) goto L_0x0285
            goto L_0x0287
        L_0x0285:
            r0 = 1
            goto L_0x029a
        L_0x0287:
            r0 = 2
            goto L_0x029a
        L_0x0289:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0289 }
            throw r0
        L_0x028c:
            r4.a((long) r6)
            android.content.Context r3 = r3.c
            hhk r3 = defpackage.hhk.a((android.content.Context) r3)
            int r0 = r3.a(r0)
        L_0x029a:
            r3 = 2
            if (r0 != r3) goto L_0x02b5
            hhr r0 = new hhr
            r0.<init>()
            r3 = 7
            r0.a((java.util.List) r2, (int) r3)
            android.content.Context r2 = r1.a
            r0.a((android.content.Context) r2)
            hel r0 = com.google.android.gms.chimera.container.ConfigChimeraService.b()
            android.content.Context r2 = r1.a
            r0.a(r2)
            return r9
        L_0x02b5:
            r3 = 3
            if (r0 != r3) goto L_0x02d0
            hhr r0 = new hhr
            r0.<init>()
            r3 = 16
            r0.a((java.util.List) r2, (int) r3)
            android.content.Context r2 = r1.a
            r0.a((android.content.Context) r2)
            com.google.android.gms.chimera.container.ConfigChimeraService.b()
            android.content.Context r0 = r1.a
            defpackage.hel.b(r0)
            return r9
        L_0x02d0:
            r2 = 1
            return r2
        L_0x02d2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02d2 }
            goto L_0x02d6
        L_0x02d5:
            throw r0
        L_0x02d6:
            goto L_0x02d5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hek.a(bpw, boolean, anax):boolean");
    }

    /* access modifiers changed from: package-private */
    public final List b() {
        ArrayList arrayList = new ArrayList(this.c);
        this.c.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hej) arrayList.get(i)).a();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final bpw a() {
        anav j = anax.j();
        byte[] bArr = (byte[]) heh.b.c();
        try {
            j.b((Iterable) ((bod) aucj.a((aucj) bod.b, bArr, aubs.b())).a);
        } catch (auda e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Invalid required feature list: ");
            sb.append(valueOf);
            Log.e("ChimeraConfigurator", sb.toString());
        }
        byte[] bArr2 = (byte[]) heh.c.c();
        if (bArr2 != heh.a) {
            try {
                j.b((Iterable) ((bod) aucj.a((aucj) bod.b, bArr2, aubs.b())).a);
            } catch (auda e2) {
                long j2 = this.b;
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 60);
                sb2.append("Invalid devRequestedFeatures for user ");
                sb2.append(j2);
                sb2.append(": ");
                sb2.append(valueOf2);
                Log.e("ChimeraConfigurator", sb2.toString());
            }
        } else {
            j.b((Iterable) blg.a(this.a).d());
        }
        return a(j.a());
    }

    public final void a(int i, boj boj, String str, List list) {
        boolean remove;
        hej hej = new hej(boj, str, list);
        synchronized (this.c) {
            this.c.add(hej);
        }
        if (!a(i, hef.a(this.a), list)) {
            synchronized (this.c) {
                remove = this.c.remove(hej);
                hej.a();
            }
            if (remove && boj != null) {
                bpx.a(boj, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0005
            java.lang.String r0 = "fail"
            goto L_0x0007
        L_0x0005:
            java.lang.String r0 = "success"
        L_0x0007:
            java.lang.String r1 = "Update complete: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0015
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0019
        L_0x0015:
            java.lang.String r0 = r1.concat(r0)
        L_0x0019:
            java.lang.String r1 = "ChimeraConfigurator"
            android.util.Log.i(r1, r0)
            if (r13 != 0) goto L_0x0029
            hel r0 = com.google.android.gms.chimera.container.ConfigChimeraService.b()
            android.content.Context r1 = r12.a
            r0.a(r1)
        L_0x0029:
            android.content.Context r0 = r12.a
            hfz r0 = defpackage.hfz.a((android.content.Context) r0)
            anfv r1 = defpackage.anfv.a
            android.content.Context r2 = r0.a
            blu r2 = defpackage.blu.a((android.content.Context) r2)
            java.util.Collection r2 = r2.h()
            anax r2 = defpackage.hgi.a((java.util.Collection) r2)
            r3 = 0
            java.util.Set r0 = r0.a((defpackage.anax) r1, (boolean) r3, (defpackage.anax) r2)
            r1 = 1
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004f
            r0 = 0
            goto L_0x0052
        L_0x004f:
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x0056
            r2 = 1
            goto L_0x005b
        L_0x0056:
            if (r13 == 0) goto L_0x005a
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = 1
        L_0x005b:
            awxp r4 = defpackage.awxp.a
            awxq r4 = r4.a()
            boolean r4 = r4.h()
            if (r4 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            if (r2 == 0) goto L_0x006d
            r12.b(r3)
        L_0x006d:
            java.util.List r4 = r12.c
            monitor-enter(r4)
            r5 = 0
            if (r13 == 0) goto L_0x00ec
            java.util.List r6 = r12.c     // Catch:{ all -> 0x0266 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0266 }
            if (r6 != 0) goto L_0x00e9
            awxp r6 = defpackage.awxp.a     // Catch:{ all -> 0x0266 }
            awxq r6 = r6.a()     // Catch:{ all -> 0x0266 }
            boolean r6 = r6.m()     // Catch:{ all -> 0x0266 }
            if (r6 == 0) goto L_0x00de
            android.content.Context r6 = r12.a     // Catch:{ InvalidConfigException -> 0x00cc }
            bkv r6 = defpackage.bkv.a((android.content.Context) r6)     // Catch:{ InvalidConfigException -> 0x00cc }
            boz r6 = r6.f()     // Catch:{ InvalidConfigException -> 0x00cc }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0266 }
            java.util.List r8 = r12.c     // Catch:{ all -> 0x0266 }
            int r8 = r8.size()     // Catch:{ all -> 0x0266 }
            r7.<init>(r8)     // Catch:{ all -> 0x0266 }
            java.util.List r8 = r12.c     // Catch:{ all -> 0x0266 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0266 }
        L_0x00a2:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0266 }
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0266 }
            hej r9 = (defpackage.hej) r9     // Catch:{ all -> 0x0266 }
            java.util.List r10 = r9.b     // Catch:{ all -> 0x0266 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0266 }
            if (r10 != 0) goto L_0x00bf
            java.util.List r10 = r9.b     // Catch:{ all -> 0x0266 }
            int r10 = defpackage.bpr.a((defpackage.boz) r6, (java.util.List) r10)     // Catch:{ all -> 0x0266 }
            if (r10 != 0) goto L_0x00a2
            goto L_0x00c1
        L_0x00bf:
            if (r0 == 0) goto L_0x00a2
        L_0x00c1:
            r7.add(r9)     // Catch:{ all -> 0x0266 }
            r8.remove()     // Catch:{ all -> 0x0266 }
            r9.a()     // Catch:{ all -> 0x0266 }
            goto L_0x00a2
        L_0x00cb:
            goto L_0x00d5
        L_0x00cc:
            r6 = move-exception
            java.lang.String r7 = "ChimeraConfigurator"
            java.lang.String r8 = "Failed fetching module config, disabling feature-aware listeners"
            android.util.Log.e(r7, r8, r6)     // Catch:{ all -> 0x0266 }
            r7 = r5
        L_0x00d5:
            if (r0 == 0) goto L_0x00dc
            java.util.List r0 = r12.b()     // Catch:{ all -> 0x0266 }
            goto L_0x00f1
        L_0x00dc:
            r0 = r5
            goto L_0x00f1
        L_0x00de:
            if (r0 == 0) goto L_0x00e6
            java.util.List r0 = r12.b()     // Catch:{ all -> 0x0266 }
            r7 = r0
            goto L_0x00e7
        L_0x00e6:
            r7 = r5
        L_0x00e7:
            r0 = r5
            goto L_0x00f1
        L_0x00e9:
            r0 = r5
            r7 = r0
            goto L_0x00f1
        L_0x00ec:
            java.util.List r0 = r12.b()     // Catch:{ all -> 0x0266 }
            r7 = r5
        L_0x00f1:
            monitor-exit(r4)     // Catch:{ all -> 0x0266 }
            if (r7 == 0) goto L_0x0109
            int r4 = r7.size()
            r6 = 0
        L_0x00f9:
            if (r6 >= r4) goto L_0x0109
            java.lang.Object r8 = r7.get(r6)
            hej r8 = (defpackage.hej) r8
            boj r8 = r8.a
            defpackage.bpx.a((defpackage.boj) r8, (int) r3)
            int r6 = r6 + 1
            goto L_0x00f9
        L_0x0109:
            if (r0 == 0) goto L_0x0120
            int r4 = r0.size()
            r6 = 0
        L_0x0110:
            if (r6 >= r4) goto L_0x0120
            java.lang.Object r7 = r0.get(r6)
            hej r7 = (defpackage.hej) r7
            boj r7 = r7.a
            defpackage.bpx.a((defpackage.boj) r7, (int) r1)
            int r6 = r6 + 1
            goto L_0x0110
        L_0x0120:
            if (r2 == 0) goto L_0x0265
            boolean r0 = defpackage.axcu.b()
            if (r0 == 0) goto L_0x0265
            android.content.Context r0 = r12.a
            hhi r0 = defpackage.hhi.a((android.content.Context) r0)
            android.content.Context r2 = r0.a     // Catch:{ InvalidConfigException -> 0x015d }
            bkv r2 = defpackage.bkv.a((android.content.Context) r2)     // Catch:{ InvalidConfigException -> 0x015d }
            bpw r2 = r2.d()     // Catch:{ InvalidConfigException -> 0x015d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ InvalidConfigException -> 0x015d }
        L_0x013c:
            boolean r4 = r2.hasNext()     // Catch:{ InvalidConfigException -> 0x015d }
            if (r4 == 0) goto L_0x015b
            java.lang.Object r4 = r2.next()     // Catch:{ InvalidConfigException -> 0x015d }
            ansk r4 = (defpackage.ansk) r4     // Catch:{ InvalidConfigException -> 0x015d }
            java.lang.String r6 = "container"
            java.lang.String r7 = r4.b     // Catch:{ InvalidConfigException -> 0x015d }
            boolean r6 = r6.equals(r7)     // Catch:{ InvalidConfigException -> 0x015d }
            if (r6 == 0) goto L_0x013c
            r6 = 128(0x80, float:1.794E-43)
            boolean r6 = defpackage.hgi.a((defpackage.ansk) r4, (int) r6)     // Catch:{ InvalidConfigException -> 0x015d }
            if (r6 == 0) goto L_0x013c
            goto L_0x015f
        L_0x015b:
            r4 = r5
            goto L_0x015f
        L_0x015d:
            r2 = move-exception
            r4 = r5
        L_0x015f:
            if (r4 == 0) goto L_0x0265
            long r6 = r4.e
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            hhg r4 = r0.a()     // Catch:{ all -> 0x0262 }
            if (r4 == 0) goto L_0x022b
            hfg r8 = r4.c     // Catch:{ all -> 0x0262 }
            if (r8 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            hfg r8 = defpackage.hfg.d     // Catch:{ all -> 0x0262 }
        L_0x0173:
            aucx r8 = r8.a     // Catch:{ all -> 0x0262 }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0262 }
            ansk r8 = (defpackage.ansk) r8     // Catch:{ all -> 0x0262 }
            long r8 = r8.e     // Catch:{ all -> 0x0262 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0183
            goto L_0x022b
        L_0x0183:
            if (r13 == 0) goto L_0x018b
            boolean r8 = r4.d     // Catch:{ all -> 0x0262 }
            if (r8 != 0) goto L_0x018b
            r8 = 1
            goto L_0x018c
        L_0x018b:
            r8 = 0
        L_0x018c:
            r9 = 4
            if (r8 == 0) goto L_0x01b7
            r10 = 5
            java.lang.Object r10 = r4.c(r10)     // Catch:{ all -> 0x0262 }
            aucd r10 = (defpackage.aucd) r10     // Catch:{ all -> 0x0262 }
            r10.a((defpackage.aucj) r4)     // Catch:{ all -> 0x0262 }
            boolean r11 = r10.c     // Catch:{ all -> 0x0262 }
            if (r11 != 0) goto L_0x019e
            goto L_0x01a3
        L_0x019e:
            r10.c()     // Catch:{ all -> 0x0262 }
            r10.c = r3     // Catch:{ all -> 0x0262 }
        L_0x01a3:
            aucj r3 = r10.b     // Catch:{ all -> 0x0262 }
            hhg r3 = (defpackage.hhg) r3     // Catch:{ all -> 0x0262 }
            int r11 = r3.a     // Catch:{ all -> 0x0262 }
            r11 = r11 | r9
            r3.a = r11     // Catch:{ all -> 0x0262 }
            r3.d = r1     // Catch:{ all -> 0x0262 }
            aucj r1 = r10.i()     // Catch:{ all -> 0x0262 }
            hhg r1 = (defpackage.hhg) r1     // Catch:{ all -> 0x0262 }
            r0.a((defpackage.hhg) r1)     // Catch:{ all -> 0x0262 }
        L_0x01b7:
            hhh r1 = r0.c     // Catch:{ all -> 0x0262 }
            if (r1 == 0) goto L_0x01c5
            r1.b = r13     // Catch:{ all -> 0x0262 }
            java.util.concurrent.CountDownLatch r13 = r1.a     // Catch:{ all -> 0x0262 }
            r13.countDown()     // Catch:{ all -> 0x0262 }
            r0.c = r5     // Catch:{ all -> 0x0262 }
            goto L_0x0229
        L_0x01c5:
            if (r8 == 0) goto L_0x0229
            hem r13 = defpackage.hem.a()     // Catch:{ all -> 0x0262 }
            android.content.Context r1 = r0.a     // Catch:{ all -> 0x0262 }
            r3 = 65
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0262 }
            r13.a(r1, r3, r6)     // Catch:{ all -> 0x0262 }
            int r13 = r4.b     // Catch:{ all -> 0x0262 }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x0262 }
            r0.getPackageName()     // Catch:{ all -> 0x0262 }
            cqj r1 = new cqj     // Catch:{ all -> 0x0262 }
            r1.<init>(r5)     // Catch:{ all -> 0x0262 }
            cqr r3 = new cqr     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            cqn r1 = r1.b(r0, r3)     // Catch:{ all -> 0x0262 }
            if (r1 == 0) goto L_0x0229
            java.lang.String r4 = r0.getPackageName()     // Catch:{ Exception -> 0x0204 }
            android.os.Parcel r5 = r1.aQ()     // Catch:{ Exception -> 0x0204 }
            r5.writeString(r4)     // Catch:{ Exception -> 0x0204 }
            r5.writeInt(r13)     // Catch:{ Exception -> 0x0204 }
            r1.c(r9, r5)     // Catch:{ Exception -> 0x0204 }
        L_0x01fe:
            defpackage.cqj.a(r0, r3)     // Catch:{ all -> 0x0262 }
            goto L_0x0229
        L_0x0202:
            r13 = move-exception
            goto L_0x0225
        L_0x0204:
            r13 = move-exception
            java.lang.String r1 = "ZappPhoneskyConn"
            java.lang.String r4 = "updateGmsApk failed: "
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0202 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0202 }
            int r5 = r13.length()     // Catch:{ all -> 0x0202 }
            if (r5 != 0) goto L_0x021d
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x0202 }
            r13.<init>(r4)     // Catch:{ all -> 0x0202 }
            goto L_0x0221
        L_0x021d:
            java.lang.String r13 = r4.concat(r13)     // Catch:{ all -> 0x0202 }
        L_0x0221:
            android.util.Log.e(r1, r13)     // Catch:{ all -> 0x0202 }
            goto L_0x01fe
        L_0x0225:
            defpackage.cqj.a(r0, r3)     // Catch:{ all -> 0x0262 }
            throw r13     // Catch:{ all -> 0x0262 }
        L_0x0229:
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            return
        L_0x022b:
            if (r4 == 0) goto L_0x023f
            hfg r13 = r4.c     // Catch:{ all -> 0x0262 }
            if (r13 == 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            hfg r13 = defpackage.hfg.d     // Catch:{ all -> 0x0262 }
        L_0x0234:
            aucx r13 = r13.a     // Catch:{ all -> 0x0262 }
            java.lang.Object r13 = r13.get(r3)     // Catch:{ all -> 0x0262 }
            ansk r13 = (defpackage.ansk) r13     // Catch:{ all -> 0x0262 }
            long r0 = r13.e     // Catch:{ all -> 0x0262 }
            goto L_0x0241
        L_0x023f:
            r0 = -1
        L_0x0241:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3 = 81
            r13.<init>(r3)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = "Ignoring placebo container module set "
            r13.append(r3)     // Catch:{ all -> 0x0262 }
            r13.append(r6)     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = " ("
            r13.append(r3)     // Catch:{ all -> 0x0262 }
            r13.append(r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = ")"
            r13.append(r0)     // Catch:{ all -> 0x0262 }
            r13.toString()     // Catch:{ all -> 0x0262 }
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            return
        L_0x0262:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            throw r13
        L_0x0265:
            return
        L_0x0266:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0266 }
            goto L_0x026a
        L_0x0269:
            throw r13
        L_0x026a:
            goto L_0x0269
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hek.a(boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v21, resolved type: auay} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v42, resolved type: boolean} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06e3 A[Catch:{ hgo -> 0x0031, all -> 0x0dfa }, LOOP:6: B:286:0x06e1->B:287:0x06e3, LOOP_END] */
    public final synchronized boolean a(int r33, defpackage.hef r34, java.util.List r35) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            monitor-enter(r32)
            agvx r5 = defpackage.heh.d     // Catch:{ all -> 0x0dfa }
            java.lang.Object r5 = r5.c()     // Catch:{ all -> 0x0dfa }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0dfa }
            r6 = 5
            if (r2 == r6) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            byte[] r7 = defpackage.heh.a     // Catch:{ all -> 0x0dfa }
            if (r5 != r7) goto L_0x006e
            boolean r7 = defpackage.awxp.f()     // Catch:{ all -> 0x0dfa }
            if (r7 == 0) goto L_0x006e
            android.content.Context r5 = r1.a     // Catch:{ hgo -> 0x0031 }
            byte[] r5 = defpackage.hgp.b(r5)     // Catch:{ hgo -> 0x0031 }
            hem r7 = defpackage.hem.a()     // Catch:{ hgo -> 0x0031 }
            android.content.Context r8 = r1.a     // Catch:{ hgo -> 0x0031 }
            r9 = 79
            r7.a(r8, r9)     // Catch:{ hgo -> 0x0031 }
            goto L_0x006e
        L_0x0031:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0dfa }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0dfa }
            int r8 = r8.length()     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            int r8 = r8 + 21
            r9.<init>(r8)     // Catch:{ all -> 0x0dfa }
            java.lang.String r8 = "Error syncing flags: "
            r9.append(r8)     // Catch:{ all -> 0x0dfa }
            r9.append(r7)     // Catch:{ all -> 0x0dfa }
            java.lang.String r7 = "ChimeraConfigurator"
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0dfa }
            android.util.Log.w(r7, r8)     // Catch:{ all -> 0x0dfa }
            hem r7 = defpackage.hem.a()     // Catch:{ all -> 0x0dfa }
            android.content.Context r8 = r1.a     // Catch:{ all -> 0x0dfa }
            r9 = 80
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0dfa }
            r7.a(r8, r9, r5)     // Catch:{ all -> 0x0dfa }
            agvx r5 = defpackage.heh.d     // Catch:{ all -> 0x0dfa }
            java.lang.Object r5 = r5.c()     // Catch:{ all -> 0x0dfa }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0dfa }
        L_0x006e:
            awxp r7 = defpackage.awxp.a     // Catch:{ all -> 0x0dfa }
            awxq r7 = r7.a()     // Catch:{ all -> 0x0dfa }
            boolean r7 = r7.f()     // Catch:{ all -> 0x0dfa }
            r8 = 4
            r9 = 2
            r10 = 3
            r11 = 0
            if (r7 != 0) goto L_0x0080
            goto L_0x0156
        L_0x0080:
            if (r2 != r10) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            if (r2 == r9) goto L_0x0087
            if (r2 != r8) goto L_0x00e6
        L_0x0087:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0dfa }
            long r14 = r34.e()     // Catch:{ all -> 0x0dfa }
            long r16 = r34.d()     // Catch:{ all -> 0x0dfa }
            android.content.Context r7 = r1.a     // Catch:{ all -> 0x0dfa }
            java.lang.Long r7 = defpackage.hgp.a(r7)     // Catch:{ all -> 0x0dfa }
            if (r7 == 0) goto L_0x00e6
            long r18 = r7.longValue()     // Catch:{ all -> 0x0dfa }
            int r20 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r20 == 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 < 0) goto L_0x00a9
            goto L_0x00e6
        L_0x00a9:
            java.lang.String r14 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0dfa }
            java.lang.String r15 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0dfa }
            int r15 = r15.length()     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            int r15 = r15 + 26
            r10.<init>(r15)     // Catch:{ all -> 0x0dfa }
            java.lang.String r15 = "Storing H serving version "
            r10.append(r15)     // Catch:{ all -> 0x0dfa }
            r10.append(r14)     // Catch:{ all -> 0x0dfa }
            r10.toString()     // Catch:{ all -> 0x0dfa }
            long r14 = r7.longValue()     // Catch:{ all -> 0x0dfa }
            boolean r7 = r34.f()     // Catch:{ all -> 0x0dfa }
            if (r7 == 0) goto L_0x00e6
            android.content.SharedPreferences r7 = r3.a     // Catch:{ all -> 0x0dfa }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = "Chimera.lastHeterodyneServingVersion"
            android.content.SharedPreferences$Editor r7 = r7.putLong(r10, r14)     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = "Chimera.lastHeterodyneChangeTime"
            android.content.SharedPreferences$Editor r7 = r7.putLong(r10, r12)     // Catch:{ all -> 0x0dfa }
            r7.commit()     // Catch:{ all -> 0x0dfa }
        L_0x00e6:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0dfa }
            android.content.SharedPreferences r7 = r3.a     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = "Chimera.lastUpdateTime"
            r14 = 0
            long r17 = r7.getLong(r10, r14)     // Catch:{ all -> 0x0dfa }
            long r19 = r34.e()     // Catch:{ all -> 0x0dfa }
            long r21 = r34.d()     // Catch:{ all -> 0x0dfa }
            long r23 = r12 - r21
            r25 = 1000(0x3e8, double:4.94E-321)
            long r6 = r23 / r25
            long r12 = r12 - r17
            long r12 = r12 / r25
            r23 = 86400(0x15180, double:4.26873E-319)
            int r25 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r25 > 0) goto L_0x0156
            int r23 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r23 == 0) goto L_0x0156
            int r17 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x0156
            r17 = -1
            int r21 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r21 == 0) goto L_0x0156
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 < 0) goto L_0x0156
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 < 0) goto L_0x0156
            long r12 = defpackage.awxp.d()     // Catch:{ all -> 0x0dfa }
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0156
            long r2 = defpackage.awxp.d()     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            r5 = 88
            r4.<init>(r5)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = "H config is too old. "
            r4.append(r5)     // Catch:{ all -> 0x0dfa }
            r4.append(r6)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = " secs is older than max of "
            r4.append(r5)     // Catch:{ all -> 0x0dfa }
            r4.append(r2)     // Catch:{ all -> 0x0dfa }
            r4.toString()     // Catch:{ all -> 0x0dfa }
            hem r2 = defpackage.hem.a()     // Catch:{ all -> 0x0dfa }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x0dfa }
            r4 = 81
            r2.a(r3, r4)     // Catch:{ all -> 0x0dfa }
            monitor-exit(r32)
            return r11
        L_0x0156:
            awxo r6 = defpackage.awxo.a     // Catch:{ all -> 0x0dfa }
            awxv r6 = r6.a()     // Catch:{ all -> 0x0dfa }
            boolean r6 = r6.j()     // Catch:{ all -> 0x0dfa }
            if (r6 != 0) goto L_0x0178
            hem r2 = defpackage.hem.a()     // Catch:{ all -> 0x0dfa }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x0dfa }
            r4 = 53
            r2.a(r3, r4)     // Catch:{ all -> 0x0dfa }
            hel r2 = com.google.android.gms.chimera.container.ConfigChimeraService.b()     // Catch:{ all -> 0x0dfa }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x0dfa }
            r2.a(r3)     // Catch:{ all -> 0x0dfa }
            monitor-exit(r32)
            return r11
        L_0x0178:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0dfa }
            r6.<init>()     // Catch:{ all -> 0x0dfa }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0dfa }
            r7.<init>()     // Catch:{ all -> 0x0dfa }
            r12 = 22
            int r13 = r5.length     // Catch:{ auda -> 0x0dc6 }
            if (r13 > 0) goto L_0x0188
            goto L_0x01b6
        L_0x0188:
            aubs r13 = defpackage.aubs.b()     // Catch:{ auda -> 0x0dc6 }
            hfh r14 = defpackage.hfh.b     // Catch:{ auda -> 0x0dc6 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r14, (byte[]) r5, (defpackage.aubs) r13)     // Catch:{ auda -> 0x0dc6 }
            hfh r5 = (defpackage.hfh) r5     // Catch:{ auda -> 0x0dc6 }
            java.lang.String r13 = java.lang.String.valueOf(r5)     // Catch:{ auda -> 0x0dc6 }
            java.lang.String r14 = java.lang.String.valueOf(r13)     // Catch:{ auda -> 0x0dc6 }
            int r14 = r14.length()     // Catch:{ auda -> 0x0dc6 }
            int r14 = r14 + r12
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ auda -> 0x0dc6 }
            r15.<init>(r14)     // Catch:{ auda -> 0x0dc6 }
            java.lang.String r14 = "Using PH Module Sets: "
            r15.append(r14)     // Catch:{ auda -> 0x0dc6 }
            r15.append(r13)     // Catch:{ auda -> 0x0dc6 }
            r15.toString()     // Catch:{ auda -> 0x0dc6 }
            aucx r5 = r5.a     // Catch:{ auda -> 0x0dc6 }
            r6.addAll(r5)     // Catch:{ auda -> 0x0dc6 }
        L_0x01b6:
            boolean r5 = defpackage.awxs.d()     // Catch:{ auda -> 0x0dc6 }
            if (r5 == 0) goto L_0x01fc
            agvx r5 = defpackage.heh.b     // Catch:{ auda -> 0x0dc6 }
            java.lang.Object r5 = r5.c()     // Catch:{ auda -> 0x0dc6 }
            byte[] r5 = (byte[]) r5     // Catch:{ auda -> 0x0dc6 }
            int r5 = r5.length     // Catch:{ auda -> 0x0dc6 }
            if (r5 <= 0) goto L_0x01fc
            agvx r5 = defpackage.heh.b     // Catch:{ auda -> 0x0dc6 }
            java.lang.Object r5 = r5.c()     // Catch:{ auda -> 0x0dc6 }
            byte[] r5 = (byte[]) r5     // Catch:{ auda -> 0x0dc6 }
            aubs r7 = defpackage.aubs.b()     // Catch:{ auda -> 0x0dc6 }
            bod r13 = defpackage.bod.b     // Catch:{ auda -> 0x0dc6 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r13, (byte[]) r5, (defpackage.aubs) r7)     // Catch:{ auda -> 0x0dc6 }
            bod r5 = (defpackage.bod) r5     // Catch:{ auda -> 0x0dc6 }
            aucx r7 = r5.a     // Catch:{ auda -> 0x0dc6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ auda -> 0x0dc6 }
            java.lang.String r13 = java.lang.String.valueOf(r5)     // Catch:{ auda -> 0x0dc6 }
            int r13 = r13.length()     // Catch:{ auda -> 0x0dc6 }
            int r13 = r13 + 29
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ auda -> 0x0dc6 }
            r14.<init>(r13)     // Catch:{ auda -> 0x0dc6 }
            java.lang.String r13 = "Using PH requested features: "
            r14.append(r13)     // Catch:{ auda -> 0x0dc6 }
            r14.append(r5)     // Catch:{ auda -> 0x0dc6 }
            r14.toString()     // Catch:{ auda -> 0x0dc6 }
            goto L_0x01fd
        L_0x01fc:
        L_0x01fd:
            boolean r5 = defpackage.axcu.b()     // Catch:{ all -> 0x0dfa }
            r12 = 128(0x80, float:1.794E-43)
            r13 = 0
            if (r5 == 0) goto L_0x0276
            android.content.Context r5 = r1.a     // Catch:{ all -> 0x0dfa }
            hhi r5 = defpackage.hhi.a((android.content.Context) r5)     // Catch:{ all -> 0x0dfa }
            hhg r5 = r5.a()     // Catch:{ all -> 0x0dfa }
            if (r5 == 0) goto L_0x026f
            int r14 = r5.a     // Catch:{ all -> 0x0dfa }
            r14 = r14 & r9
            if (r14 == 0) goto L_0x026f
            hfg r5 = r5.c     // Catch:{ all -> 0x0dfa }
            if (r5 == 0) goto L_0x021c
            goto L_0x021e
        L_0x021c:
            hfg r5 = defpackage.hfg.d     // Catch:{ all -> 0x0dfa }
        L_0x021e:
            aucx r14 = r5.a     // Catch:{ all -> 0x0dfa }
            java.lang.Object r14 = r14.get(r11)     // Catch:{ all -> 0x0dfa }
            ansk r14 = (defpackage.ansk) r14     // Catch:{ all -> 0x0dfa }
            r10 = 5
            java.lang.Object r15 = r14.c(r10)     // Catch:{ all -> 0x0dfa }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ all -> 0x0dfa }
            r15.a((defpackage.aucj) r14)     // Catch:{ all -> 0x0dfa }
            boolean r14 = r15.c     // Catch:{ all -> 0x0dfa }
            if (r14 == 0) goto L_0x0239
            r15.c()     // Catch:{ all -> 0x0dfa }
            r15.c = r11     // Catch:{ all -> 0x0dfa }
        L_0x0239:
            aucj r14 = r15.b     // Catch:{ all -> 0x0dfa }
            ansk r14 = (defpackage.ansk) r14     // Catch:{ all -> 0x0dfa }
            ansk r17 = defpackage.ansk.g     // Catch:{ all -> 0x0dfa }
            int r10 = r14.a     // Catch:{ all -> 0x0dfa }
            r10 = r10 | r8
            r14.a = r10     // Catch:{ all -> 0x0dfa }
            r14.d = r12     // Catch:{ all -> 0x0dfa }
            aucj r10 = r15.i()     // Catch:{ all -> 0x0dfa }
            r14 = r10
            ansk r14 = (defpackage.ansk) r14     // Catch:{ all -> 0x0dfa }
            r10 = 5
            java.lang.Object r15 = r5.c(r10)     // Catch:{ all -> 0x0dfa }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ all -> 0x0dfa }
            r15.a((defpackage.aucj) r5)     // Catch:{ all -> 0x0dfa }
            boolean r5 = r15.c     // Catch:{ all -> 0x0dfa }
            if (r5 != 0) goto L_0x025c
            goto L_0x0261
        L_0x025c:
            r15.c()     // Catch:{ all -> 0x0dfa }
            r15.c = r11     // Catch:{ all -> 0x0dfa }
        L_0x0261:
            aucj r5 = r15.b     // Catch:{ all -> 0x0dfa }
            hfg r5 = (defpackage.hfg) r5     // Catch:{ all -> 0x0dfa }
            defpackage.hfg.a((defpackage.hfg) r5, (defpackage.ansk) r14)     // Catch:{ all -> 0x0dfa }
            aucj r5 = r15.i()     // Catch:{ all -> 0x0dfa }
            hfg r5 = (defpackage.hfg) r5     // Catch:{ all -> 0x0dfa }
            goto L_0x0270
        L_0x026f:
            r5 = r13
        L_0x0270:
            if (r5 != 0) goto L_0x0273
            goto L_0x0276
        L_0x0273:
            r6.add(r5)     // Catch:{ all -> 0x0dfa }
        L_0x0276:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0dfa }
            agvx r14 = defpackage.heh.e     // Catch:{ all -> 0x0dfa }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x0dfa }
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x0dfa }
            if (r5 == 0) goto L_0x02ae
            hem r5 = defpackage.hem.a()     // Catch:{ all -> 0x0dfa }
            android.content.Context r14 = r1.a     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            r15.<init>()     // Catch:{ all -> 0x0dfa }
            int r10 = r2 + -1
            if (r2 == 0) goto L_0x02ac
            r15.append(r10)     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = "|"
            r15.append(r10)     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = defpackage.hgi.b((java.util.List) r6)     // Catch:{ all -> 0x0dfa }
            r15.append(r10)     // Catch:{ all -> 0x0dfa }
            r10 = 43
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x0dfa }
            r5.a(r14, r10, r15)     // Catch:{ all -> 0x0dfa }
            goto L_0x02ae
        L_0x02ac:
            throw r13     // Catch:{ all -> 0x0dfa }
        L_0x02ae:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0dfa }
            r3.b((long) r14)     // Catch:{ all -> 0x0dfa }
            bpw r5 = defpackage.hgi.a((java.util.List) r6)     // Catch:{ all -> 0x0dfa }
            java.util.Set r3 = r34.b()     // Catch:{ all -> 0x0dfa }
            android.content.Context r6 = r1.a     // Catch:{ all -> 0x0dfa }
            hfz r6 = defpackage.hfz.a((android.content.Context) r6)     // Catch:{ all -> 0x0dfa }
            android.content.Context r10 = r1.a     // Catch:{ all -> 0x0dfa }
            hef r10 = defpackage.hef.a((android.content.Context) r10)     // Catch:{ all -> 0x0dfa }
            boolean r14 = defpackage.awxs.d()     // Catch:{ all -> 0x0dfa }
            if (r14 == 0) goto L_0x034f
            bkw r14 = new bkw     // Catch:{ all -> 0x0dfa }
            android.content.Context r15 = r1.a     // Catch:{ all -> 0x0dfa }
            r14.<init>(r15)     // Catch:{ all -> 0x0dfa }
            android.content.Context r15 = r1.a     // Catch:{ all -> 0x0dfa }
            blg r15 = defpackage.blg.a((android.content.Context) r15)     // Catch:{ all -> 0x0dfa }
            long r9 = r10.e()     // Catch:{ all -> 0x0dfa }
            r15.a(r7, r9, r14)     // Catch:{ all -> 0x0dfa }
            anav r7 = defpackage.anax.j()     // Catch:{ all -> 0x0dfa }
            android.content.Context r9 = r1.a     // Catch:{ all -> 0x0dfa }
            blg r9 = defpackage.blg.a((android.content.Context) r9)     // Catch:{ all -> 0x0dfa }
            agvx r10 = defpackage.heh.c     // Catch:{ all -> 0x0dfa }
            java.lang.Object r10 = r10.c()     // Catch:{ all -> 0x0dfa }
            byte[] r10 = (byte[]) r10     // Catch:{ all -> 0x0dfa }
            byte[] r14 = defpackage.heh.a     // Catch:{ all -> 0x0dfa }
            if (r10 == r14) goto L_0x033f
            int r14 = r10.length     // Catch:{ all -> 0x0dfa }
            if (r14 == 0) goto L_0x033f
            aubs r9 = defpackage.aubs.b()     // Catch:{ auda -> 0x030e }
            bod r14 = defpackage.bod.b     // Catch:{ auda -> 0x030e }
            aucj r9 = defpackage.aucj.a((defpackage.aucj) r14, (byte[]) r10, (defpackage.aubs) r9)     // Catch:{ auda -> 0x030e }
            bod r9 = (defpackage.bod) r9     // Catch:{ auda -> 0x030e }
            aucx r9 = r9.a     // Catch:{ auda -> 0x030e }
            r7.b((java.lang.Iterable) r9)     // Catch:{ auda -> 0x030e }
            goto L_0x0346
        L_0x030e:
            r0 = move-exception
            r9 = r0
            long r14 = r1.b     // Catch:{ all -> 0x0dfa }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0dfa }
            int r10 = r10.length()     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            int r10 = r10 + 55
            r12.<init>(r10)     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = "Invalid devFeatureBytes for user "
            r12.append(r10)     // Catch:{ all -> 0x0dfa }
            r12.append(r14)     // Catch:{ all -> 0x0dfa }
            java.lang.String r10 = ": "
            r12.append(r10)     // Catch:{ all -> 0x0dfa }
            r12.append(r9)     // Catch:{ all -> 0x0dfa }
            java.lang.String r9 = "ChimeraConfigurator"
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0dfa }
            android.util.Log.e(r9, r10)     // Catch:{ all -> 0x0dfa }
            goto L_0x0346
        L_0x033f:
            java.util.List r9 = r9.d()     // Catch:{ all -> 0x0dfa }
            r7.b((java.lang.Iterable) r9)     // Catch:{ all -> 0x0dfa }
        L_0x0346:
            anax r7 = r7.a()     // Catch:{ all -> 0x0dfa }
            bpw r7 = a((defpackage.anax) r7)     // Catch:{ all -> 0x0dfa }
            goto L_0x0353
        L_0x034f:
            bpw r7 = r32.a()     // Catch:{ all -> 0x0dfa }
        L_0x0353:
            anav r9 = defpackage.anax.j()     // Catch:{ all -> 0x0dfa }
            awxo r10 = defpackage.awxo.a     // Catch:{ all -> 0x0dfa }
            awxv r10 = r10.a()     // Catch:{ all -> 0x0dfa }
            bod r10 = r10.e()     // Catch:{ all -> 0x0dfa }
            aucx r10 = r10.a     // Catch:{ all -> 0x0dfa }
            r9.b((java.lang.Iterable) r10)     // Catch:{ all -> 0x0dfa }
            anax r9 = r9.a()     // Catch:{ all -> 0x0dfa }
            bpw r9 = a((defpackage.anax) r9)     // Catch:{ all -> 0x0dfa }
            android.content.Context r10 = r1.a     // Catch:{ all -> 0x0dfa }
            r12 = 3
            defpackage.hgi.a((android.content.Context) r10, (java.util.Collection) r5, (int) r12, (boolean) r11)     // Catch:{ all -> 0x0dfa }
            boolean r10 = defpackage.awxo.i()     // Catch:{ all -> 0x0dfa }
            if (r10 != 0) goto L_0x0384
            boolean r12 = defpackage.awxo.b()     // Catch:{ all -> 0x0dfa }
            if (r12 == 0) goto L_0x0381
            goto L_0x0384
        L_0x0381:
            r2 = r10
            goto L_0x06d8
        L_0x0384:
            android.content.Context r12 = r1.a     // Catch:{ all -> 0x0dfa }
            hgr r12 = defpackage.hgr.a(r12)     // Catch:{ all -> 0x0dfa }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0dfa }
            hgt r14 = defpackage.hgt.d     // Catch:{ all -> 0x0dfa }
            aucd r14 = r14.o()     // Catch:{ all -> 0x0dfa }
            int r15 = r5.size()     // Catch:{ all -> 0x0dfa }
            r8 = 0
        L_0x0397:
            if (r8 >= r15) goto L_0x03c2
            java.lang.Object r21 = r5.get(r8)     // Catch:{ all -> 0x0dfa }
            hfg r21 = (defpackage.hfg) r21     // Catch:{ all -> 0x0dfa }
            auay r13 = r21.au()     // Catch:{ all -> 0x0dfa }
            boolean r11 = r14.c     // Catch:{ all -> 0x0dfa }
            if (r11 != 0) goto L_0x03a8
            goto L_0x03ae
        L_0x03a8:
            r14.c()     // Catch:{ all -> 0x0dfa }
            r11 = 0
            r14.c = r11     // Catch:{ all -> 0x0dfa }
        L_0x03ae:
            aucj r11 = r14.b     // Catch:{ all -> 0x0dfa }
            hgt r11 = (defpackage.hgt) r11     // Catch:{ all -> 0x0dfa }
            r13.getClass()     // Catch:{ all -> 0x0dfa }
            r11.a()     // Catch:{ all -> 0x0dfa }
            aucx r11 = r11.a     // Catch:{ all -> 0x0dfa }
            r11.add(r13)     // Catch:{ all -> 0x0dfa }
            int r8 = r8 + 1
            r11 = 0
            r13 = 0
            goto L_0x0397
        L_0x03c2:
            int r8 = r7.size()     // Catch:{ all -> 0x0dfa }
            r11 = 0
        L_0x03c7:
            if (r11 >= r8) goto L_0x03f0
            java.lang.Object r13 = r7.get(r11)     // Catch:{ all -> 0x0dfa }
            boc r13 = (defpackage.boc) r13     // Catch:{ all -> 0x0dfa }
            auay r13 = r13.au()     // Catch:{ all -> 0x0dfa }
            boolean r15 = r14.c     // Catch:{ all -> 0x0dfa }
            if (r15 != 0) goto L_0x03d8
            goto L_0x03de
        L_0x03d8:
            r14.c()     // Catch:{ all -> 0x0dfa }
            r15 = 0
            r14.c = r15     // Catch:{ all -> 0x0dfa }
        L_0x03de:
            aucj r15 = r14.b     // Catch:{ all -> 0x0dfa }
            hgt r15 = (defpackage.hgt) r15     // Catch:{ all -> 0x0dfa }
            r13.getClass()     // Catch:{ all -> 0x0dfa }
            r15.b()     // Catch:{ all -> 0x0dfa }
            aucx r15 = r15.b     // Catch:{ all -> 0x0dfa }
            r15.add(r13)     // Catch:{ all -> 0x0dfa }
            int r11 = r11 + 1
            goto L_0x03c7
        L_0x03f0:
            int r8 = r9.size()     // Catch:{ all -> 0x0dfa }
            r11 = 0
        L_0x03f5:
            if (r11 >= r8) goto L_0x041e
            java.lang.Object r13 = r9.get(r11)     // Catch:{ all -> 0x0dfa }
            boc r13 = (defpackage.boc) r13     // Catch:{ all -> 0x0dfa }
            auay r13 = r13.au()     // Catch:{ all -> 0x0dfa }
            boolean r15 = r14.c     // Catch:{ all -> 0x0dfa }
            if (r15 != 0) goto L_0x0406
            goto L_0x040c
        L_0x0406:
            r14.c()     // Catch:{ all -> 0x0dfa }
            r15 = 0
            r14.c = r15     // Catch:{ all -> 0x0dfa }
        L_0x040c:
            aucj r15 = r14.b     // Catch:{ all -> 0x0dfa }
            hgt r15 = (defpackage.hgt) r15     // Catch:{ all -> 0x0dfa }
            r13.getClass()     // Catch:{ all -> 0x0dfa }
            r15.c()     // Catch:{ all -> 0x0dfa }
            aucx r15 = r15.c     // Catch:{ all -> 0x0dfa }
            r15.add(r13)     // Catch:{ all -> 0x0dfa }
            int r11 = r11 + 1
            goto L_0x03f5
        L_0x041e:
            boolean r8 = r12.e     // Catch:{ all -> 0x0dfa }
            if (r8 != 0) goto L_0x04a7
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x0dfa }
            r8.<init>()     // Catch:{ all -> 0x0dfa }
            java.lang.String r11 = "UpdateRequest"
            aucj r13 = r14.i()     // Catch:{ all -> 0x0dfa }
            hgt r13 = (defpackage.hgt) r13     // Catch:{ all -> 0x0dfa }
            byte[] r13 = r13.k()     // Catch:{ all -> 0x0dfa }
            r8.putByteArray(r11, r13)     // Catch:{ all -> 0x0dfa }
            boolean r11 = r35.isEmpty()     // Catch:{ all -> 0x0dfa }
            if (r11 != 0) goto L_0x0454
            bod r11 = defpackage.bod.b     // Catch:{ all -> 0x0dfa }
            aucd r11 = r11.o()     // Catch:{ all -> 0x0dfa }
            r11.i((java.lang.Iterable) r4)     // Catch:{ all -> 0x0dfa }
            java.lang.String r13 = "UrgentFeatures"
            aucj r11 = r11.i()     // Catch:{ all -> 0x0dfa }
            bod r11 = (defpackage.bod) r11     // Catch:{ all -> 0x0dfa }
            byte[] r11 = r11.k()     // Catch:{ all -> 0x0dfa }
            r8.putByteArray(r13, r11)     // Catch:{ all -> 0x0dfa }
        L_0x0454:
            java.lang.String r11 = "content://com.google.android.gms.chimera.container.sharedmoduleprovider"
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0dfa }
            android.content.Context r13 = r12.a     // Catch:{ all -> 0x0dfa }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ all -> 0x0dfa }
            java.lang.String r14 = "exchangeInfo"
            r15 = 0
            android.os.Bundle r8 = r13.call(r11, r14, r15, r8)     // Catch:{ all -> 0x0dfa }
            if (r8 == 0) goto L_0x04a0
            java.lang.String r11 = "UpdateRequest"
            byte[] r8 = r8.getByteArray(r11)     // Catch:{ auda -> 0x047e }
            if (r8 == 0) goto L_0x04a0
            aubs r11 = defpackage.aubs.b()     // Catch:{ auda -> 0x047e }
            hgt r13 = defpackage.hgt.d     // Catch:{ auda -> 0x047e }
            aucj r8 = defpackage.aucj.a((defpackage.aucj) r13, (byte[]) r8, (defpackage.aubs) r11)     // Catch:{ auda -> 0x047e }
            hgt r8 = (defpackage.hgt) r8     // Catch:{ auda -> 0x047e }
            goto L_0x04b4
        L_0x047e:
            r0 = move-exception
            long r11 = r12.g     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            r13 = 65
            r8.<init>(r13)     // Catch:{ all -> 0x0dfa }
            java.lang.String r13 = "Failed to decode the module request for user "
            r8.append(r13)     // Catch:{ all -> 0x0dfa }
            r8.append(r11)     // Catch:{ all -> 0x0dfa }
            java.lang.String r11 = "SharedModuleManager"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0dfa }
            android.util.Log.e(r11, r8)     // Catch:{ all -> 0x0dfa }
            r24 = r5
            r22 = r10
            r13 = r15
            goto L_0x069b
        L_0x04a0:
            r24 = r5
            r22 = r10
            r13 = r15
            goto L_0x069b
        L_0x04a7:
            r15 = 0
            aucj r8 = r14.i()     // Catch:{ all -> 0x0dfa }
            hgt r8 = (defpackage.hgt) r8     // Catch:{ all -> 0x0dfa }
            long r13 = r12.g     // Catch:{ all -> 0x0dfa }
            hgt r8 = r12.a(r8, r13)     // Catch:{ all -> 0x0dfa }
        L_0x04b4:
            aucx r11 = r8.a     // Catch:{ auda -> 0x067b }
            int r11 = r11.size()     // Catch:{ auda -> 0x067b }
            amzt r11 = defpackage.amzy.b((int) r11)     // Catch:{ auda -> 0x067b }
            aucx r13 = r8.a     // Catch:{ auda -> 0x067b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ auda -> 0x067b }
        L_0x04c4:
            boolean r14 = r13.hasNext()     // Catch:{ auda -> 0x067b }
            if (r14 != 0) goto L_0x0602
            aucx r13 = r8.b     // Catch:{ auda -> 0x067b }
            int r13 = r13.size()     // Catch:{ auda -> 0x067b }
            amzt r13 = defpackage.amzy.b((int) r13)     // Catch:{ auda -> 0x067b }
            aucx r14 = r8.b     // Catch:{ auda -> 0x067b }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ auda -> 0x067b }
        L_0x04da:
            boolean r22 = r14.hasNext()     // Catch:{ auda -> 0x067b }
            if (r22 != 0) goto L_0x058b
            aucx r14 = r8.c     // Catch:{ auda -> 0x067b }
            int r14 = r14.size()     // Catch:{ auda -> 0x067b }
            amzt r14 = defpackage.amzy.b((int) r14)     // Catch:{ auda -> 0x067b }
            aucx r8 = r8.c     // Catch:{ auda -> 0x067b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ auda -> 0x067b }
        L_0x04f0:
            boolean r22 = r8.hasNext()     // Catch:{ auda -> 0x067b }
            if (r22 != 0) goto L_0x050e
            hgq r8 = new hgq     // Catch:{ auda -> 0x067b }
            amzy r11 = r11.a()     // Catch:{ auda -> 0x067b }
            amzy r13 = r13.a()     // Catch:{ auda -> 0x067b }
            amzy r14 = r14.a()     // Catch:{ auda -> 0x067b }
            r8.<init>(r11, r13, r14)     // Catch:{ auda -> 0x067b }
            r24 = r5
            r13 = r8
            r22 = r10
            goto L_0x069b
        L_0x050e:
            java.lang.Object r22 = r8.next()     // Catch:{ auda -> 0x067b }
            auay r22 = (defpackage.auay) r22     // Catch:{ auda -> 0x067b }
            aubs r15 = defpackage.aubs.b()     // Catch:{ auda -> 0x067b }
            r24 = r5
            boc r5 = defpackage.boc.d     // Catch:{ auda -> 0x0588 }
            r34 = r8
            aubc r8 = r22.h()     // Catch:{ auda -> 0x0583 }
            r22 = r10
            r10 = 4
            java.lang.Object r5 = r5.c(r10)     // Catch:{ auda -> 0x0581 }
            aucj r5 = (defpackage.aucj) r5     // Catch:{ auda -> 0x0581 }
            aueh r10 = defpackage.aueh.a     // Catch:{ IOException -> 0x0566, RuntimeException -> 0x0554 }
            aueq r10 = r10.a((java.lang.Object) r5)     // Catch:{ IOException -> 0x0566, RuntimeException -> 0x0554 }
            aubd r2 = defpackage.aubd.a((defpackage.aubc) r8)     // Catch:{ IOException -> 0x0566, RuntimeException -> 0x0554 }
            r10.a(r5, r2, r15)     // Catch:{ IOException -> 0x0566, RuntimeException -> 0x0554 }
            r10.d(r5)     // Catch:{ IOException -> 0x0566, RuntimeException -> 0x0554 }
            r2 = 0
            r8.a((int) r2)     // Catch:{ auda -> 0x0551 }
            defpackage.aucj.b((defpackage.aucj) r5)     // Catch:{ auda -> 0x0679 }
            boc r5 = (defpackage.boc) r5     // Catch:{ auda -> 0x0679 }
            r14.c(r5)     // Catch:{ auda -> 0x0679 }
            r2 = r33
            r8 = r34
            r10 = r22
            r5 = r24
            r15 = 0
            goto L_0x04f0
        L_0x0551:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0581 }
        L_0x0554:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ auda -> 0x0581 }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x0581 }
            if (r5 == 0) goto L_0x0565
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0581 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0581 }
            throw r2     // Catch:{ auda -> 0x0581 }
        L_0x0565:
            throw r2     // Catch:{ auda -> 0x0581 }
        L_0x0566:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ auda -> 0x0581 }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x0581 }
            if (r5 != 0) goto L_0x057a
            auda r5 = new auda     // Catch:{ auda -> 0x0581 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ auda -> 0x0581 }
            r5.<init>((java.lang.String) r2)     // Catch:{ auda -> 0x0581 }
            throw r5     // Catch:{ auda -> 0x0581 }
        L_0x057a:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0581 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0581 }
            throw r2     // Catch:{ auda -> 0x0581 }
        L_0x0581:
            r0 = move-exception
            goto L_0x0586
        L_0x0583:
            r0 = move-exception
            r22 = r10
        L_0x0586:
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0679 }
        L_0x0588:
            r0 = move-exception
            goto L_0x067e
        L_0x058b:
            r24 = r5
            r22 = r10
            java.lang.Object r2 = r14.next()     // Catch:{ auda -> 0x0679 }
            auay r2 = (defpackage.auay) r2     // Catch:{ auda -> 0x0679 }
            aubs r5 = defpackage.aubs.b()     // Catch:{ auda -> 0x0679 }
            boc r10 = defpackage.boc.d     // Catch:{ auda -> 0x0679 }
            aubc r2 = r2.h()     // Catch:{ auda -> 0x05ff }
            r15 = 4
            java.lang.Object r10 = r10.c(r15)     // Catch:{ auda -> 0x05ff }
            aucj r10 = (defpackage.aucj) r10     // Catch:{ auda -> 0x05ff }
            aueh r15 = defpackage.aueh.a     // Catch:{ IOException -> 0x05e4, RuntimeException -> 0x05d2 }
            aueq r15 = r15.a((java.lang.Object) r10)     // Catch:{ IOException -> 0x05e4, RuntimeException -> 0x05d2 }
            r25 = r8
            aubd r8 = defpackage.aubd.a((defpackage.aubc) r2)     // Catch:{ IOException -> 0x05e4, RuntimeException -> 0x05d2 }
            r15.a(r10, r8, r5)     // Catch:{ IOException -> 0x05e4, RuntimeException -> 0x05d2 }
            r15.d(r10)     // Catch:{ IOException -> 0x05e4, RuntimeException -> 0x05d2 }
            r5 = 0
            r2.a((int) r5)     // Catch:{ auda -> 0x05cf }
            defpackage.aucj.b((defpackage.aucj) r10)     // Catch:{ auda -> 0x0679 }
            boc r10 = (defpackage.boc) r10     // Catch:{ auda -> 0x0679 }
            r13.c(r10)     // Catch:{ auda -> 0x0679 }
            r2 = r33
            r10 = r22
            r5 = r24
            r8 = r25
            r15 = 0
            goto L_0x04da
        L_0x05cf:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x05ff }
        L_0x05d2:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ auda -> 0x05ff }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x05ff }
            if (r5 == 0) goto L_0x05e3
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x05ff }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x05ff }
            throw r2     // Catch:{ auda -> 0x05ff }
        L_0x05e3:
            throw r2     // Catch:{ auda -> 0x05ff }
        L_0x05e4:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ auda -> 0x05ff }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x05ff }
            if (r5 != 0) goto L_0x05f8
            auda r5 = new auda     // Catch:{ auda -> 0x05ff }
            java.lang.String r2 = r2.getMessage()     // Catch:{ auda -> 0x05ff }
            r5.<init>((java.lang.String) r2)     // Catch:{ auda -> 0x05ff }
            throw r5     // Catch:{ auda -> 0x05ff }
        L_0x05f8:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x05ff }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x05ff }
            throw r2     // Catch:{ auda -> 0x05ff }
        L_0x05ff:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0679 }
        L_0x0602:
            r24 = r5
            r25 = r8
            r22 = r10
            java.lang.Object r2 = r13.next()     // Catch:{ auda -> 0x0679 }
            auay r2 = (defpackage.auay) r2     // Catch:{ auda -> 0x0679 }
            aubs r5 = defpackage.aubs.b()     // Catch:{ auda -> 0x0679 }
            hfg r8 = defpackage.hfg.d     // Catch:{ auda -> 0x0679 }
            aubc r2 = r2.h()     // Catch:{ auda -> 0x0676 }
            r10 = 4
            java.lang.Object r8 = r8.c(r10)     // Catch:{ auda -> 0x0676 }
            aucj r8 = (defpackage.aucj) r8     // Catch:{ auda -> 0x0676 }
            aueh r14 = defpackage.aueh.a     // Catch:{ IOException -> 0x065b, RuntimeException -> 0x0649 }
            aueq r14 = r14.a((java.lang.Object) r8)     // Catch:{ IOException -> 0x065b, RuntimeException -> 0x0649 }
            aubd r15 = defpackage.aubd.a((defpackage.aubc) r2)     // Catch:{ IOException -> 0x065b, RuntimeException -> 0x0649 }
            r14.a(r8, r15, r5)     // Catch:{ IOException -> 0x065b, RuntimeException -> 0x0649 }
            r14.d(r8)     // Catch:{ IOException -> 0x065b, RuntimeException -> 0x0649 }
            r5 = 0
            r2.a((int) r5)     // Catch:{ auda -> 0x0646 }
            defpackage.aucj.b((defpackage.aucj) r8)     // Catch:{ auda -> 0x0679 }
            hfg r8 = (defpackage.hfg) r8     // Catch:{ auda -> 0x0679 }
            r11.c(r8)     // Catch:{ auda -> 0x0679 }
            r2 = r33
            r10 = r22
            r5 = r24
            r8 = r25
            r15 = 0
            goto L_0x04c4
        L_0x0646:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0676 }
        L_0x0649:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ auda -> 0x0676 }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x0676 }
            if (r5 == 0) goto L_0x065a
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0676 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0676 }
            throw r2     // Catch:{ auda -> 0x0676 }
        L_0x065a:
            throw r2     // Catch:{ auda -> 0x0676 }
        L_0x065b:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ auda -> 0x0676 }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x0676 }
            if (r5 != 0) goto L_0x066f
            auda r5 = new auda     // Catch:{ auda -> 0x0676 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ auda -> 0x0676 }
            r5.<init>((java.lang.String) r2)     // Catch:{ auda -> 0x0676 }
            throw r5     // Catch:{ auda -> 0x0676 }
        L_0x066f:
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ auda -> 0x0676 }
            auda r2 = (defpackage.auda) r2     // Catch:{ auda -> 0x0676 }
            throw r2     // Catch:{ auda -> 0x0676 }
        L_0x0676:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ auda -> 0x0679 }
        L_0x0679:
            r0 = move-exception
            goto L_0x0680
        L_0x067b:
            r0 = move-exception
            r24 = r5
        L_0x067e:
            r22 = r10
        L_0x0680:
            long r10 = r12.g     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            r5 = 68
            r2.<init>(r5)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = "Failed to decode merged module request for user "
            r2.append(r5)     // Catch:{ all -> 0x0dfa }
            r2.append(r10)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = "SharedModuleManager"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0dfa }
            android.util.Log.e(r5, r2)     // Catch:{ all -> 0x0dfa }
            r13 = 0
        L_0x069b:
            if (r13 != 0) goto L_0x06c0
            long r10 = r1.b     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            r5 = 121(0x79, float:1.7E-43)
            r2.<init>(r5)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = "Module update request to system user from user "
            r2.append(r5)     // Catch:{ all -> 0x0dfa }
            r2.append(r10)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = " failed. Falling back to normal downloading mechanism."
            r2.append(r5)     // Catch:{ all -> 0x0dfa }
            java.lang.String r5 = "ChimeraConfigurator"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0dfa }
            android.util.Log.w(r5, r2)     // Catch:{ all -> 0x0dfa }
            r5 = r24
            r2 = 0
            goto L_0x06d8
        L_0x06c0:
            amzy r2 = r13.a     // Catch:{ all -> 0x0dfa }
            bpw r5 = defpackage.hgi.a((java.util.List) r2)     // Catch:{ all -> 0x0dfa }
            amzy r2 = r13.b     // Catch:{ all -> 0x0dfa }
            java.util.Comparator r7 = r7.a     // Catch:{ all -> 0x0dfa }
            bpw r7 = defpackage.bpw.b(r2, r7)     // Catch:{ all -> 0x0dfa }
            amzy r2 = r13.c     // Catch:{ all -> 0x0dfa }
            java.util.Comparator r8 = r9.a     // Catch:{ all -> 0x0dfa }
            bpw r9 = defpackage.bpw.b(r2, r8)     // Catch:{ all -> 0x0dfa }
            r2 = r22
        L_0x06d8:
            anav r8 = defpackage.anax.j()     // Catch:{ all -> 0x0dfa }
            int r10 = r35.size()     // Catch:{ all -> 0x0dfa }
            r11 = 0
        L_0x06e1:
            if (r11 >= r10) goto L_0x06f1
            java.lang.Object r12 = r4.get(r11)     // Catch:{ all -> 0x0dfa }
            boc r12 = (defpackage.boc) r12     // Catch:{ all -> 0x0dfa }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x0dfa }
            r8.b(r12)     // Catch:{ all -> 0x0dfa }
            int r11 = r11 + 1
            goto L_0x06e1
        L_0x06f1:
            anax r4 = r8.a()     // Catch:{ all -> 0x0dfa }
            java.lang.Object r8 = r6.e     // Catch:{ all -> 0x0dfa }
            monitor-enter(r8)     // Catch:{ all -> 0x0dfa }
            awxo r10 = defpackage.awxo.a     // Catch:{ all -> 0x0dc2 }
            awxv r10 = r10.a()     // Catch:{ all -> 0x0dc2 }
            boolean r10 = r10.D()     // Catch:{ all -> 0x0dc2 }
            if (r10 == 0) goto L_0x0ab1
            boolean r10 = r6.b()     // Catch:{ all -> 0x0dc2 }
            if (r10 == 0) goto L_0x0718
            java.lang.String r3 = "ModuleSetMgr"
            java.lang.String r5 = "not migrated with user locked"
            android.util.Log.e(r3, r5)     // Catch:{ all -> 0x0dc2 }
            r29 = r2
            r31 = r4
            r3 = 0
            goto L_0x0aae
        L_0x0718:
            android.content.Context r10 = r6.a     // Catch:{ InvalidConfigException -> 0x0a83 }
            bkv r10 = defpackage.bkv.a((android.content.Context) r10)     // Catch:{ InvalidConfigException -> 0x0a83 }
            bpw r10 = r10.d()     // Catch:{ InvalidConfigException -> 0x0a83 }
            java.util.Comparator r13 = defpackage.bmy.b     // Catch:{ InvalidConfigException -> 0x0a83 }
            bpw r13 = defpackage.bpw.a(r10, r13)     // Catch:{ InvalidConfigException -> 0x0a83 }
            hhr r14 = new hhr     // Catch:{ all -> 0x0dc2 }
            r14.<init>()     // Catch:{ all -> 0x0dc2 }
            ancq r3 = defpackage.hgi.a((defpackage.bpw) r5, (java.util.Set) r3, (defpackage.hhr) r14)     // Catch:{ all -> 0x0dc2 }
            amxc r15 = defpackage.amxc.p()     // Catch:{ all -> 0x0dc2 }
            long r11 = defpackage.hfz.i()     // Catch:{ all -> 0x0dc2 }
            java.util.Set r10 = r3.m()     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0741:
            boolean r20 = r10.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r20 == 0) goto L_0x0778
            java.lang.Object r20 = r10.next()     // Catch:{ all -> 0x0dc2 }
            r22 = r10
            r10 = r20
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0dc2 }
            java.util.List r20 = r3.a(r10)     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r20 = r20.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0759:
            boolean r23 = r20.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r23 == 0) goto L_0x0773
            java.lang.Object r23 = r20.next()     // Catch:{ all -> 0x0dc2 }
            r24 = r3
            r3 = r23
            hfg r3 = (defpackage.hfg) r3     // Catch:{ all -> 0x0dc2 }
            hfi r3 = defpackage.hfz.a((defpackage.hfg) r3, (long) r11)     // Catch:{ all -> 0x0dc2 }
            r15.a((java.lang.Object) r10, (java.lang.Object) r3)     // Catch:{ all -> 0x0dc2 }
            r3 = r24
            goto L_0x0759
        L_0x0773:
            r24 = r3
            r10 = r22
            goto L_0x0741
        L_0x0778:
            hfk r3 = r6.d()     // Catch:{ all -> 0x0dc2 }
            aucx r10 = r3.c     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0782:
            boolean r10 = r11.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x095a
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0dc2 }
            r11.<init>()     // Catch:{ all -> 0x0dc2 }
            java.util.Set r10 = r15.m()     // Catch:{ all -> 0x0dc2 }
            bpw r10 = defpackage.bpw.b(r10)     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r12 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0799:
            boolean r10 = r12.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x0835
            r14.b()     // Catch:{ all -> 0x0dc2 }
            android.content.Context r5 = r6.a     // Catch:{ all -> 0x0dc2 }
            r14.a((android.content.Context) r5)     // Catch:{ all -> 0x0dc2 }
            r5 = 5
            java.lang.Object r5 = r3.c(r5)     // Catch:{ all -> 0x0dc2 }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ all -> 0x0dc2 }
            r5.a((defpackage.aucj) r3)     // Catch:{ all -> 0x0dc2 }
            boolean r10 = r5.c     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x07b6
            goto L_0x07bc
        L_0x07b6:
            r5.c()     // Catch:{ all -> 0x0dc2 }
            r10 = 0
            r5.c = r10     // Catch:{ all -> 0x0dc2 }
        L_0x07bc:
            aucj r10 = r5.b     // Catch:{ all -> 0x0dc2 }
            hfk r10 = (defpackage.hfk) r10     // Catch:{ all -> 0x0dc2 }
            hfk r12 = defpackage.hfk.g     // Catch:{ all -> 0x0dc2 }
            aucx r12 = defpackage.aucj.s()     // Catch:{ all -> 0x0dc2 }
            r10.c = r12     // Catch:{ all -> 0x0dc2 }
            r5.D(r11)     // Catch:{ all -> 0x0dc2 }
            boolean r10 = r5.c     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x07d0
            goto L_0x07d6
        L_0x07d0:
            r5.c()     // Catch:{ all -> 0x0dc2 }
            r10 = 0
            r5.c = r10     // Catch:{ all -> 0x0dc2 }
        L_0x07d6:
            aucj r10 = r5.b     // Catch:{ all -> 0x0dc2 }
            hfk r10 = (defpackage.hfk) r10     // Catch:{ all -> 0x0dc2 }
            aucx r11 = defpackage.aucj.s()     // Catch:{ all -> 0x0dc2 }
            r10.d = r11     // Catch:{ all -> 0x0dc2 }
            r5.E(r7)     // Catch:{ all -> 0x0dc2 }
            boolean r7 = r5.c     // Catch:{ all -> 0x0dc2 }
            if (r7 != 0) goto L_0x07e8
            goto L_0x07ee
        L_0x07e8:
            r5.c()     // Catch:{ all -> 0x0dc2 }
            r7 = 0
            r5.c = r7     // Catch:{ all -> 0x0dc2 }
        L_0x07ee:
            aucj r7 = r5.b     // Catch:{ all -> 0x0dc2 }
            hfk r7 = (defpackage.hfk) r7     // Catch:{ all -> 0x0dc2 }
            aucx r10 = defpackage.aucj.s()     // Catch:{ all -> 0x0dc2 }
            r7.e = r10     // Catch:{ all -> 0x0dc2 }
            r5.C((java.lang.Iterable) r9)     // Catch:{ all -> 0x0dc2 }
            boolean r7 = defpackage.awxo.e()     // Catch:{ all -> 0x0dc2 }
            boolean r9 = r5.c     // Catch:{ all -> 0x0dc2 }
            if (r9 != 0) goto L_0x0804
            goto L_0x080a
        L_0x0804:
            r5.c()     // Catch:{ all -> 0x0dc2 }
            r9 = 0
            r5.c = r9     // Catch:{ all -> 0x0dc2 }
        L_0x080a:
            aucj r9 = r5.b     // Catch:{ all -> 0x0dc2 }
            hfk r9 = (defpackage.hfk) r9     // Catch:{ all -> 0x0dc2 }
            int r10 = r9.a     // Catch:{ all -> 0x0dc2 }
            r11 = 2
            r10 = r10 | r11
            r9.a = r10     // Catch:{ all -> 0x0dc2 }
            r9.f = r7     // Catch:{ all -> 0x0dc2 }
            aucj r5 = r5.i()     // Catch:{ all -> 0x0dc2 }
            hfk r5 = (defpackage.hfk) r5     // Catch:{ all -> 0x0dc2 }
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x0dc2 }
            r7 = 1
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x082e
            boolean r3 = r6.a((defpackage.hfk) r5)     // Catch:{ all -> 0x0dc2 }
            r29 = r2
            r31 = r4
            goto L_0x0aae
        L_0x082e:
            r29 = r2
            r31 = r4
            r3 = 0
            goto L_0x0aae
        L_0x0835:
            java.lang.Object r17 = r12.next()     // Catch:{ all -> 0x0dc2 }
            r10 = r17
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0dc2 }
            hfj r17 = defpackage.hfj.b     // Catch:{ all -> 0x0dc2 }
            r22 = r3
            aucd r3 = r17.o()     // Catch:{ all -> 0x0dc2 }
            int r17 = defpackage.hfz.h()     // Catch:{ all -> 0x0dc2 }
            java.util.List r10 = r15.a(r10)     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r23 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
            r24 = 0
            r25 = 0
        L_0x0855:
            boolean r10 = r23.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x0878
            aucj r10 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfj r10 = (defpackage.hfj) r10     // Catch:{ all -> 0x0dc2 }
            aucx r10 = r10.a     // Catch:{ all -> 0x0dc2 }
            int r10 = r10.size()     // Catch:{ all -> 0x0dc2 }
            if (r10 <= 0) goto L_0x0874
            aucj r3 = r3.i()     // Catch:{ all -> 0x0dc2 }
            hfj r3 = (defpackage.hfj) r3     // Catch:{ all -> 0x0dc2 }
            r11.add(r3)     // Catch:{ all -> 0x0dc2 }
            r3 = r22
            goto L_0x0799
        L_0x0874:
            r3 = r22
            goto L_0x0799
        L_0x0878:
            java.lang.Object r10 = r23.next()     // Catch:{ all -> 0x0dc2 }
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            r26 = r11
            hfg r11 = r10.b     // Catch:{ all -> 0x0dc2 }
            if (r11 == 0) goto L_0x0885
            goto L_0x0887
        L_0x0885:
            hfg r11 = defpackage.hfg.d     // Catch:{ all -> 0x0dc2 }
        L_0x0887:
            boolean r27 = defpackage.hfz.a((defpackage.hfg) r11)     // Catch:{ all -> 0x0dc2 }
            r28 = r12
            aucx r12 = r11.a     // Catch:{ all -> 0x0dc2 }
            r29 = r2
            r2 = 0
            java.lang.Object r12 = r12.get(r2)     // Catch:{ all -> 0x0dc2 }
            ansk r12 = (defpackage.ansk) r12     // Catch:{ all -> 0x0dc2 }
            boolean r2 = r13.contains(r12)     // Catch:{ all -> 0x0dc2 }
            r12 = 128(0x80, float:1.794E-43)
            boolean r30 = defpackage.hgi.a((defpackage.hfg) r11, (int) r12)     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x08aa
            boolean r12 = r10.f     // Catch:{ all -> 0x0dc2 }
            if (r12 != 0) goto L_0x08aa
            r12 = 0
            goto L_0x08ab
        L_0x08aa:
            r12 = 1
        L_0x08ab:
            if (r27 == 0) goto L_0x08b1
            r31 = r4
            goto L_0x094b
        L_0x08b1:
            if (r24 != 0) goto L_0x0949
            if (r25 == 0) goto L_0x08c0
            if (r2 != 0) goto L_0x08c0
            if (r12 == 0) goto L_0x08bc
            if (r17 <= 0) goto L_0x08bc
            goto L_0x08c0
        L_0x08bc:
            r31 = r4
            goto L_0x094b
        L_0x08c0:
            if (r2 != 0) goto L_0x08c4
            r2 = 0
            goto L_0x08c9
        L_0x08c4:
            if (r30 != 0) goto L_0x08c8
            r2 = 1
            goto L_0x08c9
        L_0x08c8:
            r2 = 0
        L_0x08c9:
            r25 = r25 | r2
            boolean r2 = r5.contains(r11)     // Catch:{ all -> 0x0dc2 }
            r31 = r4
            r4 = 5
            java.lang.Object r20 = r10.c(r4)     // Catch:{ all -> 0x0dc2 }
            r4 = r10
            r10 = r20
            aucd r10 = (defpackage.aucd) r10     // Catch:{ all -> 0x0dc2 }
            r10.a((defpackage.aucj) r4)     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x08f9
            boolean r2 = r10.c     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x08e5
        L_0x08e4:
            goto L_0x08ec
        L_0x08e5:
            r10.c()     // Catch:{ all -> 0x0dc2 }
            r2 = 0
            r10.c = r2     // Catch:{ all -> 0x0dc2 }
            goto L_0x08e4
        L_0x08ec:
            aucj r2 = r10.b     // Catch:{ all -> 0x0dc2 }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x0dc2 }
            defpackage.hfi.a(r2)     // Catch:{ all -> 0x0dc2 }
            r2 = 13
            r14.a((defpackage.hfg) r11, (int) r2)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0917
        L_0x08f9:
            boolean r2 = r10.c     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x08fe
            goto L_0x0904
        L_0x08fe:
            r10.c()     // Catch:{ all -> 0x0dc2 }
            r2 = 0
            r10.c = r2     // Catch:{ all -> 0x0dc2 }
        L_0x0904:
            aucj r2 = r10.b     // Catch:{ all -> 0x0dc2 }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x0dc2 }
            hfi r4 = defpackage.hfi.g     // Catch:{ all -> 0x0dc2 }
            int r4 = r2.a     // Catch:{ all -> 0x0dc2 }
            r4 = r4 & -5
            r2.a = r4     // Catch:{ all -> 0x0dc2 }
            r4 = 0
            r2.d = r4     // Catch:{ all -> 0x0dc2 }
            r2 = 3
            r14.a((defpackage.hfg) r11, (int) r2)     // Catch:{ all -> 0x0dc2 }
        L_0x0917:
            if (r12 != 0) goto L_0x091a
            goto L_0x0936
        L_0x091a:
            if (r30 != 0) goto L_0x0936
            boolean r2 = r10.c     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x0921
            goto L_0x0927
        L_0x0921:
            r10.c()     // Catch:{ all -> 0x0dc2 }
            r2 = 0
            r10.c = r2     // Catch:{ all -> 0x0dc2 }
        L_0x0927:
            aucj r2 = r10.b     // Catch:{ all -> 0x0dc2 }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x0dc2 }
            int r4 = r2.a     // Catch:{ all -> 0x0dc2 }
            r4 = r4 | 16
            r2.a = r4     // Catch:{ all -> 0x0dc2 }
            r4 = 1
            r2.f = r4     // Catch:{ all -> 0x0dc2 }
            int r17 = r17 + -1
        L_0x0936:
            aucj r2 = r10.i()     // Catch:{ all -> 0x0dc2 }
            hfi r2 = (defpackage.hfi) r2     // Catch:{ all -> 0x0dc2 }
            r3.a((defpackage.hfi) r2)     // Catch:{ all -> 0x0dc2 }
            r11 = r26
            r12 = r28
            r2 = r29
            r4 = r31
            goto L_0x0855
        L_0x0949:
            r31 = r4
        L_0x094b:
            r24 = r24 | r27
            r14.a((defpackage.hfg) r11)     // Catch:{ all -> 0x0dc2 }
            r11 = r26
            r12 = r28
            r2 = r29
            r4 = r31
            goto L_0x0855
        L_0x095a:
            r29 = r2
            r22 = r3
            r31 = r4
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x0dc2 }
            hfj r2 = (defpackage.hfj) r2     // Catch:{ all -> 0x0dc2 }
            aucx r3 = r2.a     // Catch:{ all -> 0x0dc2 }
            int r3 = r3.size()     // Catch:{ all -> 0x0dc2 }
            if (r3 == 0) goto L_0x0a76
            aucx r3 = r2.a     // Catch:{ all -> 0x0dc2 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0dc2 }
            hfi r3 = (defpackage.hfi) r3     // Catch:{ all -> 0x0dc2 }
            hfg r3 = r3.b     // Catch:{ all -> 0x0dc2 }
            if (r3 == 0) goto L_0x097c
            goto L_0x097e
        L_0x097c:
            hfg r3 = defpackage.hfg.d     // Catch:{ all -> 0x0dc2 }
        L_0x097e:
            aucx r3 = r3.a     // Catch:{ all -> 0x0dc2 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0dc2 }
            ansk r3 = (defpackage.ansk) r3     // Catch:{ all -> 0x0dc2 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0dc2 }
            java.util.List r4 = r15.a(r3)     // Catch:{ all -> 0x0dc2 }
            ansk r10 = defpackage.ansk.g     // Catch:{ all -> 0x0dc2 }
            aucd r10 = r10.o()     // Catch:{ all -> 0x0dc2 }
            boolean r12 = r10.c     // Catch:{ all -> 0x0dc2 }
            if (r12 != 0) goto L_0x0998
            goto L_0x099e
        L_0x0998:
            r10.c()     // Catch:{ all -> 0x0dc2 }
            r12 = 0
            r10.c = r12     // Catch:{ all -> 0x0dc2 }
        L_0x099e:
            aucj r12 = r10.b     // Catch:{ all -> 0x0dc2 }
            ansk r12 = (defpackage.ansk) r12     // Catch:{ all -> 0x0dc2 }
            r3.getClass()     // Catch:{ all -> 0x0dc2 }
            r17 = r11
            int r11 = r12.a     // Catch:{ all -> 0x0dc2 }
            r20 = 1
            r11 = r11 | 1
            r12.a = r11     // Catch:{ all -> 0x0dc2 }
            r12.b = r3     // Catch:{ all -> 0x0dc2 }
            r11 = r11 | 8
            r12.a = r11     // Catch:{ all -> 0x0dc2 }
            r20 = r14
            r11 = r15
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12.e = r14     // Catch:{ all -> 0x0dc2 }
            aucj r10 = r10.i()     // Catch:{ all -> 0x0dc2 }
            ansk r10 = (defpackage.ansk) r10     // Catch:{ all -> 0x0dc2 }
            int r10 = r13.a((java.lang.Object) r10)     // Catch:{ all -> 0x0dc2 }
            if (r10 >= 0) goto L_0x09cd
            r12 = 1
            goto L_0x09ce
        L_0x09cd:
            r12 = 0
        L_0x09ce:
            defpackage.amtf.a((boolean) r12)     // Catch:{ all -> 0x0dc2 }
            int r10 = r10 + 1
            int r10 = -r10
            r12 = -1
            int r10 = r10 + r12
        L_0x09d6:
            if (r10 < 0) goto L_0x09e9
            java.lang.Object r14 = r13.get(r10)     // Catch:{ all -> 0x0dc2 }
            ansk r14 = (defpackage.ansk) r14     // Catch:{ all -> 0x0dc2 }
            r15 = 128(0x80, float:1.794E-43)
            boolean r14 = defpackage.hgi.a((defpackage.ansk) r14, (int) r15)     // Catch:{ all -> 0x0dc2 }
            if (r14 == 0) goto L_0x09e9
            int r10 = r10 + -1
            goto L_0x09d6
        L_0x09e9:
            if (r10 < 0) goto L_0x09fa
            java.lang.Object r14 = r13.get(r10)     // Catch:{ all -> 0x0dc2 }
            ansk r14 = (defpackage.ansk) r14     // Catch:{ all -> 0x0dc2 }
            java.lang.String r14 = r14.b     // Catch:{ all -> 0x0dc2 }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x0dc2 }
            if (r3 == 0) goto L_0x09fa
            goto L_0x09fb
        L_0x09fa:
            r10 = -1
        L_0x09fb:
            if (r10 < 0) goto L_0x0a35
            java.lang.Object r3 = r13.get(r10)     // Catch:{ all -> 0x0dc2 }
            ansk r3 = (defpackage.ansk) r3     // Catch:{ all -> 0x0dc2 }
            long r14 = r3.e     // Catch:{ all -> 0x0dc2 }
            int r3 = r4.size()     // Catch:{ all -> 0x0dc2 }
            int r3 = r3 + r12
        L_0x0a0a:
            if (r3 < 0) goto L_0x0a33
            java.lang.Object r10 = r4.get(r3)     // Catch:{ all -> 0x0dc2 }
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            hfg r10 = r10.b     // Catch:{ all -> 0x0dc2 }
            if (r10 == 0) goto L_0x0a17
            goto L_0x0a19
        L_0x0a17:
            hfg r10 = defpackage.hfg.d     // Catch:{ all -> 0x0dc2 }
        L_0x0a19:
            aucx r10 = r10.a     // Catch:{ all -> 0x0dc2 }
            r12 = 0
            java.lang.Object r10 = r10.get(r12)     // Catch:{ all -> 0x0dc2 }
            ansk r10 = (defpackage.ansk) r10     // Catch:{ all -> 0x0dc2 }
            r12 = r11
            long r10 = r10.e     // Catch:{ all -> 0x0dc2 }
            boolean r10 = defpackage.hgi.a((long) r14, (long) r10)     // Catch:{ all -> 0x0dc2 }
            if (r10 == 0) goto L_0x0a2c
            goto L_0x0a36
        L_0x0a2c:
            r4.remove(r3)     // Catch:{ all -> 0x0dc2 }
            int r3 = r3 + -1
            r11 = r12
            goto L_0x0a0a
        L_0x0a33:
            r12 = r11
            goto L_0x0a36
        L_0x0a35:
            r12 = r11
        L_0x0a36:
            aucx r2 = r2.a     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0a3c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r3 == 0) goto L_0x0a69
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0dc2 }
            hfi r3 = (defpackage.hfi) r3     // Catch:{ all -> 0x0dc2 }
            java.util.Comparator r10 = defpackage.hgi.b     // Catch:{ all -> 0x0dc2 }
            anfk r10 = defpackage.anfk.a((java.util.Comparator) r10)     // Catch:{ all -> 0x0dc2 }
            amqy r11 = defpackage.hfr.a     // Catch:{ all -> 0x0dc2 }
            anfk r10 = r10.a((defpackage.amqy) r11)     // Catch:{ all -> 0x0dc2 }
            anfk r10 = r10.a()     // Catch:{ all -> 0x0dc2 }
            int r10 = java.util.Collections.binarySearch(r4, r3, r10)     // Catch:{ all -> 0x0dc2 }
            if (r10 >= 0) goto L_0x0a65
            int r10 = r10 + 1
            int r10 = -r10
            r4.add(r10, r3)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0a3c
        L_0x0a65:
            r4.set(r10, r3)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0a3c
        L_0x0a69:
            r15 = r12
            r11 = r17
            r14 = r20
            r3 = r22
            r2 = r29
            r4 = r31
            goto L_0x0782
        L_0x0a76:
            r17 = r11
            r20 = r14
            r12 = r15
            r3 = r22
            r2 = r29
            r4 = r31
            goto L_0x0782
        L_0x0a83:
            r0 = move-exception
            r29 = r2
            r31 = r4
            r2 = r0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0dc2 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0dc2 }
            int r3 = r3.length()     // Catch:{ all -> 0x0dc2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dc2 }
            int r3 = r3 + 44
            r4.<init>(r3)     // Catch:{ all -> 0x0dc2 }
            java.lang.String r3 = "Failed to get current chimera configuration "
            r4.append(r3)     // Catch:{ all -> 0x0dc2 }
            r4.append(r2)     // Catch:{ all -> 0x0dc2 }
            java.lang.String r2 = "ModuleSetMgr"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0dc2 }
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0dc2 }
            r3 = 0
        L_0x0aae:
            monitor-exit(r8)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0d93
        L_0x0ab1:
            r29 = r2
            r31 = r4
            boolean r2 = r6.b()     // Catch:{ all -> 0x0dc2 }
            if (r2 == 0) goto L_0x0ac5
            java.lang.String r2 = "ModuleSetMgr"
            java.lang.String r3 = "not migrated with user locked"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0dc2 }
            r11 = 0
            goto L_0x0d91
        L_0x0ac5:
            android.content.Context r2 = r6.a     // Catch:{ InvalidConfigException -> 0x0d6a }
            bkv r2 = defpackage.bkv.a((android.content.Context) r2)     // Catch:{ InvalidConfigException -> 0x0d6a }
            bpw r2 = r2.d()     // Catch:{ InvalidConfigException -> 0x0d6a }
            hhr r4 = new hhr     // Catch:{ all -> 0x0dc2 }
            r4.<init>()     // Catch:{ all -> 0x0dc2 }
            ancq r3 = defpackage.hgi.a((defpackage.bpw) r5, (java.util.Set) r3, (defpackage.hhr) r4)     // Catch:{ all -> 0x0dc2 }
            hfk r11 = r6.d()     // Catch:{ all -> 0x0dc2 }
            amxc r12 = defpackage.amxc.p()     // Catch:{ all -> 0x0dc2 }
            long r13 = defpackage.hfz.i()     // Catch:{ all -> 0x0dc2 }
            aucx r10 = r11.c     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0aea:
            boolean r15 = r10.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r15 == 0) goto L_0x0b6c
            java.lang.Object r15 = r10.next()     // Catch:{ all -> 0x0dc2 }
            hfj r15 = (defpackage.hfj) r15     // Catch:{ all -> 0x0dc2 }
            r17 = r10
            aucx r10 = r15.a     // Catch:{ all -> 0x0dc2 }
            int r10 = r10.size()     // Catch:{ all -> 0x0dc2 }
            if (r10 == 0) goto L_0x0b64
            aucx r10 = r15.a     // Catch:{ all -> 0x0dc2 }
            r20 = r5
            r5 = 0
            java.lang.Object r10 = r10.get(r5)     // Catch:{ all -> 0x0dc2 }
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            hfg r5 = r10.b     // Catch:{ all -> 0x0dc2 }
            if (r5 == 0) goto L_0x0b10
            goto L_0x0b12
        L_0x0b10:
            hfg r5 = defpackage.hfg.d     // Catch:{ all -> 0x0dc2 }
        L_0x0b12:
            aucx r10 = r5.a     // Catch:{ all -> 0x0dc2 }
            r22 = r2
            r2 = 0
            java.lang.Object r10 = r10.get(r2)     // Catch:{ all -> 0x0dc2 }
            ansk r10 = (defpackage.ansk) r10     // Catch:{ all -> 0x0dc2 }
            java.lang.String r2 = r10.b     // Catch:{ all -> 0x0dc2 }
            java.util.List r10 = r3.b(r2)     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0b27:
            boolean r23 = r10.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r23 == 0) goto L_0x0b47
            java.lang.Object r23 = r10.next()     // Catch:{ all -> 0x0dc2 }
            r24 = r10
            r10 = r23
            hfg r10 = (defpackage.hfg) r10     // Catch:{ all -> 0x0dc2 }
            boolean r23 = defpackage.hgi.b(r5, r10)     // Catch:{ all -> 0x0dc2 }
            if (r23 == 0) goto L_0x0b47
            hfi r10 = defpackage.hfz.a((defpackage.hfg) r10, (long) r13)     // Catch:{ all -> 0x0dc2 }
            r12.a((java.lang.Object) r2, (java.lang.Object) r10)     // Catch:{ all -> 0x0dc2 }
            r10 = r24
            goto L_0x0b27
        L_0x0b47:
            aucx r5 = r15.a     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0b4d:
            boolean r10 = r5.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r10 == 0) goto L_0x0b5d
            java.lang.Object r10 = r5.next()     // Catch:{ all -> 0x0dc2 }
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            r12.a((java.lang.Object) r2, (java.lang.Object) r10)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0b4d
        L_0x0b5d:
            r10 = r17
            r5 = r20
            r2 = r22
            goto L_0x0aea
        L_0x0b64:
            r22 = r2
            r20 = r5
            r10 = r17
            goto L_0x0aea
        L_0x0b6c:
            r22 = r2
            r20 = r5
            java.util.Set r2 = r3.m()     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0b78:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r5 == 0) goto L_0x0ba0
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0dc2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0dc2 }
            java.util.List r10 = r3.a(r5)     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0b8c:
            boolean r15 = r10.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r15 == 0) goto L_0x0b78
            java.lang.Object r15 = r10.next()     // Catch:{ all -> 0x0dc2 }
            hfg r15 = (defpackage.hfg) r15     // Catch:{ all -> 0x0dc2 }
            hfi r15 = defpackage.hfz.a((defpackage.hfg) r15, (long) r13)     // Catch:{ all -> 0x0dc2 }
            r12.a((java.lang.Object) r5, (java.lang.Object) r15)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0b8c
        L_0x0ba0:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0dc2 }
            r2.<init>()     // Catch:{ all -> 0x0dc2 }
            java.util.Set r3 = r12.m()     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0dc2 }
        L_0x0bad:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r5 != 0) goto L_0x0c42
            r4.b()     // Catch:{ all -> 0x0dc2 }
            android.content.Context r3 = r6.a     // Catch:{ all -> 0x0dc2 }
            r4.a((android.content.Context) r3)     // Catch:{ all -> 0x0dc2 }
            r3 = 5
            java.lang.Object r3 = r11.c(r3)     // Catch:{ all -> 0x0dc2 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ all -> 0x0dc2 }
            r3.a((defpackage.aucj) r11)     // Catch:{ all -> 0x0dc2 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0dc2 }
            if (r4 != 0) goto L_0x0bca
            goto L_0x0bd0
        L_0x0bca:
            r3.c()     // Catch:{ all -> 0x0dc2 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0dc2 }
        L_0x0bd0:
            aucj r4 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfk r4 = (defpackage.hfk) r4     // Catch:{ all -> 0x0dc2 }
            hfk r5 = defpackage.hfk.g     // Catch:{ all -> 0x0dc2 }
            aucx r5 = defpackage.aucj.s()     // Catch:{ all -> 0x0dc2 }
            r4.c = r5     // Catch:{ all -> 0x0dc2 }
            r3.D(r2)     // Catch:{ all -> 0x0dc2 }
            boolean r2 = r3.c     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x0be4
            goto L_0x0bea
        L_0x0be4:
            r3.c()     // Catch:{ all -> 0x0dc2 }
            r2 = 0
            r3.c = r2     // Catch:{ all -> 0x0dc2 }
        L_0x0bea:
            aucj r2 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfk r2 = (defpackage.hfk) r2     // Catch:{ all -> 0x0dc2 }
            aucx r4 = defpackage.aucj.s()     // Catch:{ all -> 0x0dc2 }
            r2.d = r4     // Catch:{ all -> 0x0dc2 }
            r3.E(r7)     // Catch:{ all -> 0x0dc2 }
            boolean r2 = r3.c     // Catch:{ all -> 0x0dc2 }
            if (r2 != 0) goto L_0x0bfc
            goto L_0x0c02
        L_0x0bfc:
            r3.c()     // Catch:{ all -> 0x0dc2 }
            r2 = 0
            r3.c = r2     // Catch:{ all -> 0x0dc2 }
        L_0x0c02:
            aucj r2 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfk r2 = (defpackage.hfk) r2     // Catch:{ all -> 0x0dc2 }
            aucx r4 = defpackage.aucj.s()     // Catch:{ all -> 0x0dc2 }
            r2.e = r4     // Catch:{ all -> 0x0dc2 }
            r3.C((java.lang.Iterable) r9)     // Catch:{ all -> 0x0dc2 }
            boolean r2 = defpackage.awxo.e()     // Catch:{ all -> 0x0dc2 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0dc2 }
            if (r4 != 0) goto L_0x0c18
            goto L_0x0c1e
        L_0x0c18:
            r3.c()     // Catch:{ all -> 0x0dc2 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0dc2 }
        L_0x0c1e:
            aucj r4 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfk r4 = (defpackage.hfk) r4     // Catch:{ all -> 0x0dc2 }
            int r5 = r4.a     // Catch:{ all -> 0x0dc2 }
            r7 = 2
            r5 = r5 | r7
            r4.a = r5     // Catch:{ all -> 0x0dc2 }
            r4.f = r2     // Catch:{ all -> 0x0dc2 }
            aucj r2 = r3.i()     // Catch:{ all -> 0x0dc2 }
            hfk r2 = (defpackage.hfk) r2     // Catch:{ all -> 0x0dc2 }
            boolean r3 = r2.equals(r11)     // Catch:{ all -> 0x0dc2 }
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0c3f
            boolean r2 = r6.a((defpackage.hfk) r2)     // Catch:{ all -> 0x0dc2 }
            r11 = r2
            goto L_0x0d91
        L_0x0c3f:
            r11 = 0
            goto L_0x0d91
        L_0x0c42:
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0dc2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0dc2 }
            hfj r13 = defpackage.hfj.b     // Catch:{ all -> 0x0dc2 }
            aucd r13 = r13.o()     // Catch:{ all -> 0x0dc2 }
            int r14 = defpackage.hfz.h()     // Catch:{ all -> 0x0dc2 }
            java.util.List r5 = r12.a(r5)     // Catch:{ all -> 0x0dc2 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0dc2 }
            r17 = r14
            r14 = 0
            r15 = 0
        L_0x0c5e:
            boolean r23 = r5.hasNext()     // Catch:{ all -> 0x0dc2 }
            if (r23 != 0) goto L_0x0c7b
            aucj r5 = r13.b     // Catch:{ all -> 0x0dc2 }
            hfj r5 = (defpackage.hfj) r5     // Catch:{ all -> 0x0dc2 }
            aucx r5 = r5.a     // Catch:{ all -> 0x0dc2 }
            int r5 = r5.size()     // Catch:{ all -> 0x0dc2 }
            if (r5 <= 0) goto L_0x0bad
            aucj r5 = r13.i()     // Catch:{ all -> 0x0dc2 }
            hfj r5 = (defpackage.hfj) r5     // Catch:{ all -> 0x0dc2 }
            r2.add(r5)     // Catch:{ all -> 0x0dc2 }
            goto L_0x0bad
        L_0x0c7b:
            java.lang.Object r23 = r5.next()     // Catch:{ all -> 0x0dc2 }
            r10 = r23
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            r23 = r2
            hfg r2 = r10.b     // Catch:{ all -> 0x0dc2 }
            if (r2 == 0) goto L_0x0c8a
            goto L_0x0c8c
        L_0x0c8a:
            hfg r2 = defpackage.hfg.d     // Catch:{ all -> 0x0dc2 }
        L_0x0c8c:
            boolean r24 = defpackage.hfz.a((defpackage.hfg) r2)     // Catch:{ all -> 0x0dc2 }
            if (r24 == 0) goto L_0x0c98
            r24 = r3
            r25 = r5
            goto L_0x0d5e
        L_0x0c98:
            if (r14 != 0) goto L_0x0d5a
            r24 = r3
            aucx r3 = r2.a     // Catch:{ all -> 0x0dc2 }
            r25 = r5
            r5 = 0
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0dc2 }
            ansk r3 = (defpackage.ansk) r3     // Catch:{ all -> 0x0dc2 }
            r5 = r22
            boolean r3 = r5.contains(r3)     // Catch:{ all -> 0x0dc2 }
            if (r3 != 0) goto L_0x0ce2
            r3 = 128(0x80, float:1.794E-43)
            boolean r19 = defpackage.hgi.a((defpackage.hfg) r2, (int) r3)     // Catch:{ all -> 0x0dc2 }
            if (r19 != 0) goto L_0x0cba
            r3 = r17
            goto L_0x0cc1
        L_0x0cba:
            if (r15 != 0) goto L_0x0cd8
            int r17 = r17 + 1
            r3 = r17
            r15 = 1
        L_0x0cc1:
            r22 = r5
            aucj r5 = r13.b     // Catch:{ all -> 0x0dc2 }
            hfj r5 = (defpackage.hfj) r5     // Catch:{ all -> 0x0dc2 }
            aucx r5 = r5.a     // Catch:{ all -> 0x0dc2 }
            int r5 = r5.size()     // Catch:{ all -> 0x0dc2 }
            if (r5 >= r3) goto L_0x0cd2
            r17 = r3
            goto L_0x0ce4
        L_0x0cd2:
            r4.a((defpackage.hfg) r2)     // Catch:{ all -> 0x0dc2 }
            r17 = r3
            goto L_0x0cda
        L_0x0cd8:
            r22 = r5
        L_0x0cda:
            r2 = r23
            r3 = r24
            r5 = r25
            goto L_0x0c5e
        L_0x0ce2:
            r22 = r5
        L_0x0ce4:
            r5 = r20
            boolean r3 = r5.contains(r2)     // Catch:{ all -> 0x0dc2 }
            if (r3 != 0) goto L_0x0d1b
            r3 = 5
            java.lang.Object r20 = r10.c(r3)     // Catch:{ all -> 0x0dc2 }
            r3 = r20
            aucd r3 = (defpackage.aucd) r3     // Catch:{ all -> 0x0dc2 }
            r3.a((defpackage.aucj) r10)     // Catch:{ all -> 0x0dc2 }
            boolean r10 = r3.c     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x0cfd
            goto L_0x0d03
        L_0x0cfd:
            r3.c()     // Catch:{ all -> 0x0dc2 }
            r10 = 0
            r3.c = r10     // Catch:{ all -> 0x0dc2 }
        L_0x0d03:
            aucj r10 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            defpackage.hfi.a(r10)     // Catch:{ all -> 0x0dc2 }
            aucj r3 = r3.i()     // Catch:{ all -> 0x0dc2 }
            hfi r3 = (defpackage.hfi) r3     // Catch:{ all -> 0x0dc2 }
            r13.a((defpackage.hfi) r3)     // Catch:{ all -> 0x0dc2 }
            r3 = 13
            r4.a((defpackage.hfg) r2, (int) r3)     // Catch:{ all -> 0x0dc2 }
            r20 = r5
            goto L_0x0d52
        L_0x0d1b:
            r3 = 13
            r3 = 5
            java.lang.Object r20 = r10.c(r3)     // Catch:{ all -> 0x0dc2 }
            r3 = r20
            aucd r3 = (defpackage.aucd) r3     // Catch:{ all -> 0x0dc2 }
            r3.a((defpackage.aucj) r10)     // Catch:{ all -> 0x0dc2 }
            boolean r10 = r3.c     // Catch:{ all -> 0x0dc2 }
            if (r10 != 0) goto L_0x0d2e
            goto L_0x0d34
        L_0x0d2e:
            r3.c()     // Catch:{ all -> 0x0dc2 }
            r10 = 0
            r3.c = r10     // Catch:{ all -> 0x0dc2 }
        L_0x0d34:
            aucj r10 = r3.b     // Catch:{ all -> 0x0dc2 }
            hfi r10 = (defpackage.hfi) r10     // Catch:{ all -> 0x0dc2 }
            hfi r20 = defpackage.hfi.g     // Catch:{ all -> 0x0dc2 }
            r20 = r5
            int r5 = r10.a     // Catch:{ all -> 0x0dc2 }
            r5 = r5 & -5
            r10.a = r5     // Catch:{ all -> 0x0dc2 }
            r5 = 0
            r10.d = r5     // Catch:{ all -> 0x0dc2 }
            aucj r3 = r3.i()     // Catch:{ all -> 0x0dc2 }
            hfi r3 = (defpackage.hfi) r3     // Catch:{ all -> 0x0dc2 }
            r13.a((defpackage.hfi) r3)     // Catch:{ all -> 0x0dc2 }
            r3 = 3
            r4.a((defpackage.hfg) r2, (int) r3)     // Catch:{ all -> 0x0dc2 }
        L_0x0d52:
            r2 = r23
            r3 = r24
            r5 = r25
            goto L_0x0c5e
        L_0x0d5a:
            r24 = r3
            r25 = r5
        L_0x0d5e:
            r4.a((defpackage.hfg) r2)     // Catch:{ all -> 0x0dc2 }
            r2 = r23
            r3 = r24
            r5 = r25
            r14 = 1
            goto L_0x0c5e
        L_0x0d6a:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0dc2 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0dc2 }
            int r3 = r3.length()     // Catch:{ all -> 0x0dc2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dc2 }
            int r3 = r3 + 44
            r4.<init>(r3)     // Catch:{ all -> 0x0dc2 }
            java.lang.String r3 = "Failed to get current chimera configuration "
            r4.append(r3)     // Catch:{ all -> 0x0dc2 }
            r4.append(r2)     // Catch:{ all -> 0x0dc2 }
            java.lang.String r2 = "ModuleSetMgr"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0dc2 }
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0dc2 }
            r11 = 0
        L_0x0d91:
            monitor-exit(r8)     // Catch:{ all -> 0x0dc2 }
            r3 = r11
        L_0x0d93:
            r2 = r33
            r4 = 3
            if (r2 == r4) goto L_0x0d99
            goto L_0x0da4
        L_0x0d99:
            int r2 = r1.b(r3)     // Catch:{ all -> 0x0dfa }
            r4 = 2
            if (r2 != r4) goto L_0x0da4
            r2 = 1
            defpackage.hey.a((boolean) r2)     // Catch:{ all -> 0x0dfa }
        L_0x0da4:
            r2 = r31
            bpw r4 = r6.b(r2)     // Catch:{ all -> 0x0dfa }
            if (r4 == 0) goto L_0x0db3
            r10 = r29
            boolean r11 = r1.a((defpackage.bpw) r4, (boolean) r10, (defpackage.anax) r2)     // Catch:{ all -> 0x0dfa }
            goto L_0x0db4
        L_0x0db3:
            r11 = 0
        L_0x0db4:
            if (r3 == 0) goto L_0x0db7
            goto L_0x0db9
        L_0x0db7:
            if (r11 == 0) goto L_0x0dc0
        L_0x0db9:
            r6.f()     // Catch:{ all -> 0x0dfa }
            r2 = 1
            r1.a((boolean) r2)     // Catch:{ all -> 0x0dfa }
        L_0x0dc0:
            monitor-exit(r32)
            return r11
        L_0x0dc2:
            r0 = move-exception
            r2 = r0
            monitor-exit(r8)     // Catch:{ all -> 0x0dc2 }
            throw r2     // Catch:{ all -> 0x0dfa }
        L_0x0dc6:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0dfa }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0dfa }
            int r3 = r3.length()     // Catch:{ all -> 0x0dfa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dfa }
            int r3 = r3 + 84
            r4.<init>(r3)     // Catch:{ all -> 0x0dfa }
            java.lang.String r3 = "Failed to parse chimera moduleset or server-requested features from phenotype flag: "
            r4.append(r3)     // Catch:{ all -> 0x0dfa }
            r4.append(r2)     // Catch:{ all -> 0x0dfa }
            java.lang.String r2 = "ChimeraConfigurator"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0dfa }
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0dfa }
            hem r2 = defpackage.hem.a()     // Catch:{ all -> 0x0dfa }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x0dfa }
            java.lang.String r4 = "ph"
            r2.a(r3, r12, r4)     // Catch:{ all -> 0x0dfa }
            monitor-exit(r32)
            r2 = 0
            return r2
        L_0x0dfa:
            r0 = move-exception
            r2 = r0
            monitor-exit(r32)
            goto L_0x0dff
        L_0x0dfe:
            throw r2
        L_0x0dff:
            goto L_0x0dfe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hek.a(int, hef, java.util.List):boolean");
    }
}
