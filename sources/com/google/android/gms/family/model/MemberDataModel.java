package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MemberDataModel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mhm();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public int g;
    public boolean h;
    public long i;
    public int j;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r0.equals("UNSUPERVISED") != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MemberDataModel(android.os.Parcel r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = r6.readString()
            r5.a = r0
            java.lang.String r0 = r6.readString()
            r5.b = r0
            java.lang.String r0 = r6.readString()
            r5.c = r0
            java.lang.String r0 = r6.readString()
            r5.d = r0
            java.lang.String r0 = r6.readString()
            r5.e = r0
            java.lang.String r0 = r6.readString()
            r5.f = r0
            int r0 = r6.readInt()
            r5.g = r0
            int r0 = r6.readInt()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r5.h = r0
            java.lang.String r0 = r6.readString()
            int r3 = r0.hashCode()
            r4 = -1553293955(0xffffffffa36a9d7d, float:-1.2718515E-17)
            if (r3 == r4) goto L_0x0057
            r1 = -1212137948(0xffffffffb7c03e24, float:-2.291712E-5)
            if (r3 == r1) goto L_0x004d
            goto L_0x0060
        L_0x004d:
            java.lang.String r1 = "SUPERVISED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            r1 = 1
            goto L_0x0061
        L_0x0057:
            java.lang.String r3 = "UNSUPERVISED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r1 = -1
        L_0x0061:
            if (r1 == 0) goto L_0x006d
            if (r1 != r2) goto L_0x0067
            r2 = 2
            goto L_0x006e
        L_0x0067:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L_0x006d:
        L_0x006e:
            r5.j = r2
            long r0 = r6.readLong()
            r5.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.family.model.MemberDataModel.<init>(android.os.Parcel):void");
    }

    public final boolean a() {
        return this.j != 1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        int i3 = this.j;
        String str = i3 != 1 ? i3 != 2 ? "null" : "SUPERVISED" : "UNSUPERVISED";
        if (i3 != 0) {
            parcel.writeString(str);
            parcel.writeLong(this.i);
            return;
        }
        throw null;
    }

    public MemberDataModel(String str, String str2, String str3, String str4, String str5, String str6, int i2, boolean z, int i3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i2;
        this.h = z;
        this.j = i3;
        this.i = l.longValue();
    }
}
