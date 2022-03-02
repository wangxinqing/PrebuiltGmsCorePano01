package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: ozh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozh implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        otg otg = ((ota) entry.getValue()).c;
        if (otg == null) {
            otg = otg.h;
        }
        int a = otf.a(otg.c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        otg otg2 = ((ota) entry2.getValue()).c;
        if (otg2 == null) {
            otg2 = otg.h;
        }
        int a2 = otf.a(otg2.c);
        if (a2 != 0) {
            i = a2;
        }
        int i3 = i2 - (i - 1);
        if (i3 != 0) {
            return i3;
        }
        osz osz = ((ota) entry.getValue()).b;
        if (osz == null) {
            osz = osz.s;
        }
        String str = osz.e;
        osz osz2 = ((ota) entry2.getValue()).b;
        if (osz2 == null) {
            osz2 = osz.s;
        }
        int compareTo = str.compareTo(osz2.e);
        if (compareTo != 0) {
            return compareTo;
        }
        osz osz3 = ((ota) entry.getValue()).b;
        if (osz3 == null) {
            osz3 = osz.s;
        }
        String str2 = osz3.c;
        osz osz4 = ((ota) entry2.getValue()).b;
        if (osz4 == null) {
            osz4 = osz.s;
        }
        int compareTo2 = str2.compareTo(osz4.c);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        osz osz5 = ((ota) entry.getValue()).b;
        if (osz5 == null) {
            osz5 = osz.s;
        }
        Long valueOf = Long.valueOf(osz5.n);
        osz osz6 = ((ota) entry2.getValue()).b;
        if (osz6 == null) {
            osz6 = osz.s;
        }
        return valueOf.compareTo(Long.valueOf(osz6.n));
    }
}
