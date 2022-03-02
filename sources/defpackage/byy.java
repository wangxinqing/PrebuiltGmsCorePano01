package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: byy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byy {
    public final int a;
    public final Object b;

    private byy(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public static byy a(int i) {
        return new byy(Integer.valueOf(i), 3);
    }

    public static byy b(String str) {
        return new byy(str, 2);
    }

    public final boolean equals(Object obj) {
        byy byy;
        int i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byy) || (byy = (byy) obj).a != (i = this.a)) {
            return false;
        }
        if (i == 1 || i == 2) {
            return TextUtils.equals((String) this.b, (String) byy.b);
        }
        return ((Integer) this.b).intValue() == ((Integer) byy.b).intValue();
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.a);
        objArr[1] = this.a == 3 ? Integer.valueOf(((Integer) this.b).intValue()) : (String) this.b;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(12);
        sb.append(i);
        sb.append(":");
        String sb2 = sb.toString();
        int i2 = this.a;
        if (i2 == 1 || i2 == 2) {
            String valueOf = String.valueOf(this.b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + String.valueOf(valueOf).length());
            sb3.append(sb2);
            sb3.append(valueOf);
            return sb3.toString();
        }
        int intValue = ((Integer) this.b).intValue();
        StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 11);
        sb4.append(sb2);
        sb4.append(intValue);
        return sb4.toString();
    }

    public static byy a(String str) {
        return new byy(str, 1);
    }

    public static List a(bzv bzv) {
        ArrayList arrayList = new ArrayList();
        String n = bzv.n();
        if (!TextUtils.isEmpty(n)) {
            arrayList.add(a(n));
        }
        List j = bzv.j();
        int size = j.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(b((String) j.get(i)));
        }
        List a2 = bzv.a();
        int size2 = a2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(a(((Integer) a2.get(i2)).intValue()));
        }
        return arrayList;
    }
}
