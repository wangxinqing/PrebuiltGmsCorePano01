package com.google.android.gms.common.people.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Audience extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iwx();
    public final int a;
    public final List b;
    public final int c;
    @Deprecated
    public final boolean d;
    public final boolean e;

    public Audience(int i, List list, int i2, boolean z, boolean z2) {
        List list2;
        if (i == 1 && list == null) {
            list = Collections.emptyList();
        }
        this.a = i;
        if (i2 == 1) {
            list2 = a(list);
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.b = list2;
        this.c = i2;
        if (i == 1) {
            this.d = z;
            this.e = !z;
            return;
        }
        this.e = z2;
        this.d = !z2;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudienceMember audienceMember = (AudienceMember) it.next();
            if (audienceMember.b != 1 || audienceMember.c != 1) {
                arrayList.add(audienceMember);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Audience) {
            Audience audience = (Audience) obj;
            if (this.a == audience.a && ius.a(this.b, audience.b) && this.c == audience.c && this.e == audience.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.b, false);
        ivx.b(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d);
        ivx.a(parcel, 4, this.e);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public Audience(List list, int i, boolean z) {
        this.a = 2;
        this.b = i == 1 ? a(list) : list;
        this.c = i;
        this.e = z;
        this.d = !z;
    }
}
