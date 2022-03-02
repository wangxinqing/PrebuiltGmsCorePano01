package com.google.android.gms.plus.sharebox;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AddToCircleData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zku();
    public final int a;
    public String b;
    public String c;
    public Audience d;
    public Audience e;
    public ArrayList f;
    public Integer g;
    private Boolean h;
    private Boolean i;

    public AddToCircleData(int i2, String str, String str2, Audience audience, Audience audience2, ArrayList arrayList, Integer num, Boolean bool, Boolean bool2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = audience;
        this.e = audience2;
        this.f = arrayList;
        this.g = num;
        this.h = bool;
        this.i = bool2;
    }

    private final int a(String str) {
        if (!b() || TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(((Circle) this.f.get(i2)).e)) {
                return i2;
            }
        }
        return -1;
    }

    private final boolean g() {
        return a(this.b) >= 0;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final int c() {
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final boolean d() {
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r1.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r1 = this;
            ikz r0 = defpackage.ysu.N
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001b
            java.lang.Boolean r0 = r1.i
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            return r0
        L_0x001b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.sharebox.AddToCircleData.e():boolean");
    }

    public final Audience f() {
        Audience audience = this.e;
        ArrayList arrayList = new ArrayList();
        if (audience != null) {
            int size = audience.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                AudienceMember audienceMember = (AudienceMember) audience.b.get(i2);
                if (audienceMember.c() && audienceMember.h.getBoolean("checked", false)) {
                    arrayList.add(audienceMember);
                }
            }
        }
        iww iww = new iww();
        iww.a((Collection) arrayList);
        return iww.a();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(AddToCircleData.class.getSimpleName());
        stringBuffer.append("<");
        stringBuffer.append("circles=");
        ArrayList arrayList = this.f;
        int i2 = 0;
        stringBuffer.append(arrayList != null ? arrayList.size() : 0);
        stringBuffer.append(" audience=");
        Audience audience = this.d;
        stringBuffer.append(audience != null ? audience.b.size() : 0);
        stringBuffer.append(" uncircledPeople=");
        Audience audience2 = this.e;
        if (audience2 != null) {
            i2 = audience2.b.size();
        }
        stringBuffer.append(i2);
        stringBuffer.append(" index=");
        stringBuffer.append(c());
        stringBuffer.append(" checked=");
        stringBuffer.append(d());
        stringBuffer.append(" hidden=");
        stringBuffer.append(e());
        int size = f().b.size();
        StringBuilder sb = new StringBuilder(24);
        sb.append(" peopleToAdd=");
        sb.append(size);
        stringBuffer.append(sb.toString());
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010b, code lost:
        if (r13 < 0) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.people.data.Audience r12, com.google.android.gms.common.people.data.Audience r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x019d
            r11.d = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            if (r12 == 0) goto L_0x009e
            java.util.List r4 = r12.b
            int r4 = r4.size()
            r5 = 0
        L_0x0015:
            if (r5 < r4) goto L_0x0019
            goto L_0x009e
        L_0x0019:
            java.util.List r6 = r12.b
            java.lang.Object r6 = r6.get(r5)
            com.google.android.gms.common.people.data.AudienceMember r6 = (com.google.android.gms.common.people.data.AudienceMember) r6
            android.os.Bundle r7 = r6.h
            boolean r8 = r6.c()
            if (r8 != 0) goto L_0x002b
        L_0x0029:
            goto L_0x009a
        L_0x002b:
            if (r7 == 0) goto L_0x0029
            if (r6 == 0) goto L_0x003b
            android.os.Bundle r8 = r6.h
            if (r8 == 0) goto L_0x003b
            java.lang.String r9 = "checkboxEnabled"
            boolean r8 = r8.getBoolean(r9, r2)
            if (r8 == 0) goto L_0x009a
        L_0x003b:
            java.lang.String r8 = r6.e
            boolean r8 = defpackage.ycm.i(r8)
            java.lang.String r9 = "isCircled"
            if (r8 == 0) goto L_0x004e
            boolean r8 = r7.containsKey(r9)
            if (r8 != 0) goto L_0x004e
            r7.putBoolean(r9, r3)
        L_0x004e:
            boolean r8 = r7.containsKey(r9)
            if (r8 == 0) goto L_0x009a
            boolean r8 = r7.getBoolean(r9)
            if (r8 != 0) goto L_0x009a
            java.lang.String r8 = "checked"
            if (r13 == 0) goto L_0x0082
            java.util.List r9 = r13.b
            int r9 = r9.indexOf(r6)
            if (r9 < 0) goto L_0x0082
            java.util.List r10 = r13.b
            java.lang.Object r9 = r10.get(r9)
            com.google.android.gms.common.people.data.AudienceMember r9 = (com.google.android.gms.common.people.data.AudienceMember) r9
            android.os.Bundle r9 = r9.h
            if (r9 == 0) goto L_0x0082
            boolean r10 = r9.containsKey(r8)
            if (r10 == 0) goto L_0x0082
            boolean r9 = r9.getBoolean(r8)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            goto L_0x0083
        L_0x0082:
            r9 = r0
        L_0x0083:
            if (r9 == 0) goto L_0x008d
            boolean r9 = r9.booleanValue()
            r7.putBoolean(r8, r9)
            goto L_0x0097
        L_0x008d:
            boolean r9 = r7.containsKey(r8)
            if (r9 != 0) goto L_0x0097
            r7.putBoolean(r8, r2)
        L_0x0097:
            r1.add(r6)
        L_0x009a:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x009e:
            java.util.Comparator r12 = defpackage.zkw.a
            java.util.Collections.sort(r1, r12)
            iww r12 = new iww
            r12.<init>()
            r12.a((java.util.Collection) r1)
            com.google.android.gms.common.people.data.Audience r12 = r12.a()
            r11.e = r12
            java.util.List r12 = r12.b
            boolean r12 = r12.isEmpty()
            r13 = -1
            if (r12 != 0) goto L_0x0189
            java.util.ArrayList r12 = r11.f
            if (r12 == 0) goto L_0x014f
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x014d
            com.google.android.gms.common.people.data.Audience r12 = r11.d
            if (r12 == 0) goto L_0x010d
            java.util.List r13 = r12.b
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x010d
            java.util.List r13 = r12.b
            int r13 = r13.size()
            r1 = 0
        L_0x00d7:
            if (r1 >= r13) goto L_0x0105
            java.util.List r4 = r12.b
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.common.people.data.AudienceMember r4 = (com.google.android.gms.common.people.data.AudienceMember) r4
            if (r4 != 0) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x010d
            android.os.Bundle r4 = r4.h
            if (r4 == 0) goto L_0x010d
            java.lang.String r5 = "objectType"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto L_0x010d
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "page"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x010d
            int r1 = r1 + 1
            goto L_0x00d7
        L_0x0105:
            java.lang.String r12 = r11.c
            int r13 = r11.a(r12)
            if (r13 >= 0) goto L_0x014f
        L_0x010d:
            com.google.android.gms.common.people.data.Audience r12 = r11.d
            if (r12 == 0) goto L_0x0118
            java.util.List r12 = r12.b
            int r12 = r12.size()
            goto L_0x0119
        L_0x0118:
            r12 = 0
        L_0x0119:
            r13 = 0
            r1 = 0
        L_0x011b:
            if (r13 >= r12) goto L_0x0136
            com.google.android.gms.common.people.data.Audience r4 = r11.d
            java.util.List r4 = r4.b
            java.lang.Object r4 = r4.get(r13)
            com.google.android.gms.common.people.data.AudienceMember r4 = (com.google.android.gms.common.people.data.AudienceMember) r4
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x0133
            int r1 = r1 + 1
            if (r0 != 0) goto L_0x0133
            java.lang.String r0 = r4.f
        L_0x0133:
            int r13 = r13 + 1
            goto L_0x011b
        L_0x0136:
            if (r1 != r2) goto L_0x013e
            int r13 = r11.a(r0)
            if (r13 >= 0) goto L_0x0150
        L_0x013e:
            boolean r12 = r11.g()
            if (r12 == 0) goto L_0x014b
            java.lang.String r12 = r11.b
            int r13 = r11.a(r12)
            goto L_0x0150
        L_0x014b:
            r13 = 0
            goto L_0x0150
        L_0x014d:
            r13 = 0
            goto L_0x0150
        L_0x014f:
        L_0x0150:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r11.g = r12
            ikz r12 = defpackage.ysu.O
            java.lang.Object r12 = r12.c()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.g()
            if (r12 == 0) goto L_0x016c
            r12 = 1
            goto L_0x016d
        L_0x016c:
            r12 = 0
        L_0x016d:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11.h = r12
            boolean r12 = r11.b()
            if (r12 == 0) goto L_0x0182
            java.lang.Integer r12 = r11.g
            int r12 = r12.intValue()
            if (r12 < 0) goto L_0x0182
            r2 = 0
        L_0x0182:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            r11.i = r12
            return
        L_0x0189:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r11.g = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            r11.h = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            r11.i = r12
            return
        L_0x019d:
            java.lang.String r12 = "ShareBox"
            java.lang.String r13 = "Cannot calculate add to circle state unless audience is set"
            android.util.Log.w(r12, r13)
            r11.g = r0
            r11.h = r0
            r11.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.sharebox.AddToCircleData.a(com.google.android.gms.common.people.data.Audience, com.google.android.gms.common.people.data.Audience):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, i2, false);
        ivx.a(parcel, 4, this.e, i2, false);
        ivx.c(parcel, 5, this.f, false);
        ivx.a(parcel, 6, Integer.valueOf(c()));
        ivx.a(parcel, 7, Boolean.valueOf(d()));
        ivx.a(parcel, 8, Boolean.valueOf(e()));
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public final boolean a() {
        return (!b() || this.g == null || this.h == null || this.i == null) ? false : true;
    }
}
