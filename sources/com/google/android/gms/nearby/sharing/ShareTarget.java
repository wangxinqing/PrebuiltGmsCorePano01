package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShareTarget extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new vsg();
    public final long a;
    public final String b;
    public final Uri c;
    public final int d;
    public final Bundle e;
    public final List f;
    public final List g;
    public final List h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final String l;
    public final PendingIntent m;
    public final boolean n;

    public ShareTarget(long j2, String str, Uri uri, int i2, Bundle bundle, List list, List list2, List list3, boolean z, String str2, boolean z2, String str3, PendingIntent pendingIntent, boolean z3) {
        this.a = j2;
        this.b = str;
        this.c = uri;
        this.d = i2;
        this.e = bundle;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = z;
        this.j = str2;
        this.k = z2;
        this.l = str3;
        this.m = pendingIntent;
        this.n = z3;
    }

    /* renamed from: a */
    public final ShareTarget clone() {
        try {
            return (ShareTarget) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.g);
        arrayList.addAll(this.f);
        arrayList.addAll(this.h);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ShareTarget) {
            ShareTarget shareTarget = (ShareTarget) obj;
            if (!ius.a(Long.valueOf(this.a), Long.valueOf(shareTarget.a)) || !ius.a(this.b, shareTarget.b) || !ius.a(this.c, shareTarget.c) || !ius.a(Integer.valueOf(this.d), Integer.valueOf(shareTarget.d)) || !ius.a(Boolean.valueOf(this.i), Boolean.valueOf(shareTarget.i)) || !ius.a(this.j, shareTarget.j) || !ius.a(Boolean.valueOf(this.k), Boolean.valueOf(shareTarget.k)) || !ius.a(this.l, shareTarget.l) || !ius.a(Boolean.valueOf(this.n), Boolean.valueOf(shareTarget.n))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.i), this.j, Boolean.valueOf(this.k), this.l, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return String.format(Locale.US, "ShareTarget<id: %d, deviceName: %s, fullName: %s, imageUri: %s, fileAttachmentSize: %d, textAttachmentSize: %d, wifiCredentialsAttachmentSize %d, isKnown: %s, isIncoming: %s, groupName: %s, action: %s, isExternal: %s>", new Object[]{Long.valueOf(this.a), this.b, this.j, this.c, Integer.valueOf(this.g.size()), Integer.valueOf(this.f.size()), Integer.valueOf(this.h.size()), Boolean.valueOf(this.k), Boolean.valueOf(this.i), this.l, this.m, Boolean.valueOf(this.n)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.c(parcel, 6, this.f, false);
        ivx.c(parcel, 7, this.g, false);
        ivx.c(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j, false);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l, false);
        ivx.a(parcel, 13, this.m, i2, false);
        ivx.a(parcel, 14, this.n);
        ivx.b(parcel, a2);
    }

    public final void a(FileAttachment fileAttachment) {
        this.g.add(fileAttachment);
    }

    public final void a(TextAttachment textAttachment) {
        this.f.add(textAttachment);
    }

    public final void a(WifiCredentialsAttachment wifiCredentialsAttachment) {
        this.h.add(wifiCredentialsAttachment);
    }
}
