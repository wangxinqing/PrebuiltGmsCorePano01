package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new ydp();
    public final int a;
    public final Flag[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public Configuration(int i, Flag[] flagArr, String[] strArr) {
        this.a = i;
        this.b = flagArr;
        for (Flag flag : flagArr) {
            this.d.put(flag.a, flag);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((Configuration) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.a == configuration.a && yez.a(this.d, configuration.d) && Arrays.equals(this.c, configuration.c);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        for (Flag append : this.d.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr == null) {
            sb.append("null");
        } else {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        }
        sb.append("))");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, (Parcelable[]) this.b, i);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
