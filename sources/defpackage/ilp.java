package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* renamed from: ilp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilp extends ile implements icl {
    private boolean b = false;
    private ArrayList c;
    private final Status d;

    private final void d() {
        synchronized (this) {
            if (!this.b) {
                int i = this.a.h;
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String c2 = this.a.c("path", 0, this.a.a(0));
                    int i2 = 1;
                    while (i2 < i) {
                        int a = this.a.a(i2);
                        String c3 = this.a.c("path", i2, a);
                        if (c3 != null) {
                            if (!c3.equals(c2)) {
                                this.c.add(Integer.valueOf(i2));
                                c2 = c3;
                            }
                            i2++;
                        } else {
                            StringBuilder sb = new StringBuilder(82);
                            sb.append("Missing value for markerColumn: ");
                            sb.append("path");
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(a);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    public final int a() {
        d();
        return this.c.size();
    }

    public final Status aO() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final int b(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    public ilp(DataHolder dataHolder) {
        super(dataHolder);
        this.d = new Status(dataHolder.e);
    }

    public final Object a(int i) {
        d();
        int b2 = b(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                i2 = this.a.h - ((Integer) this.c.get(i)).intValue();
            } else {
                i2 = ((Integer) this.c.get(i + 1)).intValue() - ((Integer) this.c.get(i)).intValue();
            }
            if (i2 == 1) {
                this.a.a(b(i));
            }
        }
        return new aeaa(this.a, b2, i2);
    }
}
