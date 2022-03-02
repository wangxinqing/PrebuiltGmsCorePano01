package defpackage;

import android.content.Context;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: cvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvo implements Comparable {
    public GoogleSettingsItem a;
    public cvp b;

    public cvo(GoogleSettingsItem googleSettingsItem) {
        this.a = googleSettingsItem;
    }

    public final boolean a(Context context) {
        GoogleSettingsItem googleSettingsItem = this.a;
        if (googleSettingsItem == null) {
            return this.b.a(context);
        }
        return context.getPackageManager().resolveActivity(googleSettingsItem.b, 65536) != null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        String str;
        String str2;
        int i2;
        cvo cvo = (cvo) obj;
        if (this == cvo) {
            return 0;
        }
        GoogleSettingsItem googleSettingsItem = this.a;
        int i3 = Integer.MAX_VALUE;
        if (googleSettingsItem == null || (i = googleSettingsItem.e) == -1) {
            i = Integer.MAX_VALUE;
        }
        GoogleSettingsItem googleSettingsItem2 = cvo.a;
        if (!(googleSettingsItem2 == null || (i2 = googleSettingsItem2.e) == -1)) {
            i3 = i2;
        }
        int compare = Integer.compare(i, i3);
        if (compare != 0) {
            return compare;
        }
        GoogleSettingsItem googleSettingsItem3 = this.a;
        if (googleSettingsItem3 == null) {
            str = this.b.a;
        } else {
            str = googleSettingsItem3.d;
        }
        GoogleSettingsItem googleSettingsItem4 = cvo.a;
        if (googleSettingsItem4 == null) {
            str2 = cvo.b.a;
        } else {
            str2 = googleSettingsItem4.d;
        }
        if (str != null && str2 != null) {
            return str.toString().compareToIgnoreCase(str2.toString());
        }
        if (str != str2) {
            return str != null ? 1 : -1;
        }
        return 0;
    }

    public cvo(cvp cvp) {
        this.b = cvp;
    }
}
