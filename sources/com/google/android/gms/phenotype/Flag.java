package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new yea();
    public static final Comparator j = new ydz();
    private static final List k = Arrays.asList(new Integer[]{2, 8, 9});
    public final String a;
    final long b;
    final boolean c;
    final double d;
    final String e;
    final byte[] f;
    public final int g;
    public final int h;
    final Set i;

    public Flag(String str, String str2, int i2, int i3) {
        this.a = str;
        this.g = i2;
        this.h = i3;
        HashSet hashSet = new HashSet(k);
        this.i = hashSet;
        if (i2 == 1) {
            this.b = Long.parseLong(str2);
            this.c = false;
            this.d = 0.0d;
            this.e = "";
            this.f = new byte[0];
            this.i.add(3);
        } else if (i2 == 2) {
            if (str2.equalsIgnoreCase("true")) {
                this.c = true;
            } else if (!str2.equalsIgnoreCase("false")) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unrecognized boolean value: ") : "Unrecognized boolean value: ".concat(valueOf));
            } else {
                this.c = false;
            }
            this.b = 0;
            this.d = 0.0d;
            this.e = "";
            this.f = new byte[0];
            this.i.add(4);
        } else if (i2 == 3) {
            this.d = Double.parseDouble(str2);
            this.b = 0;
            this.c = false;
            this.e = "";
            this.f = new byte[0];
            this.i.add(5);
        } else if (i2 == 4) {
            this.e = str2;
            this.b = 0;
            this.c = false;
            this.d = 0.0d;
            this.f = new byte[0];
            hashSet.add(6);
        } else if (i2 == 5) {
            this.f = Base64.decode(str2, 3);
            this.b = 0;
            this.c = false;
            this.d = 0.0d;
            this.e = "";
            this.i.add(7);
        } else {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unrecognized flag type: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static int a(int i2, int i3) {
        if (i2 >= i3) {
            return i2 != i3 ? 1 : 0;
        }
        return -1;
    }

    public final boolean b() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final double c() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Flag flag = (Flag) obj;
        int compareTo = this.a.compareTo(flag.a);
        if (compareTo != 0) {
            return compareTo;
        }
        int a2 = a(this.g, flag.g);
        if (a2 != 0) {
            return a2;
        }
        int i2 = this.g;
        if (i2 == 1) {
            long j2 = this.b;
            long j3 = flag.b;
            if (j2 < j3) {
                return -1;
            }
            if (j2 == j3) {
                return 0;
            }
            return 1;
        } else if (i2 == 2) {
            boolean z = this.c;
            if (z == flag.c) {
                return 0;
            }
            if (z) {
                return 1;
            }
            return -1;
        } else if (i2 == 3) {
            return Double.compare(this.d, flag.d);
        } else {
            if (i2 == 4) {
                String str = this.e;
                String str2 = flag.e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i2 == 5) {
                byte[] bArr = this.f;
                byte[] bArr2 = flag.f;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i3 = 0; i3 < Math.min(this.f.length, flag.f.length); i3++) {
                    int i4 = this.f[i3] - flag.f[i3];
                    if (i4 != 0) {
                        return i4;
                    }
                }
                return a(this.f.length, flag.f.length);
            } else {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i2);
                throw new AssertionError(sb.toString());
            }
        }
    }

    public final String d() {
        if (this.g == 4) {
            return this.e;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public final byte[] e() {
        if (this.g == 5) {
            return this.f;
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final boolean equals(Object obj) {
        int i2;
        if (!(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (!yez.a(this.a, flag.a) || (i2 = this.g) != flag.g || this.h != flag.h) {
            return false;
        }
        if (i2 == 1) {
            return this.b == flag.b;
        }
        if (i2 == 2) {
            return this.c == flag.c;
        }
        if (i2 == 3) {
            return this.d == flag.d;
        }
        if (i2 == 4) {
            return yez.a(this.e, flag.e);
        }
        if (i2 == 5) {
            return Arrays.equals(this.f, flag.f);
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Invalid enum value: ");
        sb.append(i2);
        throw new AssertionError(sb.toString());
    }

    public final String f() {
        int i2 = this.g;
        if (i2 == 1) {
            return Long.toString(this.b);
        }
        if (i2 == 2) {
            return !this.c ? "false" : "true";
        }
        if (i2 == 3) {
            return Double.toString(this.d);
        }
        if (i2 == 4) {
            return this.e;
        }
        if (i2 == 5) {
            return Base64.encodeToString(this.f, 3);
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Invalid enum value: ");
        sb.append(i2);
        throw new AssertionError(sb.toString());
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    public final long a() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.i;
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.a, true);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.b);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.c);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.e, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.f, true);
        }
        if (set.contains(8)) {
            ivx.b(parcel, 8, this.g);
        }
        if (set.contains(9)) {
            ivx.b(parcel, 9, this.h);
        }
        ivx.b(parcel, a2);
    }

    public final String a(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        int i2 = this.g;
        if (i2 == 1) {
            sb.append(this.b);
        } else if (i2 == 2) {
            sb.append(this.c);
        } else if (i2 == 3) {
            sb.append(this.d);
        } else if (i2 == 4) {
            sb.append("'");
            sb.append(this.e);
            sb.append("'");
        } else if (i2 != 5) {
            String str = this.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
            sb2.append("Invalid type: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(i2);
            throw new AssertionError(sb2.toString());
        } else if (this.f != null) {
            sb.append("'");
            sb.append(Base64.encodeToString(this.f, 3));
            sb.append("'");
        } else {
            sb.append("null");
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public Flag(String str, byte[] bArr, int i2) {
        this(new HashSet(), str, 0, false, 0.0d, "", bArr, 5, i2);
    }

    public Flag(Set set, String str, long j2, boolean z, double d2, String str2, byte[] bArr, int i2, int i3) {
        this.i = set;
        this.a = str;
        this.b = j2;
        this.c = z;
        this.d = d2;
        this.e = str2;
        this.f = bArr;
        this.g = i2;
        this.h = i3;
        set.addAll(k);
        if (i2 == 1) {
            set.add(3);
        } else if (i2 == 2) {
            set.add(4);
        } else if (i2 == 3) {
            set.add(5);
        } else if (i2 == 4) {
            set.add(6);
        } else if (i2 == 5) {
            set.add(7);
        }
    }
}
