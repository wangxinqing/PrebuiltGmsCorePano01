package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: qwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qwb extends qxx {
    public final Set a;

    public qwb(Bundle bundle) {
        super(bundle);
        this.a = a(bundle.getIntArray("content_uri_flags_array"), bundle.getParcelableArray("content_uri_array"));
    }

    public static Set a(int[] iArr, Parcelable[] parcelableArr) {
        int length;
        if (iArr == null || parcelableArr == null || (length = parcelableArr.length) != iArr.length) {
            throw new IllegalArgumentException("URI or Flag arrays are null or have different sizes.");
        }
        Uri[] uriArr = new Uri[length];
        System.arraycopy(parcelableArr, 0, uriArr, 0, length);
        ob obVar = new ob(length);
        for (int i = 0; i < length; i++) {
            obVar.add(new qvz(uriArr[i], iArr[i]));
        }
        return Collections.unmodifiableSet(obVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qwb) || !super.equals(obj) || !this.a.equals(((qwb) obj).a)) {
            return false;
        }
        return true;
    }

    public qwb(qwa qwa) {
        super((qxw) qwa);
        this.a = Collections.unmodifiableSet(new ob((Collection) qwa.a));
    }

    public final void a(Bundle bundle, int i) {
        super.a(bundle, i);
        int size = this.a.size();
        int[] iArr = new int[size];
        Uri[] uriArr = new Uri[size];
        int i2 = 0;
        for (qvz qvz : this.a) {
            iArr[i2] = qvz.b;
            uriArr[i2] = qvz.a;
            i2++;
        }
        bundle.putIntArray("content_uri_flags_array", iArr);
        bundle.putParcelableArray("content_uri_array", uriArr);
    }
}
