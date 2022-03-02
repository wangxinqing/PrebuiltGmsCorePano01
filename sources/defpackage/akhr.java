package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: akhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhr implements akhq {
    private final File a;
    private final String b;
    private final Context c;
    private int d = 0;
    private long e;
    private LevelDb f;
    private SharedPreferences g;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;

    public akhr(Context context, String str) {
        this.c = context;
        this.b = str;
        File cacheDir = this.c.getCacheDir();
        String str2 = File.separator;
        String str3 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12 + String.valueOf(str3).length());
        sb.append("places_cache");
        sb.append(str2);
        sb.append(str3);
        this.a = new File(cacheDir, sb.toString());
    }

    private static byte[] a(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    private final void d(long j2) {
        WriteBatch create = WriteBatch.create();
        LevelDb.Iterator it = this.f.iterator();
        it.seekToFirst();
        int i2 = 0;
        while (it.isValid()) {
            try {
                if (aubc.a(it.value()).g() < j2) {
                    create.delete(it.key());
                } else {
                    i2++;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("Places", 5)) {
                    alfy.b("Places", "Failed to read timestamp", e2);
                }
            }
            it.next();
        }
        it.close();
        try {
            this.f.write(create);
            this.d = i2;
        } catch (LevelDbException e3) {
            alfy.b("Places", "Failed delete old entries", e3);
            this.k++;
        }
        create.close();
    }

    public final synchronized void b(long j2) {
        if (this.f == null) {
            SharedPreferences sharedPreferences = this.c.getSharedPreferences(this.b, 0);
            this.g = sharedPreferences;
            int i2 = sharedPreferences.getInt("version", -1);
            if (i2 != 2 || !this.a.exists() || !this.a.isDirectory()) {
                Context context = this.c;
                this.g.edit().putInt("version", 2).putLong("last_maintenance", j2).putInt("key_count", 0).apply();
                if (i2 <= 0) {
                    File file = new File(context.getCacheDir(), "place_cache");
                    if (file.exists() && file.isDirectory() && !jjc.a(file) && Log.isLoggable("Places", 5)) {
                        alfy.c("Places", "Failed to remove old places cache");
                    }
                }
                this.d = 0;
                File file2 = this.a;
                if (((file2.exists() && !jjc.a(file2)) || !file2.mkdirs()) && Log.isLoggable("Places", 5)) {
                    alfy.c("Places", "Failed to to migrate place cache to version: 2");
                }
            }
            this.e = this.g.getLong("last_maintenance", -1);
            this.d = this.g.getInt("key_count", 0);
            try {
                this.f = LevelDb.open(this.a);
            } catch (LevelDbException e2) {
                if (Log.isLoggable("Places", 5)) {
                    String valueOf = String.valueOf(this.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Failed to initialize PlacesCache ");
                    sb.append(valueOf);
                    alfy.c("Places", sb.toString());
                    this.k++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.leveldb.LevelDb r0 = r2.f     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0017
            java.lang.String r3 = "Places"
            r4 = 5
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "Places"
            java.lang.String r4 = "discardOldEntries() invoked on closed place cache"
            defpackage.alfy.c(r3, r4)     // Catch:{ all -> 0x0033 }
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            long r0 = defpackage.azci.b()     // Catch:{ all -> 0x0033 }
            long r0 = r3 - r0
            r2.d(r0)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r0 = r2.g     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "last_maintenance"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r3)     // Catch:{ all -> 0x0033 }
            r0.apply()     // Catch:{ all -> 0x0033 }
            r2.e = r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhr.c(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.location.places.internal.PlaceEntity a(java.lang.String r8, long r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.leveldb.LevelDb r0 = r7.f     // Catch:{ all -> 0x0071 }
            r1 = 5
            r2 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String r8 = "Places"
            boolean r8 = android.util.Log.isLoggable(r8, r1)     // Catch:{ all -> 0x0071 }
            if (r8 == 0) goto L_0x0016
            java.lang.String r8 = "Places"
            java.lang.String r9 = "lookup() invoked on closed place cache"
            defpackage.alfy.c(r8, r9)     // Catch:{ all -> 0x0071 }
        L_0x0016:
            monitor-exit(r7)
            return r2
        L_0x0018:
            byte[] r8 = a((java.lang.String) r8)     // Catch:{ IOException -> 0x0054 }
            com.google.android.gms.leveldb.LevelDb r0 = r7.f     // Catch:{ IOException -> 0x0054 }
            byte[] r8 = r0.get(r8)     // Catch:{ IOException -> 0x0054 }
            if (r8 == 0) goto L_0x006a
            aubc r8 = defpackage.aubc.a((byte[]) r8)     // Catch:{ IOException -> 0x0054 }
            long r3 = r8.g()     // Catch:{ IOException -> 0x0054 }
            long r5 = defpackage.azci.b()     // Catch:{ IOException -> 0x0054 }
            long r3 = r3 + r5
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0049
            assu r9 = defpackage.assu.q     // Catch:{ IOException -> 0x0054 }
            aucj r8 = defpackage.aucj.a((defpackage.aucj) r9, (defpackage.aubc) r8)     // Catch:{ IOException -> 0x0054 }
            assu r8 = (defpackage.assu) r8     // Catch:{ IOException -> 0x0054 }
            com.google.android.gms.location.places.internal.PlaceEntity r8 = defpackage.aksd.a((defpackage.assu) r8)     // Catch:{ IOException -> 0x0054 }
            int r9 = r7.i     // Catch:{ IOException -> 0x0054 }
            int r9 = r9 + 1
            r7.i = r9     // Catch:{ IOException -> 0x0054 }
            monitor-exit(r7)
            return r8
        L_0x0049:
            r7.c(r9)     // Catch:{ IOException -> 0x0054 }
            int r8 = r7.j     // Catch:{ IOException -> 0x0054 }
            int r8 = r8 + 1
            r7.j = r8     // Catch:{ IOException -> 0x0054 }
        L_0x0052:
            monitor-exit(r7)
            return r2
        L_0x0054:
            r8 = move-exception
            java.lang.String r9 = "Places"
            boolean r9 = android.util.Log.isLoggable(r9, r1)     // Catch:{ all -> 0x0071 }
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = "Places"
            java.lang.String r10 = "Failed to read data from levelDB"
            defpackage.alfy.b(r9, r10, r8)     // Catch:{ all -> 0x0071 }
            int r8 = r7.k     // Catch:{ all -> 0x0071 }
            int r8 = r8 + 1
            r7.k = r8     // Catch:{ all -> 0x0071 }
        L_0x006a:
            int r8 = r7.j     // Catch:{ all -> 0x0071 }
            int r8 = r8 + 1
            r7.j = r8     // Catch:{ all -> 0x0071 }
            goto L_0x0052
        L_0x0071:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0075
        L_0x0074:
            throw r8
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhr.a(java.lang.String, long):com.google.android.gms.location.places.internal.PlaceEntity");
    }

    public final synchronized void a() {
        LevelDb levelDb = this.f;
        if (levelDb != null) {
            levelDb.close();
            this.f = null;
        }
    }

    public final synchronized void a(double d2) {
        ArrayList arrayList = new ArrayList();
        LevelDb.Iterator it = this.f.iterator();
        it.seekToFirst();
        while (it.isValid()) {
            try {
                arrayList.add(Long.valueOf(aubc.a(it.value()).g()));
            } catch (IOException e2) {
                if (Log.isLoggable("Places", 5)) {
                    alfy.b("Places", "Failed to read timestamp", e2);
                }
            }
            it.next();
        }
        it.close();
        Collections.sort(arrayList);
        double size = (double) arrayList.size();
        Double.isNaN(size);
        int i2 = (int) (d2 * size);
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 >= arrayList.size()) {
            i2 = arrayList.size() - 1;
        }
        d(i2 >= 0 ? ((Long) arrayList.get(i2)).longValue() : 0);
    }

    public final synchronized void a(long j2) {
        LevelDb levelDb = this.f;
        if (levelDb != null) {
            a();
        }
        try {
            LevelDb.destroy(this.a);
        } catch (LevelDbException e2) {
            if (Log.isLoggable("Places", 5)) {
                alfy.b("Places", "Failed clear levelDB data", e2);
            }
            this.k++;
        }
        if (levelDb != null) {
            b(j2);
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0478, code lost:
        return;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.Collection r19, long r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            monitor-enter(r18)
            com.google.android.gms.leveldb.LevelDb r0 = r1.f     // Catch:{ all -> 0x0479 }
            if (r0 == 0) goto L_0x0467
            com.google.android.gms.leveldb.WriteBatch r5 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ all -> 0x0479 }
            int r6 = r19.size()     // Catch:{ all -> 0x0479 }
            r7 = 0
            r8 = 0
        L_0x0013:
            if (r8 >= r6) goto L_0x03f4
            r9 = r19
            java.lang.Object r0 = r9.get(r8)     // Catch:{ all -> 0x0479 }
            r10 = r0
            com.google.android.gms.location.places.internal.PlaceEntity r10 = (com.google.android.gms.location.places.internal.PlaceEntity) r10     // Catch:{ all -> 0x0479 }
            assu r0 = defpackage.assu.q     // Catch:{ all -> 0x0479 }
            aucd r0 = r0.o()     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r10.a     // Catch:{ all -> 0x0479 }
            boolean r12 = r0.c     // Catch:{ all -> 0x0479 }
            if (r12 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r0.c()     // Catch:{ all -> 0x0479 }
            r0.c = r7     // Catch:{ all -> 0x0479 }
        L_0x0030:
            aucj r12 = r0.b     // Catch:{ all -> 0x0479 }
            assu r12 = (defpackage.assu) r12     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            int r13 = r12.a     // Catch:{ all -> 0x0479 }
            r13 = r13 | 1
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.b = r11     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r10.k     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            r13 = r13 | 4
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.e = r11     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r10.l     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            r13 = r13 | 8
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.f = r11     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r10.m     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            r13 = r13 | 16
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.g = r11     // Catch:{ all -> 0x0479 }
            boolean r11 = r10.g     // Catch:{ all -> 0x0479 }
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.k = r11     // Catch:{ all -> 0x0479 }
            float r11 = r10.h     // Catch:{ all -> 0x0479 }
            r13 = r13 | 256(0x100, float:3.59E-43)
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.l = r11     // Catch:{ all -> 0x0479 }
            int r11 = r10.i     // Catch:{ all -> 0x0479 }
            r13 = r13 | 512(0x200, float:7.175E-43)
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.m = r11     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r10.e     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.n = r11     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r10.q     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.p = r11     // Catch:{ all -> 0x0479 }
            r11 = 0
        L_0x008f:
            java.util.List r12 = r10.j     // Catch:{ all -> 0x0479 }
            int r12 = r12.size()     // Catch:{ all -> 0x0479 }
            if (r11 >= r12) goto L_0x00d0
            java.util.List r12 = r10.j     // Catch:{ all -> 0x0479 }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x0479 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0479 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0479 }
            java.lang.String r12 = defpackage.akic.a((int) r12)     // Catch:{ all -> 0x0479 }
            boolean r13 = r0.c     // Catch:{ all -> 0x0479 }
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r0.c()     // Catch:{ all -> 0x0479 }
            r0.c = r7     // Catch:{ all -> 0x0479 }
        L_0x00b1:
            aucj r13 = r0.b     // Catch:{ all -> 0x0479 }
            assu r13 = (defpackage.assu) r13     // Catch:{ all -> 0x0479 }
            r12.getClass()     // Catch:{ all -> 0x0479 }
            aucx r14 = r13.c     // Catch:{ all -> 0x0479 }
            boolean r14 = r14.a()     // Catch:{ all -> 0x0479 }
            if (r14 != 0) goto L_0x00c8
            aucx r14 = r13.c     // Catch:{ all -> 0x0479 }
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)     // Catch:{ all -> 0x0479 }
            r13.c = r14     // Catch:{ all -> 0x0479 }
        L_0x00c8:
            aucx r13 = r13.c     // Catch:{ all -> 0x0479 }
            r13.add(r12)     // Catch:{ all -> 0x0479 }
            int r11 = r11 + 1
            goto L_0x008f
        L_0x00d0:
            java.util.Locale r11 = r10.r     // Catch:{ all -> 0x0479 }
            if (r11 != 0) goto L_0x00d5
            goto L_0x0114
        L_0x00d5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0479 }
            r12.<init>()     // Catch:{ all -> 0x0479 }
            java.lang.String r13 = r11.getLanguage()     // Catch:{ all -> 0x0479 }
            r12.append(r13)     // Catch:{ all -> 0x0479 }
            java.lang.String r13 = r11.getCountry()     // Catch:{ all -> 0x0479 }
            int r13 = r13.length()     // Catch:{ all -> 0x0479 }
            if (r13 <= 0) goto L_0x00f7
            java.lang.String r13 = "-"
            r12.append(r13)     // Catch:{ all -> 0x0479 }
            java.lang.String r11 = r11.getCountry()     // Catch:{ all -> 0x0479 }
            r12.append(r11)     // Catch:{ all -> 0x0479 }
        L_0x00f7:
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0479 }
            boolean r12 = r0.c     // Catch:{ all -> 0x0479 }
            if (r12 != 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            r0.c()     // Catch:{ all -> 0x0479 }
            r0.c = r7     // Catch:{ all -> 0x0479 }
        L_0x0105:
            aucj r12 = r0.b     // Catch:{ all -> 0x0479 }
            assu r12 = (defpackage.assu) r12     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            int r13 = r12.a     // Catch:{ all -> 0x0479 }
            r13 = r13 | 2
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.d = r11     // Catch:{ all -> 0x0479 }
        L_0x0114:
            java.util.List r11 = r10.n     // Catch:{ all -> 0x0479 }
            boolean r12 = r0.c     // Catch:{ all -> 0x0479 }
            if (r12 == 0) goto L_0x011f
            r0.c()     // Catch:{ all -> 0x0479 }
            r0.c = r7     // Catch:{ all -> 0x0479 }
        L_0x011f:
            aucj r12 = r0.b     // Catch:{ all -> 0x0479 }
            assu r12 = (defpackage.assu) r12     // Catch:{ all -> 0x0479 }
            aucx r13 = r12.h     // Catch:{ all -> 0x0479 }
            boolean r13 = r13.a()     // Catch:{ all -> 0x0479 }
            if (r13 != 0) goto L_0x0133
            aucx r13 = r12.h     // Catch:{ all -> 0x0479 }
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)     // Catch:{ all -> 0x0479 }
            r12.h = r13     // Catch:{ all -> 0x0479 }
        L_0x0133:
            aucx r12 = r12.h     // Catch:{ all -> 0x0479 }
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r12)     // Catch:{ all -> 0x0479 }
            assw r11 = defpackage.assw.d     // Catch:{ all -> 0x0479 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x0479 }
            com.google.android.gms.maps.model.LatLng r12 = r10.b     // Catch:{ all -> 0x0479 }
            if (r12 == 0) goto L_0x015f
            avoq r12 = defpackage.aksd.a((com.google.android.gms.maps.model.LatLng) r12)     // Catch:{ all -> 0x0479 }
            boolean r13 = r11.c     // Catch:{ all -> 0x0479 }
            if (r13 != 0) goto L_0x014b
            goto L_0x0150
        L_0x014b:
            r11.c()     // Catch:{ all -> 0x0479 }
            r11.c = r7     // Catch:{ all -> 0x0479 }
        L_0x0150:
            aucj r13 = r11.b     // Catch:{ all -> 0x0479 }
            assw r13 = (defpackage.assw) r13     // Catch:{ all -> 0x0479 }
            r12.getClass()     // Catch:{ all -> 0x0479 }
            r13.b = r12     // Catch:{ all -> 0x0479 }
            int r12 = r13.a     // Catch:{ all -> 0x0479 }
            r12 = r12 | 1
            r13.a = r12     // Catch:{ all -> 0x0479 }
        L_0x015f:
            com.google.android.gms.maps.model.LatLngBounds r12 = r10.d     // Catch:{ all -> 0x0479 }
            if (r12 == 0) goto L_0x0180
            assd r12 = defpackage.aksd.a((com.google.android.gms.maps.model.LatLngBounds) r12)     // Catch:{ all -> 0x0479 }
            boolean r13 = r11.c     // Catch:{ all -> 0x0479 }
            if (r13 != 0) goto L_0x016c
            goto L_0x0171
        L_0x016c:
            r11.c()     // Catch:{ all -> 0x0479 }
            r11.c = r7     // Catch:{ all -> 0x0479 }
        L_0x0171:
            aucj r13 = r11.b     // Catch:{ all -> 0x0479 }
            assw r13 = (defpackage.assw) r13     // Catch:{ all -> 0x0479 }
            r12.getClass()     // Catch:{ all -> 0x0479 }
            r13.c = r12     // Catch:{ all -> 0x0479 }
            int r12 = r13.a     // Catch:{ all -> 0x0479 }
            r12 = r12 | 2
            r13.a = r12     // Catch:{ all -> 0x0479 }
        L_0x0180:
            boolean r12 = r0.c     // Catch:{ all -> 0x0479 }
            if (r12 != 0) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            r0.c()     // Catch:{ all -> 0x0479 }
            r0.c = r7     // Catch:{ all -> 0x0479 }
        L_0x018a:
            aucj r12 = r0.b     // Catch:{ all -> 0x0479 }
            assu r12 = (defpackage.assu) r12     // Catch:{ all -> 0x0479 }
            aucj r11 = r11.i()     // Catch:{ all -> 0x0479 }
            assw r11 = (defpackage.assw) r11     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            r12.i = r11     // Catch:{ all -> 0x0479 }
            int r11 = r12.a     // Catch:{ all -> 0x0479 }
            r11 = r11 | 32
            r12.a = r11     // Catch:{ all -> 0x0479 }
            android.net.Uri r11 = r10.f     // Catch:{ all -> 0x0479 }
            if (r11 == 0) goto L_0x01c0
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0479 }
            boolean r12 = r0.c     // Catch:{ all -> 0x0479 }
            if (r12 != 0) goto L_0x01ac
            goto L_0x01b1
        L_0x01ac:
            r0.c()     // Catch:{ all -> 0x0479 }
            r0.c = r7     // Catch:{ all -> 0x0479 }
        L_0x01b1:
            aucj r12 = r0.b     // Catch:{ all -> 0x0479 }
            assu r12 = (defpackage.assu) r12     // Catch:{ all -> 0x0479 }
            r11.getClass()     // Catch:{ all -> 0x0479 }
            int r13 = r12.a     // Catch:{ all -> 0x0479 }
            r13 = r13 | 64
            r12.a = r13     // Catch:{ all -> 0x0479 }
            r12.j = r11     // Catch:{ all -> 0x0479 }
        L_0x01c0:
            com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity r11 = r10.o     // Catch:{ all -> 0x0479 }
            if (r11 == 0) goto L_0x038e
            asug r12 = defpackage.asug.c     // Catch:{ all -> 0x0479 }
            aucd r12 = r12.o()     // Catch:{ all -> 0x0479 }
            java.util.List r13 = r11.a     // Catch:{ all -> 0x0479 }
            if (r13 == 0) goto L_0x01f5
            java.util.List r13 = defpackage.aksd.b(r13)     // Catch:{ all -> 0x0479 }
            boolean r14 = r12.c     // Catch:{ all -> 0x0479 }
            if (r14 != 0) goto L_0x01d7
            goto L_0x01dc
        L_0x01d7:
            r12.c()     // Catch:{ all -> 0x0479 }
            r12.c = r7     // Catch:{ all -> 0x0479 }
        L_0x01dc:
            aucj r14 = r12.b     // Catch:{ all -> 0x0479 }
            asug r14 = (defpackage.asug) r14     // Catch:{ all -> 0x0479 }
            aucx r15 = r14.a     // Catch:{ all -> 0x0479 }
            boolean r15 = r15.a()     // Catch:{ all -> 0x0479 }
            if (r15 != 0) goto L_0x01f0
            aucx r15 = r14.a     // Catch:{ all -> 0x0479 }
            aucx r15 = defpackage.aucj.a((defpackage.aucx) r15)     // Catch:{ all -> 0x0479 }
            r14.a = r15     // Catch:{ all -> 0x0479 }
        L_0x01f0:
            aucx r14 = r14.a     // Catch:{ all -> 0x0479 }
            defpackage.auab.a((java.lang.Iterable) r13, (java.util.List) r14)     // Catch:{ all -> 0x0479 }
        L_0x01f5:
            java.util.List r11 = r11.b     // Catch:{ all -> 0x0479 }
            if (r11 != 0) goto L_0x01fd
            r17 = r6
            goto L_0x036c
        L_0x01fd:
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0479 }
        L_0x0201:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x0479 }
            if (r13 == 0) goto L_0x036a
            java.lang.Object r13 = r11.next()     // Catch:{ all -> 0x0479 }
            com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity$ExceptionalHours r13 = (com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity.ExceptionalHours) r13     // Catch:{ all -> 0x0479 }
            asul r14 = defpackage.asul.d     // Catch:{ all -> 0x0479 }
            aucd r14 = r14.o()     // Catch:{ all -> 0x0479 }
            asuk r15 = defpackage.asuk.d     // Catch:{ all -> 0x0479 }
            aucd r15 = r15.o()     // Catch:{ all -> 0x0479 }
            asuj r16 = defpackage.asuj.e     // Catch:{ all -> 0x0479 }
            aucd r4 = r16.o()     // Catch:{ all -> 0x0479 }
            int r7 = r13.a     // Catch:{ all -> 0x0479 }
            r17 = r6
            boolean r6 = r4.c     // Catch:{ all -> 0x0479 }
            if (r6 != 0) goto L_0x0228
            goto L_0x022e
        L_0x0228:
            r4.c()     // Catch:{ all -> 0x0479 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0479 }
        L_0x022e:
            aucj r6 = r4.b     // Catch:{ all -> 0x0479 }
            asuj r6 = (defpackage.asuj) r6     // Catch:{ all -> 0x0479 }
            int r9 = r6.a     // Catch:{ all -> 0x0479 }
            r9 = r9 | 4
            r6.a = r9     // Catch:{ all -> 0x0479 }
            r6.d = r7     // Catch:{ all -> 0x0479 }
            int r6 = r13.b     // Catch:{ all -> 0x0479 }
            int r6 = defpackage.asui.a(r6)     // Catch:{ all -> 0x0479 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0479 }
            if (r7 != 0) goto L_0x0245
            goto L_0x024b
        L_0x0245:
            r4.c()     // Catch:{ all -> 0x0479 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0479 }
        L_0x024b:
            aucj r7 = r4.b     // Catch:{ all -> 0x0479 }
            asuj r7 = (defpackage.asuj) r7     // Catch:{ all -> 0x0479 }
            if (r6 == 0) goto L_0x0367
            r7.c = r6     // Catch:{ all -> 0x0479 }
            int r6 = r7.a     // Catch:{ all -> 0x0479 }
            r6 = r6 | 2
            r7.a = r6     // Catch:{ all -> 0x0479 }
            int r9 = r13.c     // Catch:{ all -> 0x0479 }
            r6 = r6 | 1
            r7.a = r6     // Catch:{ all -> 0x0479 }
            r7.b = r9     // Catch:{ all -> 0x0479 }
            boolean r6 = r15.c     // Catch:{ all -> 0x0479 }
            if (r6 != 0) goto L_0x0266
            goto L_0x026c
        L_0x0266:
            r15.c()     // Catch:{ all -> 0x0479 }
            r6 = 0
            r15.c = r6     // Catch:{ all -> 0x0479 }
        L_0x026c:
            aucj r6 = r15.b     // Catch:{ all -> 0x0479 }
            asuk r6 = (defpackage.asuk) r6     // Catch:{ all -> 0x0479 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0479 }
            asuj r4 = (defpackage.asuj) r4     // Catch:{ all -> 0x0479 }
            r4.getClass()     // Catch:{ all -> 0x0479 }
            r6.b = r4     // Catch:{ all -> 0x0479 }
            int r4 = r6.a     // Catch:{ all -> 0x0479 }
            r4 = r4 | 1
            r6.a = r4     // Catch:{ all -> 0x0479 }
            asuj r4 = defpackage.asuj.e     // Catch:{ all -> 0x0479 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0479 }
            int r6 = r13.d     // Catch:{ all -> 0x0479 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0479 }
            if (r7 != 0) goto L_0x028e
            goto L_0x0294
        L_0x028e:
            r4.c()     // Catch:{ all -> 0x0479 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0479 }
        L_0x0294:
            aucj r7 = r4.b     // Catch:{ all -> 0x0479 }
            asuj r7 = (defpackage.asuj) r7     // Catch:{ all -> 0x0479 }
            int r9 = r7.a     // Catch:{ all -> 0x0479 }
            r9 = r9 | 4
            r7.a = r9     // Catch:{ all -> 0x0479 }
            r7.d = r6     // Catch:{ all -> 0x0479 }
            int r6 = r13.e     // Catch:{ all -> 0x0479 }
            int r6 = defpackage.asui.a(r6)     // Catch:{ all -> 0x0479 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0479 }
            if (r7 != 0) goto L_0x02ab
            goto L_0x02b1
        L_0x02ab:
            r4.c()     // Catch:{ all -> 0x0479 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0479 }
        L_0x02b1:
            aucj r7 = r4.b     // Catch:{ all -> 0x0479 }
            asuj r7 = (defpackage.asuj) r7     // Catch:{ all -> 0x0479 }
            if (r6 == 0) goto L_0x0365
            r7.c = r6     // Catch:{ all -> 0x0479 }
            int r6 = r7.a     // Catch:{ all -> 0x0479 }
            r6 = r6 | 2
            r7.a = r6     // Catch:{ all -> 0x0479 }
            int r9 = r13.f     // Catch:{ all -> 0x0479 }
            r6 = r6 | 1
            r7.a = r6     // Catch:{ all -> 0x0479 }
            r7.b = r9     // Catch:{ all -> 0x0479 }
            boolean r6 = r15.c     // Catch:{ all -> 0x0479 }
            if (r6 != 0) goto L_0x02cc
            goto L_0x02d2
        L_0x02cc:
            r15.c()     // Catch:{ all -> 0x0479 }
            r6 = 0
            r15.c = r6     // Catch:{ all -> 0x0479 }
        L_0x02d2:
            aucj r6 = r15.b     // Catch:{ all -> 0x0479 }
            asuk r6 = (defpackage.asuk) r6     // Catch:{ all -> 0x0479 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0479 }
            asuj r4 = (defpackage.asuj) r4     // Catch:{ all -> 0x0479 }
            r4.getClass()     // Catch:{ all -> 0x0479 }
            r6.c = r4     // Catch:{ all -> 0x0479 }
            int r4 = r6.a     // Catch:{ all -> 0x0479 }
            r4 = r4 | 2
            r6.a = r4     // Catch:{ all -> 0x0479 }
            boolean r4 = r14.c     // Catch:{ all -> 0x0479 }
            if (r4 != 0) goto L_0x02ec
            goto L_0x02f2
        L_0x02ec:
            r14.c()     // Catch:{ all -> 0x0479 }
            r4 = 0
            r14.c = r4     // Catch:{ all -> 0x0479 }
        L_0x02f2:
            aucj r4 = r14.b     // Catch:{ all -> 0x0479 }
            asul r4 = (defpackage.asul) r4     // Catch:{ all -> 0x0479 }
            aucj r6 = r15.i()     // Catch:{ all -> 0x0479 }
            asuk r6 = (defpackage.asuk) r6     // Catch:{ all -> 0x0479 }
            r6.getClass()     // Catch:{ all -> 0x0479 }
            r4.b = r6     // Catch:{ all -> 0x0479 }
            int r6 = r4.a     // Catch:{ all -> 0x0479 }
            r6 = r6 | 1
            r4.a = r6     // Catch:{ all -> 0x0479 }
            java.util.List r4 = r13.g     // Catch:{ all -> 0x0479 }
            java.util.List r4 = defpackage.aksd.b(r4)     // Catch:{ all -> 0x0479 }
            boolean r6 = r14.c     // Catch:{ all -> 0x0479 }
            if (r6 != 0) goto L_0x0312
            goto L_0x0318
        L_0x0312:
            r14.c()     // Catch:{ all -> 0x0479 }
            r6 = 0
            r14.c = r6     // Catch:{ all -> 0x0479 }
        L_0x0318:
            aucj r6 = r14.b     // Catch:{ all -> 0x0479 }
            asul r6 = (defpackage.asul) r6     // Catch:{ all -> 0x0479 }
            aucx r7 = r6.c     // Catch:{ all -> 0x0479 }
            boolean r7 = r7.a()     // Catch:{ all -> 0x0479 }
            if (r7 != 0) goto L_0x032c
            aucx r7 = r6.c     // Catch:{ all -> 0x0479 }
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)     // Catch:{ all -> 0x0479 }
            r6.c = r7     // Catch:{ all -> 0x0479 }
        L_0x032c:
            aucx r6 = r6.c     // Catch:{ all -> 0x0479 }
            defpackage.auab.a((java.lang.Iterable) r4, (java.util.List) r6)     // Catch:{ all -> 0x0479 }
            aucj r4 = r14.i()     // Catch:{ all -> 0x0479 }
            asul r4 = (defpackage.asul) r4     // Catch:{ all -> 0x0479 }
            boolean r6 = r12.c     // Catch:{ all -> 0x0479 }
            if (r6 != 0) goto L_0x033c
            goto L_0x0342
        L_0x033c:
            r12.c()     // Catch:{ all -> 0x0479 }
            r6 = 0
            r12.c = r6     // Catch:{ all -> 0x0479 }
        L_0x0342:
            aucj r6 = r12.b     // Catch:{ all -> 0x0479 }
            asug r6 = (defpackage.asug) r6     // Catch:{ all -> 0x0479 }
            r4.getClass()     // Catch:{ all -> 0x0479 }
            aucx r7 = r6.b     // Catch:{ all -> 0x0479 }
            boolean r7 = r7.a()     // Catch:{ all -> 0x0479 }
            if (r7 != 0) goto L_0x0359
            aucx r7 = r6.b     // Catch:{ all -> 0x0479 }
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)     // Catch:{ all -> 0x0479 }
            r6.b = r7     // Catch:{ all -> 0x0479 }
        L_0x0359:
            aucx r6 = r6.b     // Catch:{ all -> 0x0479 }
            r6.add(r4)     // Catch:{ all -> 0x0479 }
            r9 = r19
            r6 = r17
            r7 = 0
            goto L_0x0201
        L_0x0365:
            r0 = 0
            throw r0     // Catch:{ all -> 0x0479 }
        L_0x0367:
            r0 = 0
            throw r0     // Catch:{ all -> 0x0479 }
        L_0x036a:
            r17 = r6
        L_0x036c:
            aucj r4 = r12.i()     // Catch:{ all -> 0x0479 }
            asug r4 = (defpackage.asug) r4     // Catch:{ all -> 0x0479 }
            boolean r6 = r0.c     // Catch:{ all -> 0x0479 }
            if (r6 != 0) goto L_0x0378
            r6 = 0
            goto L_0x037e
        L_0x0378:
            r0.c()     // Catch:{ all -> 0x0479 }
            r6 = 0
            r0.c = r6     // Catch:{ all -> 0x0479 }
        L_0x037e:
            aucj r7 = r0.b     // Catch:{ all -> 0x0479 }
            assu r7 = (defpackage.assu) r7     // Catch:{ all -> 0x0479 }
            r4.getClass()     // Catch:{ all -> 0x0479 }
            r7.o = r4     // Catch:{ all -> 0x0479 }
            int r4 = r7.a     // Catch:{ all -> 0x0479 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r7.a = r4     // Catch:{ all -> 0x0479 }
            goto L_0x0391
        L_0x038e:
            r17 = r6
            r6 = 0
        L_0x0391:
            aucj r0 = r0.i()     // Catch:{ all -> 0x0479 }
            assu r0 = (defpackage.assu) r0     // Catch:{ all -> 0x0479 }
            int r4 = r0.U     // Catch:{ all -> 0x0479 }
            r7 = -1
            if (r4 != r7) goto L_0x03a8
            aueh r4 = defpackage.aueh.a     // Catch:{ all -> 0x0479 }
            aueq r4 = r4.a((java.lang.Object) r0)     // Catch:{ all -> 0x0479 }
            int r4 = r4.b(r0)     // Catch:{ all -> 0x0479 }
            r0.U = r4     // Catch:{ all -> 0x0479 }
        L_0x03a8:
            int r4 = r4 + 8
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0479 }
            aubk r7 = defpackage.aubk.a((byte[]) r4)     // Catch:{ all -> 0x0479 }
            r7.d((long) r2)     // Catch:{ IOException -> 0x03c6 }
            r0.a((defpackage.aubk) r7)     // Catch:{ IOException -> 0x03c6 }
            java.lang.String r0 = r10.a     // Catch:{ IOException -> 0x03c6 }
            byte[] r0 = a((java.lang.String) r0)     // Catch:{ IOException -> 0x03c6 }
            r5.put(r0, r4)     // Catch:{ IOException -> 0x03c6 }
            int r0 = r1.d     // Catch:{ IOException -> 0x03c6 }
            int r0 = r0 + 1
            r1.d = r0     // Catch:{ IOException -> 0x03c6 }
            goto L_0x03ed
        L_0x03c6:
            r0 = move-exception
            java.lang.String r0 = "Places"
            r4 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0479 }
            if (r0 == 0) goto L_0x03ed
            java.lang.String r0 = r10.a     // Catch:{ all -> 0x0479 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0479 }
            java.lang.String r4 = "Failed to serialize "
            int r7 = r0.length()     // Catch:{ all -> 0x0479 }
            if (r7 != 0) goto L_0x03e4
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0479 }
            r0.<init>(r4)     // Catch:{ all -> 0x0479 }
            goto L_0x03e8
        L_0x03e4:
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0479 }
        L_0x03e8:
            java.lang.String r4 = "Places"
            defpackage.alfy.c(r4, r0)     // Catch:{ all -> 0x0479 }
        L_0x03ed:
            int r8 = r8 + 1
            r6 = r17
            r7 = 0
            goto L_0x0013
        L_0x03f4:
            com.google.android.gms.leveldb.LevelDb r0 = r1.f     // Catch:{ LevelDbException -> 0x0408 }
            r0.write(r5)     // Catch:{ LevelDbException -> 0x0408 }
            int r0 = r1.h     // Catch:{ LevelDbException -> 0x0408 }
            int r4 = r19.size()     // Catch:{ LevelDbException -> 0x0408 }
            int r0 = r0 + r4
            r1.h = r0     // Catch:{ LevelDbException -> 0x0408 }
        L_0x0402:
            r5.close()     // Catch:{ all -> 0x0479 }
            goto L_0x0424
        L_0x0406:
            r0 = move-exception
            goto L_0x0463
        L_0x0408:
            r0 = move-exception
            java.lang.String r4 = "Places"
            r6 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x0406 }
            if (r4 == 0) goto L_0x0402
            java.lang.String r2 = "Places"
            java.lang.String r3 = "Failed to write data to levelDB"
            defpackage.alfy.b(r2, r3, r0)     // Catch:{ all -> 0x0406 }
            int r0 = r1.k     // Catch:{ all -> 0x0406 }
            int r0 = r0 + 1
            r1.k = r0     // Catch:{ all -> 0x0406 }
            r5.close()     // Catch:{ all -> 0x0479 }
            monitor-exit(r18)
            return
        L_0x0424:
            long r4 = r1.e     // Catch:{ all -> 0x0479 }
            azci r0 = defpackage.azci.a     // Catch:{ all -> 0x0479 }
            azcj r0 = r0.a()     // Catch:{ all -> 0x0479 }
            long r6 = r0.e()     // Catch:{ all -> 0x0479 }
            long r4 = r4 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0438
            r1.c(r2)     // Catch:{ all -> 0x0479 }
        L_0x0438:
            int r0 = r1.d     // Catch:{ all -> 0x0479 }
            long r2 = (long) r0     // Catch:{ all -> 0x0479 }
            long r4 = defpackage.azci.c()     // Catch:{ all -> 0x0479 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0450
            azci r0 = defpackage.azci.a     // Catch:{ all -> 0x0479 }
            azcj r0 = r0.a()     // Catch:{ all -> 0x0479 }
            double r2 = r0.b()     // Catch:{ all -> 0x0479 }
            r1.a((double) r2)     // Catch:{ all -> 0x0479 }
        L_0x0450:
            android.content.SharedPreferences r0 = r1.g     // Catch:{ all -> 0x0479 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0479 }
            java.lang.String r2 = "key_count"
            int r3 = r1.d     // Catch:{ all -> 0x0479 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r3)     // Catch:{ all -> 0x0479 }
            r0.apply()     // Catch:{ all -> 0x0479 }
            monitor-exit(r18)
            return
        L_0x0463:
            r5.close()     // Catch:{ all -> 0x0479 }
            throw r0     // Catch:{ all -> 0x0479 }
        L_0x0467:
            java.lang.String r0 = "Places"
            r2 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0479 }
            if (r0 == 0) goto L_0x0477
            java.lang.String r0 = "Places"
            java.lang.String r2 = "insert() invoked on closed place cache"
            defpackage.alfy.c(r0, r2)     // Catch:{ all -> 0x0479 }
        L_0x0477:
            monitor-exit(r18)
            return
        L_0x0479:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x047d
        L_0x047c:
            throw r0
        L_0x047d:
            goto L_0x047c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhr.a(java.util.Collection, long):void");
    }
}
