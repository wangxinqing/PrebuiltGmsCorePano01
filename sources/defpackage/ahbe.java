package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbe {
    public static final ahbe a = new ahbe((List) null);
    public final List b;

    static {
        new ahbc((String) null, (List) null);
    }

    public ahbe(List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static ahbc a(Uri uri, String str) {
        ahba a2 = a(uri).a("transform");
        if (a2 == null) {
            return null;
        }
        List list = a2.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ahbc ahbc = (ahbc) list.get(i);
            i++;
            if (ahbc.a.equals(str)) {
                return ahbc;
            }
        }
        return null;
    }

    public static final String b(String str) {
        try {
            return URLEncoder.encode(str, ahbs.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException();
        }
    }

    private static final String c(String str) {
        try {
            return URLDecoder.decode(str, ahbs.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException();
        }
    }

    public final String toString() {
        return TextUtils.join("&", this.b);
    }

    public static ahbe a(Uri uri) {
        String str;
        String[] strArr;
        int i;
        String[] strArr2;
        ArrayList arrayList;
        boolean z;
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment)) {
            return a;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] split = encodedFragment.split("&");
        int length = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            String str2 = "=";
            String[] split2 = split[i3].split(str2, 2);
            ArrayList arrayList3 = new ArrayList();
            String str3 = split2[i2];
            boolean isEmpty = TextUtils.isEmpty(str3);
            Object[] objArr = new Object[1];
            objArr[i2] = encodedFragment;
            ahbx.a(!isEmpty, "malformed key: %s", objArr);
            boolean z2 = split2.length == 2 && !TextUtils.isEmpty(split2[1]);
            Object[] objArr2 = new Object[1];
            objArr2[i2] = encodedFragment;
            ahbx.a(z2, "missing param value: %s", objArr2);
            String[] split3 = split2[1].split("\\+");
            int i4 = 0;
            while (i4 < split3.length) {
                String str4 = split3[i4];
                if (!str4.isEmpty()) {
                    int indexOf = str4.indexOf("(");
                    if (indexOf != -1) {
                        String substring = str4.substring(indexOf);
                        strArr2 = split;
                        ahbx.a(substring.charAt(i2) == '(' && substring.charAt(substring.length() + -1) == ')', "malformed fragment subparams: %s", encodedFragment);
                        String substring2 = substring.substring(1, substring.length() - 1);
                        ArrayList arrayList4 = new ArrayList();
                        String[] split4 = substring2.split(",");
                        int i5 = 0;
                        while (i5 < split4.length) {
                            int i6 = length;
                            String[] split5 = split4[i5].split(str2, 2);
                            String str5 = split5[0];
                            String[] strArr3 = split3;
                            String str6 = str2;
                            ahbx.a(!TextUtils.isEmpty(str5), "missing fragment subparam key: %s", substring2);
                            if (split5.length != 2 || TextUtils.isEmpty(split5[1])) {
                                arrayList4.add(new ahbd(c(str5), (String) null));
                            } else {
                                arrayList4.add(new ahbd(c(str5), c(split5[1])));
                            }
                            i5++;
                            length = i6;
                            split3 = strArr3;
                            str2 = str6;
                        }
                        i = length;
                        strArr = split3;
                        str = str2;
                        str4 = str4.substring(0, indexOf);
                        arrayList = arrayList4;
                        i2 = 0;
                    } else {
                        strArr2 = split;
                        i = length;
                        strArr = split3;
                        str = str2;
                        if (str4.indexOf(")") == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i2 = 0;
                        ahbx.a(z, "malformed fragment subparams: %s", encodedFragment);
                        arrayList = null;
                    }
                    arrayList3.add(new ahbb(c(str4), arrayList));
                } else {
                    strArr2 = split;
                    i = length;
                    strArr = split3;
                    str = str2;
                }
                i4++;
                split = strArr2;
                length = i;
                split3 = strArr;
                str2 = str;
            }
            arrayList2.add(new ahaz(c(str3), arrayList3));
            i3++;
            split = split;
            length = length;
        }
        return new ahay(arrayList2).a();
    }

    public final ahba a(String str) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ahba ahba = (ahba) list.get(i);
            i++;
            if (ahba.a.equals(str)) {
                return ahba;
            }
        }
        return null;
    }
}
