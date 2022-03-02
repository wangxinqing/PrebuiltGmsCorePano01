package defpackage;

import java.util.List;

/* renamed from: affx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class affx {
    public final aump a;

    private affx(aump aump) {
        this.a = aump;
    }

    public static affx a(aump aump) {
        return new affx(aump);
    }

    private static aumm a(List list, boolean z) {
        boolean z2;
        int i;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            aumm aumm = (aumm) list.get(i2);
            aucx aucx = aumm.b;
            int size2 = aucx.size();
            int i3 = 0;
            while (true) {
                z2 = true;
                if (i3 >= size2) {
                    break;
                }
                auml auml = (auml) aucx.get(i3);
                int i4 = auml.a;
                if (i4 != 0) {
                    i = i4 != 1 ? 0 : 1;
                } else {
                    i = 2;
                }
                int i5 = i - 1;
                if (i != 0) {
                    if (i5 == 0) {
                        if ((i4 == 1 ? ((Boolean) auml.b).booleanValue() : false) != z) {
                            z2 = false;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw null;
                }
            }
            i2++;
            if (z2) {
                return aumm;
            }
        }
        return aumm.e;
    }

    public static final Integer a(aump aump, List list, boolean z, Integer num) {
        int a2 = aumo.a(aump.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i != 1) {
            if (i != 2) {
                return num;
            }
            aumm a3 = a(list, z);
            if (a3.c) {
                return Integer.valueOf(a3.d);
            }
        }
        return null;
    }

    public static final boolean a(aump aump, List list, boolean z) {
        int a2 = aumo.a(aump.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return true;
        }
        return a(list, z).c;
    }

    public final Integer a(boolean z, Integer num) {
        aump aump = this.a;
        return a(aump, aump.c, z, num);
    }
}
