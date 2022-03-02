package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new jax();
    public final int a;
    private final Parcel b;
    private final int c;
    private final FieldMappingDictionary d;
    private final String e;
    private int f;
    private int g;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.a = i;
        iva.a((Object) parcel);
        this.b = parcel;
        this.c = 2;
        this.d = fieldMappingDictionary;
        this.e = fieldMappingDictionary != null ? fieldMappingDictionary.c : null;
        this.f = 2;
    }

    public static FieldMappingDictionary a(Class cls) {
        try {
            jag jag = (jag) cls.newInstance();
            FieldMappingDictionary fieldMappingDictionary = new FieldMappingDictionary(jag.getClass());
            a(fieldMappingDictionary, jag);
            Iterator it = fieldMappingDictionary.b.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Map map = (Map) fieldMappingDictionary.b.get(str);
                HashMap hashMap = new HashMap();
                for (String str2 : map.keySet()) {
                    FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) map.get(str2);
                    Map map2 = map;
                    FastJsonResponse$Field fastJsonResponse$Field2 = r8;
                    FastJsonResponse$Field fastJsonResponse$Field3 = new FastJsonResponse$Field(fastJsonResponse$Field.a, fastJsonResponse$Field.b, fastJsonResponse$Field.c, fastJsonResponse$Field.d, fastJsonResponse$Field.e, fastJsonResponse$Field.f, fastJsonResponse$Field.g, fastJsonResponse$Field.i, fastJsonResponse$Field.b());
                    hashMap.put(str2, fastJsonResponse$Field2);
                    it = it;
                    map = map2;
                }
                fieldMappingDictionary.b.put(str, hashMap);
                it = it;
            }
            fieldMappingDictionary.a();
            return fieldMappingDictionary;
        } catch (InstantiationException e2) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Could not instantiate an object of type ") : "Could not instantiate an object of type ".concat(valueOf), e2);
        } catch (IllegalAccessException e3) {
            String valueOf2 = String.valueOf(cls.getCanonicalName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Could not access object of type ") : "Could not access object of type ".concat(valueOf2), e3);
        }
    }

    private final void c(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.g != -1) {
            Parcel parcel = this.b;
            if (parcel != null) {
                int i = this.f;
                if (i == 0) {
                    this.g = ivx.a(parcel);
                    this.f = 1;
                } else if (i != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    public final Parcel b() {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ivx.b(this.b, this.g);
            }
            return this.b;
        }
        int a2 = ivx.a(this.b);
        this.g = a2;
        ivx.b(this.b, a2);
        this.f = 2;
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void d(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        Parcel parcel = this.b;
        int a2 = ivx.a(parcel, fastJsonResponse$Field.g);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigIntegerArr[i2].toByteArray());
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void e(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        ivx.a(this.b, fastJsonResponse$Field.g, jArr, true);
    }

    /* access modifiers changed from: protected */
    public final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        ivx.a(this.b, fastJsonResponse$Field.g, fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void g(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        ivx.a(this.b, fastJsonResponse$Field.g, dArr, true);
    }

    /* access modifiers changed from: protected */
    public final void h(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        Parcel parcel = this.b;
        int a2 = ivx.a(parcel, fastJsonResponse$Field.g);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void i(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        ivx.a(this.b, fastJsonResponse$Field.g, zArr, true);
    }

    public final String toString() {
        iva.a((Object) this.d, (Object) "Cannot convert to JSON on client side.");
        Parcel b2 = b();
        b2.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        a(sb, this.d.a(this.e), b2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        FieldMappingDictionary fieldMappingDictionary;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, b(), false);
        int i2 = this.c;
        if (i2 != 0) {
            fieldMappingDictionary = i2 != 1 ? this.d : this.d;
        } else {
            fieldMappingDictionary = null;
        }
        ivx.a(parcel, 3, fieldMappingDictionary, i, false);
        ivx.b(parcel, a2);
    }

    public SafeParcelResponse(FieldMappingDictionary fieldMappingDictionary, String str) {
        this.a = 1;
        this.b = Parcel.obtain();
        this.c = 0;
        iva.a((Object) fieldMappingDictionary);
        this.d = fieldMappingDictionary;
        iva.a((Object) str);
        this.e = str;
        this.f = 0;
    }

    /* access modifiers changed from: protected */
    public final void b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        ivx.a(this.b, fastJsonResponse$Field.g, strArr, true);
    }

    public final Object c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    public final void c(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        ivx.a(this.b, fastJsonResponse$Field.g, iArr, true);
    }

    public final boolean d(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    private static void a(FieldMappingDictionary fieldMappingDictionary, jag jag) {
        Class<?> cls = jag.getClass();
        if (!fieldMappingDictionary.b.containsKey(cls.getCanonicalName())) {
            Map a2 = jag.a();
            fieldMappingDictionary.b.put(cls.getCanonicalName(), a2);
            for (String str : a2.keySet()) {
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a2.get(str);
                Class cls2 = fastJsonResponse$Field.h;
                if (cls2 != null) {
                    try {
                        a(fieldMappingDictionary, (jag) cls2.newInstance());
                    } catch (InstantiationException e2) {
                        String valueOf = String.valueOf(fastJsonResponse$Field.h.getCanonicalName());
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Could not instantiate an object of type ") : "Could not instantiate an object of type ".concat(valueOf), e2);
                    } catch (IllegalAccessException e3) {
                        String valueOf2 = String.valueOf(fastJsonResponse$Field.h.getCanonicalName());
                        throw new IllegalStateException(valueOf2.length() == 0 ? new String("Could not access object of type ") : "Could not access object of type ".concat(valueOf2), e3);
                    }
                }
            }
        }
    }

    private static final void a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(jjx.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(jhy.b((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(jhy.c((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                jjz.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static final void a(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        if (fastJsonResponse$Field.c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                a(sb, fastJsonResponse$Field.b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        a(sb, fastJsonResponse$Field.b, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.math.BigDecimal[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.math.BigInteger[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.math.BigDecimal[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.math.BigDecimal[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.math.BigDecimal[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.math.BigInteger[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.math.BigDecimal[]} */
    /* JADX WARNING: type inference failed for: r13v1, types: [android.os.Parcel[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.StringBuilder r17, java.util.Map r18, android.os.Parcel r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.Set r4 = r18.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0013:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x002b
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r6 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r6
            int r6 = r6.g
            r3.put(r6, r5)
            goto L_0x0013
        L_0x002b:
            r4 = 123(0x7b, float:1.72E-43)
            r1.append(r4)
            int r4 = defpackage.ivw.b(r19)
            r7 = 0
        L_0x0035:
            int r8 = r19.dataPosition()
            if (r8 >= r4) goto L_0x03d7
            int r8 = r19.readInt()
            int r9 = defpackage.ivw.a((int) r8)
            java.lang.Object r9 = r3.get(r9)
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            if (r9 == 0) goto L_0x03d4
            java.lang.String r10 = ","
            if (r7 != 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            r1.append(r10)
        L_0x0054:
            java.lang.Object r7 = r9.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r9.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9
            java.lang.String r11 = "\""
            r1.append(r11)
            r1.append(r7)
            java.lang.String r7 = "\":"
            r1.append(r7)
            com.google.android.gms.common.server.converter.StringToIntConverter r7 = r9.k
            if (r7 != 0) goto L_0x02ec
            boolean r7 = r9.e
            if (r7 == 0) goto L_0x01f5
            java.lang.String r7 = "["
            r1.append(r7)
            int r7 = r9.d
            r12 = 0
            switch(r7) {
                case 0: goto L_0x01d1;
                case 1: goto L_0x01a6;
                case 2: goto L_0x018b;
                case 3: goto L_0x0170;
                case 4: goto L_0x0155;
                case 5: goto L_0x0120;
                case 6: goto L_0x0105;
                case 7: goto L_0x00e7;
                case 8: goto L_0x00df;
                case 9: goto L_0x00df;
                case 10: goto L_0x00df;
                case 11: goto L_0x0088;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unknown field type out."
            r1.<init>(r2)
            throw r1
        L_0x0088:
            int r7 = defpackage.ivw.a(r2, r8)
            int r8 = r19.dataPosition()
            if (r7 == 0) goto L_0x00bf
            int r11 = r19.readInt()
            android.os.Parcel[] r13 = new android.os.Parcel[r11]
            r14 = 0
        L_0x0099:
            if (r14 < r11) goto L_0x00a1
            int r8 = r8 + r7
            r2.setDataPosition(r8)
            r12 = r13
            goto L_0x00c0
        L_0x00a1:
            int r15 = r19.readInt()
            if (r15 == 0) goto L_0x00b9
            int r6 = r19.dataPosition()
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r5.appendFrom(r2, r6, r15)
            r13[r14] = r5
            int r6 = r6 + r15
            r2.setDataPosition(r6)
            goto L_0x00bc
        L_0x00b9:
            r13[r14] = r12
        L_0x00bc:
            int r14 = r14 + 1
            goto L_0x0099
        L_0x00bf:
        L_0x00c0:
            int r5 = r12.length
            r6 = 0
        L_0x00c2:
            if (r6 < r5) goto L_0x00c6
            goto L_0x01ec
        L_0x00c6:
            if (r6 > 0) goto L_0x00c9
            goto L_0x00cd
        L_0x00c9:
            r1.append(r10)
        L_0x00cd:
            r7 = r12[r6]
            r8 = 0
            r7.setDataPosition(r8)
            java.util.Map r7 = r9.d()
            r8 = r12[r6]
            r0.a((java.lang.StringBuilder) r1, (java.util.Map) r7, (android.os.Parcel) r8)
            int r6 = r6 + 1
            goto L_0x00c2
        L_0x00df:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r1.<init>(r2)
            throw r1
        L_0x00e7:
            java.lang.String[] r5 = defpackage.ivw.A(r2, r8)
            int r6 = r5.length
            r8 = 0
        L_0x00ed:
            if (r8 >= r6) goto L_0x01ec
            if (r8 != 0) goto L_0x00f2
            goto L_0x00f6
        L_0x00f2:
            r1.append(r10)
        L_0x00f6:
            r1.append(r11)
            r7 = r5[r8]
            r1.append(r7)
            r1.append(r11)
            int r8 = r8 + 1
            goto L_0x00ed
        L_0x0105:
            boolean[] r5 = defpackage.ivw.v(r2, r8)
            int r6 = r5.length
            r8 = 0
        L_0x010b:
            if (r8 >= r6) goto L_0x01ec
            if (r8 != 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            r1.append(r10)
        L_0x0114:
            boolean r7 = r5[r8]
            java.lang.String r7 = java.lang.Boolean.toString(r7)
            r1.append(r7)
            int r8 = r8 + 1
            goto L_0x010b
        L_0x0120:
            int r5 = defpackage.ivw.a(r2, r8)
            int r6 = r19.dataPosition()
            if (r5 == 0) goto L_0x014f
            int r7 = r19.readInt()
            java.math.BigDecimal[] r12 = new java.math.BigDecimal[r7]
            r8 = 0
        L_0x0131:
            if (r8 >= r7) goto L_0x014a
            byte[] r9 = r19.createByteArray()
            int r10 = r19.readInt()
            java.math.BigDecimal r11 = new java.math.BigDecimal
            java.math.BigInteger r13 = new java.math.BigInteger
            r13.<init>(r9)
            r11.<init>(r13, r10)
            r12[r8] = r11
            int r8 = r8 + 1
            goto L_0x0131
        L_0x014a:
            int r6 = r6 + r5
            r2.setDataPosition(r6)
            goto L_0x0150
        L_0x014f:
        L_0x0150:
            defpackage.jhx.a((java.lang.StringBuilder) r1, (java.lang.Object[]) r12)
            goto L_0x01ec
        L_0x0155:
            double[] r5 = defpackage.ivw.z(r2, r8)
            int r6 = r5.length
            r8 = 0
        L_0x015b:
            if (r8 >= r6) goto L_0x01ec
            if (r8 != 0) goto L_0x0160
            goto L_0x0164
        L_0x0160:
            r1.append(r10)
        L_0x0164:
            r11 = r5[r8]
            java.lang.String r7 = java.lang.Double.toString(r11)
            r1.append(r7)
            int r8 = r8 + 1
            goto L_0x015b
        L_0x0170:
            float[] r5 = defpackage.ivw.y(r2, r8)
            int r6 = r5.length
            r8 = 0
        L_0x0176:
            if (r8 >= r6) goto L_0x01ec
            if (r8 != 0) goto L_0x017b
            goto L_0x017f
        L_0x017b:
            r1.append(r10)
        L_0x017f:
            r7 = r5[r8]
            java.lang.String r7 = java.lang.Float.toString(r7)
            r1.append(r7)
            int r8 = r8 + 1
            goto L_0x0176
        L_0x018b:
            long[] r5 = defpackage.ivw.x(r2, r8)
            int r6 = r5.length
            r8 = 0
        L_0x0191:
            if (r8 >= r6) goto L_0x01ec
            if (r8 != 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            r1.append(r10)
        L_0x019a:
            r11 = r5[r8]
            java.lang.String r7 = java.lang.Long.toString(r11)
            r1.append(r7)
            int r8 = r8 + 1
            goto L_0x0191
        L_0x01a6:
            int r5 = defpackage.ivw.a(r2, r8)
            int r6 = r19.dataPosition()
            if (r5 == 0) goto L_0x01cc
            int r7 = r19.readInt()
            java.math.BigInteger[] r12 = new java.math.BigInteger[r7]
            r8 = 0
        L_0x01b7:
            if (r8 >= r7) goto L_0x01c7
            java.math.BigInteger r9 = new java.math.BigInteger
            byte[] r10 = r19.createByteArray()
            r9.<init>(r10)
            r12[r8] = r9
            int r8 = r8 + 1
            goto L_0x01b7
        L_0x01c7:
            int r6 = r6 + r5
            r2.setDataPosition(r6)
            goto L_0x01cd
        L_0x01cc:
        L_0x01cd:
            defpackage.jhx.a((java.lang.StringBuilder) r1, (java.lang.Object[]) r12)
            goto L_0x01ec
        L_0x01d1:
            int[] r5 = defpackage.ivw.w(r2, r8)
            int r6 = r5.length
            r8 = 0
        L_0x01d7:
            if (r8 >= r6) goto L_0x01ec
            if (r8 != 0) goto L_0x01dc
            goto L_0x01e0
        L_0x01dc:
            r1.append(r10)
        L_0x01e0:
            r7 = r5[r8]
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r1.append(r7)
            int r8 = r8 + 1
            goto L_0x01d7
        L_0x01ec:
            java.lang.String r5 = "]"
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x01f5:
            int r5 = r9.d
            switch(r5) {
                case 0: goto L_0x02e1;
                case 1: goto L_0x02d6;
                case 2: goto L_0x02cb;
                case 3: goto L_0x02c0;
                case 4: goto L_0x02b5;
                case 5: goto L_0x02aa;
                case 6: goto L_0x029f;
                case 7: goto L_0x028a;
                case 8: goto L_0x0275;
                case 9: goto L_0x0260;
                case 10: goto L_0x0214;
                case 11: goto L_0x0202;
                default: goto L_0x01fa;
            }
        L_0x01fa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unknown field type out"
            r1.<init>(r2)
            throw r1
        L_0x0202:
            android.os.Parcel r5 = defpackage.ivw.D(r2, r8)
            r6 = 0
            r5.setDataPosition(r6)
            java.util.Map r7 = r9.d()
            r0.a((java.lang.StringBuilder) r1, (java.util.Map) r7, (android.os.Parcel) r5)
            r7 = 1
            goto L_0x0035
        L_0x0214:
            r6 = 0
            android.os.Bundle r5 = defpackage.ivw.s(r2, r8)
            java.util.Set r7 = r5.keySet()
            r7.size()
            java.lang.String r8 = "{"
            r1.append(r8)
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x022a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0257
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            if (r8 != 0) goto L_0x023b
            r1.append(r10)
        L_0x023b:
            r1.append(r11)
            r1.append(r9)
            java.lang.String r8 = "\":\""
            r1.append(r8)
            java.lang.String r8 = r5.getString(r9)
            java.lang.String r8 = defpackage.jjx.a(r8)
            r1.append(r8)
            r1.append(r11)
            r8 = 0
            goto L_0x022a
        L_0x0257:
            java.lang.String r5 = "}"
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x0260:
            r6 = 0
            byte[] r5 = defpackage.ivw.t(r2, r8)
            r1.append(r11)
            java.lang.String r5 = defpackage.jhy.c((byte[]) r5)
            r1.append(r5)
            r1.append(r11)
            r7 = 1
            goto L_0x0035
        L_0x0275:
            r6 = 0
            byte[] r5 = defpackage.ivw.t(r2, r8)
            r1.append(r11)
            java.lang.String r5 = defpackage.jhy.b((byte[]) r5)
            r1.append(r5)
            r1.append(r11)
            r7 = 1
            goto L_0x0035
        L_0x028a:
            r6 = 0
            java.lang.String r5 = defpackage.ivw.q(r2, r8)
            r1.append(r11)
            java.lang.String r5 = defpackage.jjx.a(r5)
            r1.append(r5)
            r1.append(r11)
            r7 = 1
            goto L_0x0035
        L_0x029f:
            r6 = 0
            boolean r5 = defpackage.ivw.c(r2, r8)
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x02aa:
            r6 = 0
            java.math.BigDecimal r5 = defpackage.ivw.p(r2, r8)
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x02b5:
            r6 = 0
            double r7 = defpackage.ivw.n(r2, r8)
            r1.append(r7)
            r7 = 1
            goto L_0x0035
        L_0x02c0:
            r6 = 0
            float r5 = defpackage.ivw.l(r2, r8)
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x02cb:
            r6 = 0
            long r7 = defpackage.ivw.i(r2, r8)
            r1.append(r7)
            r7 = 1
            goto L_0x0035
        L_0x02d6:
            r6 = 0
            java.math.BigInteger r5 = defpackage.ivw.k(r2, r8)
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x02e1:
            r6 = 0
            int r5 = defpackage.ivw.g(r2, r8)
            r1.append(r5)
            r7 = 1
            goto L_0x0035
        L_0x02ec:
            r6 = 0
            int r5 = r9.d
            switch(r5) {
                case 0: goto L_0x03c2;
                case 1: goto L_0x03b4;
                case 2: goto L_0x03a2;
                case 3: goto L_0x0390;
                case 4: goto L_0x037e;
                case 5: goto L_0x0370;
                case 6: goto L_0x035e;
                case 7: goto L_0x0350;
                case 8: goto L_0x0342;
                case 9: goto L_0x0342;
                case 10: goto L_0x0313;
                case 11: goto L_0x030b;
                default: goto L_0x02f2;
            }
        L_0x02f2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unknown field out type = "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x030b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Method does not accept concrete type."
            r1.<init>(r2)
            throw r1
        L_0x0313:
            android.os.Bundle r5 = defpackage.ivw.s(r2, r8)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Set r8 = r5.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0324:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0338
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = r5.getString(r10)
            r7.put(r10, r11)
            goto L_0x0324
        L_0x0338:
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r7)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x0342:
            byte[] r5 = defpackage.ivw.t(r2, r8)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x0350:
            java.lang.String r5 = defpackage.ivw.q(r2, r8)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x035e:
            boolean r5 = defpackage.ivw.c(r2, r8)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x0370:
            java.math.BigDecimal r5 = defpackage.ivw.p(r2, r8)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x037e:
            double r7 = defpackage.ivw.n(r2, r8)
            java.lang.Double r5 = java.lang.Double.valueOf(r7)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x0390:
            float r5 = defpackage.ivw.l(r2, r8)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x03a2:
            long r7 = defpackage.ivw.i(r2, r8)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x03b4:
            java.math.BigInteger r5 = defpackage.ivw.k(r2, r8)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x03c2:
            int r5 = defpackage.ivw.g(r2, r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = defpackage.jag.b((com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            a((java.lang.StringBuilder) r1, (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9, (java.lang.Object) r5)
            r7 = 1
            goto L_0x0035
        L_0x03d4:
            r6 = 0
            goto L_0x0035
        L_0x03d7:
            int r3 = r19.dataPosition()
            if (r3 != r4) goto L_0x03e3
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            return
        L_0x03e3:
            ivv r1 = new ivv
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r5 = 37
            r3.<init>(r5)
            java.lang.String r5 = "Overread allowed size end="
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
            goto L_0x03fd
        L_0x03fc:
            throw r1
        L_0x03fd:
            goto L_0x03fc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.a(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    public final SafeParcelable a(Parcelable.Creator creator) {
        Parcel b2 = b();
        b2.setDataPosition(0);
        return (SafeParcelable) creator.createFromParcel(b2);
    }

    public final Map a() {
        FieldMappingDictionary fieldMappingDictionary = this.d;
        if (fieldMappingDictionary != null) {
            return fieldMappingDictionary.a(this.e);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d2) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, d2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, float f2) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, f2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        c(fastJsonResponse$Field);
        ivx.b(this.b, fastJsonResponse$Field.g, i);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, j);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, ((SafeParcelResponse) jag).b(), true);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, str2, true);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        c(fastJsonResponse$Field);
        Parcel parcel = this.b;
        int i = fastJsonResponse$Field.g;
        if (bigDecimal != null) {
            int a2 = ivx.a(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            ivx.b(parcel, a2);
            return;
        }
        ivx.a(parcel, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        c(fastJsonResponse$Field);
        Parcel parcel = this.b;
        int i = fastJsonResponse$Field.g;
        if (bigInteger != null) {
            int a2 = ivx.a(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            ivx.b(parcel, a2);
            return;
        }
        ivx.a(parcel, i, 0);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        c(fastJsonResponse$Field);
        ArrayList arrayList2 = new ArrayList();
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) ((jag) arrayList.get(i))).b());
        }
        Parcel parcel = this.b;
        int a2 = ivx.a(parcel, fastJsonResponse$Field.g);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        c(fastJsonResponse$Field);
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        ivx.a(this.b, fastJsonResponse$Field.g, bundle, true);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, z);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        c(fastJsonResponse$Field);
        ivx.a(this.b, fastJsonResponse$Field.g, bArr, true);
    }
}
