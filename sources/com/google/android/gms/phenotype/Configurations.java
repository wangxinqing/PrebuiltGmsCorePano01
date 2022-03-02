package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Configurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ydq();
    public final String a;
    public final byte[] b;
    public final String c;
    public final Configuration[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public Configurations(String str, String str2, Configuration[] configurationArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = configurationArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (Configuration configuration : configurationArr) {
            this.e.put(Integer.valueOf(configuration.a), configuration);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configurations) {
            Configurations configurations = (Configurations) obj;
            if (!yez.a(this.a, configurations.a) || !yez.a(this.c, configurations.c) || !this.e.equals(configurations.e) || this.f != configurations.f || !Arrays.equals(this.b, configurations.b) || this.g != configurations.g) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        for (Configuration append : this.e.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        if (bArr != null) {
            str = Base64.encodeToString(bArr, 3);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, (Parcelable[]) this.d, i);
        ivx.a(parcel, 5, this.f);
        ivx.a(parcel, 6, this.b, false);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, a2);
    }
}
