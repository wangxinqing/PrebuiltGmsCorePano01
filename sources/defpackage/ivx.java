package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: ivx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivx {
    public static int a(Parcel parcel) {
        return a(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void c(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, 0);
                }
            }
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static int a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void a(Parcel parcel, int i, byte b) {
        a(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void b(Parcel parcel, int i, int i2) {
        a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, int i, double d) {
        a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void b(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = a(parcel, i);
            parcel.writeStringList(list);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, float f) {
        a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void a(Parcel parcel, int i, long j) {
        a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int a = a(parcel, i);
            parcel.writeBundle(bundle);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            b(parcel, a);
        }
    }

    public static void a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int a = a(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int a = a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Boolean bool) {
        if (bool != null) {
            a(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void a(Parcel parcel, int i, Double d) {
        if (d != null) {
            a(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static void a(Parcel parcel, int i, Float f) {
        if (f != null) {
            a(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static void a(Parcel parcel, int i, Integer num) {
        if (num != null) {
            a(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void a(Parcel parcel, int i, Long l) {
        if (l != null) {
            a(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int a = a(parcel, i);
            parcel.writeString(str);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = a(parcel, i);
            parcel.writeList(list);
            b(parcel, a);
        }
    }

    public static void a(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, short s) {
        a(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int a = a(parcel, i);
            parcel.writeByteArray(bArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, double[] dArr, boolean z) {
        if (dArr != null) {
            int a = a(parcel, i);
            parcel.writeDoubleArray(dArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr != null) {
            int a = a(parcel, i);
            parcel.writeFloatArray(fArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int a = a(parcel, i);
            parcel.writeIntArray(iArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr != null) {
            int a = a(parcel, i);
            parcel.writeLongArray(jArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = a(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, i2);
                }
            }
            b(parcel, a);
        }
    }

    public static void a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int a = a(parcel, i);
            parcel.writeStringArray(strArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, boolean[] zArr, boolean z) {
        if (zArr != null) {
            int a = a(parcel, i);
            parcel.writeBooleanArray(zArr);
            b(parcel, a);
        } else if (z) {
            a(parcel, i, 0);
        }
    }

    public static void a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a = a(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            b(parcel, a);
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
