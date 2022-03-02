package defpackage;

import com.google.compression.brotli.dec.Dictionary;

/* renamed from: aosy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosy {
    static final boolean a;

    static {
        boolean z;
        try {
            Class.forName(String.valueOf(Dictionary.class.getPackage().getName()).concat(".DictionaryData"));
            z = true;
        } catch (Throwable th) {
            z = false;
        }
        a = z;
    }
}
