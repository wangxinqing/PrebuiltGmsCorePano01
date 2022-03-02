package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: soz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class soz {
    final String b;
    final int c;
    Boolean d;
    Boolean e;
    Long f;
    Long g;

    public soz(String str, int i) {
        this.b = str;
        this.c = i;
    }

    static Boolean a(double d2, szp szp) {
        try {
            return a(new BigDecimal(d2), szp, Math.ulp(d2));
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public abstract int a();

    public abstract boolean b();

    static Boolean a(long j, szp szp) {
        try {
            return a(new BigDecimal(j), szp, 0.0d);
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    private static Boolean a(String str, int i, boolean z, String str2, List list, String str3, sut sut) {
        int i2;
        if (i != 7) {
            if (str2 == null) {
                return null;
            }
        } else if (list == null || list.size() == 0) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (!z) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException e2) {
                    if (sut != null) {
                        sut.f.a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean a(String str, szp szp) {
        if (szg.a(str)) {
            try {
                return a(new BigDecimal(str), szp, 0.0d);
            } catch (NumberFormatException e2) {
            }
        }
        return null;
    }

    static Boolean a(String str, szt szt, sut sut) {
        int a;
        int i;
        String str2;
        aucx aucx;
        String str3;
        iva.a((Object) szt);
        if (str == null || (szt.a & 1) == 0 || (a = szs.a(szt.b)) == 0 || a == 1) {
            return null;
        }
        int a2 = szs.a(szt.b);
        if (a2 != 0 && a2 == 7) {
            if (szt.e.size() == 0) {
                return null;
            }
        } else if ((szt.a & 2) == 0) {
            return null;
        }
        int a3 = szs.a(szt.b);
        if (a3 != 0) {
            i = a3;
        } else {
            i = 1;
        }
        boolean z = szt.d;
        if (z || i == 2 || i == 7) {
            str2 = szt.c;
        } else {
            str2 = szt.c.toUpperCase(Locale.ENGLISH);
        }
        if (szt.e.size() != 0) {
            aucx aucx2 = szt.e;
            if (!z) {
                ArrayList arrayList = new ArrayList(aucx2.size());
                int size = aucx2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((String) aucx2.get(i2)).toUpperCase(Locale.ENGLISH));
                }
                aucx = Collections.unmodifiableList(arrayList);
            } else {
                aucx = aucx2;
            }
        } else {
            aucx = null;
        }
        if (i == 2) {
            str3 = str2;
        } else {
            str3 = null;
        }
        return a(str, i, z, str2, aucx, str3, sut);
    }

    static Boolean a(BigDecimal bigDecimal, szp szp, double d2) {
        int a;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        iva.a((Object) szp);
        boolean z = true;
        if ((szp.a & 1) == 0 || (a = szo.a(szp.b)) == 0 || a == 1) {
            return null;
        }
        int a2 = szo.a(szp.b);
        if (a2 != 0 && a2 == 5) {
            int i = szp.a;
            if ((i & 8) == 0 || (i & 16) == 0) {
                return null;
            }
        } else if ((szp.a & 4) == 0) {
            return null;
        }
        int a3 = szo.a(szp.b);
        if (a3 == 0) {
            a3 = 1;
        }
        int a4 = szo.a(szp.b);
        if (a4 != 0 && a4 == 5) {
            if (!szg.a(szp.e) || !szg.a(szp.f)) {
                return null;
            }
            try {
                bigDecimal4 = new BigDecimal(szp.e);
                bigDecimal3 = new BigDecimal(szp.f);
                bigDecimal2 = null;
            } catch (NumberFormatException e2) {
                return null;
            }
        } else if (!szg.a(szp.d)) {
            return null;
        } else {
            try {
                bigDecimal3 = null;
                bigDecimal2 = new BigDecimal(szp.d);
                bigDecimal4 = null;
            } catch (NumberFormatException e3) {
                return null;
            }
        }
        if (a3 != 5) {
            if (bigDecimal2 == null) {
                return null;
            }
        } else if (bigDecimal4 == null) {
            return null;
        }
        int i2 = a3 - 1;
        if (i2 == 1) {
            if (bigDecimal.compareTo(bigDecimal2) != -1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i2 == 2) {
            if (bigDecimal.compareTo(bigDecimal2) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i2 != 3) {
            if (i2 != 4) {
                return null;
            }
            if (bigDecimal.compareTo(bigDecimal4) == -1 || bigDecimal.compareTo(bigDecimal3) == 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (d2 != 0.0d) {
            if (!(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) == -1)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else {
            if (bigDecimal.compareTo(bigDecimal2) != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
