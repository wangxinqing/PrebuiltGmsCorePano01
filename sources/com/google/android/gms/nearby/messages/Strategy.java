package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uyl();
    public static final Strategy a = new uyk().a();
    public static final Strategy b;
    final int c;
    @Deprecated
    final int d;
    public final int e;
    public final int f;
    @Deprecated
    final boolean g;
    public final int h;
    public final int i;
    public final int j;

    static {
        uyk uyk = new uyk();
        uyk.c = 2;
        uyk.a(Integer.MAX_VALUE);
        b = uyk.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Strategy(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto L_0x000e
        L_0x000b:
            r1.i = r8
            goto L_0x0019
        L_0x000e:
            if (r3 == r0) goto L_0x0017
            r8 = 3
            if (r3 == r8) goto L_0x0014
            goto L_0x000b
        L_0x0014:
            r1.i = r0
            goto L_0x0019
        L_0x0017:
            r1.i = r2
        L_0x0019:
            r1.f = r5
            r1.g = r6
            if (r6 == 0) goto L_0x0027
            r1.h = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.e = r2
            goto L_0x0038
        L_0x0027:
            r1.e = r4
            r3 = -1
            if (r7 == r3) goto L_0x0036
            if (r7 == 0) goto L_0x0036
            if (r7 == r2) goto L_0x0036
            r2 = 6
            if (r7 == r2) goto L_0x0036
            r1.h = r7
            goto L_0x0038
        L_0x0036:
            r1.h = r3
        L_0x0038:
            r1.j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public final boolean a() {
        return (this.i & 2) != 0;
    }

    public final boolean b() {
        return (this.i & 1) != 0;
    }

    public final boolean c() {
        return (this.h & 2) != 0;
    }

    public final boolean d() {
        return this.h == -1;
    }

    public final boolean e() {
        return (this.h & 4) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Strategy) {
            Strategy strategy = (Strategy) obj;
            return this.c == strategy.c && this.i == strategy.i && this.e == strategy.e && this.f == strategy.f && this.h == strategy.h && this.j == strategy.j;
        }
    }

    public final int hashCode() {
        return (((((((((this.c * 31) + this.i) * 31) + this.e) * 31) + this.f) * 31) + this.h) * 31) + this.j;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i2 = this.e;
        int i3 = this.f;
        String str4 = "DEFAULT";
        if (i3 == 0) {
            str = str4;
        } else if (i3 != 1) {
            StringBuilder sb = new StringBuilder(19);
            sb.append("UNKNOWN:");
            sb.append(i3);
            str = sb.toString();
        } else {
            str = "EARSHOT";
        }
        int i4 = this.h;
        if (i4 != -1) {
            ArrayList arrayList = new ArrayList();
            if ((i4 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i4 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("UNKNOWN:");
                sb2.append(i4);
                str2 = sb2.toString();
            } else {
                str2 = arrayList.toString();
            }
        } else {
            str2 = str4;
        }
        int i5 = this.i;
        if (i5 != 3) {
            ArrayList arrayList2 = new ArrayList();
            if ((i5 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i5 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(19);
                sb3.append("UNKNOWN:");
                sb3.append(i5);
                str3 = sb3.toString();
            } else {
                str3 = arrayList2.toString();
            }
        } else {
            str3 = str4;
        }
        int i6 = this.j;
        if (i6 != 0) {
            if (i6 != 1) {
                StringBuilder sb4 = new StringBuilder(20);
                sb4.append("UNKNOWN: ");
                sb4.append(i6);
                str4 = sb4.toString();
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb5 = new StringBuilder(length + 102 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb5.append("Strategy{ttlSeconds=");
        sb5.append(i2);
        sb5.append(", distanceType=");
        sb5.append(str);
        sb5.append(", discoveryMedium=");
        sb5.append(str2);
        sb5.append(", discoveryMode=");
        sb5.append(str3);
        sb5.append(", backgroundScanMode=");
        sb5.append(str4);
        sb5.append('}');
        return sb5.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.d);
        ivx.b(parcel, 2, this.e);
        ivx.b(parcel, 3, this.f);
        ivx.a(parcel, 4, this.g);
        ivx.b(parcel, 5, this.h);
        ivx.b(parcel, 6, this.i);
        ivx.b(parcel, 7, this.j);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.c);
        ivx.b(parcel, a2);
    }
}
