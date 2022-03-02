package defpackage;

import android.text.TextUtils;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* renamed from: dud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dud {
    private static double a(Feature feature) {
        String a = feature.a("factor");
        if (a != null) {
            return Double.parseDouble(a);
        }
        return 1.0d;
    }

    public static double b(RegisterSectionInfo registerSectionInfo) {
        Feature a = registerSectionInfo.a(2);
        if (a != null) {
            return a(a);
        }
        return 1.0d;
    }

    public static double c(RegisterSectionInfo registerSectionInfo) {
        Feature a = registerSectionInfo.a(3);
        if (a != null) {
            return a(a);
        }
        return 1.0d;
    }

    public static Feature a() {
        return new Feature(1);
    }

    public static Feature b() {
        return new Feature(4);
    }

    public static Feature c() {
        return new Feature(5);
    }

    public static Feature a(String... strArr) {
        Feature feature = new Feature(6);
        feature.a("annotators", TextUtils.join(",", (Object[]) iva.a((Object) strArr)));
        return feature;
    }

    public static boolean a(RegisterSectionInfo registerSectionInfo) {
        return registerSectionInfo.a(4) != null;
    }
}
