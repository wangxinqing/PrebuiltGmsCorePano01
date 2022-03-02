package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iai {
    private static int a;
    private static List b;
    private static final Object c = new Object();

    private static void a(List list, String str) {
        if (Uri.parse(str).getPath().contains("/")) {
            list.add(str);
        }
    }

    public static final boolean a(String str) {
        List list;
        ArrayList arrayList;
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.toString()) || TextUtils.isEmpty(parse.getHost())) {
            return false;
        }
        String str2 = (String) iks.u.c();
        if (a == str2.hashCode()) {
            list = b;
        } else {
            synchronized (c) {
                a = str2.hashCode();
                arrayList = new ArrayList(r4 + r4);
                for (String str3 : str2.split(",")) {
                    if (!str3.contains("://")) {
                        String valueOf = String.valueOf(str3);
                        a(arrayList, valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf));
                        String valueOf2 = String.valueOf(str3);
                        a(arrayList, valueOf2.length() == 0 ? new String("http://") : "http://".concat(valueOf2));
                    } else {
                        a(arrayList, str3);
                    }
                }
                b = arrayList;
            }
            list = arrayList;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (str.startsWith((String) list.get(i))) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
