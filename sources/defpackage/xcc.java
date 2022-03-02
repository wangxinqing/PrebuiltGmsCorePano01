package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: xcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xcc {
    private final char a = 2;
    private final String b = Pattern.quote("\u0001");
    private final String c = Pattern.quote(String.valueOf(this.a));
    private final Bundle d;

    static {
        new xcb(Bundle.EMPTY);
        new xca(Bundle.EMPTY);
    }

    public xcc(Bundle bundle) {
        this.d = bundle;
    }

    private static double a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            Log.e("PhoneEmailDecoder", "NumberFormatException", e);
            return 0.0d;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object a(String str, String str2, double d2, double d3, double d4, double d5, double d6, String str3, String str4, String str5, String str6, String str7);

    private static int a(String str, int i, int i2) {
        int indexOf = str.indexOf(1, i);
        if (indexOf >= 0 && indexOf < i2) {
            return indexOf;
        }
        return -1;
    }

    private final void a(ArrayList arrayList, String str, String str2, String str3, double d2, double d3, double d4, double d5, double d6, String str4, String str5, String str6, String str7, String str8) {
        if (!TextUtils.isEmpty(str3)) {
            String string = this.d.getString(str);
            arrayList.add(a(str3, TextUtils.isEmpty(string) ? str2 : string, d2, d3, d4, d5, d6, str4, str5, str6, str7, str8));
            return;
        }
    }

    public final ArrayList a(String str, boolean z) {
        int i;
        int i2;
        String[] strArr;
        int i3;
        int i4;
        xcc xcc = this;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        if (z) {
            String[] split = TextUtils.split(str2, xcc.c);
            int length = split.length;
            int i5 = 0;
            while (i5 < length) {
                String[] split2 = TextUtils.split(split[i5], xcc.b);
                if (split2.length >= 13) {
                    i4 = i5;
                    String[] strArr2 = split2;
                    i3 = length;
                    strArr = split;
                    a(arrayList, split2[0], split2[1], split2[2], a(split2[3]), a(split2[4]), a(split2[5]), a(split2[6]), a(split2[7]), ycm.c(strArr2[8]), ycm.c(strArr2[9]), ycm.c(strArr2[10]), ycm.c(strArr2[11]), ycm.c(strArr2[12]));
                } else {
                    strArr = split;
                    i4 = i5;
                    i3 = length;
                    Log.w("PhoneEmailDecoder", "Invalid string");
                }
                i5 = i4 + 1;
                xcc = this;
                length = i3;
                split = strArr;
            }
        } else {
            int length2 = str.length();
            int i6 = 0;
            while (i6 < length2) {
                int indexOf = str2.indexOf(this.a, i6);
                int length3 = indexOf < 0 ? str.length() : indexOf;
                int a2 = a(str2, i6, length3);
                int i7 = a2 + 1;
                int a3 = a(str2, i7, length3);
                if (a2 < 0) {
                    i = length2;
                    i2 = length3;
                } else if (a3 >= 0) {
                    i2 = length3;
                    i = length2;
                    a(arrayList, str2.substring(i6, a2), str2.substring(i7, a3), str2.substring(a3 + 1, length3), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null);
                } else {
                    i = length2;
                    i2 = length3;
                }
                i6 = i2 + 1;
                str2 = str;
                length2 = i;
            }
        }
        return arrayList;
    }
}
