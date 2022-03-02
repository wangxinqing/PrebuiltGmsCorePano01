package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.identity.models.ImageReference;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ImageReferenceImpl extends AbstractSafeParcelable implements ImageReference {
    public static final Parcelable.Creator CREATOR = new wyl();
    final Set a;
    int b;
    public String c;
    byte[] d;

    public ImageReferenceImpl() {
        this.a = new HashSet();
    }

    public final void a(int i) {
        this.a.add(2);
        this.b = i;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c != null;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.d != null;
    }

    public final byte[] f() {
        return this.d;
    }

    public ImageReferenceImpl(Set set, int i, String str, byte[] bArr) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = bArr;
    }

    public final boolean a() {
        return this.a.contains(2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        ivx.b(parcel, a2);
    }

    public ImageReferenceImpl(wzi wzi) {
        this();
        this.a.remove(2);
        if (wzi.a()) {
            a(wzi.b());
        }
        this.c = null;
        if (wzi.c()) {
            this.c = wzi.d();
        }
        this.d = null;
        if (wzi.e()) {
            this.d = wzi.f();
        }
    }
}
