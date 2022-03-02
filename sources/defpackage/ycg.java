package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ycg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycg {
    public final HashMap a = new HashMap();

    public final int a(int i) {
        Integer valueOf = Integer.valueOf(i);
        iva.a((Object) valueOf);
        Object obj = this.a.get(valueOf);
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof String)) {
            return ((ArrayList) obj).size();
        }
        return 1;
    }

    public final String a(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        iva.a((Object) valueOf);
        if (i2 >= 0) {
            Object obj = this.a.get(valueOf);
            if (obj == null) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Size=0, requested=");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!(obj instanceof String)) {
                ArrayList arrayList = (ArrayList) obj;
                if (i2 <= arrayList.size()) {
                    return (String) arrayList.get(i2);
                }
                int size = arrayList.size();
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Size=");
                sb2.append(size);
                sb2.append(", requested=");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 <= 0) {
                return (String) obj;
            } else {
                StringBuilder sb3 = new StringBuilder(29);
                sb3.append("Size=1, requested=");
                sb3.append(i2);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("Requested negative index: ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }
}
