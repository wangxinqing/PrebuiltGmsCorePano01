package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;
import java.util.Date;

/* renamed from: aply  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aply {
    public final Bundle a;
    private final String b;
    private Thing.Metadata c;
    private String d;

    public aply() {
        this("Action");
    }

    public static void a(Bundle bundle, String str, long... jArr) {
        iva.a((Object) str);
        iva.a((Object) jArr);
        int length = jArr.length;
        if (length > 0) {
            if (length >= 100) {
                apmu.a("Input Array of elements is too big, cutting off.");
                jArr = Arrays.copyOf(jArr, 100);
            }
            bundle.putLongArray(str, jArr);
            return;
        }
        apmu.a("Long array is empty and is ignored by put method.");
    }

    public final void b(String str) {
        iva.a((Object) str);
        this.d = str;
    }

    public final void c(String str) {
        iva.a((Object) str);
        a("name", str);
    }

    public final void d(String str) {
        a("telephone", str);
    }

    public aply(String str) {
        iva.a((Object) str);
        iva.c(str);
        this.a = new Bundle();
        this.b = str;
    }

    public static void a(Bundle bundle, String str, Thing... thingArr) {
        iva.a((Object) str);
        iva.a((Object) thingArr);
        if (thingArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < thingArr.length; i2++) {
                thingArr[i] = thingArr[i2];
                if (thingArr[i2] == null) {
                    StringBuilder sb = new StringBuilder(58);
                    sb.append("Thing at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    apmu.a(sb.toString());
                } else {
                    i++;
                }
            }
            if (i > 0) {
                bundle.putParcelableArray(str, (Parcelable[]) a((Object[]) (Thing[]) Arrays.copyOfRange(thingArr, 0, i)));
                return;
            }
            return;
        }
        apmu.a("Thing array is empty and is ignored by put method.");
    }

    public static long[] a(Date... dateArr) {
        long[] jArr = new long[dateArr.length];
        for (int i = 0; i < dateArr.length; i++) {
            jArr[i] = dateArr[i].getTime();
        }
        return jArr;
    }

    private static Object[] a(Object[] objArr) {
        if (objArr.length < 100) {
            return objArr;
        }
        apmu.a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objArr, 100);
    }

    public final aplu a() {
        Bundle bundle = new Bundle(this.a);
        Thing.Metadata metadata = this.c;
        if (metadata == null) {
            metadata = new aplt().a();
        }
        return new Thing(bundle, metadata, this.d, this.b);
    }

    public final void a(aplt aplt) {
        iva.a(this.c == null, (Object) "setMetadata may only be called once");
        iva.a((Object) aplt);
        this.c = aplt.a();
    }

    public final void a(aply aply) {
        a("sender", aply);
    }

    public final void a(String str) {
        iva.a((Object) str);
        a("image", str);
    }

    public final void a(String str, long... jArr) {
        a(this.a, str, jArr);
    }

    public final void a(String str, aply... aplyArr) {
        iva.a((Object) str);
        iva.a((Object) aplyArr);
        int length = aplyArr.length;
        if (length > 0) {
            Thing[] thingArr = new Thing[length];
            for (int i = 0; i < aplyArr.length; i++) {
                aply aply = aplyArr[i];
                if (aply == null) {
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("Builder at ");
                    sb.append(i);
                    sb.append(" is null and is ignored by put method.");
                    apmu.a(sb.toString());
                } else {
                    thingArr[i] = (Thing) aply.a();
                }
            }
            a(this.a, str, thingArr);
            return;
        }
        apmu.a("Builder array is empty and is ignored by put method.");
    }

    public final void a(String str, String... strArr) {
        Bundle bundle = this.a;
        iva.a((Object) str);
        iva.a((Object) strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] == null) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("String at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    apmu.a(sb.toString());
                } else {
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i2);
                        sb2.append(" is too long, truncating string.");
                        apmu.a(sb2.toString());
                        strArr2[i] = apnd.a(strArr2[i]);
                    }
                    i++;
                }
            }
            if (i > 0) {
                bundle.putStringArray(str, (String[]) a((Object[]) (String[]) Arrays.copyOfRange(strArr2, 0, i)));
                return;
            }
            return;
        }
        apmu.a("String array is empty and is ignored by put method.");
    }

    public final void a(String str, boolean... zArr) {
        Bundle bundle = this.a;
        iva.a((Object) str);
        iva.a((Object) zArr);
        int length = zArr.length;
        if (length <= 0) {
            apmu.a("Boolean array is empty and is ignored by put method.");
            return;
        }
        if (length >= 100) {
            apmu.a("Input Array of elements is too big, cutting off.");
            zArr = Arrays.copyOf(zArr, 100);
        }
        bundle.putBooleanArray(str, zArr);
    }

    public final void a(aply... aplyArr) {
        a("recipient", aplyArr);
    }

    public final void a(String... strArr) {
        a("labels", strArr);
    }
}
