package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bahw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bahw {
    private static final Logger a = Logger.getLogger(bahw.class.getName());

    private bahw() {
    }

    private static Object a(aqka aqka) {
        String str;
        String str2;
        double d;
        amrl.b(aqka.a(), (Object) "unexpected end of JSON");
        int f = aqka.f() - 1;
        boolean z = true;
        if (f != 0) {
            char c = '\"';
            if (f == 2) {
                int i = aqka.c;
                if (i == 0) {
                    i = aqka.b();
                }
                if (i == 1) {
                    aqka.a(3);
                    aqka.c = 0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (aqka.a()) {
                        int i2 = aqka.c;
                        if (i2 == 0) {
                            i2 = aqka.b();
                        }
                        if (i2 == 14) {
                            str = aqka.c();
                        } else if (i2 == 12) {
                            str = aqka.a('\'');
                        } else if (i2 == 13) {
                            str = aqka.a('\"');
                        } else {
                            throw new IllegalStateException("Expected a name but was " + aqkb.a(aqka.f()) + aqka.d());
                        }
                        aqka.c = 0;
                        aqka.h[aqka.g - 1] = str;
                        linkedHashMap.put(str, a(aqka));
                    }
                    boolean z2 = aqka.f() == 4;
                    String valueOf = String.valueOf(aqka.e());
                    amrl.b(z2, (Object) valueOf.length() == 0 ? new String("Bad token: ") : "Bad token: ".concat(valueOf));
                    int i3 = aqka.c;
                    if (i3 == 0) {
                        i3 = aqka.b();
                    }
                    if (i3 == 2) {
                        int i4 = aqka.g - 1;
                        aqka.g = i4;
                        aqka.h[i4] = null;
                        int[] iArr = aqka.i;
                        int i5 = i4 - 1;
                        iArr[i5] = iArr[i5] + 1;
                        aqka.c = 0;
                        return Collections.unmodifiableMap(linkedHashMap);
                    }
                    throw new IllegalStateException("Expected END_OBJECT but was " + aqkb.a(aqka.f()) + aqka.d());
                }
                throw new IllegalStateException("Expected BEGIN_OBJECT but was " + aqkb.a(aqka.f()) + aqka.d());
            } else if (f == 5) {
                int i6 = aqka.c;
                if (i6 == 0) {
                    i6 = aqka.b();
                }
                if (i6 == 10) {
                    str2 = aqka.c();
                } else if (i6 == 8) {
                    str2 = aqka.a('\'');
                } else if (i6 == 9) {
                    str2 = aqka.a('\"');
                } else if (i6 == 11) {
                    str2 = aqka.f;
                    aqka.f = null;
                } else if (i6 == 15) {
                    str2 = Long.toString(aqka.d);
                } else if (i6 == 16) {
                    str2 = new String(aqka.a, aqka.b, aqka.e);
                    aqka.b += aqka.e;
                } else {
                    throw new IllegalStateException("Expected a string but was " + aqkb.a(aqka.f()) + aqka.d());
                }
                aqka.c = 0;
                int[] iArr2 = aqka.i;
                int i7 = aqka.g - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return str2;
            } else if (f == 6) {
                int i8 = aqka.c;
                if (i8 == 0) {
                    i8 = aqka.b();
                }
                if (i8 == 15) {
                    aqka.c = 0;
                    int[] iArr3 = aqka.i;
                    int i9 = aqka.g - 1;
                    iArr3[i9] = iArr3[i9] + 1;
                    d = (double) aqka.d;
                } else {
                    if (i8 == 16) {
                        aqka.f = new String(aqka.a, aqka.b, aqka.e);
                        aqka.b += aqka.e;
                    } else if (i8 == 8 || i8 == 9) {
                        if (i8 == 8) {
                            c = '\'';
                        }
                        aqka.f = aqka.a(c);
                    } else if (i8 == 10) {
                        aqka.f = aqka.c();
                    } else if (i8 != 11) {
                        throw new IllegalStateException("Expected a double but was " + aqkb.a(aqka.f()) + aqka.d());
                    }
                    aqka.c = 11;
                    d = Double.parseDouble(aqka.f);
                    if (Double.isNaN(d) || Double.isInfinite(d)) {
                        throw new aqkc("JSON forbids NaN and infinities: " + d + aqka.d());
                    }
                    aqka.f = null;
                    aqka.c = 0;
                    int[] iArr4 = aqka.i;
                    int i10 = aqka.g - 1;
                    iArr4[i10] = iArr4[i10] + 1;
                }
                return Double.valueOf(d);
            } else if (f == 7) {
                int i11 = aqka.c;
                if (i11 == 0) {
                    i11 = aqka.b();
                }
                if (i11 == 5) {
                    aqka.c = 0;
                    int[] iArr5 = aqka.i;
                    int i12 = aqka.g - 1;
                    iArr5[i12] = iArr5[i12] + 1;
                } else if (i11 == 6) {
                    aqka.c = 0;
                    int[] iArr6 = aqka.i;
                    int i13 = aqka.g - 1;
                    iArr6[i13] = iArr6[i13] + 1;
                    z = false;
                } else {
                    throw new IllegalStateException("Expected a boolean but was " + aqkb.a(aqka.f()) + aqka.d());
                }
                return Boolean.valueOf(z);
            } else if (f != 8) {
                String valueOf2 = String.valueOf(aqka.e());
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Bad token: ") : "Bad token: ".concat(valueOf2));
            } else {
                int i14 = aqka.c;
                if (i14 == 0) {
                    i14 = aqka.b();
                }
                if (i14 == 7) {
                    aqka.c = 0;
                    int[] iArr7 = aqka.i;
                    int i15 = aqka.g - 1;
                    iArr7[i15] = iArr7[i15] + 1;
                    return null;
                }
                throw new IllegalStateException("Expected null but was " + aqkb.a(aqka.f()) + aqka.d());
            }
        } else {
            int i16 = aqka.c;
            if (i16 == 0) {
                i16 = aqka.b();
            }
            if (i16 == 3) {
                aqka.a(1);
                aqka.i[aqka.g - 1] = 0;
                aqka.c = 0;
                ArrayList arrayList = new ArrayList();
                while (aqka.a()) {
                    arrayList.add(a(aqka));
                }
                boolean z3 = aqka.f() == 2;
                String valueOf3 = String.valueOf(aqka.e());
                amrl.b(z3, (Object) valueOf3.length() == 0 ? new String("Bad token: ") : "Bad token: ".concat(valueOf3));
                int i17 = aqka.c;
                if (i17 == 0) {
                    i17 = aqka.b();
                }
                if (i17 == 4) {
                    int i18 = aqka.g - 1;
                    aqka.g = i18;
                    int[] iArr8 = aqka.i;
                    int i19 = i18 - 1;
                    iArr8[i19] = iArr8[i19] + 1;
                    aqka.c = 0;
                    return Collections.unmodifiableList(arrayList);
                }
                throw new IllegalStateException("Expected END_ARRAY but was " + aqkb.a(aqka.f()) + aqka.d());
            }
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + aqkb.a(aqka.f()) + aqka.d());
        }
    }

    public static Object a(String str) {
        String str2;
        String str3;
        String str4;
        aqka aqka = new aqka(new StringReader(str));
        try {
            return a(aqka);
        } finally {
            try {
                aqka.close();
            } catch (IOException e) {
                str2 = "io.grpc.internal.JsonParser";
                str3 = "parse";
                str4 = "Failed to close";
                a.logp(Level.WARNING, str2, str3, str4, e);
            }
        }
    }
}
