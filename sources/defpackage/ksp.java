package defpackage;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Arrays;
import java.util.List;

/* renamed from: ksp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksp {
    public final DriveId a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final MetadataBundle f;
    public final List g;
    public final List h;
    public final int i;
    public final String j;

    public ksp(DriveId driveId, String str, String str2, String str3, String str4, MetadataBundle metadataBundle, List list, List list2, int i2, String str5) {
        iva.a((Object) driveId);
        this.a = driveId;
        this.b = str;
        iva.a((Object) str2);
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = metadataBundle;
        iva.a((Object) list);
        this.g = list;
        iva.a((Object) list2);
        this.h = list2;
        this.i = i2;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(ksp.class)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ksp ksp = (ksp) obj;
        return ius.a(ksp.b, this.b) && ius.a(ksp.c, this.c) && ius.a(ksp.d, this.d) && ius.a(ksp.f, this.f) && ius.a(ksp.e, this.e) && ius.a(ksp.h, this.h) && ius.a(ksp.g, this.g) && ius.a(ksp.j, this.j) && ius.a(Integer.valueOf(ksp.i), Integer.valueOf(this.i)) && ius.a(ksp.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.h, this.g, this.j, Integer.valueOf(this.i), this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String valueOf2 = String.valueOf(this.f);
        String join = TextUtils.join(",", this.g);
        String join2 = TextUtils.join(",", this.h);
        int i2 = this.i;
        String str5 = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = str2.length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(valueOf2).length();
        int length7 = String.valueOf(join).length();
        StringBuilder sb = new StringBuilder(length + 241 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(join2).length() + String.valueOf(str5).length());
        sb.append("CompletionEventInfo{mDriveId=");
        sb.append(valueOf);
        sb.append(", mRequestedAccountName='");
        sb.append(str);
        sb.append("', mResolvedAccountName='");
        sb.append(str2);
        sb.append("', mBaseContentHash='");
        sb.append(str3);
        sb.append("', mModifiedContentHash='");
        sb.append(str4);
        sb.append("', mModifiedMetadataBundle=");
        sb.append(valueOf2);
        sb.append(", mTrackingTags=[");
        sb.append(join);
        sb.append("], mActionTypes=[");
        sb.append(join2);
        sb.append("], mStatus=");
        sb.append(i2);
        sb.append(", mOverrideServicePackageName='");
        sb.append(str5);
        sb.append("'}");
        return sb.toString();
    }
}
