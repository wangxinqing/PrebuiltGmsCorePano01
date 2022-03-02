package defpackage;

import java.util.ArrayList;

/* renamed from: ych  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ych {
    private final ArrayList a = new ArrayList();

    private static IndexOutOfBoundsException b(int i, int i2) {
        return new IndexOutOfBoundsException(String.format("Size=%d, requested=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public final int a() {
        return this.a.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("[");
            int b = b(i);
            for (int i2 = 0; i2 < b; i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(a(i, i2));
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public final int a(int i, int i2) {
        Object obj = this.a.get(i);
        if (obj == null) {
            throw b(0, i2);
        } else if (!(obj instanceof Integer)) {
            ArrayList arrayList = (ArrayList) obj;
            if (i2 <= arrayList.size()) {
                return ((Integer) arrayList.get(i2)).intValue();
            }
            throw b(arrayList.size(), i2);
        } else if (i2 == 0) {
            return ((Integer) obj).intValue();
        } else {
            throw b(1, i2);
        }
    }

    public final int b(int i) {
        Object obj = this.a.get(i);
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof Integer)) {
            return ((ArrayList) obj).size();
        }
        return 1;
    }

    public final void b() {
        this.a.add((Object) null);
    }

    public final void a(int i) {
        this.a.add(Integer.valueOf(i));
    }

    public final void a(ycu ycu, String str) {
        int a2 = ycu.a(str);
        if (a2 != 0) {
            if (a2 == 1) {
                this.a.add(Integer.valueOf(ycu.a(str, 0)));
                return;
            }
            ArrayList arrayList = new ArrayList(a2);
            for (int i = 0; i < a2; i++) {
                arrayList.add(Integer.valueOf(ycu.a(str, i)));
            }
            this.a.add(arrayList);
        }
    }
}
