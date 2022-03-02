package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ist();
    public final int a;
    public final int b;
    public int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public Feature[] i;
    public Feature[] j;
    public boolean k;
    public int l;

    public GetServiceRequest(int i2) {
        this.a = 4;
        this.c = hxk.c;
        this.b = i2;
        this.k = true;
    }

    private static final Account a(IBinder iBinder) {
        itm itm;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof itm) {
            itm = (itm) queryLocalInterface;
        } else {
            itm = new itk(iBinder);
        }
        return irh.a(itm);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        ist.a(this, parcel, i2);
    }

    public GetServiceRequest(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i2 >= 2) {
            this.e = iBinder;
            this.h = account;
        } else {
            this.h = a(iBinder);
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = featureArr;
        this.j = featureArr2;
        this.k = z;
        this.l = i5;
    }

    public final Account a() {
        return a(this.e);
    }

    public final void a(Collection collection) {
        this.f = (Scope[]) collection.toArray(new Scope[collection.size()]);
    }
}
