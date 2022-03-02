package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aawl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aawl {
    private static final anax a = anax.a(1, 4, 5, 3, 12, 13, 15);
    private static aawl e = null;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final SparseIntArray f;
    private final SparseIntArray g;
    private SparseIntArray h;
    private String i = "";
    private Set j = null;
    private int k = -1;
    private final aarq l;

    static {
        aawl.class.getSimpleName();
    }

    private aawl(Context context) {
        this.b = aans.d(context);
        this.c = aans.f(context);
        this.d = aans.e(context);
        this.l = new aarq(context);
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f = sparseIntArray;
        sparseIntArray.append(1, 15);
        this.f.append(4, 16);
        this.f.append(5, 15);
        this.f.append(13, 14);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        this.g = sparseIntArray2;
        sparseIntArray2.append(4, 11);
    }

    static synchronized aawl a(Context context) {
        aawl aawl;
        synchronized (aawl.class) {
            if (e == null) {
                e = new aawl(context);
            }
            aawl = e;
        }
        return aawl;
    }

    private final synchronized void b() {
        int i2;
        if (this.j == null || !this.i.equals(azfv.s())) {
            if (!TextUtils.isEmpty(azfv.s())) {
                String s = azfv.s();
                List c2 = amsk.a(';').c(s);
                try {
                    i2 = Integer.parseInt((String) c2.get(0));
                } catch (NumberFormatException e2) {
                    i2 = 0;
                }
                String string = this.l.b.getString("safe_browsing_config", "");
                if (!TextUtils.isEmpty(string)) {
                    List c3 = amsk.a(';').c(string);
                    try {
                        if (c3.size() > 2 && (Integer.parseInt((String) c3.get(0)) >= i2 || c2.size() <= 2)) {
                            c2 = c3;
                            s = string;
                        }
                    } catch (NumberFormatException e3) {
                    }
                }
                if (c2.size() > 2) {
                    HashSet hashSet = new HashSet();
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    try {
                        int parseInt = Integer.parseInt((String) c2.get(1));
                        if (parseInt >= 0 && this.d >= aans.a((long) parseInt)) {
                            int i3 = 2;
                            while (i3 < c2.size()) {
                                List c4 = amsk.a(',').c((CharSequence) c2.get(i3));
                                if (c4.size() == 2) {
                                    int parseInt2 = Integer.parseInt((String) c4.get(0));
                                    int parseInt3 = Integer.parseInt((String) c4.get(1));
                                    hashSet.add(Integer.valueOf(parseInt2));
                                    sparseIntArray.append(parseInt2, Math.min(parseInt3, 20));
                                    i3++;
                                } else {
                                    return;
                                }
                            }
                            this.k = parseInt;
                            this.j = hashSet;
                            this.h = sparseIntArray;
                            this.i = s;
                            aarq.a(this.l.b, "safe_browsing_config", s);
                        }
                    } catch (NumberFormatException e4) {
                    }
                }
            } else {
                this.j = null;
                this.h = null;
                this.k = -1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        int i3;
        b();
        if (this.c) {
            return 1048576;
        }
        if (this.k >= 0) {
            SparseIntArray sparseIntArray = this.h;
            if (sparseIntArray == null || (i3 = sparseIntArray.get(i2, -1)) < 0) {
                return 0;
            }
            return 1 << i3;
        } else if (this.b) {
            int i4 = this.g.get(i2, -1);
            if (i4 >= 0) {
                return 1 << i4;
            }
            return 1024;
        } else {
            int i5 = this.f.get(i2, -1);
            if (i5 >= 0) {
                return 1 << i5;
            }
            return 1024;
        }
    }

    /* access modifiers changed from: package-private */
    public final Set a() {
        Set set;
        if (!TextUtils.isEmpty(azfv.s())) {
            b();
            set = this.j;
        } else {
            set = null;
        }
        return set == null ? a : set;
    }
}
