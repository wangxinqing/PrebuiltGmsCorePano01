package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MetadataBundle extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lbp();
    private static final ith b = new ith("MetadataBundle", "");
    public final Bundle a;

    public MetadataBundle(Bundle bundle) {
        int i;
        iva.a((Object) bundle);
        this.a = bundle;
        bundle.setClassLoader(getClass().getClassLoader());
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (lbm.a(str) == null) {
                arrayList.add(str);
                b.b("Ignored unknown metadata field in bundle: %s", str);
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            this.a.remove((String) arrayList.get(i));
        }
    }

    public static MetadataBundle a() {
        return new MetadataBundle(new Bundle());
    }

    public final MetadataBundle b() {
        return new MetadataBundle(new Bundle(this.a));
    }

    public final Set c() {
        HashSet hashSet = new HashSet();
        for (String a2 : this.a.keySet()) {
            hashSet.add(lbm.a(a2));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            MetadataBundle metadataBundle = (MetadataBundle) obj;
            Set<String> keySet = this.a.keySet();
            if (keySet.equals(metadataBundle.a.keySet())) {
                for (String str : keySet) {
                    if (!ius.a(this.a.get(str), metadataBundle.a.get(str))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (String str : this.a.keySet()) {
            i = (i * 31) + this.a.get(str).hashCode();
        }
        return i;
    }

    public static MetadataBundle a(kyq kyq, Object obj) {
        MetadataBundle a2 = a();
        a2.b(kyq, obj);
        return a2;
    }

    public final Object b(kyq kyq) {
        Object a2 = a(kyq);
        this.a.remove(((kyl) kyq).a);
        return a2;
    }

    public final boolean c(kyq kyq) {
        return this.a.containsKey(kyq.a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }

    public final Object a(kyq kyq) {
        return kyq.a(this.a);
    }

    public final void b(kyq kyq, Object obj) {
        if (lbm.a(kyq.a()) == null) {
            String valueOf = String.valueOf(kyq.a());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unregistered field: ") : "Unregistered field: ".concat(valueOf));
        } else {
            kyq.a(obj, this.a);
        }
    }

    public final void a(Context context) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) a(lce.A);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.a(context.getCacheDir());
        }
    }
}
