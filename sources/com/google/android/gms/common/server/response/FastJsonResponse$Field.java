package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final jat CREATOR = new jat();
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final int g;
    public final Class h;
    protected final String i;
    public FieldMappingDictionary j;
    public StringToIntConverter k;

    public FastJsonResponse$Field(int i2, int i3, boolean z, int i4, boolean z2, String str, int i5, String str2, ConverterWrapper converterWrapper) {
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = i4;
        this.e = z2;
        this.f = str;
        this.g = i5;
        StringToIntConverter stringToIntConverter = null;
        if (str2 != null) {
            this.h = SafeParcelResponse.class;
            this.i = str2;
        } else {
            this.h = null;
            this.i = null;
        }
        if (converterWrapper == null || (stringToIntConverter = converterWrapper.b) != null) {
            this.k = stringToIntConverter;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public static FastJsonResponse$Field a(String str) {
        return new FastJsonResponse$Field(0, false, 0, false, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field b(String str) {
        return new FastJsonResponse$Field(2, false, 2, false, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field c(String str) {
        return new FastJsonResponse$Field(3, false, 3, false, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field d(String str) {
        return new FastJsonResponse$Field(4, false, 4, false, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field e(String str) {
        return new FastJsonResponse$Field(6, false, 6, false, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field f(String str) {
        return new FastJsonResponse$Field(7, false, 7, false, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field g(String str) {
        return new FastJsonResponse$Field(7, true, 7, true, str, -1, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field h(String str, int i2) {
        return new FastJsonResponse$Field(8, false, 8, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("versionCode", Integer.valueOf(this.a));
        a2.a("typeIn", Integer.valueOf(this.b));
        a2.a("typeInArray", Boolean.valueOf(this.c));
        a2.a("typeOut", Integer.valueOf(this.d));
        a2.a("typeOutArray", Boolean.valueOf(this.e));
        a2.a("outputFieldName", this.f);
        a2.a("safeParcelFieldId", Integer.valueOf(this.g));
        a2.a("concreteTypeName", a());
        Class cls = this.h;
        if (cls != null) {
            a2.a("concreteType.class", cls.getCanonicalName());
        }
        StringToIntConverter stringToIntConverter = this.k;
        if (stringToIntConverter != null) {
            a2.a("converterName", stringToIntConverter.getClass().getCanonicalName());
        }
        return a2.toString();
    }

    public static FastJsonResponse$Field a(String str, int i2) {
        return new FastJsonResponse$Field(0, false, 0, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field b(String str, int i2) {
        return new FastJsonResponse$Field(2, false, 2, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field c(String str, int i2) {
        return new FastJsonResponse$Field(3, false, 3, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field d(String str, int i2) {
        return new FastJsonResponse$Field(4, false, 4, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field e(String str, int i2) {
        return new FastJsonResponse$Field(6, false, 6, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field f(String str, int i2) {
        return new FastJsonResponse$Field(7, false, 7, false, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field g(String str, int i2) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i2, (Class) null, (StringToIntConverter) null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, 7, this.g);
        ivx.a(parcel, 8, a(), false);
        ivx.a(parcel, 9, b(), i2, false);
        ivx.b(parcel, a2);
    }

    public FastJsonResponse$Field(int i2, boolean z, int i3, boolean z2, String str, int i4, Class cls, StringToIntConverter stringToIntConverter) {
        this.a = 1;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = z2;
        this.f = str;
        this.g = i4;
        this.h = cls;
        this.i = cls != null ? cls.getCanonicalName() : null;
        this.k = stringToIntConverter;
    }

    public static FastJsonResponse$Field a(String str, int i2, StringToIntConverter stringToIntConverter) {
        return new FastJsonResponse$Field(7, false, 0, false, str, i2, (Class) null, stringToIntConverter);
    }

    public static FastJsonResponse$Field b(String str, int i2, Class cls) {
        return new FastJsonResponse$Field(11, true, 11, true, str, i2, cls, (StringToIntConverter) null);
    }

    public final jag c() {
        Class<SafeParcelResponse> cls = this.h;
        if (cls != SafeParcelResponse.class) {
            return cls.newInstance();
        }
        iva.a((Object) this.j, (Object) "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
        return new SafeParcelResponse(this.j, this.i);
    }

    public final Map d() {
        iva.a((Object) this.i);
        iva.a((Object) this.j);
        return this.j.a(this.i);
    }

    public static FastJsonResponse$Field a(String str, int i2, Class cls) {
        return new FastJsonResponse$Field(11, false, 11, false, str, i2, cls, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field b(String str, Class cls) {
        return new FastJsonResponse$Field(11, true, 11, true, str, -1, cls, (StringToIntConverter) null);
    }

    public static FastJsonResponse$Field a(String str, Class cls) {
        return new FastJsonResponse$Field(11, false, 11, false, str, -1, cls, (StringToIntConverter) null);
    }

    /* access modifiers changed from: package-private */
    public final ConverterWrapper b() {
        StringToIntConverter stringToIntConverter = this.k;
        if (stringToIntConverter != null) {
            return new ConverterWrapper(stringToIntConverter);
        }
        return null;
    }
}
