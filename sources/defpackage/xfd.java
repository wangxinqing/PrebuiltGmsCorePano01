package defpackage;

import com.google.android.gms.people.model.AvatarReference;

/* renamed from: xfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xfd {
    public static String a(int i, String str) {
        boolean z;
        iva.c(str);
        boolean z2 = true;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        if (indexOf <= 0) {
            z2 = false;
        }
        iva.a(z2);
        return str.substring(0, indexOf);
    }

    public static String b(int i, String str) {
        boolean z;
        boolean z2;
        iva.c(str);
        boolean z3 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(9, i2);
        if (indexOf2 > 0) {
            z3 = true;
        }
        iva.a(z3);
        return str.substring(i2, indexOf2);
    }

    public static AvatarReference c(AvatarReference avatarReference) {
        Long l;
        Long l2;
        String str;
        String str2;
        String str3;
        String str4;
        iva.a((Object) avatarReference);
        int i = avatarReference.a;
        String str5 = avatarReference.b;
        iva.a(i != 0);
        iva.c(str5);
        switch (i) {
            case 1:
            case 5:
                str3 = null;
                str2 = null;
                str = null;
                l2 = null;
                l = null;
                str4 = str5;
                break;
            case 2:
                String g = g(i, str5);
                l2 = null;
                l = null;
                str2 = e(i, str5);
                str = f(i, str5);
                str4 = null;
                str3 = g;
                break;
            case 3:
                str2 = null;
                str = null;
                l = null;
                str3 = j(i, str5);
                l2 = Long.valueOf(h(i, str5));
                str4 = null;
                break;
            case 4:
                String c = c(i, str5);
                str4 = d(i, str5);
                String a = a(i, str5);
                l2 = null;
                l = null;
                str = b(i, str5);
                str2 = a;
                str3 = c;
                break;
            case 6:
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
                l2 = null;
                l = Long.valueOf(i(i, str5));
                break;
            default:
                throw new IllegalArgumentException("Invalid source.");
        }
        return new AvatarReference(i, str5, str4, str3, str2, str, l2, l);
    }

    public static String d(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        iva.c(str);
        boolean z4 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.a(z3);
        int indexOf3 = str.indexOf(9, indexOf2 + 1);
        if (indexOf3 > 0) {
            z4 = true;
        }
        iva.a(z4);
        return str.substring(indexOf3 + 1);
    }

    public static String e(int i, String str) {
        boolean z;
        boolean z2;
        iva.c(str);
        boolean z3 = true;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        if (indexOf2 <= 0) {
            z3 = false;
        }
        iva.a(z3);
        return str.substring(0, indexOf);
    }

    public static String f(int i, String str) {
        boolean z;
        boolean z2;
        iva.c(str);
        boolean z3 = false;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(9, i2);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        if (indexOf2 > 0) {
            z3 = true;
        }
        iva.a(z3);
        return str.substring(i2, indexOf2);
    }

    public static String g(int i, String str) {
        boolean z;
        boolean z2;
        iva.c(str);
        boolean z3 = false;
        if (i == 2 || i == 4) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        if (indexOf2 > 0) {
            z3 = true;
        }
        iva.a(z3);
        return str.substring(indexOf2 + 1);
    }

    public static long h(int i, String str) {
        boolean z;
        iva.c(str);
        boolean z2 = true;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        if (indexOf <= 0) {
            z2 = false;
        }
        iva.a(z2);
        return Long.parseLong(str.substring(0, indexOf));
    }

    public static long i(int i, String str) {
        boolean z;
        iva.c(str);
        if (i == 6) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        return Long.parseLong(str);
    }

    public static String j(int i, String str) {
        boolean z;
        iva.c(str);
        boolean z2 = false;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        }
        iva.a(z2);
        return str.substring(indexOf + 1);
    }

    public static String a(AvatarReference avatarReference) {
        iva.a((Object) avatarReference);
        return a(avatarReference.a, avatarReference.b);
    }

    public static String b(AvatarReference avatarReference) {
        iva.a((Object) avatarReference);
        return b(avatarReference.a, avatarReference.b);
    }

    public static String c(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        iva.c(str);
        boolean z4 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.a(z3);
        int i2 = indexOf2 + 1;
        int indexOf3 = str.indexOf(9, i2);
        if (indexOf3 > 0) {
            z4 = true;
        }
        iva.a(z4);
        return str.substring(i2, indexOf3);
    }
}
