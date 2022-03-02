package defpackage;

import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* renamed from: apl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apl {
    public static SliceItem a(Slice slice, String str, String str2) {
        if (slice != null) {
            return a(a(slice), (apk) new aph(str, str2));
        }
        return null;
    }

    public static SliceItem b(Slice slice, String str, String str2) {
        return a(slice, str, new String[]{str2}, new String[]{null});
    }

    static boolean c(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.c);
    }

    public static SliceItem a(Slice slice, String str, String str2, String[] strArr) {
        SliceItem[] sliceItemArr = slice.d;
        for (SliceItem sliceItem : sliceItemArr) {
            if (b(sliceItem, str) && c(sliceItem, str2) && b(sliceItem, strArr) && !a(sliceItem, (String[]) null)) {
                return sliceItem;
            }
        }
        return null;
    }

    public static SliceItem b(SliceItem sliceItem, String str, String str2) {
        return b(sliceItem, str, new String[]{str2}, new String[]{null});
    }

    public static SliceItem a(Slice slice, String str, String[] strArr, String[] strArr2) {
        if (slice != null) {
            return a(a(slice), (apk) new apg(str, strArr, strArr2));
        }
        return null;
    }

    public static SliceItem b(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        if (sliceItem != null) {
            return a(a(sliceItem), (apk) new apj(str, strArr, strArr2));
        }
        return null;
    }

    public static SliceItem a(SliceItem sliceItem, String str) {
        return b(sliceItem, str, (String[]) null, (String[]) null);
    }

    static boolean b(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.b);
    }

    public static SliceItem a(SliceItem sliceItem, String str, String str2) {
        if (sliceItem != null) {
            return a(a(sliceItem), (apk) new api(str, str2));
        }
        return null;
    }

    public static boolean b(SliceItem sliceItem, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && !sliceItem.a(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static SliceItem a(Deque deque, apk apk) {
        while (!deque.isEmpty()) {
            SliceItem sliceItem = (SliceItem) deque.poll();
            if (apk.a(sliceItem)) {
                return sliceItem;
            }
            if ("slice".equals(sliceItem.b) || "action".equals(sliceItem.b)) {
                Collections.addAll(deque, sliceItem.f().d);
            }
        }
        return null;
    }

    public static Deque a(Slice slice) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Collections.addAll(arrayDeque, slice.d);
        return arrayDeque;
    }

    private static Deque a(SliceItem sliceItem) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(sliceItem);
        return arrayDeque;
    }

    public static List a(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        a(a(sliceItem), (apk) new apf(str, strArr, strArr2), (List) arrayList);
        return arrayList;
    }

    public static void a(Deque deque, apk apk, List list) {
        while (!deque.isEmpty()) {
            SliceItem sliceItem = (SliceItem) deque.poll();
            if (apk.a(sliceItem)) {
                list.add(sliceItem);
            }
            if ("slice".equals(sliceItem.b) || "action".equals(sliceItem.b)) {
                Collections.addAll(deque, sliceItem.f().d);
            }
        }
    }

    public static boolean a(SliceItem sliceItem, String... strArr) {
        if (strArr != null) {
            for (String a : strArr) {
                if (sliceItem.a(a)) {
                    return true;
                }
            }
        }
        return false;
    }
}
