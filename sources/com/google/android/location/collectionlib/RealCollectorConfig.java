package com.google.android.location.collectionlib;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RealCollectorConfig implements Parcelable, ahsg {
    public static final Parcelable.Creator CREATOR = new ahud();
    public static final Map a = new HashMap();
    public static final Map b = new HashMap();
    public final Set c;
    public final String d;
    final String e;
    final Map f;
    public boolean g;
    public volatile boolean h;
    public final int i;
    private final byte[] j;
    private final long k;
    private final long l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final ParcelableSensorScannerConfig p;
    private final int q;
    private final int r;
    private int s;
    private String t;
    private final boolean u;
    private aizx v;

    static {
        a.put(ahup.ORIENTATION, 3);
        a.put(ahup.ACCELEROMETER, 1);
        a.put(ahup.GYROSCOPE, 4);
        a.put(ahup.MAGNETIC_FIELD, 2);
        a.put(ahup.BAROMETER, 6);
        int i2 = Build.VERSION.SDK_INT;
        a.put(ahup.UNCAL_MAGNETIC_FIELD, 14);
        int i3 = Build.VERSION.SDK_INT;
        a.put(ahup.STEP_COUNTER, 19);
        int i4 = Build.VERSION.SDK_INT;
        a.put(ahup.HEART_RATE, 21);
        a.put(ahup.LIGHT, 5);
        a.put(ahup.PROXIMITY, 8);
        a.put(ahup.HEART_PPG, 65541);
        for (Map.Entry entry : a.entrySet()) {
            b.put((Integer) entry.getValue(), (ahup) entry.getKey());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RealCollectorConfig(android.os.Parcel r14) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 2
            r13.s = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r13.f = r1
            r1 = 0
            r13.g = r1
            r13.h = r1
            int r2 = r14.readInt()
            java.util.Set r2 = defpackage.ahup.a((int) r2)
            r13.c = r2
            java.lang.String r2 = r14.readString()
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L_0x008a
            int r7 = r2.hashCode()
            switch(r7) {
                case -2024427263: goto L_0x0064;
                case -1973849472: goto L_0x005a;
                case -1881281466: goto L_0x0050;
                case -603675139: goto L_0x0046;
                case 72607563: goto L_0x003c;
                case 1595802704: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x006e
        L_0x0032:
            java.lang.String r7 = "LOCAL_AND_TEMP_MEMORY"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x006e
            r2 = 5
            goto L_0x006f
        L_0x003c:
            java.lang.String r7 = "LOCAL"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x0046:
            java.lang.String r7 = "LOCAL_AND_MEMORY"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x006e
            r2 = 4
            goto L_0x006f
        L_0x0050:
            java.lang.String r7 = "REMOTE"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x006e
            r2 = 2
            goto L_0x006f
        L_0x005a:
            java.lang.String r7 = "MEMORY_SENSOR_EVENTS"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x006e
            r2 = 3
            goto L_0x006f
        L_0x0064:
            java.lang.String r7 = "MEMORY"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x006e
            r2 = 0
            goto L_0x006f
        L_0x006e:
            r2 = -1
        L_0x006f:
            if (r2 == 0) goto L_0x008a
            if (r2 == r6) goto L_0x0089
            if (r2 == r0) goto L_0x0087
            if (r2 == r5) goto L_0x0085
            if (r2 == r4) goto L_0x0083
            if (r2 != r3) goto L_0x007d
            r0 = 6
            goto L_0x008b
        L_0x007d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L_0x0083:
            r0 = 5
            goto L_0x008b
        L_0x0085:
            r0 = 4
            goto L_0x008b
        L_0x0087:
            r0 = 3
            goto L_0x008b
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            r0 = 1
        L_0x008b:
            r13.i = r0
            java.lang.String r0 = r14.readString()
            r13.d = r0
            int r0 = r14.readInt()
            if (r0 != r6) goto L_0x009b
            r0 = 1
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r13.n = r0
            long r2 = r14.readLong()
            r13.k = r2
            long r2 = r14.readLong()
            r13.l = r2
            long r2 = r14.readLong()
            r0 = 0
            android.os.Parcelable r4 = r14.readParcelable(r0)
            com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig r4 = (com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig) r4
            r13.p = r4
            if (r4 == 0) goto L_0x00bc
            r2 = 0
            goto L_0x00bd
        L_0x00bc:
        L_0x00bd:
            r13.m = r2
            int r2 = r14.readInt()
            r13.s = r2
            android.os.Bundle r2 = r14.readBundle()
            java.util.Map r3 = r13.f
            if (r2 == 0) goto L_0x0116
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00d5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0116
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0114 }
            java.util.Set r8 = defpackage.ahup.C     // Catch:{ NumberFormatException -> 0x0114 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ NumberFormatException -> 0x0114 }
            r10 = r0
            r9 = 0
        L_0x00ed:
            boolean r11 = r8.hasNext()     // Catch:{ NumberFormatException -> 0x0114 }
            if (r11 == 0) goto L_0x0102
            java.lang.Object r11 = r8.next()     // Catch:{ NumberFormatException -> 0x0114 }
            ahup r11 = (defpackage.ahup) r11     // Catch:{ NumberFormatException -> 0x0114 }
            int r12 = r11.x     // Catch:{ NumberFormatException -> 0x0114 }
            r12 = r12 & r7
            if (r12 == 0) goto L_0x00ed
            int r9 = r9 + 1
            r10 = r11
            goto L_0x00ed
        L_0x0102:
            if (r9 != r6) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r10 = r0
        L_0x0106:
            if (r10 == 0) goto L_0x00d5
            int r5 = r2.getInt(r5)     // Catch:{ NumberFormatException -> 0x0114 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0114 }
            r3.put(r10, r5)     // Catch:{ NumberFormatException -> 0x0114 }
            goto L_0x00d5
        L_0x0114:
            r5 = move-exception
            goto L_0x00d5
        L_0x0116:
            java.lang.String r2 = r14.readString()
            r13.t = r2
            java.lang.String r2 = r14.readString()
            r13.e = r2
            int r2 = r14.readInt()
            if (r2 <= 0) goto L_0x0130
            byte[] r2 = new byte[r2]
            r13.j = r2
            r14.readByteArray(r2)
            goto L_0x0132
        L_0x0130:
            r13.j = r0
        L_0x0132:
            int r2 = r14.readInt()
            if (r2 == 0) goto L_0x013a
            r2 = 1
            goto L_0x013b
        L_0x013a:
            r2 = 0
        L_0x013b:
            r13.g = r2
            int r2 = r14.readInt()
            if (r2 == 0) goto L_0x0145
            r2 = 1
            goto L_0x0146
        L_0x0145:
            r2 = 0
        L_0x0146:
            r13.u = r2
            int r2 = r14.readInt()
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0150:
            r2 = 0
        L_0x0151:
            r13.h = r2
            r14.readParcelable(r0)
            int r0 = r14.readInt()
            if (r0 == 0) goto L_0x015e
            r1 = 1
            goto L_0x015f
        L_0x015e:
        L_0x015f:
            r13.o = r1
            int r0 = r14.readInt()
            r13.r = r0
            int r14 = r14.readInt()
            r13.q = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.collectionlib.RealCollectorConfig.<init>(android.os.Parcel):void");
    }

    public final int a(ahup ahup) {
        Integer num = (Integer) this.f.get(ahup);
        if (num == null) {
            return this.s;
        }
        return num.intValue();
    }

    public final aizx a() {
        return this.v;
    }

    public final String b() {
        return this.t;
    }

    public final Set c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.k;
    }

    public final long f() {
        return this.l;
    }

    public final long g() {
        return this.m;
    }

    public final boolean h() {
        return this.n;
    }

    public final ahuu i() {
        ParcelableSensorScannerConfig parcelableSensorScannerConfig = this.p;
        if (parcelableSensorScannerConfig != null) {
            return parcelableSensorScannerConfig.a;
        }
        return null;
    }

    public final byte[] j() {
        return this.j;
    }

    public final boolean k() {
        return this.g;
    }

    public final boolean l() {
        return this.u;
    }

    public final ahsg m() {
        String str = this.e;
        if (str == null) {
            return this;
        }
        Set set = this.c;
        boolean z = this.n;
        long j2 = this.k;
        long j3 = this.l;
        long j4 = this.m;
        ParcelableSensorScannerConfig parcelableSensorScannerConfig = this.p;
        int i2 = this.i;
        String str2 = this.d;
        File file = new File(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[128];
        while (true) {
            String str3 = str2;
            int read = fileInputStream.read(bArr);
            FileInputStream fileInputStream2 = fileInputStream;
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                fileInputStream = fileInputStream2;
                str2 = str3;
            } else {
                RealCollectorConfig realCollectorConfig = r2;
                RealCollectorConfig realCollectorConfig2 = new RealCollectorConfig(set, z, j2, j3, j4, parcelableSensorScannerConfig, i2, str3, byteArrayOutputStream.toByteArray(), this.u, this.v, this.o, this.r, this.q);
                RealCollectorConfig realCollectorConfig3 = realCollectorConfig;
                realCollectorConfig3.s = this.s;
                realCollectorConfig3.f.putAll(this.f);
                realCollectorConfig3.t = this.t;
                realCollectorConfig3.g = this.g;
                realCollectorConfig3.h = this.h;
                return realCollectorConfig3;
            }
        }
    }

    public final Map n() {
        HashMap hashMap = new HashMap();
        for (ahup ahup : this.c) {
            if (a.containsKey(ahup)) {
                Integer num = (Integer) a.get(ahup);
                Integer num2 = (Integer) this.f.get(ahup);
                hashMap.put(num, Integer.valueOf(num2 != null ? num2.intValue() : this.s));
            }
        }
        return hashMap;
    }

    public final boolean o() {
        return this.h;
    }

    public final boolean p() {
        return this.o;
    }

    public final int q() {
        return this.q;
    }

    public final int r() {
        return this.r;
    }

    public final int s() {
        return this.i;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Scanner types: %s; Dest: %s; WifiDelay: %d; GpsDelay: %d, ScanDuration: %d, SensorConfig: %s, SensorDelay: %s; Data path: %s; Key path: %s; View opted out WIFI APs: %s; AutomaticShutDown: %s; ForceUpload: %s; Batching Sensor Allowed: %s; Batch scan duration %s.", new Object[]{this.c, ahsf.a(this.i), Long.valueOf(this.k), Long.valueOf(this.l), Long.valueOf(this.m), this.p, n(), this.d, this.e, Boolean.valueOf(this.g), Boolean.valueOf(this.u), Boolean.valueOf(this.h), Boolean.valueOf(this.o), Long.valueOf(this.m)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeInt(ahup.a(this.c));
        int i4 = this.i;
        String a2 = ahsf.a(i4);
        if (i4 != 0) {
            parcel.writeString(a2);
            parcel.writeString(this.d);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeLong(this.k);
            parcel.writeLong(this.l);
            parcel.writeLong(this.m);
            parcel.writeParcelable(this.p, i2);
            parcel.writeInt(this.s);
            Map map = this.f;
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putInt(String.valueOf(((ahup) entry.getKey()).x), ((Integer) entry.getValue()).intValue());
            }
            parcel.writeBundle(bundle);
            parcel.writeString(this.t);
            parcel.writeString(this.e);
            byte[] bArr = this.j;
            if (bArr != null) {
                i3 = bArr.length;
            } else {
                i3 = 0;
            }
            parcel.writeInt(i3);
            if (i3 > 0) {
                parcel.writeByteArray(this.j);
            }
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.u ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeParcelable((Parcelable) null, i2);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.r);
            parcel.writeInt(this.q);
            return;
        }
        throw null;
    }

    public final void a(ahup ahup, int i2) {
        this.f.put(ahup, Integer.valueOf(i2));
    }

    public RealCollectorConfig(Set set, boolean z, long j2, long j3, long j4, ParcelableSensorScannerConfig parcelableSensorScannerConfig, int i2, String str, byte[] bArr, boolean z2, aizx aizx, boolean z3, int i3, int i4) {
        boolean z4;
        long j5;
        boolean z5;
        boolean z6;
        Set set2 = set;
        long j6 = j2;
        long j7 = j3;
        ParcelableSensorScannerConfig parcelableSensorScannerConfig2 = parcelableSensorScannerConfig;
        int i5 = i2;
        String str2 = str;
        byte[] bArr2 = bArr;
        int i6 = i3;
        int i7 = i4;
        this.s = 2;
        this.f = Collections.synchronizedMap(new HashMap());
        this.g = false;
        this.h = false;
        amrl.a(j6 >= 0, (Object) "delayBetweenWifiScansMills cannot be negative");
        if (j7 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        amrl.a(z4, (Object) "delayBetweenGpsScansMills cannot be negative");
        if (parcelableSensorScannerConfig2 != null) {
            this.n = false;
            j5 = 0;
        } else {
            this.n = z;
            j5 = j4;
        }
        if (i5 == 2) {
            amrl.a((Object) str2, (Object) "dataPath could not be null if you want to write data to local storage");
        }
        if (i5 != 1) {
            amrl.a(j5 >= 0, (Object) "Scan duration should be >= 0");
        } else {
            amrl.a((parcelableSensorScannerConfig2 != null ? parcelableSensorScannerConfig2.a.c : j5) >= 0, (Object) "Invalid scan duration for MEMORY collection destination.");
        }
        if (i5 == 4) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!((ahup) it.next()).y) {
                    throw new IllegalArgumentException("Scanner types can't include non-sensor type when destination is ScannerType.MEMORY_SENSOR_EVENTS");
                }
            }
        }
        if (!ahvx.a(str)) {
            amrl.a(!ahvx.a((String) null) ? true : bArr2 != null && bArr2.length == 32, (Object) "You must specify a valid key for encryption when writing data to persistent storage.");
            if (bArr2 == null) {
                amrl.a((Object) null);
                File file = new File((String) null);
                try {
                    amrl.b(file.getCanonicalPath().startsWith("/data/"), (Object) "The key should be in the /data/ partition.");
                    if (!file.isFile() || !file.exists()) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    z5 = false;
                    amrl.b(z6, (Object) String.format(Locale.ENGLISH, "%s does not exist.", new Object[]{null}));
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Unable to parse the key path.");
                }
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        amrl.a(!set2.contains(ahup.SOUND) || !set2.contains(ahup.RAW_AUDIO));
        if (set2.contains(ahup.RAW_AUDIO)) {
            amrl.a(i7 >= 0);
            amrl.a(i6 >= 0);
            amrl.a(i7 >= i6 ? true : z5);
        }
        this.e = null;
        this.j = bArr2;
        this.c = set2;
        this.k = j6;
        this.l = j7;
        this.m = j5;
        this.p = parcelableSensorScannerConfig2;
        this.i = i2;
        this.d = str;
        this.u = z2;
        this.v = aizx;
        this.o = z3;
        this.r = i6;
        this.q = i7;
    }
}
