package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: akhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhx {
    public static final List a = new ArrayList();
    public final String b;
    public final int c;
    public final String d;
    public final float e;
    public final float f;
    public final List g;
    public final int h;
    public final aklq i;
    public final boolean j;

    public akhx(String str, int i2, String str2, List list, int i3, float f2, float f3, aklq aklq, boolean z) {
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.g = list;
        this.h = i3;
        this.e = f2;
        this.f = f3;
        this.i = aklq;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akhx) {
            akhx akhx = (akhx) obj;
            return akoy.a(this.b, akhx.b) && this.c == akhx.c && akoy.a(this.d, akhx.d) && this.e == akhx.e && this.f == akhx.f && akoy.a(this.g, akhx.g) && this.h == akhx.h && akoy.a(this.i, akhx.i) && this.j == akhx.j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.h)});
    }

    public final String toString() {
        String str = this.b;
        int i2 = this.c;
        String str2 = this.d;
        float f2 = this.e;
        float f3 = this.f;
        String valueOf = String.valueOf(this.g);
        int i3 = this.h;
        String valueOf2 = String.valueOf(this.i);
        boolean z = this.j;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 214 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("PlaceInference{placeId=");
        sb.append(str);
        sb.append(" highLevelCategoryId=");
        sb.append(i2);
        sb.append(" parentPlaceId=");
        sb.append(str2);
        sb.append(" likelihood=");
        sb.append(f2);
        sb.append(" hierarchyLikelihood=");
        sb.append(f3);
        sb.append(" descendantPlaceIds=");
        sb.append(valueOf);
        sb.append(" hierarchyLevel=");
        sb.append(i3);
        sb.append(" debugData=");
        sb.append(valueOf2);
        sb.append("isSensitivePlace=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
