package defpackage;

import android.content.pm.ApplicationInfo;
import java.util.Comparator;

/* renamed from: jci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jci implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        ApplicationInfo applicationInfo2 = (ApplicationInfo) obj2;
        int i2 = -2;
        if (applicationInfo.metaData != null) {
            i = applicationInfo.metaData.getInt("com.google.android.gms.version", -1);
        } else {
            i = -2;
        }
        if (applicationInfo2.metaData != null) {
            i2 = applicationInfo2.metaData.getInt("com.google.android.gms.version", -1);
        }
        return i - i2;
    }
}
