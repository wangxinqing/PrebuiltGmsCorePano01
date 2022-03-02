package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zzm();
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;
    public byte[] f;
    public File g;

    static {
        SafeBrowsingData.class.getSimpleName();
    }

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            android.os.ParcelFileDescriptor r0 = r4.c
            r1 = 0
            if (r0 != 0) goto L_0x006a
            byte[] r0 = r4.f
            if (r0 == 0) goto L_0x006a
            java.io.File r0 = r4.g
            if (r0 == 0) goto L_0x0040
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x0035, all -> 0x002e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r4.c = r3     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            if (r0 == 0) goto L_0x0028
            r0.delete()
            goto L_0x0041
        L_0x0028:
            goto L_0x0041
        L_0x0029:
            r5 = move-exception
            r1 = r0
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            goto L_0x0037
        L_0x002e:
            r5 = move-exception
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.delete()
        L_0x0034:
            throw r5
        L_0x0035:
            r0 = move-exception
            r0 = r1
        L_0x0037:
            if (r0 == 0) goto L_0x003e
            r0.delete()
            r2 = r1
            goto L_0x0041
        L_0x003e:
            r2 = r1
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            if (r2 == 0) goto L_0x006a
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r0)
            byte[] r0 = r4.f     // Catch:{ IOException -> 0x0066, all -> 0x0061 }
            int r0 = r0.length     // Catch:{ IOException -> 0x0066, all -> 0x0061 }
            r2.writeInt(r0)     // Catch:{ IOException -> 0x0066, all -> 0x0061 }
            byte[] r0 = r4.f     // Catch:{ IOException -> 0x0066, all -> 0x0061 }
            r2.write(r0)     // Catch:{ IOException -> 0x0066, all -> 0x0061 }
            a(r2)
            r6 = r6 | 1
            defpackage.zzm.a(r4, r5, r6)
            goto L_0x006d
        L_0x0061:
            r5 = move-exception
            a(r2)
            throw r5
        L_0x0066:
            r0 = move-exception
            a(r2)
        L_0x006a:
            defpackage.zzm.a(r4, r5, r6)
        L_0x006d:
            r4.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }

    public SafeBrowsingData(String str) {
        this(str, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.a = str;
        this.b = dataHolder;
        this.c = parcelFileDescriptor;
        this.d = j;
        this.e = bArr;
    }
}
